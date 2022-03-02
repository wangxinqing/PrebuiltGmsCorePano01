package defpackage;

/* renamed from: eal  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eal {
    public static float a(float f, float f2, float f3) {
        return f >= f2 ? f <= f3 ? f : f3 : f2;
    }

    public static int a(int i, int i2) {
        if (i < 0) {
            return 0;
        }
        return i > i2 ? i2 : i;
    }
}
