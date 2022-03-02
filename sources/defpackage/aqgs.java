package defpackage;

import java.io.PrintWriter;

/* renamed from: aqgs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqgs implements aqji, aqir, aqgg {
    static final int[] b = {0, 1, 2};
    public static final int[] c = {0, 1};
    public final aqhw a;
    protected final aqip d;
    public final aqis e;
    protected final double[] f = new double[3];
    protected final int[] g = new int[2];
    protected double h = Double.NEGATIVE_INFINITY;
    double i;
    private final aqgu j;
    private aqey k;
    private final aqhy l;
    private final double m;
    private final boolean n;

    public aqgs(aqhm aqhm, aqhy aqhy, aqis aqis, aqip aqip) {
        aqgy aqgy;
        aqgv aqgv;
        aqhm aqhm2 = aqhm;
        aqhy aqhy2 = aqhy;
        aqis aqis2 = aqis;
        aqip aqip2 = aqip;
        aqho aqho = (aqho) aqhy2;
        aqhw aqhw = aqho.e;
        this.a = aqhw;
        this.e = aqis2;
        aqis2.a(this);
        this.d = aqip2;
        aqip2.a(this.e);
        this.d.g.a(this);
        this.k = null;
        this.i = Double.NEGATIVE_INFINITY;
        this.l = aqhy2;
        this.m = (double) aqjs.a(aqho.b);
        aqhw aqhw2 = aqho.e;
        this.n = aqhw2.z();
        if (!aqhw2.u()) {
            aqgy = new aqgy(aqip2, aqhw2.y());
        } else {
            aqgy = null;
        }
        if (!aqhw2.u() && !aqho.c) {
            aqgv = null;
        } else {
            aqgv = new aqgv(aqip2);
        }
        aqgx aqgx = new aqgx(aqip, aqis, aqhw2.C(), aqhw2.D(), aqhw2.n());
        aqgt aqgt = new aqgt(aqip2);
        if (this.n) {
            new aqgw(aqip2);
        }
        this.j = new aqgu(aqgy, aqgv, aqgx, aqgt);
        if (aqho.c && aqhm2 != null) {
            aqhm2.a(this, this.j);
        }
    }

    public static double a(double d2) {
        return (-d2) + 1.5707963267948966d;
    }

    public final aqey a() {
        return this.k;
    }

    public final void a(long j2, aqfq aqfq) {
    }

    public final void a(long j2, aqgf aqgf) {
    }

    public final long b() {
        return aqjs.a(this.h);
    }

    public final void c() {
        a(true);
    }

    public final void d() {
        a(false);
    }

    public final arce e() {
        aqgu aqgu = this.j;
        aqgy aqgy = aqgu.a;
        return aqgy == null ? aqgu.b : aqgy;
    }

    /* access modifiers changed from: protected */
    public final void f() {
        this.k = null;
    }

    public static double a(aqje aqje) {
        aqjd[] aqjdArr = aqje.b;
        double[] dArr = aqje.a;
        double d2 = 0.0d;
        double d3 = 0.0d;
        for (int i2 = 0; i2 < aqjdArr.length; i2++) {
            double d4 = aqjdArr[i2].a.b[2];
            d3 += dArr[i2] * Math.cos(d4);
            d2 += dArr[i2] * Math.sin(d4);
        }
        return aqjt.a(Math.atan2(d2, d3));
    }

    private final void a(boolean z) {
        if (z) {
            this.i = Double.NEGATIVE_INFINITY;
        }
        this.k = null;
        aqgu aqgu = this.j;
        aqgy aqgy = aqgu.a;
        if (aqgy != null) {
            aqgy.a();
        }
        aqgv aqgv = aqgu.b;
        if (aqgv != null) {
            aqgv.c = Double.NEGATIVE_INFINITY;
            aqgv.d = 0.0d;
        }
        aqgx aqgx = aqgu.c;
        aqgx.e = null;
        aqgx.c.b.a();
        aqhl aqhl = aqgx.d;
        aqhl.c.a();
        aqhl.d = Long.MIN_VALUE;
        aqip aqip = this.d;
        if (aqip != null) {
            synchronized (aqip.a) {
                aqix aqix = aqip.b;
                aqix.a = Double.NaN;
                aqix.b = 0;
                aqje aqje = aqip.g.h;
                int i2 = 0;
                while (true) {
                    aqjd[] aqjdArr = aqje.b;
                    if (i2 >= aqjdArr.length) {
                        break;
                    }
                    aqjdArr[i2].a();
                    aqje.c[i2].a();
                    i2++;
                }
                aqip.c.g();
                aqip.j.clear();
                aqin aqin = aqip.e;
                if (!Double.isNaN(aqin.c)) {
                    aqin.a.a((long) ((int) Math.round(aqin.c - aqin.b)));
                }
                aqin.b = Double.NaN;
                aqin.c = Double.NaN;
                aqin.d = Double.NaN;
                aqin.e = Double.NaN;
                aqin.f = Double.NaN;
                if (z && aqip.b()) {
                    aqip.d.a.clear();
                }
            }
        }
        this.e.b = null;
        double[] dArr = this.f;
        dArr[0] = Double.NaN;
        dArr[1] = Double.NaN;
        int[] iArr = this.g;
        iArr[0] = Integer.MIN_VALUE;
        iArr[1] = Integer.MIN_VALUE;
        this.h = Double.NEGATIVE_INFINITY;
    }

    public final int a(long j2, int i2) {
        int i3;
        if (!this.n) {
            i3 = 28;
        } else {
            i3 = 92;
        }
        if (!((aqho) this.l).a) {
            return i3 | 1;
        }
        aqiq aqiq = this.d.c;
        boolean z = aqiq.d;
        aqjb aqjb = aqiq.i;
        if (z && (aqjb == null || ((double) Math.abs(j2 - aqjs.a(aqjb.d))) <= this.m)) {
            return i3;
        }
        return i3 | 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02fe A[LOOP:5: B:135:0x02c8->B:140:0x02fe, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(double r25, defpackage.aqje r27) {
        /*
            r24 = this;
            r0 = r24
            r12 = r25
            r1 = r27
            aqhw r2 = r0.a
            boolean r2 = r2.w()
            if (r2 != 0) goto L_0x001c
            if (r1 == 0) goto L_0x001b
            aqip r2 = r0.d
            if (r2 == 0) goto L_0x001b
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x001b
            goto L_0x002c
        L_0x001b:
            return
        L_0x001c:
            if (r1 == 0) goto L_0x030a
            aqip r2 = r0.d
            if (r2 == 0) goto L_0x030a
            boolean r2 = r2.a()
            if (r2 != 0) goto L_0x002c
            r24.f()
            return
        L_0x002c:
            double r2 = r0.h
            double r2 = r12 - r2
            aqhw r4 = r0.a
            double r4 = r4.j()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0309
            int[] r2 = b
            double[] r3 = r0.f
            aqjd[] r4 = r1.b
            int r5 = r4.length
            r6 = 0
            r8 = 1
            r9 = 0
            if (r5 != 0) goto L_0x0048
            goto L_0x0098
        L_0x0048:
            r4 = r4[r9]
            aqjc r4 = r4.a
            double[] r4 = r4.b
            int r4 = r4.length
            int r5 = r3.length
            if (r4 != r5) goto L_0x0055
            r4 = 1
            goto L_0x0056
        L_0x0055:
            r4 = 0
        L_0x0056:
            defpackage.ativ.b(r4)
            java.util.Arrays.fill(r3, r6)
            r10 = r6
            r4 = 0
        L_0x005e:
            aqjd[] r5 = r1.b
            int r5 = r5.length
            if (r4 >= r5) goto L_0x008a
            double r14 = r1.a(r4)
            double r10 = r10 + r14
            aqjd[] r5 = r1.b
            r5 = r5[r4]
            aqjc r5 = r5.a
            double[] r5 = r5.b
            r14 = 0
        L_0x0071:
            int r15 = r2.length
            if (r14 >= r15) goto L_0x0087
            r15 = r2[r14]
            r16 = r3[r15]
            r18 = r5[r15]
            double r20 = r1.a(r4)
            double r18 = r18 * r20
            double r16 = r16 + r18
            r3[r15] = r16
            int r14 = r14 + 1
            goto L_0x0071
        L_0x0087:
            int r4 = r4 + 1
            goto L_0x005e
        L_0x008a:
            r4 = 0
        L_0x008b:
            int r5 = r2.length
            if (r4 >= r5) goto L_0x0098
            r5 = r2[r4]
            r14 = r3[r5]
            double r14 = r14 / r10
            r3[r5] = r14
            int r4 = r4 + 1
            goto L_0x008b
        L_0x0098:
            aqip r2 = r0.d
            double[] r3 = r0.f
            aqiq r2 = r2.c
            if (r3 == 0) goto L_0x0184
            boolean r4 = r2.a()
            if (r4 != 0) goto L_0x00bd
            boolean r4 = r2.b()
            if (r4 != 0) goto L_0x00bd
            boolean r4 = r2.c()
            if (r4 == 0) goto L_0x00b3
            goto L_0x00bd
        L_0x00b3:
            double r3 = r2.f
            defpackage.aqju.b()
            r2.g()
            goto L_0x0184
        L_0x00bd:
            boolean r4 = r2.b()
            r10 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            if (r4 == 0) goto L_0x00ce
            aqjb r4 = r2.e()
            double r4 = defpackage.aqjw.a(r3, r4)
            goto L_0x00cf
        L_0x00ce:
            r4 = r10
        L_0x00cf:
            boolean r14 = r2.a()
            if (r14 == 0) goto L_0x00de
            aqjb r10 = r2.f()
            double r10 = defpackage.aqjw.a(r3, r10)
            goto L_0x00df
        L_0x00de:
        L_0x00df:
            boolean r14 = r2.b()
            if (r14 == 0) goto L_0x0100
            boolean r14 = r2.a()
            if (r14 != 0) goto L_0x0100
            aqjb r14 = r2.e()
            boolean r4 = r2.a((double) r4, (defpackage.aqjb) r14)
            if (r4 != 0) goto L_0x00f6
            goto L_0x0100
        L_0x00f6:
            double r3 = r2.f
            defpackage.aqju.c()
            r2.b((boolean) r9)
            goto L_0x0184
        L_0x0100:
            boolean r4 = r2.b()
            if (r4 != 0) goto L_0x0120
            boolean r4 = r2.a()
            if (r4 == 0) goto L_0x0120
            aqjb r4 = r2.f()
            boolean r4 = r2.a((double) r10, (defpackage.aqjb) r4)
            if (r4 != 0) goto L_0x0117
            goto L_0x0120
        L_0x0117:
            double r3 = r2.f
            defpackage.aqju.c()
            r2.b((boolean) r9)
            goto L_0x0184
        L_0x0120:
            boolean r4 = r2.b()
            if (r4 == 0) goto L_0x0184
            boolean r4 = r2.a()
            if (r4 == 0) goto L_0x0184
            aqjb r4 = r2.e()
            aqjb r5 = r2.f()
            double r10 = r4.a(r9)
            double r14 = r4.a(r8)
            double r16 = r5.a(r9)
            double r10 = r10 - r16
            double r4 = r5.a(r8)
            double r14 = r14 - r4
            double r4 = java.lang.Math.hypot(r10, r14)
            aqic r10 = r2.a
            double r10 = r10.h()
            int r14 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r14 <= 0) goto L_0x0168
            aqjb r4 = r2.e()
            boolean r3 = r2.a((double[]) r3, (defpackage.aqjb) r4)
            if (r3 == 0) goto L_0x0184
            double r3 = r2.f
            defpackage.aqju.c()
            r2.b((boolean) r9)
            goto L_0x0184
        L_0x0168:
            aqjb r4 = r2.e()
            boolean r4 = r2.a((double[]) r3, (defpackage.aqjb) r4)
            if (r4 == 0) goto L_0x0184
            aqjb r4 = r2.f()
            boolean r3 = r2.a((double[]) r3, (defpackage.aqjb) r4)
            if (r3 == 0) goto L_0x0184
            double r3 = r2.f
            defpackage.aqju.c()
            r2.b((boolean) r9)
        L_0x0184:
            aqhw r2 = r0.a
            boolean r2 = r2.v()
            if (r2 == 0) goto L_0x0199
            aqip r2 = r0.d
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x0195
            goto L_0x0199
        L_0x0195:
            r24.f()
            return
        L_0x0199:
            aqis r2 = r0.e
            double[] r3 = r0.f
            r4 = r3[r9]
            r10 = r3[r8]
            int[] r3 = r0.g
            int r14 = r3.length
            r15 = 2
            if (r14 != r15) goto L_0x01a9
            r14 = 1
            goto L_0x01aa
        L_0x01a9:
            r14 = 0
        L_0x01aa:
            java.lang.String r15 = "Passed double[] result must be have length 2!"
            defpackage.ativ.b(r14, r15)
            aqff r14 = r2.b
            if (r14 == 0) goto L_0x0308
            int r14 = r14.a((double) r10)
            aqff r15 = r2.b
            int r15 = r15.b((double) r4)
            boolean r6 = r2.c
            aqff r6 = r2.b
            double r4 = r6.a(r4, r10)
            r6 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 <= 0) goto L_0x01d1
            r2.a(r14, r15)
        L_0x01d1:
            r3[r9] = r14
            r3[r8] = r15
            double[] r2 = r0.f
            int[] r3 = c
            if (r2 == 0) goto L_0x022a
            int r4 = r3.length
            if (r4 == 0) goto L_0x022a
            int r4 = r2.length
            if (r4 == 0) goto L_0x022a
            aqjd[] r5 = r1.b
            int r6 = r5.length
            if (r6 == 0) goto L_0x022a
            r5 = r5[r9]
            aqjc r5 = r5.a
            double[] r5 = r5.b
            int r5 = r5.length
            if (r5 != r4) goto L_0x022a
            r4 = 0
            r5 = 0
            r10 = 0
        L_0x01f5:
            aqjd[] r7 = r1.b
            int r14 = r7.length
            if (r4 >= r14) goto L_0x0224
            r7 = r7[r4]
            aqjc r7 = r7.a
            double[] r7 = r7.b
            r14 = 0
            r18 = 0
        L_0x0203:
            int r15 = r3.length
            if (r14 >= r15) goto L_0x0215
            r15 = r3[r14]
            r20 = r7[r15]
            r22 = r2[r15]
            double r20 = r20 - r22
            double r20 = r20 * r20
            double r18 = r18 + r20
            int r14 = r14 + 1
            goto L_0x0203
        L_0x0215:
            double r14 = r1.a(r4)
            double r10 = r10 + r14
            double r14 = r1.a(r4)
            double r14 = r14 * r18
            double r5 = r5 + r14
            int r4 = r4 + 1
            goto L_0x01f5
        L_0x0224:
            double r5 = r5 / r10
            double r6 = java.lang.Math.sqrt(r5)
            goto L_0x022c
        L_0x022a:
            r6 = 0
        L_0x022c:
            aqhw r2 = r0.a
            double r2 = r2.k()
            double r14 = r6 * r2
            aqhw r2 = r0.a
            double r16 = r2.l()
            aqhw r2 = r0.a
            double r18 = r2.m()
            double r2 = defpackage.aqjt.a(r14, r16, r18)
            long r2 = defpackage.aqjs.b((double) r2)
            int r3 = (int) r2
            aqhy r2 = r0.l
            aqho r2 = (defpackage.aqho) r2
            boolean r2 = r2.d
            if (r2 == 0) goto L_0x0263
            double r1 = a((defpackage.aqje) r27)
            double r1 = a((double) r1)
            double r1 = defpackage.aqjt.b(r1)
            double r1 = java.lang.Math.toDegrees(r1)
            float r1 = (float) r1
            goto L_0x0270
        L_0x0263:
            double r1 = a((defpackage.aqje) r27)
            double r1 = a((double) r1)
            double r1 = java.lang.Math.toDegrees(r1)
            float r1 = (float) r1
        L_0x0270:
            aqew r2 = defpackage.aqey.k()
            int[] r4 = r0.g
            r5 = r4[r9]
            r4 = r4[r8]
            r2.a((int) r5, (int) r4, (int) r3)
            r2.b((float) r1)
            aqgu r1 = r0.j
            aqgx r1 = r1.c
            aqey r1 = r1.e
            if (r1 != 0) goto L_0x0289
            goto L_0x02b2
        L_0x0289:
            aqex r3 = r1.a
            if (r3 != 0) goto L_0x028e
            goto L_0x0291
        L_0x028e:
            r2.a((defpackage.aqex) r3)
        L_0x0291:
            boolean r3 = r1.f()
            if (r3 == 0) goto L_0x029c
            double r3 = r1.g
            r2.a((double) r3)
        L_0x029c:
            boolean r3 = r1.d()
            if (r3 == 0) goto L_0x02a7
            float r3 = r1.e
            r2.d(r3)
        L_0x02a7:
            boolean r3 = r1.g()
            if (r3 == 0) goto L_0x02b2
            double r3 = r1.h
            r2.b((double) r3)
        L_0x02b2:
            aqey r1 = r2.a()
            r0.k = r1
            aqip r2 = r0.d
            if (r2 != 0) goto L_0x02bd
        L_0x02bc:
            goto L_0x0305
        L_0x02bd:
            if (r1 == 0) goto L_0x02bc
            defpackage.aqjs.a((double) r25)
            java.util.Set r2 = defpackage.aqju.a
            java.util.Iterator r2 = r2.iterator()
        L_0x02c8:
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L_0x02fe
            double r2 = r0.i
            double r2 = r12 - r2
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0305
            aqip r14 = r0.d
            aqjb r15 = new aqjb
            r2 = 100
            int r3 = r1.b
            double r5 = defpackage.aell.b((int) r3)
            int r3 = r1.c
            double r7 = defpackage.aell.b((int) r3)
            int r1 = r1.d
            long r3 = (long) r1
            double r9 = defpackage.aqjs.b((long) r3)
            r11 = 0
            r1 = r15
            r3 = r25
            r1.<init>(r2, r3, r5, r7, r9, r11)
            r14.a((defpackage.aqjb) r15)
            r0.i = r12
            goto L_0x0305
        L_0x02fe:
            java.lang.Object r3 = r2.next()
            aqjv r3 = (defpackage.aqjv) r3
            goto L_0x02c8
        L_0x0305:
            r0.h = r12
            return
        L_0x0308:
            return
        L_0x0309:
            return
        L_0x030a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqgs.a(double, aqje):void");
    }

    public final void a(long j2, float f2, float f3) {
        this.j.d.a(1, j2);
    }

    public final void a(long j2, aqey aqey) {
        this.j.c.a(1, j2, aqey);
    }

    public final void a(long j2, PrintWriter printWriter) {
        aqip aqip;
        if (printWriter != null && (aqip = this.d) != null) {
            synchronized (aqip.a) {
                aqiq aqiq = aqip.c;
                printWriter.printf("  Attitude initialized: %b%n", new Object[]{Boolean.valueOf(aqiq.b)});
                printWriter.printf("  Position initialized: %b%n", new Object[]{Boolean.valueOf(aqiq.c)});
                printWriter.printf("  Last GNSS valid: %b%n", new Object[]{Boolean.valueOf(aqiq.b())});
                printWriter.printf("  Last WiFi valid: %b%n", new Object[]{Boolean.valueOf(aqiq.a())});
                printWriter.printf("  Last Step valid: %b%n", new Object[]{Boolean.valueOf(aqiq.c())});
                if (aqip.b()) {
                    aqip.d.a(j2, printWriter);
                }
            }
        }
    }

    public final void a(aqff aqff, aqff aqff2) {
        for (aqjv aqjv : aqju.a) {
        }
        if (aqff != null) {
            aqip aqip = this.d;
            aqiq aqiq = aqip.c;
            aqiq.b(aqis.a(aqiq.i, aqff, aqff2));
            aqiq aqiq2 = aqip.c;
            aqiq2.d(aqis.a(aqiq2.j, aqff, aqff2));
            for (aqjd aqjd : aqip.g.h.b) {
                double[] dArr = aqjd.a.b;
                dArr[0] = aqff2.b(aqff.b(dArr[0]));
                dArr[1] = aqff2.a(aqff.a(dArr[1]));
            }
            if (!Double.isNaN(aqip.c.f)) {
                aqip.a(new aqjb(103, aqip.c.f, aell.b(aqff2.a), aell.b(aqff2.b), 0.0d, (byte[]) null));
            }
        }
    }
}
