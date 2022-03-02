package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* renamed from: aors  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aors extends FutureTask implements aorr {
    private final aoqp a = new aoqp();

    public aors(Callable callable) {
        super(callable);
    }

    public static aors a(Callable callable) {
        return new aors(callable);
    }

    /* access modifiers changed from: protected */
    public final void done() {
        this.a.a();
    }

    public final void a(Runnable runnable, Executor executor) {
        this.a.a(runnable, executor);
    }
}
