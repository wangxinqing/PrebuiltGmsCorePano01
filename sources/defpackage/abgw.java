package defpackage;

import android.animation.Animator;
import com.google.android.gms.smart_profile.SmartProfileContainerView;

/* renamed from: abgw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abgw implements Animator.AnimatorListener {
    final /* synthetic */ SmartProfileContainerView a;

    public abgw(SmartProfileContainerView smartProfileContainerView) {
        this.a = smartProfileContainerView;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.b.finish();
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
