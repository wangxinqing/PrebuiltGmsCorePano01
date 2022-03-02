package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: ajsl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ajsl extends ajso {
    private Runnable a;
    private boolean b;
    OverScroller c;
    private int d = -1;
    private int e;
    private int f = -1;
    private VelocityTracker g;

    public ajsl() {
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        int findPointerIndex;
        if (this.f < 0) {
            this.f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.b) {
            int i = this.d;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.e) > this.f) {
                this.e = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.d = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (!f(view) || !coordinatorLayout.a(view, x, y2)) {
                z = false;
            } else {
                z = true;
            }
            this.b = z;
            if (z) {
                this.e = y2;
                this.d = motionEvent.getPointerId(0);
                if (this.g == null) {
                    this.g = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.c;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.c.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.g;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public int b() {
        throw null;
    }

    public int b(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw null;
    }

    public void b(CoordinatorLayout coordinatorLayout, View view) {
        throw null;
    }

    public final int c(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return b(coordinatorLayout, view, b() - i, i2, i3);
    }

    public int d(View view) {
        throw null;
    }

    public int e(View view) {
        throw null;
    }

    public boolean f(View view) {
        throw null;
    }

    public ajsl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void b(CoordinatorLayout coordinatorLayout, View view, int i) {
        b(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout r20, android.view.View r21, android.view.MotionEvent r22) {
        /*
            r19 = this;
            r6 = r19
            r2 = r21
            r7 = r22
            int r0 = r22.getActionMasked()
            r1 = 0
            r3 = -1
            r8 = 1
            r9 = 0
            if (r0 == r8) goto L_0x0060
            r4 = 2
            if (r0 == r4) goto L_0x003b
            r2 = 3
            if (r0 == r2) goto L_0x0038
            r1 = 6
            if (r0 == r1) goto L_0x001c
            r0 = 0
            goto L_0x00d5
        L_0x001c:
            int r0 = r22.getActionIndex()
            if (r0 != 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            int r1 = r7.getPointerId(r0)
            r6.d = r1
            float r0 = r7.getY(r0)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r6.e = r0
            r0 = 0
            goto L_0x00d5
        L_0x0038:
            r0 = 0
            goto L_0x00c8
        L_0x003b:
            int r0 = r6.d
            int r0 = r7.findPointerIndex(r0)
            if (r0 == r3) goto L_0x005f
            float r0 = r7.getY(r0)
            int r0 = (int) r0
            int r1 = r6.e
            r6.e = r0
            int r3 = r1 - r0
            int r4 = r6.e(r2)
            r5 = 0
            r0 = r19
            r1 = r20
            r2 = r21
            r0.c(r1, r2, r3, r4, r5)
            r0 = 0
            goto L_0x00d5
        L_0x005f:
            return r9
        L_0x0060:
            android.view.VelocityTracker r0 = r6.g
            if (r0 == 0) goto L_0x00c7
            r0.addMovement(r7)
            android.view.VelocityTracker r0 = r6.g
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r6.g
            int r4 = r6.d
            float r0 = r0.getYVelocity(r4)
            int r4 = r6.d(r2)
            int r4 = -r4
            java.lang.Runnable r5 = r6.a
            if (r5 == 0) goto L_0x0084
            r2.removeCallbacks(r5)
            r6.a = r1
        L_0x0084:
            android.widget.OverScroller r5 = r6.c
            if (r5 == 0) goto L_0x0089
            goto L_0x0094
        L_0x0089:
            android.widget.OverScroller r5 = new android.widget.OverScroller
            android.content.Context r10 = r21.getContext()
            r5.<init>(r10)
            r6.c = r5
        L_0x0094:
            android.widget.OverScroller r10 = r6.c
            r11 = 0
            int r12 = r19.c()
            r13 = 0
            int r14 = java.lang.Math.round(r0)
            r15 = 0
            r16 = 0
            r18 = 0
            r17 = r4
            r10.fling(r11, r12, r13, r14, r15, r16, r17, r18)
            android.widget.OverScroller r0 = r6.c
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x00c0
            ajsk r0 = new ajsk
            r4 = r20
            r0.<init>(r6, r4, r2)
            r6.a = r0
            defpackage.qb.a((android.view.View) r2, (java.lang.Runnable) r0)
            r0 = 1
            goto L_0x00c8
        L_0x00c0:
            r4 = r20
            r19.b(r20, r21)
            r0 = 1
            goto L_0x00c8
        L_0x00c7:
            r0 = 0
        L_0x00c8:
            r6.b = r9
            r6.d = r3
            android.view.VelocityTracker r2 = r6.g
            if (r2 == 0) goto L_0x00d5
            r2.recycle()
            r6.g = r1
        L_0x00d5:
            android.view.VelocityTracker r1 = r6.g
            if (r1 != 0) goto L_0x00da
            goto L_0x00dd
        L_0x00da:
            r1.addMovement(r7)
        L_0x00dd:
            boolean r1 = r6.b
            if (r1 != 0) goto L_0x00e4
            if (r0 != 0) goto L_0x00e4
            return r9
        L_0x00e4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajsl.b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }
}
