package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.Transition;
import android.view.View;
import com.google.android.gms.R;

/* renamed from: ajm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajm extends AnimatorListenerAdapter implements Transition.TransitionListener {
    private final View a;
    private final View b;
    private final int c;
    private final int d;
    private int[] e;
    private float f;
    private float g;
    private final float h;
    private final float i;

    public ajm(View view, View view2, int i2, int i3, float f2, float f3) {
        this.b = view;
        this.a = view2;
        this.c = i2 - Math.round(view.getTranslationX());
        this.d = i3 - Math.round(this.b.getTranslationY());
        this.h = f2;
        this.i = f3;
        int[] iArr = (int[]) this.a.getTag(R.id.transitionPosition);
        this.e = iArr;
        if (iArr != null) {
            this.a.setTag(R.id.transitionPosition, (Object) null);
        }
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.e == null) {
            this.e = new int[2];
        }
        this.e[0] = Math.round(((float) this.c) + this.b.getTranslationX());
        this.e[1] = Math.round(((float) this.d) + this.b.getTranslationY());
        this.a.setTag(R.id.transitionPosition, this.e);
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationPause(Animator animator) {
        this.f = this.b.getTranslationX();
        this.g = this.b.getTranslationY();
        this.b.setTranslationX(this.h);
        this.b.setTranslationY(this.i);
    }

    public final void onAnimationResume(Animator animator) {
        this.b.setTranslationX(this.f);
        this.b.setTranslationY(this.g);
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        this.b.setTranslationX(this.h);
        this.b.setTranslationY(this.i);
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
    }
}
