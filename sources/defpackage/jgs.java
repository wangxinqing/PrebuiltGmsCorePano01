package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: jgs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jgs extends Drawable implements Animatable {
    public static final Interpolator a = new jgp();
    public static final Interpolator b = new jgr();
    private static final Interpolator f = new LinearInterpolator();
    private static final Interpolator g = new AccelerateDecelerateInterpolator();
    public final View c;
    public final Animation d;
    public float e;
    private final int[] h = {-16777216};
    private final jgq i;
    private float j;
    private final Resources k;
    private double l;
    private double m;
    private final Animation n;
    private final Drawable.Callback o = new jgo(this);

    public jgs(Context context, View view) {
        this.c = view;
        this.k = context.getResources();
        jgq jgq = new jgq(this.o);
        this.i = jgq;
        jgq.a(this.h);
        a(1);
        jgq jgq2 = this.i;
        jgk jgk = new jgk(jgq2);
        jgk.setInterpolator(g);
        jgk.setDuration(666);
        jgk.setAnimationListener(new jgl(this, jgq2));
        jgm jgm = new jgm(this, jgq2);
        jgm.setRepeatCount(-1);
        jgm.setRepeatMode(1);
        jgm.setInterpolator(f);
        jgm.setDuration(1333);
        jgm.setAnimationListener(new jgn(this, jgq2));
        this.n = jgk;
        this.d = jgm;
    }

    private final void a(double d2, double d3, double d4, double d5) {
        float f2;
        jgq jgq = this.i;
        float f3 = this.k.getDisplayMetrics().density;
        double d6 = (double) f3;
        Double.isNaN(d6);
        this.l = d2 * d6;
        Double.isNaN(d6);
        this.m = d3 * d6;
        float f4 = ((float) d5) * f3;
        jgq.f = f4;
        jgq.b.setStrokeWidth(f4);
        jgq.d();
        Double.isNaN(d6);
        jgq.n = d4 * d6;
        jgq.e();
        float min = (float) Math.min((int) this.l, (int) this.m);
        double d7 = jgq.n;
        if (d7 > 0.0d && min >= 0.0f) {
            double d8 = (double) (min / 2.0f);
            Double.isNaN(d8);
            f2 = (float) (d8 - d7);
        } else {
            f2 = (float) Math.ceil((double) (jgq.f / 2.0f));
        }
        jgq.g = f2;
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.rotate(this.j, bounds.exactCenterX(), bounds.exactCenterY());
        jgq jgq = this.i;
        RectF rectF = jgq.a;
        rectF.set(bounds);
        float f2 = jgq.g;
        rectF.inset(f2, f2);
        float f3 = jgq.c;
        float f4 = jgq.e;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = jgq.d;
        jgq.b.setColor(jgq.h[jgq.i]);
        canvas.drawArc(rectF, f5, ((f6 + f4) * 360.0f) - f5, false, jgq.b);
        if (jgq.o < 255) {
            jgq.p.setColor(0);
            jgq.p.setAlpha(255 - jgq.o);
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), (float) (bounds.width() / 2), jgq.p);
        }
        canvas.restoreToCount(save);
    }

    public final int getAlpha() {
        return this.i.o;
    }

    public final int getIntrinsicHeight() {
        return (int) this.m;
    }

    public final int getIntrinsicWidth() {
        return (int) this.l;
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.c.getAnimation() != null;
    }

    public final void setAlpha(int i2) {
        this.i.o = i2;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        jgq jgq = this.i;
        jgq.b.setColorFilter(colorFilter);
        jgq.d();
    }

    public final void start() {
        this.d.reset();
        this.i.b();
        jgq jgq = this.i;
        if (jgq.d != jgq.c) {
            this.c.startAnimation(this.n);
            return;
        }
        jgq.e();
        this.i.c();
        this.c.startAnimation(this.d);
    }

    public final void stop() {
        this.c.clearAnimation();
        a(0.0f);
        this.i.e();
        this.i.c();
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2) {
        this.j = f2;
        invalidateSelf();
    }

    public final void a(int i2) {
        if (i2 != 0) {
            a(40.0d, 40.0d, 8.75d, 2.5d);
        } else {
            a(56.0d, 56.0d, 12.5d, 3.0d);
        }
    }

    public final void a(int... iArr) {
        this.i.a(iArr);
        this.i.e();
    }
}
