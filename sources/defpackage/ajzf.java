package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;

/* renamed from: ajzf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ajzf extends Drawable implements mb, ajzw {
    private static final String a = ajzf.class.getSimpleName();
    private static final Paint b = new Paint(1);
    private final Matrix c;
    private final Path d;
    private final Path e;
    private final RectF f;
    private final RectF g;
    private final Region h;
    private final Region i;
    private ajzl j;
    private final Paint k;
    private final Paint l;
    private final ajyv m;
    private final ajzn n;
    private PorterDuffColorFilter o;
    private PorterDuffColorFilter p;
    private final RectF q;
    private final ajzc r;
    public ajze s;
    public final ajzu[] t;
    public final ajzu[] u;
    public final BitSet v;
    public boolean w;
    public boolean x;

    public ajzf() {
        this(new ajzl());
    }

    private final int a(int i2) {
        float l2 = l();
        ajze ajze = this.s;
        float f2 = l2 + ajze.n;
        ajwh ajwh = ajze.b;
        return ajwh != null ? ajwh.a(i2, f2) : i2;
    }

    private static int a(int i2, int i3) {
        return (i2 * (i3 + (i3 >>> 7))) >>> 8;
    }

    private final void b(RectF rectF, Path path) {
        a(rectF, path);
        if (this.s.j != 1.0f) {
            this.c.reset();
            Matrix matrix = this.c;
            float f2 = this.s.j;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.c);
        }
        path.computeBounds(this.q, true);
    }

    private final float c() {
        if (a()) {
            return this.l.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private final RectF d() {
        this.g.set(j());
        float c2 = c();
        this.g.inset(c2, c2);
        return this.g;
    }

    public void draw(Canvas canvas) {
        this.k.setColorFilter(this.o);
        int alpha = this.k.getAlpha();
        this.k.setAlpha(a(alpha, this.s.m));
        this.l.setColorFilter(this.p);
        this.l.setStrokeWidth(this.s.l);
        int alpha2 = this.l.getAlpha();
        this.l.setAlpha(a(alpha2, this.s.m));
        if (this.w) {
            float c2 = c();
            ajzl h2 = h();
            ajzd ajzd = new ajzd(-c2);
            ajzk b2 = h2.b();
            b2.e = ajzd.a(h2.f);
            b2.f = ajzd.a(h2.g);
            b2.h = ajzd.a(h2.i);
            b2.g = ajzd.a(h2.h);
            ajzl a2 = b2.a();
            this.j = a2;
            this.n.a(a2, this.s.k, d(), this.e);
            b(j(), this.d);
            this.w = false;
        }
        ajze ajze = this.s;
        int i2 = ajze.q;
        if (ajze.r > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!q() && !this.d.isConvex() && Build.VERSION.SDK_INT < 29) {
                canvas.save();
                int n2 = n();
                int o2 = o();
                int i4 = Build.VERSION.SDK_INT;
                canvas.translate((float) n2, (float) o2);
                if (this.x) {
                    int width = (int) (this.q.width() - ((float) getBounds().width()));
                    int height = (int) (this.q.height() - ((float) getBounds().height()));
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    float width2 = this.q.width();
                    int i5 = this.s.r;
                    float height2 = this.q.height();
                    int i6 = this.s.r;
                    Bitmap createBitmap = Bitmap.createBitmap(((int) width2) + i5 + i5 + width, ((int) height2) + i6 + i6 + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f2 = (float) ((getBounds().left - this.s.r) - width);
                    float f3 = (float) ((getBounds().top - this.s.r) - height);
                    canvas2.translate(-f2, -f3);
                    a(canvas2);
                    canvas.drawBitmap(createBitmap, f2, f3, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    a(canvas);
                    canvas.restore();
                }
            }
        }
        if (this.s.v == Paint.Style.FILL_AND_STROKE || this.s.v == Paint.Style.FILL) {
            a(canvas, this.k, this.d, this.s.a, j());
        }
        if (a()) {
            a(canvas, this.l, this.e, this.j, d());
        }
        this.k.setAlpha(alpha);
        this.l.setAlpha(alpha2);
    }

    public final Drawable.ConstantState getConstantState() {
        return this.s;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        int i2 = this.s.q;
        if (q()) {
            outline.setRoundRect(getBounds(), p() * this.s.k);
            return;
        }
        b(j(), this.d);
        if (this.d.isConvex() || Build.VERSION.SDK_INT >= 29) {
            outline.setConvexPath(this.d);
        }
    }

    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.s.i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public final Region getTransparentRegion() {
        this.h.set(getBounds());
        b(j(), this.d);
        this.i.setPath(this.d, this.h);
        this.h.op(this.i, Region.Op.DIFFERENCE);
        return this.h;
    }

    public final ajzl h() {
        return this.s.a;
    }

    public final ColorStateList i() {
        return this.s.d;
    }

    public final void invalidateSelf() {
        this.w = true;
        super.invalidateSelf();
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        if (super.isStateful() || ((colorStateList = this.s.g) != null && colorStateList.isStateful())) {
            return true;
        }
        ajze ajze = this.s;
        ColorStateList colorStateList2 = ajze.f;
        ColorStateList colorStateList3 = ajze.e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.s.d;
        return colorStateList4 != null && colorStateList4.isStateful();
    }

    public final RectF j() {
        this.f.set(getBounds());
        return this.f;
    }

    public final float k() {
        return this.s.o;
    }

    public final float l() {
        float k2 = k();
        float f2 = this.s.p;
        return k2 + 0.0f;
    }

    public final void m() {
        float l2 = l();
        this.s.r = (int) Math.ceil((double) (0.75f * l2));
        this.s.s = (int) Math.ceil((double) (l2 * 0.25f));
        b();
        super.invalidateSelf();
    }

    public final Drawable mutate() {
        this.s = new ajze(this.s);
        return this;
    }

    public final int n() {
        ajze ajze = this.s;
        double d2 = (double) ajze.s;
        double sin = Math.sin(Math.toRadians((double) ajze.t));
        Double.isNaN(d2);
        return (int) (d2 * sin);
    }

    public final int o() {
        ajze ajze = this.s;
        double d2 = (double) ajze.s;
        double cos = Math.cos(Math.toRadians((double) ajze.t));
        Double.isNaN(d2);
        return (int) (d2 * cos);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.w = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean a2 = a(iArr);
        boolean b2 = b();
        boolean z = true;
        if (!a2 && !b2) {
            z = false;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final float p() {
        return this.s.a.f.a(j());
    }

    public final boolean q() {
        return this.s.a.a(j());
    }

    public final void r() {
        this.m.a(-12303292);
        this.s.u = false;
        super.invalidateSelf();
    }

    public void setAlpha(int i2) {
        ajze ajze = this.s;
        if (ajze.m != i2) {
            ajze.m = i2;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.s.c = colorFilter;
        super.invalidateSelf();
    }

    public final void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.s.g = colorStateList;
        b();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        ajze ajze = this.s;
        if (ajze.h != mode) {
            ajze.h = mode;
            b();
            super.invalidateSelf();
        }
    }

    public ajzf(ajze ajze) {
        this.t = new ajzu[4];
        this.u = new ajzu[4];
        this.v = new BitSet(8);
        this.c = new Matrix();
        this.d = new Path();
        this.e = new Path();
        this.f = new RectF();
        this.g = new RectF();
        this.h = new Region();
        this.i = new Region();
        this.k = new Paint(1);
        this.l = new Paint(1);
        this.m = new ajyv();
        this.n = new ajzn();
        this.q = new RectF();
        this.x = true;
        this.s = ajze;
        this.l.setStyle(Paint.Style.STROKE);
        this.k.setStyle(Paint.Style.FILL);
        b.setColor(-1);
        b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        b();
        a(getState());
        this.r = new ajzc(this);
    }

    public final void c(float f2) {
        ajze ajze = this.s;
        if (ajze.k != f2) {
            ajze.k = f2;
            this.w = true;
            invalidateSelf();
        }
    }

    public final void d(float f2) {
        ajze ajze = this.s;
        if (ajze.o != f2) {
            ajze.o = f2;
            m();
        }
    }

    private final boolean b() {
        PorterDuffColorFilter porterDuffColorFilter = this.o;
        PorterDuffColorFilter porterDuffColorFilter2 = this.p;
        ajze ajze = this.s;
        this.o = a(ajze.g, ajze.h, this.k, true);
        ajze ajze2 = this.s;
        ColorStateList colorStateList = ajze2.f;
        this.p = a((ColorStateList) null, ajze2.h, this.l, false);
        boolean z = this.s.u;
        if (!op.a(porterDuffColorFilter, this.o) || !op.a(porterDuffColorFilter2, this.p)) {
            return true;
        }
        return false;
    }

    public final void c(ColorStateList colorStateList) {
        ajze ajze = this.s;
        if (ajze.d != colorStateList) {
            ajze.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void d(ColorStateList colorStateList) {
        ajze ajze = this.s;
        if (ajze.e != colorStateList) {
            ajze.e = colorStateList;
            onStateChange(getState());
        }
    }

    public static ajzf a(Context context, float f2) {
        int a2 = ajuo.a(context, ajzf.class.getSimpleName());
        ajzf ajzf = new ajzf();
        ajzf.a(context);
        ajzf.c(ColorStateList.valueOf(a2));
        ajzf.d(f2);
        return ajzf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r2 = r4.getColor();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.graphics.PorterDuffColorFilter a(android.content.res.ColorStateList r2, android.graphics.PorterDuff.Mode r3, android.graphics.Paint r4, boolean r5) {
        /*
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L_0x001c
            if (r3 == 0) goto L_0x001c
            int[] r4 = r1.getState()
            r0 = 0
            int r2 = r2.getColorForState(r4, r0)
            if (r5 == 0) goto L_0x0015
            int r2 = r1.a((int) r2)
            goto L_0x0016
        L_0x0015:
        L_0x0016:
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            r0.<init>(r2, r3)
            goto L_0x0032
        L_0x001c:
            if (r5 == 0) goto L_0x0031
            int r2 = r4.getColor()
            int r3 = r1.a((int) r2)
            if (r3 != r2) goto L_0x0029
            goto L_0x0032
        L_0x0029:
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r4)
            return r2
        L_0x0031:
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajzf.a(android.content.res.ColorStateList, android.graphics.PorterDuff$Mode, android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    public final void b(float f2) {
        a(this.s.a.a(f2));
    }

    public final void b(int i2) {
        ajze ajze = this.s;
        if (ajze.t != i2) {
            ajze.t = i2;
            super.invalidateSelf();
        }
    }

    public ajzf(ajzl ajzl) {
        this(new ajze(ajzl));
    }

    public ajzf(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(ajzl.a(context, attributeSet, i2, i3).a());
    }

    private final void a(Canvas canvas) {
        if (this.v.cardinality() > 0) {
            Log.w(a, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.s.s != 0) {
            canvas.drawPath(this.d, this.m.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            this.t[i2].a(this.m, this.s.r, canvas);
            this.u[i2].a(this.m, this.s.r, canvas);
        }
        if (this.x) {
            int n2 = n();
            int o2 = o();
            canvas.translate((float) (-n2), (float) (-o2));
            canvas.drawPath(this.d, b);
            canvas.translate((float) n2, (float) o2);
        }
    }

    private final boolean a() {
        return (this.s.v == Paint.Style.FILL_AND_STROKE || this.s.v == Paint.Style.STROKE) && this.l.getStrokeWidth() > 0.0f;
    }

    private final boolean a(int[] iArr) {
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        boolean z = false;
        if (!(this.s.d == null || (color2 = this.k.getColor()) == (colorForState2 = this.s.d.getColorForState(iArr, color2)))) {
            this.k.setColor(colorForState2);
            z = true;
        }
        if (this.s.e == null || (color = this.l.getColor()) == (colorForState = this.s.e.getColorForState(iArr, color))) {
            return z;
        }
        this.l.setColor(colorForState);
        return true;
    }

    public final void a(float f2) {
        this.s.l = f2;
        invalidateSelf();
    }

    public final void a(float f2, int i2) {
        a(f2);
        d(ColorStateList.valueOf(i2));
    }

    public final void a(float f2, ColorStateList colorStateList) {
        a(f2);
        d(colorStateList);
    }

    public final void a(ajzl ajzl) {
        this.s.a = ajzl;
        invalidateSelf();
    }

    public final void a(Context context) {
        this.s.b = new ajwh(context);
        m();
    }

    public final void a(Canvas canvas, Paint paint, Path path, ajzl ajzl, RectF rectF) {
        if (ajzl.a(rectF)) {
            float a2 = ajzl.g.a(rectF) * this.s.k;
            canvas.drawRoundRect(rectF, a2, a2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* access modifiers changed from: protected */
    public final void a(RectF rectF, Path path) {
        ajzn ajzn = this.n;
        ajze ajze = this.s;
        ajzl ajzl = ajze.a;
        float f2 = ajze.k;
        ajzn.a(ajzl, f2, rectF, this.r, path);
    }
}
