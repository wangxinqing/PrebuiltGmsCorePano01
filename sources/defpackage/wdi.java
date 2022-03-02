package defpackage;

/* renamed from: wdi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wdi implements Runnable {
    private final wdk a;
    private final tjc b;

    public wdi(wdk wdk, tjc tjc) {
        this.a = wdk;
        this.b = tjc;
    }

    public final void run() {
        wdk wdk = this.a;
        wdk.a.a(this.b);
    }
}
