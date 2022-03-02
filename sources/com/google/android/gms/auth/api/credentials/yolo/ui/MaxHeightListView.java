package com.google.android.gms.auth.api.credentials.yolo.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MaxHeightListView extends ListView {
    private int a;

    public MaxHeightListView(Context context) {
        super(context);
        a(context, (AttributeSet) null);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, crk.d);
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, 300);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (this.a > 0) {
            int size = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.min(size, this.a), mode);
            } else {
                i2 = View.MeasureSpec.makeMeasureSpec(this.a, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i, i2);
    }

    public MaxHeightListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a(context, attributeSet);
    }

    public MaxHeightListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }
}
