package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: pbw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pbw implements Executor {
    final /* synthetic */ aoru a;

    public pbw(aoru aoru) {
        this.a = aoru;
    }

    public final aorr a(Callable callable) {
        return this.a.b(callable);
    }

    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
