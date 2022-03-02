package defpackage;

/* renamed from: ahok  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahok {
    public final int a;
    public final int b;
    public double[] c;
    public double[] d;
    private final int e;
    private final double f;

    public ahok(int i, double d2, int i2, int i3) {
        this.e = i;
        this.f = d2;
        this.a = i2;
        this.b = i3;
    }

    public final void a() {
        double d2;
        if (this.c == null) {
            double[] dArr = new double[(this.b + 1)];
            double log = Math.log(this.f);
            double log2 = Math.log(1.0d - this.f);
            double d3 = (double) this.e;
            Double.isNaN(d3);
            double d4 = log2 * d3;
            double[] dArr2 = new double[(this.b + 1)];
            double d5 = 0.0d;
            int i = 0;
            double d6 = -1.0E20d;
            while (i <= this.b) {
                double d7 = (double) i;
                Double.isNaN(d7);
                dArr[i] = (d7 * log) + d5 + d4;
                int i2 = i + 1;
                double d8 = (double) (this.e + i);
                double d9 = log;
                double d10 = (double) i2;
                Double.isNaN(d8);
                Double.isNaN(d10);
                d5 += Math.log(d8 / d10);
                d6 = ahof.a(d6, dArr[i]);
                dArr2[i] = d6;
                i = i2;
                log = d9;
            }
            int i3 = this.a;
            if (i3 > 0) {
                d2 = dArr2[i3 - 1];
            } else {
                d2 = -1.0E20d;
            }
            double b2 = ahof.b(d6, d2);
            int i4 = this.b + 1;
            this.c = new double[i4];
            this.d = new double[i4];
            for (int i5 = this.a; i5 <= this.b; i5++) {
                this.c[i5] = dArr[i5] - b2;
                this.d[i5] = ahof.b(d6, d2) - b2;
                d2 = dArr2[i5];
            }
        }
    }
}
