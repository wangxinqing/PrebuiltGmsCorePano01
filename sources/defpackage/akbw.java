package defpackage;

import android.animation.ValueAnimator;

/* renamed from: akbw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akbw implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ akbx a;

    public akbw(akbx akbx) {
        this.a = akbx;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.m.setScaleX(floatValue);
        this.a.m.setScaleY(floatValue);
    }
}
