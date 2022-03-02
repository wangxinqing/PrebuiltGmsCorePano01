package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: aeov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeov extends AnimatorListenerAdapter {
    final /* synthetic */ aeox a;

    public aeov(aeox aeox) {
        this.a = aeox;
    }

    public final void onAnimationEnd(Animator animator) {
        Runnable runnable = this.a.c;
    }
}
