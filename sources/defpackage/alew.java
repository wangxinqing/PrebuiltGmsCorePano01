package defpackage;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: alew  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alew implements Animation.AnimationListener {
    final /* synthetic */ View a;
    final /* synthetic */ int b;

    public alew(View view, int i) {
        this.a = view;
        this.b = i;
    }

    public final void onAnimationEnd(Animation animation) {
        this.a.setVisibility(this.b);
        this.a.clearAnimation();
        this.a.setTag((Object) null);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        this.a.setVisibility(0);
    }
}
