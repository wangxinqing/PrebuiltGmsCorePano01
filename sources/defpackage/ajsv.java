package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: ajsv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajsv extends sc {
    final /* synthetic */ SwipeDismissBehavior a;
    private int b;
    private int c = -1;

    public ajsv(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    public final int a(View view) {
        return view.getWidth();
    }

    public final boolean b(View view, int i) {
        int i2 = this.c;
        return (i2 == -1 || i2 == i) && this.a.d(view);
    }

    public final int c(View view, int i) {
        int i2;
        int i3;
        int h = qb.h(view);
        int i4 = this.a.b;
        if (i4 != 0) {
            if (i4 != 1) {
                i3 = this.b - view.getWidth();
                i2 = this.b + view.getWidth();
            } else if (h != 1) {
                i3 = this.b - view.getWidth();
                i2 = this.b;
            } else {
                i3 = this.b;
                i2 = i3 + view.getWidth();
            }
        } else if (h == 1) {
            i3 = this.b - view.getWidth();
            i2 = this.b;
        } else {
            i3 = this.b;
            i2 = i3 + view.getWidth();
        }
        return Math.min(Math.max(i3, i), i2);
    }

    public final int d(View view, int i) {
        return view.getTop();
    }

    public final void a(int i) {
        akan akan = this.a.f;
        if (akan == null) {
            return;
        }
        if (i != 0) {
            akba.a().a(akan.a.m);
        } else {
            akba.a().b(akan.a.m);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (java.lang.Math.abs(r6.getLeft() - r5.b) >= java.lang.Math.round(((float) r6.getWidth()) * r5.a.c)) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        r1 = r5.b;
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r6, float r7, float r8) {
        /*
            r5 = this;
            r8 = -1
            r5.c = r8
            int r8 = r6.getWidth()
            r0 = 1
            r1 = 0
            int r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r2 == 0) goto L_0x0033
            int r2 = defpackage.qb.h(r6)
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r5.a
            int r3 = r3.b
            r4 = 2
            if (r3 != r4) goto L_0x0019
            goto L_0x004f
        L_0x0019:
            if (r3 == 0) goto L_0x0027
            if (r2 == r0) goto L_0x0022
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 < 0) goto L_0x004f
            goto L_0x005b
        L_0x0022:
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L_0x005b
            goto L_0x004f
        L_0x0027:
            if (r2 == r0) goto L_0x002e
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L_0x005b
            goto L_0x004f
        L_0x002e:
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 < 0) goto L_0x004f
            goto L_0x005b
        L_0x0033:
            int r7 = r6.getLeft()
            int r1 = r5.b
            int r2 = r6.getWidth()
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r5.a
            float r3 = r3.c
            float r2 = (float) r2
            float r2 = r2 * r3
            int r2 = java.lang.Math.round(r2)
            int r7 = r7 - r1
            int r7 = java.lang.Math.abs(r7)
            if (r7 < r2) goto L_0x005b
        L_0x004f:
            int r7 = r6.getLeft()
            int r1 = r5.b
            if (r7 >= r1) goto L_0x0059
            int r1 = r1 - r8
            goto L_0x005a
        L_0x0059:
            int r1 = r1 + r8
        L_0x005a:
            goto L_0x005e
        L_0x005b:
            int r1 = r5.b
            r0 = 0
        L_0x005e:
            com.google.android.material.behavior.SwipeDismissBehavior r7 = r5.a
            sd r7 = r7.a
            int r8 = r6.getTop()
            boolean r7 = r7.a((int) r1, (int) r8)
            if (r7 == 0) goto L_0x0077
            ajsx r7 = new ajsx
            com.google.android.material.behavior.SwipeDismissBehavior r8 = r5.a
            r7.<init>(r8, r6, r0)
            defpackage.qb.a((android.view.View) r6, (java.lang.Runnable) r7)
            return
        L_0x0077:
            if (r0 == 0) goto L_0x0082
            com.google.android.material.behavior.SwipeDismissBehavior r7 = r5.a
            akan r7 = r7.f
            if (r7 == 0) goto L_0x0082
            r7.a(r6)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajsv.a(android.view.View, float, float):void");
    }

    public final void a(View view, int i) {
        this.c = i;
        this.b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final void a(View view, int i, int i2) {
        float width = ((float) this.b) + (((float) view.getWidth()) * this.a.d);
        float width2 = ((float) this.b) + (((float) view.getWidth()) * this.a.e);
        float f = (float) i;
        if (f <= width) {
            view.setAlpha(1.0f);
        } else if (f < width2) {
            view.setAlpha(SwipeDismissBehavior.a(1.0f - ((f - width) / (width2 - width))));
        } else {
            view.setAlpha(0.0f);
        }
    }
}
