package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ChipGroup extends ajxl {
    public boolean a;
    public boolean b;
    public final ajuk c;
    public int d;
    public boolean e;
    private int j;
    private int k;
    private ajum l;

    public ChipGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void a(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.e = true;
            ((Chip) findViewById).setChecked(z);
            this.e = false;
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.d;
                if (i2 != -1 && this.a) {
                    a(i2, false);
                }
                this.d = chip.getId();
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof ajul);
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ajul();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ajul(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.d;
        if (i != -1) {
            a(i, true);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        qs a2 = qs.a(accessibilityNodeInfo);
        if (this.h) {
            i = 0;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) instanceof Chip) {
                    i++;
                }
            }
        } else {
            i = -1;
        }
        int i4 = this.i;
        if (!this.a) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        a2.a((Object) qq.a(i4, i, i2));
    }

    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.l.a = onHierarchyChangeListener;
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ajul(layoutParams);
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(akdg.a(context, attributeSet, i, 2132019038), attributeSet, i);
        this.c = new ajuk(this);
        this.l = new ajum(this);
        this.d = -1;
        this.e = false;
        TypedArray a2 = ajya.a(getContext(), attributeSet, ajun.b, i, 2132019038, new int[0]);
        int dimensionPixelOffset = a2.getDimensionPixelOffset(1, 0);
        int dimensionPixelOffset2 = a2.getDimensionPixelOffset(2, dimensionPixelOffset);
        if (this.j != dimensionPixelOffset2) {
            this.j = dimensionPixelOffset2;
            this.g = dimensionPixelOffset2;
            requestLayout();
        }
        int dimensionPixelOffset3 = a2.getDimensionPixelOffset(3, dimensionPixelOffset);
        if (this.k != dimensionPixelOffset3) {
            this.k = dimensionPixelOffset3;
            this.f = dimensionPixelOffset3;
            requestLayout();
        }
        this.h = a2.getBoolean(5, false);
        boolean z = a2.getBoolean(6, false);
        if (this.a != z) {
            this.a = z;
            this.e = true;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.e = false;
            this.d = -1;
        }
        this.b = a2.getBoolean(4, false);
        int resourceId = a2.getResourceId(0, -1);
        if (resourceId != -1) {
            this.d = resourceId;
        }
        a2.recycle();
        super.setOnHierarchyChangeListener(this.l);
        qb.b((View) this, 1);
    }
}
