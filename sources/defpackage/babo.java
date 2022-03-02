package defpackage;

/* renamed from: babo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class babo implements Runnable {
    final Runnable a;
    boolean b;
    boolean c;

    public babo(Runnable runnable) {
        amrl.a((Object) runnable, (Object) "task");
        this.a = runnable;
    }

    public final void run() {
        if (!this.b) {
            this.c = true;
            this.a.run();
        }
    }
}
