package defpackage;

import android.animation.ValueAnimator;

/* renamed from: akaa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akaa implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ akat a;

    public akaa(akat akat) {
        this.a = akat;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.e.setScaleX(floatValue);
        this.a.e.setScaleY(floatValue);
    }
}
