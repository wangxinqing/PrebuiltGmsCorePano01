package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: aemx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aemx implements ValueAnimator.AnimatorUpdateListener {
    private final View a;
    private final View b;
    private final float[] c = new float[2];

    public aemx(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        aemy.a(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c);
        View view = this.a;
        if (view != null) {
            view.setAlpha(this.c[0]);
        }
        View view2 = this.b;
        if (view2 != null) {
            view2.setAlpha(this.c[1]);
        }
    }
}
