package defpackage;

/* renamed from: dae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dae implements Runnable {
    private final dau a;
    private final dat b;

    public dae(dau dau, dat dat) {
        this.a = dau;
        this.b = dat;
    }

    public final void run() {
        dau dau = this.a;
        dat dat = this.b;
        if (dat != null) {
            dat.a();
        }
        dau.a.d.a.b(csd.a(cso.a));
    }
}
