package defpackage;

import android.animation.Animator;

/* renamed from: aemk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aemk extends aemi {
    protected final Animator a;
    public final Runnable b;
    public final int c;
    public int d;
    private final aemn e = new aemj(this);

    private aemk(Animator animator, Runnable runnable) {
        this.a = animator;
        this.c = -1;
        this.b = runnable;
    }

    public static void a(Animator animator, Runnable runnable) {
        animator.addListener(new aemk(animator, runnable));
    }

    public final void onAnimationEnd(Animator animator) {
        if (!a(animator)) {
            aemp.a().a(this.e);
        }
    }
}
