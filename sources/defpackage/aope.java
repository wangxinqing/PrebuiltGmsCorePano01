package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aope  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aope {
    static final aope a = new aope((Runnable) null, (Executor) null);
    final Runnable b;
    final Executor c;
    aope next;

    public aope(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
