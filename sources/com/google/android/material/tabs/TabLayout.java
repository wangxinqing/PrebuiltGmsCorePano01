package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@atw
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TabLayout extends HorizontalScrollView {
    public static final /* synthetic */ int A = 0;
    private static final or N = new os(16);
    private static final int a = 2132018792;
    private akbk B;
    private final int C;
    private final int D;
    private final int E;
    private int F;
    private final ArrayList G;
    private ValueAnimator H;
    private atr I;
    private DataSetObserver J;
    private akbl K;
    private akbf L;
    private boolean M;
    private akbo O;
    private final or P;
    public final ArrayList b;
    public final RectF c;
    final akbj d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public PorterDuff.Mode n;
    public float o;
    public float p;
    public final int q;
    public int r;
    public int s;
    int t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public ViewPager z;

    public TabLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private final int a(int i2, float f2) {
        View view;
        int i3;
        int i4 = this.v;
        int i5 = 0;
        if (i4 != 0 && i4 != 2) {
            return 0;
        }
        View childAt = this.d.getChildAt(i2);
        int i6 = i2 + 1;
        if (i6 < this.d.getChildCount()) {
            view = this.d.getChildAt(i6);
        } else {
            view = null;
        }
        if (childAt != null) {
            i3 = childAt.getWidth();
        } else {
            i3 = 0;
        }
        if (view != null) {
            i5 = view.getWidth();
        }
        int left = (childAt.getLeft() + (i3 / 2)) - (getWidth() / 2);
        int i7 = (int) (((float) (i3 + i5)) * 0.5f * f2);
        return qb.h(this) != 0 ? left - i7 : left + i7;
    }

    private final void a(LinearLayout.LayoutParams layoutParams) {
        float f2;
        if (this.v == 1 && this.s == 0) {
            layoutParams.width = 0;
            f2 = 1.0f;
        } else {
            layoutParams.width = -2;
            f2 = 0.0f;
        }
        layoutParams.weight = f2;
    }

    private final void d(int i2) {
        if (i2 != -1) {
            if (getWindowToken() != null && qb.A(this)) {
                akbj akbj = this.d;
                int childCount = akbj.getChildCount();
                int i3 = 0;
                while (i3 < childCount) {
                    if (akbj.getChildAt(i3).getWidth() > 0) {
                        i3++;
                    }
                }
                int scrollX = getScrollX();
                int a2 = a(i2, 0.0f);
                if (scrollX != a2) {
                    if (this.H == null) {
                        ValueAnimator valueAnimator = new ValueAnimator();
                        this.H = valueAnimator;
                        valueAnimator.setInterpolator(ajrr.b);
                        this.H.setDuration((long) this.t);
                        this.H.addUpdateListener(new akbe(this));
                    }
                    this.H.setIntValues(new int[]{scrollX, a2});
                    this.H.start();
                }
                akbj akbj2 = this.d;
                int i4 = this.t;
                ValueAnimator valueAnimator2 = akbj2.g;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    akbj2.g.cancel();
                }
                akbj2.a(true, i2, i4);
                return;
            }
            c(i2);
        }
    }

    private final void e(int i2) {
        int childCount = this.d.getChildCount();
        if (i2 < childCount) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = this.d.getChildAt(i3);
                boolean z2 = i3 == i2;
                childAt.setSelected(z2);
                childAt.setActivated(z2);
                i3++;
            }
        }
    }

    private final int f() {
        int i2 = this.C;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.v;
        if (i3 == 0 || i3 == 2) {
            return this.E;
        }
        return 0;
    }

    public final void addView(View view) {
        a(view);
    }

    public final int b() {
        return this.b.size();
    }

    public final int c() {
        akbk akbk = this.B;
        if (akbk != null) {
            return akbk.d;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ajzg.a((View) this);
        if (this.z == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                a((ViewPager) parent, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.M) {
            a((ViewPager) null);
            this.M = false;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r1 = (defpackage.akbn) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            r0 = 0
        L_0x0001:
            akbj r1 = r7.d
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto L_0x0034
            akbj r1 = r7.d
            android.view.View r1 = r1.getChildAt(r0)
            boolean r2 = r1 instanceof defpackage.akbn
            if (r2 == 0) goto L_0x0031
            akbn r1 = (defpackage.akbn) r1
            android.graphics.drawable.Drawable r2 = r1.c
            if (r2 == 0) goto L_0x0031
            int r3 = r1.getLeft()
            int r4 = r1.getTop()
            int r5 = r1.getRight()
            int r6 = r1.getBottom()
            r2.setBounds(r3, r4, r5, r6)
            android.graphics.drawable.Drawable r1 = r1.c
            r1.draw(r8)
        L_0x0031:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0034:
            super.onDraw(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onDraw(android.graphics.Canvas):void");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        qs.a(accessibilityNodeInfo).a((Object) qq.a(1, b(), 1));
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int i4;
        Context context = getContext();
        int size = this.b.size();
        int i5 = 0;
        while (true) {
            i4 = 48;
            if (i5 >= size) {
                break;
            }
            akbk akbk = (akbk) this.b.get(i5);
            if (akbk == null || akbk.a == null || TextUtils.isEmpty(akbk.b)) {
                i5++;
            } else if (!this.w) {
                i4 = 72;
            }
        }
        int round = Math.round(ajyf.a(context, i4));
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i3 = View.MeasureSpec.makeMeasureSpec(round + getPaddingTop() + getPaddingBottom(), JGCastService.FLAG_PRIVATE_DISPLAY);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i3) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size2 = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) != 0) {
            int i6 = this.D;
            if (i6 <= 0) {
                i6 = (int) (((float) size2) - ajyf.a(getContext(), 56));
            }
            this.r = i6;
        }
        super.onMeasure(i2, i3);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i7 = this.v;
            if (i7 != 0) {
                if (i7 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), JGCastService.FLAG_PRIVATE_DISPLAY), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
                } else if (i7 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), JGCastService.FLAG_PRIVATE_DISPLAY), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    public final void setElevation(float f2) {
        super.setElevation(f2);
        ajzg.a((View) this, f2);
    }

    public final boolean shouldDelayChildPressedState() {
        return Math.max(0, ((this.d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0;
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    public final void addView(View view, int i2) {
        a(view);
    }

    public final void b(int i2) {
        if (i2 != this.v) {
            this.v = i2;
            e();
        }
    }

    public final void c(int i2) {
        a(i2, 0.0f, true, true);
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet, int i2) {
        super(akdg.a(context, attributeSet, i2, a), attributeSet, i2);
        this.b = new ArrayList();
        this.c = new RectF();
        this.r = Integer.MAX_VALUE;
        this.G = new ArrayList();
        this.P = new or(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        akbj akbj = new akbj(this, context2);
        this.d = akbj;
        super.addView(akbj, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray a2 = ajya.a(context2, attributeSet, akbc.a, i2, a, 22);
        if (getBackground() instanceof ColorDrawable) {
            ajzf ajzf = new ajzf();
            ajzf.c(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            ajzf.a(context2);
            ajzf.d(qb.o(this));
            qb.a((View) this, (Drawable) ajzf);
        }
        akbj akbj2 = this.d;
        int dimensionPixelSize = a2.getDimensionPixelSize(10, -1);
        if (akbj2.a != dimensionPixelSize) {
            akbj2.a = dimensionPixelSize;
            qb.e(akbj2);
        }
        akbj akbj3 = this.d;
        int color = a2.getColor(7, 0);
        if (akbj3.b.getColor() != color) {
            akbj3.b.setColor(color);
            qb.e(akbj3);
        }
        Drawable b2 = ajym.b(context2, a2, 5);
        if (this.m != b2) {
            this.m = b2;
            qb.e(this.d);
        }
        int i3 = a2.getInt(9, 0);
        if (this.u != i3) {
            this.u = i3;
            qb.e(this.d);
        }
        this.x = a2.getBoolean(8, true);
        qb.e(this.d);
        int dimensionPixelSize2 = a2.getDimensionPixelSize(15, 0);
        this.h = dimensionPixelSize2;
        this.g = dimensionPixelSize2;
        this.f = dimensionPixelSize2;
        this.e = dimensionPixelSize2;
        this.e = a2.getDimensionPixelSize(18, dimensionPixelSize2);
        this.f = a2.getDimensionPixelSize(19, this.f);
        this.g = a2.getDimensionPixelSize(17, this.g);
        this.h = a2.getDimensionPixelSize(16, this.h);
        int resourceId = a2.getResourceId(22, 2132018258);
        this.i = resourceId;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, uh.y);
        try {
            this.o = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.j = ajym.a(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (a2.hasValue(23)) {
                this.j = ajym.a(context2, a2, 23);
            }
            if (a2.hasValue(21)) {
                int color2 = a2.getColor(21, 0);
                int defaultColor = this.j.getDefaultColor();
                this.j = new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{color2, defaultColor});
            }
            this.k = ajym.a(context2, a2, 3);
            this.n = ajyf.a(a2.getInt(4, -1), (PorterDuff.Mode) null);
            this.l = ajym.a(context2, a2, 20);
            this.t = a2.getInt(6, 300);
            this.C = a2.getDimensionPixelSize(13, -1);
            this.D = a2.getDimensionPixelSize(12, -1);
            this.q = a2.getResourceId(0, 0);
            this.F = a2.getDimensionPixelSize(1, 0);
            this.v = a2.getInt(14, 1);
            this.s = a2.getInt(2, 0);
            this.w = a2.getBoolean(11, false);
            this.y = a2.getBoolean(24, false);
            a2.recycle();
            Resources resources = getResources();
            this.p = (float) resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.E = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            e();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    public final void b(akbk akbk, boolean z2) {
        akbk akbk2 = this.B;
        if (akbk2 != akbk) {
            int i2 = akbk != null ? akbk.d : -1;
            if (z2) {
                if ((akbk2 == null || akbk2.d == -1) && i2 != -1) {
                    c(i2);
                } else {
                    d(i2);
                }
                if (i2 != -1) {
                    e(i2);
                }
            }
            this.B = akbk;
            if (akbk2 != null) {
                for (int size = this.G.size() - 1; size >= 0; size--) {
                    akbo akbo = (akbo) this.G.get(size);
                }
            }
            if (akbk != null) {
                for (int size2 = this.G.size() - 1; size2 >= 0; size2--) {
                    ((akbo) this.G.get(size2)).a.b(akbk.d);
                }
            }
        } else if (akbk2 != null) {
            for (int size3 = this.G.size() - 1; size3 >= 0; size3--) {
                akbo akbo2 = (akbo) this.G.get(size3);
            }
            d(akbk.d);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r0 != 2) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r4 = this;
            int r0 = r4.v
            r1 = 2
            r2 = 0
            if (r0 != 0) goto L_0x0007
            goto L_0x000b
        L_0x0007:
            if (r0 == r1) goto L_0x000b
            r0 = 0
            goto L_0x0014
        L_0x000b:
            int r0 = r4.F
            int r3 = r4.e
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L_0x0014:
            akbj r3 = r4.d
            defpackage.qb.a(r3, r0, r2, r2, r2)
            int r0 = r4.v
            java.lang.String r2 = "TabLayout"
            r3 = 1
            if (r0 == 0) goto L_0x0034
            if (r0 == r3) goto L_0x0025
            if (r0 == r1) goto L_0x0025
        L_0x0024:
            goto L_0x0050
        L_0x0025:
            int r0 = r4.s
            if (r0 != r1) goto L_0x002e
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r2, r0)
        L_0x002e:
            akbj r0 = r4.d
            r0.setGravity(r3)
            goto L_0x0050
        L_0x0034:
            int r0 = r4.s
            if (r0 == 0) goto L_0x0043
            if (r0 == r3) goto L_0x003d
            if (r0 == r1) goto L_0x0048
            goto L_0x0024
        L_0x003d:
            akbj r0 = r4.d
            r0.setGravity(r3)
            goto L_0x0050
        L_0x0043:
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L_0x0048:
            akbj r0 = r4.d
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r0.setGravity(r1)
        L_0x0050:
            r4.a((boolean) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.e():void");
    }

    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    private final void a(View view) {
        if (view instanceof akbd) {
            akbd akbd = (akbd) view;
            akbk a2 = a();
            CharSequence charSequence = akbd.a;
            Drawable drawable = akbd.b;
            int i2 = akbd.c;
            if (!TextUtils.isEmpty(akbd.getContentDescription())) {
                a2.a(akbd.getContentDescription());
            }
            a(a2, this.b.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void d() {
        int i2;
        for (int childCount = this.d.getChildCount() - 1; childCount >= 0; childCount--) {
            akbn akbn = (akbn) this.d.getChildAt(childCount);
            this.d.removeViewAt(childCount);
            if (akbn != null) {
                akbn.a((akbk) null);
                akbn.setSelected(false);
                this.P.a(akbn);
            }
            requestLayout();
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            akbk akbk = (akbk) it.next();
            it.remove();
            akbk.g = null;
            akbk.h = null;
            akbk.a = null;
            akbk.b = null;
            akbk.c = null;
            akbk.d = -1;
            akbk.e = null;
            N.a(akbk);
        }
        this.B = null;
        atr atr = this.I;
        if (atr != null) {
            int a2 = atr.a();
            for (int i3 = 0; i3 < a2; i3++) {
                akbk a3 = a();
                CharSequence a4 = this.I.a(i3);
                if (TextUtils.isEmpty(a3.c) && !TextUtils.isEmpty(a4)) {
                    a3.h.setContentDescription(a4);
                }
                a3.b = a4;
                a3.b();
                a(a3, false);
            }
            ViewPager viewPager = this.z;
            if (viewPager != null && a2 > 0 && (i2 = viewPager.c) != c() && i2 < b()) {
                a(a(i2));
            }
        }
    }

    private final void a(ViewPager viewPager, boolean z2) {
        List list;
        List list2;
        ViewPager viewPager2 = this.z;
        if (viewPager2 != null) {
            akbl akbl = this.K;
            if (!(akbl == null || (list2 = viewPager2.d) == null)) {
                list2.remove(akbl);
            }
            akbf akbf = this.L;
            if (!(akbf == null || (list = this.z.e) == null)) {
                list.remove(akbf);
            }
        }
        akbo akbo = this.O;
        if (akbo != null) {
            this.G.remove(akbo);
            this.O = null;
        }
        if (viewPager != null) {
            this.z = viewPager;
            if (this.K == null) {
                this.K = new akbl(this);
            }
            akbl akbl2 = this.K;
            akbl2.b = 0;
            akbl2.a = 0;
            viewPager.a((aua) akbl2);
            akbo akbo2 = new akbo(viewPager);
            this.O = akbo2;
            if (!this.G.contains(akbo2)) {
                this.G.add(akbo2);
            }
            atr atr = viewPager.b;
            if (atr != null) {
                a(atr, true);
            }
            if (this.L == null) {
                this.L = new akbf(this);
            }
            akbf akbf2 = this.L;
            akbf2.a = true;
            if (viewPager.e == null) {
                viewPager.e = new ArrayList();
            }
            viewPager.e.add(akbf2);
            c(viewPager.c);
        } else {
            this.z = null;
            a((atr) null, false);
        }
        this.M = z2;
    }

    public final akbk a() {
        akbn akbn;
        akbk akbk = (akbk) N.a();
        if (akbk == null) {
            akbk = new akbk();
        }
        akbk.g = this;
        or orVar = this.P;
        if (orVar != null) {
            akbn = (akbn) orVar.a();
        } else {
            akbn = null;
        }
        if (akbn == null) {
            akbn = new akbn(this, getContext());
        }
        akbn.a(akbk);
        akbn.setFocusable(true);
        akbn.setMinimumWidth(f());
        if (TextUtils.isEmpty(akbk.c)) {
            akbn.setContentDescription(akbk.b);
        } else {
            akbn.setContentDescription(akbk.c);
        }
        akbk.h = akbn;
        return akbk;
    }

    public final akbk a(int i2) {
        if (i2 < 0 || i2 >= b()) {
            return null;
        }
        return (akbk) this.b.get(i2);
    }

    public final void a(int i2, float f2, boolean z2, boolean z3) {
        int round = Math.round(((float) i2) + f2);
        if (round >= 0 && round < this.d.getChildCount()) {
            if (z3) {
                akbj akbj = this.d;
                ValueAnimator valueAnimator = akbj.g;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    akbj.g.cancel();
                }
                akbj.c = i2;
                akbj.d = f2;
                akbj.a();
            }
            ValueAnimator valueAnimator2 = this.H;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.H.cancel();
            }
            scrollTo(a(i2, f2), 0);
            if (z2) {
                e(round);
            }
        }
    }

    public final void a(akbk akbk) {
        b(akbk, true);
    }

    public void a(akbk akbk, int i2, boolean z2) {
        if (akbk.g == this) {
            akbk.d = i2;
            this.b.add(i2, akbk);
            int size = this.b.size();
            for (int i3 = i2 + 1; i3 < size; i3++) {
                ((akbk) this.b.get(i3)).d = i3;
            }
            akbn akbn = akbk.h;
            akbn.setSelected(false);
            akbn.setActivated(false);
            akbj akbj = this.d;
            int i4 = akbk.d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            a(layoutParams);
            akbj.addView(akbn, i4, layoutParams);
            if (z2) {
                akbk.a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void a(akbk akbk, boolean z2) {
        a(akbk, this.b.size(), z2);
    }

    public final void a(ViewPager viewPager) {
        a(viewPager, false);
    }

    public final void a(atr atr, boolean z2) {
        DataSetObserver dataSetObserver;
        atr atr2 = this.I;
        if (!(atr2 == null || (dataSetObserver = this.J) == null)) {
            atr2.a.unregisterObserver(dataSetObserver);
        }
        this.I = atr;
        if (z2 && atr != null) {
            if (this.J == null) {
                this.J = new akbg(this);
            }
            atr.a.registerObserver(this.J);
        }
        d();
    }

    public final void a(boolean z2) {
        for (int i2 = 0; i2 < this.d.getChildCount(); i2++) {
            View childAt = this.d.getChildAt(i2);
            childAt.setMinimumWidth(f());
            a((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z2) {
                childAt.requestLayout();
            }
        }
    }
}
