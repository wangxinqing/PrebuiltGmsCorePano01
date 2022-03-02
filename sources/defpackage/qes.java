package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: qes  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qes implements aorr {
    public static final qfn a = new qfn("ListenableRequest");
    private final aors b;

    public qes(qer qer) {
        this.b = aors.a(new qeq(qer));
    }

    public final void a(Runnable runnable, Executor executor) {
        this.b.a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return this.b.cancel(z);
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return (audx) this.b.get();
    }

    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    public final boolean isDone() {
        return this.b.isDone();
    }

    public final void a(Executor executor) {
        executor.execute(this.b);
    }

    public final /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        return (audx) this.b.get(j, timeUnit);
    }
}
