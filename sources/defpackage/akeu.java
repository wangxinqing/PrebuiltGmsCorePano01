package defpackage;

import android.animation.ValueAnimator;

/* renamed from: akeu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akeu implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ akey a;

    public akeu(akey akey) {
        this.a = akey;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a(valueAnimator.getAnimatedFraction());
    }
}
