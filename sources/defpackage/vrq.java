package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* renamed from: vrq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vrq implements ValueAnimator.AnimatorUpdateListener {
    private final View a;
    private final float b;
    private final DecelerateInterpolator c;
    private final View d;

    public vrq(View view, float f, DecelerateInterpolator decelerateInterpolator, View view2) {
        this.a = view;
        this.b = f;
        this.c = decelerateInterpolator;
        this.d = view2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.a;
        float f = this.b;
        DecelerateInterpolator decelerateInterpolator = this.c;
        View view2 = this.d;
        view.setTranslationX(f - (decelerateInterpolator.getInterpolation(valueAnimator.getAnimatedFraction()) * f));
        view2.setScaleX(view.getScaleX());
        view2.setScaleY(view.getScaleY());
        view2.setTranslationX(view.getTranslationX());
        view2.setTranslationY(view.getTranslationY());
    }
}
