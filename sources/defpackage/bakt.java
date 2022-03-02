package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: bakt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bakt {
    public final ScheduledExecutorService a;
    public final Executor b;
    public final Runnable c;
    public long d;
    public boolean e;
    public ScheduledFuture f;
    private final amsn g;

    public bakt(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, amsn amsn) {
        this.c = runnable;
        this.b = executor;
        this.a = scheduledExecutorService;
        this.g = amsn;
        amsn.d();
    }

    public final long a() {
        return this.g.a(TimeUnit.NANOSECONDS);
    }
}
