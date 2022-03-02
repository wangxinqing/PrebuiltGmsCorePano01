package defpackage;

/* renamed from: ljq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ljq {
    public static int a(int i) {
        return i - 1;
    }

    public static int b(int i) {
        int[] iArr = {1, 2, 3};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            if (i == a(i3)) {
                return i3;
            }
        }
        return 0;
    }
}
