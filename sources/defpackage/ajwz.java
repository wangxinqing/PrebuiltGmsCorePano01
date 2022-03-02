package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* renamed from: ajwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class ajwz extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    private boolean a;
    final /* synthetic */ ajxa b;
    private float c;
    private float d;

    public ajwz(ajxa ajxa) {
        this.b = ajxa;
    }

    /* access modifiers changed from: protected */
    public abstract float a();

    public final void onAnimationEnd(Animator animator) {
        this.b.b((float) ((int) this.d));
        this.a = false;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (!this.a) {
            ajzf ajzf = this.b.c;
            this.c = ajzf != null ? ajzf.k() : 0.0f;
            this.d = a();
            this.a = true;
        }
        ajxa ajxa = this.b;
        float f = this.c;
        ajxa.b((float) ((int) (f + ((this.d - f) * valueAnimator.getAnimatedFraction()))));
    }
}
