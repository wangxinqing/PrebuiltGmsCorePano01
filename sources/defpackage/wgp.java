package defpackage;

/* renamed from: wgp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wgp implements Runnable {
    private final wgt a;
    private final String b;

    public wgp(wgt wgt, String str) {
        this.a = wgt;
        this.b = str;
    }

    public final void run() {
        wgt wgt = this.a;
        wgt.i.g.b(this.b);
    }
}
