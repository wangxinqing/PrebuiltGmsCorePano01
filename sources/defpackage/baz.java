package defpackage;

import android.animation.Animator;
import android.view.Choreographer;

/* renamed from: baz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baz extends bav implements Choreographer.FrameCallback {
    public float b = 1.0f;
    public long c = 0;
    public float d = 0.0f;
    public int e = 0;
    public float f = -2.14748365E9f;
    public float g = 2.14748365E9f;
    public auk h;
    public boolean i = false;
    private boolean j = false;

    public final void a(float f2) {
        if (this.d != f2) {
            this.d = bba.b(f2, f(), g());
            this.c = 0;
            a();
        }
    }

    public final float b() {
        auk auk = this.h;
        if (auk == null) {
            return 0.0f;
        }
        float f2 = this.d;
        float f3 = auk.h;
        return (f2 - f3) / (auk.i - f3);
    }

    public final void c() {
        this.b = -this.b;
    }

    public final void cancel() {
        for (Animator.AnimatorListener onAnimationCancel : this.a) {
            onAnimationCancel.onAnimationCancel(this);
        }
        i();
    }

    public final void d() {
        i();
        a(e());
    }

    public final void doFrame(long j2) {
        h();
        auk auk = this.h;
        if (auk != null && this.i) {
            long j3 = this.c;
            long j4 = 0;
            if (j3 != 0) {
                j4 = j2 - j3;
            }
            float abs = ((float) j4) / ((1.0E9f / auk.j) / Math.abs(this.b));
            float f2 = this.d;
            if (e()) {
                abs = -abs;
            }
            float f3 = f2 + abs;
            this.d = f3;
            boolean c2 = bba.c(f3, f(), g());
            this.d = bba.b(this.d, f(), g());
            this.c = j2;
            a();
            if (!c2) {
                if (getRepeatCount() == -1 || this.e < getRepeatCount()) {
                    for (Animator.AnimatorListener onAnimationRepeat : this.a) {
                        onAnimationRepeat.onAnimationRepeat(this);
                    }
                    this.e++;
                    if (getRepeatMode() == 2) {
                        this.j = !this.j;
                        c();
                    } else {
                        this.d = !e() ? f() : g();
                    }
                    this.c = j2;
                } else {
                    this.d = this.b >= 0.0f ? g() : f();
                    i();
                    a(e());
                }
            }
            if (this.h != null) {
                float f4 = this.d;
                float f5 = this.f;
                if (f4 < f5 || f4 > this.g) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(f5), Float.valueOf(this.g), Float.valueOf(this.d)}));
                }
            }
            auf.a();
        }
    }

    public final boolean e() {
        return this.b < 0.0f;
    }

    public final float f() {
        auk auk = this.h;
        if (auk == null) {
            return 0.0f;
        }
        float f2 = this.f;
        return f2 == -2.14748365E9f ? auk.h : f2;
    }

    public final float g() {
        auk auk = this.h;
        if (auk == null) {
            return 0.0f;
        }
        float f2 = this.g;
        return f2 == 2.14748365E9f ? auk.i : f2;
    }

    public final float getAnimatedFraction() {
        if (this.h == null) {
            return 0.0f;
        }
        if (e()) {
            return (g() - this.d) / (g() - f());
        }
        return (this.d - f()) / (g() - f());
    }

    public final Object getAnimatedValue() {
        return Float.valueOf(b());
    }

    public final long getDuration() {
        auk auk = this.h;
        if (auk != null) {
            return (long) auk.a();
        }
        return 0;
    }

    public final void h() {
        if (this.i) {
            b(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final void i() {
        b(true);
    }

    public final boolean isRunning() {
        return this.i;
    }

    public final void setRepeatMode(int i2) {
        super.setRepeatMode(i2);
        if (i2 != 2 && this.j) {
            this.j = false;
            c();
        }
    }

    /* access modifiers changed from: protected */
    public final void b(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.i = false;
        }
    }

    public final void a(float f2, float f3) {
        float f4;
        float f5;
        if (f2 <= f3) {
            auk auk = this.h;
            if (auk != null) {
                f4 = auk.h;
            } else {
                f4 = -3.4028235E38f;
            }
            if (auk != null) {
                f5 = auk.i;
            } else {
                f5 = Float.MAX_VALUE;
            }
            this.f = bba.b(f2, f4, f5);
            this.g = bba.b(f3, f4, f5);
            a((float) ((int) bba.b(this.d, f2, f3)));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f2), Float.valueOf(f3)}));
    }
}
