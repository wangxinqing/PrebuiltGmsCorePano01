package defpackage;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: arpn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arpn implements arpm {
    private final arsg a;
    private final arrd b;
    private final int c;
    private final int d;
    private final boolean e;

    public arpn(arsg arsg, arrd arrd, int i, int i2, boolean z) {
        this.a = arsg;
        this.b = arrd;
        this.c = i;
        this.d = i2;
        this.e = z;
    }

    static int a(float f) {
        double min = (double) Math.min(Math.max(f, -100.0f) + 60.0f, 0.0f);
        Double.isNaN(min);
        Double.isNaN(min);
        return (int) ((100.0d * min * min) + 20000.0d);
    }

    private static Set a(Map map, Long l) {
        Set set = (Set) map.get(l);
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        map.put(l, hashSet);
        return hashSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x04ba  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0543  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aibe a(java.util.Set r35, defpackage.arrc r36) {
        /*
            r34 = this;
            r0 = r34
            r1 = r36
            int r2 = r35.size()
            r4 = 2
            if (r2 == 0) goto L_0x05b1
            r5 = 0
            r6 = 1
            if (r2 == r6) goto L_0x0585
            if (r2 == r4) goto L_0x0547
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Iterator r7 = r35.iterator()
        L_0x001a:
            boolean r8 = r7.hasNext()
            r9 = 18
            if (r8 == 0) goto L_0x003a
            java.lang.Object r8 = r7.next()
            arpu r8 = (defpackage.arpu) r8
            long r10 = r8.b
            long r9 = defpackage.aema.a((long) r10, (int) r9)
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.util.Set r9 = a((java.util.Map) r2, (java.lang.Long) r9)
            r9.add(r8)
            goto L_0x001a
        L_0x003a:
            r7 = 8
            long[] r8 = new long[r7]
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x004c:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L_0x00ad
            java.lang.Object r11 = r2.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r12 = r11.getKey()
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            java.util.Set r13 = a((java.util.Map) r10, (java.lang.Long) r12)
            java.lang.Object r14 = r11.getValue()
            java.util.Collection r14 = (java.util.Collection) r14
            r13.addAll(r14)
            long r13 = r12.longValue()
            boolean r13 = defpackage.aema.a((long) r13)
            if (r13 == 0) goto L_0x004c
            long r13 = r12.longValue()
            int r13 = defpackage.aema.b((long) r13)
            if (r13 != r9) goto L_0x004c
            long r12 = r12.longValue()
            defpackage.aema.a((long) r12, (int) r9, (long[]) r8)
            r12 = 0
        L_0x008f:
            if (r12 >= r7) goto L_0x004c
            r13 = r8[r12]
            boolean r15 = defpackage.aema.a((long) r13)
            if (r15 == 0) goto L_0x00aa
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            java.util.Set r13 = a((java.util.Map) r10, (java.lang.Long) r13)
            java.lang.Object r14 = r11.getValue()
            java.util.Collection r14 = (java.util.Collection) r14
            r13.addAll(r14)
        L_0x00aa:
            int r12 = r12 + 1
            goto L_0x008f
        L_0x00ad:
            arrd r2 = r0.b
            java.util.Set r7 = r10.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x00b7:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00ff
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r10 = r8.getValue()
            java.util.Set r10 = (java.util.Set) r10
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x00b7
            arsw r11 = r2.a
            int r11 = r11.b()
            arsw r12 = r2.a
            java.lang.Object[] r12 = r12.a
            arqx[] r12 = (defpackage.arqx[]) r12
            r12 = r12[r11]
            r12.a()
            arsw r12 = r2.a
            java.lang.Object[] r12 = r12.a
            arqx[] r12 = (defpackage.arqx[]) r12
            r12 = r12[r11]
            java.lang.Object r8 = r8.getKey()
            java.lang.Long r8 = (java.lang.Long) r8
            long r13 = r8.longValue()
            r12.b = r13
            arsw r8 = r2.a
            java.lang.Object[] r8 = r8.a
            arqx[] r8 = (defpackage.arqx[]) r8
            r8 = r8[r11]
            r8.c = r10
            goto L_0x00b7
        L_0x00ff:
            arsg r2 = r0.a
            arsf r2 = (defpackage.arsf) r2
            arpj r7 = r2.s
            aizy r2 = r2.c
            java.lang.String r8 = "ld_"
            arpi r7 = r7.a((java.lang.String) r8)
            r7.b(r2)
            arrd r2 = r0.b
            int r2 = r2.a()
            if (r2 == 0) goto L_0x03ef
            arsg r2 = r0.a
            boolean r2 = r2.e()
            if (r2 == 0) goto L_0x0123
            r1 = r0
            goto L_0x03f0
        L_0x0123:
            arsg r2 = r0.a
            arsf r2 = (defpackage.arsf) r2
            arpj r14 = r2.s
            aizy r2 = r2.c
            java.lang.String r15 = "cbc_"
            arpi r14 = r14.a((java.lang.String) r15)
            r14.a(r2)
            arrd r2 = r0.b
            arqx r14 = new arqx
            r14.<init>()
            r16 = 50000(0xc350, float:7.0065E-41)
            r17 = 50000(0xc350, float:7.0065E-41)
        L_0x0141:
            r3 = 22
            if (r9 <= r3) goto L_0x014a
            r23 = r14
            r8 = r15
            goto L_0x02cd
        L_0x014a:
            arsw r13 = r2.a
            int r13 = r13.b
            if (r13 == 0) goto L_0x02ca
            r3 = 0
        L_0x0151:
            if (r3 >= r13) goto L_0x01a0
            arsw r7 = r2.a
            java.lang.Object[] r7 = r7.a
            arqx[] r7 = (defpackage.arqx[]) r7
            r7 = r7[r3]
            arsx r8 = r7.d
            long r10 = r7.b
            double[] r12 = new double[r4]
            defpackage.aema.b((long) r10, (double[]) r12)
            r10 = r12[r5]
            r29 = r12[r6]
            java.util.Set r12 = r7.c
            java.util.Iterator r12 = r12.iterator()
            r4 = 0
        L_0x0170:
            boolean r23 = r12.hasNext()
            if (r23 == 0) goto L_0x018e
            java.lang.Object r23 = r12.next()
            r28 = r23
            arpu r28 = (defpackage.arpu) r28
            arre r6 = r2.b
            r23 = r6
            r24 = r10
            r26 = r29
            double r23 = r23.a(r24, r26, r28)
            double r4 = r4 + r23
            r6 = 1
            goto L_0x0170
        L_0x018e:
            r8.a = r4
            arsx r4 = r7.d
            java.util.Set r5 = r7.c
            int r5 = r5.size()
            r4.b = r5
            int r3 = r3 + 1
            r4 = 2
            r5 = 0
            r6 = 1
            goto L_0x0151
        L_0x01a0:
            arsw r3 = r2.a
            java.lang.Object[] r3 = r3.a
            arqx[] r3 = (defpackage.arqx[]) r3
            java.util.Comparator r4 = defpackage.arqx.e
            r5 = 0
            java.util.Arrays.sort(r3, r5, r13, r4)
            arsw r3 = r2.a
            java.lang.Object[] r3 = r3.a
            arqx[] r3 = (defpackage.arqx[]) r3
            r3 = r3[r5]
            boolean r4 = r14.b()
            if (r4 == 0) goto L_0x01c7
            arsx r4 = r3.d
            double r4 = r4.a
            arsx r6 = r14.d
            double r6 = r6.a
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x01c7
            goto L_0x01ca
        L_0x01c7:
            r14.a(r3)
        L_0x01ca:
            r3 = 20
            if (r9 != r3) goto L_0x0269
            boolean r3 = r14.b()
            if (r3 == 0) goto L_0x0265
            long r3 = r14.b
            r5 = 2
            int[] r6 = new int[r5]
            defpackage.aema.a((long) r3, (int[]) r6)
            arsx r3 = r14.d
            int r3 = r3.b
            r4 = 3
            if (r3 < r4) goto L_0x025e
            int r4 = r2.a()
            int[] r7 = new int[r5]
            r5 = 0
            r10 = 0
            r12 = 0
        L_0x01ee:
            if (r5 >= r4) goto L_0x0238
            arqx r8 = r2.a(r5)
            arsx r8 = r8.d
            double r0 = r8.a
            r23 = r14
            r8 = r15
            double r14 = (double) r3
            java.lang.Double.isNaN(r14)
            double r0 = r0 / r14
            double r0 = java.lang.Math.exp(r0)
            arqx r14 = r2.a(r5)
            long r14 = r14.b
            defpackage.aema.a((long) r14, (int[]) r7)
            r14 = 0
            r15 = r6[r14]
            r24 = r3
            r17 = 1
            r3 = r6[r17]
            r25 = r4
            r4 = r7[r14]
            r14 = r7[r17]
            double r3 = defpackage.aell.a((int) r15, (int) r3, (int) r4, (int) r14)
            r14 = 4641240890982006784(0x4069000000000000, double:200.0)
            double r3 = java.lang.Math.min(r3, r14)
            double r3 = r3 * r0
            double r10 = r10 + r3
            double r12 = r12 + r0
            int r5 = r5 + 1
            r0 = r34
            r1 = r36
            r15 = r8
            r14 = r23
            r3 = r24
            r4 = r25
            goto L_0x01ee
        L_0x0238:
            r23 = r14
            r8 = r15
            double r10 = r10 / r12
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = java.lang.Math.pow(r10, r0)
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r3 * r0
            long r0 = java.lang.Math.round(r3)
            r3 = 50000(0xc350, double:2.47033E-319)
            long r0 = java.lang.Math.min(r0, r3)
            r3 = 5000(0x1388, double:2.4703E-320)
            long r0 = java.lang.Math.max(r0, r3)
            int r1 = (int) r0
            r17 = r1
            goto L_0x026c
        L_0x025e:
            r23 = r14
            r8 = r15
            r17 = 50000(0xc350, float:7.0065E-41)
            goto L_0x026c
        L_0x0265:
            r23 = r14
            r8 = r15
            goto L_0x026c
        L_0x0269:
            r23 = r14
            r8 = r15
        L_0x026c:
            r0 = 22
            if (r9 == r0) goto L_0x02bc
            arsw r0 = r2.a
            r1 = 40
            r0.b(r1)
            arsw r0 = r2.a
            int r0 = r0.b
            r1 = 10
            int r0 = java.lang.Math.min(r0, r1)
            int r0 = r0 + -1
            r1 = 0
        L_0x0284:
            if (r0 < 0) goto L_0x02bc
            arsw r3 = r2.a
            java.lang.Object[] r3 = r3.a
            arqx[] r3 = (defpackage.arqx[]) r3
            r3 = r3[r0]
            r4 = 3
        L_0x028f:
            if (r4 < 0) goto L_0x02b9
            int r5 = r0 * 4
            int r5 = r5 + r4
            arsw r6 = r2.a
            java.lang.Object[] r6 = r6.a
            arqx[] r6 = (defpackage.arqx[]) r6
            r6 = r6[r5]
            r6.a(r3)
            long r10 = r3.b
            long r10 = defpackage.aema.b((long) r10, (int) r4)
            r6.b = r10
            arsx r6 = r6.d
            r6.a()
            if (r1 == 0) goto L_0x02af
            goto L_0x02b5
        L_0x02af:
            arsw r1 = r2.a
            int r5 = r5 + 1
            r1.b = r5
        L_0x02b5:
            int r4 = r4 + -1
            r1 = 1
            goto L_0x028f
        L_0x02b9:
            int r0 = r0 + -1
            goto L_0x0284
        L_0x02bc:
            int r9 = r9 + 1
            r0 = r34
            r1 = r36
            r15 = r8
            r14 = r23
            r4 = 2
            r5 = 0
            r6 = 1
            goto L_0x0141
        L_0x02ca:
            r23 = r14
            r8 = r15
        L_0x02cd:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            r1 = r23
            aiba r0 = defpackage.aiba.a(r1, r0)
            java.lang.Object r1 = r0.a
            arqx r1 = (defpackage.arqx) r1
            boolean r3 = r1.b()
            if (r3 == 0) goto L_0x03c4
            java.lang.Object r0 = r0.b
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r13 = r0.intValue()
            long r3 = r1.b
            r0 = 2
            int[] r5 = new int[r0]
            defpackage.aema.a((long) r3, (int[]) r5)
            arsx r0 = r1.d
            int r0 = r0.b
            r3 = 3
            if (r0 < r3) goto L_0x03ad
            r3 = 0
            r4 = r5[r3]
            boolean r4 = defpackage.arrd.b(r4)
            if (r4 != 0) goto L_0x03a9
            int r4 = r2.a()
            r6 = 2
            int[] r7 = new int[r6]
            r6 = r5[r3]
            double r9 = defpackage.aell.a((int) r6)
            r3 = 1
            r5 = r5[r3]
            double r11 = defpackage.aell.a((int) r5)
            r3 = 0
            r5 = 0
            r14 = 0
            r16 = 0
            r23 = 0
        L_0x031d:
            if (r3 >= r4) goto L_0x038c
            arqx r6 = r2.a(r3)
            arsx r6 = r6.d
            r21 = r4
            r25 = r5
            double r4 = r6.a
            r6 = r13
            r26 = r14
            double r13 = (double) r0
            java.lang.Double.isNaN(r13)
            double r4 = r4 / r13
            double r4 = java.lang.Math.exp(r4)
            arqx r13 = r2.a(r3)
            long r13 = r13.b
            defpackage.aema.a((long) r13, (int[]) r7)
            r13 = 0
            r14 = r7[r13]
            double r13 = defpackage.aell.a((int) r14)
            double r13 = r13 - r9
            double r13 = defpackage.aell.d(r13)
            r15 = 1
            r28 = r7[r15]
            double r28 = defpackage.aell.a((int) r28)
            double r28 = r28 - r11
            r15 = r7
            r30 = r8
            double r7 = defpackage.aell.c((double) r28)
            double r7 = defpackage.aell.a(r7, r9)
            double r28 = r13 * r13
            double r31 = r7 * r7
            double r28 = r28 + r31
            r31 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            int r33 = (r28 > r31 ? 1 : (r28 == r31 ? 0 : -1))
            if (r33 >= 0) goto L_0x037f
            double r13 = r13 * r4
            double r16 = r16 + r13
            double r7 = r7 * r4
            double r23 = r23 + r7
            double r4 = r26 + r4
            int r7 = r25 + 1
            r26 = r4
            r5 = r7
            goto L_0x0381
        L_0x037f:
            r5 = r25
        L_0x0381:
            int r3 = r3 + 1
            r13 = r6
            r7 = r15
            r4 = r21
            r14 = r26
            r8 = r30
            goto L_0x031d
        L_0x038c:
            r25 = r5
            r30 = r8
            r6 = r13
            r26 = r14
            r2 = 0
            int r0 = (r26 > r2 ? 1 : (r26 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x039a
            goto L_0x03b0
        L_0x039a:
            r5 = r25
            r0 = 3
            if (r5 < r0) goto L_0x03b0
            double r14 = r16 / r26
            double r16 = r23 / r26
            r13 = r6
            aibe r0 = defpackage.arrd.a(r9, r11, r13, r14, r16)
            goto L_0x03c7
        L_0x03a9:
            r30 = r8
            r6 = r13
            goto L_0x03b0
        L_0x03ad:
            r30 = r8
            r6 = r13
        L_0x03b0:
            long r0 = r1.b
            r2 = 2
            int[] r3 = new int[r2]
            defpackage.aema.a((long) r0, (int[]) r3)
            aibe r0 = new aibe
            r1 = 0
            r2 = r3[r1]
            r1 = 1
            r3 = r3[r1]
            r0.<init>(r2, r3, r6)
            goto L_0x03c7
        L_0x03c4:
            r30 = r8
            r0 = 0
        L_0x03c7:
            r1 = r34
            arsg r2 = r1.a
            arsf r2 = (defpackage.arsf) r2
            arpj r3 = r2.s
            aizy r2 = r2.c
            r4 = r30
            arpi r3 = r3.a((java.lang.String) r4)
            r3.b(r2)
            if (r0 != 0) goto L_0x03ee
            arsg r0 = r1.a
            arsf r0 = (defpackage.arsf) r0
            aizy r0 = r0.c
            long r2 = r0.b()
            r0 = 4
            r4 = r36
            r4.a(r0, r2)
            r0 = 0
            goto L_0x03f6
        L_0x03ee:
            goto L_0x03f6
        L_0x03ef:
            r1 = r0
        L_0x03f0:
            arrd r0 = r1.b
            r0.b()
            r0 = 0
        L_0x03f6:
            boolean r2 = r35.isEmpty()
            if (r2 == 0) goto L_0x0401
            r36 = r0
            r3 = 0
            goto L_0x04b8
        L_0x0401:
            if (r0 == 0) goto L_0x04b5
            int r2 = r0.b
            boolean r2 = defpackage.arrd.b(r2)
            if (r2 != 0) goto L_0x04b5
            int r2 = r0.b
            int r3 = r0.c
            r4 = 2
            int[] r4 = new int[r4]
            double r5 = defpackage.aell.a((int) r2)
            double r7 = defpackage.aell.a((int) r3)
            java.util.Iterator r3 = r35.iterator()
            r9 = 0
            r11 = 0
            r13 = 0
        L_0x0424:
            boolean r15 = r3.hasNext()
            if (r15 == 0) goto L_0x049f
            java.lang.Object r15 = r3.next()
            arpu r15 = (defpackage.arpu) r15
            r36 = r0
            long r0 = r15.b
            defpackage.aema.a((long) r0, (int[]) r4)
            r0 = 0
            r1 = r4[r0]
            int r1 = r1 - r2
            double r0 = defpackage.aell.c((int) r1)
            r16 = 1
            r17 = r4[r16]
            double r16 = defpackage.aell.a((int) r17)
            double r16 = r16 - r7
            r18 = r2
            r35 = r3
            double r2 = defpackage.aell.c((double) r16)
            double r2 = defpackage.aell.a(r2, r5)
            r16 = r4
            float r4 = r15.f
            r22 = r7
            double r7 = (double) r4
            r24 = 4582862980812216730(0x3f9999999999999a, double:0.025)
            java.lang.Double.isNaN(r7)
            double r7 = r7 * r24
            r24 = 4612600249151744115(0x40033f7ced916873, double:2.406)
            double r7 = r7 + r24
            float r4 = r15.d
            r24 = r5
            double r4 = (double) r4
            r26 = r13
            r13 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r4 = java.lang.Math.pow(r4, r13)
            double r7 = r7 * r4
            r4 = 0
            double r6 = java.lang.Math.max(r7, r4)
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r6 = java.lang.Math.min(r6, r13)
            double r11 = r11 + r6
            double r0 = r0 * r6
            double r9 = r9 + r0
            double r2 = r2 * r6
            double r13 = r26 + r2
            r1 = r34
            r3 = r35
            r0 = r36
            r4 = r16
            r2 = r18
            r7 = r22
            r5 = r24
            goto L_0x0424
        L_0x049f:
            r36 = r0
            r24 = r5
            r22 = r7
            r26 = r13
            r0 = 2147483647(0x7fffffff, float:NaN)
            double r1 = r9 / r11
            double r12 = r26 / r11
            r9 = r0
            r10 = r1
            aibe r3 = defpackage.arrd.a(r5, r7, r9, r10, r12)
            goto L_0x04b8
        L_0x04b5:
            r36 = r0
            r3 = 0
        L_0x04b8:
            if (r3 == 0) goto L_0x0543
            int r0 = r3.b
            int r1 = r3.c
            r2 = r36
            int r4 = r2.b
            int r5 = r2.c
            double r0 = defpackage.aell.a((int) r0, (int) r1, (int) r4, (int) r5)
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0545
            r4 = 4634978072750194688(0x4052c00000000000, double:75.0)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x04ee
            double r4 = r0 / r4
            r6 = -4602678819172646912(0xc020000000000000, double:-8.0)
            double r4 = r4 * r6
            double r4 = java.lang.Math.exp(r4)
            r6 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r4 = r4 * r6
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 + r6
            double r10 = r6 / r4
            goto L_0x04f1
        L_0x04ee:
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r10 = r6
        L_0x04f1:
            int r4 = r2.d
            double r4 = (double) r4
            double r0 = r0 * r10
            java.lang.Double.isNaN(r4)
            java.lang.Double.isNaN(r4)
            double r4 = r4 * r4
            r6 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r6 = r6 * r0
            double r6 = r6 * r0
            double r4 = r4 + r6
            double r0 = java.lang.Math.sqrt(r4)
            long r0 = java.lang.Math.round(r0)
            r4 = 100000(0x186a0, float:1.4013E-40)
            int r1 = (int) r0
            int r16 = java.lang.Math.min(r4, r1)
            int r0 = r2.b
            int r1 = r2.c
            int r2 = r3.b
            int r3 = r3.c
            double r12 = defpackage.aell.a((int) r0)
            double r14 = defpackage.aell.a((int) r1)
            double r3 = defpackage.aell.a((int) r3)
            double r3 = r3 - r14
            double r3 = defpackage.aell.c((double) r3)
            double r3 = defpackage.aell.a(r3, r12)
            int r2 = r2 - r0
            double r0 = defpackage.aell.c((int) r2)
            double r17 = r10 * r0
            double r19 = r10 * r3
            aibe r0 = defpackage.arrd.a(r12, r14, r16, r17, r19)
            goto L_0x0546
        L_0x0543:
            r2 = r36
        L_0x0545:
            r0 = r2
        L_0x0546:
            return r0
        L_0x0547:
            java.util.Iterator r0 = r35.iterator()
            java.lang.Object r1 = r0.next()
            arpu r1 = (defpackage.arpu) r1
            java.lang.Object r0 = r0.next()
            arpu r0 = (defpackage.arpu) r0
            float r2 = r1.f
            float r3 = r0.f
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0561
            r1 = r0
            goto L_0x0562
        L_0x0561:
        L_0x0562:
            long r2 = r1.b
            r0 = 2
            int[] r0 = new int[r0]
            defpackage.aema.a((long) r2, (int[]) r0)
            r2 = r34
            boolean r3 = r2.e
            if (r3 == 0) goto L_0x0577
            float r1 = r1.f
            int r1 = a(r1)
            goto L_0x0579
        L_0x0577:
            int r1 = r2.d
        L_0x0579:
            aibe r3 = new aibe
            r4 = 0
            r4 = r0[r4]
            r5 = 1
            r0 = r0[r5]
            r3.<init>(r4, r0, r1)
            return r3
        L_0x0585:
            r2 = r0
            java.util.Iterator r0 = r35.iterator()
            java.lang.Object r0 = r0.next()
            arpu r0 = (defpackage.arpu) r0
            long r3 = r0.b
            r1 = 2
            int[] r1 = new int[r1]
            defpackage.aema.a((long) r3, (int[]) r1)
            boolean r3 = r2.e
            if (r3 == 0) goto L_0x05a3
            float r0 = r0.f
            int r0 = a(r0)
            goto L_0x05a5
        L_0x05a3:
            int r0 = r2.c
        L_0x05a5:
            aibe r3 = new aibe
            r4 = 0
            r4 = r1[r4]
            r5 = 1
            r1 = r1[r5]
            r3.<init>(r4, r1, r0)
            return r3
        L_0x05b1:
            r2 = r0
            r4 = r1
            arsg r0 = r2.a
            arsf r0 = (defpackage.arsf) r0
            aizy r0 = r0.c
            long r0 = r0.b()
            r3 = 2
            r4.a(r3, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arpn.a(java.util.Set, arrc):aibe");
    }
}
