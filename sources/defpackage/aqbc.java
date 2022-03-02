package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aqbc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aqbc implements Executor {
    private final aqbq a;
    private final Executor b;

    public aqbc(aqbq aqbq, Executor executor) {
        this.a = aqbq;
        this.b = executor;
    }

    public final void execute(Runnable runnable) {
        this.b.execute(new aqbe(this.a, runnable));
    }
}
