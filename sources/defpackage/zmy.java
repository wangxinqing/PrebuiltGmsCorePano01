package defpackage;

import android.animation.Animator;

/* renamed from: zmy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zmy implements Animator.AnimatorListener {
    final /* synthetic */ zmz a;

    public zmy(zmz zmz) {
        this.a = zmz;
    }

    public final void onAnimationCancel(Animator animator) {
        this.a.a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.a.a) {
            animator.start();
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
