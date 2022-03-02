package defpackage;

import java.util.concurrent.Executor;

/* renamed from: buv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class buv implements but {
    public jfp a = null;
    public but b = null;

    private final void c() {
        if (!a()) {
            throw new IllegalStateException("Internal thread is not running.");
        }
    }

    public final Executor a(bvp bvp) {
        return new buu(this, bvp);
    }

    public final boolean a() {
        return this.b != null;
    }

    public final void b() {
        if (!a()) {
            jfp jfp = new jfp(9);
            this.a = jfp;
            jfp.start();
            this.b = new buy(this.a);
        }
    }

    public final void a(Runnable runnable) {
        if (a()) {
            this.b.a(runnable);
        }
    }

    public final void a(Runnable runnable, long j, bvp bvp) {
        c();
        this.b.a(runnable, j, bvp);
    }

    public final void a(Runnable runnable, bvp bvp) {
        bvp.a();
        c();
        this.b.a(runnable, bvp);
    }
}
