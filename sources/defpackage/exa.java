package defpackage;

import android.view.ViewTreeObserver;

/* renamed from: exa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class exa implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ exb a;

    public exa(exb exb) {
        this.a = exb;
    }

    public final void onGlobalLayout() {
        this.a.k.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.a.a.a(this.a.k.getBottom() + this.a.c.getBottom());
    }
}
