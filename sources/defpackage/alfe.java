package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* renamed from: alfe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class alfe extends ViewGroup {
    private static final Interpolator d = new alfd();
    private final int a;
    private boolean b = false;
    private boolean c = false;
    public final float[] h = {0.0f, 0.0f};
    public final int[] i = {-2147483647, Integer.MAX_VALUE};
    public final int j;
    public final int k;
    public float l = 0.0f;
    public VelocityTracker m;
    protected boolean n = false;
    public boolean o = false;
    public final int p = 500;
    protected final Scroller q;

    public alfe(Context context) {
        super(context);
        Context context2 = getContext();
        setFocusable(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.a = viewConfiguration.getScaledTouchSlop();
        this.k = viewConfiguration.getScaledMinimumFlingVelocity();
        this.j = viewConfiguration.getScaledMaximumFlingVelocity();
        this.q = new Scroller(context2, d);
    }

    private final void a() {
        if (!this.n && this.q.isFinished()) {
            c();
            this.b = true;
        }
        this.n = true;
        this.l = 0.0f;
        this.q.abortAnimation();
    }

    private final int b(int i2) {
        int[] iArr = this.i;
        int i3 = iArr[0];
        if (i2 < i3) {
            return i3;
        }
        int i4 = iArr[1];
        return i2 > i4 ? i4 : i2;
    }

    /* access modifiers changed from: protected */
    public void a(float f) {
        throw null;
    }

    public void c() {
    }

    public final void computeScroll() {
        if (this.q.computeScrollOffset()) {
            int currY = this.q.getCurrY();
            this.c = true;
            scrollTo(0, currY);
            this.c = false;
            invalidate();
            float f = this.l;
            if (f != 0.0f) {
                a(f);
                this.l = 0.0f;
            }
            if (currY == this.q.getFinalY()) {
                this.q.abortAnimation();
                if (this.b) {
                    this.b = false;
                    d();
                }
            }
        }
    }

    public void d() {
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return a(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r0 != 3) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            r13 = this;
            int r0 = r14.getAction()
            android.view.VelocityTracker r1 = r13.m
            if (r1 != 0) goto L_0x000e
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r13.m = r1
        L_0x000e:
            android.view.VelocityTracker r1 = r13.m
            r1.addMovement(r14)
            boolean r1 = r13.n
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x002d
            boolean r14 = r13.a((android.view.MotionEvent) r14)
            if (r14 != 0) goto L_0x002c
            if (r0 != r3) goto L_0x002c
            boolean r14 = r13.o
            if (r14 == 0) goto L_0x002c
            r13.o = r2
            boolean r14 = r13.performClick()
            return r14
        L_0x002c:
            return r3
        L_0x002d:
            r1 = 3
            if (r0 == r3) goto L_0x0052
            r4 = 2
            if (r0 == r4) goto L_0x0037
            if (r0 == r1) goto L_0x0052
            goto L_0x00ae
        L_0x0037:
            float[] r0 = r13.h
            r0 = r0[r3]
            r13.b((android.view.MotionEvent) r14)
            float[] r14 = r13.h
            r14 = r14[r3]
            int r1 = r13.getScrollY()
            float r0 = r0 - r14
            int r14 = java.lang.Math.round(r0)
            int r1 = r1 + r14
            r13.a((int) r1)
            r13.o = r2
            goto L_0x00ae
        L_0x0052:
            r13.n = r2
            r14 = 0
            if (r0 == r1) goto L_0x009e
            int r0 = r13.getChildCount()
            if (r0 > 0) goto L_0x005e
            goto L_0x009e
        L_0x005e:
            android.view.VelocityTracker r0 = r13.m
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r13.j
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            android.view.VelocityTracker r0 = r13.m
            float r0 = r0.getYVelocity()
            int r1 = r13.k
            float r4 = (float) r1
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0076
            goto L_0x0080
        L_0x0076:
            int r1 = -r1
            float r1 = (float) r1
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0080
            r13.a((float) r14)
            goto L_0x00a2
        L_0x0080:
            float r14 = -r0
            r13.l = r14
            int r5 = r13.getScrollX()
            int r6 = r13.getScrollY()
            android.widget.Scroller r4 = r13.q
            int[] r0 = r13.i
            r7 = 0
            int r8 = (int) r14
            r9 = 0
            r10 = 0
            r11 = r0[r2]
            r12 = r0[r3]
            r4.fling(r5, r6, r7, r8, r9, r10, r11, r12)
            r13.invalidate()
            goto L_0x00a2
        L_0x009e:
            r13.a((float) r14)
        L_0x00a2:
            android.view.VelocityTracker r14 = r13.m
            if (r14 == 0) goto L_0x00ac
            r14.recycle()
            r14 = 0
            r13.m = r14
        L_0x00ac:
            r13.o = r2
        L_0x00ae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alfe.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void scrollTo(int i2, int i3) {
        super.scrollTo(i2, i3);
        if (!this.c) {
            this.q.abortAnimation();
        }
    }

    public final boolean showContextMenuForChild(View view) {
        requestDisallowInterceptTouchEvent(true);
        return super.showContextMenuForChild(view);
    }

    /* access modifiers changed from: protected */
    public final void b(MotionEvent motionEvent) {
        this.h[0] = motionEvent.getX();
        this.h[1] = motionEvent.getY();
    }

    /* access modifiers changed from: protected */
    public final void a(int i2) {
        scrollTo(0, b(i2));
    }

    public alfe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = getContext();
        setFocusable(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.a = viewConfiguration.getScaledTouchSlop();
        this.k = viewConfiguration.getScaledMinimumFlingVelocity();
        this.j = viewConfiguration.getScaledMaximumFlingVelocity();
        this.q = new Scroller(context2, d);
    }

    public final void a(int i2, int i3) {
        int[] iArr = this.i;
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public final void a(int i2, boolean z, int i3) {
        if (z) {
            i2 = b(i2);
        }
        this.q.startScroll(0, getScrollY(), 0, i2 - getScrollY(), i3);
        invalidate();
    }

    public alfe(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Context context2 = getContext();
        setFocusable(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.a = viewConfiguration.getScaledTouchSlop();
        this.k = viewConfiguration.getScaledMinimumFlingVelocity();
        this.j = viewConfiguration.getScaledMaximumFlingVelocity();
        this.q = new Scroller(context2, d);
    }

    public final boolean a(MotionEvent motionEvent) {
        boolean z;
        if (!this.n) {
            int action = motionEvent.getAction();
            if (action == 0) {
                b(motionEvent);
                if (this.q.isFinished()) {
                    this.o = true;
                } else {
                    a();
                    return true;
                }
            } else if (action == 2) {
                float x = motionEvent.getX() - this.h[0];
                float y = motionEvent.getY() - this.h[1];
                int i2 = this.a;
                float f = (float) i2;
                if (x > f || x < ((float) (-i2))) {
                    z = true;
                } else {
                    z = false;
                }
                if ((y > f || y < ((float) (-i2))) && !z) {
                    b(motionEvent);
                    a();
                    return true;
                }
            }
            return false;
        }
        this.n = false;
        return false;
    }
}
