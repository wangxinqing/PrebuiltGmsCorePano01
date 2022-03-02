package com.google.android.gms.contactsheet.card.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AdjustableTextView extends TextView {
    public AdjustableTextView(Context context) {
        super(context);
        int i;
        if (qb.h(this) == 1) {
            i = 5;
        } else {
            i = 3;
        }
        setGravity(i);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (azim.b()) {
            i3 = ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / getLineHeight();
        } else {
            i3 = (getMeasuredHeight() - getPaddingBottom()) / getLineHeight();
        }
        setMaxLines(i3);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
    }

    public AdjustableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        if (qb.h(this) == 1) {
            i = 5;
        } else {
            i = 3;
        }
        setGravity(i);
    }
}
