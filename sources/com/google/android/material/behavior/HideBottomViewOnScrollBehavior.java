package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class HideBottomViewOnScrollBehavior extends ahj {
    public ViewPropertyAnimator a;
    private int b = 0;
    private int c = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    private final void a(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.a = view.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new ajsu(this));
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i > 0) {
            if (this.c != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.a;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.c = 1;
                a(view, this.b, 175, ajrr.c);
            }
        } else if (i < 0 && this.c != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.a;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            this.c = 2;
            a(view, 0, 225, ajrr.d);
        }
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.b = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return false;
    }
}
