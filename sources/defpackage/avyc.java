package defpackage;

/* renamed from: avyc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avyc {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    public static int a(int i) {
        int[] iArr = b;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    public static avxz a(int i, avxv avxv) {
        for (int i2 = 1; i2 <= 40; i2++) {
            avxz a2 = avxz.a(i2);
            if (a2.b - a2.a(avxv).b() >= (i + 7) / 8) {
                return a2;
            }
        }
        throw new avxp("Data too big");
    }
}
