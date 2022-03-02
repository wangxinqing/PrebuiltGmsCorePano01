package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* renamed from: ajsh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajsh implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ CollapsingToolbarLayout a;

    public ajsh(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.a = collapsingToolbarLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
