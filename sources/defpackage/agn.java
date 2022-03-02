package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: agn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agn extends Drawable {
    public float a;
    public float b;
    public boolean c = false;
    public boolean d = true;
    public final ColorStateList e;
    private final Paint f;
    private final RectF g;
    private final Rect h;
    private PorterDuffColorFilter i;
    private ColorStateList j;
    private PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    public agn(ColorStateList colorStateList, float f2) {
        this.a = f2;
        this.f = new Paint(5);
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.e = colorStateList;
        this.f.setColor(colorStateList.getColorForState(getState(), this.e.getDefaultColor()));
        this.g = new RectF();
        this.h = new Rect();
    }

    private final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void draw(Canvas canvas) {
        Paint paint = this.f;
        boolean z = false;
        if (this.i != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.i);
            z = true;
        }
        RectF rectF = this.g;
        float f2 = this.a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.h, this.a);
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.e;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(rect);
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.e;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState != this.f.getColor()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.k) == null) {
            return z;
        }
        this.i = a(colorStateList2, mode);
        return true;
    }

    public final void setAlpha(int i2) {
        this.f.setAlpha(i2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.i = a(colorStateList, this.k);
        invalidateSelf();
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        this.i = a(this.j, mode);
        invalidateSelf();
    }

    public final void a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.g.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.h.set(rect);
        if (this.c) {
            float a2 = ago.a(this.b, this.a, this.d);
            this.h.inset((int) Math.ceil((double) ago.b(this.b, this.a, this.d)), (int) Math.ceil((double) a2));
            this.g.set(this.h);
        }
    }
}
