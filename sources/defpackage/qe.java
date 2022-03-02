package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: qe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qe extends AnimatorListenerAdapter {
    final /* synthetic */ qh a;

    public qe(qh qhVar) {
        this.a = qhVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.a.a();
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.b();
    }

    public final void onAnimationStart(Animator animator) {
        this.a.c();
    }
}
