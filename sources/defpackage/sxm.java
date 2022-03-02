package defpackage;

/* renamed from: sxm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sxm implements Runnable {
    final /* synthetic */ sxk a;
    final /* synthetic */ long b;
    final /* synthetic */ sxn c;

    public sxm(sxn sxn, sxk sxk, long j) {
        this.c = sxn;
        this.a = sxk;
        this.b = j;
    }

    public final void run() {
        sxn sxn = this.c;
        sxk sxk = this.a;
        long j = this.b;
        sxn.g().a(sxn.A().b());
        if (sxn.a().a(sxk.d, false, j)) {
            sxk.d = false;
        }
        sxn sxn2 = this.c;
        sxn2.b = null;
        sxn2.d().a((sxk) null);
    }
}
