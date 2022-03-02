package defpackage;

/* renamed from: aqhe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqhe {
    private static final aqhg a = aqhg.a();

    public static void a(double d, aqhh aqhh, aqhg aqhg) {
        aqhh aqhh2 = aqhh;
        double a2 = aqhh.a();
        if (a2 < 1.0E-99d) {
            a.a(aqhg);
            return;
        }
        aqhg aqhg2 = aqhg;
        double d2 = d / 2.0d;
        double sin = Math.sin(d2) / a2;
        double d3 = aqhh2.c * sin;
        double d4 = aqhh2.d * sin;
        double cos = Math.cos(d2);
        aqhg.a(d3, d4, sin * aqhh2.e, cos);
    }

    public static void a(float[] fArr, float[] fArr2) {
        boolean z;
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        if (fArr3.length == 9) {
            z = true;
        } else {
            z = false;
        }
        ativ.b(z, "Rotation Matrix should be of size 9.");
        float f = fArr4[0];
        float f2 = fArr4[1];
        float f3 = fArr4[2];
        float f4 = 0.0f;
        if (fArr4.length < 4) {
            float f5 = ((1.0f - (f * f)) - (f2 * f2)) - (f3 * f3);
            if (f5 > 0.0f) {
                f4 = (float) Math.sqrt((double) f5);
            }
        } else {
            f4 = fArr4[3];
        }
        float f6 = f + f;
        float f7 = f2 + f2;
        float f8 = f7 * f2;
        float f9 = f3 + f3;
        float f10 = f9 * f3;
        float f11 = f2 * f6;
        float f12 = f9 * f4;
        float f13 = f6 * f3;
        float f14 = f7 * f4;
        float f15 = f7 * f3;
        float f16 = f4 * f6;
        fArr3[0] = (1.0f - f8) - f10;
        fArr3[1] = f11 - f12;
        fArr3[2] = f13 + f14;
        fArr3[3] = f11 + f12;
        float f17 = 1.0f - (f6 * f);
        fArr3[4] = f17 - f10;
        fArr3[5] = f15 - f16;
        fArr3[6] = f13 - f14;
        fArr3[7] = f15 + f16;
        fArr3[8] = f17 - f8;
    }
}
