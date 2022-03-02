package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: tht  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class tht implements aoru {
    protected final tic a;
    private final aoru b;

    public tht(aoru aoru) {
        tic tic;
        this.b = aoru;
        if (!aymi.a.a().af()) {
            tic = new thw();
        } else {
            tic = new tib(jfm.b(10));
        }
        this.a = tic;
    }

    /* renamed from: a */
    public final aorr submit(Runnable runnable) {
        try {
            return this.b.a(this.a.a(runnable));
        } catch (RejectedExecutionException e) {
            return aorl.a((Throwable) e);
        }
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.b.awaitTermination(j, timeUnit);
    }

    /* renamed from: b */
    public final aorr submit(Callable callable) {
        try {
            return this.b.b(this.a.a(callable));
        } catch (RejectedExecutionException e) {
            return aorl.a((Throwable) e);
        }
    }

    public final void execute(Runnable runnable) {
        try {
            this.b.execute(this.a.a(runnable));
        } catch (RejectedExecutionException e) {
        }
    }

    public final List invokeAll(Collection collection) {
        return this.b.invokeAll(collection);
    }

    public final Object invokeAny(Collection collection) {
        return this.b.invokeAny(collection);
    }

    public final boolean isShutdown() {
        return this.b.isShutdown();
    }

    public final boolean isTerminated() {
        return this.b.isTerminated();
    }

    public final void shutdown() {
        this.b.shutdown();
        this.a.a();
    }

    public final List shutdownNow() {
        this.a.b();
        return this.b.shutdownNow();
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.b.invokeAll(collection, j, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.b.invokeAny(collection, j, timeUnit);
    }

    /* renamed from: a */
    public final aorr submit(Runnable runnable, Object obj) {
        try {
            return this.b.a(this.a.a(runnable), obj);
        } catch (RejectedExecutionException e) {
            return aorl.a((Throwable) e);
        }
    }
}
