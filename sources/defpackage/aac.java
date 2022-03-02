package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: aac  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aac extends AnimatorListenerAdapter {
    final /* synthetic */ adl a;
    final /* synthetic */ View b;
    final /* synthetic */ ViewPropertyAnimator c;
    final /* synthetic */ aai d;

    public aac(aai aai, adl adl, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.d = aai;
        this.a = adl;
        this.b = view;
        this.c = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        this.b.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.c.setListener((Animator.AnimatorListener) null);
        this.d.e(this.a);
        this.d.d.remove(this.a);
        this.d.c();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
