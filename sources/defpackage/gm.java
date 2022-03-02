package defpackage;

import android.animation.Animator;
import android.view.View;

/* renamed from: gm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gm implements mn {
    final /* synthetic */ gj a;

    public gm(gj gjVar) {
        this.a = gjVar;
    }

    public final void a() {
        if (this.a.f() != null) {
            View f = this.a.f();
            this.a.a((View) null);
            f.clearAnimation();
        }
        this.a.a((Animator) null);
    }
}
