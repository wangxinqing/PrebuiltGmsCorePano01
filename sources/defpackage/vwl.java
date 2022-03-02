package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: vwl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vwl extends Drawable {
    public int[] a = new int[0];
    public ValueAnimator b;
    public float c = 0.0f;
    private Paint d;

    public final int a() {
        return getBounds().width();
    }

    public final void b() {
        Paint paint = new Paint();
        this.d = paint;
        paint.setDither(true);
        if (this.a.length >= 2) {
            this.d.setShader(new LinearGradient(0.0f, 0.0f, (float) a(), 0.0f, this.a, (float[]) null, Shader.TileMode.CLAMP));
        }
    }

    public final void c() {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.b = null;
        }
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.c, 0.0f);
        canvas.drawRect(0.0f, 0.0f, (float) a(), (float) getBounds().height(), this.d);
        canvas.restore();
    }

    public final int getAlpha() {
        return 0;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        b();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        b();
    }
}
