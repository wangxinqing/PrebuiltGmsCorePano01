package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ajxq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajxq extends AnimatorListenerAdapter {
    final /* synthetic */ ajxs a;

    public ajxq(ajxs ajxs) {
        this.a = ajxs;
    }

    public final void onAnimationEnd(Animator animator) {
        ajxs ajxs = this.a;
        if (ajxs.c == animator) {
            ajxs.c = null;
        }
    }
}
