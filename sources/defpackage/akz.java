package defpackage;

import android.animation.ValueAnimator;
import androidx.leanback.widget.SearchOrbView;

/* renamed from: akz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akz implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ SearchOrbView a;

    public akz(SearchOrbView searchOrbView) {
        this.a = searchOrbView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
