package defpackage;

import android.view.ViewParent;

/* renamed from: aat  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aat implements Runnable {
    final /* synthetic */ aav a;

    public aat(aav aav) {
        this.a = aav;
    }

    public final void run() {
        ViewParent parent = this.a.c.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
