package defpackage;

import android.graphics.Color;

/* renamed from: akyq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akyq {
    private static double a(double d) {
        return d > 0.03928d ? Math.pow((d + 0.055d) / 1.055d, 2.4d) : d / 12.92d;
    }

    private static double a(double d, double d2) {
        double round = (double) Math.round(((Math.max(d, d2) + 0.05d) / (Math.min(d, d2) + 0.05d)) * 100.0d);
        Double.isNaN(round);
        return round / 100.0d;
    }

    private static double a(int i) {
        double red = (double) Color.red(i);
        Double.isNaN(red);
        double green = (double) Color.green(i);
        Double.isNaN(green);
        double a = (a(red / 255.0d) * 0.2126d) + (a(green / 255.0d) * 0.7152d);
        double blue = (double) Color.blue(i);
        Double.isNaN(blue);
        return a + (a(blue / 255.0d) * 0.0722d);
    }

    public static int a(int i, int i2, int i3) {
        double a = a(i);
        double a2 = a(a(i2), a);
        return (a2 > 3.0d || a2 > a(a(i3), a)) ? i2 : i3;
    }
}
