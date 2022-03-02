package defpackage;

import android.animation.Animator;
import android.graphics.drawable.Drawable;

/* renamed from: vun  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vun extends vvc {
    final /* synthetic */ Drawable a;
    final /* synthetic */ vup b;

    public vun(vup vup, Drawable drawable) {
        this.b = vup;
        this.a = drawable;
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.b(this.a);
        this.b.E = null;
    }
}
