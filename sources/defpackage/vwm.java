package defpackage;

import android.animation.ValueAnimator;

/* renamed from: vwm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vwm implements ValueAnimator.AnimatorUpdateListener {
    private final vwn a;

    public vwm(vwn vwn) {
        this.a = vwn;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        vwn vwn = this.a;
        vwn.onLevelChange(((Integer) valueAnimator.getAnimatedValue()).intValue());
        vwn.invalidateSelf();
    }
}
