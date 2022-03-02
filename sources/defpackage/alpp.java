package defpackage;

/* renamed from: alpp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alpp implements Runnable {
    final /* synthetic */ alpq a;

    public alpp(alpq alpq) {
        this.a = alpq;
    }

    public final void run() {
        alpq alpq = this.a;
        alqg alqg = new alqg(alpq.d, alpq.i.a);
        alqg.d = this.a.c;
        alqg.a();
    }
}
