package defpackage;

/* renamed from: akot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akot {
    static double a(double d) {
        if (d < 0.0d) {
            return 0.0d;
        }
        return d;
    }

    static float a(int i) {
        return i != 2 ? 1.0f : 0.1f;
    }

    public static double a(akov akov, aklx aklx, int i) {
        float f;
        float a = a(i);
        float f2 = akov.a;
        float f3 = a + f2;
        if (f3 > 15.0f) {
            f = (15.0f - a) / f2;
            f3 = 15.0f;
        } else {
            f = 1.0f;
        }
        aklx a2 = aklx.a(aklx.b(aklx, akov.c), (double) a);
        double d = (double) f3;
        aklx b = aklx.b(aklx.a(aklx.a(akov.e, (double) f), aklx.c(a2, aklx.b(aklx, aklx.a(akov.c, aklx.b(a2, d))))), d);
        return Math.sqrt(a(b.a) + a(b.b) + a(b.c));
    }
}
