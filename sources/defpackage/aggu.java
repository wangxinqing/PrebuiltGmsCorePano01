package defpackage;

import android.os.Process;

/* renamed from: aggu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aggu implements Runnable {
    private final aggv a;
    private final Runnable b;

    public aggu(aggv aggv, Runnable runnable) {
        this.a = aggv;
        this.b = runnable;
    }

    public final void run() {
        aggv aggv = this.a;
        Runnable runnable = this.b;
        int i = aggv.a;
        if (i != 0) {
            Process.setThreadPriority(i);
        }
        runnable.run();
    }
}
