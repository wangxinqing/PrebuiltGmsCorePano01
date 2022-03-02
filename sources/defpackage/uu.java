package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: uu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class uu extends Drawable implements Drawable.Callback {
    public ut a;
    public Drawable b;
    public int c = -1;
    private Rect d;
    private Drawable e;
    private int f = 255;
    private boolean g;
    private boolean h;
    private Runnable i;
    private long j;
    private long k;
    private us l;

    static int a(Resources resources, int i2) {
        if (resources != null) {
            i2 = resources.getDisplayMetrics().densityDpi;
        }
        if (i2 == 0) {
            return 160;
        }
        return i2;
    }

    public void applyTheme(Resources.Theme theme) {
        ut utVar = this.a;
        if (theme != null) {
            utVar.c();
            int i2 = utVar.j;
            Drawable[] drawableArr = utVar.i;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable != null && drawable.canApplyTheme()) {
                    drawableArr[i3].applyTheme(theme);
                    utVar.g |= drawableArr[i3].getChangingConfigurations();
                }
            }
            utVar.a(theme.getResources());
        }
    }

    public ut c() {
        return this.a;
    }

    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final int getAlpha() {
        return this.f;
    }

    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.a.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.a.e()) {
            return null;
        }
        this.a.f = getChangingConfigurations();
        return this.a;
    }

    public final Drawable getCurrent() {
        return this.b;
    }

    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.d;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public final int getIntrinsicHeight() {
        ut utVar = this.a;
        if (!utVar.n) {
            Drawable drawable = this.b;
            if (drawable != null) {
                return drawable.getIntrinsicHeight();
            }
            return -1;
        }
        if (!utVar.o) {
            utVar.d();
        }
        return utVar.q;
    }

    public final int getIntrinsicWidth() {
        ut utVar = this.a;
        if (!utVar.n) {
            Drawable drawable = this.b;
            if (drawable != null) {
                return drawable.getIntrinsicWidth();
            }
            return -1;
        }
        if (!utVar.o) {
            utVar.d();
        }
        return utVar.p;
    }

    public final int getMinimumHeight() {
        ut utVar = this.a;
        if (!utVar.n) {
            Drawable drawable = this.b;
            if (drawable != null) {
                return drawable.getMinimumHeight();
            }
            return 0;
        }
        if (!utVar.o) {
            utVar.d();
        }
        return utVar.s;
    }

    public final int getMinimumWidth() {
        ut utVar = this.a;
        if (!utVar.n) {
            Drawable drawable = this.b;
            if (drawable != null) {
                return drawable.getMinimumWidth();
            }
            return 0;
        }
        if (!utVar.o) {
            utVar.d();
        }
        return utVar.r;
    }

    public final int getOpacity() {
        Drawable drawable = this.b;
        int i2 = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        ut utVar = this.a;
        if (utVar.t) {
            return utVar.u;
        }
        utVar.c();
        int i3 = utVar.j;
        Drawable[] drawableArr = utVar.i;
        if (i3 > 0) {
            i2 = drawableArr[0].getOpacity();
        }
        for (int i4 = 1; i4 < i3; i4++) {
            i2 = Drawable.resolveOpacity(i2, drawableArr[i4].getOpacity());
        }
        utVar.u = i2;
        utVar.t = true;
        return i2;
    }

    public final void getOutline(Outline outline) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public final boolean getPadding(Rect rect) {
        ut utVar = this.a;
        Rect rect2 = null;
        boolean z = false;
        if (!utVar.k) {
            Rect rect3 = utVar.m;
            if (rect3 != null || utVar.l) {
                rect2 = rect3;
            } else {
                utVar.c();
                Rect rect4 = new Rect();
                int i2 = utVar.j;
                Drawable[] drawableArr = utVar.i;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        if (rect4.left > rect2.left) {
                            rect2.left = rect4.left;
                        }
                        if (rect4.top > rect2.top) {
                            rect2.top = rect4.top;
                        }
                        if (rect4.right > rect2.right) {
                            rect2.right = rect4.right;
                        }
                        if (rect4.bottom > rect2.bottom) {
                            rect2.bottom = rect4.bottom;
                        }
                    }
                }
                utVar.l = true;
                utVar.m = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z = true;
            }
        } else {
            Drawable drawable = this.b;
            if (drawable != null) {
                z = drawable.getPadding(rect);
            } else {
                z = super.getPadding(rect);
            }
        }
        if (isAutoMirrored() && ma.h(this) == 1) {
            int i4 = rect.left;
            rect.left = rect.right;
            rect.right = i4;
        }
        return z;
    }

    public final void invalidateDrawable(Drawable drawable) {
        ut utVar = this.a;
        if (utVar != null) {
            utVar.b();
        }
        if (drawable == this.b && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final boolean isAutoMirrored() {
        return this.a.D;
    }

    public boolean isStateful() {
        ut utVar = this.a;
        if (utVar.v) {
            return utVar.w;
        }
        utVar.c();
        int i2 = utVar.j;
        Drawable[] drawableArr = utVar.i;
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                if (drawableArr[i3].isStateful()) {
                    z = true;
                    break;
                }
                i3++;
            } else {
                break;
            }
        }
        utVar.w = z;
        utVar.v = true;
        return z;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.e;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.e = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.g) {
                this.b.setAlpha(this.f);
            }
        }
        if (this.k == 0) {
            z2 = z;
        } else {
            this.k = 0;
        }
        if (this.j != 0) {
            this.j = 0;
        } else if (!z2) {
            return;
        }
        invalidateSelf();
    }

    public Drawable mutate() {
        if (!this.h && super.mutate() == this) {
            ut c2 = c();
            c2.a();
            a(c2);
            this.h = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public final boolean onLayoutDirectionChanged(int i2) {
        ut utVar = this.a;
        int i3 = this.c;
        int i4 = utVar.j;
        Drawable[] drawableArr = utVar.i;
        boolean z = false;
        for (int i5 = 0; i5 < i4; i5++) {
            if (drawableArr[i5] != null) {
                boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i5].setLayoutDirection(i2) : false;
                if (i5 == i3) {
                    z = layoutDirection;
                }
            }
        }
        utVar.A = i2;
        return z;
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable == this.b && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j2);
        }
    }

    public final void setAlpha(int i2) {
        if (!this.g || this.f != i2) {
            this.g = true;
            this.f = i2;
            Drawable drawable = this.b;
            if (drawable == null) {
                return;
            }
            if (this.j == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    public final void setAutoMirrored(boolean z) {
        ut utVar = this.a;
        if (utVar.D != z) {
            utVar.D = z;
            Drawable drawable = this.b;
            if (drawable != null) {
                ma.a(drawable, z);
            }
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        ut utVar = this.a;
        utVar.F = true;
        if (utVar.E != colorFilter) {
            utVar.E = colorFilter;
            Drawable drawable = this.b;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public final void setDither(boolean z) {
        ut utVar = this.a;
        if (utVar.z != z) {
            utVar.z = z;
            Drawable drawable = this.b;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public final void setHotspot(float f2, float f3) {
        Drawable drawable = this.b;
        if (drawable != null) {
            ma.a(drawable, f2, f3);
        }
    }

    public final void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.d;
        if (rect == null) {
            this.d = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.b;
        if (drawable != null) {
            ma.a(drawable, i2, i3, i4, i5);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        ut utVar = this.a;
        utVar.I = true;
        if (utVar.G != colorStateList) {
            utVar.G = colorStateList;
            ma.a(this.b, colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        ut utVar = this.a;
        utVar.J = true;
        if (utVar.H != mode) {
            utVar.H = mode;
            ma.a(this.b, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.b && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    private final void a(Drawable drawable) {
        if (this.l == null) {
            this.l = new us();
        }
        us usVar = this.l;
        usVar.a = drawable.getCallback();
        drawable.setCallback(usVar);
        try {
            if (this.a.B <= 0) {
                if (this.g) {
                    drawable.setAlpha(this.f);
                }
            }
            ut utVar = this.a;
            if (utVar.F) {
                drawable.setColorFilter(utVar.E);
            } else {
                if (utVar.I) {
                    ma.a(drawable, utVar.G);
                }
                ut utVar2 = this.a;
                if (utVar2.J) {
                    ma.a(drawable, utVar2.H);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.a.z);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            int i2 = Build.VERSION.SDK_INT;
            drawable.setAutoMirrored(this.a.D);
            Rect rect = this.d;
            int i3 = Build.VERSION.SDK_INT;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.l.a());
        }
    }

    public void a(ut utVar) {
        this.a = utVar;
        int i2 = this.c;
        if (i2 >= 0) {
            Drawable b2 = utVar.b(i2);
            this.b = b2;
            if (b2 != null) {
                a(b2);
            }
        }
        this.e = null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.b
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0037
            long r9 = r13.j
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0036
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 <= 0) goto L_0x0030
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            ut r9 = r13.a
            int r9 = r9.B
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x003b
        L_0x0030:
            int r9 = r13.f
            r3.setAlpha(r9)
            goto L_0x0038
        L_0x0036:
            goto L_0x003a
        L_0x0037:
        L_0x0038:
            r13.j = r7
        L_0x003a:
            r3 = 0
        L_0x003b:
            android.graphics.drawable.Drawable r9 = r13.e
            if (r9 == 0) goto L_0x0064
            long r10 = r13.k
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0067
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 <= 0) goto L_0x005c
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            ut r4 = r13.a
            int r4 = r4.C
            int r3 = r3 / r4
            int r4 = r13.f
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0068
        L_0x005c:
            r9.setVisible(r6, r6)
            r0 = 0
            r13.e = r0
            goto L_0x0065
        L_0x0064:
        L_0x0065:
            r13.k = r7
        L_0x0067:
            r0 = r3
        L_0x0068:
            if (r14 == 0) goto L_0x0074
            if (r0 == 0) goto L_0x0074
            java.lang.Runnable r14 = r13.i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uu.a(boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r10) {
        /*
            r9 = this;
            int r0 = r9.c
            r1 = 0
            if (r10 == r0) goto L_0x007f
            long r2 = android.os.SystemClock.uptimeMillis()
            ut r0 = r9.a
            int r0 = r0.C
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002f
            android.graphics.drawable.Drawable r0 = r9.e
            if (r0 != 0) goto L_0x0017
            goto L_0x001b
        L_0x0017:
            r0.setVisible(r1, r1)
        L_0x001b:
            android.graphics.drawable.Drawable r0 = r9.b
            if (r0 == 0) goto L_0x002a
            r9.e = r0
            ut r0 = r9.a
            int r0 = r0.C
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.k = r0
            goto L_0x0036
        L_0x002a:
            r9.e = r4
            r9.k = r5
            goto L_0x0036
        L_0x002f:
            android.graphics.drawable.Drawable r0 = r9.b
            if (r0 == 0) goto L_0x0036
            r0.setVisible(r1, r1)
        L_0x0036:
            if (r10 < 0) goto L_0x0056
            ut r0 = r9.a
            int r1 = r0.j
            if (r10 >= r1) goto L_0x0056
            android.graphics.drawable.Drawable r0 = r0.b((int) r10)
            r9.b = r0
            r9.c = r10
            if (r0 == 0) goto L_0x005b
            ut r10 = r9.a
            int r10 = r10.B
            if (r10 <= 0) goto L_0x0052
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.j = r2
        L_0x0052:
            r9.a((android.graphics.drawable.Drawable) r0)
            goto L_0x005b
        L_0x0056:
            r9.b = r4
            r10 = -1
            r9.c = r10
        L_0x005b:
            long r0 = r9.j
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0068
            long r0 = r9.k
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x007b
        L_0x0068:
            java.lang.Runnable r0 = r9.i
            if (r0 != 0) goto L_0x0074
            ur r0 = new ur
            r0.<init>(r9)
            r9.i = r0
            goto L_0x0077
        L_0x0074:
            r9.unscheduleSelf(r0)
        L_0x0077:
            r9.a((boolean) r10)
        L_0x007b:
            r9.invalidateSelf()
            return r10
        L_0x007f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uu.a(int):boolean");
    }
}
