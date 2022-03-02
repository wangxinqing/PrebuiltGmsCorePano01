package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.google.android.pano.widget.ScrollAdapterView;

/* renamed from: akgp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akgp {
    public final int a;
    public final int b;
    public final View c;
    float d = 0.0f;
    Animator e;
    Animator f;
    final /* synthetic */ ScrollAdapterView g;

    public akgp(ScrollAdapterView scrollAdapterView, View view, int i, int i2) {
        this.g = scrollAdapterView;
        this.c = view;
        this.a = i;
        this.b = i2;
    }

    public final void a() {
        Animator animator = this.f;
        if (animator != null) {
            animator.cancel();
            this.f = null;
        }
        Animator animator2 = this.e;
        if (animator2 != null) {
            animator2.cancel();
            this.e = null;
        }
    }

    public final void a(float f2) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        if (this.g.w != 4) {
            float f3 = this.d;
            this.d = f2;
            if (f2 > f3) {
                Animator animator = this.f;
                if (animator != null) {
                    animator.cancel();
                    this.f = null;
                }
                if (this.e == null) {
                    Animator animator2 = this.g.t;
                    if (animator2 == null) {
                        this.c.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, "alpha", new float[]{1.0f});
                        ofFloat.setStartDelay(225);
                        ofFloat.setDuration(900);
                        objectAnimator2 = ofFloat;
                    } else {
                        objectAnimator2 = animator2.clone();
                    }
                    this.e = objectAnimator2;
                    objectAnimator2.setTarget(this.c);
                    this.e.start();
                }
                if (!this.g.e) {
                    this.e.end();
                }
            } else if (f2 < f3) {
                Animator animator3 = this.e;
                if (animator3 != null) {
                    animator3.cancel();
                    this.e = null;
                }
                if (this.f == null) {
                    Animator animator4 = this.g.u;
                    if (animator4 == null) {
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object) null, "alpha", new float[]{0.0f});
                        ofFloat2.setDuration(450);
                        objectAnimator = ofFloat2;
                    } else {
                        objectAnimator = animator4.clone();
                    }
                    this.f = objectAnimator;
                    objectAnimator.setTarget(this.c);
                    this.f.start();
                }
                if (!this.g.e) {
                    this.f.end();
                }
            }
        }
    }
}
