package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: aorx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aorx implements Executor {
    boolean a = true;
    final /* synthetic */ Executor b;
    final /* synthetic */ aopn c;

    public aorx(Executor executor, aopn aopn) {
        this.b = executor;
        this.c = aopn;
    }

    public final void execute(Runnable runnable) {
        try {
            this.b.execute(new aorw(this, runnable));
        } catch (RejectedExecutionException e) {
            if (this.a) {
                this.c.a((Throwable) e);
            }
        }
    }
}
