package defpackage;

import android.animation.ValueAnimator;

/* renamed from: aenz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aenz implements ValueAnimator.AnimatorUpdateListener {
    private final aemw a;

    public aenz(aemw aemw) {
        this.a = aemw;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a(valueAnimator.getAnimatedFraction());
    }
}
