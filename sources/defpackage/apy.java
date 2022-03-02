package defpackage;

import android.animation.ValueAnimator;

/* renamed from: apy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apy implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ aqa a;
    final /* synthetic */ aqb b;

    public apy(aqb aqb, aqa aqa) {
        this.b = aqb;
        this.a = aqa;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        aqb.a(floatValue, this.a);
        this.b.a(floatValue, this.a, false);
        this.b.invalidateSelf();
    }
}
