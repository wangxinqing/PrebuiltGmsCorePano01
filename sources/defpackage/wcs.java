package defpackage;

/* renamed from: wcs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wcs implements Runnable {
    private final wcu a;
    private final wct b;

    public wcs(wcu wcu, wct wct) {
        this.a = wcu;
        this.b = wct;
    }

    public final void run() {
        wcu wcu = this.a;
        wct wct = this.b;
        wcu.a(wct, wct.a);
    }
}
