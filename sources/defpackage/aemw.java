package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: aemw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aemw extends Drawable {
    private final Drawable a;
    private final Drawable b;
    private final float[] c = new float[2];
    private float d;

    public aemw(Drawable drawable, Drawable drawable2) {
        this.a = drawable.getConstantState().newDrawable().mutate();
        Drawable mutate = drawable2.getConstantState().newDrawable().mutate();
        this.b = mutate;
        mutate.setAlpha(0);
    }

    public final void a(float f) {
        if (this.d != f) {
            this.d = f;
            aemy.a(f, this.c);
            this.a.setAlpha((int) (this.c[0] * 255.0f));
            this.b.setAlpha((int) (this.c[1] * 255.0f));
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        this.a.draw(canvas);
        this.b.draw(canvas);
    }

    public final int getIntrinsicHeight() {
        return Math.max(this.a.getIntrinsicHeight(), this.b.getIntrinsicHeight());
    }

    public final int getIntrinsicWidth() {
        return Math.max(this.a.getIntrinsicWidth(), this.b.getIntrinsicWidth());
    }

    public final int getMinimumHeight() {
        return Math.max(this.a.getMinimumHeight(), this.b.getMinimumHeight());
    }

    public final int getMinimumWidth() {
        return Math.max(this.a.getMinimumWidth(), this.b.getMinimumWidth());
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        return this.a.isStateful() || this.b.isStateful();
    }

    public final void setAlpha(int i) {
        if (this.d <= 0.5f) {
            this.a.setAlpha(i);
            this.b.setAlpha(0);
        } else {
            this.a.setAlpha(0);
            this.b.setAlpha(i);
        }
        invalidateSelf();
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.a.setBounds(i, i2, i3, i4);
        this.b.setBounds(i, i2, i3, i4);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final boolean setState(int[] iArr) {
        return this.a.setState(iArr) || this.b.setState(iArr);
    }
}
