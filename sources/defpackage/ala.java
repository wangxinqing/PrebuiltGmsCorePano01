package defpackage;

import android.animation.ValueAnimator;
import androidx.leanback.widget.SearchOrbView;

/* renamed from: ala  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ala implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ SearchOrbView a;

    public ala(SearchOrbView searchOrbView) {
        this.a = searchOrbView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a(valueAnimator.getAnimatedFraction());
    }
}
