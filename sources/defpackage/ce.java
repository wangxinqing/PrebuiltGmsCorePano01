package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ce  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ce {
    public final int a;
    final cn b;
    public final Object c = new Object();
    public Executor d;
    private final cf e;
    private boolean f = false;

    public ce(cf cfVar, int i, Executor executor, cn cnVar) {
        this.e = cfVar;
        this.a = i;
        this.d = executor;
        this.b = cnVar;
    }

    public final void a(co coVar) {
        Executor executor;
        synchronized (this.c) {
            if (!this.f) {
                this.f = true;
                executor = this.d;
            } else {
                throw new IllegalStateException("callback.onResult already called, cannot call again.");
            }
        }
        if (executor != null) {
            executor.execute(new cd(this, coVar));
        } else {
            this.b.a(this.a, coVar);
        }
    }

    public final boolean a() {
        if (!this.e.c()) {
            return false;
        }
        a(co.b);
        return true;
    }
}
