package defpackage;

import android.animation.ValueAnimator;

/* renamed from: akac  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akac implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ akat a;

    public akac(akat akat) {
        this.a = akat;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        String str = akat.b;
        this.a.e.setTranslationY((float) intValue);
    }
}
