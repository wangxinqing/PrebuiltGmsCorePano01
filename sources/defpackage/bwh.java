package defpackage;

/* renamed from: bwh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bwh implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ long b;
    final /* synthetic */ bvp c;
    final /* synthetic */ bwn d;

    public bwh(bwn bwn, Runnable runnable, long j, bvp bvp) {
        this.d = bwn;
        this.a = runnable;
        this.b = j;
        this.c = bvp;
    }

    public final void run() {
        this.d.d.a(this.a, this.b, this.c);
    }
}
