package defpackage;

/* renamed from: ahof  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahof {
    public static double a(double d, double d2) {
        double max = Math.max(d, d2);
        if (max > -1.0E20d) {
            return max + Math.log(Math.exp(d - max) + Math.exp(d2 - max));
        }
        return -1.0E20d;
    }

    public static double b(double d, double d2) {
        if (d < d2) {
            return Double.NaN;
        }
        if (d2 <= -1.0E20d) {
            return d;
        }
        if (d != d2) {
            return d + Math.log(1.0d - Math.exp(d2 - d));
        }
        return -1.0E20d;
    }
}
