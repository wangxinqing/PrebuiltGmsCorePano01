package defpackage;

/* renamed from: aqgy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqgy extends aqgt implements arce, aqha {
    public final aqhb c;
    private final boolean d;
    private double e;
    private double f;

    public final void a() {
        this.e = Double.NEGATIVE_INFINITY;
        this.f = 0.0d;
        this.c.a();
    }

    public final void a(float f2, float f3, long j) {
    }

    public final void a(long j, float f2) {
    }

    public final void d() {
    }

    public aqgy(aqjh aqjh, boolean z) {
        super(aqjh);
        this.d = z;
        aqhb aqhb = new aqhb();
        this.c = aqhb;
        aqhb.a.a((aqha) this);
        a();
    }

    public final void a(double d2, double d3) {
        a(new aqjb(d2, d3));
    }

    public final void a(float f2) {
        aqhb aqhb = this.c;
        double d2 = (double) f2;
        if (d2 > 0.0d) {
            double min = Math.min(d2, 1000.0d);
            aqhb.b = min;
            aqhb.b();
            aqhb.a.a(min);
        }
    }

    public final void a(long j) {
        if (this.b == 1) {
            a();
            a(new aqjb(aqjs.a(j)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x017b, code lost:
        if (r8 > (r5 + defpackage.aqgz.b)) goto L_0x017d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0186  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.location.bluemoon.inertialanchor.Pose r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            if (r1 == 0) goto L_0x0267
            int r2 = r0.b
            r3 = 1
            if (r2 != r3) goto L_0x0267
            java.util.Set r2 = defpackage.aqju.a
            java.util.Iterator r2 = r2.iterator()
        L_0x0011:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x001e
            java.lang.Object r4 = r2.next()
            aqjv r4 = (defpackage.aqjv) r4
            goto L_0x0011
        L_0x001e:
            long r4 = r1.timestampNanos
            double r4 = defpackage.aqjs.a((long) r4)
            aqhb r2 = r0.c
            aqhg r1 = r1.attitude
            double r6 = r1.a
            double r8 = r1.b
            double r10 = r1.c
            double r12 = r1.d
            aqhg r1 = r2.d
            if (r1 == 0) goto L_0x0054
            r16 = r4
            double r3 = r1.a
            double r3 = r3 * r6
            double r14 = r1.b
            double r14 = r14 * r8
            double r3 = r3 + r14
            double r14 = r1.c
            double r14 = r14 * r10
            double r3 = r3 + r14
            double r14 = r1.d
            double r14 = r14 * r12
            double r3 = r3 + r14
            r14 = 0
            int r1 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r1 >= 0) goto L_0x0056
            double r6 = -r6
            double r8 = -r8
            double r10 = -r10
            double r12 = -r12
            goto L_0x0057
        L_0x0054:
            r16 = r4
        L_0x0056:
        L_0x0057:
            aqhg r1 = r2.e
            aqhc[] r3 = r2.c
            r4 = 0
            r3 = r3[r4]
            double r19 = r3.a(r6)
            aqhc[] r3 = r2.c
            r5 = 1
            r3 = r3[r5]
            double r21 = r3.a(r8)
            aqhc[] r3 = r2.c
            r5 = 2
            r3 = r3[r5]
            double r23 = r3.a(r10)
            aqhc[] r3 = r2.c
            r6 = 3
            r3 = r3[r6]
            double r25 = r3.a(r12)
            r18 = r1
            r18.a((double) r19, (double) r21, (double) r23, (double) r25)
            aqhg r1 = r2.e
            r1.b()
            aqhg r1 = r2.d
            if (r1 != 0) goto L_0x0097
            aqhg r1 = r2.e
            aqhg r3 = new aqhg
            r3.<init>()
            r1.a(r3)
            r2.d = r3
        L_0x0097:
            aqhg r1 = r2.d
            aqhg r3 = r2.e
            aqhg r7 = r2.f
            r8 = 1
            defpackage.aqhg.a((defpackage.aqhg) r3, (defpackage.aqhg) r1, (defpackage.aqhg) r7, (boolean) r8)
            r7.b()
            aqhg r1 = r2.f
            aqhi r3 = r2.k
            double r7 = r1.c
            double r9 = r1.d
            double r7 = java.lang.Math.atan2(r7, r9)
            double r7 = r7 + r7
            double r9 = -r7
            aqhh r11 = defpackage.aqhh.b
            aqhg r12 = r2.g
            defpackage.aqhe.a(r9, r11, r12)
            aqhg r9 = r2.g
            aqhg r10 = r2.h
            defpackage.aqhg.a((defpackage.aqhg) r9, (defpackage.aqhg) r1, (defpackage.aqhg) r10, (boolean) r4)
            aqhg r1 = r2.h
            aqhd r9 = r2.i
            r1.b()
            aqhh r10 = r2.j
            double r11 = r1.a
            r10.c = r11
            double r11 = r1.b
            r10.d = r11
            double r11 = r1.c
            r10.e = r11
            double r10 = r10.a()
            double r12 = r1.d
            aqhh r1 = r2.j
            r1.c()
            double r10 = java.lang.Math.atan2(r10, r12)
            double r10 = r10 + r10
            r9.a(r1, r10)
            aqhd r1 = r2.i
            double r9 = r1.a
            aqhh r1 = r1.b
            double r11 = r1.c
            double r13 = r1.d
            r3.a = r7
            r3.b = r9
            aqhh r1 = r3.c
            r1.c = r11
            r1.d = r13
            r7 = 0
            r1.e = r7
            aqgz r1 = r2.a
            aqhi r3 = r2.k
            double[] r7 = r1.i
            int r8 = r1.j
            double r9 = r3.b
            double r11 = r1.g
            double r9 = r9 * r11
            r7[r8] = r9
            double r9 = r1.e
            double r11 = r3.a
            double r9 = r9 + r11
            r1.e = r9
            int r3 = defpackage.aqgz.a(r7, r8)
            r8 = 1
            r9 = 1
            r10 = 0
        L_0x011e:
            int r11 = r7.length
            if (r10 < r11) goto L_0x0127
            if (r8 == 0) goto L_0x0125
            r3 = 2
            goto L_0x014b
        L_0x0125:
            r3 = 3
            goto L_0x014b
        L_0x0127:
            if (r10 == r3) goto L_0x0133
            r11 = r7[r10]
            r13 = r7[r3]
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x0132
            goto L_0x0133
        L_0x0132:
            r8 = 0
        L_0x0133:
            if (r10 == r3) goto L_0x013f
            r11 = r7[r10]
            r13 = r7[r3]
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 > 0) goto L_0x013e
            goto L_0x013f
        L_0x013e:
            r9 = 0
        L_0x013f:
            if (r8 == 0) goto L_0x0148
            r14 = r16
            r11 = 1
            r12 = 0
            goto L_0x0261
        L_0x0148:
            if (r9 != 0) goto L_0x025c
            r3 = 1
        L_0x014b:
            double[] r7 = r1.i
            int r8 = r1.j
            int r8 = defpackage.aqgz.a(r7, r8)
            r8 = r7[r8]
            double[] r7 = r1.i
            int r7 = r7.length
            r10 = 1
            int r7 = r7 >> r10
            double r10 = (double) r7
            double r12 = r1.h
            java.lang.Double.isNaN(r10)
            double r10 = r10 * r12
            double r10 = r16 - r10
            if (r3 != r6) goto L_0x01a3
            double r5 = defpackage.aqgz.a
            int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x017d
            aqhf r3 = r1.l
            double r5 = r3.a
            double r10 = defpackage.aqgz.c
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x0182
            double r10 = defpackage.aqgz.b
            double r5 = r5 + r10
            int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0182
        L_0x017d:
            r1.o = r8
            r3 = 1
            r1.d = r3
        L_0x0182:
            boolean r3 = r1.d
            if (r3 != 0) goto L_0x019f
            aqhf r3 = r1.l
            double r5 = r3.a
            long r10 = r3.b
            r12 = 1
            long r12 = r12 + r10
            double r10 = (double) r10
            java.lang.Double.isNaN(r10)
            double r5 = r5 * r10
            double r5 = r5 + r8
            double r7 = (double) r12
            java.lang.Double.isNaN(r7)
            double r5 = r5 / r7
            r3.a = r5
            r3.b = r12
        L_0x019f:
            r14 = r16
            goto L_0x0206
        L_0x01a3:
            if (r3 != r5) goto L_0x0204
            boolean r3 = r1.d
            if (r3 == 0) goto L_0x01f3
            double r5 = r1.m
            double r12 = r1.o
            int r3 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x01c3
            int r3 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x01c3
            double r14 = r12 - r8
            double r12 = r12 - r5
            double r14 = r14 / r12
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r3 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x01c1
            r5 = 0
            goto L_0x01c4
        L_0x01c1:
            r5 = 1
            goto L_0x01c4
        L_0x01c3:
            r5 = 0
        L_0x01c4:
            double r6 = r1.n
            double r6 = r10 - r6
            if (r5 == 0) goto L_0x01cb
            goto L_0x01d1
        L_0x01cb:
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r3 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x01f0
        L_0x01d1:
            java.util.List r3 = r1.k
            int r5 = r3.size()
            r6 = 0
        L_0x01d8:
            if (r6 >= r5) goto L_0x01ea
            java.lang.Object r7 = r3.get(r6)
            aqha r7 = (defpackage.aqha) r7
            double r12 = r1.e
            r14 = r16
            r7.a(r14, r12)
            int r6 = r6 + 1
            goto L_0x01d8
        L_0x01ea:
            r14 = r16
            r1.b()
            goto L_0x01f5
        L_0x01f0:
            r14 = r16
            goto L_0x01f5
        L_0x01f3:
            r14 = r16
        L_0x01f5:
            boolean r3 = r1.d
            if (r3 != 0) goto L_0x01fd
            r1.m = r8
            r1.n = r10
        L_0x01fd:
            r1.f = r10
            r5 = 0
            r1.e = r5
            goto L_0x0206
        L_0x0204:
            r14 = r16
        L_0x0206:
            int r3 = r1.j
            r11 = 1
            int r3 = r3 + r11
            r1.j = r3
            double[] r5 = r1.i
            int r5 = r5.length
            int r5 = r5 + -1
            if (r3 > r5) goto L_0x0214
            goto L_0x0216
        L_0x0214:
            r1.j = r4
        L_0x0216:
            aqhg r1 = r2.e
            aqhg r3 = r2.d
            r1.a(r3)
            double r3 = r2.l
            aqhi r1 = r2.k
            double r5 = r1.a
            double r3 = r3 + r5
            r2.l = r3
            boolean r1 = r0.d
            if (r1 != 0) goto L_0x022b
            goto L_0x0230
        L_0x022b:
            double r2 = r0.f
            double r2 = r2 + r5
            r0.f = r2
        L_0x0230:
            double r2 = r0.e
            double r2 = r14 - r2
            r7 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0245
            if (r1 != 0) goto L_0x0244
            double r1 = r0.f
            double r1 = r1 + r5
            r0.f = r1
        L_0x0244:
            return
        L_0x0245:
            aqjb r1 = new aqjb
            aqhb r2 = r0.c
            double r9 = r2.l
            double r11 = r0.f
            r6 = r1
            r7 = r14
            r6.<init>((double) r7, (double) r9, (double) r11)
            r0.a(r1)
            r12 = 0
            r0.f = r12
            r0.e = r14
            return
        L_0x025c:
            r14 = r16
            r11 = 1
            r12 = 0
        L_0x0261:
            int r10 = r10 + 1
            r16 = r14
            goto L_0x011e
        L_0x0267:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqgy.a(com.google.location.bluemoon.inertialanchor.Pose):void");
    }
}
