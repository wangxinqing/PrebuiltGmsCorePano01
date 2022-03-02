package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ayu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ayu implements avw, awl, axj {
    final Matrix a;
    final avc b;
    final ayx c;
    public ayu d;
    public ayu e;
    final axa f;
    private final Path g = new Path();
    private final Matrix h = new Matrix();
    private final Paint i;
    private final Paint j;
    private final Paint k;
    private final Paint l;
    private final Paint m;
    private final RectF n;
    private final RectF o;
    private final RectF p;
    private final RectF q;
    private aws r;
    private List s;
    private final List t;
    private boolean u;

    public ayu(avc avc, ayx ayx) {
        boolean z = true;
        this.i = new avq(1);
        this.j = new avq(PorterDuff.Mode.DST_IN, (byte[]) null);
        this.k = new avq(PorterDuff.Mode.DST_OUT, (byte[]) null);
        this.l = new avq(1);
        this.m = new avq(PorterDuff.Mode.CLEAR);
        this.n = new RectF();
        this.o = new RectF();
        this.p = new RectF();
        this.q = new RectF();
        this.a = new Matrix();
        this.t = new ArrayList();
        this.u = true;
        this.b = avc;
        this.c = ayx;
        ayx.c + "#draw";
        if (ayx.v == 3) {
            this.l.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            this.l.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        axa a2 = ayx.h.a();
        this.f = a2;
        a2.a((awl) this);
        List list = ayx.g;
        if (list != null && !list.isEmpty()) {
            aws aws = new aws(ayx.g);
            this.r = aws;
            List list2 = aws.a;
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((awm) list2.get(i2)).a((awl) this);
            }
            List list3 = this.r.b;
            int size2 = list3.size();
            for (int i3 = 0; i3 < size2; i3++) {
                awm awm = (awm) list3.get(i3);
                a(awm);
                awm.a((awl) this);
            }
        }
        if (!this.c.s.isEmpty()) {
            awo awo = new awo(this.c.s);
            awo.b = true;
            awo.a((awl) new ayt(this, awo));
            a(((Float) awo.f()).floatValue() != 1.0f ? false : z);
            a((awm) awo);
            return;
        }
        a(true);
    }

    private final void a(Canvas canvas) {
        canvas.drawRect(this.n.left - 4.0f, this.n.top - 4.0f, this.n.right + 1.0f, this.n.bottom + 1.0f, this.m);
        auf.a();
    }

    private final void e() {
        this.b.invalidateSelf();
    }

    private final void f() {
        if (this.s != null) {
            return;
        }
        if (this.e != null) {
            this.s = new ArrayList();
            for (ayu ayu = this.e; ayu != null; ayu = ayu.e) {
                this.s.add(ayu);
            }
            return;
        }
        this.s = Collections.emptyList();
    }

    public final void a(List list, List list2) {
    }

    public final String b() {
        return this.c.c;
    }

    public abstract void b(Canvas canvas, Matrix matrix, int i2);

    public void b(axi axi, int i2, List list, axi axi2) {
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        return this.d != null;
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        aws aws = this.r;
        return aws != null && !aws.a.isEmpty();
    }

    public final void a() {
        e();
    }

    public void a(float f2) {
        axa axa = this.f;
        awm awm = axa.e;
        if (awm != null) {
            awm.a(f2);
        }
        awm awm2 = axa.h;
        if (awm2 != null) {
            awm2.a(f2);
        }
        awm awm3 = axa.i;
        if (awm3 != null) {
            awm3.a(f2);
        }
        awm awm4 = axa.a;
        if (awm4 != null) {
            awm4.a(f2);
        }
        awm awm5 = axa.b;
        if (awm5 != null) {
            awm5.a(f2);
        }
        awm awm6 = axa.c;
        if (awm6 != null) {
            awm6.a(f2);
        }
        awm awm7 = axa.d;
        if (awm7 != null) {
            awm7.a(f2);
        }
        awo awo = axa.f;
        if (awo != null) {
            awo.a(f2);
        }
        awo awo2 = axa.g;
        if (awo2 != null) {
            awo2.a(f2);
        }
        if (this.r != null) {
            for (int i2 = 0; i2 < this.r.a.size(); i2++) {
                ((awm) this.r.a.get(i2)).a(f2);
            }
        }
        float f3 = this.c.l;
        if (f3 != 0.0f) {
            f2 /= f3;
        }
        ayu ayu = this.d;
        if (ayu != null) {
            ayu.a(ayu.c.l * f2);
        }
        for (int i3 = 0; i3 < this.t.size(); i3++) {
            ((awm) this.t.get(i3)).a(f2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x010b, code lost:
        if (r15 != r10) goto L_0x0113;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.u
            if (r3 == 0) goto L_0x0387
            ayx r3 = r0.c
            boolean r3 = r3.t
            if (r3 != 0) goto L_0x0387
            r16.f()
            android.graphics.Matrix r3 = r0.h
            r3.reset()
            android.graphics.Matrix r3 = r0.h
            r3.set(r2)
            java.util.List r3 = r0.s
            int r3 = r3.size()
            int r3 = r3 + -1
        L_0x0025:
            if (r3 < 0) goto L_0x003d
            android.graphics.Matrix r4 = r0.h
            java.util.List r5 = r0.s
            java.lang.Object r5 = r5.get(r3)
            ayu r5 = (defpackage.ayu) r5
            axa r5 = r5.f
            android.graphics.Matrix r5 = r5.a()
            r4.preConcat(r5)
            int r3 = r3 + -1
            goto L_0x0025
        L_0x003d:
            defpackage.auf.a()
            axa r3 = r0.f
            awm r3 = r3.e
            if (r3 == 0) goto L_0x0051
            java.lang.Object r3 = r3.f()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L_0x0053
        L_0x0051:
            r3 = 100
        L_0x0053:
            r4 = r19
            float r4 = (float) r4
            r5 = 1132396544(0x437f0000, float:255.0)
            float r4 = r4 / r5
            float r3 = (float) r3
            float r4 = r4 * r3
            r3 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r3
            float r4 = r4 * r5
            int r3 = (int) r4
            boolean r4 = r16.c()
            if (r4 != 0) goto L_0x0086
            boolean r4 = r16.d()
            if (r4 == 0) goto L_0x006f
            goto L_0x0086
        L_0x006f:
            android.graphics.Matrix r2 = r0.h
            axa r4 = r0.f
            android.graphics.Matrix r4 = r4.a()
            r2.preConcat(r4)
            android.graphics.Matrix r2 = r0.h
            r0.b(r1, r2, r3)
            defpackage.auf.a()
            defpackage.auf.a()
            return
        L_0x0086:
            android.graphics.RectF r4 = r0.n
            android.graphics.Matrix r5 = r0.h
            r6 = 0
            r0.a((android.graphics.RectF) r4, (android.graphics.Matrix) r5, (boolean) r6)
            android.graphics.RectF r4 = r0.n
            boolean r5 = r16.c()
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x00b6
            ayx r5 = r0.c
            int r5 = r5.v
            r9 = 3
            if (r5 == r9) goto L_0x00b6
            android.graphics.RectF r5 = r0.p
            r5.set(r8, r8, r8, r8)
            ayu r5 = r0.d
            android.graphics.RectF r9 = r0.p
            r5.a((android.graphics.RectF) r9, (android.graphics.Matrix) r2, (boolean) r7)
            android.graphics.RectF r5 = r0.p
            boolean r5 = r4.intersect(r5)
            if (r5 != 0) goto L_0x00b6
            r4.set(r8, r8, r8, r8)
        L_0x00b6:
            android.graphics.Matrix r4 = r0.h
            axa r5 = r0.f
            android.graphics.Matrix r5 = r5.a()
            r4.preConcat(r5)
            android.graphics.RectF r4 = r0.n
            android.graphics.Matrix r5 = r0.h
            android.graphics.RectF r9 = r0.o
            r9.set(r8, r8, r8, r8)
            boolean r9 = r16.d()
            r10 = 2
            r11 = 0
            if (r9 == 0) goto L_0x016b
            aws r9 = r0.r
            java.util.List r9 = r9.c
            int r9 = r9.size()
            r12 = 0
        L_0x00db:
            if (r12 >= r9) goto L_0x0160
            aws r13 = r0.r
            java.util.List r13 = r13.c
            java.lang.Object r13 = r13.get(r12)
            ayg r13 = (defpackage.ayg) r13
            aws r14 = r0.r
            java.util.List r14 = r14.a
            java.lang.Object r14 = r14.get(r12)
            awm r14 = (defpackage.awm) r14
            java.lang.Object r14 = r14.f()
            android.graphics.Path r14 = (android.graphics.Path) r14
            android.graphics.Path r15 = r0.g
            r15.set(r14)
            android.graphics.Path r14 = r0.g
            r14.transform(r5)
            int r14 = r13.d
            int r15 = r14 + -1
            if (r14 == 0) goto L_0x015e
            if (r15 == 0) goto L_0x010e
            if (r15 == r7) goto L_0x016b
            if (r15 == r10) goto L_0x010e
            goto L_0x0113
        L_0x010e:
            boolean r13 = r13.c
            if (r13 == 0) goto L_0x0113
            goto L_0x016b
        L_0x0113:
            android.graphics.Path r13 = r0.g
            android.graphics.RectF r14 = r0.q
            r13.computeBounds(r14, r6)
            if (r12 == 0) goto L_0x0150
            android.graphics.RectF r13 = r0.o
            float r14 = r13.left
            android.graphics.RectF r15 = r0.q
            float r15 = r15.left
            float r14 = java.lang.Math.min(r14, r15)
            android.graphics.RectF r15 = r0.o
            float r15 = r15.top
            android.graphics.RectF r10 = r0.q
            float r10 = r10.top
            float r10 = java.lang.Math.min(r15, r10)
            android.graphics.RectF r15 = r0.o
            float r15 = r15.right
            android.graphics.RectF r7 = r0.q
            float r7 = r7.right
            float r7 = java.lang.Math.max(r15, r7)
            android.graphics.RectF r15 = r0.o
            float r15 = r15.bottom
            android.graphics.RectF r6 = r0.q
            float r6 = r6.bottom
            float r6 = java.lang.Math.max(r15, r6)
            r13.set(r14, r10, r7, r6)
            goto L_0x0157
        L_0x0150:
            android.graphics.RectF r6 = r0.o
            android.graphics.RectF r7 = r0.q
            r6.set(r7)
        L_0x0157:
            int r12 = r12 + 1
            r6 = 0
            r7 = 1
            r10 = 2
            goto L_0x00db
        L_0x015e:
            throw r11
        L_0x0160:
            android.graphics.RectF r5 = r0.o
            boolean r5 = r4.intersect(r5)
            if (r5 != 0) goto L_0x016b
            r4.set(r8, r8, r8, r8)
        L_0x016b:
            android.graphics.RectF r4 = r0.n
            int r5 = r17.getWidth()
            float r5 = (float) r5
            int r6 = r17.getHeight()
            float r6 = (float) r6
            boolean r4 = r4.intersect(r8, r8, r5, r6)
            if (r4 != 0) goto L_0x0182
            android.graphics.RectF r4 = r0.n
            r4.set(r8, r8, r8, r8)
        L_0x0182:
            defpackage.auf.a()
            android.graphics.RectF r4 = r0.n
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0383
            android.graphics.RectF r4 = r0.n
            android.graphics.Paint r5 = r0.i
            defpackage.bbb.a((android.graphics.Canvas) r1, (android.graphics.RectF) r4, (android.graphics.Paint) r5)
            defpackage.auf.a()
            r16.a((android.graphics.Canvas) r17)
            android.graphics.Matrix r4 = r0.h
            r0.b(r1, r4, r3)
            defpackage.auf.a()
            boolean r4 = r16.d()
            r5 = 19
            if (r4 == 0) goto L_0x035c
            android.graphics.Matrix r4 = r0.h
            android.graphics.RectF r6 = r0.n
            android.graphics.Paint r7 = r0.j
            defpackage.bbb.a((android.graphics.Canvas) r1, (android.graphics.RectF) r6, (android.graphics.Paint) r7, (int) r5)
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 28
            if (r6 >= r7) goto L_0x01be
            r6 = 0
            r1.drawColor(r6)
            goto L_0x01bf
        L_0x01be:
            r6 = 0
        L_0x01bf:
            defpackage.auf.a()
        L_0x01c2:
            aws r7 = r0.r
            java.util.List r7 = r7.c
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x0356
            aws r7 = r0.r
            java.util.List r7 = r7.c
            java.lang.Object r7 = r7.get(r6)
            ayg r7 = (defpackage.ayg) r7
            aws r8 = r0.r
            java.util.List r8 = r8.a
            java.lang.Object r8 = r8.get(r6)
            awm r8 = (defpackage.awm) r8
            aws r9 = r0.r
            java.util.List r9 = r9.b
            java.lang.Object r9 = r9.get(r6)
            awm r9 = (defpackage.awm) r9
            int r10 = r7.d
            int r12 = r10 + -1
            if (r10 == 0) goto L_0x0354
            r10 = 1076048691(0x40233333, float:2.55)
            r13 = 1
            if (r12 == 0) goto L_0x02e5
            if (r12 == r13) goto L_0x0274
            r14 = 2
            if (r12 == r14) goto L_0x01fd
            goto L_0x0350
        L_0x01fd:
            boolean r7 = r7.c
            if (r7 != 0) goto L_0x0237
            android.graphics.RectF r7 = r0.n
            android.graphics.Paint r12 = r0.j
            defpackage.bbb.a((android.graphics.Canvas) r1, (android.graphics.RectF) r7, (android.graphics.Paint) r12)
            java.lang.Object r7 = r8.f()
            android.graphics.Path r7 = (android.graphics.Path) r7
            android.graphics.Path r8 = r0.g
            r8.set(r7)
            android.graphics.Path r7 = r0.g
            r7.transform(r4)
            android.graphics.Paint r7 = r0.i
            java.lang.Object r8 = r9.f()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            float r8 = (float) r8
            float r8 = r8 * r10
            int r8 = (int) r8
            r7.setAlpha(r8)
            android.graphics.Path r7 = r0.g
            android.graphics.Paint r8 = r0.i
            r1.drawPath(r7, r8)
            r17.restore()
            goto L_0x0350
        L_0x0237:
            android.graphics.RectF r7 = r0.n
            android.graphics.Paint r12 = r0.j
            defpackage.bbb.a((android.graphics.Canvas) r1, (android.graphics.RectF) r7, (android.graphics.Paint) r12)
            android.graphics.RectF r7 = r0.n
            android.graphics.Paint r12 = r0.i
            r1.drawRect(r7, r12)
            android.graphics.Paint r7 = r0.k
            java.lang.Object r9 = r9.f()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            float r9 = (float) r9
            float r9 = r9 * r10
            int r9 = (int) r9
            r7.setAlpha(r9)
            java.lang.Object r7 = r8.f()
            android.graphics.Path r7 = (android.graphics.Path) r7
            android.graphics.Path r8 = r0.g
            r8.set(r7)
            android.graphics.Path r7 = r0.g
            r7.transform(r4)
            android.graphics.Path r7 = r0.g
            android.graphics.Paint r8 = r0.k
            r1.drawPath(r7, r8)
            r17.restore()
            goto L_0x0350
        L_0x0274:
            r14 = 2
            if (r6 != 0) goto L_0x028c
            android.graphics.Paint r12 = r0.i
            r15 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r12.setColor(r15)
            android.graphics.Paint r12 = r0.i
            r15 = 255(0xff, float:3.57E-43)
            r12.setAlpha(r15)
            android.graphics.RectF r12 = r0.n
            android.graphics.Paint r15 = r0.i
            r1.drawRect(r12, r15)
        L_0x028c:
            boolean r7 = r7.c
            if (r7 != 0) goto L_0x02a9
            java.lang.Object r7 = r8.f()
            android.graphics.Path r7 = (android.graphics.Path) r7
            android.graphics.Path r8 = r0.g
            r8.set(r7)
            android.graphics.Path r7 = r0.g
            r7.transform(r4)
            android.graphics.Path r7 = r0.g
            android.graphics.Paint r8 = r0.k
            r1.drawPath(r7, r8)
            goto L_0x0350
        L_0x02a9:
            android.graphics.RectF r7 = r0.n
            android.graphics.Paint r12 = r0.k
            defpackage.bbb.a((android.graphics.Canvas) r1, (android.graphics.RectF) r7, (android.graphics.Paint) r12)
            android.graphics.RectF r7 = r0.n
            android.graphics.Paint r12 = r0.i
            r1.drawRect(r7, r12)
            android.graphics.Paint r7 = r0.k
            java.lang.Object r9 = r9.f()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            float r9 = (float) r9
            float r9 = r9 * r10
            int r9 = (int) r9
            r7.setAlpha(r9)
            java.lang.Object r7 = r8.f()
            android.graphics.Path r7 = (android.graphics.Path) r7
            android.graphics.Path r8 = r0.g
            r8.set(r7)
            android.graphics.Path r7 = r0.g
            r7.transform(r4)
            android.graphics.Path r7 = r0.g
            android.graphics.Paint r8 = r0.k
            r1.drawPath(r7, r8)
            r17.restore()
            goto L_0x0350
        L_0x02e5:
            r14 = 2
            boolean r7 = r7.c
            if (r7 != 0) goto L_0x0315
            java.lang.Object r7 = r8.f()
            android.graphics.Path r7 = (android.graphics.Path) r7
            android.graphics.Path r8 = r0.g
            r8.set(r7)
            android.graphics.Path r7 = r0.g
            r7.transform(r4)
            android.graphics.Paint r7 = r0.i
            java.lang.Object r8 = r9.f()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            float r8 = (float) r8
            float r8 = r8 * r10
            int r8 = (int) r8
            r7.setAlpha(r8)
            android.graphics.Path r7 = r0.g
            android.graphics.Paint r8 = r0.i
            r1.drawPath(r7, r8)
            goto L_0x0350
        L_0x0315:
            android.graphics.RectF r7 = r0.n
            android.graphics.Paint r12 = r0.i
            defpackage.bbb.a((android.graphics.Canvas) r1, (android.graphics.RectF) r7, (android.graphics.Paint) r12)
            android.graphics.RectF r7 = r0.n
            android.graphics.Paint r12 = r0.i
            r1.drawRect(r7, r12)
            java.lang.Object r7 = r8.f()
            android.graphics.Path r7 = (android.graphics.Path) r7
            android.graphics.Path r8 = r0.g
            r8.set(r7)
            android.graphics.Path r7 = r0.g
            r7.transform(r4)
            android.graphics.Paint r7 = r0.i
            java.lang.Object r8 = r9.f()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            float r8 = (float) r8
            float r8 = r8 * r10
            int r8 = (int) r8
            r7.setAlpha(r8)
            android.graphics.Path r7 = r0.g
            android.graphics.Paint r8 = r0.k
            r1.drawPath(r7, r8)
            r17.restore()
        L_0x0350:
            int r6 = r6 + 1
            goto L_0x01c2
        L_0x0354:
            throw r11
        L_0x0356:
            r17.restore()
            defpackage.auf.a()
        L_0x035c:
            boolean r4 = r16.c()
            if (r4 == 0) goto L_0x037d
            android.graphics.RectF r4 = r0.n
            android.graphics.Paint r6 = r0.l
            defpackage.bbb.a((android.graphics.Canvas) r1, (android.graphics.RectF) r4, (android.graphics.Paint) r6, (int) r5)
            defpackage.auf.a()
            r16.a((android.graphics.Canvas) r17)
            ayu r4 = r0.d
            r4.a((android.graphics.Canvas) r1, (android.graphics.Matrix) r2, (int) r3)
            r17.restore()
            defpackage.auf.a()
            defpackage.auf.a()
        L_0x037d:
            r17.restore()
            defpackage.auf.a()
        L_0x0383:
            defpackage.auf.a()
            return
        L_0x0387:
            defpackage.auf.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayu.a(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.n.set(0.0f, 0.0f, 0.0f, 0.0f);
        f();
        this.a.set(matrix);
        if (z) {
            List list = this.s;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.a.preConcat(((ayu) this.s.get(size)).f.a());
                }
            } else {
                ayu ayu = this.e;
                if (ayu != null) {
                    this.a.preConcat(ayu.f.a());
                }
            }
        }
        this.a.preConcat(this.f.a());
    }

    public final void a(awm awm) {
        if (awm != null) {
            this.t.add(awm);
        }
    }

    public final void a(axi axi, int i2, List list, axi axi2) {
        if (axi.a(b(), i2)) {
            if (!"__container".equals(b())) {
                axi2 = axi2.a(b());
                if (axi.c(b(), i2)) {
                    list.add(axi2.a((axj) this));
                }
            }
            if (axi.d(b(), i2)) {
                b(axi, i2 + axi.b(b(), i2), list, axi2);
            }
        }
    }

    public void a(Object obj, bbe bbe) {
        this.f.a(obj, bbe);
    }

    public final void a(boolean z) {
        if (z != this.u) {
            this.u = z;
            e();
        }
    }
}
