package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Illustration extends FrameLayout {
    public float a = 0.0f;
    private float b;
    private Drawable c;
    private Drawable d;
    private final Rect e = new Rect();
    private final Rect f = new Rect();
    private float g = 1.0f;

    public Illustration(Context context) {
        super(context);
        a((AttributeSet) null, 0);
    }

    private final void a(AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, alhx.j, i, 0);
            this.a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
        this.b = getResources().getDisplayMetrics().density * 8.0f;
        setWillNotDraw(false);
    }

    public final void onDraw(Canvas canvas) {
        if (this.c != null) {
            canvas.save();
            canvas.translate(0.0f, (float) this.f.height());
            float f2 = this.g;
            canvas.scale(f2, f2, 0.0f, 0.0f);
            int i = Build.VERSION.SDK_INT;
            if (a(this.c, getLayoutDirection())) {
                canvas.scale(-1.0f, 1.0f);
                canvas.translate((float) (-this.c.getBounds().width()), 0.0f);
            }
            this.c.draw(canvas);
            canvas.restore();
        }
        if (this.d != null) {
            canvas.save();
            int i2 = Build.VERSION.SDK_INT;
            if (a(this.d, getLayoutDirection())) {
                canvas.scale(-1.0f, 1.0f);
                canvas.translate((float) (-this.f.width()), 0.0f);
            }
            this.d.draw(canvas);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        Drawable drawable = this.d;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.d.getIntrinsicHeight();
            this.e.set(0, 0, i5, i6);
            if (this.a != 0.0f) {
                float f2 = ((float) i5) / ((float) intrinsicWidth);
                this.g = f2;
                intrinsicHeight = (int) (((float) intrinsicHeight) * f2);
                intrinsicWidth = i5;
            }
            Gravity.apply(55, intrinsicWidth, intrinsicHeight, this.e, this.f);
            this.d.setBounds(this.f);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, (int) Math.ceil((double) (((float) i5) / this.g)), (int) Math.ceil((double) (((float) (i6 - this.f.height())) / this.g)));
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (this.a != 0.0f) {
            float size = (float) ((int) (((float) View.MeasureSpec.getSize(i)) / this.a));
            setPadding(0, (int) (size - (size % this.b)), 0, 0);
        }
        int i3 = Build.VERSION.SDK_INT;
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        super.onMeasure(i, i2);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable != this.c) {
            this.c = drawable;
            invalidate();
            requestLayout();
        }
    }

    @Deprecated
    public final void setForeground(Drawable drawable) {
        a(drawable);
    }

    private static final boolean a(Drawable drawable, int i) {
        if (i != 1) {
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        return drawable.isAutoMirrored();
    }

    public Illustration(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet, 0);
    }

    public final void a(Drawable drawable) {
        if (drawable != this.d) {
            this.d = drawable;
            invalidate();
            requestLayout();
        }
    }

    public Illustration(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet, i);
    }
}
