package defpackage;

import android.animation.ValueAnimator;

/* renamed from: aar  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aar implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ aas a;

    public aar(aas aas) {
        this.a = aas;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        this.a.b.setAlpha(floatValue);
        this.a.c.setAlpha(floatValue);
        this.a.a();
    }
}
