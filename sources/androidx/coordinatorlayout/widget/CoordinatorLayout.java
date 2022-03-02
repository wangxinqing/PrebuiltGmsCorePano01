package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.AbsSavedState;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CoordinatorLayout extends ViewGroup implements pn, po {
    static final String a;
    static final Class[] b = {Context.class, AttributeSet.class};
    static final ThreadLocal c = new ThreadLocal();
    static final Comparator d = new ahp();
    private static final or x = new os(12);
    public final ahq e;
    public final List f;
    public qn g;
    public boolean h;
    public ViewGroup.OnHierarchyChangeListener i;
    private final List j;
    private final List k;
    private final int[] l;
    private final int[] m;
    private boolean n;
    private boolean o;
    private int[] p;
    private View q;
    private View r;
    private ahn s;
    private boolean t;
    private Drawable u;
    private pq v;
    private final pp w;

    static {
        String str;
        Package packageR = CoordinatorLayout.class.getPackage();
        if (packageR != null) {
            str = packageR.getName();
        } else {
            str = null;
        }
        a = str;
        int i2 = Build.VERSION.SDK_INT;
    }

    public CoordinatorLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public static ahj a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(a)) {
            str = a + '.' + str;
        }
        try {
            Map map = (Map) c.get();
            if (map == null) {
                map = new HashMap();
                c.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (ahj) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e2) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e2);
        }
    }

    private final int b(int i2) {
        int[] iArr = this.p;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        } else if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
            return 0;
        }
    }

    private static int c(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    private static int d(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof ahm) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        ahj ahj = ((ahm) view.getLayoutParams()).a;
        return super.drawChild(canvas, view, j2);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.u;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ahm();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ahm(getContext(), attributeSet);
    }

    public final int getNestedScrollAxes() {
        return this.w.a();
    }

    /* access modifiers changed from: protected */
    public final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        if (this.t) {
            if (this.s == null) {
                this.s = new ahn(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.s);
        }
        if (this.g == null && qb.s(this)) {
            qb.r(this);
        }
        this.o = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        if (this.t && this.s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.s);
        }
        View view = this.r;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.o = false;
    }

    public final void onDraw(Canvas canvas) {
        int i2;
        super.onDraw(canvas);
        if (this.h && this.u != null) {
            qn qnVar = this.g;
            if (qnVar != null) {
                i2 = qnVar.b();
            } else {
                i2 = 0;
            }
            if (i2 > 0) {
                this.u.setBounds(0, 0, getWidth(), i2);
                this.u.draw(canvas);
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            b();
        }
        boolean a2 = a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.q = null;
            b();
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        ahj ahj;
        int h2 = qb.h(this);
        int size = this.j.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) this.j.get(i6);
            if (view.getVisibility() != 8 && ((ahj = ((ahm) view.getLayoutParams()).a) == null || !ahj.a(this, view, h2))) {
                b(view, h2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0319, code lost:
        r9.l = r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r6 = r30
            java.util.List r0 = r6.j
            r0.clear()
            ahq r0 = r6.e
            ou r1 = r0.a
            int r1 = r1.h
            r7 = 0
            r2 = 0
        L_0x000f:
            if (r2 < r1) goto L_0x03c1
            ou r0 = r0.a
            r0.clear()
            int r3 = r30.getChildCount()
            r4 = 0
        L_0x001b:
            if (r4 < r3) goto L_0x026a
            java.util.List r0 = r6.j
            ahq r1 = r6.e
            java.util.ArrayList r2 = r1.b
            r2.clear()
            java.util.HashSet r2 = r1.c
            r2.clear()
            ou r2 = r1.a
            int r2 = r2.h
            r3 = 0
        L_0x0030:
            if (r3 >= r2) goto L_0x0042
            ou r4 = r1.a
            java.lang.Object r4 = r4.b((int) r3)
            java.util.ArrayList r5 = r1.b
            java.util.HashSet r8 = r1.c
            r1.a(r4, r5, r8)
            int r3 = r3 + 1
            goto L_0x0030
        L_0x0042:
            java.util.ArrayList r1 = r1.b
            r0.addAll(r1)
            java.util.List r0 = r6.j
            java.util.Collections.reverse(r0)
            int r0 = r30.getChildCount()
            r1 = 0
        L_0x0051:
            r8 = 1
            if (r1 >= r0) goto L_0x007a
            android.view.View r2 = r6.getChildAt(r1)
            ahq r3 = r6.e
            ou r4 = r3.a
            int r4 = r4.h
            r5 = 0
        L_0x005f:
            if (r5 >= r4) goto L_0x0077
            ou r9 = r3.a
            java.lang.Object r9 = r9.c(r5)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 != 0) goto L_0x006c
            goto L_0x0074
        L_0x006c:
            boolean r9 = r9.contains(r2)
            if (r9 == 0) goto L_0x0074
            r0 = 1
            goto L_0x007b
        L_0x0074:
            int r5 = r5 + 1
            goto L_0x005f
        L_0x0077:
            int r1 = r1 + 1
            goto L_0x0051
        L_0x007a:
            r0 = 0
        L_0x007b:
            boolean r1 = r6.t
            if (r0 != r1) goto L_0x0080
            goto L_0x00b0
        L_0x0080:
            if (r0 == 0) goto L_0x009d
            boolean r0 = r6.o
            if (r0 == 0) goto L_0x009a
            ahn r0 = r6.s
            if (r0 != 0) goto L_0x0091
            ahn r0 = new ahn
            r0.<init>(r6)
            r6.s = r0
        L_0x0091:
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            ahn r1 = r6.s
            r0.addOnPreDrawListener(r1)
        L_0x009a:
            r6.t = r8
            goto L_0x00b0
        L_0x009d:
            boolean r0 = r6.o
            if (r0 == 0) goto L_0x00ae
            ahn r0 = r6.s
            if (r0 == 0) goto L_0x00ae
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            ahn r1 = r6.s
            r0.removeOnPreDrawListener(r1)
        L_0x00ae:
            r6.t = r7
        L_0x00b0:
            int r9 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r10 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r11 = defpackage.qb.h(r30)
            int r12 = android.view.View.MeasureSpec.getMode(r31)
            int r13 = android.view.View.MeasureSpec.getSize(r31)
            int r14 = android.view.View.MeasureSpec.getMode(r32)
            int r15 = android.view.View.MeasureSpec.getSize(r32)
            int r16 = r9 + r10
            int r17 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            qn r2 = r6.g
            if (r2 == 0) goto L_0x00ed
            boolean r2 = defpackage.qb.s(r30)
            if (r2 == 0) goto L_0x00ed
            r18 = 1
            goto L_0x00ef
        L_0x00ed:
            r18 = 0
        L_0x00ef:
            java.util.List r2 = r6.j
            int r5 = r2.size()
            r4 = r0
            r3 = r1
            r1 = 0
            r2 = 0
        L_0x00f9:
            if (r2 >= r5) goto L_0x0252
            java.util.List r0 = r6.j
            java.lang.Object r0 = r0.get(r2)
            android.view.View r0 = (android.view.View) r0
            int r7 = r0.getVisibility()
            r8 = 8
            if (r7 == r8) goto L_0x0233
            android.view.ViewGroup$LayoutParams r7 = r0.getLayoutParams()
            ahm r7 = (defpackage.ahm) r7
            int r8 = r7.e
            if (r8 >= 0) goto L_0x011d
            r21 = r1
            r22 = r2
            r1 = 0
            r2 = 1
            r8 = 0
            goto L_0x016f
        L_0x011d:
            if (r12 == 0) goto L_0x0168
            int r8 = r6.b((int) r8)
            r21 = r1
            int r1 = r7.c
            int r1 = d(r1)
            int r1 = defpackage.pd.a(r1, r11)
            r1 = r1 & 7
            r22 = r2
            r2 = 3
            if (r1 == r2) goto L_0x0138
            r2 = 1
            goto L_0x013b
        L_0x0138:
            r2 = 1
            if (r11 != r2) goto L_0x015e
        L_0x013b:
            r2 = 5
            if (r1 != r2) goto L_0x0143
            r2 = 1
            if (r11 != r2) goto L_0x0144
            r1 = 0
            goto L_0x015f
        L_0x0143:
            r2 = 1
        L_0x0144:
            r2 = 5
            if (r1 != r2) goto L_0x014c
            r2 = 1
            if (r11 == r2) goto L_0x014c
            r2 = 1
            goto L_0x0157
        L_0x014c:
            r2 = 3
            if (r1 == r2) goto L_0x0152
            r1 = 0
            r2 = 1
            goto L_0x016e
        L_0x0152:
            r2 = 1
            if (r11 == r2) goto L_0x0157
            r1 = 0
            goto L_0x016e
        L_0x0157:
            int r8 = r8 - r9
            r1 = 0
            int r8 = java.lang.Math.max(r1, r8)
            goto L_0x016f
        L_0x015e:
            r1 = 0
        L_0x015f:
            int r19 = r13 - r10
            int r8 = r19 - r8
            int r8 = java.lang.Math.max(r1, r8)
            goto L_0x016f
        L_0x0168:
            r21 = r1
            r22 = r2
            r1 = 0
            r2 = 1
        L_0x016e:
            r8 = 0
        L_0x016f:
            if (r18 != 0) goto L_0x0176
            r23 = r0
            r24 = r3
            goto L_0x01ad
        L_0x0176:
            boolean r19 = defpackage.qb.s(r0)
            if (r19 != 0) goto L_0x01a9
            qn r1 = r6.g
            int r1 = r1.a()
            qn r2 = r6.g
            int r2 = r2.c()
            r23 = r0
            qn r0 = r6.g
            int r0 = r0.b()
            r24 = r3
            qn r3 = r6.g
            int r3 = r3.d()
            int r1 = r1 + r2
            int r1 = r13 - r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r12)
            int r0 = r0 + r3
            int r0 = r15 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r14)
            r3 = r0
            r2 = r1
            goto L_0x01b1
        L_0x01a9:
            r23 = r0
            r24 = r3
        L_0x01ad:
            r2 = r31
            r3 = r32
        L_0x01b1:
            ahj r0 = r7.a
            if (r0 == 0) goto L_0x01e3
            r1 = r23
            r23 = r9
            r9 = r21
            r19 = 0
            r21 = r1
            r1 = r30
            r20 = r22
            r25 = 1
            r22 = r2
            r2 = r21
            r26 = r10
            r10 = r24
            r24 = r3
            r3 = r22
            r27 = r11
            r11 = r4
            r4 = r8
            r28 = r5
            r5 = r24
            boolean r0 = r0.a(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x01e0
            goto L_0x01fe
        L_0x01e0:
            r0 = r21
            goto L_0x0207
        L_0x01e3:
            r28 = r5
            r26 = r10
            r27 = r11
            r20 = r22
            r10 = r24
            r19 = 0
            r25 = 1
            r22 = r2
            r24 = r3
            r11 = r4
            r29 = r23
            r23 = r9
            r9 = r21
            r21 = r29
        L_0x01fe:
            r0 = r21
            r1 = r22
            r2 = r24
            r6.a((android.view.View) r0, (int) r1, (int) r8, (int) r2)
        L_0x0207:
            int r1 = r0.getMeasuredWidth()
            int r1 = r16 + r1
            int r2 = r7.leftMargin
            int r1 = r1 + r2
            int r2 = r7.rightMargin
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r11, r1)
            int r2 = r0.getMeasuredHeight()
            int r2 = r17 + r2
            int r3 = r7.topMargin
            int r2 = r2 + r3
            int r3 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = java.lang.Math.max(r10, r2)
            int r0 = r0.getMeasuredState()
            int r0 = android.view.View.combineMeasuredStates(r9, r0)
            r4 = r1
            r3 = r2
            r1 = r0
            goto L_0x0244
        L_0x0233:
            r20 = r2
            r28 = r5
            r23 = r9
            r26 = r10
            r27 = r11
            r19 = 0
            r25 = 1
            r9 = r1
            r10 = r3
            r11 = r4
        L_0x0244:
            int r2 = r20 + 1
            r9 = r23
            r10 = r26
            r11 = r27
            r5 = r28
            r7 = 0
            r8 = 1
            goto L_0x00f9
        L_0x0252:
            r9 = r1
            r10 = r3
            r11 = r4
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r9
            r5 = r31
            int r0 = android.view.View.resolveSizeAndState(r11, r5, r0)
            int r1 = r9 << 16
            r7 = r32
            int r1 = android.view.View.resolveSizeAndState(r10, r7, r1)
            r6.setMeasuredDimension(r0, r1)
            return
        L_0x026a:
            r5 = r31
            r7 = r32
            r19 = 0
            android.view.View r8 = r6.getChildAt(r4)
            ahm r9 = c((android.view.View) r8)
            int r0 = r9.f
            r1 = -1
            r2 = 0
            if (r0 == r1) goto L_0x032f
            android.view.View r0 = r9.k
            if (r0 != 0) goto L_0x0283
            goto L_0x02ac
        L_0x0283:
            int r0 = r0.getId()
            int r1 = r9.f
            if (r0 != r1) goto L_0x02ac
            android.view.View r0 = r9.k
            android.view.ViewParent r1 = r0.getParent()
        L_0x0291:
            if (r1 != r6) goto L_0x0297
            r9.l = r0
            goto L_0x0333
        L_0x0297:
            if (r1 != 0) goto L_0x029a
        L_0x0299:
            goto L_0x02a8
        L_0x029a:
            if (r1 == r8) goto L_0x0299
            boolean r10 = r1 instanceof android.view.View
            if (r10 == 0) goto L_0x02a3
            r0 = r1
            android.view.View r0 = (android.view.View) r0
        L_0x02a3:
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x0291
        L_0x02a8:
            r9.l = r2
            r9.k = r2
        L_0x02ac:
            int r0 = r9.f
            android.view.View r0 = r6.findViewById(r0)
            r9.k = r0
            android.view.View r0 = r9.k
            if (r0 != 0) goto L_0x02ed
            boolean r0 = r30.isInEditMode()
            if (r0 == 0) goto L_0x02c4
            r9.l = r2
            r9.k = r2
            goto L_0x0333
        L_0x02c4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not find CoordinatorLayout descendant view with id "
            r1.append(r2)
            android.content.res.Resources r2 = r30.getResources()
            int r3 = r9.f
            java.lang.String r2 = r2.getResourceName(r3)
            r1.append(r2)
            java.lang.String r2 = " to anchor view "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x02ed:
            if (r0 == r6) goto L_0x031c
            android.view.ViewParent r1 = r0.getParent()
        L_0x02f3:
            if (r1 != r6) goto L_0x02f6
        L_0x02f5:
            goto L_0x0319
        L_0x02f6:
            if (r1 == 0) goto L_0x02f5
            if (r1 == r8) goto L_0x0306
            boolean r10 = r1 instanceof android.view.View
            if (r10 == 0) goto L_0x0301
            r0 = r1
            android.view.View r0 = (android.view.View) r0
        L_0x0301:
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x02f3
        L_0x0306:
            boolean r0 = r30.isInEditMode()
            if (r0 == 0) goto L_0x0311
            r9.l = r2
            r9.k = r2
            goto L_0x0333
        L_0x0311:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            r0.<init>(r1)
            throw r0
        L_0x0319:
            r9.l = r0
            goto L_0x0333
        L_0x031c:
            boolean r0 = r30.isInEditMode()
            if (r0 == 0) goto L_0x0327
            r9.l = r2
            r9.k = r2
            goto L_0x0333
        L_0x0327:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L_0x032f:
            r9.l = r2
            r9.k = r2
        L_0x0333:
            ahq r0 = r6.e
            r0.a(r8)
            r1 = 0
        L_0x0339:
            if (r1 < r3) goto L_0x0340
            int r4 = r4 + 1
            r7 = 0
            goto L_0x001b
        L_0x0340:
            if (r1 == r4) goto L_0x03bd
            android.view.View r0 = r6.getChildAt(r1)
            android.view.View r2 = r9.l
            if (r0 != r2) goto L_0x034b
            goto L_0x0370
        L_0x034b:
            int r2 = defpackage.qb.h(r30)
            android.view.ViewGroup$LayoutParams r10 = r0.getLayoutParams()
            ahm r10 = (defpackage.ahm) r10
            int r10 = r10.g
            int r10 = defpackage.pd.a(r10, r2)
            if (r10 == 0) goto L_0x0366
            int r11 = r9.h
            int r2 = defpackage.pd.a(r11, r2)
            r2 = r2 & r10
            if (r2 == r10) goto L_0x0370
        L_0x0366:
            ahj r2 = r9.a
            if (r2 == 0) goto L_0x03bd
            boolean r2 = r2.a((android.view.View) r8, (android.view.View) r0)
            if (r2 == 0) goto L_0x03bd
        L_0x0370:
            ahq r2 = r6.e
            ou r2 = r2.a
            boolean r2 = r2.containsKey(r0)
            if (r2 == 0) goto L_0x037b
            goto L_0x0380
        L_0x037b:
            ahq r2 = r6.e
            r2.a(r0)
        L_0x0380:
            ahq r2 = r6.e
            ou r10 = r2.a
            boolean r10 = r10.containsKey(r0)
            if (r10 == 0) goto L_0x03b5
            ou r10 = r2.a
            boolean r10 = r10.containsKey(r8)
            if (r10 == 0) goto L_0x03b5
            ou r10 = r2.a
            java.lang.Object r10 = r10.get(r0)
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 != 0) goto L_0x03b1
            or r10 = r2.d
            java.lang.Object r10 = r10.a()
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 == 0) goto L_0x03a7
            goto L_0x03ac
        L_0x03a7:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x03ac:
            ou r2 = r2.a
            r2.put(r0, r10)
        L_0x03b1:
            r10.add(r8)
            goto L_0x03bd
        L_0x03b5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            r0.<init>(r1)
            throw r0
        L_0x03bd:
            int r1 = r1 + 1
            goto L_0x0339
        L_0x03c1:
            r5 = r31
            r7 = r32
            r19 = 0
            ou r3 = r0.a
            java.lang.Object r3 = r3.c(r2)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 == 0) goto L_0x03d9
            r3.clear()
            or r4 = r0.d
            r4.a(r3)
        L_0x03d9:
            int r2 = r2 + 1
            r7 = 0
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public final boolean onNestedFling(View view, float f2, float f3, boolean z) {
        ahj ahj;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ahm ahm = (ahm) childAt.getLayoutParams();
                if (ahm.a(0) && (ahj = ahm.a) != null) {
                    z2 |= ahj.a(childAt);
                }
            }
        }
        if (z2) {
            a(1);
        }
        return z2;
    }

    public final boolean onNestedPreFling(View view, float f2, float f3) {
        ahj ahj;
        int childCount = getChildCount();
        boolean z = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ahm ahm = (ahm) childAt.getLayoutParams();
                if (ahm.a(0) && (ahj = ahm.a) != null) {
                    z |= ahj.b(view);
                }
            }
        }
        return z;
    }

    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        a(view, i2, i3, iArr, 0);
    }

    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        a(view, i2, i3, i4, i5, 0);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        b(view, view2, i2, 0);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.b);
        SparseArray sparseArray = savedState.c;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            ahj ahj = c(childAt).a;
            if (!(id == -1 || ahj == null || (parcelable2 = (Parcelable) sparseArray.get(id)) == null)) {
                ahj.a(childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        Parcelable c2;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            ahj ahj = ((ahm) childAt.getLayoutParams()).a;
            if (!(id == -1 || ahj == null || (c2 = ahj.c(childAt)) == null)) {
                sparseArray.append(id, c2);
            }
        }
        savedState.c = sparseArray;
        return savedState;
    }

    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return a(view, view2, i2, 0);
    }

    public final void onStopNestedScroll(View view) {
        a(view, 0);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.q;
        boolean z2 = false;
        if (view != null) {
            ahj ahj = ((ahm) view.getLayoutParams()).a;
            z = ahj != null ? ahj.b(this, this.q, motionEvent) : false;
        } else {
            z = a(motionEvent, 1);
            if (actionMasked != 0 && z) {
                z2 = true;
            }
        }
        if (this.q == null || actionMasked == 3) {
            z |= super.onTouchEvent(motionEvent);
        } else if (z2) {
            MotionEvent a2 = a(motionEvent);
            super.onTouchEvent(a2);
            a2.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.q = null;
            b();
        }
        return z;
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        ahj ahj = ((ahm) view.getLayoutParams()).a;
        if (ahj == null || !ahj.a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.n) {
            if (this.q == null) {
                int childCount = getChildCount();
                MotionEvent motionEvent = null;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    ahj ahj = ((ahm) childAt.getLayoutParams()).a;
                    if (ahj != null) {
                        if (motionEvent == null) {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        }
                        ahj.a(this, childAt, motionEvent);
                    }
                }
                if (motionEvent != null) {
                    motionEvent.recycle();
                }
            }
            b();
            this.n = true;
        }
    }

    public final void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        c();
    }

    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.i = onHierarchyChangeListener;
    }

    public final void setVisibility(int i2) {
        boolean z;
        super.setVisibility(i2);
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.u;
        if (drawable != null && drawable.isVisible() != z) {
            this.u.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.u;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    static final ahm c(View view) {
        ahm ahm = (ahm) view.getLayoutParams();
        if (!ahm.b) {
            if (view instanceof ahi) {
                ahj a2 = ((ahi) view).a();
                if (a2 == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                ahm.a(a2);
                ahm.b = true;
            } else {
                ahk ahk = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    ahk = (ahk) cls.getAnnotation(ahk.class);
                    if (ahk != null) {
                        break;
                    }
                }
                if (ahk != null) {
                    try {
                        ahm.a((ahj) ahk.a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e2) {
                        Log.e("CoordinatorLayout", "Default behavior class " + ahk.a().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                    }
                }
                ahm.b = true;
            }
        }
        return ahm;
    }

    private static final void d(View view, int i2) {
        ahm ahm = (ahm) view.getLayoutParams();
        int i3 = ahm.j;
        if (i3 != i2) {
            qb.g(view, i2 - i3);
            ahm.j = i2;
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray typedArray;
        this.j = new ArrayList();
        this.e = new ahq();
        this.k = new ArrayList();
        this.f = new ArrayList();
        this.l = new int[2];
        this.m = new int[2];
        this.w = new pp();
        if (i2 == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, ahg.a, 0, 2132019098);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, ahg.a, i2, 0);
        }
        if (i2 == 0) {
            qb.a(this, context, ahg.a, attributeSet, typedArray, 0, 2132019098);
        } else {
            qb.a(this, context, ahg.a, attributeSet, typedArray, i2, 0);
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.p = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.p.length;
            for (int i3 = 0; i3 < length; i3++) {
                int[] iArr = this.p;
                iArr[i3] = (int) (((float) iArr[i3]) * f2);
            }
        }
        this.u = typedArray.getDrawable(1);
        typedArray.recycle();
        c();
        super.setOnHierarchyChangeListener(new ahl(this));
        if (qb.f(this) == 0) {
            qb.b((View) this, 1);
        }
    }

    private final void b() {
        View view = this.q;
        if (view != null) {
            ahj ahj = ((ahm) view.getLayoutParams()).a;
            if (ahj != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                ahj.b(this, this.q, obtain);
                obtain.recycle();
            }
            this.q = null;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((ahm) getChildAt(i2).getLayoutParams()).m = false;
        }
        this.n = false;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ahm) {
            return new ahm((ahm) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new ahm((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new ahm(layoutParams);
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new aho();
        SparseArray c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.c = new SparseArray(readInt);
            for (int i = 0; i < readInt; i++) {
                this.c.append(iArr[i], readParcelableArray[i]);
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int i2;
            super.writeToParcel(parcel, i);
            SparseArray sparseArray = this.c;
            if (sparseArray != null) {
                i2 = sparseArray.size();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int[] iArr = new int[i2];
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.c.keyAt(i3);
                parcelableArr[i3] = (Parcelable) this.c.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public final List b(View view) {
        ahq ahq = this.e;
        int i2 = ahq.a.h;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) ahq.a.c(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(ahq.a.b(i3));
            }
        }
        this.f.clear();
        if (arrayList != null) {
            this.f.addAll(arrayList);
        }
        return this.f;
    }

    private static Rect a() {
        Rect rect = (Rect) x.a();
        return rect == null ? new Rect() : rect;
    }

    private final void c() {
        int i2 = Build.VERSION.SDK_INT;
        if (qb.s(this)) {
            if (this.v == null) {
                this.v = new ahh(this);
            }
            qb.a((View) this, this.v);
            setSystemUiVisibility(1280);
            return;
        }
        qb.a((View) this, (pq) null);
    }

    private static final MotionEvent a(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        return obtain;
    }

    private static final void a(int i2, Rect rect, Rect rect2, ahm ahm, int i3, int i4) {
        int i5;
        int i6;
        int i7 = ahm.c;
        if (i7 == 0) {
            i7 = 17;
        }
        int a2 = pd.a(i7, i2);
        int a3 = pd.a(c(ahm.d), i2);
        int i8 = a2 & 7;
        int i9 = a2 & 112;
        int i10 = a3 & 112;
        int i11 = a3 & 7;
        if (i11 == 1) {
            i5 = rect.left + (rect.width() / 2);
        } else if (i11 != 5) {
            i5 = rect.left;
        } else {
            i5 = rect.right;
        }
        if (i10 == 16) {
            i6 = (rect.height() / 2) + rect.top;
        } else if (i10 != 80) {
            i6 = rect.top;
        } else {
            i6 = rect.bottom;
        }
        if (i8 == 1) {
            i5 -= i3 / 2;
        } else if (i8 != 5) {
            i5 -= i3;
        }
        if (i9 == 16) {
            i6 -= i4 / 2;
        } else if (i9 != 80) {
            i6 -= i4;
        }
        rect2.set(i5, i6, i3 + i5, i4 + i6);
    }

    public final void b(View view, int i2) {
        int i3;
        ahm ahm = (ahm) view.getLayoutParams();
        View view2 = ahm.k;
        if (view2 == null && ahm.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (view2 != null) {
            Rect a2 = a();
            Rect a3 = a();
            try {
                ahr.a((ViewGroup) this, view2, a2);
                ahm ahm2 = (ahm) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                a(i2, a2, a3, ahm2, measuredWidth, measuredHeight);
                a(ahm2, a3, measuredWidth, measuredHeight);
                view.layout(a3.left, a3.top, a3.right, a3.bottom);
            } finally {
                a(a2);
                a(a3);
            }
        } else {
            int i4 = ahm.e;
            if (i4 >= 0) {
                ahm ahm3 = (ahm) view.getLayoutParams();
                int a4 = pd.a(d(ahm3.c), i2);
                int i5 = a4 & 7;
                int i6 = a4 & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i2 == 1) {
                    i4 = width - i4;
                }
                int b2 = b(i4) - measuredWidth2;
                if (i5 == 1) {
                    b2 += measuredWidth2 / 2;
                } else if (i5 == 5) {
                    b2 += measuredWidth2;
                }
                if (i6 == 16) {
                    i3 = measuredHeight2 / 2;
                } else if (i6 != 80) {
                    i3 = 0;
                } else {
                    i3 = measuredHeight2;
                }
                int max = Math.max(getPaddingLeft() + ahm3.leftMargin, Math.min(b2, ((width - getPaddingRight()) - measuredWidth2) - ahm3.rightMargin));
                int max2 = Math.max(getPaddingTop() + ahm3.topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight2) - ahm3.bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            ahm ahm4 = (ahm) view.getLayoutParams();
            Rect a5 = a();
            a5.set(getPaddingLeft() + ahm4.leftMargin, getPaddingTop() + ahm4.topMargin, (getWidth() - getPaddingRight()) - ahm4.rightMargin, (getHeight() - getPaddingBottom()) - ahm4.bottomMargin);
            if (this.g != null && qb.s(this) && !qb.s(view)) {
                a5.left += this.g.a();
                a5.top += this.g.b();
                a5.right -= this.g.c();
                a5.bottom -= this.g.d();
            }
            Rect a6 = a();
            pd.a(c(ahm4.c), view.getMeasuredWidth(), view.getMeasuredHeight(), a5, a6, i2);
            view.layout(a6.left, a6.top, a6.right, a6.bottom);
            a(a5);
            a(a6);
        }
    }

    private static final void c(View view, int i2) {
        ahm ahm = (ahm) view.getLayoutParams();
        int i3 = ahm.i;
        if (i3 != i2) {
            qb.h(view, i2 - i3);
            ahm.i = i2;
        }
    }

    private final void a(ahm ahm, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ahm.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ahm.rightMargin));
        int max2 = Math.max(getPaddingTop() + ahm.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ahm.bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    private static void a(Rect rect) {
        rect.setEmpty();
        x.a(rect);
    }

    private final boolean a(ahj ahj, View view, MotionEvent motionEvent, int i2) {
        if (i2 != 0) {
            return ahj.b(this, view, motionEvent);
        }
        return ahj.a(this, view, motionEvent);
    }

    private final boolean a(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.k;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        Comparator comparator = d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) list.get(i4);
            ahm ahm = (ahm) view.getLayoutParams();
            ahj ahj = ahm.a;
            if (!z || actionMasked == 0) {
                if (!z && ahj != null && (z = a(ahj, view, motionEvent, i2))) {
                    this.q = view;
                    if (!(actionMasked == 3 || actionMasked == 1)) {
                        for (int i5 = 0; i5 < i4; i5++) {
                            View view2 = (View) list.get(i5);
                            ahj ahj2 = ((ahm) view2.getLayoutParams()).a;
                            if (ahj2 != null) {
                                if (motionEvent2 == null) {
                                    motionEvent2 = a(motionEvent);
                                }
                                a(ahj2, view2, motionEvent2, i2);
                            }
                        }
                    }
                }
                if (ahm.a == null) {
                    ahm.m = false;
                }
                boolean z2 = ahm.m;
            } else if (ahj != null) {
                if (motionEvent2 == null) {
                    motionEvent2 = a(motionEvent);
                }
                a(ahj, view, motionEvent2, i2);
            }
        }
        list.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return z;
    }

    public final void b(View view, View view2, int i2, int i3) {
        this.w.a(i2, i3);
        this.r = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ((ahm) getChildAt(i4).getLayoutParams()).a(i3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02d5 A[EDGE_INSN: B:134:0x02d5->B:127:0x02d5 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x026b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            int r8 = defpackage.qb.h(r24)
            java.util.List r2 = r0.j
            int r9 = r2.size()
            android.graphics.Rect r10 = a()
            android.graphics.Rect r11 = a()
            android.graphics.Rect r12 = a()
            r14 = 0
        L_0x001b:
            if (r14 >= r9) goto L_0x02db
            java.util.List r2 = r0.j
            java.lang.Object r2 = r2.get(r14)
            r15 = r2
            android.view.View r15 = (android.view.View) r15
            android.view.ViewGroup$LayoutParams r2 = r15.getLayoutParams()
            r7 = r2
            ahm r7 = (defpackage.ahm) r7
            if (r1 != 0) goto L_0x0040
            int r2 = r15.getVisibility()
            r3 = 8
            if (r2 != r3) goto L_0x003e
            r4 = r9
            r5 = r12
            r18 = r14
            r2 = 0
            goto L_0x02d5
        L_0x003e:
            r6 = 0
            goto L_0x0041
        L_0x0040:
            r6 = 0
        L_0x0041:
            if (r6 >= r14) goto L_0x00f4
            java.util.List r2 = r0.j
            java.lang.Object r2 = r2.get(r6)
            android.view.View r2 = (android.view.View) r2
            android.view.View r3 = r7.l
            if (r3 != r2) goto L_0x00de
            android.view.ViewGroup$LayoutParams r2 = r15.getLayoutParams()
            r4 = r2
            ahm r4 = (defpackage.ahm) r4
            android.view.View r2 = r4.k
            if (r2 == 0) goto L_0x00d3
            android.graphics.Rect r3 = a()
            android.graphics.Rect r2 = a()
            android.graphics.Rect r13 = a()
            android.view.View r5 = r4.k
            defpackage.ahr.a((android.view.ViewGroup) r0, (android.view.View) r5, (android.graphics.Rect) r3)
            r5 = 0
            r0.a((android.view.View) r15, (boolean) r5, (android.graphics.Rect) r2)
            int r5 = r15.getMeasuredWidth()
            r17 = r9
            int r9 = r15.getMeasuredHeight()
            r18 = r14
            r14 = r2
            r2 = r8
            r19 = r3
            r20 = r4
            r4 = r13
            r16 = r5
            r21 = r12
            r12 = 1
            r5 = r20
            r22 = r6
            r6 = r16
            r23 = r7
            r7 = r9
            a((int) r2, (android.graphics.Rect) r3, (android.graphics.Rect) r4, (defpackage.ahm) r5, (int) r6, (int) r7)
            int r2 = r13.left
            int r3 = r14.left
            if (r2 != r3) goto L_0x00a1
            int r2 = r13.top
            int r3 = r14.top
            if (r2 != r3) goto L_0x00a1
            r5 = 0
            goto L_0x00a2
        L_0x00a1:
            r5 = 1
        L_0x00a2:
            r3 = r16
            r2 = r20
            r0.a((defpackage.ahm) r2, (android.graphics.Rect) r13, (int) r3, (int) r9)
            int r3 = r13.left
            int r4 = r14.left
            int r3 = r3 - r4
            int r4 = r13.top
            int r6 = r14.top
            int r4 = r4 - r6
            if (r3 == 0) goto L_0x00b8
            defpackage.qb.h(r15, r3)
        L_0x00b8:
            if (r4 == 0) goto L_0x00bd
            defpackage.qb.g(r15, r4)
        L_0x00bd:
            if (r5 != 0) goto L_0x00c0
            goto L_0x00c9
        L_0x00c0:
            ahj r3 = r2.a
            if (r3 == 0) goto L_0x00c9
            android.view.View r2 = r2.k
            r3.a((androidx.coordinatorlayout.widget.CoordinatorLayout) r0, (android.view.View) r15, (android.view.View) r2)
        L_0x00c9:
            a((android.graphics.Rect) r19)
            a((android.graphics.Rect) r14)
            a((android.graphics.Rect) r13)
            goto L_0x00e8
        L_0x00d3:
            r22 = r6
            r23 = r7
            r17 = r9
            r21 = r12
            r18 = r14
            goto L_0x00e8
        L_0x00de:
            r22 = r6
            r23 = r7
            r17 = r9
            r21 = r12
            r18 = r14
        L_0x00e8:
            int r6 = r22 + 1
            r9 = r17
            r14 = r18
            r12 = r21
            r7 = r23
            goto L_0x0041
        L_0x00f4:
            r23 = r7
            r17 = r9
            r21 = r12
            r18 = r14
            r12 = 1
            r0.a((android.view.View) r15, (boolean) r12, (android.graphics.Rect) r11)
            r2 = r23
            int r3 = r2.g
            r4 = 5
            r5 = 3
            r6 = 80
            r7 = 48
            if (r3 == 0) goto L_0x015a
            boolean r3 = r11.isEmpty()
            if (r3 != 0) goto L_0x015a
            int r3 = r2.g
            int r3 = defpackage.pd.a(r3, r8)
            r9 = r3 & 112(0x70, float:1.57E-43)
            if (r9 == r7) goto L_0x012f
            if (r9 == r6) goto L_0x011f
            goto L_0x0139
        L_0x011f:
            int r9 = r10.bottom
            int r13 = r24.getHeight()
            int r14 = r11.top
            int r13 = r13 - r14
            int r9 = java.lang.Math.max(r9, r13)
            r10.bottom = r9
            goto L_0x0139
        L_0x012f:
            int r9 = r10.top
            int r13 = r11.bottom
            int r9 = java.lang.Math.max(r9, r13)
            r10.top = r9
        L_0x0139:
            r3 = r3 & 7
            if (r3 == r5) goto L_0x0150
            if (r3 == r4) goto L_0x0140
            goto L_0x015a
        L_0x0140:
            int r3 = r10.right
            int r9 = r24.getWidth()
            int r13 = r11.left
            int r9 = r9 - r13
            int r3 = java.lang.Math.max(r3, r9)
            r10.right = r3
            goto L_0x015a
        L_0x0150:
            int r3 = r10.left
            int r9 = r11.right
            int r3 = java.lang.Math.max(r3, r9)
            r10.left = r3
        L_0x015a:
            int r2 = r2.h
            if (r2 == 0) goto L_0x026b
            int r2 = r15.getVisibility()
            if (r2 != 0) goto L_0x026b
            boolean r2 = defpackage.qb.A(r15)
            if (r2 == 0) goto L_0x0269
            int r2 = r15.getWidth()
            if (r2 <= 0) goto L_0x0267
            int r2 = r15.getHeight()
            if (r2 <= 0) goto L_0x0267
            android.view.ViewGroup$LayoutParams r2 = r15.getLayoutParams()
            ahm r2 = (defpackage.ahm) r2
            ahj r3 = r2.a
            android.graphics.Rect r9 = a()
            android.graphics.Rect r13 = a()
            int r14 = r15.getLeft()
            int r12 = r15.getTop()
            int r4 = r15.getRight()
            int r5 = r15.getBottom()
            r13.set(r14, r12, r4, r5)
            if (r3 == 0) goto L_0x01d0
            boolean r3 = r3.a((android.view.View) r15, (android.graphics.Rect) r9)
            if (r3 != 0) goto L_0x01a2
            goto L_0x01d0
        L_0x01a2:
            boolean r3 = r13.contains(r9)
            if (r3 == 0) goto L_0x01a9
            goto L_0x01d3
        L_0x01a9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Rect should be within the child's bounds. Rect:"
            r2.append(r3)
            java.lang.String r3 = r9.toShortString()
            r2.append(r3)
            java.lang.String r3 = " | Bounds:"
            r2.append(r3)
            java.lang.String r3 = r13.toShortString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01d0:
            r9.set(r13)
        L_0x01d3:
            a((android.graphics.Rect) r13)
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L_0x01e2
            a((android.graphics.Rect) r9)
            r2 = 0
            goto L_0x026c
        L_0x01e2:
            int r3 = r2.h
            int r3 = defpackage.pd.a(r3, r8)
            r4 = r3 & 48
            if (r4 != r7) goto L_0x0200
            int r4 = r9.top
            int r5 = r2.topMargin
            int r4 = r4 - r5
            int r5 = r2.j
            int r4 = r4 - r5
            int r5 = r10.top
            if (r4 >= r5) goto L_0x0200
            int r5 = r10.top
            int r5 = r5 - r4
            d(r15, r5)
            r5 = 1
            goto L_0x0201
        L_0x0200:
            r5 = 0
        L_0x0201:
            r4 = r3 & 80
            if (r4 != r6) goto L_0x021d
            int r4 = r24.getHeight()
            int r6 = r9.bottom
            int r4 = r4 - r6
            int r6 = r2.bottomMargin
            int r4 = r4 - r6
            int r6 = r2.j
            int r4 = r4 + r6
            int r6 = r10.bottom
            if (r4 >= r6) goto L_0x021d
            int r5 = r10.bottom
            int r4 = r4 - r5
            d(r15, r4)
            goto L_0x0223
        L_0x021d:
            if (r5 != 0) goto L_0x0223
            r4 = 0
            d(r15, r4)
        L_0x0223:
            r4 = r3 & 3
            r5 = 3
            if (r4 != r5) goto L_0x023c
            int r4 = r9.left
            int r5 = r2.leftMargin
            int r4 = r4 - r5
            int r5 = r2.i
            int r4 = r4 - r5
            int r5 = r10.left
            if (r4 >= r5) goto L_0x023c
            int r5 = r10.left
            int r5 = r5 - r4
            c(r15, r5)
            r5 = 1
            goto L_0x023d
        L_0x023c:
            r5 = 0
        L_0x023d:
            r3 = r3 & 5
            r4 = 5
            if (r3 != r4) goto L_0x025b
            int r3 = r24.getWidth()
            int r4 = r9.right
            int r3 = r3 - r4
            int r4 = r2.rightMargin
            int r3 = r3 - r4
            int r2 = r2.i
            int r3 = r3 + r2
            int r2 = r10.right
            if (r3 >= r2) goto L_0x025b
            int r2 = r10.right
            int r3 = r3 - r2
            c(r15, r3)
            r2 = 0
            goto L_0x0263
        L_0x025b:
            if (r5 != 0) goto L_0x0262
            r2 = 0
            c(r15, r2)
            goto L_0x0263
        L_0x0262:
            r2 = 0
        L_0x0263:
            a((android.graphics.Rect) r9)
            goto L_0x026c
        L_0x0267:
            r2 = 0
            goto L_0x026c
        L_0x0269:
            r2 = 0
            goto L_0x026c
        L_0x026b:
            r2 = 0
        L_0x026c:
            r3 = 2
            if (r1 == r3) goto L_0x0291
            android.view.ViewGroup$LayoutParams r4 = r15.getLayoutParams()
            ahm r4 = (defpackage.ahm) r4
            android.graphics.Rect r4 = r4.o
            r5 = r21
            r5.set(r4)
            boolean r4 = r5.equals(r11)
            if (r4 != 0) goto L_0x028e
            android.view.ViewGroup$LayoutParams r4 = r15.getLayoutParams()
            ahm r4 = (defpackage.ahm) r4
            android.graphics.Rect r4 = r4.o
            r4.set(r11)
            goto L_0x0293
        L_0x028e:
            r4 = r17
            goto L_0x02d5
        L_0x0291:
            r5 = r21
        L_0x0293:
            int r14 = r18 + 1
        L_0x0295:
            r4 = r17
            if (r14 >= r4) goto L_0x02d5
            java.util.List r6 = r0.j
            java.lang.Object r6 = r6.get(r14)
            android.view.View r6 = (android.view.View) r6
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            ahm r7 = (defpackage.ahm) r7
            ahj r9 = r7.a
            if (r9 != 0) goto L_0x02ad
            r9 = 1
            goto L_0x02d0
        L_0x02ad:
            boolean r12 = r9.a((android.view.View) r6, (android.view.View) r15)
            if (r12 == 0) goto L_0x02cf
            if (r1 != 0) goto L_0x02be
            boolean r12 = r7.n
            if (r12 == 0) goto L_0x02be
            r7.a()
            r9 = 1
            goto L_0x02d0
        L_0x02be:
            if (r1 == r3) goto L_0x02c5
            boolean r6 = r9.a((androidx.coordinatorlayout.widget.CoordinatorLayout) r0, (android.view.View) r6, (android.view.View) r15)
            goto L_0x02c9
        L_0x02c5:
            r9.a((androidx.coordinatorlayout.widget.CoordinatorLayout) r0, (android.view.View) r15)
            r6 = 1
        L_0x02c9:
            r9 = 1
            if (r1 != r9) goto L_0x02d0
            r7.n = r6
            goto L_0x02d0
        L_0x02cf:
            r9 = 1
        L_0x02d0:
            int r14 = r14 + 1
            r17 = r4
            goto L_0x0295
        L_0x02d5:
            int r14 = r18 + 1
            r9 = r4
            r12 = r5
            goto L_0x001b
        L_0x02db:
            r5 = r12
            a((android.graphics.Rect) r10)
            a((android.graphics.Rect) r11)
            a((android.graphics.Rect) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.a(int):void");
    }

    public final void a(View view) {
        List b2 = this.e.b(view);
        if (b2 != null && !b2.isEmpty()) {
            for (int i2 = 0; i2 < b2.size(); i2++) {
                View view2 = (View) b2.get(i2);
                ahj ahj = ((ahm) view2.getLayoutParams()).a;
                if (ahj != null) {
                    ahj.a(this, view2, view);
                }
            }
        }
    }

    public final void a(View view, int i2) {
        this.w.a(i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            ahm ahm = (ahm) childAt.getLayoutParams();
            if (ahm.a(i2)) {
                ahj ahj = ahm.a;
                if (ahj != null) {
                    ahj.a(this, childAt, view, i2);
                }
                ahm.a(i2, false);
                ahm.a();
            }
        }
        this.r = null;
    }

    public final void a(View view, int i2, int i3, int i4) {
        measureChildWithMargins(view, i2, i3, i4, 0);
    }

    public final void a(View view, int i2, int i3, int i4, int i5, int i6) {
        a(view, i2, i3, i4, i5, 0, this.m);
    }

    public final void a(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        ahj ahj;
        int childCount = getChildCount();
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                ahm ahm = (ahm) childAt.getLayoutParams();
                if (ahm.a(i6) && (ahj = ahm.a) != null) {
                    int[] iArr2 = this.l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    ahj.a(this, childAt, i3, i4, i5, iArr2);
                    i7 = i4 <= 0 ? Math.min(i7, this.l[0]) : Math.max(i7, this.l[0]);
                    i8 = i5 <= 0 ? Math.min(i8, this.l[1]) : Math.max(i8, this.l[1]);
                    z = true;
                }
            } else {
                int i10 = i6;
            }
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i8;
        if (z) {
            a(1);
        }
    }

    public final void a(View view, int i2, int i3, int[] iArr, int i4) {
        ahj ahj;
        int childCount = getChildCount();
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                ahm ahm = (ahm) childAt.getLayoutParams();
                if (ahm.a(i4) && (ahj = ahm.a) != null) {
                    int[] iArr2 = this.l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    ahj.a(this, childAt, view, i3, iArr2, i4);
                    i5 = i2 <= 0 ? Math.min(i5, this.l[0]) : Math.max(i5, this.l[0]);
                    i6 = i3 <= 0 ? Math.min(i6, this.l[1]) : Math.max(i6, this.l[1]);
                    z = true;
                }
            } else {
                int i8 = i4;
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
        if (z) {
            a(1);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (!z) {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            ahr.a((ViewGroup) this, view, rect);
        }
    }

    public final boolean a(View view, int i2, int i3) {
        Rect a2 = a();
        ahr.a((ViewGroup) this, view, a2);
        try {
            return a2.contains(i2, i3);
        } finally {
            a(a2);
        }
    }

    public final boolean a(View view, View view2, int i2, int i3) {
        int i4 = i3;
        int childCount = getChildCount();
        boolean z = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ahm ahm = (ahm) childAt.getLayoutParams();
                ahj ahj = ahm.a;
                if (ahj != null) {
                    boolean a2 = ahj.a(this, childAt, view, view2, i2, i3);
                    z |= a2;
                    ahm.a(i4, a2);
                } else {
                    ahm.a(i4, false);
                }
            }
        }
        return z;
    }
}
