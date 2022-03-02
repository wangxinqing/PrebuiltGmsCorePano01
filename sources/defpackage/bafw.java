package defpackage;

/* renamed from: bafw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bafw implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ bafx b;

    public bafw(bafx bafx, boolean z) {
        this.b = bafx;
        this.a = z;
    }

    public final void run() {
        if (this.a) {
            baga baga = this.b.a;
            baga.p = true;
            if (baga.m > 0) {
                amsn amsn = baga.o;
                amsn.c();
                amsn.d();
            }
        }
        this.b.a.r = false;
    }
}
