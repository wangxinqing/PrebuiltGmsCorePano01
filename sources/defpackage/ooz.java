package defpackage;

/* renamed from: ooz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ooz {
    public static int a(String str) {
        int parseInt = Integer.parseInt(str);
        int[] iArr = {1, 2, 3, 4, 5, 6, 52};
        int i = 0;
        while (i < 7) {
            int i2 = iArr[i];
            int i3 = i2 - 2;
            if (i2 == 0) {
                throw null;
            } else if (i3 == parseInt) {
                return i2;
            } else {
                i++;
            }
        }
        return 1;
    }
}
