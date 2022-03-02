package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: xtj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xtj implements View.OnLayoutChangeListener {
    final /* synthetic */ xtl a;

    public xtj(xtl xtl) {
        this.a = xtl;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup.LayoutParams layoutParams = this.a.d.getLayoutParams();
        layoutParams.height = this.a.d.getHeight();
        layoutParams.width = this.a.d.getWidth();
        this.a.d.setLayoutParams(layoutParams);
        this.a.d.removeOnLayoutChangeListener(this);
    }
}
