package defpackage;

import android.animation.ValueAnimator;
import com.google.android.gms.smart_profile.SmartProfileContainerView;

/* renamed from: abgv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abgv implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ SmartProfileContainerView a;

    public abgv(SmartProfileContainerView smartProfileContainerView) {
        this.a = smartProfileContainerView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
