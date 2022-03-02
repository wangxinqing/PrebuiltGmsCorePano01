package defpackage;

import android.view.ViewTreeObserver;

/* renamed from: ffo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ffo implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ffp a;

    public ffo(ffp ffp) {
        this.a = ffp;
    }

    public final void onGlobalLayout() {
        this.a.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.a.b.a(this.a.c.getBottom());
    }
}
