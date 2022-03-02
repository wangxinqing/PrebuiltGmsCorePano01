package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: qf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qf implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ ue a;

    public qf(ue ueVar) {
        this.a = ueVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((View) this.a.a.c.getParent()).invalidate();
    }
}
