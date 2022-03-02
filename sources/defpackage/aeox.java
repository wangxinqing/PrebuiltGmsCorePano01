package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* renamed from: aeox  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeox extends Drawable implements Animatable, aeoj {
    public final AnimatorSet a;
    public boolean b = isVisible();
    public Runnable c;
    public Runnable d;
    private final int e;
    private final boolean f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final Paint k;
    private final ObjectAnimator l;
    private final ObjectAnimator m;
    private final float n;
    private final float o;
    private float p = 1.0f;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private final Rect v;

    public aeox(int i2, int i3, int i4, float f2, boolean z, int i5) {
        this.g = i2;
        this.i = i3;
        this.e = Math.round(f2 * 255.0f);
        this.f = z;
        this.j = i5;
        this.h = i4;
        float f3 = 1.0f;
        Paint paint = new Paint();
        this.k = paint;
        paint.setStyle(Paint.Style.FILL);
        this.k.setAntiAlias(true);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "rect1ScaleX", new float[]{0.1f, 0.1f});
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(733);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "rect1ScaleX", new float[]{0.1f, 0.8268492f});
        ofFloat2.setInterpolator(rg.a(0.33473143f, 0.12481982f, 0.78584397f, 1.0f));
        ofFloat2.setDuration(650);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "rect1ScaleX", new float[]{0.8268492f, 0.1f});
        ofFloat3.setInterpolator(rg.a(0.225732f, 0.0f, 0.35f, 1.05f));
        ofFloat3.setDuration(617);
        animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, "rect1TranslationX", new float[]{-522.6f, 199.6f});
        ofFloat4.setInterpolator(rg.a(0.34f, 0.0f, 0.78f, 1.0f));
        ofFloat4.setStartDelay(400);
        ofFloat4.setDuration(1600);
        animatorSet.play(ofFloat4);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this, "rect2ScaleX", new float[]{0.1f, 0.55f});
        ofFloat5.setInterpolator(rg.a(0.20502818f, 0.057050835f, 0.5f, 0.5f));
        ofFloat5.setDuration(352);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this, "rect2ScaleX", new float[]{0.55f, 0.90995026f});
        ofFloat6.setInterpolator(rg.a(0.15f, 0.2f, 0.6483738f, 1.0043154f));
        ofFloat6.setDuration(532);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this, "rect2ScaleX", new float[]{0.90995026f, 0.1f});
        ofFloat7.setInterpolator(rg.a(0.25775883f, -0.003163357f, 0.21176192f, 1.3817896f));
        ofFloat7.setDuration(1116);
        animatorSet.playSequentially(new Animator[]{ofFloat5, ofFloat6, ofFloat7});
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this, "rect2TranslationX", new float[]{-208.0f, 132.0f});
        ofFloat8.setInterpolator(rg.a(0.26f, 0.0f, 0.75f, 0.68f));
        ofFloat8.setDuration(964);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this, "rect2TranslationX", new float[]{132.0f, 422.6f});
        ofFloat9.setInterpolator(rg.a(0.4f, 0.6270349f, 0.6f, 0.9020258f));
        ofFloat9.setDuration(1036);
        animatorSet.playSequentially(new Animator[]{ofFloat8, ofFloat9});
        animatorSet.addListener(new aeov(this));
        aepa.a();
        aemk.a(animatorSet, (Runnable) null);
        this.a = animatorSet;
        this.n = 1.0f;
        this.o = i5 != 2 ? 0.0f : f3;
        this.l = aeou.a(this, "growScale");
        ObjectAnimator b2 = aeou.b(this, "growScale");
        b2.addListener(new aeow(this));
        this.m = b2;
        this.v = new Rect();
        b();
    }

    public final void b() {
        this.l.cancel();
        this.m.cancel();
        this.a.cancel();
        this.q = 0.1f;
        this.r = -522.6f;
        this.s = 0.1f;
        this.t = -197.6f;
        this.u = this.o;
    }

    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.v)) {
            canvas.save();
            float height = (float) this.v.height();
            float f2 = (float) this.g;
            if (height > f2) {
                canvas.translate(0.0f, (height - f2) / 2.0f);
            }
            canvas.scale(((float) this.v.width()) / 360.0f, ((float) this.g) / 4.0f);
            canvas.translate(180.0f, 2.0f);
            canvas.clipRect(-180.0f, -2.0f, 180.0f, 2.0f);
            if (this.u < 1.0f) {
                if (this.j == 0) {
                    canvas.scale(1.0f, -1.0f);
                }
                canvas.translate(0.0f, (this.u - 4.0f) * 4.0f * 0.5f);
                canvas.scale(1.0f, this.u);
            }
            int i2 = this.h;
            if (i2 == -1) {
                this.k.setColor(this.i);
                this.k.setAlpha((int) (this.p * ((float) this.e)));
            } else {
                this.k.setColor(i2);
                this.k.setAlpha((int) (this.p * ((float) this.e)));
            }
            canvas.drawRect(-180.0f, -2.0f, 180.0f, 2.0f, this.k);
            this.k.setColor(this.i);
            if (this.f) {
                canvas.scale(-1.0f, 1.0f);
            }
            this.k.setAlpha((int) (this.p * 255.0f));
            canvas.save();
            canvas.translate(this.r, 0.0f);
            canvas.scale(this.q, 1.0f);
            canvas.drawRect(-144.0f, -2.0f, 144.0f, 2.0f, this.k);
            canvas.restore();
            canvas.save();
            canvas.translate(this.t, 0.0f);
            canvas.scale(this.s, 1.0f);
            canvas.drawRect(-144.0f, -2.0f, 144.0f, 2.0f, this.k);
            canvas.restore();
            canvas.restore();
        }
    }

    public float getGrowScale() {
        return this.u;
    }

    public final int getIntrinsicHeight() {
        return this.g;
    }

    public final int getIntrinsicWidth() {
        return -1;
    }

    public final int getOpacity() {
        return -3;
    }

    public float getRect1ScaleX() {
        return this.q;
    }

    public float getRect1TranslationX() {
        return this.r;
    }

    public float getRect2ScaleX() {
        return this.s;
    }

    public float getRect2TranslationX() {
        return this.t;
    }

    public final boolean isRunning() {
        return isVisible();
    }

    public final void setAlpha(int i2) {
        this.p = (float) i2;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.k.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setGrowScale(float f2) {
        this.u = f2;
        invalidateSelf();
    }

    public void setRect1ScaleX(float f2) {
        this.q = f2;
        invalidateSelf();
    }

    public void setRect1TranslationX(float f2) {
        this.r = f2;
        invalidateSelf();
    }

    public void setRect2ScaleX(float f2) {
        this.s = f2;
        invalidateSelf();
    }

    public void setRect2TranslationX(float f2) {
        this.t = f2;
        invalidateSelf();
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3;
        if (z != this.b) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && !z2) {
            return false;
        }
        this.b = z;
        if (z) {
            super.setVisible(true, z2);
            if (z2) {
                b();
            }
            this.m.cancel();
            this.l.setFloatValues(new float[]{this.n});
            this.l.start();
            if (!this.a.isStarted()) {
                this.a.start();
            }
            this.d = null;
        } else if (z3) {
            this.l.cancel();
            this.m.setFloatValues(new float[]{this.o});
            this.m.start();
        }
        return z3;
    }

    public final void start() {
        setVisible(true, true);
    }

    public final void stop() {
        setVisible(false, false);
    }

    public final void a() {
        this.b = false;
        if (super.setVisible(false, false)) {
            this.l.cancel();
            this.m.cancel();
            this.a.cancel();
            Runnable runnable = this.d;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.d = null;
    }

    public final void a(Runnable runnable) {
        this.d = runnable;
        stop();
    }
}
