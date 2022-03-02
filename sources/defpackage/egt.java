package defpackage;

import android.content.Context;
import com.google.android.gms.leveldb.LevelDb;
import java.io.Closeable;
import java.util.HashMap;

/* renamed from: egt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class egt implements Closeable {
    private final Context a;
    private final egk b;
    private LevelDb c;

    public egt(Context context) {
        this.a = context;
        this.b = new egk(context);
    }

    private static boolean b(ehm ehm) {
        aqof aqof;
        aqoc aqoc = ehm.b;
        if (aqoc == null) {
            aqoc = aqoc.h;
        }
        aqoj aqoj = aqoc.d;
        if (aqoj == null) {
            aqoj = aqoj.c;
        }
        if (aqoj.a == 1) {
            aqof = (aqof) aqoj.b;
        } else {
            aqof = aqof.l;
        }
        if ((aqof.a & 16) == 0) {
            return true;
        }
        aqoc aqoc2 = ehm.b;
        if (aqoc2 == null) {
            aqoc2 = aqoc.h;
        }
        if ((aqoc2.a & 16) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void d() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.leveldb.LevelDb r0 = r4.c     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0045
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0047 }
            android.content.Context r1 = r4.a     // Catch:{ all -> 0x0047 }
            java.io.File r1 = r1.getFilesDir()     // Catch:{ all -> 0x0047 }
            java.lang.String r2 = "audit_db"
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0047 }
            awik r1 = defpackage.awik.a     // Catch:{ all -> 0x0047 }
            awil r1 = r1.a()     // Catch:{ all -> 0x0047 }
            boolean r1 = r1.b()     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x003f
            egk r1 = r4.b     // Catch:{ all -> 0x0047 }
            com.google.android.gms.leveldb.LevelDb$Options r2 = new com.google.android.gms.leveldb.LevelDb$Options     // Catch:{ LevelDbException -> 0x002d }
            r2.<init>()     // Catch:{ LevelDbException -> 0x002d }
            r3 = 0
            r2.mDeleteIfCorrupted = r3     // Catch:{ LevelDbException -> 0x002d }
            com.google.android.gms.leveldb.LevelDb r0 = com.google.android.gms.leveldb.LevelDb.open(r0, r2)     // Catch:{ LevelDbException -> 0x002d }
            goto L_0x003b
        L_0x002d:
            r2 = move-exception
            r2 = 2
            r1.a((int) r2)     // Catch:{ all -> 0x0047 }
            com.google.android.gms.leveldb.LevelDb.destroy(r0)     // Catch:{ LevelDbException -> 0x0036 }
            goto L_0x0037
        L_0x0036:
            r1 = move-exception
        L_0x0037:
            com.google.android.gms.leveldb.LevelDb r0 = com.google.android.gms.leveldb.LevelDb.open(r0)     // Catch:{ all -> 0x0047 }
        L_0x003b:
            r4.c = r0     // Catch:{ all -> 0x0047 }
            monitor-exit(r4)
            return
        L_0x003f:
            com.google.android.gms.leveldb.LevelDb r0 = com.google.android.gms.leveldb.LevelDb.open(r0)     // Catch:{ all -> 0x0047 }
            r4.c = r0     // Catch:{ all -> 0x0047 }
        L_0x0045:
            monitor-exit(r4)
            return
        L_0x0047:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egt.d():void");
    }

    public final synchronized ehm a() {
        d();
        LevelDb.Iterator it = this.c.iterator();
        try {
            it.seekToFirst();
            if (it.isValid()) {
                do {
                    ehm ehm = (ehm) aucj.a((aucj) ehm.f, it.value(), aubs.c());
                    if (b(ehm)) {
                        this.c.delete(it.key());
                        it.next();
                        if (awik.a.a().c()) {
                            this.b.a(4);
                        }
                    } else {
                        it.close();
                        return ehm;
                    }
                } while (it.isValid());
            }
        } catch (auda e) {
            this.c.delete(it.key());
            it.next();
            this.b.a(3);
        } catch (Throwable th) {
            it.close();
            throw th;
        }
        it.close();
        return null;
    }

    public final synchronized ehf[] c() {
        HashMap hashMap;
        aqof aqof;
        aucd aucd;
        d();
        hashMap = new HashMap();
        LevelDb.Iterator it = this.c.iterator();
        try {
            it.seekToFirst();
            while (it.isValid()) {
                try {
                    ehm ehm = (ehm) aucj.a((aucj) ehm.f, it.value(), aubs.c());
                    if (!b(ehm)) {
                        aqoc aqoc = ehm.b;
                        if (aqoc == null) {
                            aqoc = aqoc.h;
                        }
                        aqoj aqoj = aqoc.d;
                        if (aqoj == null) {
                            aqoj = aqoj.c;
                        }
                        if (aqoj.a == 1) {
                            aqof = (aqof) aqoj.b;
                        } else {
                            aqof = aqof.l;
                        }
                        String str = aqof.f;
                        int i = ehm.e;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                        sb.append(i);
                        sb.append("-");
                        sb.append(str);
                        String sb2 = sb.toString();
                        int i2 = ehm.U;
                        if (i2 == -1) {
                            i2 = aueh.a.a((Object) ehm).b(ehm);
                            ehm.U = i2;
                        }
                        if (hashMap.containsKey(sb2)) {
                            ehf ehf = (ehf) hashMap.get(sb2);
                            aucd = (aucd) ehf.c(5);
                            aucd.a((aucj) ehf);
                        } else {
                            aucd o = ehf.f.o();
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            ehf ehf2 = (ehf) o.b;
                            str.getClass();
                            int i3 = ehf2.a | 1;
                            ehf2.a = i3;
                            ehf2.b = str;
                            ehf2.a = i3 | 8;
                            ehf2.e = i;
                            aucd = o;
                        }
                        int i4 = ((ehf) aucd.b).c + 1;
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        ehf ehf3 = (ehf) aucd.b;
                        ehf ehf4 = ehf.f;
                        int i5 = ehf3.a | 2;
                        ehf3.a = i5;
                        ehf3.c = i4;
                        ehf3.a = i5 | 4;
                        ehf3.d += i2;
                        hashMap.put(sb2, (ehf) aucd.i());
                        it.next();
                    } else {
                        it.next();
                    }
                } catch (auda e) {
                }
            }
        } catch (NullPointerException e2) {
        } catch (Throwable th) {
            it.close();
            throw th;
        }
        it.close();
        return (ehf[]) hashMap.values().toArray(new ehf[hashMap.size()]);
    }

    public final synchronized void close() {
        LevelDb levelDb = this.c;
        if (levelDb != null) {
            levelDb.close();
            this.c = null;
        }
    }

    public final synchronized int b() {
        int i;
        d();
        LevelDb.Iterator it = this.c.iterator();
        try {
            it.seekToFirst();
            i = 0;
            while (it.isValid()) {
                i++;
                it.next();
            }
        } finally {
            it.close();
        }
        return i;
    }

    public final synchronized void a(ehm ehm) {
        d();
        this.c.delete(egu.a(ehm));
    }

    public final synchronized boolean a(aqoc aqoc, String str) {
        d();
        aucd o = ehm.f.o();
        aqok aqok = aqoc.e;
        if (aqok == null) {
            aqok = aqok.d;
        }
        long j = aqok.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        ehm ehm = (ehm) o.b;
        int i = ehm.a | 2;
        ehm.a = i;
        ehm.c = j;
        int i2 = aqoc.c;
        int i3 = i | 8;
        ehm.a = i3;
        ehm.e = i2;
        aqoc.getClass();
        ehm.b = aqoc;
        int i4 = i3 | 1;
        ehm.a = i4;
        str.getClass();
        ehm.a = i4 | 4;
        ehm.d = str;
        long b2 = awie.b();
        long j2 = 0;
        while (j2 < b2) {
            long j3 = ((ehm) o.b).c + j2;
            if (o.c) {
                o.c();
                o.c = false;
            }
            ehm ehm2 = (ehm) o.b;
            ehm2.a |= 2;
            ehm2.c = j3;
            ehm ehm3 = (ehm) o.i();
            byte[] a2 = egu.a(ehm3);
            if (this.c.get(a2) != null) {
                j2++;
            } else {
                this.c.put(a2, ehm3.k());
                return true;
            }
        }
        return false;
    }
}
