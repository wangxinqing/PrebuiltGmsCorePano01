package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: baal  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baal {
    public final int a;
    public final babb b;
    public final babq c;
    public final baar d;
    public final Executor e;
    private final ScheduledExecutorService f;
    private final azxj g;

    public baal(Integer num, babb babb, babq babq, baar baar, ScheduledExecutorService scheduledExecutorService, azxj azxj, Executor executor) {
        amrl.a((Object) num, (Object) "defaultPort not set");
        this.a = num.intValue();
        amrl.a((Object) babb, (Object) "proxyDetector not set");
        this.b = babb;
        amrl.a((Object) babq, (Object) "syncContext not set");
        this.c = babq;
        amrl.a((Object) baar, (Object) "serviceConfigParser not set");
        this.d = baar;
        this.f = scheduledExecutorService;
        this.g = azxj;
        this.e = executor;
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("defaultPort", this.a);
        a2.a("proxyDetector", (Object) this.b);
        a2.a("syncContext", (Object) this.c);
        a2.a("serviceConfigParser", (Object) this.d);
        a2.a("scheduledExecutorService", (Object) this.f);
        a2.a("channelLogger", (Object) this.g);
        a2.a("executor", (Object) this.e);
        return a2.toString();
    }
}
