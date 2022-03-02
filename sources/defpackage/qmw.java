package defpackage;

import android.animation.Animator;

/* renamed from: qmw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qmw extends qmz {
    final /* synthetic */ qmx a;

    public qmw(qmx qmx) {
        this.a = qmx;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.a.c.setVisibility(0);
        this.a.a.f = 2;
    }
}
