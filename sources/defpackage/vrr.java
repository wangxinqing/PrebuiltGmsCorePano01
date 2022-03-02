package defpackage;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;

/* renamed from: vrr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vrr implements ValueAnimator.AnimatorUpdateListener {
    private final TextView a;
    private final float b;
    private final DecelerateInterpolator c;

    public vrr(TextView textView, float f, DecelerateInterpolator decelerateInterpolator) {
        this.a = textView;
        this.b = f;
        this.c = decelerateInterpolator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        TextView textView = this.a;
        float f = this.b;
        textView.setTranslationX(f - (this.c.getInterpolation(valueAnimator.getAnimatedFraction()) * f));
    }
}
