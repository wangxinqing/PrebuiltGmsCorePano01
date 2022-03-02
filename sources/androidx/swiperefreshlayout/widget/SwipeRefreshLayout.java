package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import com.google.android.cast.JGCastService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SwipeRefreshLayout extends ViewGroup implements po, pn, pl {
    private static final int[] D = {16842766};
    private static final String m = SwipeRefreshLayout.class.getSimpleName();
    private boolean A;
    private int B;
    private final DecelerateInterpolator C;
    private int E;
    private Animation F;
    private Animation G;
    private Animation H;
    private Animation I;
    private Animation J;
    private int K;
    private Animation.AnimationListener L;
    private final Animation M;
    private final Animation N;
    public aqk a;
    public boolean b;
    public int c;
    public boolean d;
    public apx e;
    public int f;
    public float g;
    public int h;
    public int i;
    public aqb j;
    public boolean k;
    public boolean l;
    private View n;
    private int o;
    private float p;
    private float q;
    private final pp r;
    private final pm s;
    private final int[] t;
    private final int[] u;
    private final int[] v;
    private boolean w;
    private int x;
    private float y;
    private float z;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new aql();
        final boolean a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readByte() != 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.a ? (byte) 1 : 0);
        }

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.a = z;
        }
    }

    public SwipeRefreshLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private final Animation a(int i2, int i3) {
        aqf aqf = new aqf(this, i2, i3);
        aqf.setDuration(300);
        apx apx = this.e;
        apx.a = null;
        apx.clearAnimation();
        this.e.startAnimation(aqf);
        return aqf;
    }

    private final void c() {
        if (this.n == null) {
            int i2 = 0;
            while (i2 < getChildCount()) {
                View childAt = getChildAt(i2);
                if (childAt.equals(this.e)) {
                    i2++;
                } else {
                    this.n = childAt;
                    return;
                }
            }
        }
    }

    private final void d(float f2) {
        aqg aqg;
        if (f2 <= this.p) {
            this.b = false;
            this.j.b(0.0f);
            if (!this.d) {
                aqg = new aqg(this);
            } else {
                aqg = null;
            }
            int i2 = this.c;
            if (this.d) {
                this.f = i2;
                this.g = this.e.getScaleX();
                aqj aqj = new aqj(this);
                this.J = aqj;
                aqj.setDuration(150);
                if (aqg != null) {
                    this.e.a = aqg;
                }
                this.e.clearAnimation();
                this.e.startAnimation(this.J);
            } else {
                this.f = i2;
                this.N.reset();
                this.N.setDuration(200);
                this.N.setInterpolator(this.C);
                if (aqg != null) {
                    this.e.a = aqg;
                }
                this.e.clearAnimation();
                this.e.startAnimation(this.N);
            }
            this.j.a(false);
            return;
        }
        a(true, true);
    }

    private final void e(float f2) {
        float f3 = this.z;
        float f4 = (float) this.o;
        if (f2 - f3 > f4 && !this.A) {
            this.y = f3 + f4;
            this.A = true;
            this.j.setAlpha(76);
        }
    }

    public final void b(float f2) {
        int i2 = this.f;
        a((i2 + ((int) (((float) (this.h - i2)) * f2))) - this.e.getTop());
    }

    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.s.a(f2, f3, z2);
    }

    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.s.a(f2, f3);
    }

    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.s.a(i2, i3, iArr, iArr2);
    }

    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.s.a(i2, i3, i4, i5, iArr);
    }

    /* access modifiers changed from: protected */
    public final int getChildDrawingOrder(int i2, int i3) {
        int i4 = this.E;
        return i4 >= 0 ? i3 != i2 + -1 ? i3 >= i4 ? i3 + 1 : i3 : i4 : i3;
    }

    public final int getNestedScrollAxes() {
        return this.r.a();
    }

    public final boolean hasNestedScrollingParent() {
        return this.s.a();
    }

    public final boolean isNestedScrollingEnabled() {
        return this.s.a;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        c();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || b() || this.b || this.w) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.B;
                    if (i2 == -1) {
                        Log.e(m, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i2);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    e(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        a(motionEvent);
                    }
                }
            }
            this.A = false;
            this.B = -1;
        } else {
            a(this.h - this.e.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.B = pointerId;
            this.A = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.z = motionEvent.getY(findPointerIndex2);
        }
        return this.A;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.n == null) {
                c();
            }
            View view = this.n;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.e.getMeasuredWidth();
                int measuredHeight2 = this.e.getMeasuredHeight();
                apx apx = this.e;
                int i6 = measuredWidth / 2;
                int i7 = measuredWidth2 / 2;
                int i8 = this.c;
                apx.layout(i6 - i7, i8, i6 + i7, measuredHeight2 + i8);
            }
        }
    }

    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.n == null) {
            c();
        }
        View view = this.n;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), JGCastService.FLAG_PRIVATE_DISPLAY));
            this.e.measure(View.MeasureSpec.makeMeasureSpec(this.K, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(this.K, JGCastService.FLAG_PRIVATE_DISPLAY));
            this.E = -1;
            int i4 = 0;
            while (i4 < getChildCount()) {
                if (getChildAt(i4) != this.e) {
                    i4++;
                } else {
                    this.E = i4;
                    return;
                }
            }
        }
    }

    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        return dispatchNestedFling(f2, f3, z2);
    }

    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        float f2;
        if (i3 > 0) {
            float f3 = this.q;
            if (f3 > 0.0f) {
                float f4 = (float) i3;
                if (f4 <= f3) {
                    f2 = f3 - f4;
                    this.q = f2;
                    iArr[1] = i3;
                } else {
                    iArr[1] = (int) f3;
                    this.q = 0.0f;
                    f2 = 0.0f;
                }
                c(f2);
            }
        }
        if (this.l && i3 > 0 && this.q == 0.0f && Math.abs(i3 - iArr[1]) > 0) {
            this.e.setVisibility(8);
        }
        int[] iArr2 = this.t;
        if (dispatchNestedPreScroll(i2 - iArr[0], i3 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        a(view, i2, i3, i4, i5, 0, this.v);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        this.r.b(i2);
        startNestedScroll(i2 & 2);
        this.q = 0.0f;
        this.w = true;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        a(savedState.a);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.b);
    }

    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return isEnabled() && !this.b && (i2 & 2) != 0;
    }

    public final void onStopNestedScroll(View view) {
        this.r.a(0);
        this.w = false;
        float f2 = this.q;
        if (f2 > 0.0f) {
            d(f2);
            this.q = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || b() || this.b || this.w) {
            return false;
        }
        if (actionMasked == 0) {
            this.B = motionEvent.getPointerId(0);
            this.A = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.B);
            if (findPointerIndex < 0) {
                Log.e(m, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.A) {
                float y2 = motionEvent.getY(findPointerIndex);
                float f2 = this.y;
                this.A = false;
                d((y2 - f2) * 0.5f);
            }
            this.B = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.B);
            if (findPointerIndex2 < 0) {
                Log.e(m, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y3 = motionEvent.getY(findPointerIndex2);
            e(y3);
            if (this.A) {
                float f3 = (y3 - this.y) * 0.5f;
                if (f3 <= 0.0f) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                c(f3);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(m, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.B = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                a(motionEvent);
            }
        }
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        int i2 = Build.VERSION.SDK_INT;
        View view = this.n;
        if (view == null || qb.y(view)) {
            super.requestDisallowInterceptTouchEvent(z2);
            return;
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z2);
        }
    }

    public final void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (!z2) {
            a();
        }
    }

    public final void setNestedScrollingEnabled(boolean z2) {
        this.s.a(z2);
    }

    public final boolean startNestedScroll(int i2) {
        return this.s.b(i2);
    }

    public final void stopNestedScroll() {
        this.s.b();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        this.p = -1.0f;
        this.t = new int[2];
        this.u = new int[2];
        this.v = new int[2];
        this.B = -1;
        this.E = -1;
        this.L = new aqc(this);
        this.M = new aqh(this);
        this.N = new aqi(this);
        this.o = ViewConfiguration.get(context).getScaledTouchSlop();
        this.x = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.C = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.K = (int) (displayMetrics.density * 40.0f);
        this.e = new apx(getContext());
        aqb aqb = new aqb(getContext());
        this.j = aqb;
        aqa aqa = aqb.a;
        float f2 = aqb.b.getDisplayMetrics().density;
        aqa.a(2.5f * f2);
        aqa.q = 7.5f * f2;
        aqa.a(0);
        aqa.r = (int) (10.0f * f2);
        aqa.s = (int) (f2 * 5.0f);
        aqb.invalidateSelf();
        this.e.setImageDrawable(this.j);
        this.e.setVisibility(8);
        addView(this.e);
        setChildrenDrawingOrderEnabled(true);
        int i2 = (int) (displayMetrics.density * 64.0f);
        this.i = i2;
        this.p = (float) i2;
        this.r = new pp();
        this.s = new pm(this);
        setNestedScrollingEnabled(true);
        int i3 = -this.K;
        this.c = i3;
        this.h = i3;
        b(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private final void c(float f2) {
        int i2;
        this.j.a(true);
        float min = Math.min(1.0f, Math.abs(f2 / this.p));
        double d2 = (double) min;
        Double.isNaN(d2);
        float max = (((float) Math.max(d2 - 11.2d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f2) - this.p;
        if (this.l) {
            i2 = this.i - this.h;
        } else {
            i2 = this.i;
        }
        float f3 = (float) i2;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f3 + f3) / f3) / 4.0f);
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f4 = (float) (max2 - pow);
        float f5 = f4 + f4;
        float f6 = f3 * f5;
        int i3 = this.h + ((int) ((f3 * min) + f6 + f6));
        if (this.e.getVisibility() != 0) {
            this.e.setVisibility(0);
        }
        if (!this.d) {
            this.e.setScaleX(1.0f);
            this.e.setScaleY(1.0f);
        }
        if (this.d) {
            a(Math.min(1.0f, f2 / this.p));
        }
        if (f2 < this.p) {
            if (this.j.getAlpha() > 76 && !a(this.H)) {
                this.H = a(this.j.getAlpha(), 76);
            }
        } else if (this.j.getAlpha() < 255 && !a(this.I)) {
            this.I = a(this.j.getAlpha(), 255);
        }
        this.j.b(Math.min(0.8f, max * 0.8f));
        this.j.a(Math.min(1.0f, max));
        aqb aqb = this.j;
        aqb.a.g = (((max * 0.4f) - 16.0f) + f5 + f5) * 0.5f;
        aqb.invalidateSelf();
        a(i3 - this.c);
    }

    public final void b(int i2) {
        this.d = true;
        this.h = 0;
        this.i = i2;
        this.l = true;
        a();
        this.b = false;
    }

    public final void b(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    private final void a(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.B) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.B = motionEvent.getPointerId(i2);
        }
    }

    public final void b(int... iArr) {
        c();
        aqb aqb = this.j;
        aqb.a.a(iArr);
        aqb.a.a(0);
        aqb.invalidateSelf();
    }

    private final void a(boolean z2, boolean z3) {
        if (this.b != z2) {
            this.k = z3;
            c();
            this.b = z2;
            if (z2) {
                int i2 = this.c;
                Animation.AnimationListener animationListener = this.L;
                this.f = i2;
                this.M.reset();
                this.M.setDuration(200);
                this.M.setInterpolator(this.C);
                if (animationListener != null) {
                    this.e.a = animationListener;
                }
                this.e.clearAnimation();
                this.e.startAnimation(this.M);
                return;
            }
            a(this.L);
        }
    }

    public final boolean b() {
        View view = this.n;
        if (!(view instanceof ListView)) {
            return view.canScrollVertically(-1);
        }
        int i2 = Build.VERSION.SDK_INT;
        return ((ListView) view).canScrollList(-1);
    }

    private static final boolean a(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    public final void a() {
        this.e.clearAnimation();
        this.j.stop();
        this.e.setVisibility(8);
        this.e.getBackground().setAlpha(255);
        this.j.setAlpha(255);
        if (!this.d) {
            a(this.h - this.c);
        } else {
            a(0.0f);
        }
        this.c = this.e.getTop();
    }

    public final void a(float f2) {
        this.e.setScaleX(f2);
        this.e.setScaleY(f2);
    }

    public final void a(int i2) {
        this.e.bringToFront();
        qb.g(this.e, i2);
        this.c = this.e.getTop();
    }

    public final void a(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void a(View view, int i2, int i3, int i4, int i5, int i6) {
        a(view, i2, i3, i4, i5, i6, this.v);
    }

    public final void a(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        int i7;
        if (i6 == 0) {
            int i8 = iArr[1];
            this.s.a(i2, i3, i4, i5, this.u, 0, iArr);
            int i9 = i5 - (iArr[1] - i8);
            if (i9 == 0) {
                i7 = i5 + this.u[1];
            } else {
                i7 = i9;
            }
            if (i7 < 0 && !b()) {
                float abs = this.q + ((float) Math.abs(i7));
                this.q = abs;
                c(abs);
                iArr[1] = iArr[1] + i9;
            }
        }
    }

    public final void a(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    public final void a(Animation.AnimationListener animationListener) {
        aqe aqe = new aqe(this);
        this.G = aqe;
        aqe.setDuration(150);
        apx apx = this.e;
        apx.a = animationListener;
        apx.clearAnimation();
        this.e.startAnimation(this.G);
    }

    public final void a(boolean z2) {
        int i2;
        if (z2) {
            if (!this.b) {
                this.b = true;
                if (!this.l) {
                    i2 = this.i + this.h;
                } else {
                    i2 = this.i;
                }
                a(i2 - this.c);
                this.k = false;
                Animation.AnimationListener animationListener = this.L;
                this.e.setVisibility(0);
                this.j.setAlpha(255);
                aqd aqd = new aqd(this);
                this.F = aqd;
                aqd.setDuration((long) this.x);
                if (animationListener != null) {
                    this.e.a = animationListener;
                }
                this.e.clearAnimation();
                this.e.startAnimation(this.F);
                return;
            }
            z2 = true;
        }
        a(z2, false);
    }

    public final void a(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = kf.b(context, iArr[i2]);
        }
        b(iArr2);
    }

    public final boolean a(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            return onStartNestedScroll(view, view2, i2);
        }
        return false;
    }
}
