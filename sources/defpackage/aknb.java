package defpackage;

/* renamed from: aknb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aknb implements akmu {
    private static final Integer[] a = {30, 29, 31};
    private static final Integer[] b = {33, 32, 34};

    private static long a(asuc asuc) {
        if ((asuc.a & 8) != 0) {
            return asuc.e;
        }
        return -1;
    }

    public final String a() {
        return "Wifi";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011e, code lost:
        if (r18 != false) goto L_0x0123;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0145 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0145 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.akmy a(defpackage.akln r21, java.util.List r22) {
        /*
            r20 = this;
            r0 = r21
            r1 = r22
            akoh r2 = r0.b
            r3 = 0
            if (r2 != 0) goto L_0x000d
            defpackage.aklz.a()
            return r3
        L_0x000d:
            defpackage.aklz.a()
            int r2 = r22.size()
            java.util.List r2 = defpackage.akms.a((int) r2)
            akoh r0 = r0.b
            r5 = 0
        L_0x001b:
            int r6 = r22.size()
            if (r5 >= r6) goto L_0x0175
            java.lang.Object r6 = r1.get(r5)
            akkk r6 = (defpackage.akkk) r6
            aklu r7 = new aklu
            r7.<init>()
            astz r6 = r6.a
            aucx r6 = r6.i
            int r8 = r6.size()
            r9 = 0
        L_0x0035:
            if (r9 >= r8) goto L_0x014a
            java.lang.Object r11 = r6.get(r9)
            asuc r11 = (defpackage.asuc) r11
            int r12 = r11.a
            r13 = r12 & 4
            r14 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
            r16 = 1
            if (r13 != 0) goto L_0x004c
            goto L_0x00c9
        L_0x004c:
            r13 = r12 & 1
            if (r13 == 0) goto L_0x00c9
            astp r12 = r11.b
            if (r12 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            astp r12 = defpackage.astp.b
        L_0x0057:
            aucx r12 = r12.a
            long r3 = a(r11)
            float r3 = defpackage.akms.a(r0, r12, r3)
            r17 = r11
            double r10 = (double) r3
            int r12 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r12 >= 0) goto L_0x0081
            int r10 = r0.a()
            if (r10 <= 0) goto L_0x0081
            r11 = r17
            astp r10 = r11.b
            if (r10 == 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            astp r10 = defpackage.astp.b
        L_0x0077:
            aucx r10 = r10.a
            int r10 = r10.size()
            if (r10 <= 0) goto L_0x0083
            r10 = 1
            goto L_0x0084
        L_0x0081:
            r11 = r17
        L_0x0083:
            r10 = 0
        L_0x0084:
            int r11 = r11.d
            int r11 = defpackage.asub.a(r11)
            if (r11 == 0) goto L_0x008f
            r16 = r11
            goto L_0x0090
        L_0x008f:
        L_0x0090:
            int r11 = r16 + -1
            if (r11 == 0) goto L_0x00a7
            r12 = 4
            if (r11 == r12) goto L_0x009a
            r11 = 0
            r12 = 0
            goto L_0x00b3
        L_0x009a:
            r11 = 30
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 22
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x00b3
        L_0x00a7:
            r11 = 29
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 23
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
        L_0x00b3:
            if (r11 == 0) goto L_0x0145
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r7.a(r11, r3)
            if (r10 == 0) goto L_0x0145
            r3 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r7.a(r12, r3)
            goto L_0x0145
        L_0x00c9:
            r3 = r12 & 2
            if (r3 == 0) goto L_0x0142
            astn r3 = r11.c
            if (r3 == 0) goto L_0x00d2
            goto L_0x00d4
        L_0x00d2:
            astn r3 = defpackage.astn.b
        L_0x00d4:
            aucx r3 = r3.a
            int r10 = r3.size()
            r12 = 0
            r4 = 0
            r18 = 0
        L_0x00de:
            if (r4 >= r10) goto L_0x010b
            java.lang.Object r19 = r3.get(r4)
            r13 = r19
            astp r13 = (defpackage.astp) r13
            aucx r14 = r13.a
            int r14 = r14.size()
            if (r14 <= 0) goto L_0x0102
            aucx r13 = r13.a
            long r14 = a(r11)
            float r13 = defpackage.akms.a(r0, r13, r14)
            int r14 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x00ff
            r12 = r13
        L_0x00ff:
            r18 = 1
            goto L_0x0103
        L_0x0102:
        L_0x0103:
            int r4 = r4 + 1
            r14 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
            goto L_0x00de
        L_0x010b:
            double r3 = (double) r12
            r10 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
            int r13 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x0121
            int r3 = r0.a()
            if (r3 > 0) goto L_0x011e
            r16 = 0
            goto L_0x0123
        L_0x011e:
            if (r18 == 0) goto L_0x0121
            goto L_0x0123
        L_0x0121:
            r16 = 0
        L_0x0123:
            r3 = 31
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Float r4 = java.lang.Float.valueOf(r12)
            r7.a(r3, r4)
            if (r16 == 0) goto L_0x0145
            r3 = 24
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r7.a(r3, r4)
            goto L_0x0145
        L_0x0142:
            defpackage.aklz.a()
        L_0x0145:
            int r9 = r9 + 1
            r3 = 0
            goto L_0x0035
        L_0x014a:
            r3 = 0
        L_0x014b:
            java.lang.Integer[] r6 = a
            int r8 = r6.length
            if (r3 >= r8) goto L_0x016d
            r6 = r6[r3]
            ou r8 = r7.a
            boolean r6 = r8.containsKey(r6)
            if (r6 != 0) goto L_0x0168
            java.lang.Integer[] r6 = b
            r6 = r6[r3]
            r4 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r8 = java.lang.Float.valueOf(r4)
            r7.a(r6, r8)
            goto L_0x016a
        L_0x0168:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x016a:
            int r3 = r3 + 1
            goto L_0x014b
        L_0x016d:
            r2.set(r5, r7)
            int r5 = r5 + 1
            r3 = 0
            goto L_0x001b
        L_0x0175:
            akmy r0 = new akmy
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aknb.a(akln, java.util.List):akmy");
    }
}
