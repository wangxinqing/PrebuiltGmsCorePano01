package defpackage;

/* renamed from: guq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class guq {
    public static int a(double d) {
        if (d < 0.0d) {
            return -1;
        }
        if (d > 0.5d) {
            return d > 2.0d ? 2 : 1;
        }
        return 0;
    }

    public static int a(int i, int i2) {
        return (i2 + 41) - i;
    }

    public static double b(int i, int i2) {
        double d = (double) (i2 - i);
        Double.isNaN(d);
        return Math.pow(10.0d, d / 20.0d);
    }

    public static int a(double d, int i) {
        if (d == 0.0d) {
            return i + 41;
        }
        double d2 = (double) i;
        Double.isNaN(d2);
        return (int) (d2 - (Math.log10(d) * 20.0d));
    }
}
