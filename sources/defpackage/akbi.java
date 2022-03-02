package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: akbi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akbi extends AnimatorListenerAdapter {
    final /* synthetic */ int a;
    final /* synthetic */ akbj b;

    public akbi(akbj akbj, int i) {
        this.b = akbj;
        this.a = i;
    }

    public final void onAnimationEnd(Animator animator) {
        akbj akbj = this.b;
        akbj.c = this.a;
        akbj.d = 0.0f;
    }

    public final void onAnimationStart(Animator animator) {
        this.b.c = this.a;
    }
}
