package defpackage;

/* renamed from: bafq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bafq implements Runnable {
    final /* synthetic */ babj a;
    final /* synthetic */ baeg b;
    final /* synthetic */ baaf c;
    final /* synthetic */ bafr d;

    public bafq(bafr bafr, babj babj, baeg baeg, baaf baaf) {
        this.d = bafr;
        this.a = babj;
        this.b = baeg;
        this.c = baaf;
    }

    public final void run() {
        this.d.a.a(this.a, this.b, this.c);
    }
}
