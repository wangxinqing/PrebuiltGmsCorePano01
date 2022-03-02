package com.android.setupwizardlib.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.R;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ButtonBarLayout extends LinearLayout {
    private boolean a = false;
    private int b;
    private int c;

    public ButtonBarLayout(Context context) {
        super(context);
    }

    private final void a(boolean z) {
        if (this.a != z) {
            this.a = z;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (z) {
                    childAt.setTag(R.id.suw_original_weight, Float.valueOf(layoutParams.weight));
                    layoutParams.weight = 0.0f;
                } else {
                    Float f = (Float) childAt.getTag(R.id.suw_original_weight);
                    if (f != null) {
                        layoutParams.weight = f.floatValue();
                    }
                }
                childAt.setLayoutParams(layoutParams);
            }
            setOrientation(z ? 1 : 0);
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                bringChildToFront(getChildAt(i2));
            }
            if (z) {
                this.b = getPaddingLeft();
                int paddingRight = getPaddingRight();
                this.c = paddingRight;
                int max = Math.max(this.b, paddingRight);
                setPadding(max, getPaddingTop(), max, getPaddingBottom());
                return;
            }
            setPadding(this.b, getPaddingTop(), this.c, getPaddingBottom());
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        a(false);
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
            z = true;
        } else {
            i3 = i;
            z = false;
        }
        super.onMeasure(i3, i2);
        if (getMeasuredWidth() > size) {
            a(true);
        } else if (!z) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
