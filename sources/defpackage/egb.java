package defpackage;

/* renamed from: egb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class egb implements Runnable {
    private final egh a;

    public egb(egh egh) {
        this.a = egh;
    }

    public final void run() {
        this.a.d.getLooper().quit();
    }
}
