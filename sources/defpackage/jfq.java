package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: jfq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jfq implements aort {
    private final ScheduledFuture a;
    private final aorr b;

    public jfq(ScheduledFuture scheduledFuture, aorr aorr) {
        this.a = scheduledFuture;
        this.b = aorr;
    }

    public final void a(Runnable runnable, Executor executor) {
        this.b.a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return this.a.cancel(z) || this.b.cancel(z);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo((Delayed) obj);
    }

    public final Object get() {
        return this.b.get();
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }

    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
