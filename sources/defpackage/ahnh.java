package defpackage;

/* renamed from: ahnh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahnh {
    public static double a(double d, double d2) {
        return Math.toDegrees(Math.atan2(d, d2));
    }

    public static double a(double d, double d2, double d3) {
        return Math.toDegrees(Math.atan2(-d2, Math.sqrt((d * d) + (d3 * d3))));
    }

    public static double a(double[] dArr, int i, int i2) {
        double d = 0.0d;
        for (int i3 = i; i3 < i2; i3++) {
            d += dArr[i3];
        }
        double d2 = (double) (i2 - i);
        Double.isNaN(d2);
        return d / d2;
    }

    public static float[] a(double[] dArr) {
        double d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        for (double d4 : dArr) {
            d2 += d4;
            d3 += d4 * d4;
        }
        int length = dArr.length;
        double d5 = (double) length;
        Double.isNaN(d5);
        double d6 = d2 / d5;
        if (length != 0) {
            Double.isNaN(d5);
            d = (d3 - (d2 * d6)) / d5;
        } else {
            d = Double.NaN;
        }
        return new float[]{(float) d6, (float) d};
    }
}
