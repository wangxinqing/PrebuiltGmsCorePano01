package defpackage;

import java.util.concurrent.Executor;

/* renamed from: bwi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bwi implements Executor {
    final /* synthetic */ bvp a;
    final /* synthetic */ bwn b;

    public bwi(bwn bwn, bvp bvp) {
        this.b = bwn;
        this.a = bvp;
    }

    public final void execute(Runnable runnable) {
        this.b.a(runnable, this.a);
    }
}
