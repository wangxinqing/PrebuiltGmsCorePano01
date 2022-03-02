package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: ajuj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajuj extends ajzf implements Drawable.Callback, mb, ajxw {
    private static final int[] y = {16842910};
    private static final ShapeDrawable z = new ShapeDrawable(new OvalShape());
    private ColorStateList A;
    private ColorStateList B;
    private float C = -1.0f;
    private ColorStateList D;
    private float E;
    private boolean F;
    private Drawable G;
    private ColorStateList H;
    private float I;
    private boolean J;
    private Drawable K;
    private ColorStateList L;
    private boolean M;
    private Drawable N;
    private ColorStateList O;
    private float P;
    private float Q;
    private final Paint R = new Paint(1);
    private final Paint.FontMetrics S = new Paint.FontMetrics();
    private final RectF T = new RectF();
    private final PointF U = new PointF();
    private final Path V = new Path();
    private int W;
    private int X;
    private int Y;
    private int Z;
    public float a;
    private int aa;
    private int ab;
    private boolean ac;
    private int ad;
    private int ae = 255;
    private ColorFilter af;
    private PorterDuffColorFilter ag;
    private ColorStateList ah;
    private PorterDuff.Mode ai = PorterDuff.Mode.SRC_IN;
    private int[] aj;
    private boolean ak;
    private ColorStateList al;
    private WeakReference am = new WeakReference((Object) null);
    private boolean an;
    public ColorStateList b;
    public CharSequence c;
    public boolean d;
    public Drawable e;
    public float f;
    public boolean g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public final Context n;
    public final ajxx o;
    public TextUtils.TruncateAt p;
    public boolean q;
    public int r;

    private ajuj(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        a(context);
        this.n = context;
        ajxx ajxx = new ajxx(this);
        this.o = ajxx;
        this.c = "";
        ajxx.a.density = context.getResources().getDisplayMetrics().density;
        setState(y);
        a(y);
        this.q = true;
        if (ajyu.a) {
            z.setTint(-1);
        }
    }

    public static ajuj a(Context context, AttributeSet attributeSet, int i2, int i3) {
        ajyq ajyq;
        ColorStateList a2;
        int resourceId;
        ajuj ajuj = new ajuj(context, attributeSet, i2, i3);
        TypedArray a3 = ajya.a(ajuj.n, attributeSet, ajun.a, i2, i3, new int[0]);
        ajuj.an = a3.hasValue(36);
        ColorStateList a4 = ajym.a(ajuj.n, a3, 23);
        if (ajuj.A != a4) {
            ajuj.A = a4;
            ajuj.onStateChange(ajuj.getState());
        }
        ajuj.a(ajym.a(ajuj.n, a3, 10));
        float dimension = a3.getDimension(18, 0.0f);
        if (ajuj.a != dimension) {
            ajuj.a = dimension;
            ajuj.invalidateSelf();
            ajuj.a();
        }
        if (a3.hasValue(11)) {
            float dimension2 = a3.getDimension(11, 0.0f);
            if (ajuj.C != dimension2) {
                ajuj.C = dimension2;
                ajuj.a(ajuj.h().a(dimension2));
            }
        }
        ColorStateList a5 = ajym.a(ajuj.n, a3, 21);
        if (ajuj.D != a5) {
            ajuj.D = a5;
            if (ajuj.an) {
                ajuj.d(a5);
            }
            ajuj.onStateChange(ajuj.getState());
        }
        float dimension3 = a3.getDimension(22, 0.0f);
        if (ajuj.E != dimension3) {
            ajuj.E = dimension3;
            ajuj.R.setStrokeWidth(dimension3);
            if (ajuj.an) {
                super.a(dimension3);
            }
            ajuj.invalidateSelf();
        }
        ColorStateList a6 = ajym.a(ajuj.n, a3, 35);
        if (ajuj.b != a6) {
            ajuj.b = a6;
            ajuj.w();
            ajuj.onStateChange(ajuj.getState());
        }
        ajuj.a(a3.getText(4));
        Context context2 = ajuj.n;
        Drawable drawable = null;
        if (!a3.hasValue(0) || (resourceId = a3.getResourceId(0, 0)) == 0) {
            ajyq = null;
        } else {
            ajyq = new ajyq(context2, resourceId);
        }
        ajuj.a(ajyq);
        int i4 = a3.getInt(2, 0);
        if (i4 == 1) {
            ajuj.p = TextUtils.TruncateAt.START;
        } else if (i4 == 2) {
            ajuj.p = TextUtils.TruncateAt.MIDDLE;
        } else if (i4 == 3) {
            ajuj.p = TextUtils.TruncateAt.END;
        }
        ajuj.b(a3.getBoolean(17, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            ajuj.b(a3.getBoolean(14, false));
        }
        ajuj.b(ajym.b(ajuj.n, a3, 13));
        if (a3.hasValue(16)) {
            ajuj.b(ajym.a(ajuj.n, a3, 16));
        }
        float dimension4 = a3.getDimension(15, 0.0f);
        if (ajuj.I != dimension4) {
            float d2 = ajuj.d();
            ajuj.I = dimension4;
            float d3 = ajuj.d();
            ajuj.invalidateSelf();
            if (d2 != d3) {
                ajuj.a();
            }
        }
        ajuj.c(a3.getBoolean(30, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            ajuj.c(a3.getBoolean(25, false));
        }
        Drawable b2 = ajym.b(ajuj.n, a3, 24);
        Drawable g2 = ajuj.g();
        if (g2 != b2) {
            float e2 = ajuj.e();
            if (b2 != null) {
                drawable = ma.f(b2).mutate();
            }
            ajuj.e = drawable;
            if (ajyu.a) {
                ajuj.K = new RippleDrawable(ajyu.b(ajuj.b), ajuj.e, z);
            }
            float e3 = ajuj.e();
            d(g2);
            if (ajuj.b()) {
                ajuj.c(ajuj.e);
            }
            ajuj.invalidateSelf();
            if (e2 != e3) {
                ajuj.a();
            }
        }
        ColorStateList a7 = ajym.a(ajuj.n, a3, 29);
        if (ajuj.L != a7) {
            ajuj.L = a7;
            if (ajuj.b()) {
                ma.a(ajuj.e, a7);
            }
            ajuj.onStateChange(ajuj.getState());
        }
        float dimension5 = a3.getDimension(27, 0.0f);
        if (ajuj.f != dimension5) {
            ajuj.f = dimension5;
            ajuj.invalidateSelf();
            if (ajuj.b()) {
                ajuj.a();
            }
        }
        boolean z2 = a3.getBoolean(5, false);
        if (ajuj.g != z2) {
            ajuj.g = z2;
            float d4 = ajuj.d();
            if (!z2 && ajuj.ac) {
                ajuj.ac = false;
            }
            float d5 = ajuj.d();
            ajuj.invalidateSelf();
            if (d4 != d5) {
                ajuj.a();
            }
        }
        ajuj.d(a3.getBoolean(9, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            ajuj.d(a3.getBoolean(7, false));
        }
        Drawable b3 = ajym.b(ajuj.n, a3, 6);
        if (ajuj.N != b3) {
            float d6 = ajuj.d();
            ajuj.N = b3;
            float d7 = ajuj.d();
            d(ajuj.N);
            ajuj.c(ajuj.N);
            ajuj.invalidateSelf();
            if (d6 != d7) {
                ajuj.a();
            }
        }
        if (a3.hasValue(8) && ajuj.O != (a2 = ajym.a(ajuj.n, a3, 8))) {
            ajuj.O = a2;
            if (ajuj.u()) {
                ma.a(ajuj.N, a2);
            }
            ajuj.onStateChange(ajuj.getState());
        }
        ajrv.a(ajuj.n, a3, 38);
        ajrv.a(ajuj.n, a3, 32);
        float dimension6 = a3.getDimension(20, 0.0f);
        if (ajuj.h != dimension6) {
            ajuj.h = dimension6;
            ajuj.invalidateSelf();
            ajuj.a();
        }
        float dimension7 = a3.getDimension(34, 0.0f);
        if (ajuj.P != dimension7) {
            float d8 = ajuj.d();
            ajuj.P = dimension7;
            float d9 = ajuj.d();
            ajuj.invalidateSelf();
            if (d8 != d9) {
                ajuj.a();
            }
        }
        float dimension8 = a3.getDimension(33, 0.0f);
        if (ajuj.Q != dimension8) {
            float d10 = ajuj.d();
            ajuj.Q = dimension8;
            float d11 = ajuj.d();
            ajuj.invalidateSelf();
            if (d10 != d11) {
                ajuj.a();
            }
        }
        float dimension9 = a3.getDimension(40, 0.0f);
        if (ajuj.i != dimension9) {
            ajuj.i = dimension9;
            ajuj.invalidateSelf();
            ajuj.a();
        }
        float dimension10 = a3.getDimension(39, 0.0f);
        if (ajuj.j != dimension10) {
            ajuj.j = dimension10;
            ajuj.invalidateSelf();
            ajuj.a();
        }
        float dimension11 = a3.getDimension(28, 0.0f);
        if (ajuj.k != dimension11) {
            ajuj.k = dimension11;
            ajuj.invalidateSelf();
            if (ajuj.b()) {
                ajuj.a();
            }
        }
        float dimension12 = a3.getDimension(26, 0.0f);
        if (ajuj.l != dimension12) {
            ajuj.l = dimension12;
            ajuj.invalidateSelf();
            if (ajuj.b()) {
                ajuj.a();
            }
        }
        float dimension13 = a3.getDimension(12, 0.0f);
        if (ajuj.m != dimension13) {
            ajuj.m = dimension13;
            ajuj.invalidateSelf();
            ajuj.a();
        }
        ajuj.r = a3.getDimensionPixelSize(3, Integer.MAX_VALUE);
        a3.recycle();
        return ajuj;
    }

    private final void c(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            ma.b(drawable, ma.h(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.e) {
                if (drawable.isStateful()) {
                    drawable.setState(this.aj);
                }
                ma.a(drawable, this.L);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.G;
            if (drawable == drawable2 && this.J) {
                ma.a(drawable2, this.H);
            }
        }
    }

    private static final void d(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    private static boolean e(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private final boolean s() {
        return this.F && this.G != null;
    }

    private final boolean t() {
        return this.M && this.N != null && this.ac;
    }

    private final boolean u() {
        return this.M && this.N != null && this.g;
    }

    private final ColorFilter v() {
        ColorFilter colorFilter = this.af;
        return colorFilter == null ? this.ag : colorFilter;
    }

    private final void w() {
        this.al = this.ak ? ajyu.b(this.b) : null;
    }

    public final void b(ColorStateList colorStateList) {
        this.J = true;
        if (this.H != colorStateList) {
            this.H = colorStateList;
            if (s()) {
                ma.a(this.G, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final boolean b() {
        return this.d && this.e != null;
    }

    public final void draw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        CharSequence charSequence;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i2 = this.ae) != 0) {
            if (i2 < 255) {
                float f2 = (float) bounds.left;
                float f3 = (float) bounds.top;
                float f4 = (float) bounds.right;
                float f5 = (float) bounds.bottom;
                int i8 = this.ae;
                i3 = Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f2, f3, f4, f5, i8) : canvas.saveLayerAlpha(f2, f3, f4, f5, i8, 31);
            } else {
                i3 = 0;
            }
            if (!this.an) {
                this.R.setColor(this.W);
                this.R.setStyle(Paint.Style.FILL);
                this.T.set(bounds);
                canvas2.drawRoundRect(this.T, f(), f(), this.R);
            }
            if (!this.an) {
                this.R.setColor(this.X);
                this.R.setStyle(Paint.Style.FILL);
                this.R.setColorFilter(v());
                this.T.set(bounds);
                canvas2.drawRoundRect(this.T, f(), f(), this.R);
            }
            if (this.an) {
                super.draw(canvas);
            }
            if (this.E > 0.0f && !this.an) {
                this.R.setColor(this.Z);
                this.R.setStyle(Paint.Style.STROKE);
                if (!this.an) {
                    this.R.setColorFilter(v());
                }
                this.T.set(((float) bounds.left) + (this.E / 2.0f), ((float) bounds.top) + (this.E / 2.0f), ((float) bounds.right) - (this.E / 2.0f), ((float) bounds.bottom) - (this.E / 2.0f));
                float f6 = this.C - (this.E / 2.0f);
                canvas2.drawRoundRect(this.T, f6, f6, this.R);
            }
            this.R.setColor(this.aa);
            this.R.setStyle(Paint.Style.FILL);
            this.T.set(bounds);
            if (!this.an) {
                canvas2.drawRoundRect(this.T, f(), f(), this.R);
                i4 = 0;
            } else {
                a(new RectF(bounds), this.V);
                i4 = 0;
                super.a(canvas, this.R, this.V, this.s.a, j());
            }
            if (s()) {
                a(bounds, this.T);
                float f7 = this.T.left;
                float f8 = this.T.top;
                canvas2.translate(f7, f8);
                this.G.setBounds(i4, i4, (int) this.T.width(), (int) this.T.height());
                this.G.draw(canvas2);
                canvas2.translate(-f7, -f8);
            }
            if (t()) {
                a(bounds, this.T);
                float f9 = this.T.left;
                float f10 = this.T.top;
                canvas2.translate(f9, f10);
                this.N.setBounds(i4, i4, (int) this.T.width(), (int) this.T.height());
                this.N.draw(canvas2);
                canvas2.translate(-f9, -f10);
            }
            if (!this.q || this.c == null) {
                i5 = i3;
                i6 = 0;
            } else {
                PointF pointF = this.U;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.c != null) {
                    float d2 = this.h + d() + this.i;
                    if (ma.h(this) == 0) {
                        pointF.x = ((float) bounds.left) + d2;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = ((float) bounds.right) - d2;
                        align = Paint.Align.RIGHT;
                    }
                    int centerY = bounds.centerY();
                    this.o.a.getFontMetrics(this.S);
                    pointF.y = ((float) centerY) - ((this.S.descent + this.S.ascent) / 2.0f);
                }
                RectF rectF = this.T;
                rectF.setEmpty();
                if (this.c != null) {
                    float d3 = this.h + d() + this.i;
                    float e2 = this.m + e() + this.j;
                    if (ma.h(this) == 0) {
                        rectF.left = ((float) bounds.left) + d3;
                        rectF.right = ((float) bounds.right) - e2;
                    } else {
                        rectF.left = ((float) bounds.left) + e2;
                        rectF.right = ((float) bounds.right) - d3;
                    }
                    rectF.top = (float) bounds.top;
                    rectF.bottom = (float) bounds.bottom;
                }
                ajxx ajxx = this.o;
                if (ajxx.d != null) {
                    ajxx.a.drawableState = getState();
                    ajxx ajxx2 = this.o;
                    ajxx2.d.a(this.n, ajxx2.a, ajxx2.b);
                }
                this.o.a.setTextAlign(align);
                int round = Math.round(this.o.a(this.c.toString()));
                int round2 = Math.round(this.T.width());
                if (round > round2) {
                    i7 = canvas.save();
                    canvas2.clipRect(this.T);
                } else {
                    i7 = 0;
                }
                CharSequence charSequence2 = this.c;
                if (round > round2 && this.p != null) {
                    charSequence = TextUtils.ellipsize(charSequence2, this.o.a, this.T.width(), this.p);
                } else {
                    charSequence = charSequence2;
                }
                int length = charSequence.length();
                float f11 = this.U.x;
                i6 = 0;
                i5 = i3;
                canvas.drawText(charSequence, 0, length, f11, this.U.y, this.o.a);
                if (round > round2) {
                    canvas2.restoreToCount(i7);
                }
            }
            if (b()) {
                RectF rectF2 = this.T;
                rectF2.setEmpty();
                if (b()) {
                    float f12 = this.m + this.l;
                    if (ma.h(this) == 0) {
                        rectF2.right = ((float) bounds.right) - f12;
                        rectF2.left = rectF2.right - this.f;
                    } else {
                        rectF2.left = ((float) bounds.left) + f12;
                        rectF2.right = rectF2.left + this.f;
                    }
                    rectF2.top = bounds.exactCenterY() - (this.f / 2.0f);
                    rectF2.bottom = rectF2.top + this.f;
                }
                float f13 = this.T.left;
                float f14 = this.T.top;
                canvas2.translate(f13, f14);
                this.e.setBounds(i6, i6, (int) this.T.width(), (int) this.T.height());
                if (ajyu.a) {
                    this.K.setBounds(this.e.getBounds());
                    this.K.jumpToCurrentState();
                    this.K.draw(canvas2);
                } else {
                    this.e.draw(canvas2);
                }
                canvas2.translate(-f13, -f14);
            }
            if (this.ae < 255) {
                canvas2.restoreToCount(i5);
            }
        }
    }

    public final float f() {
        return !this.an ? this.C : p();
    }

    public final Drawable g() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return ma.g(drawable);
        }
        return null;
    }

    public final int getAlpha() {
        return this.ae;
    }

    public final ColorFilter getColorFilter() {
        return this.af;
    }

    public final int getIntrinsicHeight() {
        return (int) this.a;
    }

    public final int getIntrinsicWidth() {
        return Math.min(Math.round(this.h + d() + this.i + this.o.a(this.c.toString()) + this.j + e() + this.m), this.r);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        if (!this.an) {
            Rect bounds = getBounds();
            if (!bounds.isEmpty()) {
                outline.setRoundRect(bounds, this.C);
            } else {
                outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.C);
            }
            outline.setAlpha(((float) this.ae) / 255.0f);
            return;
        }
        super.getOutline(outline);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        r0 = r0.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.A
            boolean r0 = e(r0)
            if (r0 != 0) goto L_0x0056
            android.content.res.ColorStateList r0 = r1.B
            boolean r0 = e(r0)
            if (r0 != 0) goto L_0x0056
            android.content.res.ColorStateList r0 = r1.D
            boolean r0 = e(r0)
            if (r0 != 0) goto L_0x0056
            boolean r0 = r1.ak
            if (r0 != 0) goto L_0x001d
            goto L_0x0025
        L_0x001d:
            android.content.res.ColorStateList r0 = r1.al
            boolean r0 = e(r0)
            if (r0 != 0) goto L_0x0056
        L_0x0025:
            ajxx r0 = r1.o
            ajyq r0 = r0.d
            if (r0 == 0) goto L_0x0035
            android.content.res.ColorStateList r0 = r0.b
            if (r0 == 0) goto L_0x0035
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0056
        L_0x0035:
            boolean r0 = r1.u()
            if (r0 != 0) goto L_0x0056
            android.graphics.drawable.Drawable r0 = r1.G
            boolean r0 = a((android.graphics.drawable.Drawable) r0)
            if (r0 != 0) goto L_0x0056
            android.graphics.drawable.Drawable r0 = r1.N
            boolean r0 = a((android.graphics.drawable.Drawable) r0)
            if (r0 != 0) goto L_0x0056
            android.content.res.ColorStateList r0 = r1.ah
            boolean r0 = e(r0)
            if (r0 == 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r0 = 0
            return r0
        L_0x0056:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajuj.isStateful():boolean");
    }

    public final boolean onLayoutDirectionChanged(int i2) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (s()) {
            onLayoutDirectionChanged |= ma.b(this.G, i2);
        }
        if (t()) {
            onLayoutDirectionChanged |= ma.b(this.N, i2);
        }
        if (b()) {
            onLayoutDirectionChanged |= ma.b(this.e, i2);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i2) {
        boolean onLevelChange = super.onLevelChange(i2);
        if (s()) {
            onLevelChange |= this.G.setLevel(i2);
        }
        if (t()) {
            onLevelChange |= this.N.setLevel(i2);
        }
        if (b()) {
            onLevelChange |= this.e.setLevel(i2);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public final boolean onStateChange(int[] iArr) {
        if (this.an) {
            super.onStateChange(iArr);
        }
        return a(iArr, this.aj);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    public final void setAlpha(int i2) {
        if (this.ae != i2) {
            this.ae = i2;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.af != colorFilter) {
            this.af = colorFilter;
            invalidateSelf();
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.ah != colorStateList) {
            this.ah = colorStateList;
            onStateChange(getState());
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.ai != mode) {
            this.ai = mode;
            this.ag = ajwg.a(this, this.ah, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (s()) {
            visible |= this.G.setVisible(z2, z3);
        }
        if (t()) {
            visible |= this.N.setVisible(z2, z3);
        }
        if (b()) {
            visible |= this.e.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float d() {
        if (!s() && !t()) {
            return 0.0f;
        }
        return this.P + this.I + this.Q;
    }

    public final float e() {
        if (b()) {
            return this.k + this.f + this.l;
        }
        return 0.0f;
    }

    public final void b(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.G;
        Drawable drawable4 = null;
        if (drawable3 != null) {
            drawable2 = ma.g(drawable3);
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float d2 = d();
            if (drawable != null) {
                drawable4 = ma.f(drawable).mutate();
            }
            this.G = drawable4;
            float d3 = d();
            d(drawable2);
            if (s()) {
                c(this.G);
            }
            invalidateSelf();
            if (d2 != d3) {
                a();
            }
        }
    }

    public final void d(boolean z2) {
        if (this.M != z2) {
            boolean t = t();
            this.M = z2;
            boolean t2 = t();
            if (t != t2) {
                if (!t2) {
                    d(this.N);
                } else {
                    c(this.N);
                }
                invalidateSelf();
                a();
            }
        }
    }

    public final void c() {
        a();
        invalidateSelf();
    }

    public final void c(boolean z2) {
        if (this.d != z2) {
            boolean b2 = b();
            this.d = z2;
            boolean b3 = b();
            if (b2 != b3) {
                if (!b3) {
                    d(this.e);
                } else {
                    c(this.e);
                }
                invalidateSelf();
                a();
            }
        }
    }

    public final void b(boolean z2) {
        if (this.F != z2) {
            boolean s = s();
            this.F = z2;
            boolean s2 = s();
            if (s != s2) {
                if (!s2) {
                    d(this.G);
                } else {
                    c(this.G);
                }
                invalidateSelf();
                a();
            }
        }
    }

    private final void a(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (s() || t()) {
            float f2 = this.h + this.P;
            if (ma.h(this) == 0) {
                rectF.left = ((float) rect.left) + f2;
                rectF.right = rectF.left + this.I;
            } else {
                rectF.right = ((float) rect.right) - f2;
                rectF.left = rectF.right - this.I;
            }
            rectF.top = rect.exactCenterY() - (this.I / 2.0f);
            rectF.bottom = rectF.top + this.I;
        }
    }

    public static boolean a(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x014c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(int[] r9, int[] r10) {
        /*
            r8 = this;
            boolean r0 = super.onStateChange(r9)
            android.content.res.ColorStateList r1 = r8.A
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r8.W
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r3 = r8.W
            r4 = 1
            if (r3 != r1) goto L_0x0017
            goto L_0x001a
        L_0x0017:
            r8.W = r1
            r0 = 1
        L_0x001a:
            android.content.res.ColorStateList r3 = r8.B
            if (r3 == 0) goto L_0x0025
            int r5 = r8.X
            int r3 = r3.getColorForState(r9, r5)
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            int r5 = r8.X
            if (r5 != r3) goto L_0x002b
            goto L_0x002e
        L_0x002b:
            r8.X = r3
            r0 = 1
        L_0x002e:
            int r1 = defpackage.lk.a(r3, r1)
            int r3 = r8.Y
            if (r3 == r1) goto L_0x0038
            r3 = 1
            goto L_0x0039
        L_0x0038:
            r3 = 0
        L_0x0039:
            android.content.res.ColorStateList r5 = r8.i()
            if (r5 != 0) goto L_0x0041
            r5 = 1
            goto L_0x0042
        L_0x0041:
            r5 = 0
        L_0x0042:
            r3 = r3 | r5
            if (r3 == 0) goto L_0x0050
            r8.Y = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r8.c((android.content.res.ColorStateList) r0)
            r0 = 1
            goto L_0x0051
        L_0x0050:
        L_0x0051:
            android.content.res.ColorStateList r1 = r8.D
            if (r1 == 0) goto L_0x005c
            int r3 = r8.Z
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x005d
        L_0x005c:
            r1 = 0
        L_0x005d:
            int r3 = r8.Z
            if (r3 != r1) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            r8.Z = r1
            r0 = 1
        L_0x0065:
            android.content.res.ColorStateList r1 = r8.al
            if (r1 == 0) goto L_0x0078
            boolean r1 = defpackage.ajyu.a((int[]) r9)
            if (r1 == 0) goto L_0x0078
            android.content.res.ColorStateList r1 = r8.al
            int r3 = r8.aa
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0079
        L_0x0078:
            r1 = 0
        L_0x0079:
            int r3 = r8.aa
            if (r3 != r1) goto L_0x007e
            goto L_0x0085
        L_0x007e:
            r8.aa = r1
            boolean r1 = r8.ak
            if (r1 == 0) goto L_0x0085
            r0 = 1
        L_0x0085:
            ajxx r1 = r8.o
            ajyq r1 = r1.d
            if (r1 == 0) goto L_0x0096
            android.content.res.ColorStateList r1 = r1.b
            if (r1 == 0) goto L_0x0096
            int r3 = r8.ab
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0097
        L_0x0096:
            r1 = 0
        L_0x0097:
            int r3 = r8.ab
            if (r3 != r1) goto L_0x009c
            goto L_0x009f
        L_0x009c:
            r8.ab = r1
            r0 = 1
        L_0x009f:
            int[] r1 = r8.getState()
            if (r1 == 0) goto L_0x00b9
            int r3 = r1.length
            r5 = 0
        L_0x00a7:
            if (r5 >= r3) goto L_0x00b9
            r6 = r1[r5]
            r7 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r6 == r7) goto L_0x00b3
            int r5 = r5 + 1
            goto L_0x00a7
        L_0x00b3:
            boolean r1 = r8.g
            if (r1 == 0) goto L_0x00b9
            r1 = 1
            goto L_0x00ba
        L_0x00b9:
            r1 = 0
        L_0x00ba:
            boolean r3 = r8.ac
            if (r3 != r1) goto L_0x00c0
            r1 = 0
            goto L_0x00d9
        L_0x00c0:
            android.graphics.drawable.Drawable r3 = r8.N
            if (r3 == 0) goto L_0x00d7
            float r0 = r8.d()
            r8.ac = r1
            float r1 = r8.d()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d5
            r0 = 1
            r1 = 1
            goto L_0x00d9
        L_0x00d5:
            r0 = 1
            goto L_0x00d8
        L_0x00d7:
        L_0x00d8:
            r1 = 0
        L_0x00d9:
            android.content.res.ColorStateList r3 = r8.ah
            if (r3 == 0) goto L_0x00e4
            int r5 = r8.ad
            int r3 = r3.getColorForState(r9, r5)
            goto L_0x00e5
        L_0x00e4:
            r3 = 0
        L_0x00e5:
            int r5 = r8.ad
            if (r5 == r3) goto L_0x00f6
            r8.ad = r3
            android.content.res.ColorStateList r0 = r8.ah
            android.graphics.PorterDuff$Mode r3 = r8.ai
            android.graphics.PorterDuffColorFilter r0 = defpackage.ajwg.a(r8, r0, r3)
            r8.ag = r0
            goto L_0x00f7
        L_0x00f6:
            r4 = r0
        L_0x00f7:
            android.graphics.drawable.Drawable r0 = r8.G
            boolean r0 = a((android.graphics.drawable.Drawable) r0)
            if (r0 == 0) goto L_0x0106
            android.graphics.drawable.Drawable r0 = r8.G
            boolean r0 = r0.setState(r9)
            r4 = r4 | r0
        L_0x0106:
            android.graphics.drawable.Drawable r0 = r8.N
            boolean r0 = a((android.graphics.drawable.Drawable) r0)
            if (r0 == 0) goto L_0x0115
            android.graphics.drawable.Drawable r0 = r8.N
            boolean r0 = r0.setState(r9)
            r4 = r4 | r0
        L_0x0115:
            android.graphics.drawable.Drawable r0 = r8.e
            boolean r0 = a((android.graphics.drawable.Drawable) r0)
            if (r0 == 0) goto L_0x0131
            int r0 = r9.length
            int r3 = r10.length
            int r5 = r0 + r3
            int[] r5 = new int[r5]
            java.lang.System.arraycopy(r9, r2, r5, r2, r0)
            java.lang.System.arraycopy(r10, r2, r5, r0, r3)
            android.graphics.drawable.Drawable r9 = r8.e
            boolean r9 = r9.setState(r5)
            r4 = r4 | r9
            goto L_0x0132
        L_0x0131:
        L_0x0132:
            boolean r9 = defpackage.ajyu.a
            if (r9 == 0) goto L_0x0145
            android.graphics.drawable.Drawable r9 = r8.K
            boolean r9 = a((android.graphics.drawable.Drawable) r9)
            if (r9 == 0) goto L_0x0145
            android.graphics.drawable.Drawable r9 = r8.K
            boolean r9 = r9.setState(r10)
            r4 = r4 | r9
        L_0x0145:
            if (r4 == 0) goto L_0x014a
            r8.invalidateSelf()
        L_0x014a:
            if (r1 == 0) goto L_0x014f
            r8.a()
        L_0x014f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajuj.a(int[], int[]):boolean");
    }

    /* access modifiers changed from: protected */
    public final void a() {
        ajui ajui = (ajui) this.am.get();
        if (ajui != null) {
            ajui.b();
        }
    }

    public final void a(int i2) {
        a(new ajyq(this.n, i2));
    }

    public final void a(ajui ajui) {
        this.am = new WeakReference(ajui);
    }

    public final void a(ajyq ajyq) {
        this.o.a(ajyq, this.n);
    }

    public final void a(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            onStateChange(getState());
        }
    }

    public final void a(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.c, charSequence)) {
            this.c = charSequence;
            this.o.a();
            invalidateSelf();
            a();
        }
    }

    public final void a(boolean z2) {
        if (this.ak != z2) {
            this.ak = z2;
            w();
            onStateChange(getState());
        }
    }

    public final boolean a(int[] iArr) {
        if (Arrays.equals(this.aj, iArr)) {
            return false;
        }
        this.aj = iArr;
        if (b()) {
            return a(getState(), iArr);
        }
        return false;
    }
}
