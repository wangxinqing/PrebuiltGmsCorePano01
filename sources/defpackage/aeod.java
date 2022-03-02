package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: aeod  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeod extends AnimatorListenerAdapter {
    final /* synthetic */ aeoe a;

    public aeod(aeoe aeoe) {
        this.a = aeoe;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.a(0.0f);
    }

    public final void onAnimationStart(Animator animator) {
        this.a.a(1.0f);
    }
}
