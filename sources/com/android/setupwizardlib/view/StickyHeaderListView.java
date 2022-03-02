package com.android.setupwizardlib.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ListView;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class StickyHeaderListView extends ListView {
    private View a;
    private View b;
    private int c = 0;
    private final RectF d = new RectF();

    public StickyHeaderListView(Context context) {
        super(context);
        a((AttributeSet) null, 16842868);
    }

    private final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, bdg.q, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            addHeaderView(LayoutInflater.from(getContext()).inflate(resourceId, this, false), (Object) null, false);
        }
        obtainStyledAttributes.recycle();
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.d.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        motionEvent.offsetLocation(-this.d.left, -this.d.top);
        return this.b.dispatchTouchEvent(motionEvent);
    }

    public final void draw(Canvas canvas) {
        View view;
        int i;
        super.draw(canvas);
        if (this.a != null) {
            int save = canvas.save();
            View view2 = this.b;
            if (view2 == null) {
                view = this.a;
            } else {
                view = view2;
            }
            if (view2 != null) {
                i = this.a.getTop();
            } else {
                i = 0;
            }
            if (view.getTop() + i < this.c || !view.isShown()) {
                this.d.set(0.0f, (float) ((-i) + this.c), (float) view.getWidth(), (float) ((view.getHeight() - i) + this.c));
                canvas.translate(0.0f, this.d.top);
                canvas.clipRect(0, 0, view.getWidth(), view.getHeight());
                view.draw(canvas);
            } else {
                this.d.setEmpty();
            }
            canvas.restoreToCount(save);
        }
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (getFitsSystemWindows()) {
            this.c = windowInsets.getSystemWindowInsetTop();
            windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return windowInsets;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (this.a != null) {
            i = 1;
        } else {
            i = 0;
        }
        accessibilityEvent.setItemCount(accessibilityEvent.getItemCount() - i);
        accessibilityEvent.setFromIndex(Math.max(accessibilityEvent.getFromIndex() - i, 0));
        int i2 = Build.VERSION.SDK_INT;
        accessibilityEvent.setToIndex(Math.max(accessibilityEvent.getToIndex() - i, 0));
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.a == null) {
            this.a = findViewWithTag("sticky");
            this.b = findViewWithTag("stickyContainer");
        }
    }

    public StickyHeaderListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet, 16842868);
    }

    public StickyHeaderListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet, i);
    }
}
