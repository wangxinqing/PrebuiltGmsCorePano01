package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: gp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gp extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ gj c;
    final /* synthetic */ mo d;
    final /* synthetic */ hb e;

    public gp(ViewGroup viewGroup, View view, gj gjVar, hb hbVar, mo moVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = gjVar;
        this.e = hbVar;
        this.d = moVar;
    }

    public final void onAnimationEnd(Animator animator) {
        Animator animator2;
        this.a.endViewTransition(this.b);
        gj gjVar = this.c;
        gg ggVar = gjVar.V;
        if (ggVar != null) {
            animator2 = ggVar.b;
        } else {
            animator2 = null;
        }
        gjVar.a((Animator) null);
        if (animator2 != null && this.a.indexOfChild(this.b) < 0) {
            this.e.b(this.c, this.d);
        }
    }
}
