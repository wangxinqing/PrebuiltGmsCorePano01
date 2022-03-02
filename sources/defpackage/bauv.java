package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: bauv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bauv implements Executor {
    final /* synthetic */ Executor a;
    final /* synthetic */ bavb b;

    public bauv(bavb bavb, Executor executor) {
        this.b = bavb;
        this.a = executor;
    }

    public final void execute(Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.b.a((Throwable) e);
        }
    }
}
