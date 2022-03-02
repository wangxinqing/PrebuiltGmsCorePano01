package defpackage;

/* renamed from: bafm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bafm implements Runnable {
    final /* synthetic */ bafr a;
    final /* synthetic */ bajq b;

    public bafm(bafr bafr, bajq bajq) {
        this.a = bafr;
        this.b = bajq;
    }

    public final void run() {
        this.a.a.a(this.b);
    }
}
