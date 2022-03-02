package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;

/* renamed from: ajxl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ajxl extends ViewGroup {
    public int f;
    public int g;
    public boolean h;
    public int i;

    public ajxl(Context context) {
        this(context, (AttributeSet) null);
    }

    private static int a(int i2, int i3, int i4) {
        if (i3 != Integer.MIN_VALUE) {
            return i3 != 1073741824 ? i4 : i2;
        }
        return Math.min(i4, i2);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        if (getChildCount() != 0) {
            this.i = 1;
            int h2 = qb.h(this);
            int paddingLeft = h2 != 1 ? getPaddingLeft() : getPaddingRight();
            int paddingRight = h2 != 1 ? getPaddingRight() : getPaddingLeft();
            int paddingTop = getPaddingTop();
            int i8 = (i4 - i2) - paddingRight;
            int i9 = paddingLeft;
            int i10 = paddingTop;
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() == 8) {
                    childAt.setTag(R.id.row_index_key, -1);
                } else {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        i6 = ph.a(marginLayoutParams);
                        i7 = ph.b(marginLayoutParams);
                    } else {
                        i7 = 0;
                        i6 = 0;
                    }
                    int measuredWidth = i9 + i6 + childAt.getMeasuredWidth();
                    if (!this.h && measuredWidth > i8) {
                        paddingTop = i10 + this.f;
                        this.i++;
                        i9 = paddingLeft;
                    }
                    childAt.setTag(R.id.row_index_key, Integer.valueOf(this.i - 1));
                    int i12 = i9 + i6;
                    int measuredWidth2 = childAt.getMeasuredWidth() + i12;
                    int measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                    if (h2 == 1) {
                        childAt.layout(i8 - measuredWidth2, paddingTop, (i8 - i9) - i6, measuredHeight);
                    } else {
                        childAt.layout(i12, paddingTop, measuredWidth2, measuredHeight);
                    }
                    i9 += i6 + i7 + childAt.getMeasuredWidth() + this.g;
                    i10 = measuredHeight;
                }
            }
            return;
        }
        this.i = 0;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i4 = size;
        } else {
            i4 = Integer.MAX_VALUE;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i4 - getPaddingRight();
        int i8 = paddingTop;
        int i9 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i2, i3);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = marginLayoutParams.leftMargin;
                    i5 = marginLayoutParams.rightMargin;
                } else {
                    i6 = 0;
                    i5 = 0;
                }
                int i11 = paddingLeft;
                if (paddingLeft + i6 + childAt.getMeasuredWidth() > paddingRight && !this.h) {
                    i7 = getPaddingLeft();
                    i8 = this.f + paddingTop;
                } else {
                    i7 = i11;
                }
                int measuredWidth = i7 + i6 + childAt.getMeasuredWidth();
                int measuredHeight = i8 + childAt.getMeasuredHeight();
                if (measuredWidth > i9) {
                    i9 = measuredWidth;
                }
                paddingLeft = i7 + i6 + i5 + childAt.getMeasuredWidth() + this.g;
                if (i10 == getChildCount() - 1) {
                    i9 += i5;
                }
                paddingTop = measuredHeight;
            } else {
                int i12 = i2;
                int i13 = i3;
                int i14 = paddingLeft;
            }
        }
        setMeasuredDimension(a(size, mode, i9 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    public ajxl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ajxp.a, 0, 0);
        this.f = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public ajxl(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.h = false;
        a(context, attributeSet);
    }

    public ajxl(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.h = false;
        a(context, attributeSet);
    }
}
