package com.google.android.gms.accountsettings.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ButtonBarLayout extends LinearLayout {
    private boolean a;
    private int b = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = context.getResources().getConfiguration().screenHeightDp >= 320;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, crk.b);
        this.a = obtainStyledAttributes.getBoolean(0, z);
        obtainStyledAttributes.recycle();
    }

    private final boolean a() {
        return getOrientation() == 1;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        boolean z = false;
        if (this.a) {
            if (size > this.b && a()) {
                a(false);
            }
            this.b = size;
        }
        if (a() || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.a && !a() && (getMeasuredWidthAndState() & -16777216) == 16777216) {
            a(true);
        } else if (!z) {
            return;
        }
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        int i;
        int i2;
        setOrientation(z ? 1 : 0);
        if (!z) {
            i = 80;
        } else {
            i = 8388613;
        }
        setGravity(i);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            if (!z) {
                i2 = 4;
            } else {
                i2 = 8;
            }
            findViewById.setVisibility(i2);
        }
        if (!z) {
            bringChildToFront(findViewById(R.id.button_positive));
        } else {
            bringChildToFront(findViewById(R.id.button_negative));
        }
    }
}
