package defpackage;

/* renamed from: efy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class efy implements Runnable {
    private final efz a;
    private final Runnable b;

    public efy(efz efz, Runnable runnable) {
        this.a = efz;
        this.b = runnable;
    }

    public final void run() {
        efz efz = this.a;
        Runnable runnable = this.b;
        efz.a.getLooper().quit();
        runnable.run();
    }
}
