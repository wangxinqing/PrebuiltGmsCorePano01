package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ajzy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajzy extends AnimatorListenerAdapter {
    final /* synthetic */ int a;
    final /* synthetic */ akat b;

    public ajzy(akat akat, int i) {
        this.b = akat;
        this.a = i;
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.j();
    }
}
