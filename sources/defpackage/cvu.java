package defpackage;

import android.os.Looper;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

/* renamed from: cvu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cvu implements View.OnLayoutChangeListener {
    final /* synthetic */ HorizontalScrollView a;
    final /* synthetic */ LinearLayout b;
    final /* synthetic */ cvv c;

    public cvu(cvv cvv, HorizontalScrollView horizontalScrollView, LinearLayout linearLayout) {
        this.c = cvv;
        this.a = horizontalScrollView;
        this.b = linearLayout;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.removeOnLayoutChangeListener(this);
        new qvr(Looper.getMainLooper()).post(new cvt(this, this.a, this.b));
    }
}
