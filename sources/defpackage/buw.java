package defpackage;

import java.util.concurrent.Executor;

/* renamed from: buw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class buw implements Executor {
    final /* synthetic */ bvp a;
    final /* synthetic */ buy b;

    public buw(buy buy, bvp bvp) {
        this.b = buy;
        this.a = bvp;
    }

    public final void execute(Runnable runnable) {
        this.b.a(runnable, this.a);
    }
}
