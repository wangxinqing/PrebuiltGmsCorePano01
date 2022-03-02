package defpackage;

import android.os.Looper;
import android.view.View;

/* renamed from: cxs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cxs implements View.OnLayoutChangeListener {
    final /* synthetic */ cxt a;

    public cxs(cxt cxt) {
        this.a = cxt;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.s.removeOnLayoutChangeListener(this);
        int max = Math.max(i3 - i, i - i3);
        cxt cxt = this.a;
        if (max > cxt.u) {
            cxt.t.setClipChildren(true);
            new qvr(Looper.getMainLooper()).post(new cxr(this, max));
        }
    }
}
