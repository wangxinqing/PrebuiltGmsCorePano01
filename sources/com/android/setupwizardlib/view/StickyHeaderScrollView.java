package com.android.setupwizardlib.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class StickyHeaderScrollView extends BottomScrollView {
    private View a;
    private View b;
    private int c = 0;

    public StickyHeaderScrollView(Context context) {
        super(context);
    }

    private final void a() {
        View view;
        int i;
        int i2 = Build.VERSION.SDK_INT;
        View view2 = this.a;
        if (view2 != null) {
            View view3 = this.b;
            if (view3 == null) {
                view = view2;
            } else {
                view = view3;
            }
            if (view3 != null) {
                i = view2.getTop();
            } else {
                i = 0;
            }
            if ((view.getTop() - getScrollY()) + i < this.c || !view.isShown()) {
                view.setTranslationY((float) (getScrollY() - i));
            } else {
                view.setTranslationY(0.0f);
            }
        }
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (!getFitsSystemWindows()) {
            return windowInsets;
        }
        this.c = windowInsets.getSystemWindowInsetTop();
        return windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.a == null) {
            this.a = findViewWithTag("sticky");
            this.b = findViewWithTag("stickyContainer");
        }
        a();
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        a();
    }

    public StickyHeaderScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StickyHeaderScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
