package com.google.android.gms.contactsheet.card.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FlowLayout extends ViewGroup {
    private int a;
    private int b;

    public FlowLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private static int a(int i, int i2, int i3) {
        return i2 != Integer.MIN_VALUE ? i2 != 1073741824 ? i3 : i : Math.min(i3, i);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() != 0) {
            int i7 = Build.VERSION.SDK_INT;
            int layoutDirection = getLayoutDirection();
            int paddingLeft = layoutDirection != 1 ? getPaddingLeft() : getPaddingRight();
            int paddingRight = layoutDirection != 1 ? getPaddingRight() : getPaddingLeft();
            int paddingTop = getPaddingTop();
            int i8 = (i3 - i) - paddingRight;
            int i9 = paddingLeft;
            int i10 = paddingTop;
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams == null) {
                        i6 = 0;
                        i5 = 0;
                    } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        int i12 = Build.VERSION.SDK_INT;
                        i5 = marginLayoutParams.getMarginStart();
                        i6 = marginLayoutParams.getMarginEnd();
                    } else {
                        i6 = 0;
                        i5 = 0;
                    }
                    if (i9 + i5 + childAt.getMeasuredWidth() > i8) {
                        paddingTop = this.a + i10;
                        i9 = paddingLeft;
                    }
                    int i13 = i9 + i5;
                    int measuredWidth = childAt.getMeasuredWidth() + i13;
                    int measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                    if (layoutDirection == 1) {
                        childAt.layout(i8 - measuredWidth, paddingTop, (i8 - i9) - i5, measuredHeight);
                    } else {
                        childAt.layout(i13, paddingTop, measuredWidth, measuredHeight);
                    }
                    i9 += i5 + i6 + childAt.getMeasuredWidth() + this.b;
                    i10 = measuredHeight;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i3 = size;
        } else {
            i3 = Integer.MAX_VALUE;
        }
        if (getChildCount() == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i3 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                int i10 = i;
                int i11 = i2;
            } else {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams == null) {
                    i5 = 0;
                    i4 = 0;
                } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = marginLayoutParams.leftMargin;
                    i4 = marginLayoutParams.rightMargin;
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                int i12 = paddingLeft;
                if (paddingLeft + i5 + childAt.getMeasuredWidth() > paddingRight) {
                    i6 = getPaddingLeft();
                    i7 = this.a + paddingTop;
                } else {
                    i6 = i12;
                }
                int measuredWidth = i6 + i5 + childAt.getMeasuredWidth();
                int measuredHeight = i7 + childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft = i6 + i5 + i4 + childAt.getMeasuredWidth() + this.b;
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i8), a(size2, mode2, paddingTop));
    }

    public FlowLayout(Context context, int i, int i2) {
        super(context);
        this.a = i;
        this.b = i2;
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (azim.b()) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ydn.a, 0, 0);
            try {
                this.a = obtainStyledAttributes.getDimensionPixelSize(1, 0);
                this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.a = 0;
            this.b = 0;
        }
    }
}
