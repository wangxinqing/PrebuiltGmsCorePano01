package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;

/* renamed from: den  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class den {
    public Animation a;
    ViewPropertyAnimator b;
    public final deo c;
    private AnimatorListenerAdapter d;

    public final void b() {
        a((AnimatorListenerAdapter) null);
        this.c.a.d();
    }

    public den(deo deo) {
        this.c = deo;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Animation animation = this.a;
        if (animation != null) {
            animation.setAnimationListener((Animation.AnimationListener) null);
            this.a.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(float f, float f2) {
        a();
        this.c.a.d();
        this.c.a.a(0, 154);
        this.c.a.a(false);
        a((AnimatorListenerAdapter) new dek(this, f, f2));
        this.c.b.setVisibility(8);
        this.c.a.setVisibility(0);
        this.c.a.b();
    }

    public final void a(AnimatorListenerAdapter animatorListenerAdapter) {
        this.c.a.b((Animator.AnimatorListener) this.d);
        this.d = animatorListenerAdapter;
        if (animatorListenerAdapter != null) {
            this.c.a.a((Animator.AnimatorListener) animatorListenerAdapter);
        }
    }
}
