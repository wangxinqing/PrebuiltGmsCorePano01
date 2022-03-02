package defpackage;

import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: jgp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jgp extends AccelerateDecelerateInterpolator {
    public final float getInterpolation(float f) {
        float f2 = f - 8.0f;
        return super.getInterpolation(Math.max(0.0f, f2 + f2));
    }
}
