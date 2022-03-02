package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* renamed from: jgd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jgd extends FutureTask implements aorr, jey {
    Object a;
    private final aoqp b = new aoqp();

    public jgd(Callable callable, Object obj) {
        super(callable);
        this.a = obj;
    }

    public final Object a() {
        return this.a;
    }

    public final Runnable b() {
        return this;
    }

    /* access modifiers changed from: protected */
    public final void done() {
        this.a = null;
        this.b.a();
    }

    public final void a(Runnable runnable, Executor executor) {
        this.b.a(runnable, executor);
    }
}
