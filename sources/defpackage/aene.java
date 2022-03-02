package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: aene  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aene implements ValueAnimator.AnimatorUpdateListener {
    public static final /* synthetic */ int a = 0;
    private final aend b;
    private final View[] c;

    public aene(aend aend, View... viewArr) {
        this.b = aend;
        this.c = viewArr;
    }

    public static aene a(View... viewArr) {
        return new aene(aemz.a, viewArr);
    }

    public static aene b(View... viewArr) {
        return new aene(aenb.a, viewArr);
    }

    public static aene c(View... viewArr) {
        return new aene(aenc.a, viewArr);
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (View a2 : this.c) {
            this.b.a(valueAnimator, a2);
        }
    }
}
