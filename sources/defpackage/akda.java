package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: akda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akda implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ TextInputLayout a;

    public akda(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
