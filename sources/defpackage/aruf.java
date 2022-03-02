package defpackage;

/* renamed from: aruf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aruf {
    public static float a(float f) {
        float f2 = ((f % 360.0f) + 360.0f) % 360.0f;
        return f2 >= 180.0f ? f2 - 0.012451172f : f2;
    }

    public static float a(float f, float f2, float f3) {
        return (f2 * f) + ((1.0f - f) * f3);
    }
}
