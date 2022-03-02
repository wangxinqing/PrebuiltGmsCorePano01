package com.google.android.gms.people.profile;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AvatarView extends View implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    private static boolean s;
    private static int t;
    private static boolean u;
    private static Paint v;
    private static Paint w;
    private static int x;
    private boolean A;
    private float B;
    private long C;
    private final RectF D = new RectF();
    private final RectF E = new RectF();
    private final RectF F = new RectF();
    private final float[] G = new float[9];
    public Drawable a;
    public Matrix b;
    public final Matrix c = new Matrix();
    public final Rect d = new Rect();
    float e;
    GestureDetector f;
    ScaleGestureDetector g;
    View.OnClickListener h;
    boolean i;
    boolean j;
    boolean k;
    xjd l;
    public float m;
    boolean n;
    float o;
    xjf p;
    xje q;
    public float r;
    private final Matrix y = new Matrix();
    private int z = -1;

    public AvatarView(Context context) {
        super(context);
        d();
    }

    private final void a(float f2) {
        if (this.a == null) {
            setContentDescription(getResources().getString(R.string.people_avatar_cropper));
        } else if (Math.abs(this.m - f2) < 5.0E-8f) {
            setContentDescription(getResources().getString(R.string.people_avatar_view_description_max_crop_updated));
        } else {
            setContentDescription(getResources().getString(R.string.people_avatar_cropper));
        }
    }

    private final float c() {
        this.c.getValues(this.G);
        return this.G[0];
    }

    private final void d() {
        Context context = getContext();
        if (!s) {
            s = true;
            Resources resources = context.getApplicationContext().getResources();
            x = resources.getColor(R.color.people_avatar_preview_background);
            t = resources.getDimensionPixelSize(R.dimen.people_avatar_preview_profile_width);
            Paint paint = new Paint();
            v = paint;
            paint.setAntiAlias(true);
            v.setColor(resources.getColor(R.color.people_avatar_preview_crop_dim));
            v.setStyle(Paint.Style.FILL);
            Paint paint2 = new Paint();
            w = paint2;
            paint2.setAntiAlias(true);
            w.setColor(resources.getColor(R.color.people_avatar_preview_crop_highlight));
            w.setStyle(Paint.Style.STROKE);
            w.setStrokeWidth(resources.getDimension(R.dimen.people_avatar_preview_stroke_width));
            u = context.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct");
        }
        this.f = new GestureDetector(context, this, (Handler) null, true ^ u);
        this.g = new ScaleGestureDetector(context, this);
        this.l = new xjd(this);
        this.p = new xjf(this);
        this.q = new xje(this);
        new xjc(this);
        setContentDescription(getResources().getString(R.string.people_avatar_cropper));
    }

    public final void b() {
        float f2;
        this.F.set(this.D);
        this.c.mapRect(this.F);
        float f3 = (float) this.d.left;
        float f4 = (float) this.d.right;
        float f5 = this.F.left;
        float f6 = this.F.right;
        float f7 = f4 - f3;
        float f8 = 0.0f;
        if (f6 - f5 < f7) {
            f2 = f3 + ((f7 - (f6 + f5)) / 2.0f);
        } else {
            f2 = f5 > f3 ? f3 - f5 : f6 < f4 ? f4 - f6 : 0.0f;
        }
        float f9 = (float) this.d.top;
        float f10 = (float) this.d.bottom;
        float f11 = this.F.top;
        float f12 = this.F.bottom;
        float f13 = f10 - f9;
        if (f12 - f11 < f13) {
            f8 = f9 + ((f13 - (f12 + f11)) / 2.0f);
        } else if (f11 > f9) {
            f8 = f9 - f11;
        } else if (f12 < f10) {
            f8 = f10 - f12;
        }
        if (Math.abs(f2) <= 20.0f && Math.abs(f8) <= 20.0f) {
            this.c.postTranslate(f2, f8);
            invalidate();
            return;
        }
        xje xje = this.q;
        if (!xje.e) {
            xje.d = -1;
            xje.b = f2;
            xje.c = f8;
            xje.f = false;
            xje.e = true;
            xje.a.postDelayed(xje, 250);
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        if (drawable == this.a) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setVisible(false, false);
        }
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z2;
        if (this.i) {
            if (!this.j) {
                float c2 = c();
                float min = Math.min(this.B, Math.max(this.m, 1.5f * c2));
                xjd xjd = this.l;
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                if (!xjd.i) {
                    xjd.b = x2;
                    xjd.c = y2;
                    xjd.e = min;
                    xjd.h = System.currentTimeMillis();
                    xjd.f = c2;
                    float f2 = xjd.e;
                    if (f2 > c2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    xjd.d = z2;
                    xjd.g = (f2 - c2) / 300.0f;
                    xjd.i = true;
                    xjd.j = false;
                    xjd.a.post(xjd);
                }
            }
            this.j = false;
        }
        return true;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        if (!this.i) {
            return true;
        }
        this.p.a();
        this.q.a();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(x);
        if (this.a != null) {
            int saveCount = canvas.getSaveCount();
            canvas.save();
            Matrix matrix = this.b;
            if (matrix != null) {
                canvas.concat(matrix);
            }
            this.a.draw(canvas);
            canvas.restoreToCount(saveCount);
            this.F.set(this.a.getBounds());
            Matrix matrix2 = this.b;
            if (matrix2 != null) {
                matrix2.mapRect(this.F);
            }
            int saveCount2 = canvas.getSaveCount();
            canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), v);
            canvas.save();
            canvas.clipRect(this.d);
            Matrix matrix3 = this.b;
            if (matrix3 != null) {
                canvas.concat(matrix3);
            }
            this.a.draw(canvas);
            canvas.restoreToCount(saveCount2);
            canvas.drawRect(this.d, w);
        }
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (this.i) {
            if (!this.n) {
                xjf xjf = this.p;
                if (!xjf.e) {
                    xjf.d = -1;
                    xjf.b = f2;
                    xjf.c = f3;
                    xjf.f = false;
                    xjf.e = true;
                    xjf.a.post(xjf);
                }
            }
            this.n = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        this.A = true;
        int width = getWidth();
        int height = getHeight();
        int min = Math.min(t, Math.min(width, height));
        int i6 = (int) ((float) min);
        int i7 = (width - min) / 2;
        int i8 = (height - i6) / 2;
        this.d.set(i7, i8, min + i7, i6 + i8);
        a(z2);
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        if (this.z != -1) {
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
            setMeasuredDimension(getMeasuredWidth(), this.z);
            return;
        }
        super.onMeasure(i2, i3);
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor() - 4.0f;
        if ((scaleFactor < 0.0f && this.o > 0.0f) || (scaleFactor > 0.0f && this.o < 0.0f)) {
            this.o = 0.0f;
        }
        float f2 = this.o + scaleFactor;
        this.o = f2;
        if (!this.i || Math.abs(f2) <= 0.04f) {
            return true;
        }
        this.k = false;
        a(c() * scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (this.i) {
            this.l.a();
            this.k = true;
            this.o = 0.0f;
        }
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        if (this.i && this.k) {
            this.j = true;
            this.c.set(this.y);
            invalidate();
        }
        this.n = true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (Math.abs(motionEvent2.getEventTime() - this.C) <= 400 || !this.i) {
            return true;
        }
        a(-f2, -f3);
        return true;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        View.OnClickListener onClickListener = this.h;
        if (onClickListener != null && !this.k) {
            onClickListener.onClick(this);
        }
        this.k = false;
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ScaleGestureDetector scaleGestureDetector = this.g;
        if (scaleGestureDetector == null || this.f == null) {
            return true;
        }
        scaleGestureDetector.onTouchEvent(motionEvent);
        this.f.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 6) {
            if (motionEvent.getPointerCount() == 2) {
                this.C = motionEvent.getEventTime();
            } else if (motionEvent.getPointerCount() == 1) {
                this.C = 0;
            }
        }
        int action = motionEvent.getAction();
        if ((action == 1 || action == 3) && !this.p.e) {
            b();
        }
        return true;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    public final void setVisibility(int i2) {
        boolean z2;
        super.setVisibility(i2);
        Drawable drawable = this.a;
        if (drawable != null) {
            if (i2 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            drawable.setVisible(z2, false);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return this.a == drawable || super.verifyDrawable(drawable);
    }

    public final void a() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.a = null;
    }

    public final void a(float f2, float f3, float f4) {
        this.c.postRotate(-this.r, (float) (getWidth() / 2), (float) (getHeight() / 2));
        float min = Math.min(Math.max(f2, this.m), this.B);
        float c2 = min / c();
        this.c.postScale(c2, c2, f3, f4);
        b();
        this.c.postRotate(this.r, (float) (getWidth() / 2), (float) (getHeight() / 2));
        a(min);
        invalidate();
    }

    public AvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    public final void a(boolean z2) {
        a(this.m);
        Drawable drawable = this.a;
        if (drawable != null && this.A) {
            this.a.setBounds(0, 0, drawable.getIntrinsicWidth(), this.a.getIntrinsicHeight());
            if (z2 || (this.m == 0.0f && this.a != null && this.A)) {
                int intrinsicWidth = this.a.getIntrinsicWidth();
                int intrinsicHeight = this.a.getIntrinsicHeight();
                int i2 = this.d.right;
                int i3 = this.d.left;
                int i4 = this.d.bottom;
                int i5 = this.d.top;
                float f2 = (float) intrinsicWidth;
                float f3 = (float) intrinsicHeight;
                this.D.set(0.0f, 0.0f, f2, f3);
                float f4 = f3 / f2;
                this.e = f4;
                float f5 = (float) (i4 - i5);
                float f6 = (float) (i2 - i3);
                if (f4 > f5 / f6) {
                    int i6 = (this.d.top + this.d.bottom) / 2;
                    int round = Math.round(f6 * this.e) / 2;
                    this.E.set((float) this.d.left, (float) (i6 - round), (float) this.d.right, (float) (i6 + round));
                } else {
                    int i7 = (this.d.right + this.d.left) / 2;
                    int round2 = Math.round(f5 / this.e) / 2;
                    this.E.set((float) (i7 - round2), (float) this.d.top, (float) (i7 + round2), (float) this.d.bottom);
                }
                this.c.setRectToRect(this.D, this.E, Matrix.ScaleToFit.CENTER);
                this.y.set(this.c);
                float c2 = c();
                this.m = c2;
                this.B = Math.max(c2 + c2, Math.min(c2 * 8.0f, 8.0f));
            }
            this.b = this.c;
        }
    }

    public AvatarView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        d();
    }

    public final boolean a(float f2, float f3) {
        this.F.set(this.D);
        this.c.mapRect(this.F);
        int i2 = this.d.left;
        int i3 = this.d.right;
        float f4 = this.F.left;
        float f5 = this.F.right;
        float max = Math.max(((float) i2) - this.F.right, Math.min(((float) i3) - this.F.left, f2));
        int i4 = this.d.top;
        int i5 = this.d.bottom;
        float f6 = this.F.top;
        float f7 = this.F.bottom;
        float max2 = Math.max(((float) i4) - this.F.bottom, Math.min(((float) i5) - this.F.top, f3));
        this.c.postTranslate(max, max2);
        invalidate();
        return max == f2 && max2 == f3;
    }
}
