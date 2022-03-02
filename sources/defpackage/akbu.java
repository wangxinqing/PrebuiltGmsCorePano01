package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: akbu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akbu extends AnimatorListenerAdapter {
    final /* synthetic */ akbx a;

    public akbu(akbx akbx) {
        this.a = akbx;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.k.e(false);
    }
}
