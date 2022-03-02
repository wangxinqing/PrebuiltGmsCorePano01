package defpackage;

import android.animation.Animator;

/* renamed from: aeor  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeor extends aemi {
    final /* synthetic */ aeot a;

    public aeor(aeot aeot) {
        this.a = aeot;
    }

    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            this.a.c = null;
            return;
        }
        aeot aeot = this.a;
        aeor.super.setVisible(aeot.a, false);
        this.a.b();
        Runnable runnable = this.a.c;
        if (runnable != null) {
            runnable.run();
            this.a.c = null;
        }
    }
}
