package defpackage;

import java.util.Arrays;

/* renamed from: aqjf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqjf {
    public static double a(double[] dArr) {
        double d = 0.0d;
        for (double d2 : dArr) {
            d += d2;
        }
        return d;
    }

    public static void b(double[] dArr) {
        double a = a(dArr);
        if (a >= 1.0E-100d) {
            double d = 1.0d / a;
            for (int i = 0; i < dArr.length; i++) {
                dArr[i] = dArr[i] * d;
            }
            return;
        }
        c(dArr);
    }

    public static void c(double[] dArr) {
        int length;
        if (dArr != null && (length = dArr.length) > 0) {
            double d = (double) length;
            Double.isNaN(d);
            Arrays.fill(dArr, 1.0d / d);
        }
    }
}
