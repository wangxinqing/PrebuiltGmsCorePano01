package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: xpu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xpu implements Callable {
    public volatile FutureTask a;
    private final Callable b;
    private final ArrayDeque c;

    public xpu(Callable callable, ArrayDeque arrayDeque) {
        this.b = callable;
        this.c = arrayDeque;
    }

    public final Object call() {
        String valueOf = String.valueOf(Thread.currentThread().getName());
        if (valueOf.length() == 0) {
            new String("Future called for ");
        } else {
            "Future called for ".concat(valueOf);
        }
        Object call = this.b.call();
        if (this.a != null) {
            synchronized (this.c) {
                this.c.remove(this.a);
            }
            this.a = null;
        }
        return call;
    }
}
