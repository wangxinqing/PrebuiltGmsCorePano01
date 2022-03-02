package defpackage;

import java.util.Map;

/* renamed from: nua  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nua {
    public final nvp a;
    public final Map b = new nz();
    public final Map c = new nz();

    public nua(nvp nvp) {
        this.a = nvp;
        for (nrm nrm : nvp.b()) {
            ntx a2 = a(nrm);
            if ((nrm.a & 4) != 0) {
                this.b.put(a2, Integer.valueOf(nrm.d));
            }
            int i = nrm.a;
            if (!((i & 8) == 0 || (i & 16) == 0)) {
                this.c.put(a2, new ntz(nrm.e, nrm.f));
            }
        }
    }

    private static ntx a(nrm nrm) {
        return ntx.a(nrm.c, nrm.b);
    }

    public static int d(ntx ntx) {
        return ntx.b(nrr.a().l, 0).versionCode;
    }

    private static aucd g(ntx ntx) {
        aucd o = nrm.h.o();
        String str = ntx.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        nrm nrm = (nrm) o.b;
        str.getClass();
        int i = nrm.a | 2;
        nrm.a = i;
        nrm.c = str;
        int i2 = ntx.b;
        nrm.a = i | 1;
        nrm.b = i2;
        return o;
    }

    public final ntz b(ntx ntx) {
        ntz ntz;
        synchronized (this) {
            ntz = (ntz) this.c.get(ntx);
        }
        return ntz == null ? ntz.a : ntz;
    }

    public final synchronized void c(ntx ntx) {
        this.b.remove(ntx);
        this.a.b((aucj) (nrm) g(ntx).i());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r3 == 0) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int e(defpackage.ntx r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            nvp r0 = r2.a     // Catch:{ all -> 0x0021 }
            amri r3 = r0.a(r3)     // Catch:{ all -> 0x0021 }
            boolean r0 = r3.a()     // Catch:{ all -> 0x0021 }
            r1 = 1
            if (r0 == 0) goto L_0x001f
            java.lang.Object r3 = r3.b()     // Catch:{ all -> 0x0021 }
            nrm r3 = (defpackage.nrm) r3     // Catch:{ all -> 0x0021 }
            int r3 = r3.g     // Catch:{ all -> 0x0021 }
            int r3 = defpackage.nrl.a(r3)     // Catch:{ all -> 0x0021 }
            monitor-exit(r2)
            if (r3 == 0) goto L_0x001e
            return r3
        L_0x001e:
            return r1
        L_0x001f:
            monitor-exit(r2)
            return r1
        L_0x0021:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nua.e(ntx):int");
    }

    public final aucd f(ntx ntx) {
        amri a2 = this.a.a(ntx);
        if (!a2.a()) {
            return g(ntx);
        }
        nrm nrm = (nrm) a2.b();
        aucd aucd = (aucd) nrm.c(5);
        aucd.a((aucj) nrm);
        return aucd;
    }

    public final synchronized amzy a() {
        amzt j;
        j = amzy.j();
        anhk i = this.a.a(nty.a).listIterator();
        while (i.hasNext()) {
            j.c(a((nrm) i.next()));
        }
        return j.a();
    }

    public final synchronized void a(ntx ntx) {
        this.b.remove(ntx);
        amri a2 = this.a.a(ntx);
        if (a2.a()) {
            nvp nvp = this.a;
            nrm nrm = (nrm) a2.b();
            aucd aucd = (aucd) nrm.c(5);
            aucd.a((aucj) nrm);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            nrm nrm2 = (nrm) aucd.b;
            nrm nrm3 = nrm.h;
            nrm2.a &= -5;
            nrm2.d = 0;
            nvp.a((aucj) (nrm) aucd.i());
        }
    }

    public final synchronized void a(ntx ntx, int i) {
        aucd f = f(ntx);
        int a2 = nrl.a(((nrm) f.b).g);
        if (a2 == 0) {
            a2 = 1;
        }
        if (a2 != i) {
            nvp nvp = this.a;
            if (f.c) {
                f.c();
                f.c = false;
            }
            nrm nrm = (nrm) f.b;
            nrm nrm2 = nrm.h;
            nrm.g = i - 1;
            nrm.a |= 32;
            nvp.a((aucj) (nrm) f.i());
        }
    }

    public final synchronized void a(ntx ntx, ntz ntz) {
        this.c.put(ntx, ntz);
        nvp nvp = this.a;
        aucd f = f(ntx);
        long j = ntz.b;
        if (f.c) {
            f.c();
            f.c = false;
        }
        nrm nrm = (nrm) f.b;
        nrm nrm2 = nrm.h;
        int i = nrm.a | 8;
        nrm.a = i;
        nrm.e = j;
        int i2 = ntz.c;
        nrm.a = i | 16;
        nrm.f = i2;
        nvp.a((aucj) (nrm) f.i());
    }
}
