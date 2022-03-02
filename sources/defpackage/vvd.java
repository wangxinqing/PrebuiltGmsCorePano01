package defpackage;

import android.animation.ValueAnimator;

/* renamed from: vvd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vvd implements ValueAnimator.AnimatorUpdateListener {
    private final vvf a;

    public vvd(vvf vvf) {
        this.a = vvf;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        vvf vvf = this.a;
        vvf.a(vvf.e, vvf.f - ((Integer) valueAnimator.getAnimatedValue()).intValue(), vvf.g, vvf.h);
    }
}
