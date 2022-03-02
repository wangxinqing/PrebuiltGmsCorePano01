package defpackage;

/* renamed from: bamr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bamr implements Runnable {
    final /* synthetic */ bamt a;

    public bamr(bamt bamt) {
        this.a = bamt;
    }

    public final void run() {
        bamt bamt = this.a;
        bamt.l.execute(bamt.n);
        synchronized (this.a.j) {
            bamt bamt2 = this.a;
            bamt2.u = Integer.MAX_VALUE;
            bamt2.c();
        }
    }
}
