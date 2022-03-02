package defpackage;

/* renamed from: dxq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dxq implements Runnable {
    final /* synthetic */ dxx a;

    public dxq(dxx dxx) {
        this.a = dxx;
    }

    public final void run() {
        dzw dzw = this.a.s;
        if (dzw.c == null || !dzw.d.isShown()) {
            dzw.b.d();
            return;
        }
        dzw.d.fullScroll(130);
        dzw.c.d();
    }
}
