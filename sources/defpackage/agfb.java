package defpackage;

/* renamed from: agfb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agfb implements Runnable {
    private final agfc a;
    private final agev[] b;

    public agfb(agfc agfc, agev[] agevArr) {
        this.a = agfc;
        this.b = agevArr;
    }

    public final void run() {
        agfc agfc = this.a;
        agfc.b.a(agfc.g.a(this.b));
    }
}
