package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: aeot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeot extends Drawable implements aeoj {
    public boolean a;
    public double b;
    public Runnable c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final Paint i;
    private final aemr j;
    private final aemu k;
    private final ObjectAnimator l;
    private final ObjectAnimator m;
    private final float n;
    private final float o;
    private float p;
    private float q;
    private final aemv r = new aeos(this);

    public aeot(int i2, int i3, int i4, float f2, int i5) {
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.d = Math.round(f2 * 255.0f);
        this.h = i5;
        Paint paint = new Paint();
        this.i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.i.setAntiAlias(true);
        float f3 = 1.0f;
        this.p = 1.0f;
        this.a = isVisible();
        this.q = 0.0f;
        double level = (double) getLevel();
        Double.isNaN(level);
        this.b = level / 10000.0d;
        this.n = 1.0f;
        this.o = i5 != 2 ? 0.0f : f3;
        aemr aemr = new aemr();
        this.j = aemr;
        double level2 = (double) getLevel();
        Double.isNaN(level2);
        aemr.b(level2 / 10000.0d);
        aemr.a(this.b);
        aemr.b();
        aemr.a(this.r);
        this.k = new aemu(this.j);
        this.l = aeou.a(this, "growScale");
        ObjectAnimator b2 = aeou.b(this, "growScale");
        b2.addListener(new aeor(this));
        this.m = b2;
    }

    public final void b() {
        aemr aemr = this.j;
        double level = (double) getLevel();
        Double.isNaN(level);
        aemr.b(level / 10000.0d);
        this.k.b();
    }

    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible()) {
            canvas.save();
            Rect bounds = getBounds();
            float height = (float) bounds.height();
            float f2 = (float) this.e;
            if (height > f2) {
                canvas.translate(0.0f, (height - f2) / 2.0f);
            }
            canvas.scale(((float) bounds.width()) / 10000.0f, ((float) this.e) / 4.0f);
            canvas.translate(5000.0f, 2.0f);
            if (this.q < 1.0f) {
                if (this.h == 0) {
                    canvas.scale(1.0f, -1.0f);
                }
                canvas.translate(0.0f, (this.q - 4.0f) * 4.0f * 0.5f);
                canvas.scale(1.0f, this.q);
            }
            int i2 = this.g;
            if (i2 == -1) {
                this.i.setColor(this.f);
            } else {
                this.i.setColor(i2);
            }
            this.i.setAlpha((int) (((float) this.d) * this.p));
            canvas.drawRect(-5000.0f, -2.0f, 5000.0f, 2.0f, this.i);
            this.i.setColor(this.f);
            this.i.setAlpha((int) (this.p * 255.0f));
            canvas.drawRect(-5000.0f, -2.0f, ((float) (this.b * 10000.0d)) - 8.687973E-4f, 2.0f, this.i);
            canvas.restore();
        }
    }

    public float getGrowScale() {
        return this.q;
    }

    public final int getIntrinsicHeight() {
        return this.e;
    }

    public final int getIntrinsicWidth() {
        return -1;
    }

    public final int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i2) {
        aemr aemr = this.j;
        double d2 = (double) i2;
        Double.isNaN(d2);
        aemr.a(d2 / 10000.0d);
        this.k.a();
        return true;
    }

    public final void setAlpha(int i2) {
        this.p = ((float) i2) / 255.0f;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.i.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setGrowScale(float f2) {
        this.q = f2;
        invalidateSelf();
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3;
        if (z != this.a) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && !z2) {
            return false;
        }
        this.a = z;
        if (z) {
            super.setVisible(true, z2);
            if (z2) {
                b();
                this.l.cancel();
                this.m.cancel();
                this.q = this.o;
            }
            this.m.cancel();
            this.l.setFloatValues(new float[]{this.n});
            this.l.start();
            this.c = null;
        } else if (z3) {
            this.l.cancel();
            this.m.setFloatValues(new float[]{this.o});
            this.m.start();
        }
        return z3;
    }

    public final void a() {
        this.a = false;
        if (super.setVisible(false, false)) {
            this.l.cancel();
            this.m.cancel();
            b();
            Runnable runnable = this.c;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.c = null;
    }

    public final void a(Runnable runnable) {
        this.c = runnable;
        setVisible(false, false);
    }
}
