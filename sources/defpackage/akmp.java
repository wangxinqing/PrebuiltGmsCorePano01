package defpackage;

/* renamed from: akmp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akmp implements akmu {
    private static final double a = (Math.sqrt(2.0d) * 8.0d);

    static double a(double d) {
        if (d < 0.0d) {
            return -a(-d);
        }
        if (d > 40.0d) {
            return 1.0d;
        }
        double d2 = (d * ((((((0.078108d * d) + 9.72E-4d) * d) + 0.230389d) * d) + 0.278393d)) + 1.0d;
        return 1.0d - (1.0d / (((d2 * d2) * d2) * d2));
    }

    public final String a() {
        return "Beacon";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0172, code lost:
        r11 = r25;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.akmy a(defpackage.akln r29, java.util.List r30) {
        /*
            r28 = this;
            r0 = r29
            r1 = r30
            aklk r2 = r0.c
            if (r2 != 0) goto L_0x0013
            akof r0 = defpackage.aklz.a()
            java.lang.String r1 = "No beacon scan available - ignoring candidates."
            r0.a(r1)
            r0 = 0
            return r0
        L_0x0013:
            defpackage.aklz.a()
            int r2 = r30.size()
            java.util.List r2 = defpackage.akms.a((int) r2)
            aklk r0 = r0.c
            java.util.List r0 = r0.a
            ou r3 = new ou
            r3.<init>()
            int r4 = r0.size()
            r6 = 0
        L_0x002c:
            if (r6 >= r4) goto L_0x0054
            java.lang.Object r7 = r0.get(r6)
            akll r7 = (defpackage.akll) r7
            aklj r8 = r7.a
            java.lang.Object r8 = r3.get(r8)
            akll r8 = (defpackage.akll) r8
            if (r8 != 0) goto L_0x0044
            aklj r8 = r7.a
            r3.put(r8, r7)
            goto L_0x0051
        L_0x0044:
            long r8 = r8.d
            long r10 = r7.d
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x0051
            aklj r8 = r7.a
            r3.put(r8, r7)
        L_0x0051:
            int r6 = r6 + 1
            goto L_0x002c
        L_0x0054:
            int r0 = r3.h
            akll[] r4 = new defpackage.akll[r0]
            r6 = 0
        L_0x0059:
            int r7 = r3.h
            if (r6 >= r7) goto L_0x0068
            java.lang.Object r7 = r3.c(r6)
            akll r7 = (defpackage.akll) r7
            r4[r6] = r7
            int r6 = r6 + 1
            goto L_0x0059
        L_0x0068:
            r3 = 0
        L_0x0069:
            int r6 = r30.size()
            if (r3 >= r6) goto L_0x0269
            java.lang.Object r6 = r1.get(r3)
            akkk r6 = (defpackage.akkk) r6
            java.lang.Object r7 = r2.get(r3)
            aklu r7 = (defpackage.aklu) r7
            astz r6 = r6.a
            aucx r6 = r6.j
            boolean r8 = r6.isEmpty()
            if (r8 != 0) goto L_0x0254
            int r8 = r6.size()
            r9 = 0
            r10 = 0
        L_0x008b:
            if (r9 < r8) goto L_0x022e
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 0
            r14 = r12
            r5 = 0
            r9 = 0
            r11 = 0
            r16 = 0
        L_0x0097:
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r19 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r21 = 4
            if (r9 >= r0) goto L_0x019f
            r1 = r4[r9]
            r22 = r0
            aklj r0 = r1.a
            int r0 = r0.a
            r23 = r4
            r4 = 1
            if (r0 == r4) goto L_0x00b8
            r4 = 3
            if (r0 == r4) goto L_0x00b6
            r4 = 5
            if (r0 == r4) goto L_0x00b4
            r0 = 1
            goto L_0x00b9
        L_0x00b4:
            r0 = 4
            goto L_0x00b9
        L_0x00b6:
            r0 = 2
            goto L_0x00b9
        L_0x00b8:
            r0 = 3
        L_0x00b9:
            r4 = 1
            if (r0 != r4) goto L_0x00c2
            r24 = r2
            r27 = r3
            goto L_0x0184
        L_0x00c2:
            java.lang.Integer r4 = r1.c
            r24 = r2
            r2 = -41
            if (r4 != 0) goto L_0x00cb
        L_0x00ca:
            goto L_0x00d2
        L_0x00cb:
            int r4 = r4.intValue()
            if (r4 <= r2) goto L_0x00ca
            goto L_0x00d4
        L_0x00d2:
            int r11 = r11 + 1
        L_0x00d4:
            r4 = r11
            aklj r11 = r1.a
            byte[] r11 = r11.b
            int r2 = r6.size()
            r25 = r4
            r4 = 0
        L_0x00e0:
            if (r4 < r2) goto L_0x00e6
            r27 = r3
            goto L_0x0172
        L_0x00e6:
            java.lang.Object r21 = r6.get(r4)
            r26 = r2
            r2 = r21
            astb r2 = (defpackage.astb) r2
            r27 = r3
            aste r3 = r2.b
            if (r3 == 0) goto L_0x00f7
            goto L_0x00f9
        L_0x00f7:
            aste r3 = defpackage.aste.d
        L_0x00f9:
            int r3 = r3.a
            r21 = 1
            r3 = r3 & 1
            if (r3 != 0) goto L_0x0105
            r2 = -41
            goto L_0x0197
        L_0x0105:
            aste r3 = r2.b
            if (r3 == 0) goto L_0x010a
            goto L_0x010c
        L_0x010a:
            aste r3 = defpackage.aste.d
        L_0x010c:
            int r3 = r3.b
            int r3 = defpackage.astd.a(r3)
            if (r3 == 0) goto L_0x0115
            goto L_0x0116
        L_0x0115:
            r3 = 1
        L_0x0116:
            if (r3 != r0) goto L_0x0195
            aste r3 = r2.b
            if (r3 == 0) goto L_0x011d
            goto L_0x011f
        L_0x011d:
            aste r3 = defpackage.aste.d
        L_0x011f:
            auay r3 = r3.c
            byte[] r3 = r3.k()
            boolean r3 = java.util.Arrays.equals(r3, r11)
            if (r3 == 0) goto L_0x0192
            int r0 = r2.a
            r3 = 2
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0164
            int r0 = r2.c
            java.lang.Integer r1 = r1.b
            int r1 = r1.intValue()
            int r1 = r1 - r0
            double r0 = (double) r1
            double r2 = a
            java.lang.Double.isNaN(r0)
            double r0 = r0 / r2
            double r0 = a(r0)
            double r0 = r0 + r17
            double r0 = r0 * r19
            double r2 = java.lang.Math.max(r12, r0)
            int r4 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r4 <= 0) goto L_0x015d
            double r11 = java.lang.Math.log(r0)
            double r0 = -r0
            double r0 = java.lang.Math.log1p(r0)
            double r11 = r11 - r0
            double r14 = r14 + r11
            goto L_0x015e
        L_0x015d:
        L_0x015e:
            r12 = r2
            r11 = r25
            r16 = 1
            goto L_0x0184
        L_0x0164:
            java.lang.Integer r0 = r1.c
            if (r0 == 0) goto L_0x0175
            int r0 = r0.intValue()
            r2 = -41
            if (r0 > r2) goto L_0x0171
            goto L_0x0175
        L_0x0171:
        L_0x0172:
            r11 = r25
            goto L_0x0184
        L_0x0175:
            int r5 = r5 + 1
            java.lang.Integer r0 = r1.b
            int r0 = r0.intValue()
            int r0 = java.lang.Math.max(r8, r0)
            r8 = r0
            r11 = r25
        L_0x0184:
            int r9 = r9 + 1
            r1 = r30
            r0 = r22
            r4 = r23
            r2 = r24
            r3 = r27
            goto L_0x0097
        L_0x0192:
            r2 = -41
            goto L_0x0197
        L_0x0195:
            r2 = -41
        L_0x0197:
            int r4 = r4 + 1
            r2 = r26
            r3 = r27
            goto L_0x00e0
        L_0x019f:
            r22 = r0
            r24 = r2
            r27 = r3
            r23 = r4
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r5 <= 0) goto L_0x01e6
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r7.a(r2, r0)
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r2 = (float) r8
            r3 = 1123024896(0x42f00000, float:120.0)
            float r2 = r2 + r3
            float r2 = r2 / r3
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r7.a(r0, r2)
            float r0 = (float) r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)
            float r3 = (float) r10
            float r3 = r0 / r3
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r7.a(r2, r3)
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            float r3 = (float) r11
            float r0 = r0 / r3
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r7.a(r2, r0)
            goto L_0x0209
        L_0x01e6:
            r1 = 0
            if (r10 <= 0) goto L_0x0209
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r7.a(r2, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            r2 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r7.a(r0, r2)
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.a(r0, r2)
        L_0x0209:
            if (r16 != 0) goto L_0x020c
            goto L_0x025d
        L_0x020c:
            int r0 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x021b
            double r2 = -r14
            double r2 = java.lang.Math.exp(r2)
            double r2 = r2 + r17
            double r2 = r17 / r2
            float r0 = (float) r2
            goto L_0x021c
        L_0x021b:
            float r0 = (float) r12
        L_0x021c:
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            float r0 = r0 + r0
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r0 + r3
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r7.a(r2, r0)
            goto L_0x025d
        L_0x022e:
            r22 = r0
            r24 = r2
            r27 = r3
            r23 = r4
            r1 = 0
            java.lang.Object r0 = r6.get(r9)
            astb r0 = (defpackage.astb) r0
            int r0 = r0.a
            r2 = 2
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0244
            goto L_0x0246
        L_0x0244:
            int r10 = r10 + 1
        L_0x0246:
            int r9 = r9 + 1
            r1 = r30
            r0 = r22
            r4 = r23
            r2 = r24
            r3 = r27
            goto L_0x008b
        L_0x0254:
            r22 = r0
            r24 = r2
            r27 = r3
            r23 = r4
            r1 = 0
        L_0x025d:
            int r3 = r27 + 1
            r1 = r30
            r0 = r22
            r4 = r23
            r2 = r24
            goto L_0x0069
        L_0x0269:
            r24 = r2
            akmy r0 = new akmy
            r1 = r30
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akmp.a(akln, java.util.List):akmy");
    }
}
