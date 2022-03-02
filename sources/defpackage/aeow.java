package defpackage;

import android.animation.Animator;

/* renamed from: aeow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeow extends aemi {
    final /* synthetic */ aeox a;

    public aeow(aeox aeox) {
        this.a = aeox;
    }

    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            this.a.d = null;
            return;
        }
        aeox aeox = this.a;
        aeow.super.setVisible(aeox.b, false);
        this.a.a.cancel();
        this.a.b();
        Runnable runnable = this.a.d;
        if (runnable != null) {
            runnable.run();
            this.a.d = null;
        }
    }
}
