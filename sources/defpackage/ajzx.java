package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ajzx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajzx extends AnimatorListenerAdapter {
    final /* synthetic */ akat a;

    public ajzx(akat akat) {
        this.a = akat;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.h();
    }
}
