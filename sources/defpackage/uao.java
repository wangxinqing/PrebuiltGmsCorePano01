package defpackage;

/* renamed from: uao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uao {
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0101 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(java.util.List r23) {
        /*
            r0 = r23
            ampu r1 = defpackage.ampu.a
            int r2 = r23.size()
            r4 = 0
        L_0x0009:
            r5 = 1
            if (r4 >= r2) goto L_0x010a
            java.lang.Object r6 = r0.get(r4)
            ttg r6 = (defpackage.ttg) r6
            java.util.List r7 = r6.D()
            int r8 = r7.size()
            r9 = 0
        L_0x001b:
            int r10 = r4 + 1
            if (r9 >= r8) goto L_0x0107
            java.lang.Object r10 = r7.get(r9)
            uak r10 = (defpackage.uak) r10
            auzz r11 = r10.b
            if (r11 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            auzz r11 = defpackage.auzz.d
        L_0x002c:
            double r11 = r11.c
            r13 = 0
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x00cf
            auzz r11 = r10.b
            if (r11 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            auzz r11 = defpackage.auzz.d
        L_0x003b:
            int r11 = r11.a
            r11 = r11 & 2
            if (r11 == 0) goto L_0x00cf
            double r11 = defpackage.aymq.j()
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 > 0) goto L_0x0053
            auzz r11 = r10.b
            if (r11 == 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            auzz r11 = defpackage.auzz.d
        L_0x0050:
            double r11 = r11.c
            goto L_0x0057
        L_0x0053:
            double r11 = defpackage.aymq.j()
        L_0x0057:
            java.lang.Double r20 = r6.z()
            jiq r13 = r6.a
            boolean r13 = defpackage.ttg.a((defpackage.jiq) r13, (defpackage.uak) r10)
            if (r13 == 0) goto L_0x0081
            aymq r13 = defpackage.aymq.a
            aymr r13 = r13.a()
            double r13 = r13.J()
            aymq r15 = defpackage.aymq.a
            aymr r15 = r15.a()
            double r15 = r15.K()
            r22 = r4
            double r3 = r11 * r15
            double r3 = java.lang.Math.max(r13, r3)
            double r3 = r3 + r11
            goto L_0x0084
        L_0x0081:
            r22 = r4
            r3 = r11
        L_0x0084:
            java.lang.Double r21 = java.lang.Double.valueOf(r3)
            if (r20 == 0) goto L_0x0098
            double r3 = r20.doubleValue()
            double r13 = r21.doubleValue()
            int r15 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x0098
            r3 = 1
            goto L_0x0099
        L_0x0098:
            r3 = 0
        L_0x0099:
            if (r3 != 0) goto L_0x00d2
            jjg r4 = defpackage.tsp.a
            anie r4 = r4.d()
            r13 = r4
            anih r13 = (defpackage.anih) r13
            java.lang.String r15 = r6.i()
            java.lang.String r16 = r6.G()
            java.lang.String r17 = r6.m()
            auzz r4 = r10.b
            if (r4 != 0) goto L_0x00b6
            auzz r4 = defpackage.auzz.d
        L_0x00b6:
            int r4 = r4.b
            int r4 = defpackage.avbj.b(r4)
            if (r4 == 0) goto L_0x00bf
            goto L_0x00c0
        L_0x00bf:
            r4 = 1
        L_0x00c0:
            java.lang.String r18 = defpackage.avbj.a(r4)
            java.lang.Double r19 = java.lang.Double.valueOf(r11)
            java.lang.String r14 = "Eval targeting for id=%s, triggerId=%s, address=%s, relevance=%s, maxDist=%.3f, checking %.3f < %.3f"
            r13.a(r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x00d2
        L_0x00cf:
            r22 = r4
            r3 = 1
        L_0x00d2:
            r6.a((defpackage.uak) r10, (boolean) r3)
            avbx r4 = r6.j()
            avbx r11 = defpackage.avbx.NEARBY_DEVICE
            if (r4 == r11) goto L_0x00de
        L_0x00dd:
            goto L_0x0101
        L_0x00de:
            if (r3 == 0) goto L_0x00dd
            boolean r3 = r1.a()
            if (r3 != 0) goto L_0x0101
            auzz r3 = r10.b
            if (r3 == 0) goto L_0x00eb
            goto L_0x00ed
        L_0x00eb:
            auzz r3 = defpackage.auzz.d
        L_0x00ed:
            int r3 = r3.b
            int r3 = defpackage.avbj.b(r3)
            if (r3 == 0) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            r3 = 1
        L_0x00f7:
            int r3 = r3 + -1
            r4 = 100
            if (r3 <= r4) goto L_0x0101
            amri r1 = defpackage.amri.b(r6)
        L_0x0101:
            int r9 = r9 + 1
            r4 = r22
            goto L_0x001b
        L_0x0107:
            r4 = r10
            goto L_0x0009
        L_0x010a:
            boolean r2 = r1.a()
            if (r2 == 0) goto L_0x014a
            int r2 = r23.size()
            r3 = 0
        L_0x0115:
            if (r3 >= r2) goto L_0x014a
            java.lang.Object r4 = r0.get(r3)
            ttg r4 = (defpackage.ttg) r4
            avbx r6 = r4.j()
            avbx r7 = defpackage.avbx.NEARBY_DEVICE
            if (r6 == r7) goto L_0x0126
        L_0x0125:
            goto L_0x0147
        L_0x0126:
            java.lang.Object r6 = r1.b()
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L_0x0125
            java.util.List r6 = r4.D()
            int r7 = r6.size()
            r8 = 0
        L_0x0139:
            if (r8 >= r7) goto L_0x0147
            java.lang.Object r9 = r6.get(r8)
            uak r9 = (defpackage.uak) r9
            r4.a((defpackage.uak) r9, (boolean) r5)
            int r8 = r8 + 1
            goto L_0x0139
        L_0x0147:
            int r3 = r3 + 1
            goto L_0x0115
        L_0x014a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uao.a(java.util.List):void");
    }
}
