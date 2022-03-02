package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.airbnb.lottie.LottieAnimationView;

/* renamed from: dcz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dcz extends AnimatorListenerAdapter {
    final /* synthetic */ ddf a;

    public dcz(ddf ddf) {
        this.a = ddf;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.g.b((Animator.AnimatorListener) this);
        if (awgy.l()) {
            ddf ddf = this.a;
            ddf.i = true;
            ddf.g.a(0.0f, 1.0f);
        }
        ddf ddf2 = this.a;
        LottieAnimationView lottieAnimationView = ddf2.g;
        ddd ddd = ddf2.c;
        aqpw aqpw = ((aqry) ddf2.b.c.get(0)).c;
        if (aqpw == null) {
            aqpw = aqpw.c;
        }
        lottieAnimationView.a(ddd.a(aqpw.b));
    }
}
