package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import com.google.android.gms.R;

/* renamed from: del  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class del extends AnimatorListenerAdapter {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ den c;

    public del(den den, float f, float f2) {
        this.c = den;
        this.a = f;
        this.b = f2;
    }

    public final void onAnimationEnd(Animator animator) {
        this.c.b.setListener((Animator.AnimatorListener) null);
        den den = this.c;
        float f = this.a;
        float f2 = this.b;
        if (!cyd.b(den.c.getContext())) {
            den.c.c.b();
        }
        den.c.a.setVisibility(8);
        den.c.e.setVisibility(0);
        den.c.e.setAlpha(1.0f);
        Resources resources = den.c.getContext().getResources();
        float dimensionPixelSize = f / ((float) resources.getDimensionPixelSize(R.dimen.as_splash_screen_avatar_size));
        den.b = den.c.e.animate().translationY((f2 - den.c.e.getY()) - ((((float) resources.getDimensionPixelSize(R.dimen.as_splash_screen_avatar_size)) * (1.0f - dimensionPixelSize)) / 2.0f)).scaleX(dimensionPixelSize).scaleY(dimensionPixelSize).setDuration(350).setInterpolator(new air()).setListener(new dem(den));
    }
}
