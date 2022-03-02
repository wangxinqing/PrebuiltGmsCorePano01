package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* renamed from: vuo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vuo implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ Drawable a;
    final /* synthetic */ vup b;
    private float c = -1.0f;

    public vuo(vup vup, Drawable drawable) {
        this.b = vup;
        this.a = drawable;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        if (animatedFraction < this.c) {
            this.b.a(this.a);
        } else {
            this.c = animatedFraction;
        }
    }
}
