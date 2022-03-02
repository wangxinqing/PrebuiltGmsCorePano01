package defpackage;

/* renamed from: arsd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arsd implements arre {
    public static double a(double d, double d2, double d3) {
        return d - ((d2 * 8.686d) * Math.log(d3 + 1.0d));
    }

    static double a(double d, double d2, double d3, double d4) {
        double d5 = d2;
        double max = Math.max(d5, 0.1d);
        double a = a(d, d2, d3);
        double a2 = a(d - (((d + 75.0d) * (d5 - 2.4d)) / max), 1.8d, d3);
        double exp = 1.0d / (Math.exp((-(d4 + 75.0d)) / 5.0d) + 1.0d);
        double exp2 = (Math.exp((d4 + 54.0d) * 0.067d) * (((a * exp) + ((1.0d - exp) * a2)) - d4)) / 8.5d;
        return -(Math.log((((exp2 * exp2) / 2.0d) / 0.81d) + 1.0d) * 0.81d);
    }

    public final double a(double d, double d2, arpu arpu) {
        arpu arpu2 = arpu;
        double a = a((double) arpu2.c, (double) arpu2.d, aell.a(d, d2, arpu2.j, arpu2.k), (double) arpu2.f);
        double a2 = (double) ((float) a((double) arpu2.c, (double) arpu2.d, 100.0d, (double) arpu2.f));
        Double.isNaN(a2);
        return a - a2;
    }
}
