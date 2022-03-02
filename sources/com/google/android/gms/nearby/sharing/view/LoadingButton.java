package com.google.android.gms.nearby.sharing.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LoadingButton extends AppCompatButton {
    private int c;
    private boolean d = false;
    private boolean e = false;
    private vwn f;

    public LoadingButton(Context context) {
        super(context);
        a(context);
    }

    private final void a(Context context) {
        this.c = getCurrentTextColor();
        vwn vwn = new vwn(context);
        this.f = vwn;
        vwn.setCallback(this);
    }

    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.d) {
            this.f.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        double min = (double) Math.min(measuredWidth, measuredHeight);
        Double.isNaN(min);
        int i3 = (int) (min * 0.7d);
        int i4 = i3 / 2;
        int paddingLeft = (getPaddingLeft() + (measuredWidth / 2)) - i4;
        int paddingTop = (getPaddingTop() + (measuredHeight / 2)) - i4;
        this.f.setBounds(paddingLeft, paddingTop, paddingLeft + i3, i3 + paddingTop);
    }

    public final void setTextColor(int i) {
        if (this.e) {
            this.c = i;
        }
        if (this.d) {
            i = 1193046;
        }
        super.setTextColor(i);
    }

    public LoadingButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void a(boolean z) {
        int i;
        this.d = z;
        this.e = false;
        if (!z) {
            i = this.c;
        } else {
            i = 1193046;
        }
        setTextColor(i);
        this.e = true;
        setEnabled(true ^ this.d);
        if (!this.d) {
            vwn vwn = this.f;
            ValueAnimator valueAnimator = vwn.b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                vwn.b = null;
            }
            vwn.invalidateSelf();
        } else {
            vwn vwn2 = this.f;
            vwn2.b = ValueAnimator.ofInt(new int[]{0, 10000});
            vwn2.b.setDuration(3000);
            vwn2.b.setInterpolator(new LinearInterpolator());
            vwn2.b.addUpdateListener(new vwm(vwn2));
            vwn2.b.setRepeatCount(-1);
            vwn2.b.start();
        }
        invalidate();
    }

    public LoadingButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
