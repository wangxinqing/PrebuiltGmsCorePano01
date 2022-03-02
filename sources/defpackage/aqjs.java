package defpackage;

/* renamed from: aqjs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqjs {
    public static double a(long j) {
        double d = (double) j;
        Double.isNaN(d);
        return d / 1.0E9d;
    }

    public static double b(long j) {
        double d = (double) j;
        Double.isNaN(d);
        return d / 1000.0d;
    }

    public static long a(double d) {
        return Math.round(d * 1.0E9d);
    }

    public static long b(double d) {
        return Math.round(d * 1000.0d);
    }
}
