package defpackage;

import android.view.animation.Animation;

/* renamed from: jgn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jgn implements Animation.AnimationListener {
    final /* synthetic */ jgq a;
    final /* synthetic */ jgs b;

    public jgn(jgs jgs, jgq jgq) {
        this.b = jgs;
        this.a = jgq;
    }

    public final void onAnimationEnd(Animation animation) {
    }

    public final void onAnimationRepeat(Animation animation) {
        this.a.b();
        this.a.a();
        jgq jgq = this.a;
        jgq.a(jgq.d);
        jgs jgs = this.b;
        jgs.e = (jgs.e + 1.0f) % 5.0f;
    }

    public final void onAnimationStart(Animation animation) {
        this.b.e = 0.0f;
    }
}
