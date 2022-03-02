package defpackage;

import android.view.animation.Animation;

/* renamed from: dei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dei implements Animation.AnimationListener {
    final /* synthetic */ den a;

    public dei(den den) {
        this.a = den;
    }

    public final void onAnimationEnd(Animation animation) {
        dib dib = this.a.c.c;
        dib.d.b(dia.LOADING_SPINNER);
        dib.d.a(dib.b.b, new dhz(dib));
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
