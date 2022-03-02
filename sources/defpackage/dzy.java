package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: dzy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dzy extends AnimatorListenerAdapter {
    final /* synthetic */ ead a;

    public dzy(ead ead) {
        this.a = ead;
    }

    public final void onAnimationEnd(Animator animator) {
        ead ead = this.a;
        int i = ead.j;
        ead.c = !ead.c;
    }
}
