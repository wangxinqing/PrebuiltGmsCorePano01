package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AbsSavedState;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BottomSheetBehavior extends ahj {
    private boolean A;
    private ajtp B = null;
    private ValueAnimator C;
    private boolean D;
    private int E;
    private boolean F;
    private final ArrayList G = new ArrayList();
    private VelocityTracker H;
    private int I;
    private Map J;
    private final sc K = new ajtl(this);
    public boolean a = true;
    public int b;
    public ajzf c;
    public int d;
    public int e;
    public int f;
    float g = 0.5f;
    public int h;
    float i = -1.0f;
    public boolean j;
    public boolean k;
    public boolean l = true;
    public int m = 4;
    public sd n;
    int o;
    public int p;
    public WeakReference q;
    public WeakReference r;
    public int s;
    public boolean t;
    private int u = 0;
    private float v;
    private boolean w;
    private int x;
    private boolean y;
    private ajzl z;

    public BottomSheetBehavior() {
    }

    private final void a(Context context, AttributeSet attributeSet, boolean z2, ColorStateList colorStateList) {
        if (this.y) {
            this.z = ajzl.a(context, attributeSet, (int) R.attr.bottomSheetStyle, 2132018785).a();
            ajzf ajzf = new ajzf(this.z);
            this.c = ajzf;
            ajzf.a(context);
            if (z2 && colorStateList != null) {
                this.c.c(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.c.setTint(typedValue.data);
        }
    }

    private final void b(boolean z2) {
        WeakReference weakReference = this.q;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                int i2 = Build.VERSION.SDK_INT;
                if (z2) {
                    if (this.J == null) {
                        this.J = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = coordinatorLayout.getChildAt(i3);
                    if (childAt != this.q.get() && z2) {
                        int i4 = Build.VERSION.SDK_INT;
                        this.J.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z2) {
                    this.J = null;
                }
            }
        }
    }

    private final int d() {
        return this.w ? Math.max(this.x, this.p - ((this.o * 9) / 16)) : this.b;
    }

    private final void e() {
        int d2 = d();
        if (this.a) {
            this.h = Math.max(this.p - d2, this.e);
        } else {
            this.h = this.p - d2;
        }
    }

    private final void f() {
        this.f = (int) (((float) this.p) * (1.0f - this.g));
    }

    private final void g() {
        this.s = -1;
        VelocityTracker velocityTracker = this.H;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.H = null;
        }
    }

    private final void h() {
        View view;
        WeakReference weakReference = this.q;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            qb.c(view, 524288);
            qb.c(view, 262144);
            qb.c(view, 1048576);
            if (this.j && this.m != 5) {
                a(view, qp.f, 5);
            }
            int i2 = this.m;
            int i3 = 6;
            if (i2 == 3) {
                if (this.a) {
                    i3 = 4;
                }
                a(view, qp.e, i3);
            } else if (i2 == 4) {
                if (this.a) {
                    i3 = 3;
                }
                a(view, qp.d, i3);
            } else if (i2 == 6) {
                a(view, qp.e, 4);
                a(view, qp.d, 3);
            }
        }
    }

    public final void a() {
        this.q = null;
        this.n = null;
    }

    public final void a(ahm ahm) {
        this.q = null;
        this.n = null;
    }

    public final void a(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
        this.E = 0;
        this.F = false;
        return (i2 & 2) != 0;
    }

    public final int b() {
        if (!this.w) {
            return this.b;
        }
        return -1;
    }

    public final int c() {
        return !this.a ? this.d : this.e;
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new ajto();
        final int c;
        int d;
        boolean e;
        boolean f;
        boolean g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            boolean z = false;
            this.e = parcel.readInt() == 1;
            this.f = parcel.readInt() == 1;
            this.g = parcel.readInt() == 1 ? true : z;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.c = bottomSheetBehavior.m;
            this.d = bottomSheetBehavior.b;
            this.e = bottomSheetBehavior.a;
            this.f = bottomSheetBehavior.j;
            this.g = bottomSheetBehavior.k;
        }
    }

    private final void f(int i2) {
        boolean z2;
        ValueAnimator valueAnimator;
        float f2;
        if (i2 != 2) {
            if (i2 == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.A != z2) {
                this.A = z2;
                if (this.c != null && (valueAnimator = this.C) != null) {
                    if (!valueAnimator.isRunning()) {
                        if (i2 == 3) {
                            f2 = 0.0f;
                        } else {
                            f2 = 1.0f;
                        }
                        this.C.setFloatValues(new float[]{1.0f - f2, f2});
                        this.C.start();
                        return;
                    }
                    this.C.reverse();
                }
            }
        }
    }

    public final Parcelable c(View view) {
        return new SavedState((Parcelable) View.BaseSavedState.EMPTY_STATE, this);
    }

    /* access modifiers changed from: package-private */
    public final View d(View view) {
        if (qb.y(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View d2 = d(viewGroup.getChildAt(i2));
                if (d2 != null) {
                    return d2;
                }
            }
        }
        return null;
    }

    public final void e(int i2) {
        float f2;
        View view = (View) this.q.get();
        if (view != null && !this.G.isEmpty()) {
            int i3 = this.h;
            if (i2 <= i3 && i3 != c()) {
                int i4 = this.h;
                f2 = ((float) (i4 - i2)) / ((float) (i4 - c()));
            } else {
                int i5 = this.h;
                f2 = ((float) (i5 - i2)) / ((float) (this.p - i5));
            }
            for (int i6 = 0; i6 < this.G.size(); i6++) {
                ((ajtn) this.G.get(i6)).a(view, f2);
            }
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ajtw.a);
        this.y = obtainStyledAttributes.hasValue(10);
        if (obtainStyledAttributes.hasValue(1)) {
            a(context, attributeSet, true, ajym.a(context, obtainStyledAttributes, 1));
        } else {
            a(context, attributeSet, false, (ColorStateList) null);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.C = ofFloat;
        ofFloat.setDuration(500);
        this.C.addUpdateListener(new ajtk(this));
        int i3 = Build.VERSION.SDK_INT;
        this.i = obtainStyledAttributes.getDimension(0, -1.0f);
        TypedValue peekValue = obtainStyledAttributes.peekValue(7);
        if (peekValue == null || peekValue.data != -1) {
            a(obtainStyledAttributes.getDimensionPixelSize(7, -1));
        } else {
            a(peekValue.data);
        }
        a(obtainStyledAttributes.getBoolean(6, false));
        boolean z2 = obtainStyledAttributes.getBoolean(4, true);
        if (this.a != z2) {
            this.a = z2;
            if (this.q != null) {
                e();
            }
            if (this.a && this.m == 6) {
                i2 = 3;
            } else {
                i2 = this.m;
            }
            d(i2);
            h();
        }
        this.k = obtainStyledAttributes.getBoolean(9, false);
        this.l = obtainStyledAttributes.getBoolean(2, true);
        this.u = obtainStyledAttributes.getInt(8, 0);
        float f2 = obtainStyledAttributes.getFloat(5, 0.5f);
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.g = f2;
        if (this.q != null) {
            f();
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(3);
        if (peekValue2 == null || peekValue2.type != 16) {
            b(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        } else {
            b(peekValue2.data);
        }
        obtainStyledAttributes.recycle();
        this.v = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void d(int i2) {
        if (this.m != i2) {
            this.m = i2;
            WeakReference weakReference = this.q;
            if (weakReference != null && ((View) weakReference.get()) != null) {
                if (i2 == 3) {
                    b(true);
                } else if (i2 == 6 || i2 == 5 || i2 == 4) {
                    b(false);
                }
                f(i2);
                for (int i3 = 0; i3 < this.G.size(); i3++) {
                    ((ajtn) this.G.get(i3)).a(i2);
                }
                h();
            }
        }
    }

    private final void a(View view, qp qpVar, int i2) {
        qb.a(view, qpVar, (rf) new ajtm(this, i2));
    }

    public final void c(int i2) {
        if (i2 != this.m) {
            WeakReference weakReference = this.q;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent == null || !parent.isLayoutRequested() || !qb.D(view)) {
                        a(view, i2);
                    } else {
                        view.post(new ajtj(this, view, i2));
                    }
                }
            } else if (i2 == 4 || i2 == 3 || i2 == 6 || (this.j && i2 == 5)) {
                this.m = i2;
            }
        }
    }

    public final void a(int i2) {
        View view;
        if (i2 != -1) {
            if (this.w || this.b != i2) {
                this.w = false;
                this.b = Math.max(0, i2);
            } else {
                return;
            }
        } else if (!this.w) {
            this.w = true;
        } else {
            return;
        }
        if (this.q != null) {
            e();
            if (this.m == 4 && (view = (View) this.q.get()) != null) {
                view.requestLayout();
            }
        }
    }

    public final void b(int i2) {
        if (i2 >= 0) {
            this.d = i2;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public final boolean b(View view) {
        WeakReference weakReference = this.r;
        return (weakReference == null || view != weakReference.get() || this.m == 3) ? false : true;
    }

    public final boolean b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.m == 1 && actionMasked == 0) {
            return true;
        }
        sd sdVar = this.n;
        if (sdVar != null) {
            sdVar.b(motionEvent);
        }
        if (actionMasked == 0) {
            g();
        }
        if (this.H == null) {
            this.H = VelocityTracker.obtain();
        }
        this.H.addMovement(motionEvent);
        if (actionMasked == 2 && !this.D) {
            float abs = Math.abs(((float) this.I) - motionEvent.getY());
            sd sdVar2 = this.n;
            if (abs > ((float) sdVar2.b)) {
                sdVar2.a(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        if (!this.D) {
            return true;
        }
        return false;
    }

    public final void a(ajtn ajtn) {
        if (!this.G.contains(ajtn)) {
            this.G.add(ajtn);
        }
    }

    public final void a(View view, int i2) {
        int i3;
        int i4;
        if (i2 == 4) {
            i3 = this.h;
        } else if (i2 == 6) {
            int i5 = this.f;
            if (!this.a || i5 > (i4 = this.e)) {
                i3 = i5;
            } else {
                i3 = i4;
                i2 = 3;
            }
        } else if (i2 == 3) {
            i3 = c();
        } else if (!this.j || i2 != 5) {
            StringBuilder sb = new StringBuilder(35);
            sb.append("Illegal state argument: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i3 = this.p;
        }
        a(view, i2, i3, false);
    }

    public final void a(View view, int i2, int i3, boolean z2) {
        boolean z3;
        if (!z2) {
            sd sdVar = this.n;
            int left = view.getLeft();
            sdVar.d = view;
            sdVar.c = -1;
            z3 = sdVar.a(left, i3, 0, 0);
            if (!z3 && sdVar.a == 0 && sdVar.d != null) {
                sdVar.d = null;
                d(i2);
            }
        } else {
            z3 = this.n.a(view.getLeft(), i3);
        }
        if (z3) {
            d(2);
            f(i2);
            if (this.B == null) {
                this.B = new ajtp(this, view, i2);
            }
            ajtp ajtp = this.B;
            if (!ajtp.a) {
                ajtp.b = i2;
                qb.a(view, (Runnable) ajtp);
                this.B.a = true;
                return;
            }
            ajtp.b = i2;
            return;
        }
        d(i2);
    }

    public final void a(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i2 = this.u;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.b = savedState.d;
            }
            if (i2 == -1 || (i2 & 2) == 2) {
                this.a = savedState.e;
            }
            if (i2 == -1 || (i2 & 4) == 4) {
                this.j = savedState.f;
            }
            if (i2 == -1 || (i2 & 8) == 8) {
                this.k = savedState.g;
            }
        }
        int i3 = savedState.c;
        if (i3 == 1 || i3 == 2) {
            this.m = 4;
        } else {
            this.m = i3;
        }
    }

    public final void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i2) {
        int i3;
        float f2;
        int i4 = 3;
        if (view.getTop() != c()) {
            WeakReference weakReference = this.r;
            if (weakReference != null && view2 == weakReference.get() && this.F) {
                if (this.E <= 0) {
                    if (this.j) {
                        VelocityTracker velocityTracker = this.H;
                        if (velocityTracker != null) {
                            velocityTracker.computeCurrentVelocity(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.v);
                            f2 = this.H.getYVelocity(this.s);
                        } else {
                            f2 = 0.0f;
                        }
                        if (a(view, f2)) {
                            i3 = this.p;
                            i4 = 5;
                        }
                    }
                    if (this.E == 0) {
                        int top = view.getTop();
                        if (!this.a) {
                            int i5 = this.f;
                            if (top >= i5) {
                                if (Math.abs(top - i5) < Math.abs(top - this.h)) {
                                    i3 = this.f;
                                    i4 = 6;
                                } else {
                                    i3 = this.h;
                                    i4 = 4;
                                }
                            } else if (top < Math.abs(top - this.h)) {
                                i3 = this.d;
                            } else {
                                i3 = this.f;
                                i4 = 6;
                            }
                        } else if (Math.abs(top - this.e) < Math.abs(top - this.h)) {
                            i3 = this.e;
                        } else {
                            i3 = this.h;
                            i4 = 4;
                        }
                    } else {
                        if (!this.a) {
                            int top2 = view.getTop();
                            if (Math.abs(top2 - this.f) < Math.abs(top2 - this.h)) {
                                i3 = this.f;
                                i4 = 6;
                            }
                        }
                        i3 = this.h;
                        i4 = 4;
                    }
                } else if (!this.a) {
                    int top3 = view.getTop();
                    i3 = this.f;
                    if (top3 <= i3) {
                        i3 = this.d;
                    } else {
                        i4 = 6;
                    }
                } else {
                    i3 = this.e;
                }
                a(view, i4, i3, false);
                this.F = false;
                return;
            }
            return;
        }
        d(3);
    }

    public final void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int[] iArr, int i3) {
        View view3;
        if (i3 != 1) {
            WeakReference weakReference = this.r;
            if (weakReference != null) {
                view3 = (View) weakReference.get();
            } else {
                view3 = null;
            }
            if (view2 == view3) {
                int top = view.getTop();
                int i4 = top - i2;
                if (i2 > 0) {
                    if (i4 < c()) {
                        int c2 = top - c();
                        iArr[1] = c2;
                        qb.g(view, -c2);
                        d(3);
                    } else if (this.l) {
                        iArr[1] = i2;
                        qb.g(view, -i2);
                        d(1);
                    } else {
                        return;
                    }
                } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
                    int i5 = this.h;
                    if (i4 > i5 && !this.j) {
                        int i6 = top - i5;
                        iArr[1] = i6;
                        qb.g(view, -i6);
                        d(4);
                    } else if (this.l) {
                        iArr[1] = i2;
                        qb.g(view, -i2);
                        d(1);
                    } else {
                        return;
                    }
                }
                e(view.getTop());
                this.E = i2;
                this.F = true;
            }
        }
    }

    public final void a(boolean z2) {
        if (this.j != z2) {
            this.j = z2;
            if (!z2 && this.m == 5) {
                c(4);
            }
            h();
        }
    }

    public final boolean a(View view, float f2) {
        if (this.k) {
            return true;
        }
        if (view.getTop() >= this.h) {
            if (Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.h)) / ((float) d()) > 0.5f) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, int i2) {
        boolean z2;
        float f2;
        ajzf ajzf;
        if (qb.s(coordinatorLayout) && !qb.s(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.q == null) {
            this.x = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            this.q = new WeakReference(view);
            if (this.y && (ajzf = this.c) != null) {
                qb.a(view, (Drawable) ajzf);
            }
            ajzf ajzf2 = this.c;
            if (ajzf2 != null) {
                float f3 = this.i;
                if (f3 == -1.0f) {
                    f3 = qb.o(view);
                }
                ajzf2.d(f3);
                int i3 = this.m;
                if (i3 == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.A = z2;
                ajzf ajzf3 = this.c;
                if (i3 == 3) {
                    f2 = 0.0f;
                } else {
                    f2 = 1.0f;
                }
                ajzf3.c(f2);
            }
            h();
            if (qb.f(view) == 0) {
                qb.b(view, 1);
            }
        }
        if (this.n == null) {
            this.n = sd.a((ViewGroup) coordinatorLayout, this.K);
        }
        int top = view.getTop();
        coordinatorLayout.b(view, i2);
        this.o = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.p = height;
        this.e = Math.max(0, height - view.getHeight());
        f();
        e();
        int i4 = this.m;
        if (i4 == 3) {
            qb.g(view, c());
        } else if (i4 == 6) {
            qb.g(view, this.f);
        } else if (this.j && i4 == 5) {
            qb.g(view, this.p);
        } else if (i4 == 4) {
            qb.g(view, this.h);
        } else if (i4 == 1 || i4 == 2) {
            qb.g(view, top - view.getTop());
        }
        this.r = new WeakReference(d(view));
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00d3
            boolean r0 = r9.l
            if (r0 == 0) goto L_0x00d3
            int r0 = r12.getActionMasked()
            if (r0 == 0) goto L_0x0013
            goto L_0x0016
        L_0x0013:
            r9.g()
        L_0x0016:
            android.view.VelocityTracker r3 = r9.H
            if (r3 == 0) goto L_0x001b
            goto L_0x0021
        L_0x001b:
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.H = r3
        L_0x0021:
            android.view.VelocityTracker r3 = r9.H
            r3.addMovement(r12)
            r3 = 0
            r4 = -1
            r5 = 2
            if (r0 == 0) goto L_0x003c
            if (r0 == r2) goto L_0x0031
            r11 = 3
            if (r0 == r11) goto L_0x0031
            goto L_0x007f
        L_0x0031:
            r9.t = r1
            r9.s = r4
            boolean r11 = r9.D
            if (r11 == 0) goto L_0x007f
            r9.D = r1
            return r1
        L_0x003c:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.I = r7
            int r7 = r9.m
            if (r7 == r5) goto L_0x006e
            java.lang.ref.WeakReference r7 = r9.r
            if (r7 == 0) goto L_0x0057
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0058
        L_0x0057:
            r7 = r3
        L_0x0058:
            if (r7 == 0) goto L_0x006e
            int r8 = r9.I
            boolean r7 = r10.a((android.view.View) r7, (int) r6, (int) r8)
            if (r7 == 0) goto L_0x006e
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.s = r7
            r9.t = r2
        L_0x006e:
            int r7 = r9.s
            if (r7 != r4) goto L_0x007c
            int r4 = r9.I
            boolean r11 = r10.a((android.view.View) r11, (int) r6, (int) r4)
            if (r11 != 0) goto L_0x007c
            r11 = 1
            goto L_0x007d
        L_0x007c:
            r11 = 0
        L_0x007d:
            r9.D = r11
        L_0x007f:
            boolean r11 = r9.D
            if (r11 != 0) goto L_0x008f
            sd r11 = r9.n
            if (r11 != 0) goto L_0x0088
            goto L_0x008f
        L_0x0088:
            boolean r11 = r11.a((android.view.MotionEvent) r12)
            if (r11 == 0) goto L_0x008f
            return r2
        L_0x008f:
            java.lang.ref.WeakReference r11 = r9.r
            if (r11 == 0) goto L_0x009b
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
            goto L_0x009c
        L_0x009b:
        L_0x009c:
            if (r0 != r5) goto L_0x00d2
            if (r3 == 0) goto L_0x00d2
            boolean r11 = r9.D
            if (r11 != 0) goto L_0x00d2
            int r11 = r9.m
            if (r11 == r2) goto L_0x00d2
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.a((android.view.View) r3, (int) r11, (int) r0)
            if (r10 != 0) goto L_0x00d2
            sd r10 = r9.n
            if (r10 == 0) goto L_0x00d2
            int r10 = r9.I
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            sd r11 = r9.n
            int r11 = r11.b
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d2
            return r2
        L_0x00d2:
            return r1
        L_0x00d3:
            r9.D = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }
}
