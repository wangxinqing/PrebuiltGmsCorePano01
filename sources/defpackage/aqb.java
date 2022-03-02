package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: aqb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqb extends Drawable implements Animatable {
    private static final Interpolator e = new LinearInterpolator();
    private static final Interpolator f = new aiq();
    private static final int[] g = {-16777216};
    public final aqa a;
    public final Resources b;
    float c;
    boolean d;
    private float h;
    private final Animator i;

    public aqb(Context context) {
        ot.a((Object) context);
        this.b = context.getResources();
        aqa aqa = new aqa();
        this.a = aqa;
        aqa.a(g);
        this.a.a(2.5f);
        invalidateSelf();
        aqa aqa2 = this.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new apy(this, aqa2));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(e);
        ofFloat.addListener(new apz(this, aqa2));
        this.i = ofFloat;
    }

    static final void a(float f2, aqa aqa) {
        if (f2 > 0.75f) {
            float f3 = (f2 - 6.0f) / 0.25f;
            int b2 = aqa.b();
            int i2 = aqa.i[aqa.a()];
            int i3 = (b2 >> 24) & 255;
            int i4 = (b2 >> 16) & 255;
            int i5 = (b2 >> 8) & 255;
            int i6 = b2 & 255;
            aqa.u = ((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f3))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f3))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f3))) << 8) | (i6 + ((int) (f3 * ((float) ((i2 & 255) - i6)))));
            return;
        }
        aqa.u = aqa.b();
    }

    public final void b(float f2) {
        aqa aqa = this.a;
        aqa.e = 0.0f;
        aqa.f = f2;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.h, bounds.exactCenterX(), bounds.exactCenterY());
        aqa aqa = this.a;
        RectF rectF = aqa.a;
        float f2 = aqa.q;
        float f3 = (aqa.h / 2.0f) + f2;
        if (f2 <= 0.0f) {
            f3 = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) aqa.r) * aqa.p) / 2.0f, aqa.h / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f3, ((float) bounds.centerY()) - f3, ((float) bounds.centerX()) + f3, ((float) bounds.centerY()) + f3);
        float f4 = aqa.e;
        float f5 = aqa.g;
        float f6 = (f4 + f5) * 360.0f;
        float f7 = ((aqa.f + f5) * 360.0f) - f6;
        aqa.b.setColor(aqa.u);
        aqa.b.setAlpha(aqa.t);
        float f8 = aqa.h / 2.0f;
        rectF.inset(f8, f8);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, aqa.d);
        float f9 = -f8;
        rectF.inset(f9, f9);
        canvas.drawArc(rectF, f6, f7, false, aqa.b);
        if (aqa.n) {
            Path path = aqa.o;
            if (path == null) {
                aqa.o = new Path();
                aqa.o.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height());
            int i2 = aqa.r;
            float f10 = aqa.p;
            aqa.o.moveTo(0.0f, 0.0f);
            aqa.o.lineTo(((float) aqa.r) * aqa.p, 0.0f);
            Path path2 = aqa.o;
            int i3 = aqa.r;
            float f11 = aqa.p;
            path2.lineTo((((float) i3) * f11) / 2.0f, ((float) aqa.s) * f11);
            aqa.o.offset(((min / 2.0f) + rectF.centerX()) - ((((float) i2) * f10) / 2.0f), rectF.centerY() + (aqa.h / 2.0f));
            aqa.o.close();
            aqa.c.setColor(aqa.u);
            aqa.c.setAlpha(aqa.t);
            canvas.save();
            canvas.rotate(f6 + f7, rectF.centerX(), rectF.centerY());
            canvas.drawPath(aqa.o, aqa.c);
            canvas.restore();
        }
        canvas.restore();
    }

    public final int getAlpha() {
        return this.a.t;
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.i.isRunning();
    }

    public final void setAlpha(int i2) {
        this.a.t = i2;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void start() {
        this.i.cancel();
        this.a.c();
        aqa aqa = this.a;
        if (aqa.f != aqa.e) {
            this.d = true;
            this.i.setDuration(666);
            this.i.start();
            return;
        }
        aqa.a(0);
        this.a.d();
        this.i.setDuration(1332);
        this.i.start();
    }

    public final void stop() {
        this.i.cancel();
        this.h = 0.0f;
        this.a.a(false);
        this.a.a(0);
        this.a.d();
        invalidateSelf();
    }

    public final void a(float f2) {
        aqa aqa = this.a;
        if (f2 != aqa.p) {
            aqa.p = f2;
        }
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2, aqa aqa, boolean z) {
        float f3;
        float f4;
        if (this.d) {
            a(f2, aqa);
            double floor = Math.floor((double) (aqa.m / 0.8f));
            float f5 = aqa.k;
            float f6 = aqa.l;
            aqa.e = f5 + (((-0.01f + f6) - f5) * f2);
            aqa.f = f6;
            float f7 = aqa.m;
            aqa.g = f7 + ((((float) (floor + 1.0d)) - f7) * f2);
        } else if (f2 != 1.0f || z) {
            float f8 = aqa.m;
            if (f2 >= 0.5f) {
                f3 = aqa.k + 0.79f;
                f4 = f3 - (((1.0f - f.getInterpolation((-0.5f + f2) / 0.5f)) * 0.79f) + 0.01f);
            } else {
                f4 = aqa.k;
                f3 = f4 + (f.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f;
            }
            float f9 = this.c;
            aqa.e = f4;
            aqa.f = f3;
            aqa.g = f8 + (0.20999998f * f2);
            this.h = (f2 + f9) * 216.0f;
        }
    }

    public final void a(boolean z) {
        this.a.a(z);
        invalidateSelf();
    }
}
