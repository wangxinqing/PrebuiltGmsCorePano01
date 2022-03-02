package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: avc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avc extends Drawable implements Drawable.Callback, Animatable {
    public auk a;
    public final baz b = new baz();
    public float c = 1.0f;
    public boolean d = true;
    public final ArrayList e;
    public ImageView.ScaleType f;
    public axd g;
    public String h;
    public axc i;
    public boolean j;
    public ayv k;
    public boolean l;
    private final Matrix m = new Matrix();
    private final ValueAnimator.AnimatorUpdateListener n;
    private int o;
    private final boolean p;

    static {
        avc.class.getSimpleName();
    }

    public avc() {
        new HashSet();
        this.e = new ArrayList();
        auy auy = new auy(this);
        this.n = auy;
        this.o = 255;
        this.p = true;
        this.l = false;
        this.b.addUpdateListener(auy);
    }

    public final void a() {
        ayx a2 = azz.a(this.a);
        auk auk = this.a;
        this.k = new ayv(this, a2, auk.f, auk);
    }

    public final void b() {
        baz baz = this.b;
        if (baz.i) {
            baz.cancel();
        }
        this.a = null;
        this.k = null;
        this.g = null;
        baz baz2 = this.b;
        baz2.h = null;
        baz2.f = -2.14748365E9f;
        baz2.g = 2.14748365E9f;
        invalidateSelf();
    }

    public final void c() {
        if (this.k == null) {
            this.e.add(new auz(this));
            return;
        }
        if (this.d || h() == 0) {
            baz baz = this.b;
            baz.i = true;
            boolean e2 = baz.e();
            for (Animator.AnimatorListener animatorListener : baz.a) {
                if (Build.VERSION.SDK_INT >= 26) {
                    animatorListener.onAnimationStart(baz, e2);
                } else {
                    animatorListener.onAnimationStart(baz);
                }
            }
            baz.a((float) ((int) (!baz.e() ? baz.f() : baz.g())));
            baz.c = 0;
            baz.e = 0;
            baz.h();
        }
        if (!this.d) {
            a((int) (g() >= 0.0f ? f() : e()));
            this.b.d();
        }
    }

    public final void d() {
        if (this.k == null) {
            this.e.add(new ava(this));
            return;
        }
        if (this.d || h() == 0) {
            baz baz = this.b;
            baz.i = true;
            baz.h();
            baz.c = 0;
            if (baz.e() && baz.d == baz.f()) {
                baz.d = baz.g();
            } else if (!baz.e() && baz.d == baz.g()) {
                baz.d = baz.f();
            }
        }
        if (!this.d) {
            a((int) (g() >= 0.0f ? f() : e()));
            this.b.d();
        }
    }

    public final void draw(Canvas canvas) {
        float f2;
        float f3;
        this.l = false;
        int i2 = -1;
        if (ImageView.ScaleType.FIT_XY == this.f) {
            if (this.k != null) {
                Rect bounds = getBounds();
                float width = ((float) bounds.width()) / ((float) this.a.g.width());
                float height = ((float) bounds.height()) / ((float) this.a.g.height());
                if (this.p) {
                    float min = Math.min(width, height);
                    if (min < 1.0f) {
                        f3 = 1.0f / min;
                        width /= f3;
                        height /= f3;
                    } else {
                        f3 = 1.0f;
                    }
                    if (f3 > 1.0f) {
                        i2 = canvas.save();
                        float width2 = ((float) bounds.width()) / 2.0f;
                        float height2 = ((float) bounds.height()) / 2.0f;
                        float f4 = width2 * min;
                        float f5 = min * height2;
                        canvas.translate(width2 - f4, height2 - f5);
                        canvas.scale(f3, f3, f4, f5);
                    }
                }
                this.m.reset();
                this.m.preScale(width, height);
                this.k.a(canvas, this.m, this.o);
                if (i2 > 0) {
                    canvas.restoreToCount(i2);
                }
            }
        } else if (this.k != null) {
            float f6 = this.c;
            float min2 = Math.min(((float) canvas.getWidth()) / ((float) this.a.g.width()), ((float) canvas.getHeight()) / ((float) this.a.g.height()));
            if (f6 > min2) {
                f2 = this.c / min2;
            } else {
                min2 = f6;
                f2 = 1.0f;
            }
            if (f2 > 1.0f) {
                i2 = canvas.save();
                float width3 = ((float) this.a.g.width()) / 2.0f;
                float height3 = ((float) this.a.g.height()) / 2.0f;
                float f7 = width3 * min2;
                float f8 = height3 * min2;
                float f9 = this.c;
                canvas.translate((width3 * f9) - f7, (f9 * height3) - f8);
                canvas.scale(f2, f2, f7, f8);
            }
            this.m.reset();
            this.m.preScale(min2, min2);
            this.k.a(canvas, this.m, this.o);
            if (i2 > 0) {
                canvas.restoreToCount(i2);
            }
        }
        auf.a();
    }

    public final float e() {
        return this.b.f();
    }

    public final float f() {
        return this.b.g();
    }

    public final float g() {
        return this.b.b;
    }

    public final int getAlpha() {
        return this.o;
    }

    public final int getIntrinsicHeight() {
        auk auk = this.a;
        if (auk != null) {
            return (int) (((float) auk.g.height()) * this.c);
        }
        return -1;
    }

    public final int getIntrinsicWidth() {
        auk auk = this.a;
        if (auk != null) {
            return (int) (((float) auk.g.width()) * this.c);
        }
        return -1;
    }

    public final int getOpacity() {
        return -3;
    }

    public final int h() {
        return this.b.getRepeatCount();
    }

    public final boolean i() {
        baz baz = this.b;
        if (baz != null) {
            return baz.i;
        }
        return false;
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final void invalidateSelf() {
        if (!this.l) {
            this.l = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public final boolean isRunning() {
        return i();
    }

    public final boolean j() {
        return this.a.d.c() > 0;
    }

    public final void k() {
        auk auk = this.a;
        if (auk != null) {
            float f2 = this.c;
            setBounds(0, 0, (int) (((float) auk.g.width()) * f2), (int) (((float) this.a.g.height()) * f2));
        }
    }

    public final float l() {
        return this.b.b();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    public final void setAlpha(int i2) {
        this.o = i2;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        bay.a("Use addColorFilter instead.");
    }

    public final void start() {
        c();
    }

    public final void stop() {
        this.e.clear();
        this.b.d();
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void a(float f2) {
        auk auk = this.a;
        if (auk == null) {
            this.e.add(new auw(this, f2));
            return;
        }
        this.b.a(bba.a(auk.h, auk.i, f2));
        auf.a();
    }

    public final void b(float f2) {
        this.c = f2;
        k();
    }

    public final void a(float f2, float f3) {
        auk auk = this.a;
        if (auk != null) {
            float a2 = bba.a(auk.h, auk.i, f2);
            auk auk2 = this.a;
            a((int) a2, (int) bba.a(auk2.h, auk2.i, f3));
            return;
        }
        this.e.add(new auu(this, f2, f3));
    }

    public final void b(int i2) {
        this.b.setRepeatCount(i2);
    }

    public final void a(int i2) {
        if (this.a == null) {
            this.e.add(new auv(this, i2));
        } else {
            this.b.a((float) i2);
        }
    }

    public final void a(int i2, int i3) {
        if (this.a == null) {
            this.e.add(new aut(this, i2, i3));
        } else {
            this.b.a((float) i2, ((float) i3) + 0.99f);
        }
    }

    public final void a(axi axi, Object obj, bbe bbe) {
        if (this.k != null) {
            axj axj = axi.a;
            if (axj == null) {
                ArrayList arrayList = new ArrayList();
                this.k.a(axi, 0, arrayList, new axi(new String[0]));
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((axi) arrayList.get(i2)).a.a(obj, bbe);
                }
                if (arrayList.isEmpty()) {
                    return;
                }
            } else {
                axj.a(obj, bbe);
            }
            invalidateSelf();
            if (obj == avh.A) {
                a(l());
                return;
            }
            return;
        }
        this.e.add(new aux(this, axi, obj, bbe));
    }
}
