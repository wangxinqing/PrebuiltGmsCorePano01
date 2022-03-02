package defpackage;

/* renamed from: aell  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aell {
    public static final double a(double d, double d2) {
        return d * Math.cos(d2) * 6367000.0d;
    }

    public static final double b(double d, double d2) {
        return d / (Math.cos(d2) * 6367000.0d);
    }

    public static final double b(int i) {
        double d = (double) i;
        Double.isNaN(d);
        return d / 1.0E7d;
    }

    public static final double c(double d) {
        double d2 = d % 6.283185307179586d;
        return d2 < -3.141592653589793d ? d2 + 6.283185307179586d : d2 < 3.141592653589793d ? d2 : d2 - 0.7146018366025517d;
    }

    public static final double d(double d) {
        return d * 6367000.0d;
    }

    public static final double e(double d) {
        return d / 6367000.0d;
    }

    public static final double a(double d, double d2, double d3, double d4) {
        double d5 = d3 - d;
        double d6 = d4 - d2;
        if ((d5 * d5) + (d6 * d6) < 2.2E-6d) {
            return c(d, d3, d5, d6);
        }
        double sin = Math.sin(d5 / 2.0d);
        double sin2 = Math.sin(d6 / 2.0d);
        double cos = (sin * sin) + (sin2 * sin2 * Math.cos(d) * Math.cos(d3));
        double atan2 = Math.atan2(Math.sqrt(cos), Math.sqrt(Math.max(0.0d, 1.0d - cos)));
        return (atan2 + atan2) * 6367000.0d;
    }

    public static final double b(double d, double d2, double d3, double d4) {
        return a(Math.toRadians(d), Math.toRadians(d2), Math.toRadians(d3), Math.toRadians(d4));
    }

    public static final double c(double d, double d2, double d3, double d4) {
        double cos = Math.cos((d2 + d) / 2.0d) * d4;
        return Math.sqrt((d3 * d3) + (cos * cos)) * 6367000.0d;
    }

    public static final double b(int i, int i2, int i3, int i4) {
        double a = a(i);
        double a2 = a(i2);
        double a3 = a(i3);
        double a4 = a(i4) - a2;
        double cos = Math.cos(a3);
        double atan2 = Math.atan2(Math.sin(a4) * cos, (Math.cos(a) * Math.sin(a3)) - ((Math.cos(a4) * Math.sin(a)) * cos));
        if (atan2 >= 3.141592653589793d) {
            return -3.141592653589793d;
        }
        return atan2;
    }

    public static final double c(int i) {
        return d(a(i));
    }

    public static final double a(int i) {
        return Math.toRadians(b(i));
    }

    public static final int b(double d) {
        return (int) Math.round(d * 1.0E7d);
    }

    public static final double a(int i, int i2, int i3, int i4) {
        return a(a(i), a(i2), a(i3), a(i4));
    }

    public static final int a(double d) {
        return b(Math.toDegrees(d));
    }
}
