package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;

/* renamed from: aeoq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeoq extends Drawable implements Animatable, aeoj {
    public static final /* synthetic */ int j = 0;
    private static final LinearInterpolator m = new LinearInterpolator();
    private final float A;
    private long B;
    private long C;
    public final AnimatorSet a;
    public final ValueAnimator b;
    public float c;
    public float d;
    public int e;
    public int f;
    public final int[] g;
    public boolean h;
    public Runnable i;
    private final RectF k = new RectF();
    private final Rect l = new Rect();
    private final ValueAnimator n;
    private final ValueAnimator o;
    private final ValueAnimator p;
    private final ValueAnimator q;
    private final ValueAnimator r;
    private final ArrayList s;
    private float t;
    private float u;
    private float v;
    private final Paint w;
    private int x;
    private final int y;
    private final int z;

    public aeoq(int i2, int i3, int[] iArr) {
        this.y = i2;
        this.A = -1.0f;
        this.z = i3;
        this.g = iArr;
        this.h = false;
        ArrayList arrayList = new ArrayList();
        this.s = arrayList;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "detentFraction", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(1332);
        ofFloat.setInterpolator(m);
        this.n = ofFloat;
        arrayList.add(ofFloat);
        ArrayList arrayList2 = this.s;
        int[] iArr2 = this.g;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "currentColor", new int[]{iArr2[this.e], iArr2[b()]});
        ofInt.setEvaluator(aemh.a);
        ofInt.setStartDelay(999);
        ofInt.setDuration(333);
        ofInt.setInterpolator(m);
        this.f = this.g[this.e];
        this.b = ofInt;
        arrayList2.add(ofInt);
        ArrayList arrayList3 = this.s;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "headFraction", new float[]{0.0f, 1.0f});
        ofFloat2.setDuration(666);
        ofFloat2.setInterpolator(aemq.a);
        this.o = ofFloat2;
        arrayList3.add(ofFloat2);
        ArrayList arrayList4 = this.s;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "tailFraction", new float[]{0.0f, 1.0f});
        ofFloat3.setStartDelay(666);
        ofFloat3.setDuration(666);
        ofFloat3.setInterpolator(aemq.a);
        this.p = ofFloat3;
        arrayList4.add(ofFloat3);
        ArrayList arrayList5 = this.s;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, "alphaFraction", new float[]{0.0f, 1.0f});
        ofFloat4.addListener(new aeoo(this));
        ofFloat4.setDuration(750);
        ofFloat4.setInterpolator(m);
        this.q = ofFloat4;
        arrayList5.add(ofFloat4);
        ArrayList arrayList6 = this.s;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this, "alphaFraction", new float[]{1.0f, 0.0f});
        ofFloat5.addListener(new aeop(this));
        ofFloat5.setDuration(750);
        ofFloat5.setInterpolator(m);
        this.r = ofFloat5;
        arrayList6.add(ofFloat5);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{this.n, this.o, this.p, this.b});
        aepa.a();
        aemk.a(animatorSet, new aeon(this));
        this.a = animatorSet;
        Paint paint = new Paint();
        this.w = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.w.setStrokeCap(Paint.Cap.SQUARE);
        this.w.setAntiAlias(true);
        this.x = 255;
        setVisible(false, false);
        c();
    }

    public final int b() {
        return (this.e + 1) % this.g.length;
    }

    public final void c() {
        super.setVisible(this.h, false);
        if (this.a.isStarted()) {
            this.a.cancel();
        }
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) arrayList.get(i2);
            if (animator.isStarted()) {
                animator.cancel();
            }
        }
        d();
        this.u = 0.0f;
        this.d = 0.0f;
        this.t = 0.0f;
        this.c = 0.0f;
        this.e = 0;
        int[] iArr = this.g;
        int i3 = iArr[0];
        this.f = i3;
        this.b.setIntValues(new int[]{i3, iArr[b()]});
        this.v = 0.0f;
        invalidateSelf();
    }

    public final void d() {
        this.b.setStartDelay(999);
        this.p.setStartDelay(666);
    }

    public final void draw(Canvas canvas) {
        Rect rect;
        if (getBounds().isEmpty()) {
            return;
        }
        if (isVisible() || this.r.isRunning()) {
            if (this.A != -1.0f) {
                Rect bounds = getBounds();
                int centerX = bounds.centerX();
                int centerY = bounds.centerY();
                this.l.left = centerX - (getIntrinsicWidth() / 2);
                this.l.right = centerX + (getIntrinsicWidth() / 2);
                this.l.top = centerY - (getIntrinsicHeight() / 2);
                this.l.bottom = centerY + (getIntrinsicHeight() / 2);
                rect = this.l;
            } else {
                rect = getBounds();
            }
            int i2 = this.y;
            float f2 = this.v;
            float f3 = ((float) i2) * f2;
            int i3 = this.x;
            float f4 = ((float) (this.z + i2)) - (f3 / 2.0f);
            this.w.setColor(this.f);
            this.w.setAlpha((int) (((float) i3) * f2));
            this.w.setStrokeWidth(f3);
            this.k.set(rect);
            this.k.inset(f4, f4);
            float width = this.k.width();
            float f5 = this.d * 290.0f;
            float abs = Math.abs((this.u * 290.0f) - f5);
            double d2 = (double) ((width / 2.0f) - f3);
            Double.isNaN(d2);
            double d3 = (double) (f3 * 180.0f);
            Double.isNaN(d3);
            float max = Math.max(abs, (float) ((d2 * 3.141592653589793d) / d3));
            float f6 = this.t;
            Canvas canvas2 = canvas;
            canvas2.drawArc(this.k, (f5 + (this.c + (f6 * 286.0f))) - 0.049804688f, max, false, this.w);
        }
    }

    public float getAlphaFraction() {
        return this.v;
    }

    public int getCurrentColor() {
        return this.f;
    }

    public float getDetentFraction() {
        return this.t;
    }

    public float getHeadFraction() {
        return this.u;
    }

    public final int getIntrinsicHeight() {
        float f2 = this.A;
        return f2 != -1.0f ? (int) (f2 + f2) : super.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        float f2 = this.A;
        return f2 != -1.0f ? (int) (f2 + f2) : super.getIntrinsicWidth();
    }

    public final int getOpacity() {
        return -3;
    }

    public float getTailFraction() {
        return this.d;
    }

    public final boolean isRunning() {
        return this.a.isRunning() || this.q.isRunning();
    }

    public final void setAlpha(int i2) {
        if (i2 != this.x) {
            this.x = i2;
            invalidateSelf();
        }
    }

    public void setAlphaFraction(float f2) {
        this.v = f2;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.w.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setCurrentColor(int i2) {
        this.f = i2;
        invalidateSelf();
    }

    public void setDetentFraction(float f2) {
        this.t = f2;
        invalidateSelf();
    }

    public void setHeadFraction(float f2) {
        this.u = f2;
        invalidateSelf();
    }

    public void setTailFraction(float f2) {
        this.d = f2;
        invalidateSelf();
    }

    public final boolean setVisible(boolean z2, boolean z3) {
        boolean z4 = z2 != this.h;
        if (!z4 && !z3) {
            return false;
        }
        this.h = z2;
        if (z2) {
            super.setVisible(true, z3);
            if (this.r.isRunning()) {
                this.q.setCurrentPlayTime(750 - this.r.getCurrentPlayTime());
                this.r.cancel();
            }
            if (!z3) {
                long max = Math.max(0, this.B - (SystemClock.elapsedRealtime() - this.C));
                this.B = max;
                this.q.setStartDelay(max);
                this.q.start();
            } else {
                c();
                this.q.setStartDelay(0);
                this.q.start();
                this.B = 0;
            }
            this.C = SystemClock.elapsedRealtime();
            this.i = null;
        } else if (z4) {
            if (this.q.isRunning()) {
                this.r.setCurrentPlayTime(750 - this.q.getCurrentPlayTime());
                this.q.cancel();
            }
            this.r.start();
        } else {
            c();
        }
        return z4;
    }

    public final void start() {
        a(true);
    }

    public final void stop() {
        a(false);
    }

    public final void a() {
        stop();
        c();
    }

    public final void a(Runnable runnable) {
        this.i = runnable;
        stop();
    }

    public final void a(boolean z2) {
        setVisible(z2, true);
    }
}
