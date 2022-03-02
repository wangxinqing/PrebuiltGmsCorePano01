package defpackage;

import android.view.ViewTreeObserver;

/* renamed from: ewl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ewl implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ewm a;

    public ewl(ewm ewm) {
        this.a = ewm;
    }

    public final void onGlobalLayout() {
        this.a.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.a.b.a(this.a.a.getBottom());
    }
}
