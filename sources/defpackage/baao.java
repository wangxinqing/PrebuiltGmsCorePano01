package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: baao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baao {
    public final baix a;
    public final baas b;
    public final /* synthetic */ baji c;

    public baao() {
    }

    public final void a() {
        babp babp = this.c.K;
        if (babp == null || !babp.b()) {
            baji baji = this.c;
            if (baji.M == null) {
                baji.M = bagc.a();
            }
            long a2 = this.c.M.a();
            this.c.E.a(1, "Scheduling DNS resolution backoff for {0} ns", Long.valueOf(a2));
            baji baji2 = this.c;
            baji2.K = baji2.l.a(new bair(baji2), a2, TimeUnit.NANOSECONDS, this.c.h.a());
        }
    }

    public final void b(babj babj) {
        baji.a.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{this.c.g, babj});
        baji baji = this.c;
        if (baji.L != 3) {
            baji.E.a(3, "Failed to resolve name: {0}", babj);
            this.c.L = 3;
        }
        baix baix = this.a;
        if (baix == this.c.r) {
            baix.a.b.a(babj);
            a();
        }
    }

    public baao(baji baji, baix baix, baas baas) {
        this.c = baji;
        amrl.a((Object) baix, (Object) "helperImpl");
        this.a = baix;
        amrl.a((Object) baas, (Object) "resolver");
        this.b = baas;
    }

    public final void a(baaq baaq) {
        this.c.l.execute(new baiz(this, baaq));
    }

    public final void a(babj babj) {
        amrl.a(!babj.a(), (Object) "the error status must not be OK");
        this.c.l.execute(new baiy(this, babj));
    }
}
