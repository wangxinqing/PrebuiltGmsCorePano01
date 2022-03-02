package defpackage;

import android.os.Looper;
import android.view.View;

/* renamed from: cxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cxo implements View.OnLayoutChangeListener {
    final /* synthetic */ cxp a;

    public cxo(cxp cxp) {
        this.a = cxp;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.s.removeOnLayoutChangeListener(this);
        new qvr(Looper.getMainLooper()).post(new cxn(this, Math.abs(i3 - i)));
    }
}
