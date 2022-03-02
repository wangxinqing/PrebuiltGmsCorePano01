package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: qmx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qmx implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ qna a;

    public qmx(qna qna) {
        this.a = qna;
    }

    public final void onGlobalLayout() {
        this.a.e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        View view = this.a.e;
        this.a.a(ObjectAnimator.ofFloat(view, "translationY", new float[]{(float) view.getHeight(), 0.0f}), ObjectAnimator.ofFloat(this.a.d, "alpha", new float[]{0.0f, 1.0f}), new qmw(this));
    }
}
