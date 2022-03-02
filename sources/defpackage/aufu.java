package defpackage;

import java.nio.ByteBuffer;

/* renamed from: aufu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aufu extends aufr {
    private static int a(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            return aufv.a(i);
        }
        if (i2 == 1) {
            return aufv.a(i, (int) aufp.a(bArr, j));
        }
        if (i2 == 2) {
            return aufv.a(i, (int) aufp.a(bArr, j), (int) aufp.a(bArr, j + 1));
        }
        throw new AssertionError();
    }

    public final String b(byte[] bArr, int i, int i2) {
        int i3;
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) >= 0) {
            int i4 = i + i2;
            char[] cArr = new char[i2];
            int i5 = 0;
            while (r12 < i4) {
                byte a = aufp.a(bArr, (long) r12);
                if (!aufq.a(a)) {
                    break;
                }
                i = r12 + 1;
                aufq.a(a, cArr, i3);
                i5 = i3 + 1;
            }
            while (r12 < i4) {
                int i6 = r12 + 1;
                byte a2 = aufp.a(bArr, (long) r12);
                if (aufq.a(a2)) {
                    aufq.a(a2, cArr, i3);
                    r12 = i6;
                    i3++;
                    while (r12 < i4) {
                        byte a3 = aufp.a(bArr, (long) r12);
                        if (!aufq.a(a3)) {
                            break;
                        }
                        r12++;
                        aufq.a(a3, cArr, i3);
                        i3++;
                    }
                } else if (!aufq.b(a2)) {
                    if (!aufq.c(a2)) {
                        if (i6 < i4 - 2) {
                            int i7 = i6 + 1;
                            int i8 = i7 + 1;
                            aufq.a(a2, aufp.a(bArr, (long) i6), aufp.a(bArr, (long) i7), aufp.a(bArr, (long) i8), cArr, i3);
                            i3 += 2;
                            r12 = i8 + 1;
                        } else {
                            throw auda.i();
                        }
                    } else if (i6 < i4 - 1) {
                        int i9 = i6 + 1;
                        aufq.a(a2, aufp.a(bArr, (long) i6), aufp.a(bArr, (long) i9), cArr, i3);
                        r12 = i9 + 1;
                        i3++;
                    } else {
                        throw auda.i();
                    }
                } else if (i6 < i4) {
                    aufq.a(a2, aufp.a(bArr, (long) i6), cArr, i3);
                    r12 = i6 + 1;
                    i3++;
                } else {
                    throw auda.i();
                }
            }
            return new String(cArr, 0, i3);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x015d, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0134, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0148, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r26, byte[] r27, int r28, int r29) {
        /*
            r25 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            int r4 = r1.length
            r5 = r2 | r3
            int r6 = r4 - r3
            r5 = r5 | r6
            if (r5 < 0) goto L_0x0166
            long r4 = (long) r2
            long r2 = (long) r3
            r9 = -19
            r10 = -16
            r11 = -62
            r12 = 16
            r13 = -96
            r14 = -32
            r15 = -65
            r16 = 1
            r18 = -1
            if (r0 == 0) goto L_0x00bb
            int r19 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r19 >= 0) goto L_0x00ba
            byte r8 = (byte) r0
            if (r8 < r14) goto L_0x00ab
            if (r8 < r10) goto L_0x0079
            int r20 = r0 >> 8
            r6 = r20 ^ -1
            byte r6 = (byte) r6
            if (r6 == 0) goto L_0x0039
            int r0 = r0 >> r12
            byte r0 = (byte) r0
            goto L_0x0046
        L_0x0039:
            long r21 = r4 + r16
            byte r6 = defpackage.aufp.a((byte[]) r1, (long) r4)
            int r0 = (r21 > r2 ? 1 : (r21 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0074
            r4 = r21
            r0 = 0
        L_0x0046:
            if (r0 != 0) goto L_0x005a
            long r21 = r4 + r16
            byte r0 = defpackage.aufp.a((byte[]) r1, (long) r4)
            int r4 = (r21 > r2 ? 1 : (r21 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0055
            r4 = r21
            goto L_0x005b
        L_0x0055:
            int r0 = defpackage.aufv.a((int) r8, (int) r6, (int) r0)
            return r0
        L_0x005a:
        L_0x005b:
            if (r6 > r15) goto L_0x0073
            int r8 = r8 << 28
            int r6 = r6 + 112
            int r8 = r8 + r6
            int r6 = r8 >> 30
            if (r6 != 0) goto L_0x0073
            if (r0 > r15) goto L_0x0073
            long r21 = r4 + r16
            byte r0 = defpackage.aufp.a((byte[]) r1, (long) r4)
            if (r0 > r15) goto L_0x0073
            r4 = r21
            goto L_0x00bc
        L_0x0073:
            return r18
        L_0x0074:
            int r0 = defpackage.aufv.a((int) r8, (int) r6)
            return r0
        L_0x0079:
            int r0 = r0 >> 8
            r0 = r0 ^ -1
            byte r0 = (byte) r0
            if (r0 != 0) goto L_0x0092
            long r21 = r4 + r16
            byte r0 = defpackage.aufp.a((byte[]) r1, (long) r4)
            int r4 = (r21 > r2 ? 1 : (r21 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x008d
            r4 = r21
            goto L_0x0093
        L_0x008d:
            int r0 = defpackage.aufv.a((int) r8, (int) r0)
            return r0
        L_0x0092:
        L_0x0093:
            if (r0 > r15) goto L_0x00aa
            if (r8 != r14) goto L_0x0099
            if (r0 < r13) goto L_0x00aa
        L_0x0099:
            if (r8 == r9) goto L_0x009c
            goto L_0x009f
        L_0x009c:
            if (r0 < r13) goto L_0x009f
            goto L_0x00aa
        L_0x009f:
            long r21 = r4 + r16
            byte r0 = defpackage.aufp.a((byte[]) r1, (long) r4)
            if (r0 > r15) goto L_0x00aa
            r4 = r21
            goto L_0x00bc
        L_0x00aa:
            return r18
        L_0x00ab:
            if (r8 < r11) goto L_0x00b9
            long r21 = r4 + r16
            byte r0 = defpackage.aufp.a((byte[]) r1, (long) r4)
            if (r0 <= r15) goto L_0x00b6
            goto L_0x00b9
        L_0x00b6:
            r4 = r21
            goto L_0x00bc
        L_0x00b9:
            return r18
        L_0x00ba:
            return r0
        L_0x00bb:
        L_0x00bc:
            long r2 = r2 - r4
            int r0 = (int) r2
            if (r0 < r12) goto L_0x00d4
            r7 = r4
            r2 = 0
        L_0x00c2:
            if (r2 >= r0) goto L_0x00d2
            long r21 = r7 + r16
            byte r3 = defpackage.aufp.a((byte[]) r1, (long) r7)
            if (r3 >= 0) goto L_0x00cd
            goto L_0x00d5
        L_0x00cd:
            int r2 = r2 + 1
            r7 = r21
            goto L_0x00c2
        L_0x00d2:
            r2 = r0
            goto L_0x00d5
        L_0x00d4:
            r2 = 0
        L_0x00d5:
            int r0 = r0 - r2
            long r2 = (long) r2
            long r4 = r4 + r2
        L_0x00d8:
            r2 = 0
        L_0x00d9:
            if (r0 <= 0) goto L_0x00f1
            long r2 = r4 + r16
            byte r4 = defpackage.aufp.a((byte[]) r1, (long) r4)
            if (r4 < 0) goto L_0x00eb
            int r0 = r0 + -1
            r23 = r2
            r2 = r4
            r4 = r23
            goto L_0x00d9
        L_0x00eb:
            r23 = r2
            r2 = r4
            r4 = r23
            goto L_0x00f2
        L_0x00f1:
        L_0x00f2:
            if (r0 == 0) goto L_0x0164
            int r0 = r0 + -1
            if (r2 >= r14) goto L_0x010c
            if (r0 == 0) goto L_0x010a
            int r0 = r0 + -1
            if (r2 < r11) goto L_0x0108
            long r2 = r4 + r16
            byte r4 = defpackage.aufp.a((byte[]) r1, (long) r4)
            if (r4 > r15) goto L_0x0108
            r4 = r2
            goto L_0x00d8
        L_0x0108:
            r8 = -1
            goto L_0x0165
        L_0x010a:
            r8 = r2
            goto L_0x0165
        L_0x010c:
            if (r2 < r10) goto L_0x013b
            r3 = 3
            if (r0 < r3) goto L_0x0136
            int r0 = r0 + -3
            long r7 = r4 + r16
            byte r3 = defpackage.aufp.a((byte[]) r1, (long) r4)
            if (r3 > r15) goto L_0x0134
            int r2 = r2 << 28
            int r3 = r3 + 112
            int r2 = r2 + r3
            int r2 = r2 >> 30
            if (r2 != 0) goto L_0x0134
            long r2 = r7 + r16
            byte r4 = defpackage.aufp.a((byte[]) r1, (long) r7)
            if (r4 > r15) goto L_0x0134
            long r4 = r2 + r16
            byte r2 = defpackage.aufp.a((byte[]) r1, (long) r2)
            if (r2 <= r15) goto L_0x00d8
        L_0x0134:
            r8 = -1
            goto L_0x0165
        L_0x0136:
            int r8 = a((byte[]) r1, (int) r2, (long) r4, (int) r0)
            goto L_0x0165
        L_0x013b:
            r3 = 2
            if (r0 < r3) goto L_0x015f
            int r0 = r0 + -2
            long r7 = r4 + r16
            byte r3 = defpackage.aufp.a((byte[]) r1, (long) r4)
            if (r3 <= r15) goto L_0x014a
        L_0x0148:
            r8 = -1
            goto L_0x0165
        L_0x014a:
            if (r2 != r14) goto L_0x014f
            if (r3 >= r13) goto L_0x014f
            goto L_0x0148
        L_0x014f:
            if (r2 == r9) goto L_0x0152
            goto L_0x0155
        L_0x0152:
            if (r3 < r13) goto L_0x0155
            goto L_0x015d
        L_0x0155:
            long r4 = r7 + r16
            byte r2 = defpackage.aufp.a((byte[]) r1, (long) r7)
            if (r2 <= r15) goto L_0x00d8
        L_0x015d:
            r8 = -1
            goto L_0x0165
        L_0x015f:
            int r8 = a((byte[]) r1, (int) r2, (long) r4, (int) r0)
            goto L_0x0165
        L_0x0164:
            r8 = 0
        L_0x0165:
            return r8
        L_0x0166:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r1[r5] = r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r28)
            r4 = 1
            r1[r4] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r29)
            r3 = 2
            r1[r3] = r2
            java.lang.String r2 = "Array length=%d, index=%d, limit=%d"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            goto L_0x018b
        L_0x018a:
            throw r0
        L_0x018b:
            goto L_0x018a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aufu.a(int, byte[], int, int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031 A[LOOP:1: B:11:0x0031->B:35:0x00fa, LOOP_START, PHI: r2 r3 r4 r11 
      PHI: (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:10:0x002f, B:35:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v2 char) = (r3v1 char), (r3v3 char) binds: [B:10:0x002f, B:35:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v4 long) = (r4v2 long), (r4v6 long) binds: [B:10:0x002f, B:35:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x002f, B:35:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.CharSequence r23, byte[] r24, int r25, int r26) {
        /*
            r22 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            long r4 = (long) r2
            long r6 = (long) r3
            long r6 = r6 + r4
            int r8 = r23.length()
            java.lang.String r9 = " at index "
            java.lang.String r10 = "Failed writing "
            if (r8 > r3) goto L_0x0145
            int r11 = r1.length
            int r11 = r11 - r3
            if (r11 < r2) goto L_0x0145
            r2 = 0
        L_0x001a:
            r3 = 128(0x80, float:1.794E-43)
            r11 = 1
            if (r2 >= r8) goto L_0x002f
            char r13 = r0.charAt(r2)
            if (r13 >= r3) goto L_0x002f
            long r11 = r11 + r4
            byte r3 = (byte) r13
            defpackage.aufp.a((byte[]) r1, (long) r4, (byte) r3)
            int r2 = r2 + 1
            r4 = r11
            goto L_0x001a
        L_0x002f:
            if (r2 == r8) goto L_0x0143
        L_0x0031:
            if (r2 >= r8) goto L_0x0143
            char r13 = r0.charAt(r2)
            if (r13 < r3) goto L_0x003a
            goto L_0x004a
        L_0x003a:
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 >= 0) goto L_0x004a
            long r14 = r4 + r11
            byte r13 = (byte) r13
            defpackage.aufp.a((byte[]) r1, (long) r4, (byte) r13)
            r4 = r11
            r12 = r14
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x00fa
        L_0x004a:
            r14 = 2048(0x800, float:2.87E-42)
            if (r13 >= r14) goto L_0x0073
            r14 = -2
            long r14 = r14 + r6
            int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r16 > 0) goto L_0x0073
            long r14 = r4 + r11
            int r3 = r13 >>> 6
            r3 = r3 | 960(0x3c0, float:1.345E-42)
            byte r3 = (byte) r3
            defpackage.aufp.a((byte[]) r1, (long) r4, (byte) r3)
            long r3 = r14 + r11
            r5 = r13 & 63
            r13 = 128(0x80, float:1.794E-43)
            r5 = r5 | r13
            byte r5 = (byte) r5
            defpackage.aufp.a((byte[]) r1, (long) r14, (byte) r5)
            r20 = r11
            r11 = 128(0x80, float:1.794E-43)
            r12 = r3
            r4 = r20
            goto L_0x00fa
        L_0x0073:
            r3 = 57343(0xdfff, float:8.0355E-41)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r13 >= r14) goto L_0x007c
            goto L_0x007e
        L_0x007c:
            if (r13 <= r3) goto L_0x00ae
        L_0x007e:
            r15 = -3
            long r15 = r15 + r6
            int r17 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r17 > 0) goto L_0x00ae
            long r14 = r4 + r11
            int r3 = r13 >>> 12
            r3 = r3 | 480(0x1e0, float:6.73E-43)
            byte r3 = (byte) r3
            defpackage.aufp.a((byte[]) r1, (long) r4, (byte) r3)
            long r3 = r14 + r11
            int r5 = r13 >>> 6
            r5 = r5 & 63
            r11 = 128(0x80, float:1.794E-43)
            r5 = r5 | r11
            byte r5 = (byte) r5
            defpackage.aufp.a((byte[]) r1, (long) r14, (byte) r5)
            r14 = 1
            long r18 = r3 + r14
            r5 = r13 & 63
            r5 = r5 | r11
            byte r5 = (byte) r5
            defpackage.aufp.a((byte[]) r1, (long) r3, (byte) r5)
            r12 = r18
            r4 = 1
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x00fa
        L_0x00ae:
            r11 = -4
            long r11 = r11 + r6
            int r15 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r15 > 0) goto L_0x010e
            int r3 = r2 + 1
            if (r3 == r8) goto L_0x0106
            char r2 = r0.charAt(r3)
            boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
            if (r11 == 0) goto L_0x0105
            int r2 = java.lang.Character.toCodePoint(r13, r2)
            r11 = 1
            long r13 = r4 + r11
            int r15 = r2 >>> 18
            r15 = r15 | 240(0xf0, float:3.36E-43)
            byte r15 = (byte) r15
            defpackage.aufp.a((byte[]) r1, (long) r4, (byte) r15)
            long r4 = r13 + r11
            int r15 = r2 >>> 12
            r15 = r15 & 63
            r11 = 128(0x80, float:1.794E-43)
            r12 = r15 | 128(0x80, float:1.794E-43)
            byte r12 = (byte) r12
            defpackage.aufp.a((byte[]) r1, (long) r13, (byte) r12)
            r12 = 1
            long r14 = r4 + r12
            int r16 = r2 >>> 6
            r12 = r16 & 63
            r12 = r12 | r11
            byte r12 = (byte) r12
            defpackage.aufp.a((byte[]) r1, (long) r4, (byte) r12)
            r4 = 1
            long r12 = r14 + r4
            r2 = r2 & 63
            r2 = r2 | r11
            byte r2 = (byte) r2
            defpackage.aufp.a((byte[]) r1, (long) r14, (byte) r2)
            r2 = r3
        L_0x00fa:
            int r2 = r2 + 1
            r3 = 128(0x80, float:1.794E-43)
            r20 = r4
            r4 = r12
            r11 = r20
            goto L_0x0031
        L_0x0105:
            r2 = r3
        L_0x0106:
            auft r0 = new auft
            int r2 = r2 + -1
            r0.<init>(r2, r8)
            throw r0
        L_0x010e:
            if (r13 < r14) goto L_0x0126
            if (r13 > r3) goto L_0x0126
            int r1 = r2 + 1
            if (r1 == r8) goto L_0x0120
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
            if (r0 != 0) goto L_0x0126
        L_0x0120:
            auft r0 = new auft
            r0.<init>(r2, r8)
            throw r0
        L_0x0126:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 46
            r1.<init>(r2)
            r1.append(r10)
            r1.append(r13)
            r1.append(r9)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0143:
            int r0 = (int) r4
            return r0
        L_0x0145:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            int r8 = r8 + -1
            char r0 = r0.charAt(r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 37
            r4.<init>(r5)
            r4.append(r10)
            r4.append(r0)
            r4.append(r9)
            int r0 = r2 + r3
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.<init>(r0)
            goto L_0x016b
        L_0x016a:
            throw r1
        L_0x016b:
            goto L_0x016a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aufu.a(java.lang.CharSequence, byte[], int, int):int");
    }

    public final String a(ByteBuffer byteBuffer, int i, int i2) {
        long j;
        int i3;
        int i4 = i;
        int i5 = i2;
        if ((i4 | i5 | ((byteBuffer.limit() - i4) - i5)) >= 0) {
            long a = aufp.a(byteBuffer) + ((long) i4);
            long j2 = ((long) i5) + a;
            char[] cArr = new char[i5];
            int i6 = 0;
            while (j < j2) {
                byte a2 = aufp.a(j);
                if (!aufq.a(a2)) {
                    break;
                }
                a = j + 1;
                aufq.a(a2, cArr, i3);
                i6 = i3 + 1;
            }
            while (j < j2) {
                long j3 = j + 1;
                byte a3 = aufp.a(j);
                if (aufq.a(a3)) {
                    int i7 = i3 + 1;
                    aufq.a(a3, cArr, i3);
                    while (j3 < j2) {
                        byte a4 = aufp.a(j3);
                        if (!aufq.a(a4)) {
                            break;
                        }
                        j3++;
                        aufq.a(a4, cArr, i7);
                        i7++;
                    }
                    i3 = i7;
                    j = j3;
                } else if (!aufq.b(a3)) {
                    if (!aufq.c(a3)) {
                        if (j3 < -2 + j2) {
                            long j4 = j3 + 1;
                            long j5 = j4 + 1;
                            aufq.a(a3, aufp.a(j3), aufp.a(j4), aufp.a(j5), cArr, i3);
                            i3 += 2;
                            j = j5 + 1;
                        } else {
                            throw auda.i();
                        }
                    } else if (j3 < -1 + j2) {
                        long j6 = j3 + 1;
                        aufq.a(a3, aufp.a(j3), aufp.a(j6), cArr, i3);
                        j = j6 + 1;
                        i3++;
                    } else {
                        throw auda.i();
                    }
                } else if (j3 < j2) {
                    j = j3 + 1;
                    aufq.a(a3, aufp.a(j3), cArr, i3);
                    i3++;
                } else {
                    throw auda.i();
                }
            }
            return new String(cArr, 0, i3);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003b A[LOOP:1: B:9:0x003b->B:33:0x00fe, LOOP_START, PHI: r2 r4 r9 r10 
      PHI: (r2v2 long) = (r2v0 long), (r2v3 long) binds: [B:8:0x0039, B:33:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v6 long) = (r4v4 long), (r4v8 long) binds: [B:8:0x0039, B:33:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v3 int) = (r9v2 int), (r9v5 int) binds: [B:8:0x0039, B:33:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r10v1 char) = (r10v0 char), (r10v2 char) binds: [B:8:0x0039, B:33:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.CharSequence r22, java.nio.ByteBuffer r23) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            long r2 = defpackage.aufp.a((java.nio.ByteBuffer) r23)
            int r4 = r23.position()
            long r4 = (long) r4
            long r4 = r4 + r2
            int r6 = r23.limit()
            long r6 = (long) r6
            long r6 = r6 + r2
            int r8 = r22.length()
            long r9 = (long) r8
            long r11 = r6 - r4
            java.lang.String r13 = " at index "
            java.lang.String r14 = "Failed writing "
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 > 0) goto L_0x015a
            r9 = 0
        L_0x0024:
            r10 = 128(0x80, float:1.794E-43)
            r11 = 1
            if (r9 >= r8) goto L_0x0039
            char r15 = r0.charAt(r9)
            if (r15 >= r10) goto L_0x0039
            long r11 = r11 + r4
            byte r10 = (byte) r15
            defpackage.aufp.a((long) r4, (byte) r10)
            int r9 = r9 + 1
            r4 = r11
            goto L_0x0024
        L_0x0039:
            if (r9 == r8) goto L_0x0151
        L_0x003b:
            if (r9 >= r8) goto L_0x0146
            char r15 = r0.charAt(r9)
            if (r15 < r10) goto L_0x0044
            goto L_0x0056
        L_0x0044:
            int r16 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r16 >= 0) goto L_0x0056
            long r16 = r4 + r11
            byte r15 = (byte) r15
            defpackage.aufp.a((long) r4, (byte) r15)
            r4 = r16
            r15 = 128(0x80, float:1.794E-43)
            r17 = r2
            goto L_0x00fe
        L_0x0056:
            r10 = 2048(0x800, float:2.87E-42)
            if (r15 >= r10) goto L_0x007e
            r17 = -2
            long r17 = r6 + r17
            int r10 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r10 > 0) goto L_0x007e
            r17 = r2
            long r1 = r4 + r11
            int r3 = r15 >>> 6
            r3 = r3 | 960(0x3c0, float:1.345E-42)
            byte r3 = (byte) r3
            defpackage.aufp.a((long) r4, (byte) r3)
            long r3 = r1 + r11
            r5 = r15 & 63
            r10 = 128(0x80, float:1.794E-43)
            r5 = r5 | r10
            byte r5 = (byte) r5
            defpackage.aufp.a((long) r1, (byte) r5)
            r4 = r3
            r15 = 128(0x80, float:1.794E-43)
            goto L_0x00fe
        L_0x007e:
            r17 = r2
            r1 = 57343(0xdfff, float:8.0355E-41)
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r15 >= r2) goto L_0x0089
            goto L_0x008b
        L_0x0089:
            if (r15 <= r1) goto L_0x00b7
        L_0x008b:
            r19 = -3
            long r19 = r6 + r19
            int r3 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r3 > 0) goto L_0x00b7
            long r1 = r4 + r11
            int r3 = r15 >>> 12
            r3 = r3 | 480(0x1e0, float:6.73E-43)
            byte r3 = (byte) r3
            defpackage.aufp.a((long) r4, (byte) r3)
            long r3 = r1 + r11
            int r5 = r15 >>> 6
            r5 = r5 & 63
            r10 = 128(0x80, float:1.794E-43)
            r5 = r5 | r10
            byte r5 = (byte) r5
            defpackage.aufp.a((long) r1, (byte) r5)
            long r1 = r3 + r11
            r5 = r15 & 63
            r5 = r5 | r10
            byte r5 = (byte) r5
            defpackage.aufp.a((long) r3, (byte) r5)
            r4 = r1
            r15 = 128(0x80, float:1.794E-43)
            goto L_0x00fe
        L_0x00b7:
            r19 = -4
            long r19 = r6 + r19
            int r3 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r3 > 0) goto L_0x0111
            int r1 = r9 + 1
            if (r1 == r8) goto L_0x0109
            char r2 = r0.charAt(r1)
            boolean r3 = java.lang.Character.isSurrogatePair(r15, r2)
            if (r3 == 0) goto L_0x0108
            int r2 = java.lang.Character.toCodePoint(r15, r2)
            long r9 = r4 + r11
            int r3 = r2 >>> 18
            r3 = r3 | 240(0xf0, float:3.36E-43)
            byte r3 = (byte) r3
            defpackage.aufp.a((long) r4, (byte) r3)
            long r3 = r9 + r11
            int r5 = r2 >>> 12
            r5 = r5 & 63
            r15 = 128(0x80, float:1.794E-43)
            r5 = r5 | r15
            byte r5 = (byte) r5
            defpackage.aufp.a((long) r9, (byte) r5)
            long r9 = r3 + r11
            int r5 = r2 >>> 6
            r5 = r5 & 63
            r5 = r5 | r15
            byte r5 = (byte) r5
            defpackage.aufp.a((long) r3, (byte) r5)
            long r3 = r9 + r11
            r2 = r2 & 63
            r2 = r2 | r15
            byte r2 = (byte) r2
            defpackage.aufp.a((long) r9, (byte) r2)
            r9 = r1
            r4 = r3
        L_0x00fe:
            int r9 = r9 + 1
            r1 = r23
            r2 = r17
            r10 = 128(0x80, float:1.794E-43)
            goto L_0x003b
        L_0x0108:
            r9 = r1
        L_0x0109:
            auft r0 = new auft
            int r9 = r9 + -1
            r0.<init>(r9, r8)
            throw r0
        L_0x0111:
            if (r15 < r2) goto L_0x0129
            if (r15 > r1) goto L_0x0129
            int r1 = r9 + 1
            if (r1 == r8) goto L_0x0123
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r15, r0)
            if (r0 != 0) goto L_0x0129
        L_0x0123:
            auft r0 = new auft
            r0.<init>(r9, r8)
            throw r0
        L_0x0129:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 46
            r1.<init>(r2)
            r1.append(r14)
            r1.append(r15)
            r1.append(r13)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0146:
            r17 = r2
            long r4 = r4 - r17
            int r0 = (int) r4
            r1 = r23
            r1.position(r0)
            return
        L_0x0151:
            r17 = r2
            long r4 = r4 - r17
            int r0 = (int) r4
            r1.position(r0)
            return
        L_0x015a:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            int r8 = r8 + -1
            char r0 = r0.charAt(r8)
            int r1 = r23.limit()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 37
            r3.<init>(r4)
            r3.append(r14)
            r3.append(r0)
            r3.append(r13)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            goto L_0x0182
        L_0x0181:
            throw r2
        L_0x0182:
            goto L_0x0181
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aufu.a(java.lang.CharSequence, java.nio.ByteBuffer):void");
    }
}
