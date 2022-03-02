package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: ajwl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajwl extends Drawable {
    public final Paint a;
    float b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g = true;
    public ajzl h;
    private final ajzn i = new ajzn();
    private final Path j = new Path();
    private final Rect k = new Rect();
    private final RectF l = new RectF();
    private final RectF m = new RectF();
    private final ajwk n = new ajwk(this);
    private int o;
    private ColorStateList p;

    public ajwl(ajzl ajzl) {
        this.h = ajzl;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    /* access modifiers changed from: protected */
    public final RectF a() {
        this.m.set(getBounds());
        return this.m;
    }

    public final void draw(Canvas canvas) {
        if (this.g) {
            Paint paint = this.a;
            Rect rect = this.k;
            copyBounds(rect);
            float height = this.b / ((float) rect.height());
            paint.setShader(new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{lk.a(this.c, this.o), lk.a(this.d, this.o), lk.a(lk.b(this.d, 0), this.o), lk.a(lk.b(this.f, 0), this.o), lk.a(this.f, this.o), lk.a(this.e, this.o)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.g = false;
        }
        float strokeWidth = this.a.getStrokeWidth() / 2.0f;
        copyBounds(this.k);
        this.l.set(this.k);
        float min = Math.min(this.h.f.a(a()), this.l.width() / 2.0f);
        if (this.h.a(a())) {
            this.l.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.l, min, min, this.a);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.n;
    }

    public final int getOpacity() {
        return this.b > 0.0f ? -3 : -2;
    }

    public final void getOutline(Outline outline) {
        if (this.h.a(a())) {
            outline.setRoundRect(getBounds(), this.h.f.a(a()));
            return;
        }
        copyBounds(this.k);
        this.l.set(this.k);
        this.i.a(this.h, 1.0f, this.l, this.j);
        if (this.j.isConvex()) {
            outline.setConvexPath(this.j);
        }
    }

    public final boolean getPadding(Rect rect) {
        if (!this.h.a(a())) {
            return true;
        }
        int round = Math.round(this.b);
        rect.set(round, round, round, round);
        return true;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.g = true;
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.p;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.o)) == this.o)) {
            this.g = true;
            this.o = colorForState;
        }
        if (this.g) {
            invalidateSelf();
        }
        return this.g;
    }

    public final void setAlpha(int i2) {
        this.a.setAlpha(i2);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.o = colorStateList.getColorForState(getState(), this.o);
        }
        this.p = colorStateList;
        this.g = true;
        invalidateSelf();
    }
}
