package defpackage;

import android.animation.ValueAnimator;

/* renamed from: aeny  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aeny implements ValueAnimator.AnimatorUpdateListener {
    private final uw a;

    public aeny(uw uwVar) {
        this.a = uwVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a(valueAnimator.getAnimatedFraction());
    }
}
