package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: dej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dej extends AnimatorListenerAdapter {
    final /* synthetic */ den a;

    public dej(den den) {
        this.a = den;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.a((AnimatorListenerAdapter) null);
        if (this.a.c.c.a() != dia.FINISHING_WITH_ONBOARDING && this.a.c.c.a() != dia.FINISHING_WITHOUT_ONBOARDING) {
            this.a.c.a.a(0, 135);
            this.a.c.a.a(true);
            this.a.c.a.a();
        }
    }
}
