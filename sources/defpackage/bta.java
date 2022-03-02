package defpackage;

/* renamed from: bta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bta {
    public static final int[] a = {36, 57, 10007, 18, 15, 14, 43, 1, 2, 3, 48, 31, 55, 17, 52, 60, 91};
    public static final int[] b = {6, 15};
    public static final int[] c = {24, 39, 27, 37, 8, 38, 7};
    public static final int[] d = {46, 10007, 15, 3, 31, 55};
    public static final int[] e = caz.a;
    public static final int[] f = {19};
    public static final int[] g = {20};
    public static final int[] h = {26};
    public static final String[] i;
    private static final String[] j = new String[0];
    private static final String[] k = {"android:monitor_location"};
    private static final String[] l = {"android:fine_location"};
    private static final String[] m = {"android:activity_recognition"};

    static {
        String[] strArr;
        if (jkr.h()) {
            strArr = (String[]) jhx.a((Object[][]) new String[][]{k, m});
        } else {
            strArr = k;
        }
        i = strArr;
    }

    public static boolean a(int i2) {
        return jhx.a(a, i2);
    }

    public static boolean b(int i2) {
        return jhx.a(b, i2);
    }

    public static boolean c(int i2) {
        return jhx.a(c, i2);
    }

    public static boolean d(int i2) {
        return jhx.a(d, i2);
    }

    public static boolean e(int i2) {
        return jhx.a(h, i2);
    }

    public static String[] a(int i2, boolean z) {
        if (i2 == 1 || (awwt.b() && a(i2))) {
            return (!z || !awuz.a.C().W()) ? k : l;
        }
        if (jkr.h() && b(i2)) {
            return m;
        }
        new Object[1][0] = Integer.valueOf(i2);
        return j;
    }
}
