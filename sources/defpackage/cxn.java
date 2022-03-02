package defpackage;

/* renamed from: cxn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cxn implements Runnable {
    private final cxo a;
    private final int b;

    public cxn(cxo cxo, int i) {
        this.a = cxo;
        this.b = i;
    }

    public final void run() {
        cxo cxo = this.a;
        int i = this.b;
        cxp cxp = cxo.a;
        cxu.a(cxp.s, i, cxp.t);
    }
}
