package defpackage;

/* renamed from: arjt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arjt {
    public static int a(int i) {
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }
}