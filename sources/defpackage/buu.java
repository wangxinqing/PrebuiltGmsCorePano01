package defpackage;

import java.util.concurrent.Executor;

/* renamed from: buu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class buu implements Executor {
    final /* synthetic */ bvp a;
    final /* synthetic */ buv b;

    public buu(buv buv, bvp bvp) {
        this.b = buv;
        this.a = bvp;
    }

    public final void execute(Runnable runnable) {
        this.b.a(runnable, this.a);
    }
}
