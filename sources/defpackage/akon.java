package defpackage;

import java.util.List;

/* renamed from: akon  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akon {
    public final akuo a;

    public akon(akuo akuo) {
        this.a = akuo;
    }

    public static final float[] a(float[] fArr) {
        int length = fArr.length;
        if (length == 0) {
            return new float[0];
        }
        float[] fArr2 = new float[length];
        float f = fArr[0];
        for (int i = 1; i < length; i++) {
            float f2 = fArr[i];
            if (f2 > f) {
                f = f2;
            }
        }
        float[] fArr3 = new float[length];
        float f3 = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            float exp = (float) Math.exp((double) (fArr[i2] - f));
            fArr3[i2] = exp;
            f3 += exp;
        }
        for (int i3 = 0; i3 < length; i3++) {
            float f4 = fArr3[i3];
            if (f4 == 0.0f) {
                fArr2[i3] = 0.0f;
            } else {
                fArr2[i3] = f4 / f3;
            }
        }
        return fArr2;
    }

    public final float a(long j, float f, float f2, ou ouVar) {
        float f3 = f2 * f;
        Long valueOf = Long.valueOf(j);
        if (ouVar.containsKey(valueOf)) {
            for (akom akom : (List) ouVar.get(valueOf)) {
                akom.c = a(akom.a.h(), f3, akom.c, ouVar);
            }
        }
        return f3;
    }

    public final void a(akom akom, ou ouVar) {
        List<akom> list;
        if (akom != null && (list = (List) ouVar.get(Long.valueOf(akom.a.h()))) != null && list.size() != 0) {
            float f = akom.b;
            for (akom akom2 : list) {
                a(akom2, ouVar);
                float f2 = akom2.b;
                if (f2 > f) {
                    f = f2;
                }
            }
            akom.b = f;
        }
    }
}
