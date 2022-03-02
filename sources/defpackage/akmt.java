package defpackage;

/* renamed from: akmt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class akmt {
    public static float a(float f, float f2, float f3) {
        double d = (double) f;
        Double.isNaN(d);
        double log = Math.log(d + 1.0E-4d);
        double d2 = (double) f2;
        Double.isNaN(d2);
        return ((float) (log * d2)) + f3;
    }
}
