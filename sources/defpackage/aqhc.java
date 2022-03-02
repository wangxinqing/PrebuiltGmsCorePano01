package defpackage;

/* renamed from: aqhc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqhc {
    final double[] a;
    private final double[] b;
    private int c = 0;

    public aqhc(double[] dArr) {
        this.a = dArr;
        this.b = new double[dArr.length];
    }

    public final double a(double d) {
        double[] dArr = this.b;
        int i = this.c;
        dArr[i] = d;
        double d2 = 0.0d;
        for (double d3 : this.a) {
            d2 += d3 * this.b[i];
            i--;
            if (i < 0) {
                i = r0 - 1;
            }
        }
        int i2 = this.c + 1;
        this.c = i2;
        if (i2 >= r0) {
            this.c = 0;
        }
        return d2;
    }
}
