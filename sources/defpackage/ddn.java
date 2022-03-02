package defpackage;

import android.view.View;

/* renamed from: ddn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ddn implements View.OnLayoutChangeListener {
    final /* synthetic */ ddp a;

    public ddn(ddp ddp) {
        this.a = ddp;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.a.getView() != null) {
            this.a.d.removeOnLayoutChangeListener(this);
            int measuredWidth = this.a.d.getChildAt(0).getMeasuredWidth() - this.a.d.getMeasuredWidth();
            if (measuredWidth == 0) {
                this.a.e.setVisibility(8);
                return;
            }
            ddp ddp = this.a;
            if (ddp.h == null) {
                ddp.a(ddp.d.getScrollX(), measuredWidth);
                this.a.h = new ddm(this, measuredWidth);
                this.a.d.getViewTreeObserver().addOnScrollChangedListener(this.a.h);
            }
        }
    }
}
