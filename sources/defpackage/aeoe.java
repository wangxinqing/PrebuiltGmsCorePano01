package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.libraries.material.internal.ClippableRoundedCornerLayout;
import com.google.android.libraries.material.internal.TouchObserverFrameLayout;
import com.google.android.libraries.material.opensearchbar.OpenSearchView;

/* renamed from: aeoe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeoe {
    public final OpenSearchView a;
    public final View b;
    public final ClippableRoundedCornerLayout c;
    public final Toolbar d;
    public final Toolbar e;
    public final TextView f;
    public final EditText g;
    public final ImageButton h;
    public final View i;
    public final TouchObserverFrameLayout j;
    public aenj k;
    private final FrameLayout l;

    public aeoe(OpenSearchView openSearchView) {
        this.a = openSearchView;
        this.b = openSearchView.a;
        this.c = openSearchView.b;
        this.l = openSearchView.e;
        this.d = openSearchView.f;
        this.e = openSearchView.g;
        this.f = openSearchView.h;
        this.g = openSearchView.i;
        this.h = openSearchView.j;
        this.i = openSearchView.k;
        this.j = openSearchView.l;
    }

    public final int a() {
        return ((this.k.getTop() + this.k.getBottom()) / 2) - ((this.l.getTop() + this.l.getBottom()) / 2);
    }

    public final int b(View view) {
        int b2 = ph.b((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        return aeni.a(this.k) ? this.k.getLeft() - b2 : (this.k.getRight() - this.a.getWidth()) + b2;
    }

    public final int a(View view) {
        int a2 = ph.a((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        return aeni.a(this.k) ? (this.k.getWidth() - this.k.getRight()) + a2 : this.k.getLeft() - a2;
    }

    public final Animator a(boolean z, View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) (!z ? b(view) : a(view)), 0.0f});
        ofFloat.addUpdateListener(aene.b(view));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{(float) a(), 0.0f});
        ofFloat2.addUpdateListener(aene.c(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.setDuration(250);
        animatorSet.setInterpolator(aeng.a(false, ajrr.b));
        return animatorSet;
    }

    public final AnimatorSet a(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) this.c.getHeight(), 0.0f});
        ofFloat.addUpdateListener(aene.c(this.c));
        animatorSet.playTogether(new Animator[]{ofFloat});
        a(animatorSet);
        animatorSet.setInterpolator(aeng.a(z, ajrr.b));
        animatorSet.setDuration(!z ? 300 : 350);
        return animatorSet;
    }

    public final void a(float f2) {
        ActionMenuView a2;
        this.h.setAlpha(f2);
        this.i.setAlpha(f2);
        this.j.setAlpha(f2);
        if (this.a.p && (a2 = aenh.a(this.d)) != null) {
            a2.setAlpha(f2);
        }
    }

    public final void a(AnimatorSet animatorSet) {
        ImageButton b2 = aenh.b(this.d);
        if (b2 != null) {
            Drawable drawable = b2.getDrawable();
            if (this.a.o) {
                if (drawable instanceof uw) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat.addUpdateListener(new aeny((uw) drawable));
                    animatorSet.playTogether(new Animator[]{ofFloat});
                }
                if (drawable instanceof aemw) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat2.addUpdateListener(new aenz((aemw) drawable));
                    animatorSet.playTogether(new Animator[]{ofFloat2});
                    return;
                }
                return;
            }
            if (drawable instanceof uw) {
                ((uw) drawable).a(1.0f);
            }
            if (drawable instanceof aemw) {
                ((aemw) drawable).a(1.0f);
            }
        }
    }
}
