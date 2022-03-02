package defpackage;

/* renamed from: bamo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bamo implements Runnable {
    final /* synthetic */ bamt a;

    public bamo(bamt bamt) {
        this.a = bamt;
    }

    public final void run() {
        bamt bamt = this.a;
        bamt.n = new bams(bamt, (banz) null, (bamw) null);
        bamt bamt2 = this.a;
        bamt2.l.execute(bamt2.n);
        synchronized (this.a.j) {
            bamt bamt3 = this.a;
            bamt3.u = Integer.MAX_VALUE;
            bamt3.c();
        }
        throw null;
    }
}
