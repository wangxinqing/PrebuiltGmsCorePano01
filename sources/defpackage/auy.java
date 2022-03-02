package defpackage;

import android.animation.ValueAnimator;

/* renamed from: auy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class auy implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ avc a;

    public auy(avc avc) {
        this.a = avc;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        avc avc = this.a;
        ayv ayv = avc.k;
        if (ayv != null) {
            ayv.a(avc.b.b());
        }
    }
}
