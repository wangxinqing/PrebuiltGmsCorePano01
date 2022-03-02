package defpackage;

import android.os.Process;

/* renamed from: jlv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jlv implements Runnable {
    private final Runnable a;
    private final int b;

    public jlv(Runnable runnable, int i) {
        this.a = runnable;
        this.b = i;
    }

    public final void run() {
        Process.setThreadPriority(this.b);
        this.a.run();
    }
}
