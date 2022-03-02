package defpackage;

/* renamed from: ahsq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahsq implements Runnable {
    private final ahsr a;
    private final int b;
    private final int c;

    public ahsq(ahsr ahsr, int i, int i2) {
        this.a = ahsr;
        this.b = i;
        this.c = i2;
    }

    public final void run() {
        ahsr ahsr = this.a;
        ahsr.a.a(this.b, this.c);
    }
}
