package defpackage;

import android.animation.ValueAnimator;

/* renamed from: ajzz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajzz implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ akat a;

    public ajzz(akat akat) {
        this.a = akat;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.e.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
