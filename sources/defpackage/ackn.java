package defpackage;

/* renamed from: ackn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ackn implements Runnable {
    final /* synthetic */ ackp a;

    public ackn(ackp ackp) {
        this.a = ackp;
    }

    public final void run() {
        ackp ackp = this.a;
        ackp.c = null;
        ackp.b();
        this.a.a.b();
    }
}
