package defpackage;

/* renamed from: baiw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baiw implements Runnable {
    final /* synthetic */ azzm a;
    final /* synthetic */ azxz b;
    final /* synthetic */ baix c;

    public baiw(baix baix, azzm azzm, azxz azxz) {
        this.c = baix;
        this.a = azzm;
        this.b = azxz;
    }

    public final void run() {
        baix baix = this.c;
        baji baji = baix.b;
        if (baix == baji.r) {
            baji.a(this.a);
            if (this.b != azxz.SHUTDOWN) {
                this.c.b.E.a(2, "Entering {0} state with picker: {1}", this.b, this.a);
                this.c.b.o.a(this.b);
            }
        }
    }
}
