package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: alcq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alcq extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ adl b;
    final /* synthetic */ ViewPropertyAnimator c;
    final /* synthetic */ alcr d;

    public alcq(alcr alcr, View view, adl adl, ViewPropertyAnimator viewPropertyAnimator) {
        this.d = alcr;
        this.a = view;
        this.b = adl;
        this.c = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        alcr.a(this.a);
    }

    public final void onAnimationEnd(Animator animator) {
        this.c.setListener((Animator.AnimatorListener) null);
        this.d.e(this.b);
        this.d.l.remove(this.b);
        this.d.g();
        this.c.setStartDelay(0);
    }

    public final void onAnimationStart(Animator animator) {
        this.a.setAlpha(0.0f);
    }
}
