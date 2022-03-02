package defpackage;

/* renamed from: ahsl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahsl implements Runnable {
    private final ahsr a;
    private final double[] b;
    private final double[] c;
    private final double[] d;
    private final double[] e;
    private final double[] f;
    private final long g;

    public ahsl(ahsr ahsr, double[] dArr, double[] dArr2, double[] dArr3, double[] dArr4, double[] dArr5, long j) {
        this.a = ahsr;
        this.b = dArr;
        this.c = dArr2;
        this.d = dArr3;
        this.e = dArr4;
        this.f = dArr5;
        this.g = j;
    }

    public final void run() {
        ahsr ahsr = this.a;
        ahsr.a.a(this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
