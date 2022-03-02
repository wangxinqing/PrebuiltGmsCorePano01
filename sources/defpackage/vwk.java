package defpackage;

import android.animation.ValueAnimator;

/* renamed from: vwk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vwk implements ValueAnimator.AnimatorUpdateListener {
    private final vwl a;

    public vwk(vwl vwl) {
        this.a = vwl;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        vwl vwl = this.a;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        vwl.c = ((float) vwl.a()) * ((floatValue + floatValue) - 4.0f);
        vwl.invalidateSelf();
    }
}
