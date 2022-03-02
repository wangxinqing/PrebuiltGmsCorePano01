package defpackage;

import android.view.ViewTreeObserver;

/* renamed from: ffq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ffq implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ffr a;

    public ffq(ffr ffr) {
        this.a = ffr;
    }

    public final void onGlobalLayout() {
        this.a.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.a.b.a(this.a.a.getBottom());
    }
}
