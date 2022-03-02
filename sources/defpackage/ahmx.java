package defpackage;

import java.lang.reflect.Array;

/* renamed from: ahmx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahmx {
    public static double a(double d, double[] dArr) {
        double length = (double) (dArr.length - 1);
        Double.isNaN(length);
        return dArr[(int) ((d * length) + 0.5d)];
    }

    public static double b(double[] dArr) {
        double a = a(dArr);
        return c(dArr) - (a * a);
    }

    public static double c(double[] dArr) {
        double d = d(dArr);
        double length = (double) dArr.length;
        Double.isNaN(length);
        return d / length;
    }

    public static double d(double[] dArr) {
        double d = 0.0d;
        for (double d2 : dArr) {
            d += d2 * d2;
        }
        return d;
    }

    public static double e(double[] dArr) {
        int i = 4;
        double d = 0.0d;
        while (i < dArr.length) {
            double d2 = dArr[i] - dArr[i - 4];
            d += d2 * d2;
            i += 4;
        }
        double d3 = (double) ((i >> 2) - 1);
        Double.isNaN(d3);
        return d / d3;
    }

    public static double a(double[] dArr) {
        double d = 0.0d;
        for (double d2 : dArr) {
            d += d2;
        }
        double length = (double) dArr.length;
        Double.isNaN(length);
        return d / length;
    }

    @Deprecated
    public static void a(double[] dArr, double d, double[] dArr2) {
        boolean z;
        int round = (int) Math.round(d * 128.0d);
        for (int i = 0; i < 3; i++) {
            int length = dArr.length;
            if (dArr2.length >= length + 1) {
                z = true;
            } else {
                z = false;
            }
            ativ.b(z);
            double d2 = 0.0d;
            for (int i2 = 0; i2 < length; i2++) {
                dArr2[i2] = d2;
                d2 += dArr[i2];
            }
            dArr2[length] = d2;
            for (int i3 = 0; i3 < length; i3++) {
                int max = Math.max(i3 - round, 0);
                int min = Math.min(i3 + round, length - 1);
                double d3 = dArr2[min + 1] - dArr2[max];
                double d4 = (double) ((min - max) + 1);
                Double.isNaN(d4);
                dArr[i3] = d3 / d4;
            }
        }
    }

    public static double[][] a(ahyq ahyq, double d) {
        double d2 = d * 1.0E-9d;
        double a = (double) (ahyq.a(ahyq.b - 1) - ahyq.a(0));
        Double.isNaN(a);
        int i = (int) (a * d2);
        if (i == 0) {
            i = 1;
        }
        return a(ahyq, d2, i);
    }

    public static double[][] a(ahyq ahyq, double d, int i) {
        int i2;
        ahyq ahyq2 = ahyq;
        int i3 = i;
        int[] iArr = new int[2];
        iArr[1] = i3;
        int i4 = 0;
        iArr[0] = 3;
        double[][] dArr = (double[][]) Array.newInstance(double.class, iArr);
        long a = ahyq2.a(0);
        int i5 = 0;
        for (int i6 = 3; i5 < i6; i6 = 3) {
            dArr[i5][i4] = (double) ahyq2.a(i4, i5);
            int i7 = 1;
            int i8 = 0;
            while (i7 < i3) {
                double d2 = (double) a;
                double d3 = (double) i7;
                Double.isNaN(d3);
                Double.isNaN(d2);
                double d4 = d2 + (d3 / d);
                while (true) {
                    i2 = i8 + 1;
                    if (d4 <= ((double) ahyq2.a(i2))) {
                        break;
                    }
                    double[][] dArr2 = dArr;
                    long j = a;
                    int i9 = i5;
                    int i10 = i;
                    i8 = i2;
                }
                long a2 = ahyq2.a(i8);
                long a3 = ahyq2.a(i2);
                double[] dArr3 = dArr[i5];
                double a4 = (double) ahyq2.a(i8, i5);
                double d5 = (double) a3;
                Double.isNaN(d5);
                Double.isNaN(a4);
                double d6 = a4 * (d5 - d4);
                double a5 = (double) ahyq2.a(i2, i5);
                double d7 = (double) a2;
                Double.isNaN(d7);
                Double.isNaN(a5);
                double d8 = d6 + (a5 * (d4 - d7));
                double d9 = (double) (a3 - a2);
                Double.isNaN(d9);
                dArr3[i7] = d8 / d9;
                i7++;
                i3 = i;
                a = a;
                i5 = i5;
                dArr = dArr;
            }
            double[][] dArr4 = dArr;
            long j2 = a;
            i5++;
            i3 = i;
            i4 = 0;
        }
        return dArr;
    }
}
