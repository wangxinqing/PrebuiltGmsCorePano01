package defpackage;

import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: aav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aav implements View.OnTouchListener, View.OnAttachStateChangeListener {
    private final float a;
    private final int b;
    final View c;
    public boolean d;
    private final int e;
    private Runnable f;
    private Runnable g;
    private int h;
    private final int[] i = new int[2];

    public aav(View view) {
        this.c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.b = tapTimeout;
        this.e = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public abstract xl a();

    /* access modifiers changed from: protected */
    public boolean b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        xl a2 = a();
        if (a2 == null || !a2.e()) {
            return true;
        }
        a2.d();
        return true;
    }

    public final void d() {
        Runnable runnable = this.g;
        if (runnable != null) {
            this.c.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f;
        if (runnable2 != null) {
            this.c.removeCallbacks(runnable2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        if (r13 == false) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            boolean r12 = r11.d
            r0 = 3
            r1 = 1
            r2 = 0
            if (r12 == 0) goto L_0x006d
            android.view.View r3 = r11.c
            xl r4 = r11.a()
            if (r4 == 0) goto L_0x0061
            boolean r5 = r4.e()
            if (r5 == 0) goto L_0x0061
            android.widget.ListView r4 = r4.g()
            aan r4 = (defpackage.aan) r4
            if (r4 == 0) goto L_0x0061
            boolean r5 = r4.isShown()
            if (r5 == 0) goto L_0x0061
            android.view.MotionEvent r5 = android.view.MotionEvent.obtainNoHistory(r13)
            int[] r6 = r11.i
            r3.getLocationOnScreen(r6)
            r3 = r6[r2]
            float r3 = (float) r3
            r6 = r6[r1]
            float r6 = (float) r6
            r5.offsetLocation(r3, r6)
            int[] r3 = r11.i
            r4.getLocationOnScreen(r3)
            r6 = r3[r2]
            int r6 = -r6
            float r6 = (float) r6
            r3 = r3[r1]
            int r3 = -r3
            float r3 = (float) r3
            r5.offsetLocation(r6, r3)
            int r3 = r11.h
            boolean r3 = r4.a((android.view.MotionEvent) r5, (int) r3)
            r5.recycle()
            int r13 = r13.getActionMasked()
            if (r13 != r1) goto L_0x0056
            r13 = 0
            goto L_0x005b
        L_0x0056:
            if (r13 == r0) goto L_0x005a
            r13 = 1
            goto L_0x005b
        L_0x005a:
            r13 = 0
        L_0x005b:
            if (r3 != 0) goto L_0x005e
            goto L_0x0061
        L_0x005e:
            if (r13 == 0) goto L_0x0061
            goto L_0x006a
        L_0x0061:
            boolean r13 = r11.c()
            if (r13 == 0) goto L_0x006a
            r13 = 0
            goto L_0x0122
        L_0x006a:
            r13 = 1
            goto L_0x0122
        L_0x006d:
            android.view.View r3 = r11.c
            boolean r4 = r3.isEnabled()
            if (r4 == 0) goto L_0x0109
            int r4 = r13.getActionMasked()
            if (r4 == 0) goto L_0x00db
            if (r4 == r1) goto L_0x00d6
            r5 = 2
            if (r4 == r5) goto L_0x0085
            if (r4 == r0) goto L_0x00d6
            r13 = 0
            goto L_0x010b
        L_0x0085:
            int r0 = r11.h
            int r0 = r13.findPointerIndex(r0)
            if (r0 < 0) goto L_0x00d4
            float r4 = r13.getX(r0)
            float r13 = r13.getY(r0)
            float r0 = r11.a
            float r5 = -r0
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x009d
            goto L_0x00c0
        L_0x009d:
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00c0
            int r5 = r3.getRight()
            int r6 = r3.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00c0
            int r4 = r3.getBottom()
            int r5 = r3.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r0
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 >= 0) goto L_0x00c0
            goto L_0x00d4
        L_0x00c0:
            r11.d()
            android.view.ViewParent r13 = r3.getParent()
            r13.requestDisallowInterceptTouchEvent(r1)
            boolean r13 = r11.b()
            if (r13 == 0) goto L_0x00d2
            r13 = 1
            goto L_0x010b
        L_0x00d2:
            r13 = 0
            goto L_0x010b
        L_0x00d4:
            r13 = 0
            goto L_0x010b
        L_0x00d6:
            r11.d()
            r13 = 0
            goto L_0x010b
        L_0x00db:
            int r13 = r13.getPointerId(r2)
            r11.h = r13
            java.lang.Runnable r13 = r11.f
            if (r13 != 0) goto L_0x00ed
            aat r13 = new aat
            r13.<init>(r11)
            r11.f = r13
        L_0x00ed:
            java.lang.Runnable r13 = r11.f
            int r0 = r11.b
            long r4 = (long) r0
            r3.postDelayed(r13, r4)
            java.lang.Runnable r13 = r11.g
            if (r13 != 0) goto L_0x0100
            aau r13 = new aau
            r13.<init>(r11)
            r11.g = r13
        L_0x0100:
            java.lang.Runnable r13 = r11.g
            int r0 = r11.e
            long r4 = (long) r0
            r3.postDelayed(r13, r4)
            goto L_0x010a
        L_0x0109:
        L_0x010a:
            r13 = 0
        L_0x010b:
            if (r13 == 0) goto L_0x0122
            long r5 = android.os.SystemClock.uptimeMillis()
            r7 = 3
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r5
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            android.view.View r3 = r11.c
            r3.onTouchEvent(r0)
            r0.recycle()
        L_0x0122:
            r11.d = r13
            if (r13 != 0) goto L_0x0129
            if (r12 != 0) goto L_0x0129
            return r2
        L_0x0129:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aav.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        this.d = false;
        this.h = -1;
        Runnable runnable = this.f;
        if (runnable != null) {
            this.c.removeCallbacks(runnable);
        }
    }
}
