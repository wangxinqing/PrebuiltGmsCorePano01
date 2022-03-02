package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: aae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aae extends AnimatorListenerAdapter {
    final /* synthetic */ aag a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ aai d;

    public aae(aai aai, aag aag, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = aai;
        this.a = aag;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.setListener((Animator.AnimatorListener) null);
        this.c.setAlpha(1.0f);
        this.c.setTranslationX(0.0f);
        this.c.setTranslationY(0.0f);
        this.d.e(this.a.a);
        this.d.g.remove(this.a.a);
        this.d.c();
    }

    public final void onAnimationStart(Animator animator) {
        adl adl = this.a.a;
    }
}
