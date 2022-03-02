package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ogn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ogn extends AnimatorListenerAdapter {
    final /* synthetic */ ogo a;

    public ogn(ogo ogo) {
        this.a = ogo;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.b.setVisibility(8);
        this.a.b.setAlpha(1.0f);
    }
}
