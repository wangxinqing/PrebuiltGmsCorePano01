package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* renamed from: ut  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class ut extends Drawable.ConstantState {
    int A;
    int B;
    int C;
    boolean D;
    ColorFilter E;
    boolean F;
    ColorStateList G;
    PorterDuff.Mode H;
    boolean I;
    boolean J;
    final uu c;
    Resources d;
    int e = 160;
    int f;
    int g;
    SparseArray h;
    Drawable[] i;
    int j;
    boolean k;
    boolean l;
    Rect m;
    boolean n;
    boolean o;
    int p;
    int q;
    int r;
    int s;
    boolean t;
    int u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    boolean z;

    public ut(ut utVar, uu uuVar, Resources resources) {
        int i2;
        this.k = false;
        this.n = false;
        this.z = true;
        this.B = 0;
        this.C = 0;
        this.c = uuVar;
        this.d = resources != null ? resources : utVar != null ? utVar.d : null;
        if (utVar != null) {
            i2 = utVar.e;
        } else {
            i2 = 0;
        }
        int a = uu.a(resources, i2);
        this.e = a;
        if (utVar != null) {
            this.f = utVar.f;
            this.g = utVar.g;
            this.x = true;
            this.y = true;
            this.k = utVar.k;
            this.n = utVar.n;
            this.z = utVar.z;
            this.A = utVar.A;
            this.B = utVar.B;
            this.C = utVar.C;
            this.D = utVar.D;
            this.E = utVar.E;
            this.F = utVar.F;
            this.G = utVar.G;
            this.H = utVar.H;
            this.I = utVar.I;
            this.J = utVar.J;
            if (utVar.e == a) {
                if (utVar.l) {
                    this.m = new Rect(utVar.m);
                    this.l = true;
                }
                if (utVar.o) {
                    this.p = utVar.p;
                    this.q = utVar.q;
                    this.r = utVar.r;
                    this.s = utVar.s;
                    this.o = true;
                }
            }
            if (utVar.t) {
                this.u = utVar.u;
                this.t = true;
            }
            if (utVar.v) {
                this.w = utVar.w;
                this.v = true;
            }
            Drawable[] drawableArr = utVar.i;
            this.i = new Drawable[drawableArr.length];
            int i3 = utVar.j;
            this.j = i3;
            SparseArray sparseArray = utVar.h;
            if (sparseArray != null) {
                this.h = sparseArray.clone();
            } else {
                this.h = new SparseArray(i3);
            }
            int i4 = this.j;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.h.put(i5, constantState);
                    } else {
                        this.i[i5] = drawableArr[i5];
                    }
                }
            }
            return;
        }
        this.i = new Drawable[10];
        this.j = 0;
    }

    private final Drawable b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.setLayoutDirection(this.A);
        }
        Drawable mutate = drawable.mutate();
        mutate.setCallback(this.c);
        return mutate;
    }

    public final int a(Drawable drawable) {
        int i2 = this.j;
        if (i2 >= this.i.length) {
            b(i2, i2 + 10);
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.c);
        this.i[i2] = drawable;
        this.j++;
        this.g = drawable.getChangingConfigurations() | this.g;
        b();
        this.m = null;
        this.l = false;
        this.o = false;
        this.x = false;
        return i2;
    }

    public void a() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.t = false;
        this.v = false;
    }

    public void b(int i2, int i3) {
        throw null;
    }

    public final void c() {
        SparseArray sparseArray = this.h;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.i[this.h.keyAt(i2)] = b(((Drawable.ConstantState) this.h.valueAt(i2)).newDrawable(this.d));
            }
            this.h = null;
        }
    }

    public final boolean canApplyTheme() {
        int i2 = this.j;
        Drawable[] drawableArr = this.i;
        for (int i3 = 0; i3 < i2; i3++) {
            Drawable drawable = drawableArr[i3];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.h.get(i3);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void d() {
        this.o = true;
        c();
        int i2 = this.j;
        Drawable[] drawableArr = this.i;
        this.q = -1;
        this.p = -1;
        this.s = 0;
        this.r = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            Drawable drawable = drawableArr[i3];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.p) {
                this.p = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.q) {
                this.q = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.r) {
                this.r = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.s) {
                this.s = minimumHeight;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean e() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.x     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0026
            r6.c()     // Catch:{ all -> 0x0029 }
            r0 = 1
            r6.x = r0     // Catch:{ all -> 0x0029 }
            int r1 = r6.j     // Catch:{ all -> 0x0029 }
            android.graphics.drawable.Drawable[] r2 = r6.i     // Catch:{ all -> 0x0029 }
            r3 = 0
            r4 = 0
        L_0x0011:
            if (r4 >= r1) goto L_0x0022
            r5 = r2[r4]     // Catch:{ all -> 0x0029 }
            android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()     // Catch:{ all -> 0x0029 }
            if (r5 == 0) goto L_0x001e
            int r4 = r4 + 1
            goto L_0x0011
        L_0x001e:
            r6.y = r3     // Catch:{ all -> 0x0029 }
            monitor-exit(r6)
            return r3
        L_0x0022:
            r6.y = r0     // Catch:{ all -> 0x0029 }
        L_0x0024:
            monitor-exit(r6)
            return r0
        L_0x0026:
            boolean r0 = r6.y     // Catch:{ all -> 0x0029 }
            goto L_0x0024
        L_0x0029:
            r0 = move-exception
            monitor-exit(r6)
            goto L_0x002d
        L_0x002c:
            throw r0
        L_0x002d:
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ut.e():boolean");
    }

    public final int getChangingConfigurations() {
        return this.f | this.g;
    }

    public final Drawable b(int i2) {
        int indexOfKey;
        Drawable drawable = this.i[i2];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.h;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i2)) < 0) {
            return null;
        }
        Drawable b = b(((Drawable.ConstantState) this.h.valueAt(indexOfKey)).newDrawable(this.d));
        this.i[i2] = b;
        this.h.removeAt(indexOfKey);
        if (this.h.size() == 0) {
            this.h = null;
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    public final void a(Resources resources) {
        if (resources != null) {
            this.d = resources;
            int a = uu.a(resources, this.e);
            int i2 = this.e;
            this.e = a;
            if (i2 != a) {
                this.o = false;
                this.l = false;
            }
        }
    }
}
