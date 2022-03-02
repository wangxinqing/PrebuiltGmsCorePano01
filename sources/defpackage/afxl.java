package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: afxl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afxl implements afxm {
    public final afvn a;
    public final afvk b;
    public final amsv c;
    private final amsv d;
    private final amsv e;
    private final Executor f;
    private final afua g;
    private final afvi h;

    public afxl(afua afua, afvn afvn, afvk afvk, afvi afvi, amsv amsv, amsv amsv2, Executor executor, amsv amsv3) {
        this.g = afua;
        this.a = afvn;
        this.b = afvk;
        this.h = afvi;
        this.d = amsv;
        this.e = amsv2;
        this.f = executor;
        this.c = amsv3;
    }

    private static aqvr a(aqvr aqvr) {
        if (aqvr.a.isEmpty()) {
            return aqvr;
        }
        aqwr aqwr = (aqwr) aqvr.a.get(0);
        amgi amgi = aqwr.a;
        if (amgi == null) {
            amgi = amgi.D;
        }
        aucd aucd = (aucd) aqvr.c(5);
        aucd.a((aucj) aqvr);
        aqvq aqvq = (aqvq) aucd;
        if (aqvq.c) {
            aqvq.c();
            aqvq.c = false;
        }
        aqvr aqvr2 = aqvr.b;
        ((aqvr) aqvq.b).a = aucj.s();
        aucd aucd2 = (aucd) aqwr.c(5);
        aucd2.a((aucj) aqwr);
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aqwr aqwr2 = aqwr.c;
        ((aqwr) aucd2.b).a = null;
        aucd aucd3 = (aucd) amgi.c(5);
        aucd3.a((aucj) amgi);
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        ((amgi) aucd3.b).e = aucj.s();
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        amgi amgi2 = (amgi) aucd3.b;
        amgi2.a &= -257;
        amgi2.B = amgi.D.B;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        amgi amgi3 = (amgi) aucd3.i();
        amgi3.getClass();
        ((aqwr) aucd2.b).a = amgi3;
        aqvq.a(aucd2);
        return (aqvr) aqvq.i();
    }

    private static boolean a(afus afus) {
        afur afur = afus.c;
        if (afur == null) {
            afur = afur.g;
        }
        return !afur.equals(afur.g);
    }

    private static boolean a(aqvr aqvr, aqvr aqvr2) {
        amgp a2 = afxn.a(aqvr);
        amgp a3 = afxn.a(aqvr2);
        if (a2 == null && a3 == null) {
            return false;
        }
        return a2 == null || a3 == null || !a2.e.equals(a3.e);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ afur a(Exception exc) {
        int b2 = sgc.b();
        if (b2 != 0) {
            anie c2 = ((anij) this.c.a()).c();
            c2.a(b2);
            c2.a((Throwable) exc);
            c2.a("afxl", "a", 284, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Photo download failed!");
        }
        return afur.g;
    }

    public final aorr a(int i) {
        AtomicReference atomicReference = new AtomicReference();
        return aopr.a(this.g.a(new afwp(this, atomicReference, i), aoqm.a), (amqy) new afxa(this, atomicReference), (Executor) aoqm.a);
    }

    public final aorr a(afus afus, aqvr aqvr) {
        aorr aorr;
        aqvr aqvr2 = afus.b;
        if (aqvr2 == null) {
            aqvr2 = aqvr.b;
        }
        if (a(aqvr2, aqvr)) {
            aorr = aorl.a((Object) true);
        } else if (sgc.d() && !a(afus)) {
            aorr = aorl.a((Object) true);
        } else if (!sgc.a() || !a(afus)) {
            aorr = aorl.a((Object) false);
        } else {
            afur afur = afus.c;
            if (afur == null) {
                afur = afur.g;
            }
            aorr = aopr.a(aooz.a(aorl.c(this.h.a(afur, 0), this.h.a(afur, 1), this.h.a(afur, 2), this.h.a(afur, 3), this.h.a(afur, 4)).a(afwu.a, (Executor) aoqm.a), Exception.class, afwv.a, (Executor) aoqm.a), afwt.a, (Executor) aoqm.a);
        }
        aorr a2 = aopr.a(aorr, (aoqb) new afwr(this, afus, aqvr), (Executor) aoqm.a);
        if (!sgc.d()) {
            return a2;
        }
        return aooz.a(a2, Exception.class, (amqy) new afws(this), (Executor) aoqm.a);
    }

    public final aorr a(aqxi aqxi) {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        return aopr.a(this.g.a(new afxe(this, atomicReference, aqxi, atomicReference2), aoqm.a), (amqy) new afxf(this, atomicReference2, atomicReference), (Executor) aoqm.a);
    }

    public final aorr a(aqxk aqxk) {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        return aopr.a(this.g.a(new afxc(this, atomicReference, aqxk, atomicReference2), aoqm.a), (amqy) new afxd(this, atomicReference2, atomicReference), (Executor) aoqm.a);
    }

    public final boolean a(afus afus, afus afus2) {
        boolean z;
        aqvr aqvr = afus2.b;
        if (aqvr == null) {
            aqvr = aqvr.b;
        }
        aqvr aqvr2 = afus.b;
        if (aqvr2 == null) {
            aqvr2 = aqvr.b;
        }
        if (!a(aqvr2).equals(a(aqvr))) {
            afvq afvq = (afvq) this.d.a();
            if (afvq != null) {
                Executor executor = this.f;
                afvq.getClass();
                executor.execute(new afxg(afvq));
                z = true;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (!a(aqvr2, aqvr)) {
            return z;
        }
        afvq afvq2 = (afvq) this.e.a();
        if (afvq2 == null) {
            return true;
        }
        Executor executor2 = this.f;
        afvq2.getClass();
        executor2.execute(new afxh(afvq2));
        return true;
    }
}
