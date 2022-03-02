package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ari  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ari extends AnimatorListenerAdapter {
    final /* synthetic */ nz a;
    final /* synthetic */ arn b;

    public ari(arn arn, nz nzVar) {
        this.b = arn;
        this.a = nzVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.b.l.remove(animator);
    }

    public final void onAnimationStart(Animator animator) {
        this.b.l.add(animator);
    }
}
