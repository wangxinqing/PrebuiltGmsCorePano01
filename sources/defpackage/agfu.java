package defpackage;

import java.util.concurrent.ExecutorService;

/* renamed from: agfu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agfu {
    public static final /* synthetic */ int b = 0;
    private static final anhq c = anhq.a("agfu");
    private static final agfu d = new agfu(new agff());
    private static volatile boolean e = true;
    private static volatile agfu f = d;
    public final agfv a;

    public agfu(agfv agfv) {
        amrl.a((Object) agfv);
        this.a = agfv;
    }

    public static agfu a() {
        if (f == d && e) {
            e = false;
            ((anhn) ((anhn) c.c()).a("agfu", "a", 126, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Primes not initialized, returning default (no-op) Primes instance which will ignore all calls. Please call Primes.initialize(...) before using any Primes API.");
        }
        return f;
    }

    public final agif b() {
        return this.a.e();
    }

    public static synchronized void a(agft agft) {
        synchronized (agfu.class) {
            if (f == d) {
                bapu bapu = ((agea) agft).a;
                agge.b();
                agge b2 = ((aggf) bapu).a();
                agcz.a(b2.c);
                Runnable a2 = agge.a(amll.a((Runnable) new agfz(b2, new aggc(agcz.a(b2.c)), new aggd(agcz.a(b2.c), b2.d))));
                b2.f.h();
                Runnable a3 = agge.a((Runnable) new agfx(b2, (ExecutorService) b2.e.a(), a2));
                new agfw(b2);
                b2.f.h();
                a3.run();
                awdx.a((Object) b2, "Cannot return null from a non-@Nullable @Provides method");
                agfu agfu = new agfu(b2);
                awdx.a((Object) agfu, "Cannot return null from a non-@Nullable @Provides method");
                f = agfu;
            }
        }
    }

    public final void a(agev agev) {
        this.a.a(agev);
    }

    public final void a(agif agif, agfe agfe) {
        this.a.a(agif, agfe.a, true);
    }

    @Deprecated
    public final void a(agif agif, String str) {
        this.a.a(agif, str, false);
    }
}
