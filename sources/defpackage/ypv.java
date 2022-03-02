package defpackage;

import android.view.ViewParent;

/* renamed from: ypv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ypv implements Runnable {
    final /* synthetic */ yqb a;

    public ypv(yqb yqb) {
        this.a = yqb;
    }

    public final void run() {
        yqb yqb = this.a;
        boolean z = false;
        if (!yqb.v) {
            yqb.i = 0;
        } else {
            yqb.i = 1;
        }
        ypl q = yqb.q();
        if (q != null && q.getListView() != null) {
            ViewParent parent = q.getListView().getParent();
            if (this.a.i != 0) {
                z = true;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }
}
