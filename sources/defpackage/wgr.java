package defpackage;

/* renamed from: wgr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wgr implements Runnable {
    private final wgt a;
    private final tfu b;

    public wgr(wgt wgt, tfu tfu) {
        this.a = wgt;
        this.b = tfu;
    }

    public final void run() {
        wgt wgt = this.a;
        this.b.b();
        wgt.i.s(wgt.d);
    }
}
