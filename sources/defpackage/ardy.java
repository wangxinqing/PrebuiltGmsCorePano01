package defpackage;

import java.lang.reflect.Array;
import java.util.concurrent.TimeUnit;

/* renamed from: ardy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ardy {
    private static final double a = (-Math.log10(1.0E-11d));
    private static final double[][] b;
    private static final double[][] c;
    private static final long d = TimeUnit.MINUTES.toMillis(10);
    private static final long e = TimeUnit.MINUTES.toMillis(5);

    static {
        Class<double> cls = double.class;
        int length = ardv.b.length;
        int[] iArr = new int[2];
        iArr[1] = ardv.b.length;
        iArr[0] = length;
        b = (double[][]) Array.newInstance(cls, iArr);
        int length2 = ardv.b.length;
        int[] iArr2 = new int[2];
        iArr2[1] = ardv.b.length;
        iArr2[0] = length2;
        c = (double[][]) Array.newInstance(cls, iArr2);
        for (int i : ardv.b) {
            for (int i2 : ardv.b) {
                b[i][i2] = 1.0E-4d;
                c[i][i2] = 1.0E-4d;
            }
        }
        a(0, 1);
        a(2, 3);
        b(0, 1);
        b(1, 0);
        b(2, 3);
        b(3, 2);
        double[][] dArr = b;
        dArr[4][0] = 0.05d;
        dArr[4][3] = 0.001d;
        dArr[4][2] = 0.01d;
        dArr[4][4] = 0.7d;
        dArr[4][5] = 0.15d;
        dArr[4][6] = 0.15d;
        dArr[4][7] = 0.1d;
        dArr[5][0] = 0.05d;
        dArr[5][3] = 0.001d;
        dArr[5][2] = 0.01d;
        dArr[5][4] = 0.2d;
        dArr[5][5] = 0.6d;
        dArr[5][6] = 0.2d;
        dArr[5][7] = 0.1d;
        dArr[6][0] = 0.02d;
        dArr[6][3] = 0.001d;
        dArr[6][2] = 0.01d;
        dArr[6][4] = 0.15d;
        dArr[6][5] = 0.1d;
        dArr[6][6] = 0.7d;
        dArr[6][7] = 0.05d;
        dArr[7][0] = 0.005d;
        dArr[7][3] = 0.001d;
        dArr[7][2] = 0.003d;
        dArr[7][4] = 0.15d;
        dArr[7][5] = 0.1d;
        dArr[7][6] = 0.25d;
        dArr[7][7] = 0.5d;
        for (int i3 : ardv.b) {
            if (!ardv.a(i3)) {
                for (int i4 : ardv.b) {
                    if (i3 != i4) {
                        c[i3][i4] = b[i3][i4] + 0.1d;
                    } else {
                        c[i3][i4] = b[i3][i4];
                    }
                }
            }
        }
        a(b);
        a(c);
    }

    public static double a(int i, int i2, boolean z, long j) {
        if (z) {
            return c[i][i2];
        }
        return (i2 == i && ((i == 1 && j > d) || (i == 3 && j > e))) ? a : b[i][i2];
    }

    private static void b(int i, int i2) {
        double[][] dArr = c;
        dArr[i][i] = 0.8d;
        int i3 = 3;
        if (i == 1 || i == 3) {
            c[i][i2] = 0.8d;
        } else {
            dArr[i][i2] = 0.2d;
        }
        if (i == 0 || i == 1) {
            double[][] dArr2 = c;
            dArr2[i][2] = 0.002d;
            dArr2[i][3] = 0.002d;
        } else {
            if (i == 2) {
                i3 = i;
            }
            double[][] dArr3 = c;
            dArr3[i3][0] = 0.002d;
            dArr3[i3][1] = 0.002d;
        }
        double[][] dArr4 = c;
        dArr4[i][4] = 0.25d;
        dArr4[i][5] = 0.04d;
        dArr4[i][6] = 0.2d;
        dArr4[i][7] = 0.02d;
    }

    private static void a(int i, int i2) {
        double[][] dArr = b;
        dArr[i][i] = 0.8d;
        dArr[i][i2] = 0.2d;
        dArr[i][4] = 0.001d;
        dArr[i][5] = 0.001d;
        dArr[i2][i2] = 0.8d;
        dArr[i2][i] = 0.8d;
        dArr[i2][4] = 0.001d;
        dArr[i2][5] = 0.001d;
    }

    private static void a(double[][] dArr) {
        for (int i : ardv.b) {
            double d2 = 0.0d;
            for (double d3 : dArr[i]) {
                d2 += d3;
            }
            for (int i2 : ardv.b) {
                double[] dArr2 = dArr[i];
                dArr2[i2] = -Math.log10(dArr2[i2] / d2);
            }
        }
    }
}
