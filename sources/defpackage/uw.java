package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.gms.R;

/* renamed from: uw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uw extends Drawable {
    private static final float b = ((float) Math.toRadians(45.0d));
    private final Paint a = new Paint();
    private final float c;
    private final float d;
    private final float e;
    private float f;
    private boolean g;
    private final Path h = new Path();
    private final int i;
    private float j;
    private float k;
    private final int l = 2;

    public uw(Context context) {
        this.a.setStyle(Paint.Style.STROKE);
        this.a.setStrokeJoin(Paint.Join.MITER);
        this.a.setStrokeCap(Paint.Cap.BUTT);
        this.a.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, uh.m, R.attr.drawerArrowStyle, 2132017502);
        int color = obtainStyledAttributes.getColor(3, 0);
        if (color != this.a.getColor()) {
            this.a.setColor(color);
            invalidateSelf();
        }
        float dimension = obtainStyledAttributes.getDimension(7, 0.0f);
        if (this.a.getStrokeWidth() != dimension) {
            this.a.setStrokeWidth(dimension);
            double d2 = (double) (dimension / 2.0f);
            double cos = Math.cos((double) b);
            Double.isNaN(d2);
            this.k = (float) (d2 * cos);
            invalidateSelf();
        }
        boolean z = obtainStyledAttributes.getBoolean(6, true);
        if (this.g != z) {
            this.g = z;
            invalidateSelf();
        }
        float round = (float) Math.round(obtainStyledAttributes.getDimension(5, 0.0f));
        if (round != this.f) {
            this.f = round;
            invalidateSelf();
        }
        this.i = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.d = (float) Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
        this.c = (float) Math.round(obtainStyledAttributes.getDimension(0, 0.0f));
        this.e = obtainStyledAttributes.getDimension(1, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public final void a(float f2) {
        if (this.j != f2) {
            this.j = f2;
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        int i2;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int i3 = this.l;
        boolean z = false;
        if (i3 != 0) {
            if (i3 == 1) {
                z = true;
            } else if (ma.h(this) == 1) {
                z = true;
            }
        }
        float f2 = this.c;
        float f3 = f2 * f2;
        double sqrt = Math.sqrt((double) (f3 + f3));
        float f4 = this.d;
        float f5 = this.j;
        float f6 = ((((float) sqrt) - f4) * f5) + f4;
        float f7 = f4 + ((this.e - f4) * f5);
        float round = (float) Math.round(((this.k + 0.0f) * f5) + 0.0f);
        float f8 = b;
        float f9 = this.j;
        float f10 = ((f8 + 0.0f) * f9) + 0.0f;
        float f11 = !z ? -180.0f : 0.0f;
        double d2 = (double) f6;
        double d3 = (double) f10;
        double cos = Math.cos(d3);
        Double.isNaN(d2);
        float f12 = f11 + (f9 * 180.0f);
        float round2 = (float) Math.round(cos * d2);
        double sin = Math.sin(d3);
        Double.isNaN(d2);
        float round3 = (float) Math.round(d2 * sin);
        this.h.rewind();
        float strokeWidth = this.f + this.a.getStrokeWidth();
        float f13 = strokeWidth + (((-this.k) - strokeWidth) * this.j);
        float f14 = (-f7) / 2.0f;
        this.h.moveTo(f14 + round, 0.0f);
        this.h.rLineTo(f7 - (round + round), 0.0f);
        this.h.moveTo(f14, f13);
        this.h.rLineTo(round2, round3);
        this.h.moveTo(f14, -f13);
        this.h.rLineTo(round2, -round3);
        this.h.close();
        canvas.save();
        float strokeWidth2 = this.a.getStrokeWidth();
        int height = bounds.height();
        float f15 = this.f;
        int i4 = ((int) ((((float) height) - (3.0f * strokeWidth2)) - (f15 + f15))) / 4;
        canvas2.translate((float) bounds.centerX(), ((float) (i4 + i4)) + (strokeWidth2 * 1.5f) + f15);
        if (this.g) {
            if (!z) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            canvas2.rotate(f12 * ((float) i2));
        } else if (z) {
            canvas2.rotate(180.0f);
        }
        canvas2.drawPath(this.h, this.a);
        canvas.restore();
    }

    public final int getIntrinsicHeight() {
        return this.i;
    }

    public final int getIntrinsicWidth() {
        return this.i;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i2) {
        if (i2 != this.a.getAlpha()) {
            this.a.setAlpha(i2);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
