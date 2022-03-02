package defpackage;

/* renamed from: xrk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class xrk implements Runnable {
    private final xrp a;

    public xrk(xrp xrp) {
        this.a = xrp;
    }

    public final void run() {
        xrp xrp = this.a;
        wss.a(xrp.getContext()).a();
        xrp.b();
    }
}
