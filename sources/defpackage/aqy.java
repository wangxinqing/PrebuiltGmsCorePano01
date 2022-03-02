package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.view.View;

/* renamed from: aqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aqy extends AnimatorListenerAdapter {
    private final View a;
    private boolean b = false;

    public aqy(View view) {
        this.a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        asc.a(this.a, 1.0f);
        if (this.b) {
            this.a.setLayerType(0, (Paint) null);
        }
    }

    public final void onAnimationStart(Animator animator) {
        if (qb.u(this.a) && this.a.getLayerType() == 0) {
            this.b = true;
            this.a.setLayerType(2, (Paint) null);
        }
    }
}
