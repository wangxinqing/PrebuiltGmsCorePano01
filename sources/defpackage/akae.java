package defpackage;

import android.animation.ValueAnimator;

/* renamed from: akae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akae implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ akat a;

    public akae(akat akat) {
        this.a = akat;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        String str = akat.b;
        this.a.e.setTranslationY((float) intValue);
    }
}
