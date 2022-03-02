package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: dem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dem extends AnimatorListenerAdapter {
    final /* synthetic */ den a;

    public dem(den den) {
        this.a = den;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.b.setListener((Animator.AnimatorListener) null);
        this.a.c.c.b();
    }
}
