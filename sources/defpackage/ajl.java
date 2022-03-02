package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Property;
import android.view.View;
import com.google.android.gms.R;

/* renamed from: ajl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajl extends AnimatorListenerAdapter {
    private boolean a = false;
    private float b;
    private final View c;
    private final float d;
    private final float e;
    private final int f;
    private final Property g;

    public ajl(View view, Property property, float f2, float f3, int i) {
        this.g = property;
        this.c = view;
        this.e = f2;
        this.d = f3;
        this.f = i;
        view.setVisibility(0);
    }

    public final void onAnimationCancel(Animator animator) {
        this.c.setTag(R.id.lb_slide_transition_value, new float[]{this.c.getTranslationX(), this.c.getTranslationY()});
        this.g.set(this.c, Float.valueOf(this.e));
        this.a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.a) {
            this.g.set(this.c, Float.valueOf(this.e));
        }
        this.c.setVisibility(this.f);
    }

    public final void onAnimationPause(Animator animator) {
        this.b = ((Float) this.g.get(this.c)).floatValue();
        this.g.set(this.c, Float.valueOf(this.d));
        this.c.setVisibility(this.f);
    }

    public final void onAnimationResume(Animator animator) {
        this.g.set(this.c, Float.valueOf(this.b));
        this.c.setVisibility(0);
    }
}
