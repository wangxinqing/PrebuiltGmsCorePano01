package defpackage;

import android.animation.Animator;
import android.view.ViewGroup;
import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;

/* renamed from: gov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gov implements Animator.AnimatorListener {
    final /* synthetic */ gow a;

    public gov(gow gow) {
        this.a = gow;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        ((ViewGroup) this.a.a.r.getParent()).removeView(this.a.a.r);
        MinuteMaidChimeraActivity minuteMaidChimeraActivity = this.a.a;
        minuteMaidChimeraActivity.a(0, minuteMaidChimeraActivity.u);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
