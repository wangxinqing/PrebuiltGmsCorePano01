package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: xn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xn implements View.OnAttachStateChangeListener {
    final /* synthetic */ xo a;

    public xn(xo xoVar) {
        this.a = xoVar;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.a.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.a.d = view.getViewTreeObserver();
            }
            xo xoVar = this.a;
            xoVar.d.removeGlobalOnLayoutListener(xoVar.b);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
