package defpackage;

import android.animation.Animator;
import com.google.android.chimera.Fragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: fcj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fcj implements Animator.AnimatorListener {
    final /* synthetic */ Fragment a;
    final /* synthetic */ fcl b;

    public fcj(fcl fcl, Fragment fragment) {
        this.b = fcl;
        this.a = fragment;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.a != null && !this.b.a.isDestroyed()) {
            this.b.a.beginTransaction().remove(this.a).commitNow();
        }
        fcl fcl = this.b;
        BottomSheetBehavior bottomSheetBehavior = fcl.b;
        if (bottomSheetBehavior != null) {
            fcl.d = bottomSheetBehavior.b();
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
