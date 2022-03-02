package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: ask  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ask extends AnimatorListenerAdapter implements arm {
    boolean a = false;
    private final View b;
    private final int c;
    private final ViewGroup d;
    private final boolean e;
    private boolean f;

    public ask(View view, int i) {
        this.b = view;
        this.c = i;
        this.d = (ViewGroup) view.getParent();
        this.e = true;
        a(true);
    }

    private final void a(boolean z) {
        ViewGroup viewGroup;
        if (this.e && this.f != z && (viewGroup = this.d) != null) {
            this.f = z;
            arz.a(viewGroup, z);
        }
    }

    private final void d() {
        if (!this.a) {
            asc.a(this.b, this.c);
            ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        a(false);
    }

    public final void a() {
    }

    public final void b() {
        a(false);
    }

    public final void b(arn arn) {
    }

    public final void c() {
        a(true);
    }

    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        d();
    }

    public final void onAnimationPause(Animator animator) {
        if (!this.a) {
            asc.a(this.b, this.c);
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationResume(Animator animator) {
        if (!this.a) {
            asc.a(this.b, 0);
        }
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void a(arn arn) {
        d();
        arn.b((arm) this);
    }
}
