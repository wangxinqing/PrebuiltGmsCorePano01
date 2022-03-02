package defpackage;

import android.os.SystemClock;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: aklb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aklb implements aklf {
    public akkm a;
    public akkm b;
    public int c = 0;
    public long d = -1;
    public final File e;
    public final akkn f;
    public final Executor g;
    public final Executor h;
    public aklo i;
    private final File j;
    private final akma k;

    public aklb(File file, akkn akkn, Executor executor, Executor executor2, akma akma) {
        this.e = file;
        this.f = akkn;
        this.g = executor;
        this.h = executor2;
        this.k = akma;
        aklz.a();
        this.j = new File(file, "ttl2");
    }

    private static final int a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return 0;
        }
        int i2 = 0;
        for (File length : listFiles) {
            i2 = (int) (((long) i2) + length.length());
        }
        return i2;
    }

    public final long b() {
        try {
            long j2 = this.d;
            if (j2 == -1) {
                FileInputStream fileInputStream = new FileInputStream(this.j);
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte readByte = dataInputStream.readByte();
                this.d = dataInputStream.readLong();
                dataInputStream.close();
                fileInputStream.close();
                if (readByte == 2) {
                    j2 = this.d;
                } else {
                    this.d = -1;
                    throw new IOException("TTL file has wrong version");
                }
            }
            return System.currentTimeMillis() - j2;
        } catch (IOException e2) {
            return -1;
        }
    }

    public final void a() {
        File[] listFiles = this.e.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!file.isDirectory()) {
                    file.delete();
                }
            }
        }
        akkm akkm = this.a;
        if (akkm != null && this.b != null) {
            akkm.c();
            this.b.c();
            this.d = System.currentTimeMillis();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.j);
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                dataOutputStream.write(2);
                dataOutputStream.writeLong(this.d);
                dataOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e2) {
                aklz.a().a("Failed to write TTL", e2);
            }
        }
    }

    public final void b(int i2) {
        aklz.a();
        StringBuilder sb = new StringBuilder(33);
        sb.append("L2 disk size: ");
        sb.append(i2);
        sb.append(" entries");
        sb.toString();
        if (i2 > ((int) azcf.a.a().p())) {
            aklz.a();
            a(3);
        }
    }

    public final void a(int i2) {
        if (this.a != null && this.b != null) {
            if (i2 != 2) {
                this.i.m++;
            } else {
                this.i.k++;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int d2 = this.a.d();
            int d3 = this.b.d();
            akkp a2 = this.a.a((float) azcf.a.a().n());
            HashSet hashSet = new HashSet();
            Iterator it = a2.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                for (long valueOf : (long[]) it.next()) {
                    hashSet.add(Long.valueOf(valueOf));
                }
            }
            for (long[] jArr : a2.a) {
                for (long valueOf2 : (long[]) r5.next()) {
                    hashSet.remove(Long.valueOf(valueOf2));
                }
            }
            this.b.b(hashSet);
            long seconds = TimeUnit.MILLISECONDS.toSeconds(b());
            int d4 = this.a.d();
            int d5 = this.b.d();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            akma akma = this.k;
            int i3 = (int) seconds;
            int i4 = (int) (elapsedRealtime2 - elapsedRealtime);
            aucd o = aocb.i.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aocb aocb = (aocb) o.b;
            int i5 = aocb.a | 32;
            aocb.a = i5;
            aocb.g = i2;
            int i6 = i5 | 4;
            aocb.a = i6;
            aocb.d = i3;
            int i7 = i6 | 64;
            aocb.a = i7;
            aocb.h = i4;
            int i8 = i7 | 1;
            aocb.a = i8;
            aocb.b = d2;
            int i9 = i8 | 2;
            aocb.a = i9;
            aocb.c = d3;
            int i10 = i9 | 8;
            aocb.a = i10;
            aocb.e = d4;
            aocb.a = i10 | 16;
            aocb.f = d5;
            aocb aocb2 = (aocb) o.i();
            akun akun = (akun) akma;
            aocf a3 = akun.a();
            aucd aucd = (aucd) a3.c(5);
            aucd.a((aucj) a3);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aocf aocf = (aocf) aucd.b;
            aocf aocf2 = aocf.s;
            aocf.c = 6;
            int i11 = 2 | aocf.a;
            aocf.a = i11;
            if (aocb2 != null) {
                aocb2.getClass();
                aocf.m = aocb2;
                aocf.a = i11 | 2048;
            }
            akun.a((aocf) aucd.i());
        }
    }

    public final void a(int i2, int i3, int i4) {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(b());
        akma akma = this.k;
        int a2 = a(new File(this.e, "l1"));
        int i5 = (int) seconds;
        int a3 = a(new File(this.e, "l2"));
        aucd o = aoca.h.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoca aoca = (aoca) o.b;
        int i6 = aoca.a | 32;
        aoca.a = i6;
        aoca.g = i2;
        int i7 = i6 | 4;
        aoca.a = i7;
        aoca.d = i5;
        int i8 = i7 | 1;
        aoca.a = i8;
        aoca.b = a2;
        int i9 = i8 | 2;
        aoca.a = i9;
        aoca.c = a3;
        int i10 = i9 | 8;
        aoca.a = i10;
        aoca.e = i3;
        aoca.a = i10 | 16;
        aoca.f = i4;
        aoca aoca2 = (aoca) o.i();
        akun akun = (akun) akma;
        aocf a4 = akun.a();
        aucd aucd = (aucd) a4.c(5);
        aucd.a((aucj) a4);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aocf aocf = (aocf) aucd.b;
        aocf aocf2 = aocf.s;
        aocf.c = 4;
        int i11 = aocf.a | 2;
        aocf.a = i11;
        if (aoca2 != null) {
            aoca2.getClass();
            aocf.k = aoca2;
            aocf.a = i11 | 512;
        }
        akun.a((aocf) aucd.i());
    }

    public final void a(Collection collection, akld akld) {
        this.g.execute(new akkx(this, collection, akld));
    }

    public final void a(Collection collection, akle akle) {
        this.g.execute(new akkz(this, collection, akle));
    }

    public final void a(astz[] astzArr) {
        this.g.execute(new akkw(this, astzArr));
    }
}
