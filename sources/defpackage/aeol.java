package defpackage;

import android.animation.Animator;

/* renamed from: aeol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeol extends aemi {
    final /* synthetic */ aeom a;

    public aeol(aeom aeom) {
        this.a = aeom;
    }

    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            this.a.c = null;
            return;
        }
        aeom aeom = this.a;
        int i = aeom.d;
        aeol.super.setVisible(aeom.a, false);
        Runnable runnable = this.a.c;
        if (runnable != null) {
            runnable.run();
            this.a.c = null;
        }
        this.a.b();
    }
}
