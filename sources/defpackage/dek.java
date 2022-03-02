package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: dek  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dek extends AnimatorListenerAdapter {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ den c;

    public dek(den den, float f, float f2) {
        this.c = den;
        this.a = f;
        this.b = f2;
    }

    public final void onAnimationEnd(Animator animator) {
        this.c.c.a.a(155, 180);
        this.c.a((AnimatorListenerAdapter) null);
        this.c.c.a.b();
        den den = this.c;
        float f = this.a;
        float f2 = this.b;
        den.c.e.setVisibility(0);
        den.b = den.c.e.animate().alpha(1.0f).setDuration(300).setListener(new del(den, f, f2));
    }
}
