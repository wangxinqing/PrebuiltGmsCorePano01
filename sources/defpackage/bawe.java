package defpackage;

import org.chromium.net.InlineExecutionProhibitedException;

/* renamed from: bawe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bawe implements Runnable {
    public Thread a;
    public InlineExecutionProhibitedException b;
    private final Runnable c;

    public bawe(Runnable runnable, Thread thread) {
        this.c = runnable;
        this.a = thread;
    }

    public final void run() {
        if (Thread.currentThread() == this.a) {
            this.b = new InlineExecutionProhibitedException();
        } else {
            this.c.run();
        }
    }
}
