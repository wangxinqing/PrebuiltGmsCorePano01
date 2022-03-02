package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class SlideKitkat extends Visibility {
    private static final TimeInterpolator a = new DecelerateInterpolator();
    private static final TimeInterpolator b = new AccelerateInterpolator();
    private static final aji d = new ajc();
    private static final aji e = new ajd();
    private static final aji f = new aje();
    private static final aji g = new ajf();
    private static final aji h = new ajg();
    private static final aji i = new ajh();
    private aji c;

    public SlideKitkat() {
        a(80);
    }

    private static final Animator a(View view, Property property, float f2, float f3, float f4, TimeInterpolator timeInterpolator, int i2) {
        float[] fArr = (float[]) view.getTag(R.id.lb_slide_transition_value);
        if (fArr != null) {
            f2 = View.TRANSLATION_Y != property ? fArr[0] : fArr[1];
            view.setTag(R.id.lb_slide_transition_value, (Object) null);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, new float[]{f2, f3});
        ajl ajl = new ajl(view, property, f4, f3, i2);
        ofFloat.addListener(ajl);
        ofFloat.addPauseListener(ajl);
        ofFloat.setInterpolator(timeInterpolator);
        return ofFloat;
    }

    public final Animator onAppear(ViewGroup viewGroup, TransitionValues transitionValues, int i2, TransitionValues transitionValues2, int i3) {
        View view;
        if (transitionValues2 != null) {
            view = transitionValues2.view;
        } else {
            view = null;
        }
        if (view == null) {
            return null;
        }
        float b2 = this.c.b(view);
        return a(view, this.c.a(), this.c.a(view), b2, b2, a, 0);
    }

    public final Animator onDisappear(ViewGroup viewGroup, TransitionValues transitionValues, int i2, TransitionValues transitionValues2, int i3) {
        View view;
        if (transitionValues != null) {
            view = transitionValues.view;
        } else {
            view = null;
        }
        if (view == null) {
            return null;
        }
        float b2 = this.c.b(view);
        return a(view, this.c.a(), b2, this.c.a(view), b2, b, 4);
    }

    public SlideKitkat(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ait.i);
        a(obtainStyledAttributes.getInt(3, 80));
        long j = (long) obtainStyledAttributes.getInt(1, -1);
        if (j >= 0) {
            setDuration(j);
        }
        long j2 = (long) obtainStyledAttributes.getInt(2, -1);
        if (j2 > 0) {
            setStartDelay(j2);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        obtainStyledAttributes.recycle();
    }

    public final void a(int i2) {
        aji aji;
        if (i2 == 3) {
            aji = d;
        } else if (i2 == 5) {
            aji = f;
        } else if (i2 == 48) {
            aji = e;
        } else if (i2 == 80) {
            aji = g;
        } else if (i2 == 8388611) {
            aji = h;
        } else if (i2 == 8388613) {
            aji = i;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.c = aji;
    }
}
