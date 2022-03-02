package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: aosc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aosc extends aorz implements aorv {
    final ScheduledExecutorService a;

    public aosc(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        amrl.a((Object) scheduledExecutorService);
        this.a = scheduledExecutorService;
    }

    /* renamed from: a */
    public final aort scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        aosb aosb = new aosb(runnable);
        return new aosa(aosb, this.a.scheduleAtFixedRate(aosb, j, j2, timeUnit));
    }

    /* renamed from: b */
    public final aort scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        aosb aosb = new aosb(runnable);
        return new aosa(aosb, this.a.scheduleWithFixedDelay(aosb, j, j2, timeUnit));
    }

    /* renamed from: a */
    public final aort schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        aosp a2 = aosp.a(runnable, (Object) null);
        return new aosa(a2, this.a.schedule(a2, j, timeUnit));
    }

    /* renamed from: a */
    public final aort schedule(Callable callable, long j, TimeUnit timeUnit) {
        aosp a2 = aosp.a(callable);
        return new aosa(a2, this.a.schedule(a2, j, timeUnit));
    }
}
