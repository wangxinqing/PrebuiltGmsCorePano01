package defpackage;

import android.view.ViewTreeObserver;

/* renamed from: ewi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ewi implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ewj a;

    public ewi(ewj ewj) {
        this.a = ewj;
    }

    public final void onGlobalLayout() {
        this.a.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.a.g.a(this.a.a.getBottom());
    }
}
