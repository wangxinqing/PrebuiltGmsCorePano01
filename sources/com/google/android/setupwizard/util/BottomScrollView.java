package com.google.android.setupwizard.util;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BottomScrollView extends ScrollView {
    private final Runnable a = new alkf();

    public BottomScrollView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getChildAt(0) != null) {
            Math.max(0, ((getChildAt(0).getHeight() - i4) + i2) - getPaddingBottom());
        }
        if (i4 - i2 > 0) {
            post(this.a);
        }
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    public BottomScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
