package defpackage;

/* renamed from: aqfw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqfw implements aqfv {
    private static final double g = Math.toRadians(45.0d);
    final aqie a;
    public double b;
    public double c;
    private aqft d = null;
    private aqff e = null;
    private long f = 0;

    public aqfw(aqie aqie) {
        this.a = aqie;
        this.b = aqie.a();
        this.c = aqie.b();
    }

    private final void b(aqey aqey, long j) {
        this.e = new aqff(aqey.b, aqey.c);
        qul qul = new qul(4, 1);
        qul.a(0, 0, this.e.b(aqey.c));
        qul.a(1, 0, this.e.a(aqey.b));
        qul.a(2, 0, 0.0d);
        qul.a(3, 0, 0.0d);
        double d2 = (double) aqey.d;
        Double.isNaN(d2);
        double d3 = d2 * 0.001d * 10.0d;
        qul a2 = qul.a(4);
        double d4 = d3 * d3;
        a2.a(0, 0, d4);
        a2.a(1, 1, d4);
        a2.a(2, 2, 25.0d);
        a2.a(3, 3, 25.0d);
        int i = qul.a;
        qul qul2 = new qul(i, i);
        int i2 = qul.a;
        this.d = new aqft(qul, a2, qul2, new qul(i2, i2));
        this.f = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0254  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aqey a(defpackage.aqey r26, long r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r4 = 0
            if (r1 == 0) goto L_0x02ca
            aqft r5 = r0.d
            if (r5 == 0) goto L_0x02c6
            long r5 = r0.f
            long r5 = r2 - r5
            double r5 = (double) r5
            r7 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            java.lang.Double.isNaN(r5)
            double r5 = r5 / r7
            r7 = 4624633867356078080(0x402e000000000000, double:15.0)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x02c2
            r7 = -4611686018427387904(0xc000000000000000, double:-2.0)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x02c2
            r7 = 0
            double r5 = java.lang.Math.max(r7, r5)
            aqff r9 = r0.e
            aqft r10 = r0.d
            qul r10 = r10.a
            r11 = 1
            r12 = 0
            double r13 = r10.a(r11, r12)
            int r9 = r9.a((double) r13)
            double r15 = defpackage.aell.a((int) r9)
            aqff r9 = r0.e
            aqft r10 = r0.d
            qul r10 = r10.a
            double r13 = r10.a(r12, r12)
            int r9 = r9.b((double) r13)
            double r9 = defpackage.aell.a((int) r9)
            aqie r13 = r0.a
            boolean r13 = r13.g()
            if (r13 == 0) goto L_0x007e
            int r13 = r1.b
            double r13 = defpackage.aell.a((int) r13)
            double r17 = r15 - r13
            int r7 = r1.c
            double r7 = defpackage.aell.a((int) r7)
            double r19 = r9 - r7
            double r7 = defpackage.aell.c(r13, r15, r17, r19)
            aqie r9 = r0.a
            double r9 = r9.h()
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 > 0) goto L_0x007a
            goto L_0x007e
        L_0x007a:
            r25.b(r26, r27)
            return r1
        L_0x007e:
            r7 = 4
            qul r8 = defpackage.qul.a((int) r7)
            r9 = 2
            r8.a(r12, r9, r5)
            r10 = 3
            r8.a(r11, r10, r5)
            r13 = 4613937818241073152(0x4008000000000000, double:3.0)
            r9 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            double r11 = r0.b
            double r11 = r11 * r5
            double r9 = java.lang.Math.max(r9, r11)
            double r9 = java.lang.Math.min(r13, r9)
            double r11 = r0.c
            double r5 = r5 * r11
            r11 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            double r5 = java.lang.Math.max(r11, r5)
            r13 = 4617315517961601024(0x4014000000000000, double:5.0)
            double r5 = java.lang.Math.min(r13, r5)
            qul r15 = defpackage.qul.a((int) r7)
            double r9 = r9 * r9
            r11 = 0
            r15.a(r11, r11, r9)
            r11 = 1
            r15.a(r11, r11, r9)
            double r5 = r5 * r5
            r9 = 2
            r15.a(r9, r9, r5)
            r10 = 3
            r15.a(r10, r10, r5)
            aqft r5 = r0.d
            r5.a(r8, r15, r4)
            int r4 = r1.d
            double r4 = (double) r4
            r10 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            java.lang.Double.isNaN(r4)
            double r4 = r4 * r10
            double r4 = java.lang.Math.max(r13, r4)
            boolean r6 = r26.h()
            r10 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            if (r6 == 0) goto L_0x01cf
            boolean r6 = r26.d()
            if (r6 != 0) goto L_0x00f5
            r7 = 1
            r8 = 2
            goto L_0x01d1
        L_0x00f5:
            float r6 = r1.l
            double r14 = (double) r6
            double r14 = java.lang.Math.toRadians(r14)
            double r14 = defpackage.aqjt.b(r14)
            double r14 = r10 - r14
            double r19 = defpackage.aqjt.a(r14)
            double r14 = java.lang.Math.cos(r19)
            float r6 = r1.e
            double r21 = java.lang.Math.sin(r19)
            float r8 = r1.e
            qul r9 = new qul
            r10 = 1
            r9.<init>(r7, r10)
            aqff r11 = r0.e
            int r12 = r1.c
            double r11 = r11.b((int) r12)
            r13 = 0
            r9.a(r13, r13, r11)
            aqff r11 = r0.e
            int r12 = r1.b
            double r11 = r11.a((int) r12)
            r9.a(r10, r13, r11)
            double r10 = (double) r6
            java.lang.Double.isNaN(r10)
            double r14 = r14 * r10
            r6 = 2
            r9.a(r6, r13, r14)
            double r10 = (double) r8
            java.lang.Double.isNaN(r10)
            double r10 = r10 * r21
            r6 = 3
            r9.a(r6, r13, r10)
            boolean r6 = r26.i()
            if (r6 == 0) goto L_0x0151
            float r6 = r1.m
            double r10 = (double) r6
            double r10 = java.lang.Math.toRadians(r10)
            goto L_0x0153
        L_0x0151:
            double r10 = g
        L_0x0153:
            boolean r6 = r26.e()
            if (r6 == 0) goto L_0x015d
            float r6 = r1.f
            double r12 = (double) r6
            goto L_0x015f
        L_0x015d:
            r12 = 4609434218613702656(0x3ff8000000000000, double:1.5)
        L_0x015f:
            double r21 = java.lang.Math.cos(r19)
            double r7 = r21 * r12
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r7 = java.lang.Math.pow(r7, r14)
            float r6 = r1.e
            double r23 = java.lang.Math.sin(r19)
            double r14 = (double) r6
            java.lang.Double.isNaN(r14)
            double r14 = r14 * r23
            double r14 = r14 * r10
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r14 = java.lang.Math.pow(r14, r2)
            double r23 = java.lang.Math.sin(r19)
            double r12 = r12 * r23
            double r12 = java.lang.Math.pow(r12, r2)
            float r6 = r1.e
            double r19 = java.lang.Math.cos(r19)
            double r2 = (double) r6
            java.lang.Double.isNaN(r2)
            double r2 = r2 * r19
            double r2 = r2 * r10
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = java.lang.Math.pow(r2, r10)
            qul r10 = new qul
            r6 = 4
            r10.<init>(r6, r6)
            double r4 = r4 * r4
            r11 = 0
            r10.a(r11, r11, r4)
            r11 = 1
            r10.a(r11, r11, r4)
            double r7 = r7 + r14
            r4 = 2
            r10.a(r4, r4, r7)
            double r12 = r12 + r2
            r2 = 3
            r10.a(r2, r2, r12)
            qul r3 = new qul
            r4 = 4
            r3.<init>(r4, r4)
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r6 = 0
            r3.a(r6, r6, r4)
            r7 = 1
            r3.a(r7, r7, r4)
            r8 = 2
            r3.a(r8, r8, r4)
            r3.a(r2, r2, r4)
            goto L_0x0209
        L_0x01cf:
            r7 = 1
            r8 = 2
        L_0x01d1:
            qul r9 = new qul
            r9.<init>(r8, r7)
            aqff r2 = r0.e
            int r3 = r1.c
            double r2 = r2.b((int) r3)
            r8 = 0
            r9.a(r8, r8, r2)
            aqff r2 = r0.e
            int r3 = r1.b
            double r2 = r2.a((int) r3)
            r9.a(r7, r8, r2)
            qul r10 = new qul
            r2 = 2
            r10.<init>(r2, r2)
            double r4 = r4 * r4
            r10.a(r8, r8, r4)
            r10.a(r7, r7, r4)
            qul r3 = new qul
            r4 = 4
            r3.<init>(r2, r4)
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r3.a(r8, r8, r4)
            r3.a(r7, r7, r4)
        L_0x0209:
            aqft r2 = r0.d
            r2.b(r9, r3, r10)
            r2 = r27
            r0.f = r2
            aqft r2 = r0.d
            qul r3 = r2.a
            qul r2 = r2.b
            r4 = 0
            double r5 = r3.a(r4, r4)
            r7 = 1
            double r8 = r3.a(r7, r4)
            aqff r4 = r0.e
            double r10 = r4.a(r5, r8)
            r12 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x0254
            aqff r4 = r0.e
            int r7 = r4.a((double) r8)
            int r4 = r4.b((double) r5)
            aqff r5 = new aqff
            r5.<init>(r7, r4)
            r0.e = r5
            r4 = 0
            r6 = 0
            r3.a(r6, r6, r4)
            r7 = 1
            r3.a(r7, r6, r4)
            aqft r4 = r0.d
            qul r5 = r4.b
            r4.a(r3, r5)
            goto L_0x0256
        L_0x0254:
            r6 = 0
            r7 = 1
        L_0x0256:
            double r4 = r2.a(r6, r6)
            double r8 = r2.a(r7, r7)
            double r4 = r4 + r8
            double r4 = java.lang.Math.sqrt(r4)
            r2 = 2
            double r7 = r3.a(r2, r6)
            r9 = 3
            double r10 = r3.a(r9, r6)
            double r7 = java.lang.Math.hypot(r7, r10)
            double r9 = r3.a(r9, r6)
            double r11 = r3.a(r2, r6)
            double r9 = java.lang.Math.atan2(r9, r11)
            aqew r1 = r26.j()
            aqff r2 = r0.e
            r11 = 1
            double r11 = r3.a(r11, r6)
            int r2 = r2.a((double) r11)
            aqff r11 = r0.e
            double r12 = r3.a(r6, r6)
            int r3 = r11.b((double) r12)
            r11 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r4 = r4 * r11
            int r4 = (int) r4
            r1.a((int) r2, (int) r3, (int) r4)
            float r2 = (float) r7
            r1.d(r2)
            double r2 = defpackage.aqjt.a(r9)
            r4 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            double r10 = r4 - r2
            double r2 = defpackage.aqjt.b(r10)
            double r2 = java.lang.Math.toDegrees(r2)
            float r2 = (float) r2
            r1.b((float) r2)
            aqey r1 = r1.a()
            return r1
        L_0x02c2:
            r25.b(r26, r27)
            return r1
        L_0x02c6:
            r25.b(r26, r27)
            return r1
        L_0x02ca:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqfw.a(aqey, long):aqey");
    }

    public final void b() {
        this.b = this.a.e();
        this.c = this.a.f();
    }

    public final void a() {
        this.d = null;
        this.f = 0;
        this.e = null;
        this.b = this.a.a();
        this.c = this.a.b();
    }
}
