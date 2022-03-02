package android.support.v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.google.android.gms.R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ActionBarOverlayLayout extends ViewGroup implements zw, pn, po {
    static final int[] j = {R.attr.actionBarSize, 16842841};
    private final Runnable A;
    private final pp B;
    public int a;
    public ActionBarContainer b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public xy g;
    public ViewPropertyAnimator h;
    public final AnimatorListenerAdapter i;
    private int k;
    private ContentFrameLayout l;
    private zx m;
    private Drawable n;
    private boolean o;
    private boolean p;
    private int q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private final Rect w;
    private final Rect x;
    private OverScroller y;
    private final Runnable z;

    public ActionBarOverlayLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private final void a(Context context) {
        boolean z2;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(j);
        boolean z3 = false;
        this.k = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.n = drawable;
        if (drawable == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        setWillNotDraw(z2);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z3 = true;
        }
        this.o = z3;
        this.y = new OverScroller(context);
    }

    public final void a(View view, int i2, int i3, int[] iArr, int i4) {
    }

    public final int b() {
        ActionBarContainer actionBarContainer = this.b;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public final void c() {
        removeCallbacks(this.z);
        removeCallbacks(this.A);
        ViewPropertyAnimator viewPropertyAnimator = this.h;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof xz;
    }

    public final boolean d() {
        a();
        return this.m.h();
    }

    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.n != null && !this.o) {
            if (this.b.getVisibility() == 0) {
                i2 = (int) (((float) this.b.getBottom()) + this.b.getTranslationY() + 0.5f);
            } else {
                i2 = 0;
            }
            this.n.setBounds(0, i2, getWidth(), this.n.getIntrinsicHeight() + i2);
            this.n.draw(canvas);
        }
    }

    public final boolean e() {
        a();
        return this.m.i();
    }

    public final boolean f() {
        a();
        return this.m.j();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003d, code lost:
        if (r0 != false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean fitSystemWindows(android.graphics.Rect r4) {
        /*
            r3 = this;
            r3.a()
            android.support.v7.widget.ActionBarContainer r0 = r3.b
            r1 = 0
            boolean r0 = a(r0, r4, r1)
            android.graphics.Rect r1 = r3.u
            r1.set(r4)
            android.graphics.Rect r4 = r3.u
            android.graphics.Rect r1 = r3.r
            defpackage.afs.a(r3, r4, r1)
            android.graphics.Rect r4 = r3.v
            android.graphics.Rect r1 = r3.u
            boolean r4 = r4.equals(r1)
            r1 = 1
            if (r4 != 0) goto L_0x002a
            android.graphics.Rect r4 = r3.v
            android.graphics.Rect r0 = r3.u
            r4.set(r0)
            r0 = 1
            goto L_0x002b
        L_0x002a:
        L_0x002b:
            android.graphics.Rect r4 = r3.s
            android.graphics.Rect r2 = r3.r
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x003d
            android.graphics.Rect r4 = r3.s
            android.graphics.Rect r0 = r3.r
            r4.set(r0)
            goto L_0x003f
        L_0x003d:
            if (r0 == 0) goto L_0x0042
        L_0x003f:
            r3.requestLayout()
        L_0x0042:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarOverlayLayout.fitSystemWindows(android.graphics.Rect):boolean");
    }

    public final boolean g() {
        a();
        return this.m.k();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new xz();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new xz(getContext(), attributeSet);
    }

    public final int getNestedScrollAxes() {
        return this.B.a();
    }

    public final boolean h() {
        a();
        return this.m.l();
    }

    public final void i() {
        a();
        this.m.m();
    }

    public final void j() {
        a();
        this.m.n();
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(getContext());
        qb.r(this);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                xz xzVar = (xz) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = xzVar.leftMargin + paddingLeft;
                int i8 = xzVar.topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        a();
        measureChildWithMargins(this.b, i2, 0, i3, 0);
        xz xzVar = (xz) this.b.getLayoutParams();
        int i4 = 0;
        int max = Math.max(0, this.b.getMeasuredWidth() + xzVar.leftMargin + xzVar.rightMargin);
        int max2 = Math.max(0, this.b.getMeasuredHeight() + xzVar.topMargin + xzVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.b.getMeasuredState());
        int q2 = qb.q(this) & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (q2 != 0) {
            i4 = this.k;
        } else if (this.b.getVisibility() != 8) {
            i4 = this.b.getMeasuredHeight();
        }
        this.t.set(this.r);
        this.w.set(this.u);
        if (!this.c && q2 == 0) {
            this.t.top += i4;
            Rect rect = this.t;
            rect.bottom = rect.bottom;
        } else {
            this.w.top += i4;
            Rect rect2 = this.w;
            rect2.bottom = rect2.bottom;
        }
        a(this.l, this.t, true);
        if (!this.x.equals(this.w)) {
            this.x.set(this.w);
            this.l.fitSystemWindows(this.w);
        }
        measureChildWithMargins(this.l, i2, 0, i3, 0);
        xz xzVar2 = (xz) this.l.getLayoutParams();
        int max3 = Math.max(max, this.l.getMeasuredWidth() + xzVar2.leftMargin + xzVar2.rightMargin);
        int max4 = Math.max(max2, this.l.getMeasuredHeight() + xzVar2.topMargin + xzVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.l.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.p || !z2) {
            return false;
        }
        this.y.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.y.getFinalY() > this.b.getHeight()) {
            c();
            this.A.run();
        } else {
            c();
            this.z.run();
        }
        this.e = true;
        return true;
    }

    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.q + i3;
        this.q = i6;
        a(i6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r1 = (defpackage.ug) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
        /*
            r0 = this;
            pp r1 = r0.B
            r1.b(r3)
            int r1 = r0.b()
            r0.q = r1
            r0.c()
            xy r1 = r0.g
            if (r1 == 0) goto L_0x001e
            ug r1 = (defpackage.ug) r1
            wb r2 = r1.n
            if (r2 == 0) goto L_0x001e
            r2.b()
            r2 = 0
            r1.n = r2
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.b.getVisibility() != 0) {
            return false;
        }
        return this.p;
    }

    public final void onStopNestedScroll(View view) {
        if (this.p && !this.e) {
            if (this.q <= this.b.getHeight()) {
                c();
                postDelayed(this.z, 600);
            } else {
                c();
                postDelayed(this.A, 600);
            }
        }
        xy xyVar = this.g;
    }

    public final void onWindowSystemUiVisibilityChanged(int i2) {
        boolean z2;
        int i3 = Build.VERSION.SDK_INT;
        super.onWindowSystemUiVisibilityChanged(i2);
        a();
        int i4 = this.f ^ i2;
        this.f = i2;
        int i5 = i2 & 4;
        int i6 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        xy xyVar = this.g;
        if (xyVar != null) {
            if (i6 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            ug ugVar = (ug) xyVar;
            ugVar.k = z2;
            if (i5 == 0 || i6 == 0) {
                if (ugVar.m) {
                    ugVar.m = false;
                    ugVar.g(true);
                }
            } else if (!ugVar.m) {
                ugVar.m = true;
                ugVar.g(true);
            }
        }
        if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 && this.g != null) {
            qb.r(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.a = i2;
        xy xyVar = this.g;
        if (xyVar != null) {
            ((ug) xyVar).j = i2;
        }
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = new Rect();
        this.x = new Rect();
        this.i = new xv(this);
        this.z = new xw(this);
        this.A = new xx(this);
        a(context);
        this.B = new pp();
    }

    public final void b(int i2) {
        a();
        if (i2 == 2) {
            this.m.f();
        } else if (i2 == 5) {
            this.m.g();
        } else if (i2 == 109) {
            boolean z2 = true;
            this.c = true;
            if (getContext().getApplicationInfo().targetSdkVersion >= 19) {
                z2 = false;
            }
            this.o = z2;
        }
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new xz(layoutParams);
    }

    private static final boolean a(View view, Rect rect, boolean z2) {
        boolean z3;
        xz xzVar = (xz) view.getLayoutParams();
        if (xzVar.leftMargin != rect.left) {
            xzVar.leftMargin = rect.left;
            z3 = true;
        } else {
            z3 = false;
        }
        if (xzVar.topMargin != rect.top) {
            xzVar.topMargin = rect.top;
            z3 = true;
        }
        if (xzVar.rightMargin != rect.right) {
            xzVar.rightMargin = rect.right;
            z3 = true;
        }
        if (!z2 || xzVar.bottomMargin == rect.bottom) {
            return z3;
        }
        xzVar.bottomMargin = rect.bottom;
        return true;
    }

    public final void b(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        zx zxVar;
        if (this.l == null) {
            this.l = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.b = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof zx) {
                zxVar = (zx) findViewById;
            } else if (findViewById instanceof Toolbar) {
                zxVar = ((Toolbar) findViewById).o();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of " + findViewById.getClass().getSimpleName());
            }
            this.m = zxVar;
        }
    }

    public final void a(int i2) {
        c();
        this.b.setTranslationY((float) (-Math.max(0, Math.min(i2, this.b.getHeight()))));
    }

    public final void a(Menu menu, xg xgVar) {
        a();
        this.m.a(menu, xgVar);
    }

    public final void a(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void a(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    public final void a(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        a(view, i2, i3, i4, i5, i6);
    }

    public final void a(Window.Callback callback) {
        a();
        this.m.a(callback);
    }

    public final void a(CharSequence charSequence) {
        a();
        this.m.a(charSequence);
    }

    public final void a(boolean z2) {
        if (z2 != this.p) {
            this.p = z2;
            if (!z2) {
                c();
                a(0);
            }
        }
    }

    public final boolean a(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }
}
