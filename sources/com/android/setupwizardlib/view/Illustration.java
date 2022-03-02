package com.android.setupwizardlib.view;

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

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Illustration extends FrameLayout {
    private float a;
    private Drawable b;
    private Drawable c;
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private float f = 1.0f;
    private float g = 0.0f;

    public Illustration(Context context) {
        super(context);
        a((AttributeSet) null, 0);
    }

    private final void a(AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, bdg.k, i, 0);
            this.g = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
        this.a = getResources().getDisplayMetrics().density * 8.0f;
        setWillNotDraw(false);
    }

    public final void onDraw(Canvas canvas) {
        if (this.b != null) {
            canvas.save();
            canvas.translate(0.0f, (float) this.e.height());
            float f2 = this.f;
            canvas.scale(f2, f2, 0.0f, 0.0f);
            int i = Build.VERSION.SDK_INT;
            if (a(this.b, getLayoutDirection())) {
                canvas.scale(-1.0f, 1.0f);
                canvas.translate((float) (-this.b.getBounds().width()), 0.0f);
            }
            this.b.draw(canvas);
            canvas.restore();
        }
        if (this.c != null) {
            canvas.save();
            int i2 = Build.VERSION.SDK_INT;
            if (a(this.c, getLayoutDirection())) {
                canvas.scale(-1.0f, 1.0f);
                canvas.translate((float) (-this.e.width()), 0.0f);
            }
            this.c.draw(canvas);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        Drawable drawable = this.c;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.c.getIntrinsicHeight();
            this.d.set(0, 0, i5, i6);
            if (this.g != 0.0f) {
                float f2 = ((float) i5) / ((float) intrinsicWidth);
                this.f = f2;
                intrinsicHeight = (int) (((float) intrinsicHeight) * f2);
                intrinsicWidth = i5;
            }
            Gravity.apply(55, intrinsicWidth, intrinsicHeight, this.d, this.e);
            this.c.setBounds(this.e);
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, (int) Math.ceil((double) (((float) i5) / this.f)), (int) Math.ceil((double) (((float) (i6 - this.e.height())) / this.f)));
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (this.g != 0.0f) {
            float size = (float) ((int) (((float) View.MeasureSpec.getSize(i)) / this.g));
            setPadding(0, (int) (size - (size % this.a)), 0, 0);
        }
        int i3 = Build.VERSION.SDK_INT;
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        super.onMeasure(i, i2);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable != this.b) {
            this.b = drawable;
            invalidate();
            requestLayout();
        }
    }

    @Deprecated
    public final void setForeground(Drawable drawable) {
        if (drawable != this.c) {
            this.c = drawable;
            invalidate();
            requestLayout();
        }
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

    public Illustration(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet, i);
    }
}
