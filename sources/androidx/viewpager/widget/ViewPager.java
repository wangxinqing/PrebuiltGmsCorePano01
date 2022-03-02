package androidx.viewpager.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AbsSavedState;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.cast.JGCastService;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ViewPager extends ViewGroup {
    public static final int[] a = {16842931};
    private static final Comparator g = new ats();
    private static final Interpolator h = new att();
    private int A;
    private int B;
    private boolean C = true;
    private float D;
    private float E;
    private float F;
    private float G;
    private int H = -1;
    private VelocityTracker I;
    private int J;
    private int K;
    private int L;
    private int M;
    private EdgeEffect N;
    private EdgeEffect O;
    private boolean P = true;
    private boolean Q;
    private int R;
    private final Runnable S = new atu(this);
    private int T = 0;
    public atr b;
    public int c;
    public List d;
    public List e;
    private int f;
    private final ArrayList i = new ArrayList();
    private final atx j = new atx();
    private final Rect k = new Rect();
    private int l = -1;
    private Parcelable m = null;
    private ClassLoader n = null;
    private Scroller o;
    private boolean p;
    private aub q;
    private float r = -3.4028235E38f;
    private float s = Float.MAX_VALUE;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w = 1;
    private boolean x;
    private boolean y;
    private int z;

    public ViewPager(Context context) {
        super(context);
        a();
    }

    private final Rect a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view != null) {
            rect.left = view.getLeft();
            rect.right = view.getRight();
            rect.top = view.getTop();
            rect.bottom = view.getBottom();
            ViewParent parent = view.getParent();
            while ((parent instanceof ViewGroup) && parent != this) {
                ViewGroup viewGroup = (ViewGroup) parent;
                rect.left += viewGroup.getLeft();
                rect.right += viewGroup.getRight();
                rect.top += viewGroup.getTop();
                rect.bottom += viewGroup.getBottom();
                parent = viewGroup.getParent();
            }
            return rect;
        }
        rect.set(0, 0, 0, 0);
        return rect;
    }

    private final void b(boolean z2) {
        if (this.u != z2) {
            this.u = z2;
        }
    }

    private final int f() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private final boolean g() {
        this.H = -1;
        this.x = false;
        this.y = false;
        VelocityTracker velocityTracker = this.I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.I = null;
        }
        this.N.onRelease();
        this.O.onRelease();
        if (this.N.isFinished() || this.O.isFinished()) {
            return true;
        }
        return false;
    }

    private final atx h() {
        float f2;
        float f3;
        atx atx;
        int i2;
        int f4 = f();
        float f5 = 0.0f;
        if (f4 > 0) {
            f2 = ((float) getScrollX()) / ((float) f4);
        } else {
            f2 = 0.0f;
        }
        if (f4 > 0) {
            f3 = 0.0f / ((float) f4);
        } else {
            f3 = 0.0f;
        }
        atx atx2 = null;
        float f6 = 0.0f;
        int i3 = 0;
        boolean z2 = true;
        int i4 = -1;
        while (i3 < this.i.size()) {
            atx atx3 = (atx) this.i.get(i3);
            if (z2 || atx3.b == (i2 = i4 + 1)) {
                atx = atx3;
            } else {
                atx atx4 = this.j;
                atx4.e = f5 + f6 + f3;
                atx4.b = i2;
                atx4.d = 1.0f;
                i3--;
                atx = atx4;
            }
            f5 = atx.e;
            float f7 = atx.d + f5 + f3;
            if (!z2 && f2 < f5) {
                return atx2;
            }
            if (f2 < f7 || i3 == this.i.size() - 1) {
                return atx;
            }
            i4 = atx.b;
            i3++;
            z2 = false;
            atx2 = atx;
            f6 = atx.d;
        }
        return atx2;
    }

    private final void i() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        atx a2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.c) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (!isFocusable()) {
            return;
        }
        if (((i3 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public final void addTouchables(ArrayList arrayList) {
        atx a2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.c) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        boolean z2;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        aty aty = (aty) layoutParams;
        boolean z3 = aty.a;
        if (view.getClass().getAnnotation(atw.class) != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = z3 | z2;
        aty.a = z4;
        if (!this.t) {
            super.addView(view, i2, layoutParams);
        } else if (aty != null && z4) {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        } else {
            aty.d = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    public final void c() {
        c(this.c);
    }

    public final boolean canScrollHorizontally(int i2) {
        if (this.b != null) {
            int f2 = f();
            int scrollX = getScrollX();
            return i2 < 0 ? scrollX > ((int) (((float) f2) * this.r)) : i2 > 0 && scrollX < ((int) (((float) f2) * this.s));
        }
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof aty) && super.checkLayoutParams(layoutParams);
    }

    public final void computeScroll() {
        this.p = true;
        if (this.o.isFinished() || !this.o.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.o.getCurrX();
        int currY = this.o.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!g(currX)) {
                this.o.abortAnimation();
                scrollTo(0, currY);
            }
        }
        qb.e(this);
    }

    /* access modifiers changed from: package-private */
    public final atx d(int i2) {
        for (int i3 = 0; i3 < this.i.size(); i3++) {
            atx atx = (atx) this.i.get(i3);
            if (atx.b == i2) {
                return atx;
            }
        }
        return null;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                z2 = keyEvent.hasModifiers(2) ? d() : e(17);
            } else if (keyCode == 22) {
                z2 = keyEvent.hasModifiers(2) ? e() : e(66);
            } else if (keyCode != 61) {
                return false;
            } else {
                if (keyEvent.hasNoModifiers()) {
                    z2 = e(2);
                } else if (!keyEvent.hasModifiers(1)) {
                    return false;
                } else {
                    z2 = e(1);
                }
            }
            if (z2) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        atx a2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        boolean z2;
        atr atr;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (atr = this.b) == null || atr.a() <= 1)) {
            this.N.finish();
            this.O.finish();
            return;
        }
        if (!this.N.isFinished()) {
            int save = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((float) ((-height) + getPaddingTop()), this.r * ((float) width));
            this.N.setSize(height, width);
            z2 = this.N.draw(canvas);
            canvas.restoreToCount(save);
        } else {
            z2 = false;
        }
        if (!this.O.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate((float) (-getPaddingTop()), (-(this.s + 1.0f)) * ((float) width2));
            this.O.setSize((height2 - paddingTop) - paddingBottom, width2);
            z2 |= this.O.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (z2) {
            qb.e(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        atr atr = this.b;
        if (atr == null || this.c >= atr.a() - 1) {
            return false;
        }
        f(this.c + 1);
        return true;
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new aty();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new aty(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public final int getChildDrawingOrder(int i2, int i3) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P = true;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        removeCallbacks(this.S);
        Scroller scroller = this.o;
        if (scroller != null && !scroller.isFinished()) {
            this.o.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f2;
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            g();
            return false;
        }
        if (action != 0) {
            if (this.x) {
                return true;
            }
            if (this.y) {
                return false;
            }
        }
        if (action == 0) {
            float x2 = motionEvent.getX();
            this.F = x2;
            this.D = x2;
            float y2 = motionEvent.getY();
            this.G = y2;
            this.E = y2;
            this.H = motionEvent2.getPointerId(0);
            this.y = false;
            this.p = true;
            this.o.computeScrollOffset();
            if (this.T != 2 || Math.abs(this.o.getFinalX() - this.o.getCurrX()) <= this.M) {
                a(false);
                this.x = false;
            } else {
                this.o.abortAnimation();
                this.v = false;
                c();
                this.x = true;
                i();
                a(1);
            }
        } else if (action == 2) {
            int i2 = this.H;
            if (i2 != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i2);
                float x3 = motionEvent2.getX(findPointerIndex);
                float f3 = x3 - this.D;
                float abs = Math.abs(f3);
                float y3 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y3 - this.G);
                if (f3 != 0.0f) {
                    float f4 = this.D;
                    if (this.C || ((f4 >= ((float) this.A) || f3 <= 0.0f) && (f4 <= ((float) (getWidth() - this.A)) || f3 >= 0.0f))) {
                        if (a(this, false, (int) f3, (int) x3, (int) y3)) {
                            this.D = x3;
                            this.E = y3;
                            this.y = true;
                            return false;
                        }
                    }
                }
                float f5 = (float) this.B;
                if (abs > f5 && abs * 0.5f > abs2) {
                    this.x = true;
                    i();
                    a(1);
                    if (f3 <= 0.0f) {
                        f2 = this.F - ((float) this.B);
                    } else {
                        f2 = this.F + ((float) this.B);
                    }
                    this.D = f2;
                    this.E = y3;
                    b(true);
                } else if (abs2 > f5) {
                    this.y = true;
                }
                if (this.x && a(x3)) {
                    qb.e(this);
                }
            }
        } else if (action == 6) {
            a(motionEvent);
        }
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(motionEvent2);
        return this.x;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        atx a2;
        int i6;
        int i7;
        int childCount = getChildCount();
        int i8 = i4 - i2;
        int i9 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        boolean z3 = false;
        int i10 = 0;
        int i11 = 0;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                aty aty = (aty) childAt.getLayoutParams();
                if (aty.a) {
                    int i12 = aty.b;
                    int i13 = i12 & 112;
                    int i14 = i12 & 7;
                    if (i14 == 1) {
                        i6 = paddingLeft;
                        paddingLeft = Math.max((i8 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else if (i14 == 3) {
                        i6 = childAt.getMeasuredWidth() + paddingLeft;
                    } else if (i14 != 5) {
                        i6 = paddingLeft;
                    } else {
                        int measuredWidth = (i8 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                        int i15 = measuredWidth;
                        i6 = paddingLeft;
                        paddingLeft = i15;
                    }
                    if (i13 == 16) {
                        i7 = paddingTop;
                        paddingTop = Math.max((i9 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    } else if (i13 == 48) {
                        i7 = childAt.getMeasuredHeight() + paddingTop;
                    } else if (i13 != 80) {
                        i7 = paddingTop;
                    } else {
                        int measuredHeight = (i9 - paddingBottom) - childAt.getMeasuredHeight();
                        paddingBottom += childAt.getMeasuredHeight();
                        int i16 = measuredHeight;
                        i7 = paddingTop;
                        paddingTop = i16;
                    }
                    int i17 = paddingLeft + scrollX;
                    childAt.layout(i17, paddingTop, childAt.getMeasuredWidth() + i17, paddingTop + childAt.getMeasuredHeight());
                    i11++;
                    paddingLeft = i6;
                    paddingTop = i7;
                }
            }
            i10++;
            z3 = false;
        }
        int i18 = (i8 - paddingLeft) - paddingRight;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8) {
                aty aty2 = (aty) childAt2.getLayoutParams();
                if (!aty2.a && (a2 = a(childAt2)) != null) {
                    float f2 = (float) i18;
                    int i20 = ((int) (a2.e * f2)) + paddingLeft;
                    if (aty2.d) {
                        aty2.d = z3;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f2 * aty2.c), JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec((i9 - paddingTop) - paddingBottom, JGCastService.FLAG_PRIVATE_DISPLAY));
                    }
                    childAt2.layout(i20, paddingTop, childAt2.getMeasuredWidth() + i20, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.R = i11;
        if (this.P) {
            a(this.c, z3, z3 ? 1 : 0, z3);
        }
        this.P = z3;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        aty aty;
        aty aty2;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3 = false;
        setMeasuredDimension(getDefaultSize(0, i2), getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.A = Math.min(measuredWidth / 10, this.z);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i8 = 0;
        while (true) {
            boolean z4 = true;
            int i9 = JGCastService.FLAG_PRIVATE_DISPLAY;
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            if (!(childAt.getVisibility() == 8 || (aty2 = (aty) childAt.getLayoutParams()) == null || !aty2.a)) {
                int i10 = aty2.b;
                int i11 = i10 & 7;
                int i12 = i10 & 112;
                if (i12 == 48 || i12 == 80) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!(i11 == 3 || i11 == 5)) {
                    z4 = false;
                }
                int i13 = Integer.MIN_VALUE;
                if (z2) {
                    i13 = JGCastService.FLAG_PRIVATE_DISPLAY;
                    i4 = Integer.MIN_VALUE;
                } else {
                    i4 = z4 ? JGCastService.FLAG_PRIVATE_DISPLAY : Integer.MIN_VALUE;
                }
                if (aty2.width == -2) {
                    i5 = i13;
                    i6 = paddingLeft;
                } else {
                    i6 = aty2.width != -1 ? aty2.width : paddingLeft;
                    i5 = JGCastService.FLAG_PRIVATE_DISPLAY;
                }
                if (aty2.height == -2) {
                    i7 = measuredHeight;
                    i9 = i4;
                } else {
                    i7 = aty2.height != -1 ? aty2.height : measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6, i5), View.MeasureSpec.makeMeasureSpec(i7, i9));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z4) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i8++;
            z3 = false;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, JGCastService.FLAG_PRIVATE_DISPLAY);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, JGCastService.FLAG_PRIVATE_DISPLAY);
        this.t = true;
        c();
        this.t = z3;
        int childCount2 = getChildCount();
        for (int i14 = z3; i14 < childCount2; i14++) {
            View childAt2 = getChildAt(i14);
            if (childAt2.getVisibility() != 8 && ((aty = (aty) childAt2.getLayoutParams()) == null || !aty.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) paddingLeft) * aty.c), JGCastService.FLAG_PRIVATE_DISPLAY), makeMeasureSpec);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        atx a2;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) == 0) {
            i4 = childCount - 1;
            i3 = -1;
        } else {
            i5 = childCount;
            i4 = 0;
            i3 = 1;
        }
        while (i4 != i5) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.c && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i4 += i3;
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.b);
        atr atr = this.b;
        if (atr != null) {
            atr.a(savedState.d, savedState.e);
            a(savedState.c, false, true);
            return;
        }
        this.l = savedState.c;
        this.m = savedState.d;
        this.n = savedState.e;
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = this.c;
        atr atr = this.b;
        if (atr != null) {
            savedState.d = atr.b();
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        float f2;
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4) {
            return;
        }
        if (i4 <= 0 || this.i.isEmpty()) {
            atx d2 = d(this.c);
            if (d2 != null) {
                f2 = Math.min(d2.e, this.s);
            } else {
                f2 = 0.0f;
            }
            int paddingLeft = (int) (f2 * ((float) ((i2 - getPaddingLeft()) - getPaddingRight())));
            if (paddingLeft != getScrollX()) {
                a(false);
                scrollTo(paddingLeft, getScrollY());
            }
        } else if (!this.o.isFinished()) {
            this.o.setFinalX(this.c * f());
        } else {
            int paddingLeft2 = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingLeft3 = getPaddingLeft();
            scrollTo((int) ((((float) getScrollX()) / ((float) ((i4 - paddingLeft3) - getPaddingRight()))) * ((float) ((i2 - paddingLeft2) - paddingRight))), getScrollY());
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        atr atr;
        boolean z2;
        float f2;
        float f3;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (atr = this.b) == null || atr.a() == 0) {
            return false;
        }
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (!this.x) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.H);
                        if (findPointerIndex == -1) {
                            z2 = g();
                        } else {
                            float x2 = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x2 - this.D);
                            float y2 = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y2 - this.E);
                            if (abs > ((float) this.B) && abs > abs2) {
                                this.x = true;
                                i();
                                float f4 = this.F;
                                if (x2 - f4 <= 0.0f) {
                                    f3 = f4 - ((float) this.B);
                                } else {
                                    f3 = f4 + ((float) this.B);
                                }
                                this.D = f3;
                                this.E = y2;
                                a(1);
                                b(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.x) {
                        z2 = a(motionEvent.getX(motionEvent.findPointerIndex(this.H)));
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.D = motionEvent.getX(actionIndex);
                        this.H = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        a(motionEvent);
                        this.D = motionEvent.getX(motionEvent.findPointerIndex(this.H));
                    }
                } else if (this.x) {
                    a(this.c, true, 0, false);
                    z2 = g();
                }
            } else if (this.x) {
                VelocityTracker velocityTracker = this.I;
                velocityTracker.computeCurrentVelocity(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, (float) this.K);
                int xVelocity = (int) velocityTracker.getXVelocity(this.H);
                this.v = true;
                int f5 = f();
                int scrollX = getScrollX();
                atx h2 = h();
                int i2 = h2.b;
                float f6 = (float) f5;
                float f7 = ((((float) scrollX) / f6) - h2.e) / (h2.d + (0.0f / f6));
                if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.H)) - this.F)) <= this.L || Math.abs(xVelocity) <= this.J) {
                    if (i2 >= this.c) {
                        f2 = 0.4f;
                    } else {
                        f2 = 0.6f;
                    }
                    i2 += (int) (f7 + f2);
                } else if (xVelocity <= 0) {
                    i2++;
                }
                if (this.i.size() > 0) {
                    ArrayList arrayList = this.i;
                    i2 = Math.max(((atx) this.i.get(0)).b, Math.min(i2, ((atx) arrayList.get(arrayList.size() - 1)).b));
                }
                a(i2, true, true, xVelocity);
                z2 = g();
            }
            if (z2) {
                qb.e(this);
            }
        } else {
            this.o.abortAnimation();
            this.v = false;
            c();
            float x3 = motionEvent.getX();
            this.F = x3;
            this.D = x3;
            float y3 = motionEvent.getY();
            this.G = y3;
            this.E = y3;
            this.H = motionEvent.getPointerId(0);
        }
        return true;
    }

    public final void removeView(View view) {
        if (this.t) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }

    public final void b() {
        boolean z2;
        int a2 = this.b.a();
        this.f = a2;
        int size = this.i.size();
        int i2 = this.w;
        if (size >= i2 + i2 + 1 || this.i.size() >= a2) {
            z2 = false;
        } else {
            z2 = true;
        }
        int i3 = this.c;
        int i4 = 0;
        boolean z3 = false;
        while (i4 < this.i.size()) {
            atx atx = (atx) this.i.get(i4);
            int a3 = this.b.a(atx.a);
            if (a3 != -1) {
                if (a3 == -2) {
                    this.i.remove(i4);
                    i4--;
                    if (!z3) {
                        this.b.a((ViewGroup) this);
                    }
                    this.b.a(this, atx.b, atx.a);
                    int i5 = this.c;
                    if (i5 == atx.b) {
                        i3 = Math.max(0, Math.min(i5, -1 + a2));
                    }
                    z2 = true;
                    z3 = true;
                } else {
                    int i6 = atx.b;
                    if (i6 != a3) {
                        if (i6 == this.c) {
                            i3 = a3;
                        }
                        atx.b = a3;
                        z2 = true;
                    }
                }
            }
            i4++;
        }
        if (z3) {
            this.b.d();
        }
        Collections.sort(this.i, g);
        if (z2) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                aty aty = (aty) getChildAt(i7).getLayoutParams();
                if (!aty.a) {
                    aty.c = 0.0f;
                }
            }
            a(i3, false, true);
            requestLayout();
        }
    }

    /* JADX WARNING: type inference failed for: r2v10, types: [android.view.ViewParent] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (r9 == r10) goto L_0x005e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            int r2 = r1.c
            if (r2 == r0) goto L_0x000f
            atx r2 = r1.d(r2)
            r1.c = r0
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            atr r0 = r1.b
            if (r0 == 0) goto L_0x03bd
            boolean r0 = r1.v
            if (r0 != 0) goto L_0x03bd
            android.os.IBinder r0 = r22.getWindowToken()
            if (r0 == 0) goto L_0x03bd
            atr r0 = r1.b
            r0.a((android.view.ViewGroup) r1)
            int r0 = r1.w
            int r4 = r1.c
            int r4 = r4 - r0
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            atr r6 = r1.b
            int r6 = r6.a()
            int r7 = r6 + -1
            int r8 = r1.c
            int r8 = r8 + r0
            int r0 = java.lang.Math.min(r7, r8)
            int r7 = r1.f
            if (r6 != r7) goto L_0x0364
            r7 = 0
        L_0x0041:
            java.util.ArrayList r8 = r1.i
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x005d
            java.util.ArrayList r8 = r1.i
            java.lang.Object r8 = r8.get(r7)
            atx r8 = (defpackage.atx) r8
            int r9 = r8.b
            int r10 = r1.c
            if (r9 >= r10) goto L_0x005a
            int r7 = r7 + 1
            goto L_0x0041
        L_0x005a:
            if (r9 != r10) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r8 = 0
        L_0x005e:
            if (r8 == 0) goto L_0x0061
            goto L_0x0069
        L_0x0061:
            if (r6 <= 0) goto L_0x0069
            int r8 = r1.c
            atx r8 = r1.a((int) r8, (int) r7)
        L_0x0069:
            r9 = 0
            if (r8 != 0) goto L_0x006e
            goto L_0x0285
        L_0x006e:
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x007b
            java.util.ArrayList r11 = r1.i
            java.lang.Object r11 = r11.get(r10)
            atx r11 = (defpackage.atx) r11
            goto L_0x007c
        L_0x007b:
            r11 = 0
        L_0x007c:
            int r12 = r22.f()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 <= 0) goto L_0x0091
            float r14 = r8.d
            float r14 = r13 - r14
            int r15 = r22.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r14 = r14 + r15
            goto L_0x0092
        L_0x0091:
            r14 = 0
        L_0x0092:
            int r3 = r1.c
            int r3 = r3 + -1
            r15 = 0
        L_0x0097:
            if (r3 >= 0) goto L_0x009a
            goto L_0x00cd
        L_0x009a:
            int r16 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x032d
            if (r3 >= r4) goto L_0x032d
            if (r11 == 0) goto L_0x00cd
            int r5 = r11.b
            if (r3 == r5) goto L_0x00a8
            goto L_0x035f
        L_0x00a8:
            boolean r5 = r11.c
            if (r5 != 0) goto L_0x00cb
            java.util.ArrayList r5 = r1.i
            r5.remove(r10)
            atr r5 = r1.b
            java.lang.Object r11 = r11.a
            r5.a(r1, r3, r11)
            int r10 = r10 + -1
            int r7 = r7 + -1
            if (r10 < 0) goto L_0x00c7
            java.util.ArrayList r5 = r1.i
            java.lang.Object r5 = r5.get(r10)
            atx r5 = (defpackage.atx) r5
            goto L_0x00c8
        L_0x00c7:
            r5 = 0
        L_0x00c8:
            r11 = r5
            goto L_0x035f
        L_0x00cb:
            goto L_0x035f
        L_0x00cd:
            float r3 = r8.d
            int r5 = r7 + 1
            int r4 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x016f
            java.util.ArrayList r4 = r1.i
            int r4 = r4.size()
            if (r5 >= r4) goto L_0x00e6
            java.util.ArrayList r4 = r1.i
            java.lang.Object r4 = r4.get(r5)
            atx r4 = (defpackage.atx) r4
            goto L_0x00e7
        L_0x00e6:
            r4 = 0
        L_0x00e7:
            if (r12 <= 0) goto L_0x00f2
            int r10 = r22.getPaddingRight()
            float r10 = (float) r10
            float r11 = (float) r12
            float r10 = r10 / r11
            float r10 = r10 + r13
            goto L_0x00f3
        L_0x00f2:
            r10 = 0
        L_0x00f3:
            int r11 = r1.c
            int r11 = r11 + 1
            r12 = r5
        L_0x00f8:
            if (r11 < r6) goto L_0x00fc
            goto L_0x016f
        L_0x00fc:
            int r13 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r13 < 0) goto L_0x012c
            if (r11 <= r0) goto L_0x012c
            if (r4 == 0) goto L_0x016f
            int r13 = r4.b
            if (r11 == r13) goto L_0x0109
            goto L_0x016c
        L_0x0109:
            boolean r13 = r4.c
            if (r13 != 0) goto L_0x012b
            java.util.ArrayList r13 = r1.i
            r13.remove(r12)
            atr r13 = r1.b
            java.lang.Object r4 = r4.a
            r13.a(r1, r11, r4)
            java.util.ArrayList r4 = r1.i
            int r4 = r4.size()
            if (r12 >= r4) goto L_0x012a
            java.util.ArrayList r4 = r1.i
            java.lang.Object r4 = r4.get(r12)
            atx r4 = (defpackage.atx) r4
            goto L_0x012b
        L_0x012a:
            r4 = 0
        L_0x012b:
            goto L_0x016c
        L_0x012c:
            if (r4 != 0) goto L_0x012f
            goto L_0x014b
        L_0x012f:
            int r13 = r4.b
            if (r11 != r13) goto L_0x014b
            float r4 = r4.d
            float r3 = r3 + r4
            int r12 = r12 + 1
            java.util.ArrayList r4 = r1.i
            int r4 = r4.size()
            if (r12 >= r4) goto L_0x0149
            java.util.ArrayList r4 = r1.i
            java.lang.Object r4 = r4.get(r12)
            atx r4 = (defpackage.atx) r4
            goto L_0x016c
        L_0x0149:
            r4 = 0
            goto L_0x016c
        L_0x014b:
            int r4 = r12 + 1
            atx r12 = r1.a((int) r11, (int) r12)
            float r12 = r12.d
            float r3 = r3 + r12
            java.util.ArrayList r12 = r1.i
            int r12 = r12.size()
            if (r4 >= r12) goto L_0x016a
            java.util.ArrayList r12 = r1.i
            java.lang.Object r12 = r12.get(r4)
            atx r12 = (defpackage.atx) r12
            r21 = r12
            r12 = r4
            r4 = r21
            goto L_0x016c
        L_0x016a:
            r12 = r4
            r4 = 0
        L_0x016c:
            int r11 = r11 + 1
            goto L_0x00f8
        L_0x016f:
            atr r0 = r1.b
            int r0 = r0.a()
            int r3 = r22.f()
            if (r3 <= 0) goto L_0x0181
            float r3 = (float) r3
            float r3 = r9 / r3
            r16 = r3
            goto L_0x0183
        L_0x0181:
            r16 = 0
        L_0x0183:
            r17 = 1065353216(0x3f800000, float:1.0)
            if (r2 != 0) goto L_0x0189
            goto L_0x021f
        L_0x0189:
            int r3 = r2.b
            int r4 = r8.b
            if (r3 >= r4) goto L_0x01dc
            float r4 = r2.e
            float r2 = r2.d
            float r4 = r4 + r2
            float r4 = r4 + r16
            int r3 = r3 + 1
            r2 = 0
        L_0x0199:
            int r6 = r8.b
            if (r3 > r6) goto L_0x021f
            java.util.ArrayList r6 = r1.i
            int r6 = r6.size()
            if (r2 >= r6) goto L_0x021f
            java.util.ArrayList r6 = r1.i
            java.lang.Object r6 = r6.get(r2)
            atx r6 = (defpackage.atx) r6
        L_0x01ad:
            int r10 = r6.b
            if (r3 <= r10) goto L_0x01c7
            java.util.ArrayList r10 = r1.i
            int r10 = r10.size()
            int r10 = r10 + -1
            if (r2 >= r10) goto L_0x01c6
            int r2 = r2 + 1
            java.util.ArrayList r6 = r1.i
            java.lang.Object r6 = r6.get(r2)
            atx r6 = (defpackage.atx) r6
            goto L_0x01ad
        L_0x01c6:
            goto L_0x01c8
        L_0x01c7:
        L_0x01c8:
            int r10 = r6.b
            if (r3 < r10) goto L_0x01d6
            r6.e = r4
            float r6 = r6.d
            float r6 = r6 + r16
            float r4 = r4 + r6
            int r3 = r3 + 1
            goto L_0x0199
        L_0x01d6:
            float r10 = r16 + r17
            float r4 = r4 + r10
            int r3 = r3 + 1
            goto L_0x01c8
        L_0x01dc:
            if (r3 <= r4) goto L_0x021f
            java.util.ArrayList r4 = r1.i
            int r4 = r4.size()
            int r4 = r4 + -1
            float r2 = r2.e
            int r3 = r3 + -1
        L_0x01ea:
            int r6 = r8.b
            if (r3 < r6) goto L_0x021f
            if (r4 < 0) goto L_0x021f
            java.util.ArrayList r6 = r1.i
            java.lang.Object r6 = r6.get(r4)
            atx r6 = (defpackage.atx) r6
        L_0x01f8:
            int r10 = r6.b
            if (r3 < r10) goto L_0x01fd
            goto L_0x020b
        L_0x01fd:
            if (r4 <= 0) goto L_0x020a
            int r4 = r4 + -1
            java.util.ArrayList r6 = r1.i
            java.lang.Object r6 = r6.get(r4)
            atx r6 = (defpackage.atx) r6
            goto L_0x01f8
        L_0x020a:
        L_0x020b:
            int r10 = r6.b
            if (r3 > r10) goto L_0x0219
            float r10 = r6.d
            float r10 = r10 + r16
            float r2 = r2 - r10
            r6.e = r2
            int r3 = r3 + -1
            goto L_0x01ea
        L_0x0219:
            float r10 = r16 + r17
            float r2 = r2 - r10
            int r3 = r3 + -1
            goto L_0x020b
        L_0x021f:
            java.util.ArrayList r2 = r1.i
            int r2 = r2.size()
            float r3 = r8.e
            int r4 = r8.b
            int r6 = r4 + -1
            if (r4 != 0) goto L_0x022f
            r10 = r3
            goto L_0x0232
        L_0x022f:
            r10 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x0232:
            r1.r = r10
            int r0 = r0 + -1
            r18 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r4 != r0) goto L_0x0240
            float r4 = r8.d
            float r4 = r4 + r3
            float r4 = r4 + r18
            goto L_0x0243
        L_0x0240:
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L_0x0243:
            r1.s = r4
            int r7 = r7 + -1
        L_0x0247:
            if (r7 >= 0) goto L_0x0309
            float r3 = r8.e
            float r4 = r8.d
            float r3 = r3 + r4
            float r3 = r3 + r16
            int r4 = r8.b
            int r4 = r4 + 1
        L_0x0254:
            if (r5 >= r2) goto L_0x027e
            java.util.ArrayList r6 = r1.i
            java.lang.Object r6 = r6.get(r5)
            atx r6 = (defpackage.atx) r6
        L_0x025e:
            int r7 = r6.b
            if (r4 >= r7) goto L_0x0268
            int r4 = r4 + 1
            float r7 = r16 + r17
            float r3 = r3 + r7
            goto L_0x025e
        L_0x0268:
            if (r7 == r0) goto L_0x026b
            goto L_0x0272
        L_0x026b:
            float r7 = r6.d
            float r7 = r7 + r3
            float r7 = r7 + r18
            r1.s = r7
        L_0x0272:
            r6.e = r3
            float r6 = r6.d
            float r6 = r6 + r16
            float r3 = r3 + r6
            int r5 = r5 + 1
            int r4 = r4 + 1
            goto L_0x0254
        L_0x027e:
            atr r0 = r1.b
            java.lang.Object r2 = r8.a
            r0.b(r2)
        L_0x0285:
            atr r0 = r1.b
            r0.d()
            int r0 = r22.getChildCount()
            r2 = 0
        L_0x028f:
            if (r2 >= r0) goto L_0x02b9
            android.view.View r3 = r1.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            aty r4 = (defpackage.aty) r4
            r4.f = r2
            boolean r5 = r4.a
            if (r5 == 0) goto L_0x02a2
        L_0x02a1:
            goto L_0x02b6
        L_0x02a2:
            float r5 = r4.c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x02a1
            atx r3 = r1.a((android.view.View) r3)
            if (r3 == 0) goto L_0x02b6
            float r5 = r3.d
            r4.c = r5
            int r3 = r3.b
            r4.e = r3
        L_0x02b6:
            int r2 = r2 + 1
            goto L_0x028f
        L_0x02b9:
            boolean r0 = r22.hasFocus()
            if (r0 == 0) goto L_0x0308
            android.view.View r0 = r22.findFocus()
            if (r0 == 0) goto L_0x02da
        L_0x02c5:
            android.view.ViewParent r2 = r0.getParent()
            if (r2 == r1) goto L_0x02d5
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto L_0x02d3
            r0 = r2
            android.view.View r0 = (android.view.View) r0
            goto L_0x02c5
        L_0x02d3:
            r3 = 0
            goto L_0x02db
        L_0x02d5:
            atx r3 = r1.a((android.view.View) r0)
            goto L_0x02db
        L_0x02da:
            r3 = 0
        L_0x02db:
            if (r3 == 0) goto L_0x02e5
            int r0 = r3.b
            int r2 = r1.c
            if (r0 == r2) goto L_0x0308
            r5 = 0
            goto L_0x02e6
        L_0x02e5:
            r5 = 0
        L_0x02e6:
            int r0 = r22.getChildCount()
            if (r5 >= r0) goto L_0x0308
            android.view.View r0 = r1.getChildAt(r5)
            atx r2 = r1.a((android.view.View) r0)
            if (r2 != 0) goto L_0x02f7
        L_0x02f6:
            goto L_0x0305
        L_0x02f7:
            int r2 = r2.b
            int r3 = r1.c
            if (r2 != r3) goto L_0x02f6
            r2 = 2
            boolean r0 = r0.requestFocus(r2)
            if (r0 == 0) goto L_0x0305
            goto L_0x0308
        L_0x0305:
            int r5 = r5 + 1
            goto L_0x02e6
        L_0x0308:
            return
        L_0x0309:
            java.util.ArrayList r4 = r1.i
            java.lang.Object r4 = r4.get(r7)
            atx r4 = (defpackage.atx) r4
        L_0x0311:
            int r10 = r4.b
            if (r6 <= r10) goto L_0x031b
            int r6 = r6 + -1
            float r10 = r16 + r17
            float r3 = r3 - r10
            goto L_0x0311
        L_0x031b:
            float r11 = r4.d
            float r11 = r11 + r16
            float r3 = r3 - r11
            r4.e = r3
            if (r10 == 0) goto L_0x0325
            goto L_0x0327
        L_0x0325:
            r1.r = r3
        L_0x0327:
            int r7 = r7 + -1
            int r6 = r6 + -1
            goto L_0x0247
        L_0x032d:
            if (r11 != 0) goto L_0x0330
            goto L_0x0347
        L_0x0330:
            int r5 = r11.b
            if (r3 != r5) goto L_0x0347
            float r5 = r11.d
            float r15 = r15 + r5
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x0345
            java.util.ArrayList r5 = r1.i
            java.lang.Object r5 = r5.get(r10)
            atx r5 = (defpackage.atx) r5
            r11 = r5
            goto L_0x035f
        L_0x0345:
            r11 = 0
            goto L_0x035f
        L_0x0347:
            int r5 = r10 + 1
            atx r5 = r1.a((int) r3, (int) r5)
            float r5 = r5.d
            float r15 = r15 + r5
            int r7 = r7 + 1
            if (r10 < 0) goto L_0x035d
            java.util.ArrayList r5 = r1.i
            java.lang.Object r5 = r5.get(r10)
            atx r5 = (defpackage.atx) r5
            goto L_0x035e
        L_0x035d:
            r5 = 0
        L_0x035e:
            r11 = r5
        L_0x035f:
            int r3 = r3 + -1
            r5 = 0
            goto L_0x0097
        L_0x0364:
            android.content.res.Resources r0 = r22.getResources()     // Catch:{ NotFoundException -> 0x0371 }
            int r2 = r22.getId()     // Catch:{ NotFoundException -> 0x0371 }
            java.lang.String r0 = r0.getResourceName(r2)     // Catch:{ NotFoundException -> 0x0371 }
            goto L_0x037a
        L_0x0371:
            r0 = move-exception
            int r0 = r22.getId()
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
        L_0x037a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r1.f
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " Pager class: "
            r3.append(r0)
            java.lang.Class r0 = r22.getClass()
            r3.append(r0)
            java.lang.String r0 = " Problematic adapter: "
            r3.append(r0)
            atr r0 = r1.b
            java.lang.Class r0 = r0.getClass()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x03bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.c(int):void");
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        int i2 = this.c;
        if (i2 <= 0) {
            return false;
        }
        f(i2 - 1);
        return true;
    }

    public final boolean e(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        } else if (findFocus != null) {
            ViewParent parent = findFocus.getParent();
            while (true) {
                if (parent instanceof ViewGroup) {
                    if (parent == this) {
                        break;
                    }
                    parent = parent.getParent();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                    findFocus = null;
                }
            }
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        boolean z2 = false;
        if (findNextFocus == null || findNextFocus == findFocus) {
            if (i2 == 17 || i2 == 1) {
                z2 = d();
            } else if (i2 == 66 || i2 == 2) {
                z2 = e();
            }
        } else if (i2 == 17) {
            z2 = (findFocus != null && a(this.k, findNextFocus).left >= a(this.k, findFocus).left) ? d() : findNextFocus.requestFocus();
        } else if (i2 == 66) {
            z2 = (findFocus != null && a(this.k, findNextFocus).left <= a(this.k, findFocus).left) ? e() : findNextFocus.requestFocus();
        }
        if (z2) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return z2;
    }

    public final void f(int i2) {
        this.v = false;
        a(i2, true, false);
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new auc();
        int c;
        Parcelable d;
        ClassLoader e;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.c = parcel.readInt();
            this.d = parcel.readParcelable(classLoader);
            this.e = classLoader;
        }

        public final String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.c + "}";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeParcelable(this.d, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private final boolean g(int i2) {
        if (this.i.size() != 0) {
            atx h2 = h();
            int f2 = f();
            int i3 = h2.b;
            float f3 = (float) f2;
            float f4 = h2.e;
            float f5 = h2.d;
            this.Q = false;
            a(i3, ((((float) i2) / f3) - f4) / (f5 + (0.0f / f3)));
            if (this.Q) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.P) {
            return false;
        } else {
            this.Q = false;
            a(0, 0.0f);
            if (this.Q) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    private final void a(int i2, boolean z2, int i3, boolean z3) {
        int i4;
        int i5;
        atx d2 = d(i2);
        int f2 = d2 != null ? (int) (((float) f()) * Math.max(this.r, Math.min(d2.e, this.s))) : 0;
        if (z2) {
            if (getChildCount() != 0) {
                Scroller scroller = this.o;
                if (scroller != null && !scroller.isFinished()) {
                    int startX = !this.p ? this.o.getStartX() : this.o.getCurrX();
                    this.o.abortAnimation();
                    b(false);
                    i4 = startX;
                } else {
                    i4 = getScrollX();
                }
                int scrollY = getScrollY();
                int i6 = f2 - i4;
                int i7 = -scrollY;
                if (i6 == 0 && i7 == 0) {
                    a(false);
                    c();
                    a(0);
                } else {
                    b(true);
                    a(2);
                    int f3 = f();
                    float f4 = (float) (f3 / 2);
                    float f5 = (float) f3;
                    float sin = f4 + (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i6)) / f5) - 8.0f) * 0.47123894f))) * f4);
                    int abs = Math.abs(i3);
                    if (abs > 0) {
                        i5 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
                    } else {
                        i5 = (int) (((((float) Math.abs(i6)) / (f5 + 0.0f)) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(i5, 600);
                    this.p = false;
                    this.o.startScroll(i4, scrollY, i6, i7, min);
                    qb.e(this);
                }
            } else {
                b(false);
            }
            if (z3) {
                h(i2);
                return;
            }
            return;
        }
        if (z3) {
            h(i2);
        }
        a(false);
        scrollTo(f2, 0);
        g(f2);
    }

    private final void h(int i2) {
        List list = this.d;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                aua aua = (aua) this.d.get(i3);
                if (aua != null) {
                    aua.a(i2);
                }
            }
        }
    }

    public final void b(int i2) {
        this.v = false;
        a(i2, !this.P, false);
    }

    private final void a(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.H) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.D = motionEvent.getX(i2);
            this.H = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.I;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private final void a(boolean z2) {
        boolean z3;
        if (this.T == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            b(false);
            if (!this.o.isFinished()) {
                this.o.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.o.getCurrX();
                int currY = this.o.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (scrollX != currX) {
                        g(currX);
                    }
                }
            }
        }
        this.v = false;
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            atx atx = (atx) this.i.get(i2);
            if (atx.c) {
                atx.c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (!z2) {
            this.S.run();
        } else {
            qb.a((View) this, this.S);
        }
    }

    private final boolean a(float f2) {
        boolean z2;
        boolean z3;
        float f3 = this.D;
        this.D = f2;
        float scrollX = ((float) getScrollX()) + (f3 - f2);
        float f4 = (float) f();
        float f5 = this.r * f4;
        float f6 = this.s * f4;
        boolean z4 = false;
        atx atx = (atx) this.i.get(0);
        ArrayList arrayList = this.i;
        atx atx2 = (atx) arrayList.get(arrayList.size() - 1);
        if (atx.b != 0) {
            f5 = atx.e * f4;
            z2 = false;
        } else {
            z2 = true;
        }
        if (atx2.b != this.b.a() - 1) {
            f6 = atx2.e * f4;
            z3 = false;
        } else {
            z3 = true;
        }
        if (scrollX < f5) {
            if (z2) {
                this.N.onPull(Math.abs(f5 - scrollX) / f4);
                z4 = true;
            }
            scrollX = f5;
        } else if (scrollX > f6) {
            if (z3) {
                this.O.onPull(Math.abs(scrollX - f6) / f4);
                z4 = true;
            }
            scrollX = f6;
        }
        int i2 = (int) scrollX;
        this.D += scrollX - ((float) i2);
        scrollTo(i2, getScrollY());
        g(i2);
        return z4;
    }

    /* access modifiers changed from: package-private */
    public final atx a(int i2, int i3) {
        atx atx = new atx();
        atx.b = i2;
        atx.a = this.b.a((ViewGroup) this, i2);
        atx.d = 1.0f;
        if (i3 < 0 || i3 >= this.i.size()) {
            this.i.add(atx);
        } else {
            this.i.add(i3, atx);
        }
        return atx;
    }

    /* access modifiers changed from: package-private */
    public final atx a(View view) {
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            atx atx = (atx) this.i.get(i2);
            if (this.b.a(view, atx.a)) {
                return atx;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.o = new Scroller(context, h);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.B = viewConfiguration.getScaledPagingTouchSlop();
        this.J = (int) (400.0f * f2);
        this.K = viewConfiguration.getScaledMaximumFlingVelocity();
        this.N = new EdgeEffect(context);
        this.O = new EdgeEffect(context);
        this.L = (int) (25.0f * f2);
        this.M = (int) (f2 + f2);
        this.z = (int) (f2 * 16.0f);
        qb.a((View) this, (oz) new atz(this));
        if (qb.f(this) == 0) {
            qb.b((View) this, 1);
        }
        qb.a((View) this, (pq) new atv(this));
    }

    public final void a(int i2) {
        if (this.T != i2) {
            this.T = i2;
            List list = this.d;
            if (list != null) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    aua aua = (aua) this.d.get(i3);
                    if (aua != null) {
                        aua.b(i2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, float f2) {
        int i3;
        if (this.R > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                aty aty = (aty) childAt.getLayoutParams();
                if (aty.a) {
                    int i5 = aty.b & 7;
                    if (i5 == 1) {
                        i3 = paddingLeft;
                        paddingLeft = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else if (i5 == 3) {
                        i3 = childAt.getWidth() + paddingLeft;
                    } else if (i5 != 5) {
                        i3 = paddingLeft;
                    } else {
                        int measuredWidth = (width - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                        int i6 = measuredWidth;
                        i3 = paddingLeft;
                        paddingLeft = i6;
                    }
                    int left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = i3;
                }
            }
        }
        List list = this.d;
        if (list != null) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                aua aua = (aua) this.d.get(i7);
                if (aua != null) {
                    aua.a(i2, f2);
                }
            }
        }
        this.Q = true;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, boolean z2, boolean z3) {
        a(i2, z2, z3, 0);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e A[LOOP:0: B:22:0x0046->B:24:0x004e, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r5, boolean r6, boolean r7, int r8) {
        /*
            r4 = this;
            atr r0 = r4.b
            r1 = 0
            if (r0 == 0) goto L_0x0078
            int r0 = r0.a()
            if (r0 > 0) goto L_0x000d
            goto L_0x0078
        L_0x000d:
            if (r7 != 0) goto L_0x0021
            int r7 = r4.c
            if (r7 != r5) goto L_0x0021
            java.util.ArrayList r7 = r4.i
            int r7 = r7.size()
            if (r7 != 0) goto L_0x001c
            goto L_0x0021
        L_0x001c:
            r4.b((boolean) r1)
            return
        L_0x0021:
            if (r5 < 0) goto L_0x0035
            atr r7 = r4.b
            int r7 = r7.a()
            if (r5 >= r7) goto L_0x002c
            goto L_0x0036
        L_0x002c:
            atr r5 = r4.b
            int r5 = r5.a()
            int r5 = r5 + -1
            goto L_0x0036
        L_0x0035:
            r5 = 0
        L_0x0036:
            int r7 = r4.w
            int r0 = r4.c
            int r2 = r0 + r7
            r3 = 1
            if (r5 > r2) goto L_0x0045
            int r0 = r0 - r7
            if (r5 < r0) goto L_0x0043
            goto L_0x005b
        L_0x0043:
            r7 = 0
            goto L_0x0046
        L_0x0045:
            r7 = 0
        L_0x0046:
            java.util.ArrayList r0 = r4.i
            int r0 = r0.size()
            if (r7 >= r0) goto L_0x005b
            java.util.ArrayList r0 = r4.i
            java.lang.Object r0 = r0.get(r7)
            atx r0 = (defpackage.atx) r0
            r0.c = r3
            int r7 = r7 + 1
            goto L_0x0046
        L_0x005b:
            int r7 = r4.c
            if (r7 == r5) goto L_0x0061
            r1 = 1
            goto L_0x0062
        L_0x0061:
        L_0x0062:
            boolean r7 = r4.P
            if (r7 == 0) goto L_0x0071
            r4.c = r5
            if (r1 == 0) goto L_0x006d
            r4.h(r5)
        L_0x006d:
            r4.requestLayout()
            return
        L_0x0071:
            r4.c(r5)
            r4.a((int) r5, (boolean) r6, (int) r8, (boolean) r1)
            return
        L_0x0078:
            r4.b((boolean) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.a(int, boolean, boolean, int):void");
    }

    public final void a(atr atr) {
        atr atr2 = this.b;
        if (atr2 != null) {
            atr2.a((DataSetObserver) null);
            this.b.a((ViewGroup) this);
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                atx atx = (atx) this.i.get(i2);
                this.b.a(this, atx.b, atx.a);
            }
            this.b.d();
            this.i.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((aty) getChildAt(i3).getLayoutParams()).a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.c = 0;
            scrollTo(0, 0);
        }
        this.b = atr;
        this.f = 0;
        if (atr != null) {
            if (this.q == null) {
                this.q = new aub(this);
            }
            this.b.a((DataSetObserver) this.q);
            this.v = false;
            boolean z2 = this.P;
            this.P = true;
            this.f = this.b.a();
            if (this.l >= 0) {
                this.b.a(this.m, this.n);
                a(this.l, false, true);
                this.l = -1;
                this.m = null;
                this.n = null;
            } else if (z2) {
                requestLayout();
            } else {
                c();
            }
        }
        List list = this.e;
        if (list != null && !list.isEmpty()) {
            int size = this.e.size();
            for (int i4 = 0; i4 < size; i4++) {
                akbf akbf = (akbf) this.e.get(i4);
                TabLayout tabLayout = akbf.b;
                if (tabLayout.z == this) {
                    tabLayout.a(atr, akbf.a);
                }
            }
        }
    }

    public final void a(aua aua) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(aua);
    }

    /* access modifiers changed from: protected */
    public final boolean a(View view, boolean z2, int i2, int i3, int i4) {
        int i5;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom()) {
                    if (a(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (!z2 || !view.canScrollHorizontally(-i2)) {
            return false;
        }
        return true;
    }
}
