package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: wj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wj implements View.OnAttachStateChangeListener {
    final /* synthetic */ wn a;

    public wj(wn wnVar) {
        this.a = wnVar;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.a.e;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.a.e = view.getViewTreeObserver();
            }
            wn wnVar = this.a;
            wnVar.e.removeGlobalOnLayoutListener(wnVar.c);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
