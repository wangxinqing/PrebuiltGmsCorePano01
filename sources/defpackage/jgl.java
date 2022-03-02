package defpackage;

import android.view.animation.Animation;

/* renamed from: jgl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jgl implements Animation.AnimationListener {
    final /* synthetic */ jgq a;
    final /* synthetic */ jgs b;

    public jgl(jgs jgs, jgq jgq) {
        this.b = jgs;
        this.a = jgq;
    }

    public final void onAnimationEnd(Animation animation) {
        this.a.a();
        this.a.b();
        jgs jgs = this.b;
        jgs.c.startAnimation(jgs.d);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
