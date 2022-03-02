package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;

/* renamed from: xw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xw implements Runnable {
    final /* synthetic */ ActionBarOverlayLayout a;

    public xw(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    public final void run() {
        this.a.c();
        ActionBarOverlayLayout actionBarOverlayLayout = this.a;
        actionBarOverlayLayout.h = actionBarOverlayLayout.b.animate().translationY(0.0f).setListener(this.a.i);
    }
}
