package defpackage;

import android.graphics.Color;

/* renamed from: lk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lk {
    private static final ThreadLocal a = new ThreadLocal();

    public static double a(int i) {
        double d;
        double d2;
        double d3;
        double[] dArr = (double[]) a.get();
        if (dArr == null) {
            dArr = new double[3];
            a.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length == 3) {
            double d4 = (double) red;
            Double.isNaN(d4);
            double d5 = d4 / 255.0d;
            if (d5 >= 0.04045d) {
                d = Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
            } else {
                d = d5 / 12.92d;
            }
            double d6 = (double) green;
            Double.isNaN(d6);
            double d7 = d6 / 255.0d;
            if (d7 >= 0.04045d) {
                d2 = Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
            } else {
                d2 = d7 / 12.92d;
            }
            double d8 = (double) blue;
            Double.isNaN(d8);
            double d9 = d8 / 255.0d;
            if (d9 >= 0.04045d) {
                d3 = Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
            } else {
                d3 = d9 / 12.92d;
            }
            dArr[0] = ((0.4124d * d) + (0.3576d * d2) + (0.1805d * d3)) * 100.0d;
            dArr[1] = ((0.2126d * d) + (0.7152d * d2) + (0.0722d * d3)) * 100.0d;
            dArr[2] = ((d * 0.0193d) + (d2 * 0.1192d) + (d3 * 0.9505d)) * 100.0d;
            return dArr[1] / 100.0d;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static double b(int i) {
        if (Color.alpha(i) == 255) {
            int i2 = -1;
            if (Color.alpha(-1) < 255) {
                i2 = a(-1, i);
            }
            double a2 = a(i2) + 0.05d;
            double a3 = a(i) + 0.05d;
            return Math.max(a2, a3) / Math.min(a2, a3);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i));
    }

    public static int b(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    public static int a(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha) * (255 - alpha2)) / 255);
        return Color.argb(i3, a(Color.red(i), alpha2, Color.red(i2), alpha, i3), a(Color.green(i), alpha2, Color.green(i2), alpha, i3), a(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    public static int a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    private static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 != 0) {
            return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
        }
        return 0;
    }
}
