package defpackage;

import android.animation.Animator;

/* renamed from: vve  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vve extends vvc {
    final /* synthetic */ vvf a;

    public vve(vvf vvf) {
        this.a = vvf;
    }

    public final void onAnimationEnd(Animator animator) {
        wil.a(this.a.b, false);
        this.a.b.requestLayout();
        this.a.b.invalidate();
        this.a.c = null;
    }
}
