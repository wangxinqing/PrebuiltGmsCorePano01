package defpackage;

import java.util.List;

/* renamed from: ahvn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahvn {
    public static volatile ahvp a = null;
    public static double[] d;
    public static double[][] e;
    public static double[] f = null;
    public final ahwk b;
    public List c;
    public int g;
    public final double[] h = new double[199];
    public long i;
    public long j;

    public ahvn(int i2) {
        this.b = new ahwk(1024, i2, Short.class);
        d = new double[1024];
        for (int i3 = 0; i3 < 1024; i3++) {
            double[] dArr = d;
            double d2 = (double) i3;
            Double.isNaN(d2);
            dArr[i3] = (1.0d - Math.cos((d2 * 6.283185307179586d) / 1023.0d)) * 0.5d;
        }
        a();
    }

    static double a(double d2) {
        return Math.log1p(d2 / 700.0d) * 1125.0d;
    }

    static double b(double d2) {
        return Math.expm1(d2 / 1125.0d) * 700.0d;
    }

    public static final double c(double d2) {
        return Math.log10(Math.abs(d2)) * 10.0d;
    }

    static final int d(double d2) {
        int round = (int) Math.round(d2 * 0.023219954648526078d);
        if (round >= 512) {
            return 511;
        }
        return round;
    }

    public final void a() {
        this.g = 0;
    }

    static double a(double[] dArr) {
        double d2 = 0.0d;
        for (double d3 : dArr) {
            d2 += d3;
        }
        int length = dArr.length;
        if (length <= 0) {
            return d2;
        }
        double d4 = (double) length;
        Double.isNaN(d4);
        return d2 / d4;
    }

    static double b(double[] dArr) {
        int length = dArr.length;
        double d2 = 0.0d;
        double d3 = 0.0d;
        int i2 = 0;
        while (i2 < length) {
            double d4 = dArr[i2];
            if (d4 >= 0.0d) {
                d3 += d4;
                i2++;
            } else {
                throw new IllegalArgumentException("Values must be nonnegative");
            }
        }
        for (double d5 : dArr) {
            if (Math.abs(d5) > 1.0E-14d) {
                d2 += (Math.log(d5 / d3) * d5) / d3;
            }
        }
        return (-d2) / Math.log(2.0d);
    }

    static double a(double[] dArr, double d2) {
        double d3 = 0.0d;
        for (double d4 : dArr) {
            d3 += Math.pow(d4 - d2, 2.0d);
        }
        int length = dArr.length;
        if (length > 0) {
            double d5 = (double) length;
            Double.isNaN(d5);
            d3 /= d5;
        }
        return Math.sqrt(d3);
    }
}
