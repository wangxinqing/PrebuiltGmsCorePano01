package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: akdn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akdn extends AnimatorListenerAdapter {
    final /* synthetic */ View a;

    public akdn(View view) {
        this.a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(4);
    }
}
