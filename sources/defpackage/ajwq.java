package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ajwq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajwq extends AnimatorListenerAdapter {
    final /* synthetic */ ajxa a;
    private boolean b;

    public ajwq(ajxa ajxa) {
        this.a = ajxa;
    }

    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    public final void onAnimationEnd(Animator animator) {
        ajxa ajxa = this.a;
        int i = ajxa.E;
        ajxa.u = 0;
        ajxa.o = null;
        if (!this.b) {
            ajxa.B.a(4, false);
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.a.B.a(0, false);
        ajxa ajxa = this.a;
        int i = ajxa.E;
        ajxa.u = 1;
        ajxa.o = animator;
        this.b = false;
    }
}
