package defpackage;

/* renamed from: ahvm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahvm extends ahvr {
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double[] e;
    private final double[] f;
    private final double[] g;
    private final double[] h;
    private final long i;

    public ahvm(double d2, double d3, double d4, double d5, double[] dArr, double[] dArr2, double[] dArr3, double[] dArr4, long j) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = d5;
        this.e = dArr;
        this.f = dArr2;
        this.g = dArr3;
        this.h = dArr4;
        this.i = j;
    }

    public final void a(ahsr ahsr) {
        ahsr ahsr2 = ahsr;
        ahsr.post(new ahsl(ahsr2, new double[]{this.a, this.b, this.c, this.d}, this.e, this.f, this.g, this.h, this.i));
    }
}
