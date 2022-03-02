package defpackage;

/* renamed from: jtj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jtj {
    public static final int[] a = {1, 2, 3, 6, 7, 8, 9, 10, 14, 15, 17, 18, 20, 24, 25, 26, 27, 31, 55, 36, 43, 45, 46, 48, 52, 57, 59, 60, 10000, 10001, 10002, 10003, 10004, 10005, 10007, 39, 37, 38, 67, 74};

    public static boolean a(int i) {
        for (int i2 : a) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public static atjv b(int i) {
        atjv a2 = atjv.a(i);
        return a2 == null ? atjv.UNKNOWN_CONTEXT_NAME : a2;
    }
}
