package defpackage;

/* renamed from: cxr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cxr implements Runnable {
    private final cxs a;
    private final int b;

    public cxr(cxs cxs, int i) {
        this.a = cxs;
        this.b = i;
    }

    public final void run() {
        cxs cxs = this.a;
        int i = this.b;
        cxt cxt = cxs.a;
        cxu.a(cxt.s, i, cxt.u);
    }
}
