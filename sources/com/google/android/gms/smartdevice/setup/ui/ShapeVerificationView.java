package com.google.android.gms.smartdevice.setup.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ShapeVerificationView extends LinearLayout {
    public static final Typeface a = Typeface.create("google-sans", 0);
    public int[] b;
    public boolean c;
    public int d;
    public int e;

    public ShapeVerificationView(Context context) {
        super(context);
        a(context);
    }

    public static acnz a(int i, int i2, int[] iArr) {
        int i3 = (i & 192) >> 6;
        int i4 = 2;
        if (i3 == 0) {
            i4 = 1;
        } else if (i3 != 1) {
            i4 = i3 != 2 ? 4 : 3;
        }
        return new acnz(i4, iArr[(i & 48) >> 4], String.valueOf(Math.abs(((i << 8) | i2) % 10)));
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int childCount = getChildCount();
        if (childCount > 0) {
            int measuredWidth2 = getChildAt(0).getMeasuredWidth() * childCount;
            if (measuredWidth2 > measuredWidth) {
                int i3 = this.d - ((measuredWidth2 - measuredWidth) / childCount);
                for (int i4 = 0; i4 < childCount; i4++) {
                    ViewGroup.LayoutParams layoutParams = getChildAt(i4).findViewById(16908294).getLayoutParams();
                    layoutParams.width = i3;
                    layoutParams.height = i3;
                }
                invalidate();
            }
        }
    }

    public ShapeVerificationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public ShapeVerificationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private final void a(Context context) {
        this.b = context.getResources().getIntArray(R.array.smartdevice_google_500_colors);
        Resources resources = getResources();
        this.d = resources.getDimensionPixelSize(R.dimen.smartdevice_verification_shape_size);
        this.e = resources.getDimensionPixelSize(R.dimen.smartdevice_verification_shape_padding);
    }
}
