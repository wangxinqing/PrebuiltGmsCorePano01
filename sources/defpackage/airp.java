package defpackage;

/* renamed from: airp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class airp implements arpv {
    private static ajqy a;
    private static final airp c = new airp();
    private final arvn b;

    static {
        airp.class.getSimpleName();
    }

    public airp() {
        a = null;
        arvo arvo = new arvo();
        arvo.a = aydu.a.a().rttHistoryRangeTimeToLiveSeconds();
        arvp arvp = new arvp();
        arvp.a = 1.0d;
        arvp.b = -0.6d;
        arvp.c = 2.8d;
        arvp.d = arvo.a;
        arvp.e = 1.0d;
        arvp.f = 0.2d;
        arvp.g = 4;
        arvp.h = 6;
        arvp.i = -90;
        arvp.j = -5;
        arvp.k = 2;
        this.b = new arvn(this, arvp);
    }

    public static airp a(arpv arpv) {
        if (a == null) {
            a = new ajqy(arpv);
        }
        a.a();
        return c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x05b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aibo a(defpackage.aibv[] r47) {
        /*
            r46 = this;
            r0 = r47
            java.lang.Class<double> r1 = double.class
            boolean r2 = defpackage.aydu.c()
            if (r2 == 0) goto L_0x065f
            if (r0 == 0) goto L_0x065f
            int r2 = r0.length
            if (r2 <= 0) goto L_0x065f
            ajqy r4 = a
            if (r4 != 0) goto L_0x0014
            goto L_0x0018
        L_0x0014:
            r4.a()
        L_0x0018:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 55
            r4.<init>(r5)
            java.lang.String r5 = "Attempting RTT location with scan of length "
            r4.append(r5)
            r4.append(r2)
            r4.toString()
            r4 = r46
            arvn r5 = r4.b
            r6 = 1
            defpackage.amrl.a((boolean) r6)
            defpackage.amrl.a((boolean) r6)
            r7 = -9223372036854775808
            r10 = 0
            r11 = 0
        L_0x0039:
            if (r10 >= r2) goto L_0x0108
            r9 = r0[r10]
            int r12 = r5.f
            int r12 = r12 + r6
            r5.f = r12
            int r12 = r9.b
            if (r12 == 0) goto L_0x0049
            r13 = r1
            goto L_0x00f8
        L_0x0049:
            int r12 = r9.f
            if (r12 == 0) goto L_0x00f7
            int r12 = r9.i
            if (r12 == 0) goto L_0x00f7
            int r12 = r9.d
            arvp r13 = r5.c
            int r6 = r13.j
            if (r12 >= r6) goto L_0x00f7
            int r6 = r13.i
            if (r12 <= r6) goto L_0x00f7
            double r11 = r13.a
            double r14 = r13.b
            double r3 = r13.c
            int r6 = r9.e
            r13 = r1
            double r0 = (double) r6
            r24 = 4636737291354636288(0x4059000000000000, double:100.0)
            java.lang.Double.isNaN(r0)
            double r0 = r0 / r24
            double r0 = r0 - r14
            double r0 = r0 * r11
            r14 = 0
            double r0 = java.lang.Math.max(r0, r14)
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 < 0) goto L_0x0087
            double r14 = r0 * r0
            double r3 = r3 * r3
            double r14 = r14 - r3
            double r3 = java.lang.Math.sqrt(r14)
            r29 = r3
            goto L_0x0089
        L_0x0087:
            r29 = 0
        L_0x0089:
            int r3 = r9.f
            double r3 = (double) r3
            java.lang.Double.isNaN(r3)
            double r3 = r3 / r24
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.pow(r3, r14)
            double r3 = r3 * r11
            double r0 = r29 / r0
            double r3 = r3 * r0
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r31 = java.lang.Math.max(r3, r0)
            int r0 = r9.i
            int r1 = r9.d
            long r3 = r9.c
            arvr r11 = new arvr
            long r14 = r9.a
            double r3 = (double) r3
            r17 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            java.lang.Double.isNaN(r3)
            double r35 = r3 / r17
            r26 = r11
            r27 = r14
            r33 = r0
            r34 = r1
            r26.<init>(r27, r29, r31, r33, r34, r35)
            arvx r0 = r5.a
            long r3 = r11.a
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.util.Map r3 = r0.a
            java.lang.Object r3 = r3.get(r1)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x00e0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Map r4 = r0.a
            r4.put(r1, r3)
            goto L_0x00e1
        L_0x00e0:
        L_0x00e1:
            r1 = 0
            r3.add(r1, r11)
            double r14 = r11.f
            r0.a(r3, r14)
            long r0 = r9.c
            r3 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r3
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 < 0) goto L_0x00f5
            goto L_0x00fe
        L_0x00f5:
            r7 = r0
            goto L_0x00fe
        L_0x00f7:
            r13 = r1
        L_0x00f8:
            int r0 = r5.e
            r1 = 1
            int r0 = r0 + r1
            r5.e = r0
        L_0x00fe:
            int r10 = r10 + 1
            r4 = r46
            r0 = r47
            r1 = r13
            r6 = 1
            goto L_0x0039
        L_0x0108:
            r13 = r1
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            if (r11 != 0) goto L_0x0116
            double r2 = (double) r7
            java.lang.Double.isNaN(r2)
            double r2 = r2 / r0
            goto L_0x0118
        L_0x0116:
            double r2 = r11.f
        L_0x0118:
            arvx r4 = r5.a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Map r9 = r4.a
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x0129:
            boolean r10 = r9.hasNext()
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = 2
            if (r10 == 0) goto L_0x018d
            java.lang.Object r10 = r9.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r10 = r10.getValue()
            java.util.List r10 = (java.util.List) r10
            r4.a(r10, r2)
            boolean r15 = r10.isEmpty()
            if (r15 == 0) goto L_0x014b
            r9.remove()
            goto L_0x0129
        L_0x014b:
            if (r10 == 0) goto L_0x017b
            int r15 = r4.d
            int r0 = r15 + -1
            if (r15 == 0) goto L_0x0178
            if (r0 == 0) goto L_0x016e
            r1 = 1
            if (r0 == r1) goto L_0x0165
            if (r0 == r14) goto L_0x015c
            r0 = 0
            goto L_0x017c
        L_0x015c:
            double r0 = r4.b
            double r11 = r4.c
            arvr r0 = defpackage.arvx.a(r10, r0, r11)
            goto L_0x017c
        L_0x0165:
            r0 = 0
            arvr r10 = defpackage.arvx.a(r10, r11, r0)
            r0 = r10
            goto L_0x017c
        L_0x016e:
            r0 = 0
            java.lang.Object r1 = r10.get(r0)
            r0 = r1
            arvr r0 = (defpackage.arvr) r0
            goto L_0x017c
        L_0x0178:
            r0 = 0
            throw r0
        L_0x017b:
            r0 = 0
        L_0x017c:
            if (r0 == 0) goto L_0x0187
            r6.add(r0)
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            goto L_0x0129
        L_0x0187:
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            goto L_0x0129
        L_0x018d:
            arpv r0 = r5.b
            r1 = 1
            defpackage.amrl.a((boolean) r1)
            defpackage.amrl.a((boolean) r1)
            java.util.ListIterator r1 = r6.listIterator()
        L_0x019a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x01b6
            java.lang.Object r4 = r1.next()
            arvr r4 = (defpackage.arvr) r4
            long r9 = r4.a
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            arpu r4 = r0.a(r4)
            if (r4 != 0) goto L_0x019a
            r1.remove()
            goto L_0x019a
        L_0x01b6:
            arvp r0 = r5.c
            int r1 = r0.g
            int r0 = r0.h
            r4 = 1
            defpackage.amrl.a((boolean) r4)
            int r4 = r6.size()
            if (r4 >= r1) goto L_0x01c8
            r6 = 0
            goto L_0x01db
        L_0x01c8:
            if (r1 > r0) goto L_0x01da
            java.util.Comparator r1 = defpackage.arvw.a
            java.util.Collections.sort(r6, r1)
            if (r0 >= r4) goto L_0x01d9
            java.util.List r0 = r6.subList(r0, r4)
            r0.clear()
            goto L_0x01db
        L_0x01d9:
            goto L_0x01db
        L_0x01da:
            r6 = 0
        L_0x01db:
            arpv r0 = r5.b
            if (r6 == 0) goto L_0x05fb
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x05fb
            int r1 = r6.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            amzt r1 = new amzt
            r1.<init>()
            int r9 = r6.size()
            r10 = 0
            r11 = 0
            r15 = 0
        L_0x01fa:
            if (r15 >= r9) goto L_0x024f
            java.lang.Object r12 = r6.get(r15)
            arvr r12 = (defpackage.arvr) r12
            r28 = r15
            long r14 = r12.a
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            arpu r14 = r0.a(r14)
            if (r14 != 0) goto L_0x0214
            r15 = r6
            r29 = r7
            goto L_0x0244
        L_0x0214:
            if (r10 != 0) goto L_0x022c
            aqff r10 = new aqff
            r29 = r7
            r8 = r6
            double r6 = r14.j
            int r6 = defpackage.aell.a((double) r6)
            r15 = r8
            double r7 = r14.k
            int r7 = defpackage.aell.a((double) r7)
            r10.<init>(r6, r7)
            goto L_0x022f
        L_0x022c:
            r15 = r6
            r29 = r7
        L_0x022f:
            arvs r6 = new arvs
            r6.<init>(r12, r14, r10)
            float r7 = r14.d
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x023f
            r4.add(r6)
            goto L_0x0244
        L_0x023f:
            r1.c(r6)
            int r11 = r11 + 1
        L_0x0244:
            int r6 = r28 + 1
            r7 = r29
            r14 = 2
            r45 = r15
            r15 = r6
            r6 = r45
            goto L_0x01fa
        L_0x024f:
            r29 = r7
            r0 = 3
            if (r11 < r0) goto L_0x0255
            goto L_0x0258
        L_0x0255:
            r1.b((java.lang.Iterable) r4)
        L_0x0258:
            amzy r1 = r1.a()
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L_0x0263
            goto L_0x0264
        L_0x0263:
            r1 = 0
        L_0x0264:
            if (r1 == 0) goto L_0x05f5
            int r4 = r1.size()
            if (r4 < r0) goto L_0x03eb
            int r6 = r4 + -1
            r7 = 2
            int[] r8 = new int[r7]
            r9 = 1
            r8[r9] = r7
            r10 = 0
            r8[r10] = r6
            java.lang.Object r8 = java.lang.reflect.Array.newInstance(r13, r8)
            double[][] r8 = (double[][]) r8
            int[] r11 = new int[r7]
            r11[r9] = r9
            r11[r10] = r6
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r13, r11)
            double[][] r6 = (double[][]) r6
            int[] r9 = new int[r7]
            r9 = {2, 2} // fill-array
            java.lang.Object r9 = java.lang.reflect.Array.newInstance(r13, r9)
            double[][] r9 = (double[][]) r9
            int[] r10 = new int[r7]
            r10 = {2, 1} // fill-array
            java.lang.Object r10 = java.lang.reflect.Array.newInstance(r13, r10)
            double[][] r10 = (double[][]) r10
            int[] r11 = new int[r7]
            r11 = {2, 1} // fill-array
            java.lang.Object r7 = java.lang.reflect.Array.newInstance(r13, r11)
            double[][] r7 = (double[][]) r7
            r11 = 0
            java.lang.Object r12 = r1.get(r11)
            arvs r12 = (defpackage.arvs) r12
            arvq r12 = r12.d
            double r14 = r12.a
            java.lang.Object r12 = r1.get(r11)
            arvs r12 = (defpackage.arvs) r12
            arvq r12 = r12.d
            r31 = r2
            double r2 = r12.b
            java.lang.Object r12 = r1.get(r11)
            arvs r12 = (defpackage.arvs) r12
            double r11 = r12.a
            r0 = 1
        L_0x02ca:
            if (r0 >= r4) goto L_0x0342
            java.lang.Object r33 = r1.get(r0)
            r34 = r5
            r5 = r33
            arvs r5 = (defpackage.arvs) r5
            arvq r5 = r5.d
            r33 = r4
            double r4 = r5.a
            java.lang.Object r35 = r1.get(r0)
            r36 = r13
            r13 = r35
            arvs r13 = (defpackage.arvs) r13
            arvq r13 = r13.d
            r35 = r9
            r37 = r10
            double r9 = r13.b
            java.lang.Object r13 = r1.get(r0)
            arvs r13 = (defpackage.arvs) r13
            r38 = r11
            double r11 = r13.a
            int r13 = r0 + -1
            r40 = r8[r13]
            double r4 = r4 - r14
            r16 = 0
            r40[r16] = r4
            double r9 = r9 - r2
            r19 = 1
            r40[r19] = r9
            r40 = r1
            r41 = r2
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.pow(r4, r1)
            double r9 = java.lang.Math.pow(r9, r1)
            r5 = r6[r13]
            r20 = r14
            r13 = r38
            double r38 = java.lang.Math.pow(r13, r1)
            double r11 = java.lang.Math.pow(r11, r1)
            double r38 = r38 - r11
            double r3 = r3 + r9
            double r38 = r38 + r3
            r3 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r38 = r38 * r3
            r9 = 0
            r5[r9] = r38
            int r0 = r0 + 1
            r11 = r13
            r14 = r20
            r4 = r33
            r5 = r34
            r9 = r35
            r13 = r36
            r10 = r37
            r1 = r40
            r2 = r41
            goto L_0x02ca
        L_0x0342:
            r40 = r1
            r41 = r2
            r33 = r4
            r34 = r5
            r35 = r9
            r37 = r10
            r36 = r13
            r20 = r14
            qul r0 = new qul
            r0.<init>(r8)
            qul r1 = new qul
            r1.<init>(r7)
            qul r2 = new qul
            r2.<init>(r6)
            qul r3 = new qul
            r3.<init>(r9)
            qul r4 = new qul
            r4.<init>(r10)
            defpackage.aqgr.b(r0, r0, r3)
            defpackage.aqgr.b(r0, r2, r4)
            boolean r0 = defpackage.arvu.a(r3)
            if (r0 == 0) goto L_0x03e8
            aqgq r0 = new aqgq
            r0.<init>()
            r0.a(r3)
            r0.a(r4, r1)
            r0 = 0
            double r2 = r1.a(r0, r0)
            double r5 = r2 + r20
            r2 = 1
            double r3 = r1.a(r2, r0)
            double r7 = r3 + r41
            r0 = 0
            r14 = 0
        L_0x0393:
            r1 = r33
            if (r0 >= r1) goto L_0x03c6
            r2 = r40
            java.lang.Object r3 = r2.get(r0)
            arvs r3 = (defpackage.arvs) r3
            double r3 = r3.a
            java.lang.Object r9 = r2.get(r0)
            arvs r9 = (defpackage.arvs) r9
            arvq r9 = r9.d
            double r9 = r9.a
            double r9 = r5 - r9
            java.lang.Object r11 = r2.get(r0)
            arvs r11 = (defpackage.arvs) r11
            arvq r11 = r11.d
            double r11 = r11.b
            double r11 = r7 - r11
            double r9 = java.lang.Math.hypot(r9, r11)
            double r3 = r3 - r9
            double r3 = r3 * r3
            double r14 = r14 + r3
            int r0 = r0 + 1
            r33 = r1
            goto L_0x0393
        L_0x03c6:
            r2 = r40
            arvq r0 = new arvq
            r3 = 0
            java.lang.Object r4 = r2.get(r3)
            arvs r4 = (defpackage.arvs) r4
            arvq r4 = r4.d
            aqff r11 = r4.d
            java.lang.Object r4 = r2.get(r3)
            arvs r4 = (defpackage.arvs) r4
            double r3 = r4.c
            double r3 = (double) r1
            java.lang.Double.isNaN(r3)
            double r9 = r14 / r3
            r4 = r0
            r4.<init>(r5, r7, r9, r11)
            goto L_0x03f3
        L_0x03e8:
            r2 = r40
            goto L_0x03f2
        L_0x03eb:
            r31 = r2
            r34 = r5
            r36 = r13
            r2 = r1
        L_0x03f2:
            r0 = 0
        L_0x03f3:
            if (r0 == 0) goto L_0x05f9
            r3 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r1 = 0
        L_0x03fb:
            int r5 = r2.size()
            r6 = 3
            if (r5 < r6) goto L_0x05a3
            r7 = 2
            int[] r8 = new int[r7]
            r9 = 1
            r8[r9] = r9
            r10 = 0
            r8[r10] = r5
            r11 = r36
            java.lang.Object r8 = java.lang.reflect.Array.newInstance(r11, r8)
            double[][] r8 = (double[][]) r8
            int[] r12 = new int[r7]
            r12[r9] = r7
            r12[r10] = r5
            java.lang.Object r12 = java.lang.reflect.Array.newInstance(r11, r12)
            double[][] r12 = (double[][]) r12
            int[] r13 = new int[r7]
            r13[r9] = r5
            r13[r10] = r5
            java.lang.Object r13 = java.lang.reflect.Array.newInstance(r11, r13)
            double[][] r13 = (double[][]) r13
            int[] r14 = new int[r7]
            r14[r9] = r9
            r14[r10] = r5
            java.lang.Object r14 = java.lang.reflect.Array.newInstance(r11, r14)
            double[][] r14 = (double[][]) r14
            int[] r15 = new int[r7]
            r15[r9] = r7
            r15[r10] = r5
            java.lang.Object r9 = java.lang.reflect.Array.newInstance(r11, r15)
            double[][] r9 = (double[][]) r9
            int[] r10 = new int[r7]
            r10 = {2, 2} // fill-array
            java.lang.Object r10 = java.lang.reflect.Array.newInstance(r11, r10)
            double[][] r10 = (double[][]) r10
            int[] r15 = new int[r7]
            r15 = {2, 1} // fill-array
            java.lang.Object r15 = java.lang.reflect.Array.newInstance(r11, r15)
            double[][] r15 = (double[][]) r15
            int[] r6 = new int[r7]
            r6 = {2, 1} // fill-array
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r11, r6)
            double[][] r6 = (double[][]) r6
            r7 = 0
            r17 = 0
        L_0x0467:
            if (r7 >= r5) goto L_0x047c
            java.lang.Object r20 = r2.get(r7)
            r35 = r3
            r3 = r20
            arvs r3 = (defpackage.arvs) r3
            double r3 = r3.b
            double r17 = r17 + r3
            int r7 = r7 + 1
            r3 = r35
            goto L_0x0467
        L_0x047c:
            r35 = r3
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r17 = r3 / r17
            r3 = 0
        L_0x0483:
            if (r3 < r5) goto L_0x053a
            qul r3 = new qul
            r3.<init>(r12)
            qul r4 = new qul
            r4.<init>(r8)
            qul r7 = new qul
            r7.<init>(r13)
            qul r8 = new qul
            r8.<init>(r9)
            qul r9 = new qul
            r9.<init>(r14)
            qul r12 = new qul
            r12.<init>(r10)
            qul r10 = new qul
            r10.<init>(r15)
            qul r13 = new qul
            r13.<init>(r6)
            defpackage.aqgr.a(r7, r3, r8)
            defpackage.aqgr.a(r7, r4, r9)
            defpackage.aqgr.b(r3, r8, r12)
            defpackage.aqgr.b(r3, r9, r10)
            boolean r3 = defpackage.arvu.a(r12)
            if (r3 == 0) goto L_0x052f
            aqgq r3 = new aqgq
            r3.<init>()
            r3.a(r12)
            r3.a(r10, r13)
            double r3 = r0.a
            r6 = 0
            double r7 = r13.a(r6, r6)
            double r38 = r3 - r7
            double r3 = r0.b
            r7 = 1
            double r8 = r13.a(r7, r6)
            double r40 = r3 - r8
            anhk r3 = r2.listIterator()
            r14 = 0
        L_0x04e2:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0503
            java.lang.Object r4 = r3.next()
            arvs r4 = (defpackage.arvs) r4
            double r6 = r4.a
            arvq r4 = r4.d
            double r8 = r4.a
            double r8 = r38 - r8
            double r12 = r4.b
            double r12 = r40 - r12
            double r8 = java.lang.Math.hypot(r8, r12)
            double r6 = r6 - r8
            double r6 = r6 * r6
            double r14 = r14 + r6
            goto L_0x04e2
        L_0x0503:
            arvq r3 = new arvq
            r4 = 0
            java.lang.Object r6 = r2.get(r4)
            arvs r6 = (defpackage.arvs) r6
            arvq r6 = r6.d
            aqff r6 = r6.d
            java.lang.Object r7 = r2.get(r4)
            arvs r7 = (defpackage.arvs) r7
            double r7 = r7.c
            double r4 = (double) r5
            java.lang.Double.isNaN(r4)
            double r42 = r14 / r4
            r37 = r3
            r44 = r6
            r37.<init>(r38, r40, r42, r44)
            r39 = r11
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r16 = 0
            r22 = 0
            goto L_0x05ae
        L_0x052f:
            r39 = r11
            r3 = 0
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r16 = 0
            r22 = 0
            goto L_0x05ae
        L_0x053a:
            java.lang.Object r4 = r2.get(r3)
            arvs r4 = (defpackage.arvs) r4
            arvq r7 = r4.d
            double r20 = defpackage.arvv.a(r0, r7)
            r22 = 0
            int r33 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r33 == 0) goto L_0x059c
            r33 = r8[r3]
            r37 = r8
            r38 = r9
            double r8 = r4.a
            double r8 = r20 - r8
            r16 = 0
            r33[r16] = r8
            r8 = r12[r3]
            r33 = r10
            double r9 = r0.a
            r39 = r11
            r40 = r12
            double r11 = r7.a
            double r9 = r9 - r11
            double r9 = r9 / r20
            r8[r16] = r9
            double r9 = r0.b
            double r11 = r7.b
            double r9 = r9 - r11
            double r9 = r9 / r20
            r7 = 1
            r8[r7] = r9
            r7 = 0
        L_0x0576:
            if (r7 < r5) goto L_0x0586
            int r3 = r3 + 1
            r10 = r33
            r8 = r37
            r9 = r38
            r11 = r39
            r12 = r40
            goto L_0x0483
        L_0x0586:
            r8 = r13[r3]
            if (r3 != r7) goto L_0x0593
            double r9 = r4.b
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r9 = r11 / r9
            double r9 = r9 * r17
            goto L_0x0597
        L_0x0593:
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r9 = r22
        L_0x0597:
            r8[r7] = r9
            int r7 = r7 + 1
            goto L_0x0576
        L_0x059c:
            r39 = r11
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r16 = 0
            goto L_0x05ad
        L_0x05a3:
            r39 = r36
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r16 = 0
            r22 = 0
            r35 = r3
        L_0x05ad:
            r3 = 0
        L_0x05ae:
            if (r3 == 0) goto L_0x05b8
            double r4 = defpackage.arvv.a(r3, r0)
            r0 = r3
            r35 = r4
            goto L_0x05b9
        L_0x05b8:
        L_0x05b9:
            r4 = 1
            int r1 = r1 + r4
            r4 = 100
            if (r1 < r4) goto L_0x05c0
            goto L_0x05d1
        L_0x05c0:
            r4 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r6 = (r35 > r4 ? 1 : (r35 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x05d1
            if (r3 == 0) goto L_0x05d1
            r3 = r35
            r36 = r39
            goto L_0x03fb
        L_0x05d1:
            aibe r1 = new aibe
            aqff r2 = r0.d
            double r3 = r0.b
            int r2 = r2.a((double) r3)
            aqff r3 = r0.d
            double r4 = r0.a
            int r3 = r3.b((double) r4)
            double r4 = r0.c
            double r4 = java.lang.Math.sqrt(r4)
            r6 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r4 = r4 * r6
            int r0 = (int) r4
            r1.<init>(r2, r3, r0)
            goto L_0x0602
        L_0x05f5:
            r31 = r2
            r34 = r5
        L_0x05f9:
            r1 = 0
            goto L_0x0602
        L_0x05fb:
            r31 = r2
            r34 = r5
            r29 = r7
            r1 = 0
        L_0x0602:
            if (r1 == 0) goto L_0x062d
            r0 = r34
            arvp r2 = r0.c
            int r2 = r2.k
            defpackage.amrl.a((java.lang.Object) r1)
            int r3 = r2 + -1
            if (r2 == 0) goto L_0x062a
            r2 = 1
            if (r3 == r2) goto L_0x0616
            r0 = 0
            goto L_0x062e
        L_0x0616:
            arvt r2 = r0.d
            defpackage.amrl.a((java.lang.Object) r2)
            arvt r0 = r0.d
            r0.a = r1
            r2 = r31
            r0.b = r2
            aibe r1 = r0.a
            defpackage.amrl.a((java.lang.Object) r1)
            r0 = 0
            goto L_0x062e
        L_0x062a:
            r0 = 0
            throw r0
        L_0x062d:
            r0 = 0
        L_0x062e:
            if (r1 != 0) goto L_0x0639
            aiau r1 = defpackage.aiau.NO_LOCATION
            r7 = r29
            aibo r0 = defpackage.aibo.a(r1, r7, r0)
            goto L_0x0640
        L_0x0639:
            r7 = r29
            r2 = 6
            aibo r0 = defpackage.aibo.a(r2, r1, r7, r0)
        L_0x0640:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 16
            r3.<init>(r2)
            java.lang.String r2 = "RTT location is "
            r3.append(r2)
            r3.append(r1)
            r3.toString()
            return r0
        L_0x065f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.airp.a(aibv[]):aibo");
    }

    public final arpu a(Long l) {
        ajqy ajqy = a;
        if (ajqy != null) {
            return ajqy.a(l);
        }
        return null;
    }
}
