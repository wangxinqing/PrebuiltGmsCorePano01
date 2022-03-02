package defpackage;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* renamed from: ajxy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajxy implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ TextView a;

    public ajxy(TextView textView) {
        this.a = textView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.setScaleX(floatValue);
        this.a.setScaleY(floatValue);
    }
}
