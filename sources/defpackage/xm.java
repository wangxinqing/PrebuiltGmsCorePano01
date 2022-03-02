package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: xm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xm implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ xo a;

    public xm(xo xoVar) {
        this.a = xoVar;
    }

    public final void onGlobalLayout() {
        if (this.a.e()) {
            xo xoVar = this.a;
            if (!xoVar.a.p) {
                View view = xoVar.c;
                if (view != null && view.isShown()) {
                    this.a.a.ar();
                } else {
                    this.a.d();
                }
            }
        }
    }
}
