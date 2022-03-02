package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.tabs.TabLayout;

/* renamed from: akbe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akbe implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ TabLayout a;

    public akbe(TabLayout tabLayout) {
        this.a = tabLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }
}
