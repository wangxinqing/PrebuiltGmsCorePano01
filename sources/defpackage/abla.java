package defpackage;

import android.animation.ValueAnimator;
import com.google.android.gms.smart_profile.header.view.HeaderView;

/* renamed from: abla  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abla implements ValueAnimator.AnimatorUpdateListener {
    private final HeaderView a;

    public abla(HeaderView headerView) {
        this.a = headerView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
