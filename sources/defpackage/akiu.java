package defpackage;

import java.util.concurrent.FutureTask;

/* renamed from: akiu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akiu implements Runnable {
    final /* synthetic */ FutureTask a;
    final /* synthetic */ akiy b;

    public akiu(akiy akiy, FutureTask futureTask) {
        this.b = akiy;
        this.a = futureTask;
    }

    public final void run() {
        this.b.a((Runnable) this.a);
    }
}
