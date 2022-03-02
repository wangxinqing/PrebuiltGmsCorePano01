package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: hf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hf extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ gj c;

    public hf(ViewGroup viewGroup, View view, gj gjVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = gjVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.b);
        animator.removeListener(this);
        gj gjVar = this.c;
        View view = gjVar.S;
        if (view != null && gjVar.K) {
            view.setVisibility(8);
        }
    }
}
