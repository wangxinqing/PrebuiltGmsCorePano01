package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* renamed from: aosp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aosp extends aoqv implements RunnableFuture {
    private volatile aorq a;

    public aosp(aoqa aoqa) {
        this.a = new aosn(this, aoqa);
    }

    static aosp a(Runnable runnable, Object obj) {
        return new aosp(Executors.callable(runnable, obj));
    }

    /* access modifiers changed from: protected */
    public final String aK() {
        aorq aorq = this.a;
        if (aorq == null) {
            return super.aK();
        }
        String valueOf = String.valueOf(aorq);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final void b() {
        aorq aorq;
        if (d() && (aorq = this.a) != null) {
            aorq.e();
        }
        this.a = null;
    }

    public final void run() {
        aorq aorq = this.a;
        if (aorq != null) {
            aorq.run();
        }
        this.a = null;
    }

    public aosp(Callable callable) {
        this.a = new aoso(this, callable);
    }

    static aosp a(Callable callable) {
        return new aosp(callable);
    }
}
