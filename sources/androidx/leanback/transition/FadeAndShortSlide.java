package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FadeAndShortSlide extends Visibility {
    static final aja a = new aiu();
    static final aja b = new aiv();
    static final aja c = new aiw();
    static final aja d = new aix();
    static final aja e = new aiy();
    private static final TimeInterpolator g = new DecelerateInterpolator();
    final aja f;
    private aja h;
    private Visibility i;
    private float j;

    public FadeAndShortSlide() {
        this(8388611);
    }

    private static final void a(TransitionValues transitionValues) {
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:fadeAndShortSlideTransition:screenPosition", iArr);
    }

    public final Transition addListener(Transition.TransitionListener transitionListener) {
        this.i.addListener(transitionListener);
        return super.addListener(transitionListener);
    }

    public final float b(ViewGroup viewGroup) {
        float f2 = this.j;
        return f2 < 0.0f ? (float) (viewGroup.getHeight() / 4) : f2;
    }

    public final void captureEndValues(TransitionValues transitionValues) {
        this.i.captureEndValues(transitionValues);
        super.captureEndValues(transitionValues);
        a(transitionValues);
    }

    public final void captureStartValues(TransitionValues transitionValues) {
        this.i.captureStartValues(transitionValues);
        super.captureStartValues(transitionValues);
        a(transitionValues);
    }

    public final Transition clone() {
        FadeAndShortSlide fadeAndShortSlide = (FadeAndShortSlide) super.clone();
        fadeAndShortSlide.i = (Visibility) this.i.clone();
        return fadeAndShortSlide;
    }

    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ViewGroup viewGroup2 = viewGroup;
        ViewGroup viewGroup3 = view;
        TransitionValues transitionValues3 = transitionValues2;
        if (transitionValues3 == null || viewGroup2 == viewGroup3) {
            return null;
        }
        int[] iArr = (int[]) transitionValues3.values.get("android:fadeAndShortSlideTransition:screenPosition");
        int i2 = iArr[0];
        int i3 = iArr[1];
        float translationX = view.getTranslationX();
        View view2 = view;
        TransitionValues transitionValues4 = transitionValues2;
        Animator a2 = ajn.a(view2, transitionValues4, i2, i3, this.h.a(this, viewGroup, viewGroup3, iArr), this.h.b(this, viewGroup, viewGroup3, iArr), translationX, view.getTranslationY(), g, this);
        Animator onAppear = this.i.onAppear(viewGroup, viewGroup3, transitionValues, transitionValues3);
        if (a2 == null) {
            return onAppear;
        }
        if (onAppear == null) {
            return a2;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(a2).with(onAppear);
        return animatorSet;
    }

    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ViewGroup viewGroup2 = viewGroup;
        ViewGroup viewGroup3 = view;
        TransitionValues transitionValues3 = transitionValues;
        if (transitionValues3 == null || viewGroup2 == viewGroup3) {
            return null;
        }
        int[] iArr = (int[]) transitionValues3.values.get("android:fadeAndShortSlideTransition:screenPosition");
        int i2 = iArr[0];
        int i3 = iArr[1];
        float translationX = view.getTranslationX();
        float a2 = this.h.a(this, viewGroup, viewGroup3, iArr);
        Animator a3 = ajn.a(view, transitionValues, i2, i3, translationX, view.getTranslationY(), a2, this.h.b(this, viewGroup, viewGroup3, iArr), g, this);
        Animator onDisappear = this.i.onDisappear(viewGroup, viewGroup3, transitionValues3, transitionValues2);
        if (a3 == null) {
            return onDisappear;
        }
        if (onDisappear == null) {
            return a3;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(a3).with(onDisappear);
        return animatorSet;
    }

    public final Transition removeListener(Transition.TransitionListener transitionListener) {
        this.i.removeListener(transitionListener);
        return super.removeListener(transitionListener);
    }

    public final void setEpicenterCallback(Transition.EpicenterCallback epicenterCallback) {
        this.i.setEpicenterCallback(epicenterCallback);
        super.setEpicenterCallback(epicenterCallback);
    }

    public FadeAndShortSlide(int i2) {
        this.i = new Fade();
        this.j = -1.0f;
        this.f = new aiz(this);
        a(i2);
    }

    public final float a(ViewGroup viewGroup) {
        float f2 = this.j;
        return f2 < 0.0f ? (float) (viewGroup.getWidth() / 4) : f2;
    }

    public final void a(int i2) {
        aja aja;
        if (i2 == 48) {
            aja = e;
        } else if (i2 == 80) {
            aja = d;
        } else if (i2 == 112) {
            aja = this.f;
        } else if (i2 == 8388611) {
            aja = a;
        } else if (i2 == 8388613) {
            aja = b;
        } else if (i2 == 8388615) {
            aja = c;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.h = aja;
    }

    public FadeAndShortSlide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new Fade();
        this.j = -1.0f;
        this.f = new aiz(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ait.i);
        a(obtainStyledAttributes.getInt(3, 8388611));
        obtainStyledAttributes.recycle();
    }
}
