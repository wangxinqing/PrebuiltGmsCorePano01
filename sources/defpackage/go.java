package defpackage;

import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: go  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class go implements Animation.AnimationListener {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ gj b;
    final /* synthetic */ mo c;
    final /* synthetic */ hb d;

    public go(ViewGroup viewGroup, gj gjVar, hb hbVar, mo moVar) {
        this.a = viewGroup;
        this.b = gjVar;
        this.d = hbVar;
        this.c = moVar;
    }

    public final void onAnimationEnd(Animation animation) {
        this.a.post(new gn(this));
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
