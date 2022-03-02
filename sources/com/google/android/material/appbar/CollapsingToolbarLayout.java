package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CollapsingToolbarLayout extends FrameLayout {
    public final ajxj a;
    public Drawable b;
    public int c;
    public qn d;
    private boolean e;
    private int f;
    private Toolbar g;
    private View h;
    private View i;
    private int j;
    private int k;
    private int l;
    private int m;
    private final Rect n;
    private boolean o;
    private boolean p;
    private Drawable q;
    private int r;
    private boolean s;
    private ValueAnimator t;
    private long u;
    private int v;
    private ajsf w;

    public CollapsingToolbarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public static ajsp a(View view) {
        ajsp ajsp = (ajsp) view.getTag(R.id.view_offset_helper);
        if (ajsp != null) {
            return ajsp;
        }
        ajsp ajsp2 = new ajsp(view);
        view.setTag(R.id.view_offset_helper, ajsp2);
        return ajsp2;
    }

    protected static final ajsi b() {
        return new ajsi();
    }

    private static int c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ajsi;
    }

    public final void draw(Canvas canvas) {
        int i2;
        Drawable drawable;
        super.draw(canvas);
        c();
        if (this.g == null && (drawable = this.q) != null && this.r > 0) {
            drawable.mutate().setAlpha(this.r);
            this.q.draw(canvas);
        }
        if (this.o && this.p) {
            this.a.a(canvas);
        }
        if (this.b != null && this.r > 0) {
            qn qnVar = this.d;
            if (qnVar != null) {
                i2 = qnVar.b();
            } else {
                i2 = 0;
            }
            if (i2 > 0) {
                this.b.setBounds(0, -this.c, getWidth(), i2 - this.c);
                this.b.mutate().setAlpha(this.r);
                this.b.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        boolean z;
        View view2;
        Drawable drawable = this.q;
        if (drawable == null || this.r <= 0 || (!((view2 = this.h) == null || view2 == this) ? view == view2 : view == this.g)) {
            z = false;
        } else {
            drawable.mutate().setAlpha(this.r);
            this.q.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j2) || z;
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.b;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.q;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        ajxj ajxj = this.a;
        if (ajxj != null) {
            z |= ajxj.a(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            qb.b((View) this, qb.s((View) parent));
            if (this.w == null) {
                this.w = new ajsj(this);
            }
            ((AppBarLayout) parent).a((ajsd) this.w);
            qb.r(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        ViewParent parent = getParent();
        ajsf ajsf = this.w;
        if (ajsf != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).b((ajsd) ajsf);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View view;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        super.onLayout(z, i2, i3, i4, i5);
        qn qnVar = this.d;
        if (qnVar != null) {
            int b2 = qnVar.b();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (!qb.s(childAt) && childAt.getTop() < b2) {
                    qb.g(childAt, b2);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            a(getChildAt(i11)).a();
        }
        if (this.o && (view = this.i) != null) {
            if (!qb.D(view) || this.i.getVisibility() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.p = z2;
            if (z2) {
                int h2 = qb.h(this);
                View view2 = this.h;
                if (view2 == null) {
                    view2 = this.g;
                }
                int b3 = b(view2);
                ajxk.a((ViewGroup) this, this.i, this.n);
                ajxj ajxj = this.a;
                int i12 = this.n.left;
                if (h2 == 1) {
                    i6 = this.g.l;
                } else {
                    i6 = this.g.k;
                }
                int i13 = i12 + i6;
                int i14 = this.n.top + b3 + this.g.m;
                int i15 = this.n.right;
                if (h2 == 1) {
                    i7 = this.g.k;
                } else {
                    i7 = this.g.l;
                }
                ajxj.b(i13, i14, i15 + i7, (this.n.bottom + b3) - this.g.n);
                ajxj ajxj2 = this.a;
                if (h2 != 1) {
                    i8 = this.j;
                } else {
                    i8 = this.l;
                }
                int i16 = this.n.top + this.k;
                int i17 = i4 - i2;
                if (h2 != 1) {
                    i9 = this.l;
                } else {
                    i9 = this.j;
                }
                ajxj2.a(i8, i16, i17 - i9, (i5 - i3) - this.m);
                this.a.e();
            }
        }
        if (this.g != null) {
            if (this.o && TextUtils.isEmpty(this.a.f)) {
                a(this.g.p);
            }
            View view3 = this.h;
            if (view3 == null || view3 == this) {
                setMinimumHeight(c(this.g));
            } else {
                setMinimumHeight(c(view3));
            }
        }
        a();
        int childCount3 = getChildCount();
        for (int i18 = 0; i18 < childCount3; i18++) {
            a(getChildAt(i18)).b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int i4;
        c();
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        qn qnVar = this.d;
        if (qnVar != null) {
            i4 = qnVar.b();
        } else {
            i4 = 0;
        }
        if (mode == 0 && i4 > 0) {
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i4, JGCastService.FLAG_PRIVATE_DISPLAY));
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.setBounds(0, 0, i2, i3);
        }
    }

    public final void setVisibility(int i2) {
        boolean z;
        super.setVisibility(i2);
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.b;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.b.setVisible(z, false);
        }
        Drawable drawable2 = this.q;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.q.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q || drawable == this.b;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final int b(View view) {
        return ((getHeight() - a(view).a) - view.getHeight()) - ((ajsi) view.getLayoutParams()).bottomMargin;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ajsi(layoutParams);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i2) {
        super(akdg.a(context, attributeSet, i2, 2132018786), attributeSet, i2);
        Drawable drawable;
        boolean z = true;
        this.e = true;
        this.n = new Rect();
        this.v = -1;
        Context context2 = getContext();
        ajxj ajxj = new ajxj(this);
        this.a = ajxj;
        ajxj.a(ajrr.e);
        TypedArray a2 = ajya.a(context2, attributeSet, ajsn.c, i2, 2132018786, new int[0]);
        this.a.a(a2.getInt(3, 8388691));
        this.a.b(a2.getInt(0, 8388627));
        int dimensionPixelSize = a2.getDimensionPixelSize(4, 0);
        this.m = dimensionPixelSize;
        this.l = dimensionPixelSize;
        this.k = dimensionPixelSize;
        this.j = dimensionPixelSize;
        if (a2.hasValue(7)) {
            this.j = a2.getDimensionPixelSize(7, 0);
        }
        if (a2.hasValue(6)) {
            this.l = a2.getDimensionPixelSize(6, 0);
        }
        if (a2.hasValue(8)) {
            this.k = a2.getDimensionPixelSize(8, 0);
        }
        if (a2.hasValue(5)) {
            this.m = a2.getDimensionPixelSize(5, 0);
        }
        this.o = a2.getBoolean(15, true);
        a(a2.getText(14));
        this.a.d(2132018248);
        this.a.c(2132018222);
        if (a2.hasValue(9)) {
            this.a.d(a2.getResourceId(9, 0));
        }
        if (a2.hasValue(1)) {
            this.a.c(a2.getResourceId(1, 0));
        }
        this.v = a2.getDimensionPixelSize(12, -1);
        if (a2.hasValue(10)) {
            ajxj ajxj2 = this.a;
            int i3 = a2.getInt(10, 1);
            if (i3 != ajxj2.j) {
                ajxj2.j = i3;
                ajxj2.e();
            }
        }
        this.u = (long) a2.getInt(11, 600);
        Drawable drawable2 = a2.getDrawable(2);
        Drawable drawable3 = this.q;
        Drawable drawable4 = null;
        if (drawable3 != drawable2) {
            if (drawable3 != null) {
                drawable3.setCallback((Drawable.Callback) null);
            }
            if (drawable2 != null) {
                drawable = drawable2.mutate();
            } else {
                drawable = null;
            }
            this.q = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, getWidth(), getHeight());
                this.q.setCallback(this);
                this.q.setAlpha(this.r);
            }
            qb.e(this);
        }
        Drawable drawable5 = a2.getDrawable(13);
        Drawable drawable6 = this.b;
        if (drawable6 != drawable5) {
            if (drawable6 != null) {
                drawable6.setCallback((Drawable.Callback) null);
            }
            drawable4 = drawable5 != null ? drawable5.mutate() : drawable4;
            this.b = drawable4;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.b.setState(getDrawableState());
                }
                ma.b(this.b, qb.h(this));
                this.b.setVisible(getVisibility() != 0 ? false : z, false);
                this.b.setCallback(this);
                this.b.setAlpha(this.r);
            }
            qb.e(this);
        }
        this.f = a2.getResourceId(16, -1);
        a2.recycle();
        setWillNotDraw(false);
        qb.a((View) this, (pq) new ajsg(this));
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c() {
        /*
            r7 = this;
            boolean r0 = r7.e
            if (r0 == 0) goto L_0x008d
            r0 = 0
            r7.g = r0
            r7.h = r0
            int r1 = r7.f
            r2 = -1
            if (r1 == r2) goto L_0x002f
            android.view.View r1 = r7.findViewById(r1)
            android.support.v7.widget.Toolbar r1 = (android.support.v7.widget.Toolbar) r1
            r7.g = r1
            if (r1 == 0) goto L_0x002f
            android.view.ViewParent r3 = r1.getParent()
        L_0x001c:
            if (r3 != r7) goto L_0x001f
            goto L_0x002d
        L_0x001f:
            if (r3 == 0) goto L_0x002d
            boolean r4 = r3 instanceof android.view.View
            if (r4 == 0) goto L_0x0028
            r1 = r3
            android.view.View r1 = (android.view.View) r1
        L_0x0028:
            android.view.ViewParent r3 = r3.getParent()
            goto L_0x001c
        L_0x002d:
            r7.h = r1
        L_0x002f:
            android.support.v7.widget.Toolbar r1 = r7.g
            r3 = 0
            if (r1 != 0) goto L_0x004d
            int r1 = r7.getChildCount()
            r4 = 0
        L_0x0039:
            if (r4 >= r1) goto L_0x004a
            android.view.View r5 = r7.getChildAt(r4)
            boolean r6 = r5 instanceof android.support.v7.widget.Toolbar
            if (r6 != 0) goto L_0x0046
            int r4 = r4 + 1
            goto L_0x0039
        L_0x0046:
            r0 = r5
            android.support.v7.widget.Toolbar r0 = (android.support.v7.widget.Toolbar) r0
            goto L_0x004b
        L_0x004a:
        L_0x004b:
            r7.g = r0
        L_0x004d:
            boolean r0 = r7.o
            if (r0 != 0) goto L_0x0064
            android.view.View r0 = r7.i
            if (r0 == 0) goto L_0x0064
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0064
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r1 = r7.i
            r0.removeView(r1)
        L_0x0064:
            boolean r0 = r7.o
            if (r0 == 0) goto L_0x008a
            android.support.v7.widget.Toolbar r0 = r7.g
            if (r0 == 0) goto L_0x008a
            android.view.View r0 = r7.i
            if (r0 != 0) goto L_0x007b
            android.view.View r0 = new android.view.View
            android.content.Context r1 = r7.getContext()
            r0.<init>(r1)
            r7.i = r0
        L_0x007b:
            android.view.View r0 = r7.i
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x008a
            android.support.v7.widget.Toolbar r0 = r7.g
            android.view.View r1 = r7.i
            r0.addView(r1, r2, r2)
        L_0x008a:
            r7.e = r3
            return
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.c():void");
    }

    public final void a() {
        boolean z;
        boolean z2;
        int i2;
        if (this.q != null || this.b != null) {
            int height = getHeight() + this.c;
            int i3 = this.v;
            int i4 = 0;
            if (i3 < 0) {
                qn qnVar = this.d;
                if (qnVar != null) {
                    i2 = qnVar.b();
                } else {
                    i2 = 0;
                }
                int l2 = qb.l(this);
                if (l2 > 0) {
                    i3 = Math.min(l2 + l2 + i2, getHeight());
                } else {
                    i3 = getHeight() / 3;
                }
            }
            if (height < i3) {
                z = true;
            } else {
                z = false;
            }
            if (!qb.A(this) || isInEditMode()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.s != z) {
                int i5 = 255;
                if (!z2) {
                    if (height < i3) {
                        i4 = 255;
                    }
                    a(i4);
                } else {
                    if (height >= i3) {
                        i5 = 0;
                    }
                    c();
                    ValueAnimator valueAnimator = this.t;
                    if (valueAnimator == null) {
                        ValueAnimator valueAnimator2 = new ValueAnimator();
                        this.t = valueAnimator2;
                        valueAnimator2.setDuration(this.u);
                        this.t.setInterpolator(i5 > this.r ? ajrr.c : ajrr.d);
                        this.t.addUpdateListener(new ajsh(this));
                    } else if (valueAnimator.isRunning()) {
                        this.t.cancel();
                    }
                    this.t.setIntValues(new int[]{this.r, i5});
                    this.t.start();
                }
                this.s = z;
            }
        }
    }

    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ajsi(getContext(), attributeSet);
    }

    public final void a(int i2) {
        Toolbar toolbar;
        if (i2 != this.r) {
            if (!(this.q == null || (toolbar = this.g) == null)) {
                qb.e(toolbar);
            }
            this.r = i2;
            qb.e(this);
        }
    }

    public final void a(CharSequence charSequence) {
        CharSequence charSequence2;
        this.a.b(charSequence);
        if (this.o) {
            charSequence2 = this.a.f;
        } else {
            charSequence2 = null;
        }
        setContentDescription(charSequence2);
    }
}
