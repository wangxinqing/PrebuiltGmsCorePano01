package defpackage;

import com.android.volley.toolbox.ImageLoader;

/* renamed from: adfh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adfh {
    public static ImageLoader a;

    public static double a(String str) {
        int max = Math.max(str.lastIndexOf(45), str.lastIndexOf(95));
        int i = max - 1;
        try {
            String substring = str.substring(Math.max(str.lastIndexOf(45, i), str.lastIndexOf(95, i)) + 1, max);
            int indexOf = substring.indexOf(120);
            int parseInt = Integer.parseInt(substring.substring(0, indexOf));
            int parseInt2 = Integer.parseInt(substring.substring(indexOf + 1));
            if (parseInt2 != 0) {
                return (double) (((float) parseInt) / ((float) parseInt2));
            }
            return 2.0d;
        } catch (Exception e) {
            return 2.0d;
        }
    }

    public static int a(int i, double d, int i2) {
        if (d == 0.0d || i2 == 0) {
            return 0;
        }
        double d2 = (double) i;
        Double.isNaN(d2);
        double d3 = d2 * d;
        double d4 = (double) i2;
        if (d3 <= d4) {
            Double.isNaN(d4);
            if (d3 / d4 < azrb.a.a().e()) {
                return 0;
            }
            return i;
        }
        Double.isNaN(d4);
        return (int) (d4 / d);
    }
}
