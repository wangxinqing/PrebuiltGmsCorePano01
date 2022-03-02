package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: aord  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aord {
    private final boolean a;
    private final amzy b;

    public aord(boolean z, amzy amzy) {
        this.a = z;
        this.b = amzy;
    }

    public final aorr a(aoqa aoqa, Executor executor) {
        return new aoql((amzn) this.b, this.a, executor, aoqa);
    }

    public final aorr a(Runnable runnable, Executor executor) {
        return a((Callable) new aorc(runnable), executor);
    }

    public final aorr a(Callable callable, Executor executor) {
        return new aoql((amzn) this.b, this.a, executor, callable);
    }
}
