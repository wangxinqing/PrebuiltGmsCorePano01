package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Fragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: fci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fci implements ValueAnimator.AnimatorUpdateListener {
    private final fcl a;
    private final Fragment b;
    private final Fragment c;

    public fci(fcl fcl, Fragment fragment, Fragment fragment2) {
        this.a = fcl;
        this.b = fragment;
        this.c = fragment2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        fcl fcl = this.a;
        Fragment fragment = this.b;
        Fragment fragment2 = this.c;
        BottomSheetBehavior bottomSheetBehavior = fcl.b;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
        if (fragment != null) {
            View view = fragment.getView();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            view.setLayoutParams(layoutParams);
            view.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
        }
        fragment2.getView().setAlpha(valueAnimator.getAnimatedFraction());
    }
}
