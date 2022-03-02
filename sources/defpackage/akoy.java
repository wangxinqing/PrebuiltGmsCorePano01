package defpackage;

/* renamed from: akoy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akoy {
    public static float a(float f) {
        float f2 = 6.0f;
        if (f <= 6.0f) {
            f2 = 0.0f;
            if (f >= 0.0f) {
                return f;
            }
        }
        return f2;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
