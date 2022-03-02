package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: aoqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aoqy extends amys implements Future, aorr {
    protected aoqy() {
    }

    public void a(Runnable runnable, Executor executor) {
        e().a(runnable, executor);
    }

    public boolean cancel(boolean z) {
        return f().cancel(z);
    }

    /* access modifiers changed from: protected */
    public abstract aorr e();

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ Future f() {
        throw null;
    }

    public final Object get() {
        return f().get();
    }

    public final boolean isCancelled() {
        return f().isCancelled();
    }

    public final boolean isDone() {
        return f().isDone();
    }

    public Object get(long j, TimeUnit timeUnit) {
        return f().get(j, timeUnit);
    }
}
