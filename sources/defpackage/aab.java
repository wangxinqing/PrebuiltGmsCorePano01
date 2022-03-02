package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: aab  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aab extends AnimatorListenerAdapter {
    final /* synthetic */ adl a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ aai d;

    public aab(aai aai, adl adl, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = aai;
        this.a = adl;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.setListener((Animator.AnimatorListener) null);
        this.c.setAlpha(1.0f);
        this.d.e(this.a);
        this.d.f.remove(this.a);
        this.d.c();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
