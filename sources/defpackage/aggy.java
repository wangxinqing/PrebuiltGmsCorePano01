package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: aggy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aggy implements awdt {
    private final bapu a;

    public aggy(bapu bapu) {
        this.a = bapu;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        aghs aghs = (aghs) this.a.a();
        aorv a2 = aghs.a();
        if (a2 == null) {
            int e = aghs.e();
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(e, new aggv("Primes", aghs.e()), new aggt());
            scheduledThreadPoolExecutor.setMaximumPoolSize(e);
            a2 = aosd.a((ScheduledExecutorService) scheduledThreadPoolExecutor);
        }
        aghf aghf = new aghf(a2, aggs.a);
        awdx.a((Object) aghf, "Cannot return null from a non-@Nullable @Provides method");
        return aghf;
    }
}
