package com.google.android.gms.nearby.sharing.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DividerFadeTransition extends Transition {
    public static final /* synthetic */ int a = 0;
    private static final String[] b = {"com.google.android.gms.nearby.sharing.animation:DividerFadeTransition:alpha"};
    private int c;

    public DividerFadeTransition(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void captureEndValues(TransitionValues transitionValues) {
        int i = this.c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            transitionValues.values.put("com.google.android.gms.nearby.sharing.animation:DividerFadeTransition:alpha", 255);
        } else if (i2 == 1) {
            transitionValues.values.put("com.google.android.gms.nearby.sharing.animation:DividerFadeTransition:alpha", 0);
        }
    }

    public final void captureStartValues(TransitionValues transitionValues) {
        int i = this.c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            transitionValues.values.put("com.google.android.gms.nearby.sharing.animation:DividerFadeTransition:alpha", 0);
        } else if (i2 == 1) {
            transitionValues.values.put("com.google.android.gms.nearby.sharing.animation:DividerFadeTransition:alpha", 255);
        }
    }

    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Drawable dividerDrawable;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        View view = transitionValues.view;
        if (!(view instanceof LinearLayout) || (dividerDrawable = ((LinearLayout) view).getDividerDrawable()) == null) {
            return null;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(dividerDrawable, "alpha", new int[]{((Integer) transitionValues.values.get("com.google.android.gms.nearby.sharing.animation:DividerFadeTransition:alpha")).intValue(), ((Integer) transitionValues2.values.get("com.google.android.gms.nearby.sharing.animation:DividerFadeTransition:alpha")).intValue()});
        ofInt.addUpdateListener(new vvg(dividerDrawable));
        return ofInt;
    }

    public final String[] getTransitionProperties() {
        return b;
    }

    public DividerFadeTransition(Context context, AttributeSet attributeSet) {
        this.c = 2;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, crk.c, 0, 0);
            if (obtainStyledAttributes.hasValue(0)) {
                this.c = new int[]{1, 2}[obtainStyledAttributes.getInt(0, 0)];
            }
            obtainStyledAttributes.recycle();
        }
    }
}
