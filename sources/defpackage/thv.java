package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: thv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class thv extends tht implements aorv {
    private final aorv b;

    public thv(aorv aorv) {
        super(aorv);
        this.b = aorv;
    }

    /* renamed from: a */
    public final aort scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        try {
            return this.b.a(this.a.a(runnable), j, j2, timeUnit);
        } catch (RejectedExecutionException e) {
            return new thu(aorl.a((Throwable) e));
        }
    }

    /* renamed from: b */
    public final aort scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        try {
            return this.b.b(this.a.a(runnable), j, j2, timeUnit);
        } catch (RejectedExecutionException e) {
            return new thu(aorl.a((Throwable) e));
        }
    }

    /* renamed from: a */
    public final aort schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            return this.b.a(this.a.a(runnable), j, timeUnit);
        } catch (RejectedExecutionException e) {
            return new thu(aorl.a((Throwable) e));
        }
    }

    /* renamed from: a */
    public final aort schedule(Callable callable, long j, TimeUnit timeUnit) {
        try {
            return this.b.a(this.a.a(callable), j, timeUnit);
        } catch (RejectedExecutionException e) {
            return new thu(aorl.a((Throwable) e));
        }
    }
}
