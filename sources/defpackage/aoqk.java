package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: aoqk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class aoqk extends aorq {
    private final Executor a;
    boolean b = true;
    final /* synthetic */ aoql c;

    public aoqk(aoql aoql, Executor executor) {
        this.c = aoql;
        amrl.a((Object) executor);
        this.a = executor;
    }

    public abstract void a(Object obj);

    public final void a(Object obj, Throwable th) {
        aoql aoql = this.c;
        int i = aoql.d;
        aoql.c = null;
        if (th == null) {
            a(obj);
        } else if (th instanceof ExecutionException) {
            aoql.a(th.getCause());
        } else if (th instanceof CancellationException) {
            aoql.cancel(false);
        } else {
            aoql.a(th);
        }
    }

    public final boolean c() {
        return this.c.isDone();
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        try {
            this.a.execute(this);
        } catch (RejectedExecutionException e) {
            if (this.b) {
                this.c.a((Throwable) e);
            }
        }
    }
}
