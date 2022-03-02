package defpackage;

/* renamed from: aorw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aorw implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ aorx b;

    public aorw(aorx aorx, Runnable runnable) {
        this.b = aorx;
        this.a = runnable;
    }

    public final void run() {
        this.b.a = false;
        this.a.run();
    }

    public final String toString() {
        return this.a.toString();
    }
}
