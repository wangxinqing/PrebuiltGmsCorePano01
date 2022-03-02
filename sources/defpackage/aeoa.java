package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: aeoa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeoa extends AnimatorListenerAdapter {
    final /* synthetic */ aeoe a;

    public aeoa(aeoe aeoe) {
        this.a = aeoe;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.c.setVisibility(8);
        if (!this.a.a.j()) {
            this.a.a.h();
        }
        this.a.a.b(2);
    }

    public final void onAnimationStart(Animator animator) {
        this.a.a.b(1);
    }
}
