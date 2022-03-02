package defpackage;

/* renamed from: bafp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bafp implements Runnable {
    final /* synthetic */ babj a;
    final /* synthetic */ baaf b;
    final /* synthetic */ bafr c;

    public bafp(bafr bafr, babj babj, baaf baaf) {
        this.c = bafr;
        this.a = babj;
        this.b = baaf;
    }

    public final void run() {
        this.c.a.b(this.a, this.b);
    }
}
