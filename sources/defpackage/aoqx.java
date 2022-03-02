package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: aoqx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aoqx extends aoqw {
    private final aorr a;

    public aoqx(aorr aorr) {
        amrl.a((Object) aorr);
        this.a = aorr;
    }

    public final void a(Runnable runnable, Executor executor) {
        this.a.a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    public final Object get() {
        return this.a.get();
    }

    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    public final boolean isDone() {
        return this.a.isDone();
    }

    public final String toString() {
        return this.a.toString();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}
