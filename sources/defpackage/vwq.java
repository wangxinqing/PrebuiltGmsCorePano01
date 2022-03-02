package defpackage;

import android.animation.ValueAnimator;

/* renamed from: vwq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vwq implements ValueAnimator.AnimatorUpdateListener {
    private final vwr a;

    public vwq(vwr vwr) {
        this.a = vwr;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        vwr vwr = this.a;
        float min = Math.min(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        vws vws = vwr.d;
        vwr.a = (int) (((float) (Math.min(vws.getBounds().width(), vws.getBounds().height()) / 2)) * min);
        float f = 1.0f - min;
        vwr.b.setAlpha((int) (255.0f * f));
        vwr.b.setStrokeWidth(vwr.c * f);
        vwr.d.invalidateSelf();
    }
}
