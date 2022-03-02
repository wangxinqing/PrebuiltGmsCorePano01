package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.android.volley.toolbox.ImageRequest;
import java.util.Arrays;

/* renamed from: sd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sd {
    private static final Interpolator u = new sa();
    public int a;
    public final int b;
    public int c = -1;
    public View d;
    private float[] e;
    private float[] f;
    private float[] g;
    private float[] h;
    private int[] i;
    private int[] j;
    private int[] k;
    private int l;
    private VelocityTracker m;
    private final float n;
    private final float o;
    private final int p;
    private final OverScroller q;
    private final sc r;
    private boolean s;
    private final ViewGroup t;
    private final Runnable v = new sb(this);

    private sd(Context context, ViewGroup viewGroup, sc scVar) {
        if (scVar != null) {
            this.t = viewGroup;
            this.r = scVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.p = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.b = viewConfiguration.getScaledTouchSlop();
            this.n = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.o = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.q = new OverScroller(context, u);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    private static final float a(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        if (abs > f4) {
            return f2 <= 0.0f ? -f4 : f4;
        }
        return f2;
    }

    private static final int b(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        if (abs > i4) {
            return i2 <= 0 ? -i4 : i4;
        }
        return i2;
    }

    private final void c() {
        this.m.computeCurrentVelocity(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.n);
        a(a(this.m.getXVelocity(this.c), this.o, this.n), a(this.m.getYVelocity(this.c), this.o, this.n));
    }

    private final boolean d(int i2) {
        if (a(i2)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final boolean a(int i2) {
        return ((1 << i2) & this.l) != 0;
    }

    private final int a(int i2, int i3, int i4) {
        int i5;
        if (i2 == 0) {
            return 0;
        }
        int width = this.t.getWidth();
        float f2 = (float) (width / 2);
        float sin = f2 + (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width)) - 8.0f) * 0.47123894f))) * f2);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f);
        }
        return Math.min(i5, 600);
    }

    private final void b(float f2, float f3, int i2) {
        c(f2, f3, i2);
        c(f3, f2, i2);
        c(f2, f3, i2);
        c(f3, f2, i2);
    }

    public final View b(int i2, int i3) {
        for (int childCount = this.t.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.t.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    private final void c(float f2, float f3, int i2) {
        Math.abs(f2);
        Math.abs(f3);
        int i3 = this.i[i2];
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        this.t.removeCallbacks(this.v);
        if (this.a != i2) {
            this.a = i2;
            this.r.a(i2);
            if (this.a == 0) {
                this.d = null;
            }
        }
    }

    public static sd a(ViewGroup viewGroup, sc scVar) {
        return new sd(viewGroup.getContext(), viewGroup, scVar);
    }

    private final void c(int i2) {
        if (this.e != null && a(i2)) {
            this.e[i2] = 0.0f;
            this.f[i2] = 0.0f;
            this.g[i2] = 0.0f;
            this.h[i2] = 0.0f;
            this.i[i2] = 0;
            this.j[i2] = 0;
            this.k[i2] = 0;
            this.l = ((1 << i2) ^ -1) & this.l;
        }
    }

    private final void a(float f2, float f3) {
        this.s = true;
        this.r.a(this.d, f2, f3);
        this.s = false;
        if (this.a == 1) {
            b(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        if (r9.c == -1) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006e, code lost:
        c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.view.MotionEvent r10) {
        /*
            r9 = this;
            int r0 = r10.getActionMasked()
            int r1 = r10.getActionIndex()
            if (r0 == 0) goto L_0x000b
            goto L_0x000e
        L_0x000b:
            r9.a()
        L_0x000e:
            android.view.VelocityTracker r2 = r9.m
            if (r2 == 0) goto L_0x0013
            goto L_0x0019
        L_0x0013:
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r9.m = r2
        L_0x0019:
            android.view.VelocityTracker r2 = r9.m
            r2.addMovement(r10)
            r2 = 0
            if (r0 == 0) goto L_0x018b
            r3 = 1
            if (r0 == r3) goto L_0x0180
            r4 = 2
            if (r0 == r4) goto L_0x00c6
            r4 = 3
            if (r0 == r4) goto L_0x00ba
            r4 = 5
            if (r0 == r4) goto L_0x0075
            r4 = 6
            if (r0 == r4) goto L_0x0032
            goto L_0x017f
        L_0x0032:
            int r0 = r10.getPointerId(r1)
            int r1 = r9.a
            if (r1 != r3) goto L_0x0071
            int r1 = r9.c
            if (r0 != r1) goto L_0x0071
            int r1 = r10.getPointerCount()
        L_0x0042:
            if (r2 >= r1) goto L_0x006e
            int r3 = r10.getPointerId(r2)
            int r4 = r9.c
            if (r3 == r4) goto L_0x006b
            float r4 = r10.getX(r2)
            float r5 = r10.getY(r2)
            int r4 = (int) r4
            int r5 = (int) r5
            android.view.View r4 = r9.b((int) r4, (int) r5)
            android.view.View r5 = r9.d
            if (r4 == r5) goto L_0x005f
            goto L_0x006b
        L_0x005f:
            boolean r3 = r9.b((android.view.View) r5, (int) r3)
            if (r3 == 0) goto L_0x006b
            int r10 = r9.c
            r1 = -1
            if (r10 != r1) goto L_0x0071
            goto L_0x006e
        L_0x006b:
            int r2 = r2 + 1
            goto L_0x0042
        L_0x006e:
            r9.c()
        L_0x0071:
            r9.c((int) r0)
            return
        L_0x0075:
            int r0 = r10.getPointerId(r1)
            float r2 = r10.getX(r1)
            float r10 = r10.getY(r1)
            r9.a((float) r2, (float) r10, (int) r0)
            int r1 = r9.a
            if (r1 != 0) goto L_0x0096
            int r1 = (int) r2
            int r10 = (int) r10
            android.view.View r10 = r9.b((int) r1, (int) r10)
            r9.b((android.view.View) r10, (int) r0)
            int[] r10 = r9.i
            r10 = r10[r0]
            return
        L_0x0096:
            int r1 = (int) r2
            int r10 = (int) r10
            android.view.View r2 = r9.d
            if (r2 == 0) goto L_0x017f
            int r3 = r2.getLeft()
            if (r1 < r3) goto L_0x017f
            int r3 = r2.getRight()
            if (r1 >= r3) goto L_0x017f
            int r1 = r2.getTop()
            if (r10 < r1) goto L_0x017f
            int r1 = r2.getBottom()
            if (r10 >= r1) goto L_0x017f
            android.view.View r10 = r9.d
            r9.b((android.view.View) r10, (int) r0)
            return
        L_0x00ba:
            int r10 = r9.a
            if (r10 != r3) goto L_0x00c2
            r10 = 0
            r9.a((float) r10, (float) r10)
        L_0x00c2:
            r9.a()
            return
        L_0x00c6:
            int r0 = r9.a
            if (r0 == r3) goto L_0x0110
            int r0 = r10.getPointerCount()
        L_0x00ce:
            if (r2 >= r0) goto L_0x010c
            int r1 = r10.getPointerId(r2)
            boolean r4 = r9.d(r1)
            if (r4 == 0) goto L_0x0109
            float r4 = r10.getX(r2)
            float r5 = r10.getY(r2)
            float[] r6 = r9.e
            r6 = r6[r1]
            float r6 = r4 - r6
            float[] r7 = r9.f
            r7 = r7[r1]
            float r7 = r5 - r7
            r9.b((float) r6, (float) r7, (int) r1)
            int r8 = r9.a
            if (r8 == r3) goto L_0x010c
            int r4 = (int) r4
            int r5 = (int) r5
            android.view.View r4 = r9.b((int) r4, (int) r5)
            boolean r5 = r9.a((android.view.View) r4, (float) r6, (float) r7)
            if (r5 != 0) goto L_0x0102
            goto L_0x0109
        L_0x0102:
            boolean r1 = r9.b((android.view.View) r4, (int) r1)
            if (r1 == 0) goto L_0x0109
            goto L_0x010c
        L_0x0109:
            int r2 = r2 + 1
            goto L_0x00ce
        L_0x010c:
            r9.c((android.view.MotionEvent) r10)
            return
        L_0x0110:
            int r0 = r9.c
            boolean r0 = r9.d(r0)
            if (r0 == 0) goto L_0x017f
            int r0 = r9.c
            int r0 = r10.findPointerIndex(r0)
            float r1 = r10.getX(r0)
            float r0 = r10.getY(r0)
            float[] r2 = r9.g
            int r3 = r9.c
            r2 = r2[r3]
            float r1 = r1 - r2
            int r1 = (int) r1
            float[] r2 = r9.h
            r2 = r2[r3]
            float r0 = r0 - r2
            int r0 = (int) r0
            android.view.View r2 = r9.d
            int r2 = r2.getLeft()
            int r2 = r2 + r1
            android.view.View r3 = r9.d
            int r3 = r3.getTop()
            int r3 = r3 + r0
            android.view.View r4 = r9.d
            int r4 = r4.getLeft()
            android.view.View r5 = r9.d
            int r5 = r5.getTop()
            if (r1 == 0) goto L_0x015f
            sc r6 = r9.r
            android.view.View r7 = r9.d
            int r2 = r6.c(r7, r2)
            android.view.View r6 = r9.d
            int r4 = r2 - r4
            defpackage.qb.h(r6, r4)
        L_0x015f:
            if (r0 == 0) goto L_0x0170
            sc r4 = r9.r
            android.view.View r6 = r9.d
            int r3 = r4.d(r6, r3)
            android.view.View r4 = r9.d
            int r5 = r3 - r5
            defpackage.qb.g(r4, r5)
        L_0x0170:
            if (r1 == 0) goto L_0x0173
            goto L_0x0175
        L_0x0173:
            if (r0 == 0) goto L_0x017c
        L_0x0175:
            sc r0 = r9.r
            android.view.View r1 = r9.d
            r0.a((android.view.View) r1, (int) r2, (int) r3)
        L_0x017c:
            r9.c((android.view.MotionEvent) r10)
        L_0x017f:
            return
        L_0x0180:
            int r10 = r9.a
            if (r10 != r3) goto L_0x0187
            r9.c()
        L_0x0187:
            r9.a()
            return
        L_0x018b:
            float r0 = r10.getX()
            float r1 = r10.getY()
            int r10 = r10.getPointerId(r2)
            int r2 = (int) r0
            int r3 = (int) r1
            android.view.View r2 = r9.b((int) r2, (int) r3)
            r9.a((float) r0, (float) r1, (int) r10)
            r9.b((android.view.View) r2, (int) r10)
            int[] r0 = r9.i
            r10 = r0[r10]
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd.b(android.view.MotionEvent):void");
    }

    private final void c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (d(pointerId)) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.g[pointerId] = x;
                this.h[pointerId] = y;
            }
        }
    }

    private final void a(float f2, float f3, int i2) {
        float[] fArr = this.e;
        int i3 = 0;
        if (fArr == null || fArr.length <= i2) {
            int i4 = i2 + 1;
            float[] fArr2 = new float[i4];
            float[] fArr3 = new float[i4];
            float[] fArr4 = new float[i4];
            float[] fArr5 = new float[i4];
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.g;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.h;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.i;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.j;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.k;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.e = fArr2;
            this.f = fArr3;
            this.g = fArr4;
            this.h = fArr5;
            this.i = iArr;
            this.j = iArr2;
            this.k = iArr3;
        }
        float[] fArr9 = this.e;
        this.g[i2] = f2;
        fArr9[i2] = f2;
        float[] fArr10 = this.f;
        this.h[i2] = f3;
        fArr10[i2] = f3;
        int[] iArr7 = this.i;
        int i5 = (int) f2;
        int i6 = (int) f3;
        if (i5 < this.t.getLeft() + this.p) {
            i3 = 1;
        }
        if (i6 < this.t.getTop() + this.p) {
            i3 |= 4;
        }
        if (i5 > this.t.getRight() - this.p) {
            i3 |= 2;
        }
        if (i6 > this.t.getBottom() - this.p) {
            i3 |= 8;
        }
        iArr7[i2] = i3;
        this.l |= 1 << i2;
    }

    private final boolean a(View view, float f2, float f3) {
        if (view != null) {
            int a2 = this.r.a(view);
            int a3 = this.r.a();
            if (a2 <= 0 || a3 <= 0) {
                return a2 > 0 ? Math.abs(f2) > ((float) this.b) : a3 > 0 && Math.abs(f3) > ((float) this.b);
            }
            int i2 = this.b;
            return (f2 * f2) + (f3 * f3) > ((float) (i2 * i2));
        }
    }

    public final void a() {
        this.c = -1;
        float[] fArr = this.e;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0.0f);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            Arrays.fill(this.k, 0);
            this.l = 0;
        }
        VelocityTracker velocityTracker = this.m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.m = null;
        }
    }

    public final void a(View view, int i2) {
        if (view.getParent() == this.t) {
            this.d = view;
            this.c = i2;
            this.r.a(view, i2);
            b(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.t + ")");
    }

    public final boolean a(int i2, int i3) {
        if (this.s) {
            return a(i2, i3, (int) this.m.getXVelocity(this.c), (int) this.m.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final boolean a(int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        int left = this.d.getLeft();
        int top = this.d.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.q.abortAnimation();
            b(0);
            return false;
        }
        View view = this.d;
        int b2 = b(i4, (int) this.o, (int) this.n);
        int b3 = b(i5, (int) this.o, (int) this.n);
        int abs = Math.abs(i6);
        int abs2 = Math.abs(i7);
        int abs3 = Math.abs(b2);
        int abs4 = Math.abs(b3);
        int i8 = abs3 + abs4;
        int i9 = abs + abs2;
        if (b2 == 0) {
            f2 = ((float) abs) / ((float) i9);
        } else {
            f2 = ((float) abs3) / ((float) i8);
        }
        if (b3 == 0) {
            f3 = ((float) abs2) / ((float) i9);
        } else {
            f3 = ((float) abs4) / ((float) i8);
        }
        this.q.startScroll(left, top, i6, i7, (int) ((((float) a(i6, b2, this.r.a(view))) * f2) + (((float) a(i7, b3, this.r.a())) * f3)));
        b(2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d1, code lost:
        if (r12 != r11) goto L_0x00da;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 == 0) goto L_0x000f
            goto L_0x0012
        L_0x000f:
            r16.a()
        L_0x0012:
            android.view.VelocityTracker r4 = r0.m
            if (r4 == 0) goto L_0x0017
            goto L_0x001d
        L_0x0017:
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.m = r4
        L_0x001d:
            android.view.VelocityTracker r4 = r0.m
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x00f7
            if (r2 == r6) goto L_0x00f3
            if (r2 == r4) goto L_0x0068
            r7 = 3
            if (r2 == r7) goto L_0x00f3
            r7 = 5
            if (r2 == r7) goto L_0x003e
            r4 = 6
            if (r2 == r4) goto L_0x0035
            goto L_0x011d
        L_0x0035:
            int r1 = r1.getPointerId(r3)
            r0.c((int) r1)
            goto L_0x011d
        L_0x003e:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.a((float) r7, (float) r1, (int) r2)
            int r3 = r0.a
            if (r3 != 0) goto L_0x0057
            int[] r1 = r0.i
            r1 = r1[r2]
            goto L_0x011d
        L_0x0057:
            if (r3 != r4) goto L_0x011d
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.b((int) r3, (int) r1)
            android.view.View r3 = r0.d
            if (r1 != r3) goto L_0x011d
            r0.b((android.view.View) r1, (int) r2)
            goto L_0x011d
        L_0x0068:
            float[] r2 = r0.e
            if (r2 == 0) goto L_0x011d
            float[] r2 = r0.f
            if (r2 == 0) goto L_0x011d
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x0075:
            if (r3 >= r2) goto L_0x00ef
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.d(r4)
            if (r7 == 0) goto L_0x00ec
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.e
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.b((int) r7, (int) r8)
            if (r7 == 0) goto L_0x00a5
            boolean r8 = r0.a((android.view.View) r7, (float) r9, (float) r10)
            if (r8 == 0) goto L_0x00a5
            r8 = 1
            goto L_0x00a6
        L_0x00a5:
            r8 = 0
        L_0x00a6:
            if (r8 == 0) goto L_0x00da
            int r11 = r7.getLeft()
            sc r12 = r0.r
            int r13 = (int) r9
            int r13 = r13 + r11
            int r12 = r12.c(r7, r13)
            int r13 = r7.getTop()
            sc r14 = r0.r
            int r15 = (int) r10
            int r15 = r15 + r13
            int r14 = r14.d(r7, r15)
            sc r15 = r0.r
            int r15 = r15.a((android.view.View) r7)
            sc r5 = r0.r
            int r5 = r5.a()
            if (r15 == 0) goto L_0x00d3
            if (r15 > 0) goto L_0x00d1
            goto L_0x00da
        L_0x00d1:
            if (r12 != r11) goto L_0x00da
        L_0x00d3:
            if (r5 == 0) goto L_0x00ef
            if (r5 <= 0) goto L_0x00da
            if (r14 != r13) goto L_0x00da
            goto L_0x00ef
        L_0x00da:
            r0.b((float) r9, (float) r10, (int) r4)
            int r5 = r0.a
            if (r5 != r6) goto L_0x00e2
            goto L_0x00ef
        L_0x00e2:
            if (r8 != 0) goto L_0x00e5
            goto L_0x00ec
        L_0x00e5:
            boolean r4 = r0.b((android.view.View) r7, (int) r4)
            if (r4 == 0) goto L_0x00ec
            goto L_0x00ef
        L_0x00ec:
            int r3 = r3 + 1
            goto L_0x0075
        L_0x00ef:
            r16.c((android.view.MotionEvent) r17)
            goto L_0x011d
        L_0x00f3:
            r16.a()
            goto L_0x011d
        L_0x00f7:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.a((float) r2, (float) r3, (int) r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.b((int) r2, (int) r3)
            android.view.View r3 = r0.d
            if (r2 == r3) goto L_0x0112
            goto L_0x0119
        L_0x0112:
            int r3 = r0.a
            if (r3 != r4) goto L_0x0119
            r0.b((android.view.View) r2, (int) r1)
        L_0x0119:
            int[] r2 = r0.i
            r1 = r2[r1]
        L_0x011d:
            int r1 = r0.a
            if (r1 != r6) goto L_0x0122
            return r6
        L_0x0122:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd.a(android.view.MotionEvent):boolean");
    }

    public final boolean b() {
        if (this.a == 2) {
            boolean computeScrollOffset = this.q.computeScrollOffset();
            int currX = this.q.getCurrX();
            int currY = this.q.getCurrY();
            int left = currX - this.d.getLeft();
            int top = currY - this.d.getTop();
            if (left != 0) {
                qb.h(this.d, left);
            }
            if (top != 0) {
                qb.g(this.d, top);
            }
            if (!(left == 0 && top == 0)) {
                this.r.a(this.d, currX, currY);
            }
            if (computeScrollOffset) {
                if (currX == this.q.getFinalX() && currY == this.q.getFinalY()) {
                    this.q.abortAnimation();
                }
            }
            this.t.post(this.v);
        }
        return this.a == 2;
    }

    /* access modifiers changed from: package-private */
    public final boolean b(View view, int i2) {
        if (view == this.d && this.c == i2) {
            return true;
        }
        if (view == null || !this.r.b(view, i2)) {
            return false;
        }
        this.c = i2;
        a(view, i2);
        return true;
    }
}
