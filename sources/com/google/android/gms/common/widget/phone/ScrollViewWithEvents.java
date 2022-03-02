package com.google.android.gms.common.widget.phone;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ScrollViewWithEvents extends ScrollView implements ViewTreeObserver.OnGlobalLayoutListener {
    public jmi a;
    public jmh b;
    private boolean c;

    public ScrollViewWithEvents(Context context) {
        super(context);
    }

    private final void a(int i) {
        boolean b2 = b(i);
        if (b2 != this.c) {
            this.c = b2;
            jmi jmi = this.a;
            if (jmi != null) {
                jmi.a(this, b2);
            }
        }
    }

    private final boolean b(int i) {
        return getChildAt(getChildCount() + -1).getBottom() - (i + getHeight()) <= 0;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }

    public final void onGlobalLayout() {
        a(getScrollY());
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        jmh jmh = this.b;
        if (jmh != null) {
            jmh.a(i2);
        }
        if (i2 == i4) {
            return;
        }
        if (this.c || i2 > i4) {
            a(i2);
        }
    }

    public ScrollViewWithEvents(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScrollViewWithEvents(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final boolean a() {
        boolean b2 = b(getScrollY());
        this.c = b2;
        return b2;
    }
}
