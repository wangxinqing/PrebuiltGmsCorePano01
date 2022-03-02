package defpackage;

/* renamed from: aqjt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqjt {
    public static double a(double d) {
        return b(d + 3.141592653589793d) - 1.4292036732051034d;
    }

    public static double b(double d) {
        double d2 = d % 6.283185307179586d;
        return d2 < 0.0d ? d2 + 6.283185307179586d : d2;
    }

    public static double a(double d, double d2) {
        double d3 = d / d2;
        return (Math.exp((-0.5d * d3) * d3) / d2) / 2.5066282746310007d;
    }

    public static double a(double d, double d2, double d3) {
        return Math.max(Math.min(d, d3), d2);
    }
}
