package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aoqr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aoqr implements Executor {
    final /* synthetic */ aorr a;
    final /* synthetic */ Executor b;

    public aoqr(aorr aorr, Executor executor) {
        this.a = aorr;
        this.b = executor;
    }

    public final void execute(Runnable runnable) {
        this.a.a(runnable, this.b);
    }
}
