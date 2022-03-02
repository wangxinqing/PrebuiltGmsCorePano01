package defpackage;

import android.animation.Animator;

/* renamed from: apz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apz implements Animator.AnimatorListener {
    final /* synthetic */ aqa a;
    final /* synthetic */ aqb b;

    public apz(aqb aqb, aqa aqa) {
        this.b = aqb;
        this.a = aqa;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
        this.b.a(1.0f, this.a, true);
        this.a.c();
        aqa aqa = this.a;
        aqa.a(aqa.a());
        aqb aqb = this.b;
        if (aqb.d) {
            aqb.d = false;
            animator.cancel();
            animator.setDuration(1332);
            animator.start();
            this.a.a(false);
            return;
        }
        aqb.c += 1.0f;
    }

    public final void onAnimationStart(Animator animator) {
        this.b.c = 0.0f;
    }
}
