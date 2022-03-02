package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ajwr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajwr extends AnimatorListenerAdapter {
    final /* synthetic */ ajxa a;

    public ajwr(ajxa ajxa) {
        this.a = ajxa;
    }

    public final void onAnimationEnd(Animator animator) {
        ajxa ajxa = this.a;
        int i = ajxa.E;
        ajxa.u = 0;
        ajxa.o = null;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.B.a(0, false);
        ajxa ajxa = this.a;
        int i = ajxa.E;
        ajxa.u = 2;
        ajxa.o = animator;
    }
}
