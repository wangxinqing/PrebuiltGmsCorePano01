package defpackage;

import android.os.Process;

/* renamed from: baur  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baur implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ baus b;

    public baur(baus baus, Runnable runnable) {
        this.b = baus;
        this.a = runnable;
    }

    public final void run() {
        Thread.currentThread().setName("JavaCronetEngine");
        Process.setThreadPriority(this.b.a);
        this.a.run();
    }
}
