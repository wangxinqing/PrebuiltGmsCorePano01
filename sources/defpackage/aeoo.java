package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: aeoo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeoo extends AnimatorListenerAdapter {
    final /* synthetic */ aeoq a;

    public aeoo(aeoq aeoq) {
        this.a = aeoq;
    }

    public final void onAnimationStart(Animator animator) {
        aeoq aeoq = this.a;
        int i = aeoq.j;
        if (!aeoq.a.isStarted()) {
            this.a.a.start();
        }
    }
}
