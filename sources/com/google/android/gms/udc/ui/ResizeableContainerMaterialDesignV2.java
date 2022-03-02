package com.google.android.gms.udc.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.cast.JGCastService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ResizeableContainerMaterialDesignV2 extends LinearLayout {
    private int a = 0;
    private int b = 0;

    public ResizeableContainerMaterialDesignV2(Context context) {
        super(context);
    }

    private static int a(int i, float f) {
        return Math.round(((float) i) * f);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        int i5 = displayMetrics.widthPixels;
        if (f != 0.0f) {
            i3 = Math.round(((float) i5) / f);
        } else {
            i3 = 0;
        }
        if (i3 < 600) {
            i4 = getContext().getResources().getConfiguration().orientation == 2 ? a(48, f) : a(24, f);
        } else if (i3 < 936) {
            i4 = a(48, f);
        } else if (i3 < 1240) {
            i = View.MeasureSpec.makeMeasureSpec(a(800, f), JGCastService.FLAG_PRIVATE_DISPLAY);
            i4 = -1;
        } else {
            i4 = a(200, f);
        }
        setPadding(i4, this.a, i4, this.b);
        super.onMeasure(i, i2);
    }

    public ResizeableContainerMaterialDesignV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842967, 16842969});
        this.a = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        this.b = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        obtainStyledAttributes.recycle();
    }

    public ResizeableContainerMaterialDesignV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }
}
