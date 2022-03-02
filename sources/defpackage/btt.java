package defpackage;

/* renamed from: btt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class btt implements Runnable {
    final /* synthetic */ bsz a;
    final /* synthetic */ btw b;

    public btt(btw btw, bsz bsz) {
        this.b = btw;
        this.a = bsz;
    }

    public final void run() {
        this.b.d(this.a);
    }
}
