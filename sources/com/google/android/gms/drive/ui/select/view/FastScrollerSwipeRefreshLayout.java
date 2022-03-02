package com.google.android.gms.drive.ui.select.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FastScrollerSwipeRefreshLayout extends SwipeRefreshLayout {
    public lrb m;

    public FastScrollerSwipeRefreshLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        lrb lrb = this.m;
        if (lrb == null || lrb.r <= 0 || motionEvent.getAction() != 0 || !lrb.a(motionEvent.getX(), motionEvent.getY())) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        lrb.a(3);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0184  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            boolean r0 = r17.isEnabled()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0188
            r0 = r17
            lrb r3 = r0.m
            if (r3 == 0) goto L_0x018a
            int r4 = r3.r
            if (r4 == 0) goto L_0x018a
            int r4 = r18.getAction()
            r5 = 3
            if (r4 != 0) goto L_0x004c
            float r4 = r18.getX()
            float r6 = r18.getY()
            boolean r4 = r3.a((float) r4, (float) r6)
            if (r4 == 0) goto L_0x018a
            r3.a(r5)
            acg r2 = r3.t
            if (r2 == 0) goto L_0x002f
            goto L_0x0036
        L_0x002f:
            android.support.v7.widget.RecyclerView r2 = r3.i
            if (r2 == 0) goto L_0x0036
            r3.d()
        L_0x0036:
            r4 = 0
            r6 = 0
            r8 = 3
            r9 = 0
            r10 = 0
            r11 = 0
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            android.support.v7.widget.RecyclerView r3 = r3.i
            r3.onTouchEvent(r2)
            r2.recycle()
            goto L_0x0192
        L_0x004c:
            r6 = 2
            if (r4 != r1) goto L_0x0066
            int r4 = r3.r
            if (r4 != r5) goto L_0x018a
            r3.a(r6)
            android.os.Handler r2 = r3.s
            lqz r4 = r3.q
            r2.removeCallbacks(r4)
            lqz r3 = r3.q
            r4 = 1000(0x3e8, double:4.94E-321)
            r2.postDelayed(r3, r4)
            goto L_0x0192
        L_0x0066:
            if (r4 != r6) goto L_0x018a
            int r4 = r3.r
            if (r4 != r5) goto L_0x018a
            android.support.v7.widget.RecyclerView r4 = r3.i
            int r4 = r4.getHeight()
            float r5 = r18.getY()
            int r7 = r3.d
            int r5 = (int) r5
            int r5 = r5 - r7
            int r5 = r5 + 10
            if (r5 < 0) goto L_0x0086
            int r8 = r5 + r7
            if (r8 > r4) goto L_0x0083
            goto L_0x0087
        L_0x0083:
            int r5 = r4 - r7
            goto L_0x0087
        L_0x0086:
            r5 = 0
        L_0x0087:
            int r7 = r3.f
            int r7 = r7 - r5
            int r7 = java.lang.Math.abs(r7)
            if (r7 < r6) goto L_0x0192
            r3.f = r5
            boolean r5 = r3.j
            if (r5 == 0) goto L_0x0097
            goto L_0x009d
        L_0x0097:
            int r5 = r18.hashCode()
            if (r5 == 0) goto L_0x0192
        L_0x009d:
            int r5 = r3.f
            float r5 = (float) r5
            int r6 = r3.d
            int r4 = r4 - r6
            float r4 = (float) r4
            float r5 = r5 / r4
            android.support.v7.widget.RecyclerView r4 = r3.i
            acg r4 = r4.getAdapter()
            int r4 = r4.a()
            r3.j = r2
            float r6 = (float) r4
            r7 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 / r6
            r8 = 1090519040(0x41000000, float:8.0)
            float r7 = r7 / r8
            java.lang.Object[] r8 = r3.n
            if (r8 != 0) goto L_0x00bf
            r1 = -1
            goto L_0x0141
        L_0x00bf:
            int r10 = r8.length
            if (r10 <= r1) goto L_0x0140
            float r6 = (float) r10
            float r11 = r5 * r6
            int r11 = (int) r11
            if (r11 >= r10) goto L_0x00c9
            goto L_0x00cb
        L_0x00c9:
            int r11 = r10 + -1
        L_0x00cb:
            android.widget.SectionIndexer r12 = r3.u
            int r12 = r12.getPositionForSection(r11)
            int r13 = r11 + 1
            int r14 = r10 + -1
            if (r11 >= r14) goto L_0x00de
            android.widget.SectionIndexer r14 = r3.u
            int r14 = r14.getPositionForSection(r13)
            goto L_0x00df
        L_0x00de:
            r14 = r4
        L_0x00df:
            if (r14 == r12) goto L_0x00e4
            r1 = r11
            r15 = r1
            goto L_0x010e
        L_0x00e4:
            r15 = r11
            r16 = r12
        L_0x00e7:
            if (r15 <= 0) goto L_0x0100
            int r15 = r15 + -1
            android.widget.SectionIndexer r1 = r3.u
            int r1 = r1.getPositionForSection(r15)
            if (r1 == r12) goto L_0x00f6
            r12 = r1
            r1 = r15
            goto L_0x0104
        L_0x00f6:
            if (r15 != 0) goto L_0x00fc
            r12 = r1
            r1 = r11
            r15 = 0
            goto L_0x0104
        L_0x00fc:
            r16 = r1
            r1 = 1
            goto L_0x00e7
        L_0x0100:
            r1 = r11
            r15 = r1
            r12 = r16
        L_0x0104:
            if (r15 != 0) goto L_0x010d
            android.widget.SectionIndexer r15 = r3.u
            int r15 = r15.getSectionForPosition(r2)
            goto L_0x010e
        L_0x010d:
        L_0x010e:
            int r16 = r13 + 1
            r2 = r16
        L_0x0112:
            if (r2 < r10) goto L_0x0115
            goto L_0x0122
        L_0x0115:
            android.widget.SectionIndexer r9 = r3.u
            int r9 = r9.getPositionForSection(r2)
            if (r9 != r14) goto L_0x0122
            int r2 = r2 + 1
            int r13 = r13 + 1
            goto L_0x0112
        L_0x0122:
            float r2 = (float) r1
            float r2 = r2 / r6
            float r9 = (float) r13
            float r9 = r9 / r6
            if (r1 == r11) goto L_0x0129
        L_0x0128:
            goto L_0x0130
        L_0x0129:
            float r1 = r5 - r2
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0128
            goto L_0x0139
        L_0x0130:
            int r14 = r14 - r12
            float r1 = (float) r14
            float r5 = r5 - r2
            float r1 = r1 * r5
            float r9 = r9 - r2
            float r1 = r1 / r9
            int r1 = (int) r1
            int r12 = r12 + r1
        L_0x0139:
            r1 = -1
            int r4 = r4 + r1
            if (r12 <= r4) goto L_0x013e
            r12 = r4
        L_0x013e:
            r9 = r15
            goto L_0x0145
        L_0x0140:
            r1 = -1
        L_0x0141:
            float r5 = r5 * r6
            int r12 = (int) r5
            r9 = -1
        L_0x0145:
            android.support.v7.widget.RecyclerView r1 = r3.i
            act r1 = r1.getLayoutManager()
            boolean r1 = r1 instanceof defpackage.abk
            if (r1 == 0) goto L_0x015c
            android.support.v7.widget.RecyclerView r1 = r3.i
            act r1 = r1.getLayoutManager()
            abk r1 = (defpackage.abk) r1
            r2 = 0
            r1.e((int) r12, (int) r2)
            goto L_0x0161
        L_0x015c:
            android.support.v7.widget.RecyclerView r1 = r3.i
            r1.scrollToPosition(r12)
        L_0x0161:
            if (r9 < 0) goto L_0x0184
            r1 = r8[r9]
            java.lang.String r1 = r1.toString()
            r3.o = r1
            int r2 = r1.length()
            r4 = 1
            if (r2 != r4) goto L_0x017b
            r2 = 0
            char r1 = r1.charAt(r2)
            r2 = 32
            if (r1 == r2) goto L_0x0180
        L_0x017b:
            int r1 = r8.length
            if (r9 >= r1) goto L_0x0180
            r2 = 1
            goto L_0x0181
        L_0x0180:
            r2 = 0
        L_0x0181:
            r3.p = r2
            goto L_0x0192
        L_0x0184:
            r1 = 0
            r3.p = r1
            goto L_0x0192
        L_0x0188:
            r0 = r17
        L_0x018a:
            boolean r1 = super.onTouchEvent(r18)
            if (r1 != 0) goto L_0x0192
            r1 = 0
            return r1
        L_0x0192:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.drive.ui.select.view.FastScrollerSwipeRefreshLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public FastScrollerSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnHierarchyChangeListener(new lrc(this));
    }
}
