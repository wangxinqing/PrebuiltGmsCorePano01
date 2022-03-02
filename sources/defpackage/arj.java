package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: arj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arj extends AnimatorListenerAdapter {
    final /* synthetic */ arn a;

    public arj(arn arn) {
        this.a = arn;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.e();
        animator.removeListener(this);
    }
}
