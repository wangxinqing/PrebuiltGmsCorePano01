package defpackage;

/* renamed from: ashz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ashz implements Runnable {
    final /* synthetic */ asig a;
    private final asif b;

    public ashz(asig asig, asif asif) {
        this.a = asig;
        this.b = asif;
    }

    public final void run() {
        this.a.e.add(this.b);
        asig asig = this.a;
        asig.b.post(asig.g);
        this.a.d.c(this.b, this);
    }
}
