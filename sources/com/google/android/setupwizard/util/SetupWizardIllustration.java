package com.google.android.setupwizard.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SetupWizardIllustration extends FrameLayout {
    public Drawable a;
    private float b;
    private Drawable c;
    private final Rect d;
    private final Rect e;
    private float f;
    private float g;
    private float h;

    public SetupWizardIllustration(Context context) {
        this(context, (AttributeSet) null);
    }

    private final void a(int i, int i2, Rect rect, Rect rect2, int i3) {
        Gravity.apply(55, i, i2, rect, rect2, i3);
        this.f = ((float) rect2.width()) / ((float) i);
        this.g = ((float) rect2.height()) / ((float) i2);
    }

    public final void onDraw(Canvas canvas) {
        int layoutDirection = getLayoutDirection();
        if (this.c != null) {
            canvas.save();
            canvas.translate(0.0f, (float) this.e.height());
            canvas.scale(this.f, this.g, 0.0f, 0.0f);
            if (layoutDirection == 1 && this.c.isAutoMirrored()) {
                canvas.scale(-1.0f, 1.0f);
                canvas.translate((float) (-this.c.getBounds().width()), 0.0f);
            }
            this.c.draw(canvas);
            canvas.restore();
        }
        if (this.a != null) {
            canvas.save();
            if (layoutDirection == 1 && this.a.isAutoMirrored()) {
                canvas.scale(-1.0f, 1.0f);
                canvas.translate((float) (-this.e.width()), 0.0f);
            }
            this.a.draw(canvas);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        Drawable drawable = this.a;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.a.getIntrinsicHeight();
            int layoutDirection = getLayoutDirection();
            this.d.set(0, 0, i5, i6);
            a(intrinsicWidth, intrinsicHeight, this.d, this.e, layoutDirection);
            if (this.h != 0.0f) {
                float f2 = this.f;
                a((int) (((float) intrinsicWidth) * f2), (int) (((float) intrinsicHeight) * f2), this.d, this.e, layoutDirection);
            }
            this.a.setBounds(this.e);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, (int) Math.ceil((double) (((float) i5) / this.f)), (int) Math.ceil((double) (((float) (i6 - this.e.height())) / this.g)));
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (this.h != 0.0f) {
            float size = (float) ((int) (((float) View.MeasureSpec.getSize(i)) / this.h));
            setPadding(0, (int) (size - (size % this.b)), 0, 0);
        }
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        super.onMeasure(i, i2);
    }

    public final void setBackground(Drawable drawable) {
        this.c = drawable;
    }

    public final void setForeground(Drawable drawable) {
        this.a = drawable;
    }

    public SetupWizardIllustration(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SetupWizardIllustration(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SetupWizardIllustration(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, crk.f, 0, 0);
            this.h = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
        this.b = getResources().getDisplayMetrics().density * 8.0f;
        setWillNotDraw(false);
    }
}
