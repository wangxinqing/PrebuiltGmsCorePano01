package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.google.android.cast.JGCastService;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NestedScrollView extends FrameLayout implements po, pl {
    private static final ru x = new ru();
    private static final int[] y = {16843130};
    private final pm A;
    private float B;
    public si a;
    private long b;
    private final Rect c;
    private OverScroller d;
    private EdgeEffect e;
    private EdgeEffect f;
    private int g;
    private boolean h;
    private boolean i;
    private View j;
    private boolean k;
    private VelocityTracker l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private final int[] s;
    private final int[] t;
    private int u;
    private int v;
    private SavedState w;
    private final pp z;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new rv();
        public int a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }

        public final String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.a + "}";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NestedScrollView(Context context) {
        this(context, (AttributeSet) null);
    }

    private final void a(int i2, int i3, boolean z2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.b > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight();
                int i4 = layoutParams.topMargin;
                int i5 = layoutParams.bottomMargin;
                int height2 = getHeight();
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int scrollY = getScrollY();
                this.d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, ((height + i4) + i5) - ((height2 - paddingTop) - paddingBottom)))) - scrollY, 250);
                a(z2);
            } else {
                if (!this.d.isFinished()) {
                    d();
                }
                scrollBy(i2, i3);
            }
            this.b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    private static int b(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    private final void c() {
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    private final void d() {
        this.d.abortAnimation();
        a(1);
    }

    private final void e() {
        this.k = false;
        c();
        a(0);
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f.onRelease();
        }
    }

    private final void f() {
        if (getOverScrollMode() == 2) {
            this.e = null;
            this.f = null;
        } else if (this.e == null) {
            Context context = getContext();
            this.e = new EdgeEffect(context);
            this.f = new EdgeEffect(context);
        }
    }

    private final void h(int i2) {
        if (i2 == 0) {
            return;
        }
        if (this.n) {
            f(i2);
        } else {
            scrollBy(0, i2);
        }
    }

    public final boolean a(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public final void computeScroll() {
        if (!this.d.isFinished()) {
            this.d.computeScrollOffset();
            int currY = this.d.getCurrY();
            int i2 = currY - this.v;
            this.v = currY;
            int[] iArr = this.t;
            iArr[1] = 0;
            a(0, i2, iArr, (int[]) null, 1);
            int i3 = i2 - this.t[1];
            int a2 = a();
            if (i3 != 0) {
                int scrollY = getScrollY();
                a(i3, getScrollX(), scrollY, a2);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i3 - scrollY2;
                int[] iArr2 = this.t;
                iArr2[1] = 0;
                a(scrollY2, i4, this.s, 1, iArr2);
                i3 = i4 - this.t[1];
            }
            if (i3 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && a2 > 0)) {
                    f();
                    if (i3 < 0) {
                        if (this.e.isFinished()) {
                            this.e.onAbsorb((int) this.d.getCurrVelocity());
                        }
                    } else if (this.f.isFinished()) {
                        this.f.onAbsorb((int) this.d.getCurrVelocity());
                    }
                }
                d();
            }
            if (!this.d.isFinished()) {
                qb.e(this);
            } else {
                a(1);
            }
        }
    }

    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY <= max ? bottom : bottom + (scrollY - max);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || a(keyEvent);
    }

    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.A.a(f2, f3, z2);
    }

    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.A.a(f2, f3);
    }

    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return a(i2, i3, iArr, iArr2, 0);
    }

    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.A.a(i2, i3, i4, i5, iArr);
    }

    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.e != null) {
            int scrollY = getScrollY();
            int i3 = 0;
            if (!this.e.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                int i4 = Build.VERSION.SDK_INT;
                if (getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i2 = getPaddingLeft();
                } else {
                    i2 = 0;
                }
                int i5 = Build.VERSION.SDK_INT;
                if (getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i2, (float) min);
                this.e.setSize(width, height);
                if (this.e.draw(canvas)) {
                    qb.e(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(a(), scrollY) + height2;
                int i6 = Build.VERSION.SDK_INT;
                if (getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i3 = getPaddingLeft();
                }
                int i7 = Build.VERSION.SDK_INT;
                if (getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i3 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f.setSize(width2, height2);
                if (this.f.draw(canvas)) {
                    qb.e(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public final int getNestedScrollAxes() {
        return this.z.a();
    }

    /* access modifiers changed from: protected */
    public final float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public final boolean hasNestedScrollingParent() {
        return b(0);
    }

    public final boolean isNestedScrollingEnabled() {
        return this.A.a;
    }

    /* access modifiers changed from: protected */
    public final void measureChild(View view, int i2, int i3) {
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public final void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = false;
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.k) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                float f2 = this.B;
                if (f2 == 0.0f) {
                    TypedValue typedValue = new TypedValue();
                    Context context = getContext();
                    if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                        f2 = typedValue.getDimension(context.getResources().getDisplayMetrics());
                        this.B = f2;
                    } else {
                        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
                    }
                }
                int a2 = a();
                int scrollY = getScrollY();
                int i2 = scrollY - ((int) (axisValue * f2));
                if (i2 < 0) {
                    a2 = 0;
                } else if (i2 <= a2) {
                    a2 = i2;
                }
                if (a2 != scrollY) {
                    super.scrollTo(getScrollX(), a2);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.k) {
            return true;
        }
        int i2 = action & 255;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = this.r;
                    if (i3 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i3);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i3 + " in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.g) > this.o && (2 & getNestedScrollAxes()) == 0) {
                                this.k = true;
                                this.g = y2;
                                b();
                                this.l.addMovement(motionEvent);
                                this.u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 6) {
                        a(motionEvent);
                    }
                }
            }
            this.k = false;
            this.r = -1;
            c();
            if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, a())) {
                qb.e(this);
            }
            a(0);
        } else {
            int y3 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y3 >= childAt.getTop() - scrollY && y3 < childAt.getBottom() - scrollY && x2 >= childAt.getLeft() && x2 < childAt.getRight()) {
                    this.g = y3;
                    this.r = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker = this.l;
                    if (velocityTracker != null) {
                        velocityTracker.clear();
                    } else {
                        this.l = VelocityTracker.obtain();
                    }
                    this.l.addMovement(motionEvent);
                    this.d.computeScrollOffset();
                    this.k = !this.d.isFinished();
                    a(2, 0);
                }
            }
            this.k = false;
            c();
        }
        return this.k;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        this.h = false;
        View view = this.j;
        if (view != null && a(view, (View) this)) {
            b(this.j);
        }
        this.j = null;
        if (!this.i) {
            if (this.w != null) {
                scrollTo(getScrollX(), this.w.a);
                this.w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int scrollY = getScrollY();
            int b2 = b(scrollY, ((i5 - i3) - paddingTop) - paddingBottom, i6);
            if (b2 != scrollY) {
                scrollTo(getScrollX(), b2);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.i = true;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.m && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, JGCastService.FLAG_PRIVATE_DISPLAY));
            }
        }
    }

    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        e((int) f3);
        return true;
    }

    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        a(view, i2, i3, iArr, 0);
    }

    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        a(i5, 0, (int[]) null);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        b(view, view2, i2, 0);
    }

    /* access modifiers changed from: protected */
    public final void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        View findNextFocusFromRect = rect != null ? FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2) : FocusFinder.getInstance().findNextFocus(this, (View) null, i2);
        if (findNextFocusFromRect == null || a(findNextFocusFromRect)) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i2, rect);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.w = savedState;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = getScrollY();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        si siVar = this.a;
        if (siVar != null) {
            sq.a((View) this, siVar.a, siVar.b);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && a(findFocus, 0, i5)) {
            findFocus.getDrawingRect(this.c);
            offsetDescendantRectToMyCoords(findFocus, this.c);
            h(a(this.c));
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return a(view, view2, i2, 0);
    }

    public final void onStopNestedScroll(View view) {
        a(view, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r18.b()
            int r0 = r19.getActionMasked()
            r8 = 0
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r6.u = r8
        L_0x0011:
            android.view.MotionEvent r9 = android.view.MotionEvent.obtain(r19)
            int r1 = r6.u
            float r1 = (float) r1
            r2 = 0
            r9.offsetLocation(r2, r1)
            r1 = 2
            r10 = 1
            if (r0 == 0) goto L_0x0208
            r3 = -1
            if (r0 == r10) goto L_0x01bf
            if (r0 == r1) goto L_0x0082
            r1 = 3
            if (r0 == r1) goto L_0x0055
            r1 = 5
            if (r0 == r1) goto L_0x0042
            r1 = 6
            if (r0 == r1) goto L_0x0030
            goto L_0x023d
        L_0x0030:
            r18.a((android.view.MotionEvent) r19)
            int r0 = r6.r
            int r0 = r7.findPointerIndex(r0)
            float r0 = r7.getY(r0)
            int r0 = (int) r0
            r6.g = r0
            goto L_0x023d
        L_0x0042:
            int r0 = r19.getActionIndex()
            float r1 = r7.getY(r0)
            int r1 = (int) r1
            r6.g = r1
            int r0 = r7.getPointerId(r0)
            r6.r = r0
            goto L_0x023d
        L_0x0055:
            boolean r0 = r6.k
            if (r0 != 0) goto L_0x005a
            goto L_0x007b
        L_0x005a:
            int r0 = r18.getChildCount()
            if (r0 <= 0) goto L_0x007b
            android.widget.OverScroller r11 = r6.d
            int r12 = r18.getScrollX()
            int r13 = r18.getScrollY()
            r14 = 0
            r15 = 0
            r16 = 0
            int r17 = r18.a()
            boolean r0 = r11.springBack(r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x007b
            defpackage.qb.e(r18)
        L_0x007b:
            r6.r = r3
            r18.e()
            goto L_0x023d
        L_0x0082:
            int r0 = r6.r
            int r11 = r7.findPointerIndex(r0)
            if (r11 != r3) goto L_0x00a9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r0.append(r1)
            int r1 = r6.r
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NestedScrollView"
            android.util.Log.e(r1, r0)
            goto L_0x023d
        L_0x00a9:
            float r0 = r7.getY(r11)
            int r12 = (int) r0
            int r0 = r6.g
            int r0 = r0 - r12
            boolean r1 = r6.k
            if (r1 != 0) goto L_0x00d5
            int r1 = java.lang.Math.abs(r0)
            int r2 = r6.o
            if (r1 <= r2) goto L_0x00d5
            android.view.ViewParent r1 = r18.getParent()
            if (r1 != 0) goto L_0x00c4
            goto L_0x00c8
        L_0x00c4:
            r1.requestDisallowInterceptTouchEvent(r10)
        L_0x00c8:
            r6.k = r10
            if (r0 <= 0) goto L_0x00d0
            int r1 = r6.o
            int r0 = r0 - r1
            goto L_0x00d5
        L_0x00d0:
            int r1 = r6.o
            int r0 = r0 + r1
            r13 = r0
            goto L_0x00d6
        L_0x00d5:
            r13 = r0
        L_0x00d6:
            boolean r0 = r6.k
            if (r0 == 0) goto L_0x023d
            r1 = 0
            int[] r3 = r6.t
            int[] r4 = r6.s
            r5 = 0
            r0 = r18
            r2 = r13
            boolean r0 = r0.a((int) r1, (int) r2, (int[]) r3, (int[]) r4, (int) r5)
            if (r0 == 0) goto L_0x00f7
            int[] r0 = r6.t
            r0 = r0[r10]
            int r13 = r13 - r0
            int r0 = r6.u
            int[] r1 = r6.s
            r1 = r1[r10]
            int r0 = r0 + r1
            r6.u = r0
        L_0x00f7:
            int[] r0 = r6.s
            r0 = r0[r10]
            int r12 = r12 - r0
            r6.g = r12
            int r12 = r18.getScrollY()
            int r14 = r18.a()
            int r0 = r18.getOverScrollMode()
            if (r0 != 0) goto L_0x010e
            r15 = 1
            goto L_0x0116
        L_0x010e:
            if (r0 == r10) goto L_0x0112
        L_0x0110:
            r15 = 0
            goto L_0x0116
        L_0x0112:
            if (r14 > 0) goto L_0x0115
            goto L_0x0110
        L_0x0115:
            r15 = 1
        L_0x0116:
            int r0 = r18.getScrollY()
            boolean r0 = r6.a((int) r13, (int) r8, (int) r0, (int) r14)
            if (r0 == 0) goto L_0x012c
            boolean r0 = r6.b((int) r8)
            if (r0 != 0) goto L_0x012c
            android.view.VelocityTracker r0 = r6.l
            r0.clear()
        L_0x012c:
            int r0 = r18.getScrollY()
            int r1 = r0 - r12
            int[] r5 = r6.t
            r5[r10] = r8
            int r2 = r13 - r1
            int[] r3 = r6.s
            r4 = 0
            r0 = r18
            r0.a((int) r1, (int) r2, (int[]) r3, (int) r4, (int[]) r5)
            int r0 = r6.g
            int[] r1 = r6.s
            r1 = r1[r10]
            int r0 = r0 - r1
            r6.g = r0
            int r0 = r6.u
            int r0 = r0 + r1
            r6.u = r0
            if (r15 == 0) goto L_0x023d
            int[] r0 = r6.t
            r0 = r0[r10]
            int r13 = r13 - r0
            r18.f()
            int r12 = r12 + r13
            if (r12 >= 0) goto L_0x0180
            android.widget.EdgeEffect r0 = r6.e
            float r1 = (float) r13
            int r2 = r18.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = r7.getX(r11)
            int r3 = r18.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            defpackage.rm.a(r0, r1, r2)
            android.widget.EdgeEffect r0 = r6.f
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x017a
            goto L_0x01a8
        L_0x017a:
            android.widget.EdgeEffect r0 = r6.f
            r0.onRelease()
            goto L_0x01a8
        L_0x0180:
            if (r12 <= r14) goto L_0x01a8
            android.widget.EdgeEffect r0 = r6.f
            float r1 = (float) r13
            int r2 = r18.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r7.getX(r11)
            int r4 = r18.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r2 = r2 - r3
            defpackage.rm.a(r0, r1, r2)
            android.widget.EdgeEffect r0 = r6.e
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01a8
            android.widget.EdgeEffect r0 = r6.e
            r0.onRelease()
        L_0x01a8:
            android.widget.EdgeEffect r0 = r6.e
            if (r0 == 0) goto L_0x023d
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01ba
            android.widget.EdgeEffect r0 = r6.f
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x023d
        L_0x01ba:
            defpackage.qb.e(r18)
            goto L_0x023d
        L_0x01bf:
            android.view.VelocityTracker r0 = r6.l
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r6.q
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            int r1 = r6.r
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r6.p
            if (r1 < r4) goto L_0x01e7
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r6.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L_0x0202
            r6.dispatchNestedFling(r2, r1, r10)
            r6.e(r0)
            goto L_0x0202
        L_0x01e7:
            android.widget.OverScroller r11 = r6.d
            int r12 = r18.getScrollX()
            int r13 = r18.getScrollY()
            r14 = 0
            r15 = 0
            r16 = 0
            int r17 = r18.a()
            boolean r0 = r11.springBack(r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0202
            defpackage.qb.e(r18)
        L_0x0202:
            r6.r = r3
            r18.e()
            goto L_0x023d
        L_0x0208:
            int r0 = r18.getChildCount()
            if (r0 == 0) goto L_0x0248
            android.widget.OverScroller r0 = r6.d
            boolean r0 = r0.isFinished()
            r0 = r0 ^ r10
            r6.k = r0
            if (r0 == 0) goto L_0x0222
            android.view.ViewParent r0 = r18.getParent()
            if (r0 == 0) goto L_0x0222
            r0.requestDisallowInterceptTouchEvent(r10)
        L_0x0222:
            android.widget.OverScroller r0 = r6.d
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x022d
            r18.d()
        L_0x022d:
            float r0 = r19.getY()
            int r0 = (int) r0
            r6.g = r0
            int r0 = r7.getPointerId(r8)
            r6.r = r0
            r6.a((int) r1, (int) r8)
        L_0x023d:
            android.view.VelocityTracker r0 = r6.l
            if (r0 == 0) goto L_0x0244
            r0.addMovement(r9)
        L_0x0244:
            r9.recycle()
            return r10
        L_0x0248:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.h) {
            b(view2);
        } else {
            this.j = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        boolean z3;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int a2 = a(rect);
        if (a2 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (!z2) {
                f(a2);
            } else {
                scrollBy(0, a2);
            }
        }
        return z3;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        if (z2) {
            c();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public final void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public final void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int b2 = b(i2, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int b3 = b(i3, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (b2 != getScrollX() || b3 != getScrollY()) {
                super.scrollTo(b2, b3);
            }
        }
    }

    public final void setNestedScrollingEnabled(boolean z2) {
        this.A.a(z2);
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean startNestedScroll(int i2) {
        return a(i2, 0);
    }

    public final void stopNestedScroll() {
        a(0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final void b() {
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
    }

    public final boolean c(int i2) {
        int childCount;
        int height = getHeight();
        this.c.top = 0;
        this.c.bottom = height;
        if (i2 == 130 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect = this.c;
            rect.top = rect.bottom - height;
        }
        return a(i2, this.c.top, this.c.bottom);
    }

    public final boolean d(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int height = (int) (((float) getHeight()) * 0.5f);
        if (findNextFocus == null || !a(findNextFocus, height, getHeight())) {
            if (i2 == 33 && getScrollY() < height) {
                height = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                height = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), height);
            }
            if (height == 0) {
                return false;
            }
            if (i2 != 130) {
                height = -height;
            }
            h(height);
        } else {
            findNextFocus.getDrawingRect(this.c);
            offsetDescendantRectToMyCoords(findNextFocus, this.c);
            h(a(this.c));
            findNextFocus.requestFocus(i2);
        }
        if (findFocus == null || !findFocus.isFocused() || !a(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public final void g(int i2) {
        a(-getScrollX(), i2 - getScrollY(), true);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.c = new Rect();
        this.h = true;
        this.i = false;
        this.j = null;
        this.k = false;
        this.n = true;
        this.r = -1;
        this.s = new int[2];
        this.t = new int[2];
        this.d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.o = viewConfiguration.getScaledTouchSlop();
        this.p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y, i2, 0);
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        if (z2 != this.m) {
            this.m = z2;
            requestLayout();
        }
        obtainStyledAttributes.recycle();
        this.z = new pp();
        this.A = new pm(this);
        setNestedScrollingEnabled(true);
        qb.a((View) this, (oz) x);
    }

    private final void b(View view) {
        view.getDrawingRect(this.c);
        offsetDescendantRectToMyCoords(view, this.c);
        int a2 = a(this.c);
        if (a2 != 0) {
            scrollBy(0, a2);
        }
    }

    public final void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void e(int i2) {
        if (getChildCount() > 0) {
            this.d.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            a(true);
        }
    }

    public final void f(int i2) {
        a(0, i2, false);
    }

    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    private final void a(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.A.a(0, scrollY2, 0, i2 - scrollY2, (int[]) null, i3, iArr);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void b(View view, View view2, int i2, int i3) {
        this.z.a(i2, i3);
        a(2, i3);
    }

    public final boolean b(int i2) {
        return this.A.a(i2);
    }

    private final void a(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.r) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.g = (int) motionEvent.getY(i2);
            this.r = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private final void a(boolean z2) {
        if (z2) {
            a(2, 1);
        } else {
            a(1);
        }
        this.v = getScrollY();
        qb.e(this);
    }

    private final boolean a(int i2, int i3, int i4) {
        boolean z2;
        int i5;
        boolean z3;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i9 = height + scrollY;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) focusables.get(i10);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i7 < bottom && top < i8) {
                if (i7 >= top) {
                    z3 = false;
                } else {
                    z3 = bottom < i8;
                }
                if (view == null) {
                    view = view2;
                    z4 = z3;
                } else {
                    boolean z5 = i6 != 33 ? bottom > view.getBottom() : top < view.getTop();
                    if (!z4) {
                        if (z3) {
                            view = view2;
                            z4 = true;
                        } else if (!z5) {
                        }
                    } else if (z3) {
                        if (!z5) {
                        }
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i7 < scrollY || i8 > i9) {
            if (i6 != 33) {
                i5 = i8 - i9;
            } else {
                i5 = i7 - scrollY;
            }
            h(i5);
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i6);
        }
        return z2;
    }

    private final boolean a(View view) {
        return !a(view, 0, getHeight());
    }

    private final boolean a(View view, int i2, int i3) {
        view.getDrawingRect(this.c);
        offsetDescendantRectToMyCoords(view, this.c);
        return this.c.bottom + i2 >= getScrollY() && this.c.top - i2 <= getScrollY() + i3;
    }

    private static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && a((View) parent, view2);
    }

    public final int a() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public final int a(Rect rect) {
        int i2;
        int i3;
        int i4;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i2 = i5 - verticalFadingEdgeLength;
        } else {
            i2 = i5;
        }
        if (rect.bottom > i2 && rect.top > scrollY) {
            if (rect.height() > height) {
                i4 = rect.top - scrollY;
            } else {
                i4 = rect.bottom - i2;
            }
            return Math.min(i4, (childAt.getBottom() + layoutParams.bottomMargin) - i5);
        } else if (rect.top >= scrollY || rect.bottom >= i2) {
            return 0;
        } else {
            if (rect.height() > height) {
                i3 = -(i2 - rect.bottom);
            } else {
                i3 = -(scrollY - rect.top);
            }
            return Math.max(i3, -getScrollY());
        }
    }

    public final void a(int i2) {
        this.A.c(i2);
    }

    public final void a(int i2, int i3, int[] iArr, int i4, int[] iArr2) {
        this.A.a(0, i2, 0, i3, iArr, i4, iArr2);
    }

    public final void a(View view, int i2) {
        this.z.a(i2);
        a(i2);
    }

    public final void a(View view, int i2, int i3, int i4, int i5, int i6) {
        a(i5, i6, (int[]) null);
    }

    public final void a(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        a(i5, i6, iArr);
    }

    public final void a(View view, int i2, int i3, int[] iArr, int i4) {
        a(i2, i3, iArr, (int[]) null, i4);
    }

    public final boolean a(int i2, int i3) {
        return this.A.a(i2, i3);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i2, int i3, int i4, int i5) {
        boolean z2;
        boolean z3;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i6 = i4 + i2;
        if (i3 > 0) {
            z2 = true;
        } else {
            z2 = i3 < 0;
        }
        if (i6 > i5) {
            z3 = true;
        } else if (i6 >= 0) {
            i5 = i6;
            z3 = false;
        } else {
            z3 = true;
            i5 = 0;
        }
        if (z3 && !b(1)) {
            this.d.springBack(0, i5, 0, 0, 0, a());
        }
        super.scrollTo(0, i5);
        return z2 || z3;
    }

    public final boolean a(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.A.a(i2, i3, iArr, iArr2, i4);
    }

    public final boolean a(KeyEvent keyEvent) {
        this.c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                int i2 = 33;
                if (keyCode != 19) {
                    if (keyCode != 20) {
                        if (keyCode != 62) {
                            return false;
                        }
                        if (!keyEvent.isShiftPressed()) {
                            i2 = 130;
                        }
                        int height = getHeight();
                        if (i2 == 130) {
                            this.c.top = getScrollY() + height;
                            int childCount = getChildCount();
                            if (childCount > 0) {
                                View childAt2 = getChildAt(childCount - 1);
                                int bottom = childAt2.getBottom() + ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin + getPaddingBottom();
                                if (this.c.top + height > bottom) {
                                    this.c.top = bottom - height;
                                }
                            }
                        } else {
                            this.c.top = getScrollY() - height;
                            if (this.c.top < 0) {
                                this.c.top = 0;
                            }
                        }
                        Rect rect = this.c;
                        rect.bottom = rect.top + height;
                        a(i2, this.c.top, this.c.bottom);
                        return false;
                    } else if (!keyEvent.isAltPressed()) {
                        return d(130);
                    } else {
                        return c(130);
                    }
                } else if (!keyEvent.isAltPressed()) {
                    return d(33);
                } else {
                    return c(33);
                }
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
