package defpackage;

import android.view.animation.Interpolator;

/* renamed from: att  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class att implements Interpolator {
    public final float getInterpolation(float f) {
        float f2 = f - 4.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
