package defpackage;

import android.animation.ValueAnimator;

/* renamed from: akbv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akbv implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ akbx a;

    public akbv(akbx akbx) {
        this.a = akbx;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.m.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
