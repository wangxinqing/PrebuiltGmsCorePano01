package defpackage;

import android.animation.Animator;
import com.google.android.gms.smart_profile.SmartProfileContainerView;

/* renamed from: abgu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abgu implements Animator.AnimatorListener {
    final /* synthetic */ int a;
    final /* synthetic */ SmartProfileContainerView b;

    public abgu(SmartProfileContainerView smartProfileContainerView, int i) {
        this.b = smartProfileContainerView;
        this.a = i;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.i = (float) this.a;
        if (!azim.b()) {
            this.b.g.b();
        } else if (this.b.getResources().getConfiguration().orientation == 2) {
            this.b.g.b();
        }
        this.b.h = true;
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
