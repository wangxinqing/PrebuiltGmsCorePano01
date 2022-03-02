package com.google.android.places.ui.placepicker.views.expandingscrollview;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.Scroller;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.cast.JGCastService;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ExpandingScrollView extends alfe {
    public int a;
    public alfc b;
    public alfg c = alfg.HIDDEN;
    public alfg d;
    public final Set e = angm.e();
    final Set f = angm.e();
    public View g;
    private final int r;
    private alfo s = alfo.a;
    private alfo t = alfo.a;
    private alfo u = alfo.b;
    private alfg v;
    private alfg w;
    private final float[] x = new float[alfg.values().length];
    private final int[] y = new int[alfg.values().length];

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new alfb();
        public final alfg a;
        public final float[] b;
        public final int[] c;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = alfg.a(parcel.readString());
            this.b = parcel.createFloatArray();
            this.c = parcel.createIntArray();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a.toString());
            parcel.writeFloatArray(this.b);
            parcel.writeIntArray(this.c);
        }

        public SavedState(Parcelable parcelable, alfg alfg, float[] fArr, int[] iArr) {
            super(parcelable);
            this.a = alfg;
            this.b = fArr;
            this.c = iArr;
        }
    }

    static {
        ExpandingScrollView.class.getSimpleName();
    }

    public ExpandingScrollView(Context context) {
        super(context);
        Resources resources = getResources();
        a(resources.getConfiguration());
        this.b = new alfc(this, new alez(this), new alfa(this));
        this.r = (int) (resources.getDisplayMetrics().density * 400.0f);
        a();
        setClipChildren(false);
    }

    private final void a(Configuration configuration) {
        alfo alfo;
        if (configuration.orientation == 2) {
            alfo = this.u;
        } else {
            alfo = this.t;
        }
        this.s = alfo;
        a(this.c, false);
    }

    private final void e(alfg alfg) {
        alfg alfg2 = this.c;
        this.c = alfg;
        b();
        if (this.c != alfg2) {
            for (alfq b2 : this.e) {
                b2.b(this.c);
            }
        }
    }

    private final void f(alfg alfg) {
        int round = Math.round((((float) this.a) * this.x[alfg.ordinal()]) / 100.0f);
        int ordinal = alfg.ordinal();
        int[] iArr = this.y;
        if (iArr[ordinal] != round) {
            iArr[ordinal] = round;
            for (int i = ordinal - 1; i >= 0; i--) {
                int[] iArr2 = this.y;
                if (iArr2[i] > round) {
                    iArr2[i] = round;
                }
            }
            int i2 = ordinal + 1;
            while (true) {
                int[] iArr3 = this.y;
                if (i2 >= iArr3.length) {
                    break;
                }
                if (iArr3[i2] < round) {
                    iArr3[i2] = round;
                }
                i2++;
            }
            b();
            if (this.n) {
                int scrollY = getScrollY();
                while (scrollY < b(d(this.c))) {
                    alfg alfg2 = this.c;
                    if (alfg2 == d(alfg2)) {
                        break;
                    }
                    e(d(this.c));
                }
                while (scrollY > b(c(this.c))) {
                    alfg alfg3 = this.c;
                    if (alfg3 != c(alfg3)) {
                        e(c(this.c));
                    } else {
                        return;
                    }
                }
            } else if (this.c == alfg) {
                a(b(alfg), true, this.p);
            }
        }
    }

    public final int b(alfg alfg) {
        return this.y[alfg.ordinal()];
    }

    public final alfg c(alfg alfg) {
        return this.s.a(alfg.f);
    }

    public final alfg d(alfg alfg) {
        return this.s.b(alfg);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        alfg alfg = this.c;
        a(configuration);
        alfg alfg2 = this.c;
        if (alfg2 == alfg) {
            alfg alfg3 = this.v;
            if (alfg3 != null && this.s.d.contains(alfg3)) {
                if (this.c == this.w) {
                    a(this.v, false);
                }
                alfg2 = null;
                this.v = null;
            } else {
                return;
            }
        } else {
            this.v = alfg;
        }
        this.w = alfg2;
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5 = (i4 - i2) / 2;
        int i6 = this.a;
        if (i6 != i5) {
            this.a = i5;
            z2 = true;
        } else {
            i5 = i6;
            z2 = false;
        }
        int i7 = i3 - i;
        int i8 = 0;
        while (i8 < getChildCount()) {
            View childAt = getChildAt(i8);
            int measuredHeight = childAt.getMeasuredHeight() + i5;
            childAt.layout(getPaddingLeft(), i5, i7 - getPaddingRight(), measuredHeight);
            i8++;
            i5 = measuredHeight;
        }
        alfg alfg = alfg.COLLAPSED;
        if (alfg == this.s.a(alfg)) {
            View view = this.g;
            if (view instanceof alfr) {
                ((alfr) view).a();
            }
        }
        b();
        if (z2) {
            for (alfg alfg2 : alfg.values()) {
                if (this.x[alfg2.ordinal()] != -1.0f) {
                    f(alfg2);
                }
            }
            if (this.q.isFinished()) {
                a(this.c, false);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, JGCastService.FLAG_PRIVATE_DISPLAY);
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            getChildAt(i4).measure(i, makeMeasureSpec);
            i3 = Math.max(i3, getChildAt(i4).getMeasuredWidth());
        }
        setMeasuredDimension(i3, size + size);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.c = savedState.a;
        for (int i = 0; i < alfg.values().length; i++) {
            this.x[i] = savedState.b[i];
            this.y[i] = savedState.c[i];
        }
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.c, this.x, this.y);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0143, code lost:
        if (r0.c.s == defpackage.alfo.c) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014e, code lost:
        if (r0.k == false) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0150, code lost:
        if (r1 != null) goto L_0x0162;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            alfc r0 = r12.b
            com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView r1 = r0.c
            alfg r1 = r1.c
            alfg r2 = defpackage.alfg.HIDDEN
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L_0x01a9
            com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView r2 = r0.c
            int r5 = r2.a
            int r2 = r2.getScrollY()
            int r5 = r5 - r2
            float r2 = r13.getX()
            float r6 = r13.getY()
            alfg r7 = defpackage.alfg.EXPANDED
            if (r1 != r7) goto L_0x008e
            float r1 = (float) r5
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0027
            goto L_0x008e
        L_0x0027:
            int r1 = r13.getAction()
            if (r1 != r4) goto L_0x008e
            float r1 = r13.getX()
            float r7 = r0.f
            float r1 = r1 - r7
            float r1 = java.lang.Math.abs(r1)
            int r7 = r0.a
            float r7 = (float) r7
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x008e
            float r1 = r13.getY()
            float r7 = r0.g
            float r1 = r1 - r7
            float r1 = java.lang.Math.abs(r1)
            int r7 = r0.a
            float r7 = (float) r7
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x008e
            com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView r13 = r0.c
            java.util.Set r13 = r13.f
            java.util.Iterator r13 = r13.iterator()
        L_0x0059:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x006c
            java.lang.Object r1 = r13.next()
            alfp r1 = (defpackage.alfp) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x0059
            goto L_0x0073
        L_0x006c:
            com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView r13 = r0.c
            alfg r1 = defpackage.alfg.COLLAPSED
            r13.a((defpackage.alfg) r1)
        L_0x0073:
            com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView r13 = r0.c
            java.util.Set r13 = r13.f
            java.util.Iterator r13 = r13.iterator()
        L_0x007b:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x008b
            java.lang.Object r0 = r13.next()
            alfp r0 = (defpackage.alfp) r0
            r0.b()
            goto L_0x007b
        L_0x008b:
            r3 = 1
            goto L_0x01aa
        L_0x008e:
            int r1 = r13.getAction()
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == 0) goto L_0x0097
            goto L_0x00a4
        L_0x0097:
            r0.f = r2
            r0.g = r6
            float r1 = (float) r5
            float r1 = r6 - r1
            r0.h = r1
            r0.j = r7
            r0.k = r3
        L_0x00a4:
            com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView r1 = r0.c
            int r2 = r1.a
            int r1 = r1.getScrollY()
            int r2 = r2 - r1
            int r1 = r13.getAction()
            float r8 = r13.getX()
            float r9 = r13.getY()
            r10 = 4
            r11 = 2
            if (r1 != 0) goto L_0x00ce
            float r1 = (float) r2
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x00cc
            com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView r1 = r0.c
            alfg r1 = r1.c
            alfg r2 = defpackage.alfg.EXPANDED
            if (r1 == r2) goto L_0x00cc
            r1 = 1
            goto L_0x00f5
        L_0x00cc:
            r1 = 2
            goto L_0x00f5
        L_0x00ce:
            int r1 = r0.l
            if (r1 != r11) goto L_0x00f3
            float r1 = r0.f
            float r8 = r8 - r1
            float r1 = java.lang.Math.abs(r8)
            float r2 = r0.g
            float r9 = r9 - r2
            float r2 = java.lang.Math.abs(r9)
            int r8 = r0.b
            float r8 = (float) r8
            int r9 = r0.a
            float r9 = (float) r9
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x00f1
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 > 0) goto L_0x00ef
            goto L_0x00f3
        L_0x00ef:
            r1 = 3
            goto L_0x00f5
        L_0x00f1:
            r1 = 4
            goto L_0x00f5
        L_0x00f3:
            int r1 = r0.l
        L_0x00f5:
            r0.l = r1
            if (r1 == r4) goto L_0x01aa
            aley r1 = r0.e
            android.view.MotionEvent r1 = r1.a
            com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView r2 = r0.c
            android.view.View r2 = r2.g
            if (r2 != 0) goto L_0x0104
            goto L_0x0153
        L_0x0104:
            int r2 = r13.getAction()
            float r8 = r13.getY()
            if (r2 == 0) goto L_0x0162
            if (r2 == r4) goto L_0x0146
            if (r2 == r11) goto L_0x0113
            goto L_0x0150
        L_0x0113:
            int r2 = r0.l
            if (r2 != r10) goto L_0x0150
            com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView r2 = r0.c
            int r2 = r2.getScrollY()
            com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView r9 = r0.c
            alfg r11 = defpackage.alfg.FULLY_EXPANDED
            int r9 = r9.b(r11)
            if (r2 < r9) goto L_0x0153
            float r2 = r0.i
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0162
            com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView r2 = r0.c
            android.view.View r2 = r2.g
            float r8 = r0.f
            int r8 = (int) r8
            float r9 = r0.h
            int r9 = (int) r9
            boolean r2 = defpackage.alfc.a(r2, r8, r9)
            if (r2 != 0) goto L_0x0162
            com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView r2 = r0.c
            alfo r2 = r2.s
            alfo r8 = defpackage.alfo.c
            if (r2 != r8) goto L_0x0153
            goto L_0x0162
        L_0x0146:
            int r2 = r0.l
            if (r2 == r11) goto L_0x0162
            if (r2 != r10) goto L_0x0150
            boolean r2 = r0.k
            if (r2 == 0) goto L_0x0153
        L_0x0150:
            if (r1 == 0) goto L_0x0153
            goto L_0x0162
        L_0x0153:
            aley r1 = r0.e
            r1.a()
            r0.j = r7
            r0.k = r3
            aley r1 = r0.d
            r1.a(r13)
            goto L_0x01a5
        L_0x0162:
            aley r2 = r0.d
            r2.a()
            int r2 = r0.l
            r3 = 0
            if (r2 == r10) goto L_0x0178
            float r2 = r0.j
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 != 0) goto L_0x0173
            goto L_0x0178
        L_0x0173:
            float r2 = r2 - r6
            r13.offsetLocation(r3, r2)
            goto L_0x017d
        L_0x0178:
            int r2 = -r5
            float r2 = (float) r2
            r13.offsetLocation(r3, r2)
        L_0x017d:
            if (r1 == 0) goto L_0x0194
            float r1 = r13.getY()
            float r2 = r0.j
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            int r2 = r0.a
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0192
            goto L_0x0194
        L_0x0192:
            r0.k = r4
        L_0x0194:
            float r1 = r0.j
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x01a0
            float r1 = r13.getY()
            r0.j = r1
        L_0x01a0:
            aley r1 = r0.e
            r1.a(r13)
        L_0x01a5:
            r0.i = r6
            r3 = 1
            goto L_0x01aa
        L_0x01a9:
        L_0x01aa:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (this.c == alfg.HIDDEN) {
            int b2 = b(alfg.HIDDEN);
            a(b2, b2);
            return;
        }
        a(b((alfg) Collections.min(this.s.d)), b((alfg) Collections.max(this.s.d)));
    }

    public final void d() {
        this.d = null;
        for (alfq a2 : this.e) {
            a2.a(this.c);
        }
    }

    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        if (!this.e.isEmpty()) {
            a((Iterable) this.e);
        }
    }

    public final void c() {
        this.d = this.c;
        for (alfq c2 : this.e) {
            c2.c();
        }
    }

    public static /* synthetic */ void a(ExpandingScrollView expandingScrollView, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (expandingScrollView.m == null) {
            expandingScrollView.m = VelocityTracker.obtain();
        }
        expandingScrollView.m.addMovement(motionEvent);
        if (expandingScrollView.n) {
            if (action != 1) {
                if (action == 2) {
                    float f2 = expandingScrollView.h[1];
                    expandingScrollView.b(motionEvent);
                    expandingScrollView.a(expandingScrollView.getScrollY() + Math.round(f2 - expandingScrollView.h[1]));
                    expandingScrollView.o = false;
                    return;
                } else if (action != 3) {
                    return;
                }
            }
            expandingScrollView.n = false;
            if (action == 3 || expandingScrollView.getChildCount() <= 0) {
                expandingScrollView.a(0.0f);
            } else {
                expandingScrollView.m.computeCurrentVelocity(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, (float) expandingScrollView.j);
                float yVelocity = expandingScrollView.m.getYVelocity();
                int i = expandingScrollView.k;
                if (yVelocity <= ((float) i) && yVelocity >= ((float) (-i))) {
                    expandingScrollView.a(0.0f);
                } else {
                    float f3 = -yVelocity;
                    expandingScrollView.l = f3;
                    int scrollX = expandingScrollView.getScrollX();
                    int scrollY = expandingScrollView.getScrollY();
                    Scroller scroller = expandingScrollView.q;
                    int[] iArr = expandingScrollView.i;
                    scroller.fling(scrollX, scrollY, 0, (int) f3, 0, 0, iArr[0], iArr[1]);
                    expandingScrollView.invalidate();
                }
            }
            VelocityTracker velocityTracker = expandingScrollView.m;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                expandingScrollView.m = null;
            }
            expandingScrollView.o = false;
        } else if (!super.a(motionEvent) && action == 1 && expandingScrollView.o) {
            expandingScrollView.o = false;
            expandingScrollView.performClick();
        }
    }

    public ExpandingScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        a(resources.getConfiguration());
        this.b = new alfc(this, new alez(this), new alfa(this));
        this.r = (int) (resources.getDisplayMetrics().density * 400.0f);
        a();
        setClipChildren(false);
    }

    public final void a() {
        boolean z;
        for (alfg alfg : alfg.values()) {
            float f2 = alfg.g;
            if (f2 >= 0.0f) {
                z = true;
            } else {
                z = false;
            }
            amrl.a(z, (Object) "percentage may not be negative");
            this.x[alfg.ordinal()] = f2;
            f(alfg);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(float f2) {
        alfg alfg;
        if (this.c != alfg.HIDDEN) {
            if (Math.abs(f2) > ((float) this.r)) {
                int scrollY = (int) ((f2 * 0.3f) + ((float) getScrollY()));
                amzy amzy = this.s.d;
                int size = amzy.size();
                int i = 0;
                alfg = null;
                int i2 = Integer.MAX_VALUE;
                while (i < size) {
                    alfg alfg2 = (alfg) amzy.get(i);
                    int abs = Math.abs(b(alfg2) - scrollY);
                    int i3 = abs < i2 ? abs : i2;
                    if (abs < i2) {
                        alfg = alfg2;
                    }
                    i++;
                    i2 = i3;
                }
            } else {
                alfg = this.c;
                alfg c2 = getScrollY() > b(this.c) ? c(this.c) : d(this.c);
                alfg alfg3 = this.c;
                if (c2 != alfg3) {
                    int b2 = b(alfg3);
                    if (((float) (getScrollY() - b2)) / ((float) (b(c2) - b2)) > 0.2f) {
                        alfg = c2;
                    }
                }
            }
            a(alfg);
        }
    }

    public ExpandingScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = getResources();
        a(resources.getConfiguration());
        this.b = new alfc(this, new alez(this), new alfa(this));
        this.r = (int) (resources.getDisplayMetrics().density * 400.0f);
        a();
        setClipChildren(false);
    }

    public final void a(alfg alfg) {
        a(alfg, true);
    }

    public final void a(alfg alfg, boolean z) {
        int i;
        if (z) {
            i = this.p;
        } else {
            i = 0;
        }
        alfg a2 = this.s.a(alfg);
        e(a2);
        int b2 = b(a2);
        if (i > 0) {
            a(b2, false, i);
        } else {
            a(b2);
        }
    }

    public final void a(Iterable iterable) {
        alfg alfg;
        int scrollY = getScrollY();
        int i = 0;
        alfg alfg2 = alfg.values()[0];
        if (this.a > 0) {
            alfg[] values = alfg.values();
            int length = values.length;
            while (i < length) {
                alfg alfg3 = values[i];
                if (scrollY < b(alfg3)) {
                    break;
                }
                i++;
                alfg2 = alfg3;
            }
        }
        float f2 = 0.0f;
        if (b(alfg2) == this.a) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                ((alfq) it.next()).a(alfg2, 0.0f);
            }
            return;
        }
        int b2 = b(alfg2);
        if (alfg2 == alfg.HIDDEN) {
            alfg = alfg.COLLAPSED;
        } else {
            alfg = c(alfg2);
        }
        int b3 = b(alfg);
        if (b3 != b2) {
            f2 = (((float) scrollY) - ((float) b2)) / ((float) (b3 - b2));
        }
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            ((alfq) it2.next()).a(alfg2, f2);
        }
    }
}
