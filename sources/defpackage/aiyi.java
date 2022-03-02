package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aiyi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aiyi implements Executor {
    public final Runnable a;
    private final Executor b;

    public aiyi(Executor executor, Runnable runnable) {
        this.b = executor;
        this.a = runnable;
    }

    public final void execute(Runnable runnable) {
        this.b.execute(new aiyh(this, runnable));
    }
}
