package defpackage;

import android.animation.ValueAnimator;

/* renamed from: ajry  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajry implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ ajzf a;

    public ajry(ajzf ajzf) {
        this.a = ajzf;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
