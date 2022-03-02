package defpackage;

import android.animation.ValueAnimator;

/* renamed from: akbh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akbh implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ akbj c;

    public akbh(akbj akbj, int i, int i2) {
        this.c = akbj;
        this.a = i;
        this.b = i2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        akbj akbj = this.c;
        akbj.a(ajrr.a(akbj.h, this.a, animatedFraction), ajrr.a(this.c.i, this.b, animatedFraction));
    }
}
