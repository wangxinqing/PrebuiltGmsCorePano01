package defpackage;

import java.util.concurrent.Callable;

/* renamed from: aoso  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aoso extends aorq {
    final /* synthetic */ aosp a;
    private final Callable b;

    public aoso(aosp aosp, Callable callable) {
        this.a = aosp;
        amrl.a((Object) callable);
        this.b = callable;
    }

    public final String a() {
        return this.b.toString();
    }

    public final Object b() {
        return this.b.call();
    }

    public final boolean c() {
        return this.a.isDone();
    }

    public final void a(Object obj, Throwable th) {
        if (th != null) {
            this.a.a(th);
        } else {
            this.a.b(obj);
        }
    }
}
