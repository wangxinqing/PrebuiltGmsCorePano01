package defpackage;

/* renamed from: soq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class soq implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ sor b;

    public soq(sor sor, long j) {
        this.b = sor;
        this.a = j;
    }

    public final void run() {
        this.b.b(this.a);
    }
}
