package defpackage;

/* renamed from: ahnd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahnd {
    public static double a(double[] dArr) {
        if (dArr.length == 0) {
            return 0.0d;
        }
        double d = dArr[0];
        double d2 = d;
        for (int i = 1; i < dArr.length; i++) {
            double d3 = dArr[i];
            if (d3 > d) {
                d = d3;
            }
            if (d3 < d2) {
                d2 = d3;
            }
        }
        return d - d2;
    }

    public static float b(double[] dArr) {
        if (dArr.length < 2) {
            return 0.0f;
        }
        int i = 1;
        int i2 = 0;
        while (true) {
            int length = dArr.length;
            if (i >= length - 1) {
                return ((float) i2) / ((float) (length - 2));
            }
            double d = dArr[i - 1];
            double d2 = dArr[i];
            i++;
            if ((d < d2) != (d2 < dArr[i])) {
                i2++;
            }
        }
    }

    public static float b(double[] dArr, double d) {
        if (dArr.length == 0) {
            return 0.0f;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = dArr.length - 1;
            if (i >= length) {
                return ((float) i2) / ((float) length);
            }
            boolean z = true;
            boolean z2 = dArr[i] >= d;
            i++;
            if (dArr[i] < d) {
                z = false;
            }
            if (z2 != z) {
                i2++;
            }
        }
    }

    public static double a(double[] dArr, double d) {
        double d2 = 0.0d;
        for (double d3 : dArr) {
            d2 += Math.abs(d3 - d);
        }
        double length = (double) dArr.length;
        Double.isNaN(length);
        return d2 / length;
    }
}
