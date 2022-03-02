package defpackage;

/* renamed from: aqgx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqgx extends aqgt {
    public final aqhj c;
    public final aqhl d;
    public aqey e;

    public aqgx(aqjh aqjh, aqis aqis, aqii aqii, aqii aqii2, double d2) {
        super(aqjh);
        this.c = new aqhj(aqis, aqii);
        this.d = new aqhl(aqis, aqii2, d2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r20, long r21, defpackage.aqey r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r3 = r23
            if (r3 == 0) goto L_0x011d
            int r4 = r0.b
            r5 = r20
            if (r5 != r4) goto L_0x011d
            boolean r4 = r23.a()
            r5 = 0
            if (r4 == 0) goto L_0x00ac
            aqhj r4 = r0.c
            int r13 = r3.b
            int r14 = r3.c
            int r6 = r3.d
            long r6 = (long) r6
            double r9 = defpackage.aqjs.b((long) r6)
            r6 = -900000000(0xffffffffca5b1700, float:-3589568.0)
            if (r13 < r6) goto L_0x0066
            r6 = 900000000(0x35a4e900, float:1.2286764E-6)
            if (r13 > r6) goto L_0x0066
            r6 = -1800000000(0xffffffff94b62e00, float:-1.8395447E-26)
            if (r14 < r6) goto L_0x0066
            r6 = 1800000000(0x6b49d200, float:2.4398579E26)
            if (r14 > r6) goto L_0x0066
            r6 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r8 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0041
            r1 = r5
            goto L_0x0067
        L_0x0041:
            if (r13 == 0) goto L_0x0044
            goto L_0x0047
        L_0x0044:
            if (r14 != 0) goto L_0x0047
            goto L_0x0066
        L_0x0047:
            double r1 = defpackage.aqjs.a((long) r21)
            aqhk r6 = r4.b
            r7 = r13
            r8 = r14
            r11 = r1
            double r15 = r6.a(r7, r8, r9, r11)
            boolean r6 = java.lang.Double.isNaN(r15)
            if (r6 != 0) goto L_0x0066
            aqis r6 = r4.a
            r7 = 1
            r8 = r1
            r10 = r13
            r11 = r14
            r12 = r15
            aqjb r1 = r6.a(r7, r8, r10, r11, r12)
            goto L_0x0067
        L_0x0066:
            r1 = r5
        L_0x0067:
            if (r1 != 0) goto L_0x006b
            goto L_0x00fa
        L_0x006b:
            boolean r2 = r23.d()
            if (r2 != 0) goto L_0x007a
            boolean r2 = r23.h()
            if (r2 == 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            goto L_0x00fa
        L_0x007a:
            boolean r2 = r23.d()
            r4 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            if (r2 == 0) goto L_0x0087
            float r2 = r3.e
            double r6 = (double) r2
            r10 = r6
            goto L_0x0088
        L_0x0087:
            r10 = r4
        L_0x0088:
            boolean r2 = r23.h()
            if (r2 == 0) goto L_0x00a1
            float r2 = r3.l
            double r4 = (double) r2
            r6 = -4587338432941916160(0xc056800000000000, double:-90.0)
            java.lang.Double.isNaN(r4)
            double r4 = r4 + r6
            double r4 = java.lang.Math.toRadians(r4)
            double r4 = -r4
            r12 = r4
            goto L_0x00a2
        L_0x00a1:
            r12 = r4
        L_0x00a2:
            aqik r5 = new aqik
            double r7 = r1.d
            r6 = r5
            r9 = r1
            r6.<init>(r7, r9, r10, r12)
            goto L_0x00fa
        L_0x00ac:
            boolean r4 = r23.b()
            if (r4 == 0) goto L_0x00f9
            aqhl r4 = r0.d
            int r13 = r3.b
            int r14 = r3.c
            int r6 = r3.d
            long r6 = (long) r6
            long r8 = r4.d
            int r10 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r10 == 0) goto L_0x00f7
            double r8 = (double) r6
            double r10 = r4.a
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x00ca
            r1 = r5
            goto L_0x00f8
        L_0x00ca:
            if (r13 == 0) goto L_0x00cd
            goto L_0x00d0
        L_0x00cd:
            if (r14 != 0) goto L_0x00d0
            goto L_0x00f7
        L_0x00d0:
            double r15 = defpackage.aqjs.a((long) r21)
            aqhk r8 = r4.c
            double r9 = defpackage.aqjs.b((long) r6)
            r6 = r8
            r7 = r13
            r8 = r14
            r11 = r15
            double r17 = r6.a(r7, r8, r9, r11)
            boolean r6 = java.lang.Double.isNaN(r17)
            if (r6 != 0) goto L_0x00f7
            r4.d = r1
            aqis r6 = r4.b
            r7 = 2
            r8 = r15
            r10 = r13
            r11 = r14
            r12 = r17
            aqjb r1 = r6.a(r7, r8, r10, r11, r12)
            goto L_0x00f8
        L_0x00f7:
            r1 = r5
        L_0x00f8:
            goto L_0x00fa
        L_0x00f9:
            r1 = r5
        L_0x00fa:
            if (r5 == 0) goto L_0x0102
            r0.a(r5)
            r0.e = r3
            goto L_0x0109
        L_0x0102:
            if (r1 == 0) goto L_0x0109
            r0.a(r1)
            r0.e = r3
        L_0x0109:
            java.util.Set r1 = defpackage.aqju.a
            java.util.Iterator r1 = r1.iterator()
        L_0x010f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x011c
            java.lang.Object r2 = r1.next()
            aqjv r2 = (defpackage.aqjv) r2
            goto L_0x010f
        L_0x011c:
            return
        L_0x011d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqgx.a(int, long, aqey):void");
    }
}
