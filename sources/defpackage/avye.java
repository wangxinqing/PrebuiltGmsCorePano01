package defpackage;

/* renamed from: avye  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avye {
    private static final int[][] a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    private static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    static int a(int i) {
        int i2 = 0;
        while (i != 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    private static void b(int i, int i2, avyb avyb) {
        int i3 = 0;
        while (i3 < 7) {
            int i4 = i2 + i3;
            if (b(avyb.a(i, i4))) {
                avyb.a(i, i4, 0);
                i3++;
            } else {
                throw new avxp();
            }
        }
    }

    private static boolean b(int i) {
        return i == -1;
    }

    private static void c(int i, int i2, avyb avyb) {
        for (int i3 = 0; i3 < 7; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                avyb.a(i + i4, i2 + i3, a[i3][i4]);
            }
        }
    }

    static int a(int i, int i2) {
        int a2 = a(i2);
        int i3 = i << (a2 - 1);
        while (a(i3) >= a2) {
            i3 ^= i2 << (a(i3) - a2);
        }
        return i3;
    }

    private static void a(int i, int i2, avyb avyb) {
        int i3 = 0;
        while (i3 < 8) {
            int i4 = i + i3;
            if (b(avyb.a(i4, i2))) {
                avyb.a(i4, i2, 0);
                i3++;
            } else {
                throw new avxp();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0265, code lost:
        if (r13 == 0) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0268, code lost:
        if (r15 != false) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x026a, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x026c, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x026d, code lost:
        r3.a(r12, r5, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x025a, code lost:
        r13 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0261, code lost:
        r13 = r13 & 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(defpackage.avxq r19, defpackage.avxv r20, defpackage.avxz r21, int r22, defpackage.avyb r23) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = 0
            r5 = 0
        L_0x000a:
            int r6 = r3.c
            r7 = -1
            if (r5 < r6) goto L_0x02a9
            int[][] r5 = a
            r5 = r5[r4]
            int r5 = r5.length
            c(r4, r4, r3)
            int r6 = r3.b
            int r6 = r6 - r5
            c(r6, r4, r3)
            int r6 = r3.b
            int r6 = r6 - r5
            c(r4, r6, r3)
            r5 = 7
            a(r4, r5, r3)
            int r6 = r3.b
            int r6 = r6 + -8
            a(r6, r5, r3)
            int r6 = r3.b
            int r6 = r6 + -8
            a(r4, r6, r3)
            b(r5, r4, r3)
            int r6 = r3.c
            int r6 = r6 + -8
            b(r6, r4, r3)
            int r6 = r3.c
            int r6 = r6 + -7
            b(r5, r6, r3)
            int r6 = r3.c
            int r6 = r6 + -8
            r8 = 8
            byte r6 = r3.a(r8, r6)
            if (r6 == 0) goto L_0x02a3
            int r6 = r3.c
            int r6 = r6 + -8
            r9 = 1
            r3.a((int) r8, (int) r6, (int) r9)
            int r6 = r1.a
            r10 = 2
            r11 = 5
            if (r6 < r10) goto L_0x00ba
            int r6 = r6 + r7
            int[][] r12 = c
            r13 = r12[r6]
            r6 = r12[r6]
            int r6 = r6.length
            r12 = 0
        L_0x0069:
            if (r12 < r6) goto L_0x006e
            r4 = 8
            goto L_0x00bc
        L_0x006e:
            r14 = 0
        L_0x006f:
            if (r14 >= r6) goto L_0x00b1
            r15 = r13[r12]
            r10 = r13[r14]
            if (r10 != r7) goto L_0x0078
        L_0x0077:
            goto L_0x00a8
        L_0x0078:
            if (r15 == r7) goto L_0x0077
            byte r17 = r3.a(r10, r15)
            boolean r17 = b(r17)
            if (r17 == 0) goto L_0x00a8
            int r10 = r10 + -2
            int r15 = r15 + -2
            r5 = 0
        L_0x0089:
            if (r5 >= r11) goto L_0x00a8
            r7 = 0
        L_0x008c:
            if (r7 >= r11) goto L_0x00a1
            int r9 = r10 + r7
            int r4 = r15 + r5
            int[][] r18 = b
            r18 = r18[r5]
            r11 = r18[r7]
            r3.a((int) r9, (int) r4, (int) r11)
            int r7 = r7 + 1
            r4 = 0
            r9 = 1
            r11 = 5
            goto L_0x008c
        L_0x00a1:
            int r5 = r5 + 1
            r4 = 0
            r7 = -1
            r9 = 1
            r11 = 5
            goto L_0x0089
        L_0x00a8:
            int r14 = r14 + 1
            r4 = 0
            r5 = 7
            r7 = -1
            r9 = 1
            r10 = 2
            r11 = 5
            goto L_0x006f
        L_0x00b1:
            int r12 = r12 + 1
            r4 = 0
            r5 = 7
            r7 = -1
            r9 = 1
            r10 = 2
            r11 = 5
            goto L_0x0069
        L_0x00ba:
            r4 = 8
        L_0x00bc:
            int r5 = r3.b
            int r5 = r5 + -8
            r6 = 6
            if (r4 >= r5) goto L_0x00e6
            int r5 = r4 + 1
            int r7 = r5 % 2
            byte r9 = r3.a(r4, r6)
            boolean r9 = b(r9)
            if (r9 == 0) goto L_0x00d4
            r3.a((int) r4, (int) r6, (int) r7)
        L_0x00d4:
            byte r9 = r3.a(r6, r4)
            boolean r9 = b(r9)
            if (r9 == 0) goto L_0x00e3
            r3.a((int) r6, (int) r4, (int) r7)
            goto L_0x00e4
        L_0x00e3:
        L_0x00e4:
            r4 = r5
            goto L_0x00bc
        L_0x00e6:
            avxq r4 = new avxq
            r4.<init>()
            if (r2 < 0) goto L_0x029b
            if (r2 >= r8) goto L_0x029b
            r7 = r20
            int r5 = r7.e
            r7 = 3
            int r5 = r5 << r7
            r5 = r5 | r2
            r9 = 5
            r4.a(r5, r9)
            r10 = 1335(0x537, float:1.871E-42)
            int r5 = a(r5, r10)
            r10 = 10
            r4.a(r5, r10)
            avxq r5 = new avxq
            r5.<init>()
            r10 = 21522(0x5412, float:3.0159E-41)
            r11 = 15
            r5.a(r10, r11)
            int[] r10 = r4.a
            int r10 = r10.length
            int[] r12 = r5.a
            int r12 = r12.length
            if (r10 != r12) goto L_0x0293
            r10 = 0
        L_0x011a:
            int[] r12 = r4.a
            int r13 = r12.length
            if (r10 >= r13) goto L_0x012b
            r13 = r12[r10]
            int[] r14 = r5.a
            r14 = r14[r10]
            r13 = r13 ^ r14
            r12[r10] = r13
            int r10 = r10 + 1
            goto L_0x011a
        L_0x012b:
            int r5 = r4.b
            java.lang.String r10 = "should not happen but we got: "
            if (r5 != r11) goto L_0x027c
            r5 = 0
        L_0x0132:
            int r11 = r4.b
            if (r5 >= r11) goto L_0x0164
            int r11 = r11 + -1
            int r11 = r11 - r5
            boolean r11 = r4.a((int) r11)
            int[][] r12 = d
            r13 = r12[r5]
            r14 = 0
            r13 = r13[r14]
            r12 = r12[r5]
            r15 = 1
            r12 = r12[r15]
            r3.a((int) r13, (int) r12, (boolean) r11)
            if (r5 >= r8) goto L_0x0157
            int r12 = r3.b
            int r12 = r12 - r5
            r13 = -1
            int r12 = r12 + r13
            r3.a((int) r12, (int) r8, (boolean) r11)
            goto L_0x0161
        L_0x0157:
            int r12 = r3.c
            int r12 = r12 + -7
            int r13 = r5 + -8
            int r12 = r12 + r13
            r3.a((int) r8, (int) r12, (boolean) r11)
        L_0x0161:
            int r5 = r5 + 1
            goto L_0x0132
        L_0x0164:
            r14 = 0
            int r4 = r1.a
            r5 = 7
            if (r4 < r5) goto L_0x01c3
            avxq r4 = new avxq
            r4.<init>()
            int r5 = r1.a
            r4.a(r5, r6)
            int r1 = r1.a
            r5 = 7973(0x1f25, float:1.1173E-41)
            int r1 = a(r1, r5)
            r5 = 12
            r4.a(r1, r5)
            int r1 = r4.b
            r5 = 18
            if (r1 != r5) goto L_0x01ac
            r1 = 17
            r5 = 0
        L_0x018a:
            if (r5 < r6) goto L_0x018d
            goto L_0x01c3
        L_0x018d:
            r8 = 0
        L_0x018e:
            if (r8 >= r7) goto L_0x01a9
            boolean r10 = r4.a((int) r1)
            int r1 = r1 + -1
            int r11 = r3.c
            int r11 = r11 + -11
            int r11 = r11 + r8
            r3.a((int) r5, (int) r11, (boolean) r10)
            int r11 = r3.c
            int r11 = r11 + -11
            int r11 = r11 + r8
            r3.a((int) r11, (int) r5, (boolean) r10)
            int r8 = r8 + 1
            goto L_0x018e
        L_0x01a9:
            int r5 = r5 + 1
            goto L_0x018a
        L_0x01ac:
            avxp r0 = new avxp
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            int r2 = r4.b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x01c3:
            int r1 = r3.b
            r4 = -1
            int r1 = r1 + r4
            int r5 = r3.c
            int r5 = r5 + r4
            r4 = -1
            r8 = 0
        L_0x01cc:
            if (r1 > 0) goto L_0x01f4
            int r1 = r0.b
            if (r8 != r1) goto L_0x01d3
            return
        L_0x01d3:
            avxp r1 = new avxp
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Not all bits consumed: "
            r2.append(r3)
            r2.append(r8)
            r3 = 47
            r2.append(r3)
            int r0 = r0.b
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x01f4:
            if (r1 == r6) goto L_0x01f7
            goto L_0x01f8
        L_0x01f7:
            r1 = 5
        L_0x01f8:
            if (r5 >= 0) goto L_0x01ff
            r11 = 2
            r16 = 1
            goto L_0x0276
        L_0x01ff:
            int r10 = r3.c
            if (r5 >= r10) goto L_0x0273
            r10 = 0
        L_0x0204:
            r11 = 2
            if (r10 < r11) goto L_0x0209
            int r5 = r5 + r4
            goto L_0x01f8
        L_0x0209:
            int r12 = r1 - r10
            byte r13 = r3.a(r12, r5)
            boolean r13 = b(r13)
            if (r13 != 0) goto L_0x0218
            r16 = 1
            goto L_0x0270
        L_0x0218:
            int r13 = r0.b
            if (r8 >= r13) goto L_0x0224
            boolean r13 = r0.a((int) r8)
            int r8 = r8 + 1
            r15 = r13
            goto L_0x0225
        L_0x0224:
            r15 = 0
        L_0x0225:
            switch(r2) {
                case 0: goto L_0x025f;
                case 1: goto L_0x0258;
                case 2: goto L_0x0255;
                case 3: goto L_0x0250;
                case 4: goto L_0x0249;
                case 5: goto L_0x0241;
                case 6: goto L_0x0236;
                default: goto L_0x0228;
            }
        L_0x0228:
            r16 = 1
            int r13 = r5 * r12
            int r13 = r13 % r7
            int r17 = r5 + r12
            r17 = r17 & 1
            int r13 = r13 + r17
            r13 = r13 & 1
            goto L_0x0265
        L_0x0236:
            int r13 = r5 * r12
            r16 = r13 & 1
            int r13 = r13 % r7
            int r16 = r16 + r13
            r13 = 1
            r16 = r16 & 1
            goto L_0x025a
        L_0x0241:
            int r13 = r5 * r12
            r16 = r13 & 1
            int r13 = r13 % r7
            int r16 = r16 + r13
            goto L_0x025a
        L_0x0249:
            int r13 = r5 >>> 1
            int r16 = r12 / 3
            int r13 = r13 + r16
            goto L_0x0261
        L_0x0250:
            int r13 = r5 + r12
            int r16 = r13 % 3
            goto L_0x025a
        L_0x0255:
            int r16 = r12 % 3
            goto L_0x025a
        L_0x0258:
            r16 = r5 & 1
        L_0x025a:
            r13 = r16
            r16 = 1
            goto L_0x0265
        L_0x025f:
            int r13 = r5 + r12
        L_0x0261:
            r16 = 1
            r13 = r13 & 1
        L_0x0265:
            if (r13 == 0) goto L_0x0268
            goto L_0x026d
        L_0x0268:
            if (r15 != 0) goto L_0x026c
            r15 = 1
            goto L_0x026d
        L_0x026c:
            r15 = 0
        L_0x026d:
            r3.a((int) r12, (int) r5, (boolean) r15)
        L_0x0270:
            int r10 = r10 + 1
            goto L_0x0204
        L_0x0273:
            r11 = 2
            r16 = 1
        L_0x0276:
            int r4 = -r4
            int r5 = r5 + r4
            int r1 = r1 + -2
            goto L_0x01cc
        L_0x027c:
            avxp r0 = new avxp
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            int r2 = r4.b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0293:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Sizes don't match"
            r0.<init>(r1)
            throw r0
        L_0x029b:
            avxp r0 = new avxp
            java.lang.String r1 = "Invalid mask pattern"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x02a3:
            avxp r0 = new avxp
            r0.<init>()
            throw r0
        L_0x02a9:
            r7 = r20
            r14 = 0
            r4 = 0
        L_0x02ad:
            int r6 = r3.b
            if (r4 >= r6) goto L_0x02bb
            byte[][] r6 = r3.a
            r6 = r6[r5]
            r8 = -1
            r6[r4] = r8
            int r4 = r4 + 1
            goto L_0x02ad
        L_0x02bb:
            int r5 = r5 + 1
            r4 = 0
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avye.a(avxq, avxv, avxz, int, avyb):void");
    }
}
