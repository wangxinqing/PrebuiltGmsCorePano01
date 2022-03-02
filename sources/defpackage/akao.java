package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;

/* renamed from: akao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akao implements Runnable {
    final /* synthetic */ akat a;

    public akao(akat akat) {
        this.a = akat;
    }

    public final void run() {
        akas akas = this.a.e;
        if (akas != null) {
            akas.setVisibility(0);
            akat akat = this.a;
            if (akat.e.a == 1) {
                ValueAnimator a2 = akat.a(0.0f, 1.0f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
                ofFloat.setInterpolator(ajrr.d);
                ofFloat.addUpdateListener(new akaa(akat));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{a2, ofFloat});
                animatorSet.setDuration(150);
                animatorSet.addListener(new ajzx(akat));
                animatorSet.start();
                return;
            }
            int g = akat.g();
            akat.e.setTranslationY((float) g);
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[]{g, 0});
            valueAnimator.setInterpolator(ajrr.b);
            valueAnimator.setDuration(250);
            valueAnimator.addListener(new akab(akat));
            valueAnimator.addUpdateListener(new akac(akat));
            valueAnimator.start();
        }
    }
}
