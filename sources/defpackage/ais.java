package defpackage;

import android.view.animation.Interpolator;

/* renamed from: ais  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class ais implements Interpolator {
    private final float[] a;
    private final float b;

    protected ais(float[] fArr) {
        this.a = fArr;
        this.b = 1.0f / ((float) (fArr.length - 1));
    }

    public final float getInterpolation(float f) {
        float f2 = 1.0f;
        if (f < 1.0f) {
            f2 = 0.0f;
            if (f > 0.0f) {
                int length = this.a.length;
                int min = Math.min((int) (((float) (length - 1)) * f), length - 2);
                float f3 = this.b;
                float[] fArr = this.a;
                float f4 = fArr[min];
                return f4 + (((f - (((float) min) * f3)) / f3) * (fArr[min + 1] - f4));
            }
        }
        return f2;
    }
}
