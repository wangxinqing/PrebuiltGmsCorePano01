package defpackage;

import android.animation.Animator;

/* renamed from: akea  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akea implements Animator.AnimatorListener {
    final /* synthetic */ akeb a;
    private final boolean b;
    private boolean c;

    public akea(akeb akeb, boolean z) {
        this.a = akeb;
        this.b = z;
    }

    public final void onAnimationCancel(Animator animator) {
        this.c = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.c && this.b) {
            this.a.j = true;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        if (!this.b) {
            this.a.j = false;
        }
    }
}
