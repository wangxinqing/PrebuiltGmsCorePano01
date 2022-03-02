package defpackage;

import java.util.concurrent.Executor;

/* renamed from: nkw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class nkw implements Executor {
    private final Executor a;
    private final jff b;

    public nkw(Executor executor, jff jff) {
        this.a = executor;
        this.b = jff;
    }

    public final void execute(Runnable runnable) {
        this.a.execute(new nkx(this.b, runnable));
    }
}
