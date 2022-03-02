package com.google.android.gms.common.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MultiLineLayout extends ViewGroup {
    private int a = 0;
    private int b = 0;

    public MultiLineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final int a(int i) {
        return jjy.a() ? i - getPaddingStart() : getPaddingStart();
    }

    private final int b(int i) {
        return (i - getPaddingStart()) - getPaddingEnd();
    }

    public final int getPaddingEnd() {
        return !jjy.a() ? getPaddingRight() : getPaddingLeft();
    }

    public final int getPaddingStart() {
        return !jjy.a() ? getPaddingLeft() : getPaddingRight();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int a2 = a(i5);
        int paddingTop2 = getPaddingTop();
        int b2 = b(i5);
        int childCount = getChildCount();
        int i6 = 1;
        this.a = 1;
        this.b = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (this.b < measuredHeight) {
                    this.b = measuredHeight;
                }
                if (a(a2, measuredWidth, paddingStart, b2)) {
                    this.a += i6;
                    a2 = a(i5);
                    paddingTop2 += i8 + paddingTop;
                    i8 = 0;
                }
                if (jjy.a()) {
                    childAt.layout(a2 - measuredWidth, paddingTop2, a2, paddingTop2 + measuredHeight);
                    a2 -= measuredWidth + paddingStart;
                } else {
                    childAt.layout(a2, paddingTop2, a2 + measuredWidth, paddingTop2 + measuredHeight);
                    a2 += measuredWidth + paddingStart;
                }
                i8 = Math.max(i8, measuredHeight);
            }
            i7++;
            i6 = 1;
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5 = i;
        int i6 = i2;
        int resolveSize = resolveSize(Integer.MAX_VALUE, i5);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int a2 = a(resolveSize);
        int paddingTop2 = getPaddingTop();
        int b2 = b(resolveSize);
        int childCount = getChildCount();
        this.a = 1;
        this.b = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            int i11 = childCount;
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i5, i6);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (this.b < measuredHeight) {
                    this.b = measuredHeight;
                }
                if (a(a2, measuredWidth, paddingStart, b2)) {
                    this.a++;
                    a2 = a(resolveSize);
                    paddingTop2 += i10 + paddingTop;
                    i10 = 0;
                }
                if (!jjy.a()) {
                    i4 = a2 + measuredWidth;
                } else {
                    i4 = a2 - measuredWidth;
                }
                i8 = Math.max(i8, i4);
                i9 = Math.max(i9, paddingTop2 + measuredHeight);
                if (!jjy.a()) {
                    a2 += measuredWidth + paddingStart;
                } else {
                    a2 -= measuredWidth + paddingStart;
                }
                i10 = Math.max(i10, measuredHeight);
            }
            i7++;
            childCount = i11;
        }
        if (jjy.a()) {
            i3 = i8 - getPaddingEnd();
        } else {
            i3 = i8 + getPaddingEnd();
        }
        setMeasuredDimension(resolveSize(i3, i5), resolveSize(i9 + getPaddingBottom(), i6));
    }

    private static final boolean a(int i, int i2, int i3, int i4) {
        return !jjy.a() ? i + i2 > i4 : i - i2 < i3;
    }
}
