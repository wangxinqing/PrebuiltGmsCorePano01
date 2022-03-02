package com.google.android.setupdesign.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class StickyHeaderRecyclerView extends HeaderRecyclerView {
    private View b;
    private int c = 0;
    private final RectF d = new RectF();

    public StickyHeaderRecyclerView(Context context) {
        super(context);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.d.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        motionEvent.offsetLocation(-this.d.left, -this.d.top);
        return this.a.dispatchTouchEvent(motionEvent);
    }

    public final void draw(Canvas canvas) {
        View view;
        int i;
        super.draw(canvas);
        if (this.b != null) {
            View view2 = this.a;
            int save = canvas.save();
            if (view2 == null) {
                view = this.b;
            } else {
                view = view2;
            }
            if (view2 != null) {
                i = this.b.getTop();
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

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        View view2;
        super.onLayout(z, i, i2, i3, i4);
        if (this.b == null && (view2 = this.a) != null) {
            this.b = view2.findViewWithTag("sticky");
        }
        if (this.b != null && (view = this.a) != null && view.getHeight() == 0) {
            view.layout(0, -view.getMeasuredHeight(), view.getMeasuredWidth(), 0);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.b != null) {
            measureChild(this.a, i, i2);
        }
    }

    public StickyHeaderRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StickyHeaderRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
