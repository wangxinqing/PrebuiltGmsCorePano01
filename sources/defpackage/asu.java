package defpackage;

import android.animation.TypeEvaluator;

/* renamed from: asu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asu implements TypeEvaluator {
    private ln[] a;

    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        int i;
        ln[] lnVarArr = (ln[]) obj;
        ln[] lnVarArr2 = (ln[]) obj2;
        if (lo.a(lnVarArr, lnVarArr2)) {
            if (!lo.a(this.a, lnVarArr)) {
                this.a = lo.a(lnVarArr);
                i = 0;
            } else {
                i = 0;
            }
            while (i < lnVarArr.length) {
                ln lnVar = this.a[i];
                ln lnVar2 = lnVarArr[i];
                ln lnVar3 = lnVarArr2[i];
                lnVar.a = lnVar2.a;
                int i2 = 0;
                while (true) {
                    float[] fArr = lnVar2.b;
                    if (i2 >= fArr.length) {
                        break;
                    }
                    lnVar.b[i2] = (fArr[i2] * (1.0f - f)) + (lnVar3.b[i2] * f);
                    i2++;
                }
                i++;
            }
            return this.a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
