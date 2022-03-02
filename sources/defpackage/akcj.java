package defpackage;

import android.animation.ValueAnimator;

/* renamed from: akcj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akcj implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ akck a;

    public akcj(akck akck) {
        this.a = akck;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.m.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
