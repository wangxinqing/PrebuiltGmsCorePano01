package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.FragmentTransaction;
import java.util.ArrayList;

/* renamed from: act  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class act {
    public int A;
    public int B;
    public int C;
    public int D;
    private final afn a = new acr(this);
    private final afn b = new acs(this);
    zv q;
    public RecyclerView r;
    final afo s = new afo(this.a);
    final afo t = new afo(this.b);
    public adh u;
    public boolean v = false;
    public final boolean w = true;
    public boolean x = true;
    public int y;
    public boolean z;

    public static int a(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    public static boolean b(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static final int h(View view) {
        Rect rect = ((acu) view.getLayoutParams()).d;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static final int i(View view) {
        Rect rect = ((acu) view.getLayoutParams()).d;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static final int j(View view) {
        return ((acu) view.getLayoutParams()).c();
    }

    public final int A() {
        return qb.l(this.r);
    }

    public int a(int i, adb adb, adi adi) {
        throw null;
    }

    public int a(adb adb, adi adi) {
        return -1;
    }

    public abstract acu a();

    public View a(View view, int i, adb adb, adi adi) {
        return null;
    }

    public void a(int i, int i2, adi adi, aax aax) {
        throw null;
    }

    public void a(int i, aax aax) {
    }

    public void a(acg acg, acg acg2) {
    }

    public void a(adb adb, adi adi, View view, qs qsVar) {
    }

    public void a(adi adi) {
    }

    public void a(Parcelable parcelable) {
        throw null;
    }

    public void a(RecyclerView recyclerView, int i) {
        throw null;
    }

    public boolean a(acu acu) {
        return acu != null;
    }

    public boolean a(RecyclerView recyclerView, ArrayList arrayList, int i, int i2) {
        return false;
    }

    public int b(int i, adb adb, adi adi) {
        throw null;
    }

    public int b(adb adb, adi adi) {
        return -1;
    }

    public int b(adi adi) {
        return 0;
    }

    public void b(int i, int i2) {
    }

    public boolean b() {
        throw null;
    }

    public int c(adi adi) {
        return 0;
    }

    public View c(View view, int i) {
        return null;
    }

    public void c() {
    }

    public void c(int i, int i2) {
    }

    public void c(adb adb, adi adi) {
        throw null;
    }

    public int d(adi adi) {
        return 0;
    }

    public void d() {
    }

    public void d(int i) {
        throw null;
    }

    public void d(int i, int i2) {
    }

    public int e(adi adi) {
        return 0;
    }

    public boolean e() {
        return false;
    }

    public int f(adi adi) {
        return 0;
    }

    public Parcelable f() {
        throw null;
    }

    public int g(adi adi) {
        return 0;
    }

    public boolean g() {
        throw null;
    }

    public boolean h() {
        throw null;
    }

    public void k(View view) {
        acu acu = (acu) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.r.getItemDecorInsetsForChild(view);
        int i = itemDecorInsetsForChild.left;
        int i2 = itemDecorInsetsForChild.right;
        int i3 = itemDecorInsetsForChild.top;
        int i4 = itemDecorInsetsForChild.bottom;
        int a2 = a(this.C, this.A, s() + u() + acu.leftMargin + acu.rightMargin + i + i2, acu.width, g());
        int a3 = a(this.D, this.B, t() + v() + acu.topMargin + acu.bottomMargin + i3 + i4, acu.height, h());
        if (a(view, a2, a3, acu)) {
            view.measure(a2, a3);
        }
    }

    public boolean l() {
        return false;
    }

    public final void o() {
        RecyclerView recyclerView = this.r;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final boolean p() {
        adh adh = this.u;
        return adh != null && adh.e;
    }

    public final int q() {
        return qb.h(this.r);
    }

    public final int r() {
        zv zvVar = this.q;
        if (zvVar != null) {
            return zvVar.a();
        }
        return 0;
    }

    public final int s() {
        RecyclerView recyclerView = this.r;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int t() {
        RecyclerView recyclerView = this.r;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public final int u() {
        RecyclerView recyclerView = this.r;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int v() {
        RecyclerView recyclerView = this.r;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final boolean w() {
        RecyclerView recyclerView = this.r;
        return recyclerView != null && recyclerView.hasFocus();
    }

    public final View x() {
        View focusedChild;
        RecyclerView recyclerView = this.r;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.q.c(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public final int y() {
        RecyclerView recyclerView = this.r;
        acg adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final int z() {
        return qb.k(this.r);
    }

    public final View c(View view) {
        View findContainingItemView;
        RecyclerView recyclerView = this.r;
        if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.q.c(findContainingItemView)) {
            return null;
        }
        return findContainingItemView;
    }

    public int d(View view) {
        return view.getLeft() - ((acu) view.getLayoutParams()).d.left;
    }

    public int e(View view) {
        return view.getTop() - ((acu) view.getLayoutParams()).d.top;
    }

    public int f(View view) {
        return view.getRight() + ((acu) view.getLayoutParams()).d.right;
    }

    public int g(View view) {
        return view.getBottom() + ((acu) view.getLayoutParams()).d.bottom;
    }

    public final View h(int i) {
        zv zvVar = this.q;
        if (zvVar != null) {
            return zvVar.b(i);
        }
        return null;
    }

    public final void i(int i, int i2) {
        this.r.setMeasuredDimension(i, i2);
    }

    public final void h(int i, int i2) {
        int r2 = r();
        if (r2 != 0) {
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < r2; i7++) {
                View h = h(i7);
                Rect rect = this.r.mTempRect;
                a(h, rect);
                if (rect.left < i5) {
                    i5 = rect.left;
                }
                if (rect.right > i3) {
                    i3 = rect.right;
                }
                if (rect.top < i6) {
                    i6 = rect.top;
                }
                if (rect.bottom > i4) {
                    i4 = rect.bottom;
                }
            }
            this.r.mTempRect.set(i5, i6, i3, i4);
            a(this.r.mTempRect, i, i2);
            return;
        }
        this.r.defaultOnMeasure(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r5 == 1073741824) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 != 0) goto L_0x0022
            if (r7 < 0) goto L_0x0013
            r5 = 1073741824(0x40000000, float:2.0)
            goto L_0x0034
        L_0x0013:
            if (r7 != r1) goto L_0x0016
        L_0x0015:
            goto L_0x0030
        L_0x0016:
            if (r7 == r0) goto L_0x0019
            goto L_0x0032
        L_0x0019:
            if (r5 != r2) goto L_0x001e
        L_0x001b:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0030
        L_0x001e:
            if (r5 == r3) goto L_0x001b
            r5 = 0
            goto L_0x0030
        L_0x0022:
            if (r7 < 0) goto L_0x0027
            r5 = 1073741824(0x40000000, float:2.0)
            goto L_0x0034
        L_0x0027:
            if (r7 != r1) goto L_0x0032
            if (r5 == r2) goto L_0x0015
            if (r5 == 0) goto L_0x0032
            if (r5 == r3) goto L_0x0015
            goto L_0x0032
        L_0x0030:
            r7 = r4
            goto L_0x0034
        L_0x0032:
            r5 = 0
            r7 = 0
        L_0x0034:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.act.a(int, int, int, int, boolean):int");
    }

    public final void g(int i) {
        h(i);
        this.q.d(i);
    }

    public View b(int i) {
        int r2 = r();
        for (int i2 = 0; i2 < r2; i2++) {
            View h = h(i2);
            adl childViewHolderInt = RecyclerView.getChildViewHolderInt(h);
            if (childViewHolderInt != null && childViewHolderInt.c() == i && !childViewHolderInt.ax() && (this.r.mState.g || !childViewHolderInt.n())) {
                return h;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.q;
        r4 = r0.a(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(int r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.h((int) r4)
            if (r0 == 0) goto L_0x0026
            zv r0 = r3.q
            int r4 = r0.a((int) r4)
            ace r1 = r0.c
            android.view.View r1 = r1.b((int) r4)
            if (r1 == 0) goto L_0x0026
            zu r2 = r0.a
            boolean r2 = r2.d(r4)
            if (r2 != 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            r0.d((android.view.View) r1)
        L_0x0020:
            ace r0 = r0.c
            r0.a((int) r4)
            return
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.act.f(int):void");
    }

    private final void a(adb adb, int i, View view) {
        adl childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.ax()) {
            return;
        }
        if (!childViewHolderInt.k() || childViewHolderInt.n() || this.r.mAdapter.c) {
            g(i);
            adb.c(view);
            this.r.mViewInfoStore.c(childViewHolderInt);
            return;
        }
        f(i);
        adb.a(childViewHolderInt);
    }

    public final void g(int i, int i2) {
        this.C = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.A = mode;
        if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.C = 0;
        }
        this.D = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.B = mode2;
        if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.D = 0;
        }
    }

    public void c(adb adb) {
        for (int r2 = r() - 1; r2 >= 0; r2--) {
            if (!RecyclerView.getChildViewHolderInt(h(r2)).ax()) {
                a(r2, adb);
            }
        }
    }

    public final void b(adb adb) {
        int size = adb.a.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((adl) adb.a.get(i)).a;
            adl childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.ax()) {
                childViewHolderInt.a(false);
                if (childViewHolderInt.o()) {
                    this.r.removeDetachedView(view, false);
                }
                aco aco = this.r.mItemAnimator;
                if (aco != null) {
                    aco.d(childViewHolderInt);
                }
                childViewHolderInt.a(true);
                adb.b(view);
            }
        }
        adb.a.clear();
        ArrayList arrayList = adb.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.r.invalidate();
        }
    }

    public final void c(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((acu) view.getLayoutParams()).d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (!(this.r == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
            RectF rectF = this.r.mTempRectF;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public static final void a(View view, int i, int i2, int i3, int i4) {
        acu acu = (acu) view.getLayoutParams();
        Rect rect = acu.d;
        view.layout(i + rect.left + acu.leftMargin, i2 + rect.top + acu.topMargin, (i3 - rect.right) - acu.rightMargin, (i4 - rect.bottom) - acu.bottomMargin);
    }

    private final void a(View view, int i, boolean z2) {
        adl childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (z2 || childViewHolderInt.n()) {
            this.r.mViewInfoStore.b(childViewHolderInt);
        } else {
            this.r.mViewInfoStore.c(childViewHolderInt);
        }
        acu acu = (acu) view.getLayoutParams();
        if (childViewHolderInt.h() || childViewHolderInt.f()) {
            if (childViewHolderInt.f()) {
                childViewHolderInt.g();
            } else {
                childViewHolderInt.i();
            }
            this.q.a(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.r) {
            int b2 = this.q.b(view);
            if (i == -1) {
                i = this.q.a();
            }
            if (b2 == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.r.indexOfChild(view) + this.r.exceptionLabel());
            } else if (b2 != i) {
                act act = this.r.mLayout;
                View h = act.h(b2);
                if (h != null) {
                    act.g(b2);
                    acu acu2 = (acu) h.getLayoutParams();
                    adl childViewHolderInt2 = RecyclerView.getChildViewHolderInt(h);
                    if (childViewHolderInt2.n()) {
                        act.r.mViewInfoStore.b(childViewHolderInt2);
                    } else {
                        act.r.mViewInfoStore.c(childViewHolderInt2);
                    }
                    act.q.a(h, i, acu2, childViewHolderInt2.n());
                } else {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b2 + act.r.toString());
                }
            }
        } else {
            this.q.a(view, i, false);
            acu.e = true;
            adh adh = this.u;
            if (adh != null && adh.e && adh.a(view) == adh.a) {
                adh.f = view;
            }
        }
        if (acu.f) {
            childViewHolderInt.a.invalidate();
            acu.f = false;
        }
    }

    public final void b(RecyclerView recyclerView) {
        g(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), JGCastService.FLAG_PRIVATE_DISPLAY));
    }

    public final void b(View view) {
        b(view, -1);
    }

    public final void b(View view, int i) {
        a(view, i, false);
    }

    public final void b(View view, adb adb) {
        zv zvVar = this.q;
        int a2 = zvVar.c.a(view);
        if (a2 >= 0) {
            if (zvVar.a.d(a2)) {
                zvVar.d(view);
            }
            zvVar.c.a(a2);
        }
        adb.a(view);
    }

    public final void b(View view, Rect rect) {
        RecyclerView recyclerView = this.r;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.getItemDecorInsetsForChild(view));
        }
    }

    public acu a(Context context, AttributeSet attributeSet) {
        return new acu(context, attributeSet);
    }

    public acu a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof acu) {
            return new acu((acu) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new acu((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new acu(layoutParams);
    }

    public final void a(int i, adb adb) {
        View h = h(i);
        f(i);
        adb.a(h);
    }

    public final void a(adb adb) {
        for (int r2 = r() - 1; r2 >= 0; r2--) {
            a(adb, r2, h(r2));
        }
    }

    public void a(adb adb, adi adi, int i, int i2) {
        this.r.defaultOnMeasure(i, i2);
    }

    public void a(adb adb, adi adi, qs qsVar) {
        if (this.r.canScrollVertically(-1) || this.r.canScrollHorizontally(-1)) {
            qsVar.a((int) FragmentTransaction.TRANSIT_EXIT_MASK);
            qsVar.e(true);
        }
        if (this.r.canScrollVertically(1) || this.r.canScrollHorizontally(1)) {
            qsVar.a((int) FragmentTransaction.TRANSIT_ENTER_MASK);
            qsVar.e(true);
        }
        qsVar.a((Object) qq.a(a(adb, adi), b(adb, adi), 0));
    }

    public void a(adh adh) {
        adh adh2 = this.u;
        if (!(adh2 == null || adh == adh2 || !adh2.e)) {
            adh2.a();
        }
        this.u = adh;
        RecyclerView recyclerView = this.r;
        recyclerView.mViewFlinger.b();
        if (adh.g) {
            Log.w("RecyclerView", "An instance of " + adh.getClass().getSimpleName() + " was started more than once. Each instance of" + adh.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        adh.b = recyclerView;
        adh.c = this;
        int i = adh.a;
        if (i != -1) {
            adh.b.mState.a = i;
            adh.e = true;
            adh.d = true;
            adh.f = adh.b(adh.a);
            adh.b.mViewFlinger.a();
            adh.g = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public void a(Rect rect, int i, int i2) {
        int width = rect.width();
        int s2 = s();
        int u2 = u();
        int height = rect.height();
        int t2 = t();
        i(a(i, width + s2 + u2, z()), a(i2, height + t2 + v(), A()));
    }

    public final void a(RecyclerView recyclerView) {
        int i;
        if (recyclerView != null) {
            this.r = recyclerView;
            this.q = recyclerView.mChildHelper;
            this.C = recyclerView.getWidth();
            i = recyclerView.getHeight();
        } else {
            this.r = null;
            this.q = null;
            i = 0;
            this.C = 0;
        }
        this.D = i;
        this.A = JGCastService.FLAG_PRIVATE_DISPLAY;
        this.B = JGCastService.FLAG_PRIVATE_DISPLAY;
    }

    public final void a(View view) {
        a(view, -1);
    }

    public final void a(View view, int i) {
        a(view, i, true);
    }

    public final void a(View view, adb adb) {
        a(adb, this.q.b(view), view);
    }

    public void a(View view, Rect rect) {
        RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
    }

    /* access modifiers changed from: package-private */
    public final void a(View view, qs qsVar) {
        adl childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null && !childViewHolderInt.n() && !this.q.c(childViewHolderInt.a)) {
            RecyclerView recyclerView = this.r;
            a(recyclerView.mRecycler, recyclerView.mState, view, qsVar);
        }
    }

    public void a(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.r;
        adb adb = recyclerView.mRecycler;
        adi adi = recyclerView.mState;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z2 = true;
            if (!recyclerView.canScrollVertically(1) && !this.r.canScrollVertically(-1) && !this.r.canScrollHorizontally(-1) && !this.r.canScrollHorizontally(1)) {
                z2 = false;
            }
            accessibilityEvent.setScrollable(z2);
            acg acg = this.r.mAdapter;
            if (acg != null) {
                accessibilityEvent.setItemCount(acg.a());
            }
        }
    }

    public void a(String str) {
        RecyclerView recyclerView = this.r;
        if (recyclerView != null) {
            recyclerView.assertNotInLayoutOrScroll(str);
        }
    }

    public boolean a(adb adb, adi adi, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.r;
        if (recyclerView == null) {
            return false;
        }
        if (i == 4096) {
            if (recyclerView.canScrollVertically(1)) {
                i4 = (this.D - t()) - v();
            } else {
                i4 = 0;
            }
            if (this.r.canScrollHorizontally(1)) {
                i2 = i4;
                i3 = (this.C - s()) - u();
            } else {
                i2 = i4;
                i3 = 0;
            }
        } else if (i != 8192) {
            i3 = 0;
            i2 = 0;
        } else {
            if (recyclerView.canScrollVertically(-1)) {
                i5 = -((this.D - t()) - v());
            } else {
                i5 = 0;
            }
            if (this.r.canScrollHorizontally(-1)) {
                i2 = i5;
                i3 = -((this.C - s()) - u());
            } else {
                i2 = i5;
                i3 = 0;
            }
        }
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        this.r.smoothScrollBy(i3, i2, (Interpolator) null, Integer.MIN_VALUE, true);
        return true;
    }

    public boolean a(RecyclerView recyclerView, View view, Rect rect, boolean z2) {
        return a(recyclerView, view, rect, z2, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b4, code lost:
        if ((r10.bottom - r15) > r5) goto L_0x00b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.support.v7.widget.RecyclerView r17, android.view.View r18, android.graphics.Rect r19, boolean r20, boolean r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = 2
            int[] r3 = new int[r3]
            int r4 = r16.s()
            int r5 = r16.t()
            int r6 = r0.C
            int r7 = r16.u()
            int r8 = r0.D
            int r9 = r16.v()
            int r10 = r18.getLeft()
            int r11 = r2.left
            int r10 = r10 + r11
            int r11 = r18.getScrollX()
            int r10 = r10 - r11
            int r11 = r18.getTop()
            int r12 = r2.top
            int r11 = r11 + r12
            int r12 = r18.getScrollY()
            int r11 = r11 - r12
            int r12 = r19.width()
            int r2 = r19.height()
            int r4 = r10 - r4
            r13 = 0
            int r14 = java.lang.Math.min(r13, r4)
            int r5 = r11 - r5
            int r15 = java.lang.Math.min(r13, r5)
            int r10 = r10 + r12
            int r6 = r6 - r7
            int r10 = r10 - r6
            int r6 = java.lang.Math.max(r13, r10)
            int r11 = r11 + r2
            int r8 = r8 - r9
            int r11 = r11 - r8
            int r2 = java.lang.Math.max(r13, r11)
            int r7 = r16.q()
            r8 = 1
            if (r7 == r8) goto L_0x0067
            if (r14 != 0) goto L_0x0066
            int r14 = java.lang.Math.min(r4, r6)
            goto L_0x006f
        L_0x0066:
            goto L_0x006f
        L_0x0067:
            if (r6 != 0) goto L_0x006e
            int r14 = java.lang.Math.max(r14, r10)
            goto L_0x006f
        L_0x006e:
            r14 = r6
        L_0x006f:
            if (r15 != 0) goto L_0x0076
            int r15 = java.lang.Math.min(r5, r2)
            goto L_0x0077
        L_0x0076:
        L_0x0077:
            r3[r13] = r14
            r3[r8] = r15
            r2 = r3[r13]
            if (r21 == 0) goto L_0x00b6
            android.view.View r3 = r17.getFocusedChild()
            if (r3 == 0) goto L_0x00bb
            int r4 = r16.s()
            int r5 = r16.t()
            int r6 = r0.C
            int r7 = r16.u()
            int r9 = r0.D
            int r10 = r16.v()
            int r9 = r9 - r10
            android.support.v7.widget.RecyclerView r10 = r0.r
            android.graphics.Rect r10 = r10.mTempRect
            r0.a((android.view.View) r3, (android.graphics.Rect) r10)
            int r3 = r10.left
            int r3 = r3 - r2
            int r6 = r6 - r7
            if (r3 >= r6) goto L_0x00bb
            int r3 = r10.right
            int r3 = r3 - r2
            if (r3 <= r4) goto L_0x00bb
            int r3 = r10.top
            int r3 = r3 - r15
            if (r3 >= r9) goto L_0x00bb
            int r3 = r10.bottom
            int r3 = r3 - r15
            if (r3 <= r5) goto L_0x00bb
        L_0x00b6:
            if (r2 != 0) goto L_0x00bc
            if (r15 == 0) goto L_0x00bb
            goto L_0x00bc
        L_0x00bb:
            return r13
        L_0x00bc:
            if (r20 != 0) goto L_0x00c2
            r1.smoothScrollBy(r2, r15)
            goto L_0x00c5
        L_0x00c2:
            r1.scrollBy(r2, r15)
        L_0x00c5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.act.a(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    @Deprecated
    public boolean a(RecyclerView recyclerView, View view, View view2) {
        return p() || recyclerView.isComputingLayout();
    }

    /* access modifiers changed from: package-private */
    public final boolean a(View view, int i, int i2, acu acu) {
        return view.isLayoutRequested() || !this.w || !b(view.getWidth(), i, acu.width) || !b(view.getHeight(), i2, acu.height);
    }
}
