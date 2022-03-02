package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: aaq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaq extends AnimatorListenerAdapter {
    final /* synthetic */ aas a;
    private boolean b = false;

    public aaq(aas aas) {
        this.a = aas;
    }

    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.b) {
            this.b = false;
        } else if (((Float) this.a.p.getAnimatedValue()).floatValue() == 0.0f) {
            aas aas = this.a;
            aas.q = 0;
            aas.a(0);
        } else {
            aas aas2 = this.a;
            aas2.q = 2;
            aas2.a();
        }
    }
}
