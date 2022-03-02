package defpackage;

import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.leveldb.WriteBatch;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: akkm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akkm {
    private static final byte[] b = new byte[0];
    private LevelDb a;
    private final oi c;
    private final ou d;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h = 0;
    private int i = 0;
    private int j = 0;
    private int k = 0;
    private int l = 0;
    private final int m;
    private final File n;
    private final akko o;
    private final AtomicLong p;
    private int q;
    private final akof r;

    public akkm(int i2, int i3, File file, akko akko, akof akof) {
        this.m = i2;
        this.n = file;
        this.o = akko;
        this.c = new oi(i3);
        this.d = new ou();
        this.p = new AtomicLong(System.currentTimeMillis());
        this.r = akof;
    }

    private final long a(boolean z) {
        long andIncrement = this.p.getAndIncrement();
        return z ? andIncrement + TimeUnit.DAYS.toMillis(15) : andIncrement;
    }

    private final int e() {
        FileOutputStream fileOutputStream;
        DataOutputStream dataOutputStream;
        this.n.mkdirs();
        try {
            int i2 = this.m;
            fileOutputStream = new FileOutputStream(new File(this.n, "version"));
            dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeInt(i2);
            a((Closeable) fileOutputStream);
            a((Closeable) dataOutputStream);
        } catch (IOException e2) {
            this.r.b("Failed to write version to disk");
        } catch (Throwable th) {
            a((Closeable) fileOutputStream);
            a((Closeable) dataOutputStream);
            throw th;
        }
        LevelDb.Options options = new LevelDb.Options();
        options.mCreateIfMissing = true;
        options.mDeleteIfCorrupted = true;
        options.mUseSnappy = false;
        try {
            this.a = LevelDb.open(this.n, options);
            int d2 = d();
            this.q = d2;
            return d2;
        } catch (LevelDbException e3) {
            this.a = null;
            this.r.a("Failed to initiate LevelDb", e3);
            return -1;
        }
    }

    private final boolean f() {
        return this.a != null;
    }

    public final void b() {
        if (!f()) {
            this.r.b("Storage not started, ignoring stop");
            return;
        }
        this.c.a();
        this.a.close();
        this.a = null;
    }

    public final void c() {
        File[] listFiles;
        this.q = 0;
        this.c.a();
        boolean f2 = f();
        if (f2) {
            this.a.close();
            this.a = null;
        }
        try {
            LevelDb.destroy(this.n);
            if (this.n.exists() && (listFiles = this.n.listFiles()) != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
            if (f2) {
                e();
            }
        } catch (LevelDbException e2) {
            this.r.a("Failed to clear leveldb", e2);
        }
    }

    public final int d() {
        LevelDb.Iterator it = this.a.iterator();
        it.seekToFirst();
        int i2 = 0;
        while (it.isValid()) {
            i2++;
            it.next();
        }
        it.close();
        this.q = i2;
        return i2;
    }

    private static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
        }
    }

    public final void b(Set set) {
        this.e += set.size();
        for (Object next : set) {
            if (this.c.b(next) != null) {
                this.f++;
            }
            this.d.remove(next);
        }
        if (f()) {
            a((Iterable) set);
        } else {
            this.r.b("delete() called when leveldb is not active. Operating in memory only mode");
        }
        this.q -= set.size();
    }

    private final void a(Iterable iterable) {
        WriteBatch create = WriteBatch.create();
        try {
            for (Object next : iterable) {
                byte[] bArr = new byte[this.o.a(next)];
                this.o.a(next, aubk.a(bArr));
                create.delete(bArr);
            }
            this.a.write(create);
        } catch (IOException e2) {
            this.r.a("Failed to persist delete to leveldb", e2);
        } catch (Throwable th) {
            create.close();
            throw th;
        }
        create.close();
    }

    public final int a() {
        FileInputStream fileInputStream;
        DataInputStream dataInputStream;
        if (f()) {
            this.r.b("Storage already started, ignoring start");
            return -1;
        }
        try {
            int i2 = this.m;
            fileInputStream = new FileInputStream(new File(this.n, "version"));
            dataInputStream = new DataInputStream(fileInputStream);
            int readInt = dataInputStream.readInt();
            a((Closeable) fileInputStream);
            a((Closeable) dataInputStream);
            if (i2 != readInt) {
                c();
            }
        } catch (IOException e2) {
        } catch (Throwable th) {
            a((Closeable) fileInputStream);
            a((Closeable) dataInputStream);
            throw th;
        }
        return e();
    }

    public final int a(Map map, boolean z) {
        return a(map, z, true);
    }

    public final int a(Map map, boolean z, boolean z2) {
        this.h += map.size();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            this.c.a(key, entry.getValue());
            this.d.put(key, Long.valueOf(a(z)));
        }
        if (!f()) {
            this.r.b("put() called when leveldb is not active. Operating in memory only mode");
        } else {
            WriteBatch create = WriteBatch.create();
            if (z2) {
                try {
                    byte[] bArr = new byte[32768];
                    aubk a2 = aubk.a(bArr);
                    for (Map.Entry entry2 : map.entrySet()) {
                        Object key2 = entry2.getKey();
                        Object value = entry2.getValue();
                        int b2 = this.o.b(value) + 8;
                        byte[] bArr2 = new byte[b2];
                        int a3 = this.o.a(key2);
                        byte[] bArr3 = new byte[a3];
                        int i2 = a3 + b2 + 11;
                        this.o.a(key2, aubk.a(bArr3));
                        aubk a4 = aubk.a(bArr2);
                        a4.d(((Long) this.d.get(key2)).longValue());
                        this.o.b(value, a4);
                        if (b2 <= 15000) {
                            if (a2.a() <= i2) {
                                a2.g(0);
                                create.bufferedPut(b, bArr);
                                a2 = aubk.a(bArr);
                            }
                            a2.c(bArr2);
                            a2.b(bArr3);
                        } else {
                            create.put(bArr3, bArr2);
                        }
                    }
                    a2.g(0);
                    create.bufferedPut(b, bArr);
                } catch (IOException e2) {
                    this.r.a("failed to write data to leveldb", e2);
                } catch (Throwable th) {
                    create.close();
                    throw th;
                }
            } else {
                for (Map.Entry entry3 : map.entrySet()) {
                    Object key3 = entry3.getKey();
                    Object value2 = entry3.getValue();
                    byte[] bArr4 = new byte[(this.o.b(value2) + 8)];
                    byte[] bArr5 = new byte[this.o.a(key3)];
                    this.o.a(key3, aubk.a(bArr5));
                    aubk a5 = aubk.a(bArr4);
                    a5.d(((Long) this.d.get(key3)).longValue());
                    this.o.b(value2, a5);
                    create.put(bArr5, bArr4);
                }
            }
            this.a.write(create);
            create.close();
        }
        int size = this.q + map.size();
        this.q = size;
        return size;
    }

    public final akkp a(float f2) {
        nz nzVar;
        HashMap hashMap = new HashMap();
        if (!f()) {
            this.r.b("freeDiskSpace() called when leveldb is not active. Operating in memory only mode");
            nzVar = this.c.b();
        } else {
            nz nzVar2 = new nz();
            LevelDb.Iterator it = this.a.iterator();
            try {
                it.seekToFirst();
                while (it.isValid()) {
                    aubc a2 = aubc.a(it.value());
                    long g2 = a2.g();
                    Object a3 = this.o.a(aubc.a(it.key()));
                    nzVar2.put(a3, this.o.b(a2));
                    Long l2 = (Long) this.d.get(a3);
                    if (l2 != null) {
                        if (l2.longValue() >= g2) {
                            it.next();
                        }
                    }
                    this.d.put(a3, Long.valueOf(g2));
                    it.next();
                }
            } catch (IOException e2) {
                this.r.a("failed to load data from leveldb", e2);
            } catch (Throwable th) {
                it.close();
                throw th;
            }
            it.close();
            nzVar = nzVar2;
        }
        TreeMap treeMap = new TreeMap();
        int i2 = 0;
        while (true) {
            ou ouVar = this.d;
            if (i2 >= ouVar.h) {
                break;
            }
            treeMap.put((Long) this.d.c(i2), ouVar.b(i2));
            i2++;
        }
        int size = (int) (f2 * ((float) nzVar.size()));
        for (Object next : treeMap.values()) {
            if (size <= 0) {
                break;
            }
            size--;
            Object remove = nzVar.remove(next);
            this.c.b(next);
            if (remove != null) {
                this.d.remove(next);
                hashMap.put(next, remove);
            } else {
                this.r.b("Failed to delete from disk, removing from memory only");
            }
        }
        if (f()) {
            a((Iterable) hashMap.keySet());
        }
        this.q = nzVar.size();
        return new akkp(nzVar.values(), hashMap.values());
    }

    public final aklg a(Set set) {
        this.g += set.size();
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Object a2 = this.c.a(next);
            if (a2 != null) {
                this.i++;
                hashMap.put(next, a2);
                if (((Long) this.d.get(next)).longValue() > this.p.get()) {
                    z = true;
                }
                this.d.put(next, Long.valueOf(a(z)));
            } else {
                this.j++;
                hashSet.add(next);
            }
        }
        if (f()) {
            try {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    byte[] bArr = new byte[this.o.a(next2)];
                    this.o.a(next2, aubk.a(bArr));
                    byte[] bArr2 = this.a.get(bArr);
                    if (bArr2 != null) {
                        it2.remove();
                        this.k++;
                        aubc a3 = aubc.a(bArr2);
                        boolean z2 = a3.g() > this.p.get();
                        Object b2 = this.o.b(a3);
                        hashMap.put(next2, b2);
                        this.c.a(next2, b2);
                        this.d.put(next2, Long.valueOf(a(z2)));
                    } else {
                        this.l++;
                    }
                }
            } catch (Exception e2) {
                this.r.a("Failed to load data from leveldb", e2);
            }
            return new aklg(hashMap, hashSet);
        }
        this.r.b("get() called when leveldb is not active. Operating in memory only mode");
        return new aklg(hashMap, hashSet);
    }
}
