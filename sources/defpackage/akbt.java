package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: akbt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akbt extends AnimatorListenerAdapter {
    final /* synthetic */ akbx a;

    public akbt(akbx akbx) {
        this.a = akbx;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.k.e(true);
    }
}
