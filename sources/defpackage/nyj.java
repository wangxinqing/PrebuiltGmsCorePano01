package defpackage;

import java.util.concurrent.ExecutorService;

/* renamed from: nyj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nyj extends nsg {
    public final ExecutorService a = jfm.b(10);
    private final nrj b;
    private final nyn c;
    private final nyi d;

    public nyj(nrj nrj, nyn nyn, nyi nyi) {
        this.b = nrj;
        this.c = nyn;
        this.d = nyi;
    }

    public final void a(ntx ntx) {
        if (this.d.b(ntx)) {
            nrj nrj = this.b;
            for (amnc b2 : nrj.r.a(ntx)) {
                nrj.b(b2);
            }
        }
    }

    public final void b(ntx ntx) {
        if (!this.d.b(ntx)) {
            nyi nyi = this.d;
            nyn nyn = this.c;
            if (nyi.a(ntx) && (!axkn.c() || !aekv.a(nyi.a))) {
                nyn.a((Runnable) new nyh(nyi, nyn, ntx));
            }
            this.b.r.a(ntx);
        }
    }
}
