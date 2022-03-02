package com.google.android.gms.family.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ScrollToBottomView extends ScrollView {
    public mrc a;

    public ScrollToBottomView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    private final void a() {
        mrc mrc;
        if (((float) (getChildAt(getChildCount() - 1).getBottom() - (getHeight() + getScrollY()))) < getResources().getDimension(R.dimen.fm_create_bottom_margin) && (mrc = this.a) != null) {
            mrc.a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a();
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        a();
    }

    public ScrollToBottomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrollToBottomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
