package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: aemz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aemz implements aend {
    static final aend a = new aemz();

    private aemz() {
    }

    public final void a(ValueAnimator valueAnimator, View view) {
        int i = aene.a;
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
