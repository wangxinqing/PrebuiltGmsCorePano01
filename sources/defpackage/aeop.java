package defpackage;

import android.animation.Animator;

/* renamed from: aeop  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeop extends aemi {
    final /* synthetic */ aeoq a;

    public aeop(aeoq aeoq) {
        this.a = aeoq;
    }

    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            this.a.i = null;
            return;
        }
        aeoq aeoq = this.a;
        int i = aeoq.j;
        aeop.super.setVisible(aeoq.h, false);
        Runnable runnable = this.a.i;
        if (runnable != null) {
            runnable.run();
            this.a.i = null;
        }
        this.a.c();
    }
}
