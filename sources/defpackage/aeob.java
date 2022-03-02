package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: aeob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeob extends AnimatorListenerAdapter {
    final /* synthetic */ aeoe a;

    public aeob(aeoe aeoe) {
        this.a = aeoe;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.a.a.j()) {
            this.a.a.g();
        }
        this.a.a.b(4);
    }

    public final void onAnimationStart(Animator animator) {
        this.a.c.setVisibility(0);
        this.a.a.b(3);
    }
}
