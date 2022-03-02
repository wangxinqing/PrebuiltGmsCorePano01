package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: yqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yqa extends AnimatorListenerAdapter {
    final /* synthetic */ yqb a;

    protected yqa(yqb yqb) {
        this.a = yqb;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.l = true;
    }
}
