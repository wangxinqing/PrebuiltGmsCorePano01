package defpackage;

import java.util.concurrent.Executor;

/* renamed from: agt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agt {
    static final agt a = new agt((Runnable) null, (Executor) null);
    final Runnable b;
    final Executor c;
    agt next;

    public agt(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
