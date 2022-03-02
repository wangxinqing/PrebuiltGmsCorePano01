package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* renamed from: aeom  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeom extends Drawable implements aeoj {
    public static final /* synthetic */ int d = 0;
    private static final LinearInterpolator e = new LinearInterpolator();
    public boolean a;
    public float b;
    public Runnable c;
    private final ValueAnimator f;
    private final ValueAnimator g;
    private float h;
    private final RectF i = new RectF();
    private final Rect j = new Rect();
    private final int k;
    private final Paint l;
    private final int m;
    private final int n;
    private final float o;
    private final aemr p;
    private final aemu q;
    private int r = 255;

    public aeom(int i2, int i3, int i4) {
        this.m = i2;
        this.o = -1.0f;
        this.n = i3;
        this.k = i4;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alphaFraction", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(750);
        ofFloat.setInterpolator(e);
        this.f = ofFloat;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "alphaFraction", new float[]{1.0f, 0.0f});
        ofFloat2.addListener(new aeol(this));
        ofFloat2.setDuration(750);
        ofFloat2.setInterpolator(e);
        this.g = ofFloat2;
        Paint paint = new Paint();
        this.l = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.l.setStrokeCap(Paint.Cap.SQUARE);
        this.l.setAntiAlias(true);
        this.a = false;
        this.b = (float) (getLevel() / 10000);
        aemr aemr = new aemr();
        this.p = aemr;
        double level = (double) getLevel();
        Double.isNaN(level);
        aemr.b(level / 10000.0d);
        aemr.a((double) this.b);
        aemr.b();
        aemr.a((aemv) new aeok(this));
        this.q = new aemu(this.p);
        setVisible(false, false);
    }

    public final void b() {
        c();
        if (this.f.isStarted()) {
            this.f.cancel();
        }
        if (this.g.isStarted()) {
            this.g.cancel();
        }
    }

    public final void c() {
        aemr aemr = this.p;
        double level = (double) getLevel();
        Double.isNaN(level);
        aemr.b(level / 10000.0d);
        this.q.b();
    }

    public final void draw(Canvas canvas) {
        Rect rect;
        if (!getBounds().isEmpty() && isVisible()) {
            if (this.o != -1.0f) {
                Rect bounds = getBounds();
                int centerX = bounds.centerX();
                int centerY = bounds.centerY();
                this.j.left = centerX - (getIntrinsicWidth() / 2);
                this.j.right = centerX + (getIntrinsicWidth() / 2);
                this.j.top = centerY - (getIntrinsicHeight() / 2);
                this.j.bottom = centerY + (getIntrinsicHeight() / 2);
                rect = this.j;
            } else {
                rect = getBounds();
            }
            int i2 = this.m;
            float f2 = this.h;
            float f3 = ((float) i2) * f2;
            int i3 = (int) (((float) this.r) * f2);
            float f4 = ((float) (this.n + i2)) - (f3 / 2.0f);
            this.l.setStrokeWidth(f3);
            this.i.set(rect);
            this.i.inset(f4, f4);
            float width = this.i.width();
            float f5 = this.b;
            this.l.setColor(this.k);
            this.l.setAlpha((int) (((float) i3) * 0.2f));
            canvas.drawOval(this.i, this.l);
            this.l.setAlpha(i3);
            double d2 = (double) ((width / 2.0f) - f3);
            Double.isNaN(d2);
            double d3 = (double) (f3 * 180.0f);
            Double.isNaN(d3);
            float max = Math.max(f5 * 360.0f, (float) ((d2 * 3.141592653589793d) / d3));
            if (max >= 5.0f) {
                canvas.drawArc(this.i, -90.0f, max, false, this.l);
            }
        }
    }

    public float getAlphaFraction() {
        return this.h;
    }

    public final int getIntrinsicHeight() {
        float f2 = this.o;
        return f2 != -1.0f ? (int) (f2 + f2) : super.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        float f2 = this.o;
        return f2 != -1.0f ? (int) (f2 + f2) : super.getIntrinsicWidth();
    }

    public final int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i2) {
        aemr aemr = this.p;
        double d2 = (double) i2;
        Double.isNaN(d2);
        aemr.a(d2 / 10000.0d);
        this.q.a();
        return true;
    }

    public final void setAlpha(int i2) {
        if (i2 != this.r) {
            this.r = i2;
            invalidateSelf();
        }
    }

    public void setAlphaFraction(float f2) {
        this.h = f2;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.l.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.a;
        if (!z3 && !z2) {
            return false;
        }
        this.a = z;
        if (z) {
            super.setVisible(true, z2);
            if (this.g.isRunning()) {
                this.f.setCurrentPlayTime(750 - this.g.getCurrentPlayTime());
                this.g.cancel();
            }
            if (z2) {
                b();
                this.f.start();
            } else {
                this.f.start();
            }
            this.c = null;
        } else if (z3) {
            if (this.f.isRunning()) {
                this.g.setCurrentPlayTime(750 - this.f.getCurrentPlayTime());
                this.f.cancel();
            }
            this.g.start();
        } else {
            b();
        }
        return z3;
    }

    public final void a() {
        this.a = false;
        if (super.setVisible(false, false)) {
            Runnable runnable = this.c;
            if (runnable != null) {
                runnable.run();
            }
            c();
        }
        this.c = null;
    }

    public final void a(Runnable runnable) {
        this.c = runnable;
        setVisible(false, false);
    }
}
