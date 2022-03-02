package defpackage;

import android.os.Build;
import android.view.ViewTreeObserver;

/* renamed from: ypw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ypw implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ yqb a;

    public ypw(yqb yqb) {
        this.a = yqb;
    }

    public final void onGlobalLayout() {
        int i = Build.VERSION.SDK_INT;
        this.a.g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        yqb yqb = this.a;
        yqb.q = yqb.g.getMeasuredHeight();
        yqb yqb2 = this.a;
        yqb2.r = yqb2.g.getMeasuredWidth();
        yqb yqb3 = this.a;
        if (yqb3.u) {
            yqb3.b(yqb3.s);
        }
    }
}
