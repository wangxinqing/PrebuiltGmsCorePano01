package defpackage;

import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: jgr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jgr extends AccelerateDecelerateInterpolator {
    public final float getInterpolation(float f) {
        return super.getInterpolation(Math.min(1.0f, f + f));
    }
}
