package defpackage;

/* renamed from: arwh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class arwh implements Runnable {
    private final arwl a;
    private final arwm b;

    public arwh(arwl arwl, arwm arwm) {
        this.a = arwl;
        this.b = arwm;
    }

    public final void run() {
        arwl arwl = this.a;
        arwl.c.getLooper().getQueue().addIdleHandler(new arwi(arwl, this.b));
    }
}
