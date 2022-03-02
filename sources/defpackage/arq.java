package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* renamed from: arq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arq implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    final arn a;
    final ViewGroup b;

    public arq(arn arn, ViewGroup viewGroup) {
        this.a = arn;
        this.b = viewGroup;
    }

    private final void a() {
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        this.b.removeOnAttachStateChangeListener(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: arw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onPreDraw() {
        /*
            r19 = this;
            r0 = r19
            r19.a()
            java.util.ArrayList r1 = defpackage.arr.a
            android.view.ViewGroup r2 = r0.b
            boolean r1 = r1.remove(r2)
            r2 = 1
            if (r1 == 0) goto L_0x02ab
            nz r1 = defpackage.arr.a()
            android.view.ViewGroup r3 = r0.b
            java.lang.Object r3 = r1.get(r3)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 != 0) goto L_0x002a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.view.ViewGroup r5 = r0.b
            r1.put(r5, r3)
            r5 = 0
            goto L_0x0037
        L_0x002a:
            int r5 = r3.size()
            if (r5 <= 0) goto L_0x0036
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r3)
            goto L_0x0037
        L_0x0036:
            r5 = 0
        L_0x0037:
            arn r6 = r0.a
            r3.add(r6)
            arn r3 = r0.a
            arp r6 = new arp
            r6.<init>(r0, r1)
            r3.a((defpackage.arm) r6)
            arn r1 = r0.a
            android.view.ViewGroup r3 = r0.b
            r6 = 0
            r1.a((android.view.ViewGroup) r3, (boolean) r6)
            if (r5 == 0) goto L_0x0066
            int r1 = r5.size()
            r3 = 0
        L_0x0055:
            if (r3 < r1) goto L_0x0058
            goto L_0x0066
        L_0x0058:
            java.lang.Object r7 = r5.get(r3)
            arn r7 = (defpackage.arn) r7
            android.view.ViewGroup r8 = r0.b
            r7.c((android.view.View) r8)
            int r3 = r3 + 1
            goto L_0x0055
        L_0x0066:
            arn r1 = r0.a
            android.view.ViewGroup r8 = r0.b
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.j = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.k = r3
            arx r3 = r1.f
            arx r5 = r1.g
            nz r7 = new nz
            nz r9 = r3.a
            r7.<init>((defpackage.ou) r9)
            nz r9 = new nz
            nz r10 = r5.a
            r9.<init>((defpackage.ou) r10)
            r10 = 0
        L_0x008b:
            int[] r11 = r1.i
            int r12 = r11.length
            if (r10 >= r12) goto L_0x01e7
            r11 = r11[r10]
            if (r11 == r2) goto L_0x01a5
            r12 = 2
            if (r11 == r12) goto L_0x0157
            r12 = 3
            if (r11 == r12) goto L_0x0102
            r12 = 4
            if (r11 == r12) goto L_0x00a0
            r4 = r5
            goto L_0x01de
        L_0x00a0:
            oh r11 = r3.c
            oh r12 = r5.c
            int r13 = r11.b()
            r14 = 0
        L_0x00a9:
            if (r14 >= r13) goto L_0x00fc
            java.lang.Object r15 = r11.b((int) r14)
            android.view.View r15 = (android.view.View) r15
            if (r15 != 0) goto L_0x00b6
            r17 = r5
            goto L_0x00f5
        L_0x00b6:
            boolean r16 = r1.a((android.view.View) r15)
            if (r16 == 0) goto L_0x00f3
            r17 = r5
            long r4 = r11.a((int) r14)
            java.lang.Object r4 = r12.a((long) r4)
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x00f5
            boolean r5 = r1.a((android.view.View) r4)
            if (r5 == 0) goto L_0x00f5
            java.lang.Object r5 = r7.get(r15)
            arw r5 = (defpackage.arw) r5
            java.lang.Object r18 = r9.get(r4)
            r6 = r18
            arw r6 = (defpackage.arw) r6
            if (r5 == 0) goto L_0x00f5
            if (r6 == 0) goto L_0x00f5
            java.util.ArrayList r2 = r1.j
            r2.add(r5)
            java.util.ArrayList r2 = r1.k
            r2.add(r6)
            r7.remove(r15)
            r9.remove(r4)
            goto L_0x00f5
        L_0x00f3:
            r17 = r5
        L_0x00f5:
            int r14 = r14 + 1
            r5 = r17
            r2 = 1
            r6 = 0
            goto L_0x00a9
        L_0x00fc:
            r17 = r5
            r4 = r17
            goto L_0x01de
        L_0x0102:
            r17 = r5
            android.util.SparseArray r2 = r3.b
            r4 = r17
            android.util.SparseArray r5 = r4.b
            int r6 = r2.size()
            r11 = 0
        L_0x010f:
            if (r11 >= r6) goto L_0x01de
            java.lang.Object r12 = r2.valueAt(r11)
            android.view.View r12 = (android.view.View) r12
            if (r12 != 0) goto L_0x011a
            goto L_0x0152
        L_0x011a:
            boolean r13 = r1.a((android.view.View) r12)
            if (r13 == 0) goto L_0x0152
            int r13 = r2.keyAt(r11)
            java.lang.Object r13 = r5.get(r13)
            android.view.View r13 = (android.view.View) r13
            if (r13 == 0) goto L_0x0152
            boolean r14 = r1.a((android.view.View) r13)
            if (r14 == 0) goto L_0x0152
            java.lang.Object r14 = r7.get(r12)
            arw r14 = (defpackage.arw) r14
            java.lang.Object r15 = r9.get(r13)
            arw r15 = (defpackage.arw) r15
            if (r14 == 0) goto L_0x0152
            if (r15 == 0) goto L_0x0152
            java.util.ArrayList r0 = r1.j
            r0.add(r14)
            java.util.ArrayList r0 = r1.k
            r0.add(r15)
            r7.remove(r12)
            r9.remove(r13)
        L_0x0152:
            int r11 = r11 + 1
            r0 = r19
            goto L_0x010f
        L_0x0157:
            r4 = r5
            nz r0 = r3.d
            nz r2 = r4.d
            int r5 = r0.h
            r6 = 0
        L_0x015f:
            if (r6 >= r5) goto L_0x01de
            java.lang.Object r11 = r0.c(r6)
            android.view.View r11 = (android.view.View) r11
            if (r11 != 0) goto L_0x016a
            goto L_0x01a2
        L_0x016a:
            boolean r12 = r1.a((android.view.View) r11)
            if (r12 == 0) goto L_0x01a2
            java.lang.Object r12 = r0.b((int) r6)
            java.lang.Object r12 = r2.get(r12)
            android.view.View r12 = (android.view.View) r12
            if (r12 == 0) goto L_0x01a2
            boolean r13 = r1.a((android.view.View) r12)
            if (r13 == 0) goto L_0x01a2
            java.lang.Object r13 = r7.get(r11)
            arw r13 = (defpackage.arw) r13
            java.lang.Object r14 = r9.get(r12)
            arw r14 = (defpackage.arw) r14
            if (r13 == 0) goto L_0x01a2
            if (r14 == 0) goto L_0x01a2
            java.util.ArrayList r15 = r1.j
            r15.add(r13)
            java.util.ArrayList r13 = r1.k
            r13.add(r14)
            r7.remove(r11)
            r9.remove(r12)
        L_0x01a2:
            int r6 = r6 + 1
            goto L_0x015f
        L_0x01a5:
            r4 = r5
            int r0 = r7.h
            int r0 = r0 + -1
        L_0x01aa:
            if (r0 < 0) goto L_0x01de
            java.lang.Object r2 = r7.b((int) r0)
            android.view.View r2 = (android.view.View) r2
            if (r2 != 0) goto L_0x01b5
            goto L_0x01db
        L_0x01b5:
            boolean r5 = r1.a((android.view.View) r2)
            if (r5 == 0) goto L_0x01db
            java.lang.Object r2 = r9.remove(r2)
            arw r2 = (defpackage.arw) r2
            if (r2 == 0) goto L_0x01db
            android.view.View r5 = r2.b
            boolean r5 = r1.a((android.view.View) r5)
            if (r5 == 0) goto L_0x01db
            java.lang.Object r5 = r7.d(r0)
            arw r5 = (defpackage.arw) r5
            java.util.ArrayList r6 = r1.j
            r6.add(r5)
            java.util.ArrayList r5 = r1.k
            r5.add(r2)
        L_0x01db:
            int r0 = r0 + -1
            goto L_0x01aa
        L_0x01de:
            int r10 = r10 + 1
            r0 = r19
            r5 = r4
            r2 = 1
            r6 = 0
            goto L_0x008b
        L_0x01e7:
            r0 = 0
        L_0x01e8:
            int r2 = r7.h
            if (r0 >= r2) goto L_0x0208
            java.lang.Object r2 = r7.c(r0)
            arw r2 = (defpackage.arw) r2
            android.view.View r3 = r2.b
            boolean r3 = r1.a((android.view.View) r3)
            if (r3 == 0) goto L_0x0205
            java.util.ArrayList r3 = r1.j
            r3.add(r2)
            java.util.ArrayList r2 = r1.k
            r3 = 0
            r2.add(r3)
        L_0x0205:
            int r0 = r0 + 1
            goto L_0x01e8
        L_0x0208:
            r6 = 0
        L_0x0209:
            int r0 = r9.h
            if (r6 < r0) goto L_0x028c
            nz r0 = defpackage.arn.b()
            int r2 = r0.h
            asn r3 = defpackage.asc.b(r8)
            int r2 = r2 + -1
        L_0x0219:
            if (r2 < 0) goto L_0x027b
            java.lang.Object r4 = r0.b((int) r2)
            android.animation.Animator r4 = (android.animation.Animator) r4
            if (r4 == 0) goto L_0x0278
            java.lang.Object r5 = r0.get(r4)
            ark r5 = (defpackage.ark) r5
            if (r5 != 0) goto L_0x022c
        L_0x022b:
            goto L_0x0278
        L_0x022c:
            android.view.View r6 = r5.a
            if (r6 == 0) goto L_0x022b
            asn r6 = r5.e
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L_0x0278
            arw r6 = r5.c
            android.view.View r7 = r5.a
            r9 = 1
            arw r10 = r1.a((android.view.View) r7, (boolean) r9)
            arw r11 = r1.b(r7, r9)
            if (r10 == 0) goto L_0x0248
            goto L_0x0257
        L_0x0248:
            if (r11 != 0) goto L_0x0256
            arx r9 = r1.g
            nz r9 = r9.a
            java.lang.Object r7 = r9.get(r7)
            r11 = r7
            arw r11 = (defpackage.arw) r11
            goto L_0x0257
        L_0x0256:
        L_0x0257:
            if (r10 == 0) goto L_0x025a
            goto L_0x025c
        L_0x025a:
            if (r11 == 0) goto L_0x0278
        L_0x025c:
            arn r5 = r5.d
            boolean r5 = r5.a((defpackage.arw) r6, (defpackage.arw) r11)
            if (r5 == 0) goto L_0x0278
            boolean r5 = r4.isRunning()
            if (r5 != 0) goto L_0x0275
            boolean r5 = r4.isStarted()
            if (r5 == 0) goto L_0x0271
            goto L_0x0275
        L_0x0271:
            r0.remove(r4)
            goto L_0x0278
        L_0x0275:
            r4.cancel()
        L_0x0278:
            int r2 = r2 + -1
            goto L_0x0219
        L_0x027b:
            arx r9 = r1.f
            arx r10 = r1.g
            java.util.ArrayList r11 = r1.j
            java.util.ArrayList r12 = r1.k
            r7 = r1
            r7.a(r8, r9, r10, r11, r12)
            r1.c()
            r0 = 1
            return r0
        L_0x028c:
            java.lang.Object r0 = r9.c(r6)
            arw r0 = (defpackage.arw) r0
            android.view.View r2 = r0.b
            boolean r2 = r1.a((android.view.View) r2)
            if (r2 == 0) goto L_0x02a6
            java.util.ArrayList r2 = r1.k
            r2.add(r0)
            java.util.ArrayList r0 = r1.j
            r2 = 0
            r0.add(r2)
            goto L_0x02a7
        L_0x02a6:
            r2 = 0
        L_0x02a7:
            int r6 = r6 + 1
            goto L_0x0209
        L_0x02ab:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arq.onPreDraw():boolean");
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        a();
        arr.a.remove(this.b);
        ArrayList arrayList = (ArrayList) arr.a().get(this.b);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((arn) arrayList.get(i)).c((View) this.b);
            }
        }
        this.a.a(true);
    }
}
