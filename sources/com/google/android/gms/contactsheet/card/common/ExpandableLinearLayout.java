package com.google.android.gms.contactsheet.card.common;

import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ExpandableLinearLayout extends LinearLayout {
    public ExpandableLinearLayout(Context context) {
        super(context);
        b();
    }

    public final void a() {
        a(Integer.MAX_VALUE);
    }

    public ExpandableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    private final void b() {
        int i = Build.VERSION.SDK_INT;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setAnimateParentHierarchy(false);
        layoutTransition.disableTransitionType(1);
        layoutTransition.disableTransitionType(3);
        setLayoutTransition(layoutTransition);
    }

    public final void a(int i) {
        int i2 = 0;
        while (i2 < getChildCount()) {
            getChildAt(i2).setVisibility(i2 < i ? 0 : 8);
            i2++;
        }
    }
}
