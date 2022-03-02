package defpackage;

/* renamed from: syc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class syc implements Runnable {
    final /* synthetic */ syd a;

    public syc(syd syd) {
        this.a = syd;
    }

    public final void run() {
        sye sye = this.a.c;
        sye.c = null;
        sye.D();
    }
}
