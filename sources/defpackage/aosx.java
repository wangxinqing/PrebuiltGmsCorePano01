package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.InputStream;

/* renamed from: aosx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aosx {
    static final int[] a = {PSKKeyManager.MAX_KEY_LENGTH_BYTES, 402, 436, 468, 500, 534, 566, 598, 630, 662, 694, 726, 758, 790, 822, 854, 886, 920, 952, 984, 1016, 1048, 1080};
    static final int[] b = {1, 5, 9, 13, 17, 25, 33, 41, 49, 65, 81, 97, 113, 145, 177, 209, 241, 305, 369, 497, 753, 1265, 2289, 4337, 8433, 16625};
    static final int[] c = {2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 8, 9, 10, 11, 12, 13, 24};
    static final short[] d = {0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 12, 14, 24};
    static final short[] e = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 24};
    static final short[] f;
    private static final int[] g = {1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    private static final int[] h = {0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3};
    private static final int[] i = {0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3};
    private static final int[] j = {131072, 131076, 131075, 196610, 131072, 131076, 131075, 262145, 131072, 131076, 131075, 196610, 131072, 131076, 131075, 262149};

    static {
        int i2;
        int i3;
        short[] sArr = new short[2816];
        f = sArr;
        short[] sArr2 = new short[24];
        short[] sArr3 = new short[24];
        sArr3[0] = 2;
        int i4 = 0;
        while (i4 < 23) {
            int i5 = i4 + 1;
            sArr2[i5] = (short) (sArr2[i4] + (1 << d[i4]));
            sArr3[i5] = (short) (sArr3[i4] + (1 << e[i4]));
            i4 = i5;
        }
        for (int i6 = 0; i6 < 704; i6++) {
            int i7 = i6 >>> 6;
            if (i7 >= 2) {
                i7 -= 2;
                i2 = 0;
            } else {
                i2 = -4;
            }
            int i8 = i7 + i7;
            int i9 = (((170064 >>> i8) & 3) << 3) | ((i6 >>> 3) & 7);
            int i10 = (((156228 >>> i8) & 3) << 3) | (i6 & 7);
            short s = sArr3[i10];
            if (s <= 4) {
                i3 = s - 2;
            } else {
                i3 = 3;
            }
            int i11 = i6 * 4;
            sArr[i11] = (short) (d[i9] | (e[i10] << 8));
            sArr[i11 + 1] = sArr2[i9];
            sArr[i11 + 2] = sArr3[i10];
            sArr[i11 + 3] = (short) (i2 + i3);
        }
    }

    private static int a(int i2) {
        int i3 = -1;
        for (int i4 = 16; i4 > 0; i4 >>= 1) {
            int i5 = i2 >>> i4;
            if (i5 != 0) {
                i3 += i4;
                i2 = i5;
            }
        }
        return i3 + i2;
    }

    private static int a(int i2, int i3, int i4) {
        int i5 = i4 << i2;
        return i3 + 16 + i5 + i5;
    }

    private static int b(aota aota, int i2, int i3) {
        int[] iArr = aota.k;
        int i4 = i2 + i2;
        int i5 = iArr[i4];
        if (i3 <= 1) {
            iArr[i4 + 1] = i5;
            iArr[i4 + 2] = i5;
            return 268435456;
        }
        int i6 = i3 + 2;
        int a2 = i5 + a(i6, i6, iArr, i4, aota);
        int[] iArr2 = aota.k;
        int i7 = i4 + 1;
        iArr2[i7] = a2;
        int a3 = a(26, 26, iArr2, i7, aota);
        int[] iArr3 = aota.k;
        iArr3[i4 + 2] = a2 + a3;
        return b(iArr3, i7, aota);
    }

    private static int c(aota aota) {
        aost.c(aota);
        if (aost.b(aota, 1) == 0) {
            return 0;
        }
        int b2 = aost.b(aota, 3);
        if (b2 != 0) {
            return aost.b(aota, b2) + (1 << b2);
        }
        return 1;
    }

    private static void d(aota aota) {
        aota.B = a(aota, 0, aota.C);
        int i2 = aota.j[5];
        int i3 = i2 << 6;
        aota.P = i3;
        aota.L = aota.c[i3] & 255;
        int i4 = aota.b[i2] << 9;
        aota.R = i4;
        aota.S = i4 + PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }

    private static int e(aota aota) {
        int i2 = aota.aa;
        int i3 = aota.ah;
        return i2;
    }

    private static int a(int i2, int i3) {
        if ((2 << i2) + i3 <= 2147483644) {
            int i4 = ((2147483644 - i3) >> i2) + 4;
            int a2 = a(i4) - 1;
            int i5 = a2 - 1;
            return (((((i4 >> a2) & 1) | (i5 + i5)) - 1) << i2) + (1 << i2) + i3 + 16;
        }
        throw new IllegalArgumentException("maxDistance is too small");
    }

    private static int a(int i2, int i3, int[] iArr, int i4, aota aota) {
        int i5;
        int i6;
        int i7;
        int i8 = i3;
        int[] iArr2 = iArr;
        int i9 = i4;
        aota aota2 = aota;
        aost.a(aota);
        aost.c(aota);
        int b2 = aost.b(aota2, 2);
        if (b2 != 1) {
            int[] iArr3 = new int[i8];
            int[] iArr4 = new int[18];
            int i10 = 32;
            int i11 = 0;
            while (b2 < 18 && i10 > 0) {
                int i12 = g[b2];
                aost.c(aota);
                int e2 = aost.e(aota) & 15;
                aota2.t += j[e2] >> 16;
                int i13 = (char) j[e2];
                iArr4[i12] = i13;
                if (i13 != 0) {
                    i10 -= 32 >> i13;
                    i11++;
                }
                b2++;
            }
            if (i10 == 0 || i11 == 1) {
                int[] iArr5 = new int[33];
                aosz.a(iArr5, 32, 5, iArr4, 18);
                int i14 = 8;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 32768;
                while (i15 < i8 && i18 > 0) {
                    aost.a(aota);
                    aost.c(aota);
                    int e3 = aost.e(aota);
                    int i19 = aota2.t;
                    int i20 = iArr5[e3 & 31];
                    aota2.t = i19 + (i20 >> 16);
                    int i21 = (char) i20;
                    if (i21 < 16) {
                        int i22 = i15 + 1;
                        iArr3[i15] = i21;
                        if (i21 != 0) {
                            i18 -= 32768 >> i21;
                            i15 = i22;
                            i14 = i21;
                        } else {
                            i15 = i22;
                        }
                        i17 = 0;
                    } else {
                        int i23 = i21 - 14;
                        if (i21 == 16) {
                            i5 = i14;
                        } else {
                            i5 = 0;
                        }
                        if (i16 != i5) {
                            i6 = i5;
                        } else {
                            i6 = i16;
                        }
                        if (i16 != i5) {
                            i17 = 0;
                        }
                        if (i17 > 0) {
                            i7 = (i17 - 2) << i23;
                        } else {
                            i7 = i17;
                        }
                        aost.c(aota);
                        int b3 = i7 + aost.b(aota2, i23) + 3;
                        int i24 = b3 - i17;
                        if (i15 + i24 <= i8) {
                            int i25 = 0;
                            while (i25 < i24) {
                                iArr3[i15] = i6;
                                i25++;
                                i15++;
                            }
                            if (i6 != 0) {
                                i18 -= i24 << (15 - i6);
                            }
                            i17 = b3;
                            i16 = i6;
                        } else {
                            throw new aosv("symbol + repeatDelta > numSymbols");
                        }
                    }
                }
                if (i18 == 0) {
                    while (i15 < i8) {
                        int min = Math.min(i15 + 1024, i8) - i15;
                        System.arraycopy(aotd.b, 0, iArr3, i15, min);
                        i15 += min;
                    }
                    return aosz.a(iArr2, i9, 8, iArr3, i8);
                }
                throw new aosv("Unused space");
            }
            throw new aosv("Corrupted Huffman code histogram");
        }
        int[] iArr6 = new int[i8];
        int[] iArr7 = new int[4];
        int a2 = a(i2 - 1) + 1;
        int b4 = aost.b(aota2, 2) + 1;
        int i26 = 0;
        while (i26 < b4) {
            aost.c(aota);
            int b5 = aost.b(aota2, a2);
            if (b5 < i8) {
                iArr7[i26] = b5;
                i26++;
            } else {
                throw new aosv("Can't readHuffmanCode");
            }
        }
        int i27 = 0;
        while (i27 < b4 - 1) {
            int i28 = i27 + 1;
            int i29 = i28;
            while (i29 < b4) {
                if (iArr7[i27] != iArr7[i29]) {
                    i29++;
                } else {
                    throw new aosv("Duplicate simple Huffman code symbol");
                }
            }
            i27 = i28;
        }
        if (b4 == 4) {
            b4 = aost.b(aota2, 1) + 4;
        }
        if (b4 == 1) {
            iArr6[iArr7[0]] = 1;
        } else if (b4 == 2) {
            iArr6[iArr7[0]] = 1;
            iArr6[iArr7[1]] = 1;
        } else if (b4 == 3) {
            iArr6[iArr7[0]] = 1;
            iArr6[iArr7[1]] = 2;
            iArr6[iArr7[2]] = 2;
        } else if (b4 == 4) {
            iArr6[iArr7[0]] = 2;
            iArr6[iArr7[1]] = 2;
            iArr6[iArr7[2]] = 2;
            iArr6[iArr7[3]] = 2;
        } else if (b4 == 5) {
            iArr6[iArr7[0]] = 1;
            iArr6[iArr7[1]] = 2;
            iArr6[iArr7[2]] = 3;
            iArr6[iArr7[3]] = 3;
        }
        return aosz.a(iArr2, i9, 8, iArr6, i8);
    }

    private static int b(int[] iArr, int i2, aota aota) {
        aost.c(aota);
        int a2 = a(iArr, i2, aota);
        int i3 = c[a2];
        aost.c(aota);
        return b[a2] + aost.c(aota, i3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v81, resolved type: byte} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0213, code lost:
        r0.q = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x033d, code lost:
        if (r0.x > 0) goto L_0x0346;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x033f, code lost:
        r0.q = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0346, code lost:
        defpackage.aost.a(r29);
        r2 = r0.D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x034b, code lost:
        if (r2 != 0) goto L_0x035c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x034d, code lost:
        r2 = a(r0, r10, r0.E);
        r0.D = r2;
        r0.M = r0.j[7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x035c, code lost:
        r0.D = r2 - 1;
        defpackage.aost.c(r29);
        r2 = a(r0.m, r0.M, r0) << 2;
        r3 = f;
        r5 = r3[r2];
        r6 = r3[r2 + 1];
        r7 = r3[r2 + 2];
        r0.T = r3[r2 + 3];
        defpackage.aost.c(r29);
        r0.O = r6 + defpackage.aost.c(r0, r5 & 255);
        defpackage.aost.c(r29);
        r0.X = r7 + defpackage.aost.c(r0, r5 >> 8);
        r0.N = 0;
        r0.q = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03a1, code lost:
        if (r0.K == 0) goto L_0x03e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03a7, code lost:
        if (r0.N >= r0.O) goto L_0x03de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03a9, code lost:
        defpackage.aost.a(r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03ae, code lost:
        if (r0.B != 0) goto L_0x03b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03b0, code lost:
        d(r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03b3, code lost:
        r0.B--;
        defpackage.aost.c(r29);
        r12[r0.H] = (byte) a(r0.l, r0.L, r0);
        r2 = r0.H + r10;
        r0.H = r2;
        r0.N += r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03d3, code lost:
        if (r2 < r1) goto L_0x03a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03d5, code lost:
        r0.r = 7;
        r0.q = 12;
        r2 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03de, code lost:
        r2 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03e0, code lost:
        r2 = r0.H;
        r3 = r12[(r2 - 1) & r11] & 255;
        r2 = r12[(r2 - 2) & r11] & 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03f4, code lost:
        if (r0.N >= r0.O) goto L_0x0444;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03f6, code lost:
        defpackage.aost.a(r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03fb, code lost:
        if (r0.B != 0) goto L_0x0400;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03fd, code lost:
        d(r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0400, code lost:
        r2 = r0.c[r0.P + (defpackage.aosw.a[r0.S + r2] | defpackage.aosw.a[r0.R + r3])];
        r0.B--;
        defpackage.aost.c(r29);
        r2 = a(r0.l, (int) r2 & 255, r0);
        r5 = r0.H;
        r12[r5] = (byte) r2;
        r5 = r5 + r10;
        r0.H = r5;
        r0.N += r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0434, code lost:
        if (r5 >= r1) goto L_0x043c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0436, code lost:
        r28 = r3;
        r3 = r2;
        r2 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x043c, code lost:
        r2 = 7;
        r0.r = 7;
        r0.q = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0444, code lost:
        r2 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0447, code lost:
        if (r0.q != r2) goto L_0x05a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0449, code lost:
        r2 = r0.x - r0.O;
        r0.x = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0450, code lost:
        if (r2 > 0) goto L_0x0458;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0452, code lost:
        r0.q = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0458, code lost:
        r2 = r0.T;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x045a, code lost:
        if (r2 >= 0) goto L_0x0468;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x045c, code lost:
        r3 = r0.j[r0.J];
        r0.W = r3;
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0468, code lost:
        defpackage.aost.a(r29);
        r3 = r0.F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x046d, code lost:
        if (r3 != 0) goto L_0x0481;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x046f, code lost:
        r3 = a(r0, 2, r0.G);
        r0.F = r3;
        r0.Q = r0.j[9] << 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0481, code lost:
        r0.F = r3 - 1;
        defpackage.aost.c(r29);
        r2 = a(r0.n, (int) r0.d[r0.Q + r2] & 255, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0499, code lost:
        if (r2 >= 16) goto L_0x04ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x049b, code lost:
        r5 = r0.j[(r0.J + h[r2]) & 3] + i[r2];
        r0.W = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04af, code lost:
        if (r5 < 0) goto L_0x04b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04b9, code lost:
        throw new defpackage.aosv("Negative distance");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04ba, code lost:
        r5 = r0.e[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04c3, code lost:
        if ((r0.t + r5) > defpackage.aost.a) goto L_0x04ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04c5, code lost:
        r5 = defpackage.aost.b(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04ca, code lost:
        defpackage.aost.c(r29);
        r5 = defpackage.aost.c(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04d1, code lost:
        r5 = (r5 << r0.V) + r0.o[r2];
        r0.W = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04db, code lost:
        r6 = r0.I;
        r7 = r0.Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04df, code lost:
        if (r6 == r7) goto L_0x04e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x04e1, code lost:
        r6 = r0.H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04e3, code lost:
        if (r6 >= r7) goto L_0x04e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04e5, code lost:
        r0.I = r6;
        r7 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x04e9, code lost:
        r0.I = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04eb, code lost:
        if (r5 <= r7) goto L_0x04f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x04ed, code lost:
        r0.q = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04f3, code lost:
        if (r2 <= 0) goto L_0x0500;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04f5, code lost:
        r2 = (r0.J + r10) & 3;
        r0.J = r2;
        r0.j[r2] = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0504, code lost:
        if (r0.X > r0.x) goto L_0x059d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0506, code lost:
        r0.N = 0;
        r0.q = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x050d, code lost:
        r2 = r0.H;
        r4 = (r2 - r0.W) & r11;
        r5 = r0.X - r0.N;
        r6 = r4 + r5;
        r7 = r2 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x051d, code lost:
        if (r6 < r11) goto L_0x0520;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0520, code lost:
        if (r7 >= r11) goto L_0x0568;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0524, code lost:
        if (r5 >= 12) goto L_0x0528;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0526, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0528, code lost:
        if (r6 > r2) goto L_0x052b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x052b, code lost:
        if (r7 <= r4) goto L_0x0553;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x052d, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x052e, code lost:
        if (r6 >= r5) goto L_0x0556;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0530, code lost:
        r7 = r2 + 1;
        r8 = r4 + 1;
        r12[r2] = r12[r4];
        r2 = r7 + 1;
        r4 = r8 + 1;
        r12[r7] = r12[r8];
        r7 = r2 + 1;
        r8 = r4 + 1;
        r12[r2] = r12[r4];
        r2 = r7 + 1;
        r4 = r8 + 1;
        r12[r7] = r12[r8];
        r6 = r6 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0553, code lost:
        defpackage.aotd.a(r12, r2, r4, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0556, code lost:
        r0.N += r5;
        r0.x -= r5;
        r0.H += r5;
        r2 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0568, code lost:
        r2 = r0.N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x056c, code lost:
        if (r2 >= r0.X) goto L_0x0594;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x056e, code lost:
        r4 = r0.H;
        r12[r4] = r12[(r4 - r0.W) & r11];
        r0.x--;
        r4 = r4 + r10;
        r0.H = r4;
        r0.N = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0586, code lost:
        if (r4 < r1) goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0588, code lost:
        r2 = 8;
        r0.r = 8;
        r0.q = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0594, code lost:
        r2 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0598, code lost:
        if (r0.q != r2) goto L_0x05a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x059a, code lost:
        r0.q = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (r12 <= 30) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x05a2, code lost:
        throw new defpackage.aosv("Invalid backward reference");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x05a5, code lost:
        r3 = 10;
        r5 = 6;
        r6 = 8;
        r7 = 2;
        r8 = -1;
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b5, code lost:
        r2 = java.lang.Math.min(r0.ad - r0.ae, r0.ag - r0.af);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c3, code lost:
        if (r2 == 0) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c5, code lost:
        java.lang.System.arraycopy(r0.a, r0.af, r0.f, r0.ac + r0.ae, r2);
        r0.ae += r2;
        r0.af += r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e1, code lost:
        if (r0.ae >= r0.ad) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e3, code lost:
        r2 = r0.H;
        r3 = r0.Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e7, code lost:
        if (r2 >= r3) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ea, code lost:
        r0.I = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ec, code lost:
        r3 = r0.aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ee, code lost:
        if (r2 >= r3) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f1, code lost:
        if (r2 > r3) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f4, code lost:
        defpackage.aotd.a(r12, r9, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f8, code lost:
        r0.H &= r11;
        r0.af = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ff, code lost:
        r0.q = r0.r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0109, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x06d5  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x06d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void b(defpackage.aota r29) {
        /*
            r0 = r29
            int r1 = r0.q
            if (r1 == 0) goto L_0x0775
            r2 = 11
            if (r1 == r2) goto L_0x076d
            r3 = 10
            r4 = 3
            r5 = 6
            r6 = 8
            r7 = 2
            r8 = -1
            r9 = 0
            r10 = 1
            if (r1 == r10) goto L_0x0017
            goto L_0x005e
        L_0x0017:
            int r1 = r0.ai
            r0.ai = r9
            defpackage.aost.c(r29)
            int r11 = defpackage.aost.b(r0, r10)
            r12 = 17
            if (r11 == 0) goto L_0x0050
            int r11 = defpackage.aost.b(r0, r4)
            if (r11 == 0) goto L_0x002e
            int r12 = r12 + r11
            goto L_0x0052
        L_0x002e:
            int r11 = defpackage.aost.b(r0, r4)
            if (r11 != 0) goto L_0x0035
            goto L_0x0052
        L_0x0035:
            if (r11 == r10) goto L_0x003a
            int r12 = r11 + 8
            goto L_0x0052
        L_0x003a:
            if (r1 == 0) goto L_0x004e
            r0.ai = r10
            int r1 = defpackage.aost.b(r0, r10)
            if (r1 == r10) goto L_0x004e
            int r12 = defpackage.aost.b(r0, r5)
            if (r12 < r3) goto L_0x004e
            r1 = 30
            if (r12 <= r1) goto L_0x0052
        L_0x004e:
            r12 = -1
            goto L_0x0052
        L_0x0050:
            r12 = 16
        L_0x0052:
            if (r12 == r8) goto L_0x0765
            int r1 = r10 << r12
            r0.Z = r1
            int r1 = r1 + -16
            r0.Y = r1
            r0.q = r7
        L_0x005e:
            int r1 = e(r29)
            int r11 = r0.aa
            int r11 = r11 + r8
            byte[] r12 = r0.a
        L_0x0067:
            int r13 = r0.q
            java.lang.String r14 = "Invalid metablock length"
            if (r13 == r3) goto L_0x0753
            r2 = 256(0x100, float:3.59E-43)
            java.lang.String r4 = "Invalid backward reference"
            r3 = 12
            r15 = 4
            switch(r13) {
                case 2: goto L_0x05e0;
                case 3: goto L_0x021f;
                case 4: goto L_0x021b;
                case 5: goto L_0x0200;
                case 6: goto L_0x01c3;
                case 7: goto L_0x01bf;
                case 8: goto L_0x01b9;
                case 9: goto L_0x010a;
                case 10: goto L_0x0077;
                case 11: goto L_0x0077;
                case 12: goto L_0x00a7;
                case 13: goto L_0x00b5;
                case 14: goto L_0x0090;
                default: goto L_0x0077;
            }
        L_0x0077:
            aosv r0 = new aosv
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 28
            r1.<init>(r2)
            java.lang.String r2 = "Unexpected state "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0090:
            int r2 = r0.H
            int r4 = r0.ak
            int r4 = r0.al
            if (r2 >= r1) goto L_0x00a0
            r0.q = r15
            r3 = 16
            r25 = 6
            goto L_0x05a5
        L_0x00a0:
            r1 = 14
            r0.r = r1
            r0.q = r3
            return
        L_0x00a7:
            int r2 = r0.H
            int r3 = r0.aa
            int r2 = java.lang.Math.min(r2, r3)
            r0.ag = r2
            r2 = 13
            r0.q = r2
        L_0x00b5:
            int r2 = r0.ad
            int r3 = r0.ae
            int r2 = r2 - r3
            int r3 = r0.ag
            int r4 = r0.af
            int r3 = r3 - r4
            int r2 = java.lang.Math.min(r2, r3)
            if (r2 == 0) goto L_0x00dd
            byte[] r3 = r0.a
            int r4 = r0.af
            byte[] r13 = r0.f
            int r14 = r0.ac
            int r15 = r0.ae
            int r14 = r14 + r15
            java.lang.System.arraycopy(r3, r4, r13, r14, r2)
            int r3 = r0.ae
            int r3 = r3 + r2
            r0.ae = r3
            int r3 = r0.af
            int r3 = r3 + r2
            r0.af = r3
        L_0x00dd:
            int r2 = r0.ae
            int r3 = r0.ad
            if (r2 >= r3) goto L_0x0109
            int r2 = r0.H
            int r3 = r0.Y
            if (r2 >= r3) goto L_0x00ea
            goto L_0x00ec
        L_0x00ea:
            r0.I = r3
        L_0x00ec:
            int r3 = r0.aa
            if (r2 >= r3) goto L_0x00f1
            goto L_0x00ff
        L_0x00f1:
            if (r2 > r3) goto L_0x00f4
            goto L_0x00f8
        L_0x00f4:
            defpackage.aotd.a((byte[]) r12, (int) r9, (int) r3, (int) r2)
        L_0x00f8:
            int r2 = r0.H
            r2 = r2 & r11
            r0.H = r2
            r0.af = r9
        L_0x00ff:
            int r2 = r0.r
            r0.q = r2
            r3 = 16
            r25 = 6
            goto L_0x05a5
        L_0x0109:
            return
        L_0x010a:
            int r13 = r0.W
            r14 = 2147483644(0x7ffffffc, float:NaN)
            if (r13 > r14) goto L_0x01b3
            int r14 = r0.I
            int r13 = r13 - r14
            int r13 = r13 + r8
            int r14 = r0.aj
            if (r13 >= 0) goto L_0x013b
            int r1 = -r13
            int r1 = r1 + r8
            int r3 = r0.X
            int r3 = r0.an
            if (r3 != r8) goto L_0x0132
            byte[] r2 = new byte[r2]
            r0.ao = r2
        L_0x0125:
            int r2 = r0.aj
            int r2 = r8 >>> r6
            if (r2 == 0) goto L_0x012e
            int r6 = r6 + 1
            goto L_0x0125
        L_0x012e:
            int r3 = r6 + -8
            r0.an = r3
        L_0x0132:
            byte[] r2 = r0.ao
            int r1 = r1 >>> r3
            byte r1 = r2[r1]
            int[] r0 = r0.am
            r0 = 0
            throw r0
        L_0x013b:
            java.nio.ByteBuffer r2 = com.google.compression.brotli.dec.Dictionary.a
            if (r2 == 0) goto L_0x0144
            java.nio.ByteBuffer r2 = com.google.compression.brotli.dec.Dictionary.a
            r19 = r2
            goto L_0x014c
        L_0x0144:
            boolean r2 = defpackage.aosy.a
            if (r2 == 0) goto L_0x01ab
            java.nio.ByteBuffer r2 = com.google.compression.brotli.dec.Dictionary.a
            r19 = r2
        L_0x014c:
            int r2 = r0.X
            r14 = 31
            if (r2 > r14) goto L_0x01a5
            int[] r14 = com.google.compression.brotli.dec.Dictionary.c
            r14 = r14[r2]
            if (r14 == 0) goto L_0x019f
            int r9 = r13 >>> r14
            int[] r17 = com.google.compression.brotli.dec.Dictionary.b
            r17 = r17[r2]
            int r14 = r10 << r14
            int r14 = r14 + r8
            r13 = r13 & r14
            int r13 = r13 * r2
            int r20 = r17 + r13
            aotb r13 = defpackage.aotc.a
            int r14 = r13.a
            r14 = 121(0x79, float:1.7E-43)
            if (r9 >= r14) goto L_0x0199
            byte[] r4 = r0.a
            int r14 = r0.H
            r17 = r4
            r18 = r14
            r21 = r2
            r22 = r13
            r23 = r9
            int r2 = defpackage.aotc.a(r17, r18, r19, r20, r21, r22, r23)
            int r4 = r0.H
            int r4 = r4 + r2
            r0.H = r4
            int r9 = r0.x
            int r9 = r9 - r2
            r0.x = r9
            if (r4 < r1) goto L_0x0191
            r0.r = r15
            r0.q = r3
            goto L_0x0193
        L_0x0191:
            r0.q = r15
        L_0x0193:
            r3 = 16
            r25 = 6
            goto L_0x05a5
        L_0x0199:
            aosv r0 = new aosv
            r0.<init>(r4)
            throw r0
        L_0x019f:
            aosv r0 = new aosv
            r0.<init>(r4)
            throw r0
        L_0x01a5:
            aosv r0 = new aosv
            r0.<init>(r4)
            throw r0
        L_0x01ab:
            aosv r0 = new aosv
            java.lang.String r1 = "brotli dictionary is not set"
            r0.<init>(r1)
            throw r0
        L_0x01b3:
            aosv r0 = new aosv
            r0.<init>(r4)
            throw r0
        L_0x01b9:
            r3 = 16
            r25 = 6
            goto L_0x050d
        L_0x01bf:
            r25 = 6
            goto L_0x039f
        L_0x01c3:
            byte[] r2 = r0.a
            int r4 = r0.x
            if (r4 > 0) goto L_0x01d4
            defpackage.aost.g(r29)
            r0.q = r7
            r3 = 16
            r25 = 6
            goto L_0x05a5
        L_0x01d4:
            int r9 = r0.aa
            int r13 = r0.H
            int r9 = r9 - r13
            int r4 = java.lang.Math.min(r9, r4)
            int r9 = r0.H
            defpackage.aost.a(r0, r2, r9, r4)
            int r2 = r0.x
            int r2 = r2 - r4
            r0.x = r2
            int r2 = r0.H
            int r2 = r2 + r4
            r0.H = r2
            int r4 = r0.aa
            if (r2 == r4) goto L_0x01f6
            defpackage.aost.g(r29)
            r0.q = r7
            goto L_0x01fa
        L_0x01f6:
            r0.r = r5
            r0.q = r3
        L_0x01fa:
            r3 = 16
            r25 = 6
            goto L_0x05a5
        L_0x0200:
            int r2 = r0.x
            if (r2 <= 0) goto L_0x0213
            defpackage.aost.a(r29)
            defpackage.aost.c(r29)
            defpackage.aost.b(r0, r6)
            int r2 = r0.x
            int r2 = r2 + r8
            r0.x = r2
            goto L_0x0200
        L_0x0213:
            r0.q = r7
            r3 = 16
            r25 = 6
            goto L_0x05a5
        L_0x021b:
            r25 = 6
            goto L_0x033b
        L_0x021f:
            int r9 = c(r29)
            int r9 = r9 + r10
            r0.C = r9
            r13 = 0
            int r9 = b((defpackage.aota) r0, (int) r13, (int) r9)
            r0.B = r9
            int r9 = c(r29)
            int r9 = r9 + r10
            r0.E = r9
            int r9 = b((defpackage.aota) r0, (int) r10, (int) r9)
            r0.D = r9
            int r9 = c(r29)
            int r9 = r9 + r10
            r0.G = r9
            int r9 = b((defpackage.aota) r0, (int) r7, (int) r9)
            r0.F = r9
            defpackage.aost.a(r29)
            defpackage.aost.c(r29)
            int r9 = defpackage.aost.b(r0, r7)
            r0.V = r9
            int r9 = defpackage.aost.b(r0, r15)
            int r13 = r0.V
            int r9 = r9 << r13
            r0.U = r9
            int r9 = r0.C
            byte[] r9 = new byte[r9]
            r0.b = r9
            r9 = 0
        L_0x0263:
            int r13 = r0.C
            if (r9 >= r13) goto L_0x0286
            int r14 = r9 + 96
            int r13 = java.lang.Math.min(r14, r13)
        L_0x026d:
            if (r9 >= r13) goto L_0x0280
            defpackage.aost.c(r29)
            byte[] r14 = r0.b
            int r3 = defpackage.aost.b(r0, r7)
            byte r3 = (byte) r3
            r14[r9] = r3
            int r9 = r9 + 1
            r3 = 12
            goto L_0x026d
        L_0x0280:
            defpackage.aost.a(r29)
            r3 = 12
            goto L_0x0263
        L_0x0286:
            int r3 = r13 << 6
            byte[] r9 = new byte[r3]
            r0.c = r9
            byte[] r9 = r0.c
            int r3 = a((int) r3, (byte[]) r9, (defpackage.aota) r0)
            r0.K = r10
            r9 = 0
        L_0x0295:
            int r13 = r0.C
            int r13 = r13 << r5
            if (r9 >= r13) goto L_0x02a8
            byte[] r13 = r0.c
            byte r13 = r13[r9]
            int r14 = r9 >> 6
            if (r13 != r14) goto L_0x02a5
            int r9 = r9 + 1
            goto L_0x0295
        L_0x02a5:
            r9 = 0
            r0.K = r9
        L_0x02a8:
            int r9 = r0.G
            int r9 = r9 << r7
            byte[] r13 = new byte[r9]
            r0.d = r13
            byte[] r13 = r0.d
            int r9 = a((int) r9, (byte[]) r13, (defpackage.aota) r0)
            int[] r3 = a(r2, r2, r3, r0)
            r0.l = r3
            int r3 = r0.E
            r13 = 704(0x2c0, float:9.87E-43)
            int[] r3 = a(r13, r13, r3, r0)
            r0.m = r3
            int r3 = r0.V
            int r13 = r0.U
            r14 = 24
            int r3 = a((int) r3, (int) r13, (int) r14)
            int r13 = r0.ai
            if (r13 != r10) goto L_0x02e6
            int r3 = r0.V
            int r13 = r0.U
            r14 = 62
            int r3 = a((int) r3, (int) r13, (int) r14)
            int r13 = r0.V
            int r14 = r0.U
            int r13 = a((int) r13, (int) r14)
            goto L_0x02e7
        L_0x02e6:
            r13 = r3
        L_0x02e7:
            int[] r3 = a(r3, r13, r9, r0)
            r0.n = r3
            byte[] r3 = r0.e
            int[] r9 = r0.o
            int r14 = r0.V
            int r8 = r0.U
            int r7 = r10 << r14
            r6 = 0
            r25 = 16
        L_0x02fa:
            if (r6 >= r8) goto L_0x0307
            r24 = 0
            r3[r25] = r24
            int r6 = r6 + 1
            r9[r25] = r6
            int r25 = r25 + 1
            goto L_0x02fa
        L_0x0307:
            r5 = r25
            r6 = 0
            r26 = 1
        L_0x030c:
            if (r5 < r13) goto L_0x05b0
            r3 = 0
            r0.P = r3
            r0.Q = r3
            byte[] r5 = r0.b
            byte r5 = r5[r3]
            int r5 = r5 * 512
            r0.R = r5
            int r5 = r5 + r2
            r0.S = r5
            r0.L = r3
            r0.M = r3
            int[] r2 = r0.j
            r2[r15] = r10
            r19 = 5
            r2[r19] = r3
            r25 = 6
            r2[r25] = r10
            r5 = 7
            r2[r5] = r3
            r5 = 8
            r2[r5] = r10
            r5 = 9
            r2[r5] = r3
            r0.q = r15
        L_0x033b:
            int r2 = r0.x
            if (r2 > 0) goto L_0x0346
            r2 = 2
            r0.q = r2
            r3 = 16
            goto L_0x05a5
        L_0x0346:
            defpackage.aost.a(r29)
            int r2 = r0.D
            if (r2 != 0) goto L_0x035c
            int r2 = r0.E
            int r2 = a((defpackage.aota) r0, (int) r10, (int) r2)
            r0.D = r2
            int[] r3 = r0.j
            r5 = 7
            r3 = r3[r5]
            r0.M = r3
        L_0x035c:
            r3 = -1
            int r2 = r2 + r3
            r0.D = r2
            defpackage.aost.c(r29)
            int[] r2 = r0.m
            int r3 = r0.M
            int r2 = a((int[]) r2, (int) r3, (defpackage.aota) r0)
            r3 = 2
            int r2 = r2 << r3
            short[] r3 = f
            short r5 = r3[r2]
            int r6 = r2 + 1
            short r6 = r3[r6]
            int r7 = r2 + 2
            short r7 = r3[r7]
            r8 = 3
            int r2 = r2 + r8
            short r2 = r3[r2]
            r0.T = r2
            defpackage.aost.c(r29)
            r2 = r5 & 255(0xff, float:3.57E-43)
            int r2 = defpackage.aost.c(r0, r2)
            int r6 = r6 + r2
            r0.O = r6
            defpackage.aost.c(r29)
            r2 = 8
            int r3 = r5 >> 8
            int r2 = defpackage.aost.c(r0, r3)
            int r7 = r7 + r2
            r0.X = r7
            r2 = 0
            r0.N = r2
            r2 = 7
            r0.q = r2
        L_0x039f:
            int r2 = r0.K
            if (r2 == 0) goto L_0x03e0
        L_0x03a3:
            int r2 = r0.N
            int r3 = r0.O
            if (r2 >= r3) goto L_0x03de
            defpackage.aost.a(r29)
            int r2 = r0.B
            if (r2 != 0) goto L_0x03b3
            d(r29)
        L_0x03b3:
            int r2 = r0.B
            r3 = -1
            int r2 = r2 + r3
            r0.B = r2
            defpackage.aost.c(r29)
            int r2 = r0.H
            int[] r3 = r0.l
            int r5 = r0.L
            int r3 = a((int[]) r3, (int) r5, (defpackage.aota) r0)
            byte r3 = (byte) r3
            r12[r2] = r3
            int r2 = r0.H
            int r2 = r2 + r10
            r0.H = r2
            int r3 = r0.N
            int r3 = r3 + r10
            r0.N = r3
            if (r2 < r1) goto L_0x03a3
            r2 = 7
            r0.r = r2
            r2 = 12
            r0.q = r2
            r2 = 7
            goto L_0x0445
        L_0x03de:
            r2 = 7
            goto L_0x0445
        L_0x03e0:
            int r2 = r0.H
            int r3 = r2 + -1
            r3 = r3 & r11
            byte r3 = r12[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 + -2
            r2 = r2 & r11
            byte r2 = r12[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L_0x03f0:
            int r5 = r0.N
            int r6 = r0.O
            if (r5 >= r6) goto L_0x0444
            defpackage.aost.a(r29)
            int r5 = r0.B
            if (r5 != 0) goto L_0x0400
            d(r29)
        L_0x0400:
            int[] r5 = defpackage.aosw.a
            int r6 = r0.R
            int r6 = r6 + r3
            r5 = r5[r6]
            int[] r6 = defpackage.aosw.a
            int r7 = r0.S
            int r7 = r7 + r2
            r2 = r6[r7]
            byte[] r6 = r0.c
            int r7 = r0.P
            r2 = r2 | r5
            int r7 = r7 + r2
            byte r2 = r6[r7]
            int r5 = r0.B
            r6 = -1
            int r5 = r5 + r6
            r0.B = r5
            defpackage.aost.c(r29)
            int[] r5 = r0.l
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = a((int[]) r5, (int) r2, (defpackage.aota) r0)
            int r5 = r0.H
            byte r6 = (byte) r2
            r12[r5] = r6
            int r5 = r5 + r10
            r0.H = r5
            int r6 = r0.N
            int r6 = r6 + r10
            r0.N = r6
            if (r5 >= r1) goto L_0x043c
            r28 = r3
            r3 = r2
            r2 = r28
            goto L_0x03f0
        L_0x043c:
            r2 = 7
            r0.r = r2
            r3 = 12
            r0.q = r3
            goto L_0x0445
        L_0x0444:
            r2 = 7
        L_0x0445:
            int r3 = r0.q
            if (r3 != r2) goto L_0x05a3
            int r2 = r0.x
            int r3 = r0.O
            int r2 = r2 - r3
            r0.x = r2
            if (r2 > 0) goto L_0x0458
            r0.q = r15
            r3 = 16
            goto L_0x05a5
        L_0x0458:
            int r2 = r0.T
            if (r2 >= 0) goto L_0x0468
            int[] r3 = r0.j
            int r5 = r0.J
            r3 = r3[r5]
            r0.W = r3
            r5 = r3
            r3 = 16
            goto L_0x04db
        L_0x0468:
            defpackage.aost.a(r29)
            int r3 = r0.F
            if (r3 != 0) goto L_0x0481
            int r3 = r0.G
            r5 = 2
            int r3 = a((defpackage.aota) r0, (int) r5, (int) r3)
            r0.F = r3
            int[] r6 = r0.j
            r7 = 9
            r6 = r6[r7]
            int r6 = r6 << r5
            r0.Q = r6
        L_0x0481:
            r5 = -1
            int r3 = r3 + r5
            r0.F = r3
            defpackage.aost.c(r29)
            byte[] r3 = r0.d
            int r5 = r0.Q
            int r5 = r5 + r2
            byte r2 = r3[r5]
            int[] r3 = r0.n
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = a((int[]) r3, (int) r2, (defpackage.aota) r0)
            r3 = 16
            if (r2 >= r3) goto L_0x04ba
            int r5 = r0.J
            int[] r6 = h
            r6 = r6[r2]
            int[] r7 = r0.j
            int r5 = r5 + r6
            r6 = 3
            r5 = r5 & r6
            r5 = r7[r5]
            int[] r6 = i
            r6 = r6[r2]
            int r5 = r5 + r6
            r0.W = r5
            if (r5 < 0) goto L_0x04b2
            goto L_0x04db
        L_0x04b2:
            aosv r0 = new aosv
            java.lang.String r1 = "Negative distance"
            r0.<init>(r1)
            throw r0
        L_0x04ba:
            byte[] r5 = r0.e
            byte r5 = r5[r2]
            int r6 = r0.t
            int r6 = r6 + r5
            int r7 = defpackage.aost.a
            if (r6 > r7) goto L_0x04ca
            int r5 = defpackage.aost.b(r0, r5)
            goto L_0x04d1
        L_0x04ca:
            defpackage.aost.c(r29)
            int r5 = defpackage.aost.c(r0, r5)
        L_0x04d1:
            int[] r6 = r0.o
            r6 = r6[r2]
            int r7 = r0.V
            int r5 = r5 << r7
            int r5 = r5 + r6
            r0.W = r5
        L_0x04db:
            int r6 = r0.I
            int r7 = r0.Y
            if (r6 == r7) goto L_0x04e9
            int r6 = r0.H
            if (r6 >= r7) goto L_0x04e9
            r0.I = r6
            r7 = r6
            goto L_0x04eb
        L_0x04e9:
            r0.I = r7
        L_0x04eb:
            if (r5 <= r7) goto L_0x04f3
            r2 = 9
            r0.q = r2
            goto L_0x05a5
        L_0x04f3:
            if (r2 <= 0) goto L_0x0500
            int r2 = r0.J
            int r2 = r2 + r10
            r6 = 3
            r2 = r2 & r6
            r0.J = r2
            int[] r6 = r0.j
            r6[r2] = r5
        L_0x0500:
            int r2 = r0.X
            int r5 = r0.x
            if (r2 > r5) goto L_0x059d
            r2 = 0
            r0.N = r2
            r2 = 8
            r0.q = r2
        L_0x050d:
            int r2 = r0.H
            int r4 = r0.W
            int r4 = r2 - r4
            r4 = r4 & r11
            int r5 = r0.X
            int r6 = r0.N
            int r5 = r5 - r6
            int r6 = r4 + r5
            int r7 = r2 + r5
            if (r6 < r11) goto L_0x0520
            goto L_0x0568
        L_0x0520:
            if (r7 >= r11) goto L_0x0568
            r8 = 12
            if (r5 >= r8) goto L_0x0528
            r6 = 0
            goto L_0x052e
        L_0x0528:
            if (r6 > r2) goto L_0x052b
            goto L_0x0553
        L_0x052b:
            if (r7 <= r4) goto L_0x0553
            r6 = 0
        L_0x052e:
            if (r6 >= r5) goto L_0x0556
            int r7 = r2 + 1
            int r8 = r4 + 1
            byte r4 = r12[r4]
            r12[r2] = r4
            int r2 = r7 + 1
            int r4 = r8 + 1
            byte r8 = r12[r8]
            r12[r7] = r8
            int r7 = r2 + 1
            int r8 = r4 + 1
            byte r4 = r12[r4]
            r12[r2] = r4
            int r2 = r7 + 1
            int r4 = r8 + 1
            byte r8 = r12[r8]
            r12[r7] = r8
            int r6 = r6 + 4
            goto L_0x052e
        L_0x0553:
            defpackage.aotd.a((byte[]) r12, (int) r2, (int) r4, (int) r6)
        L_0x0556:
            int r2 = r0.N
            int r2 = r2 + r5
            r0.N = r2
            int r2 = r0.x
            int r2 = r2 - r5
            r0.x = r2
            int r2 = r0.H
            int r2 = r2 + r5
            r0.H = r2
            r2 = 8
            goto L_0x0596
        L_0x0568:
            int r2 = r0.N
            int r4 = r0.X
            if (r2 >= r4) goto L_0x0594
            int r4 = r0.H
            int r5 = r0.W
            int r5 = r4 - r5
            r5 = r5 & r11
            byte r5 = r12[r5]
            r12[r4] = r5
            int r5 = r0.x
            r6 = -1
            int r5 = r5 + r6
            r0.x = r5
            int r4 = r4 + r10
            r0.H = r4
            int r2 = r2 + 1
            r0.N = r2
            if (r4 < r1) goto L_0x0591
            r2 = 8
            r0.r = r2
            r4 = 12
            r0.q = r4
            goto L_0x0596
        L_0x0591:
            r2 = 8
            goto L_0x0568
        L_0x0594:
            r2 = 8
        L_0x0596:
            int r4 = r0.q
            if (r4 != r2) goto L_0x05a5
            r0.q = r15
            goto L_0x05a5
        L_0x059d:
            aosv r0 = new aosv
            r0.<init>(r4)
            throw r0
        L_0x05a3:
            r3 = 16
        L_0x05a5:
            r3 = 10
            r4 = 3
            r5 = 6
            r6 = 8
            r7 = 2
            r8 = -1
            r9 = 0
            goto L_0x0067
        L_0x05b0:
            r16 = 9
            r17 = 16
            r19 = 5
            r25 = 6
            int r27 = r6 + 2
            r2 = r26
            int r26 = r27 << r2
            int r26 = r26 + -4
            int r26 = r26 << r14
            int r26 = r8 + r26
            int r26 = r26 + 1
            r15 = 0
        L_0x05c7:
            if (r15 >= r7) goto L_0x05d6
            byte r10 = (byte) r2
            r3[r5] = r10
            int r10 = r26 + r15
            r9[r5] = r10
            int r5 = r5 + 1
            int r15 = r15 + 1
            r10 = 1
            goto L_0x05c7
        L_0x05d6:
            int r26 = r2 + r6
            r6 = r6 ^ 1
            r2 = 256(0x100, float:3.59E-43)
            r10 = 1
            r15 = 4
            goto L_0x030c
        L_0x05e0:
            r17 = 16
            r19 = 5
            r25 = 6
            int r1 = r0.x
            if (r1 < 0) goto L_0x074d
            int r1 = r0.y
            if (r1 != 0) goto L_0x0729
            r1 = 0
            int[] r2 = new int[r1]
            r0.l = r2
            int[] r2 = new int[r1]
            r0.m = r2
            int[] r2 = new int[r1]
            r0.n = r2
            defpackage.aost.a(r29)
            defpackage.aost.c(r29)
            r2 = 1
            int r3 = defpackage.aost.b(r0, r2)
            r0.y = r3
            r0.x = r1
            r0.z = r1
            r0.A = r1
            if (r3 == 0) goto L_0x061c
            int r1 = defpackage.aost.b(r0, r2)
            if (r1 != 0) goto L_0x0617
            goto L_0x061c
        L_0x0617:
            r1 = 2
            r3 = 8
            goto L_0x06a9
        L_0x061c:
            r1 = 2
            int r2 = defpackage.aost.b(r0, r1)
            r3 = 4
            int r2 = r2 + r3
            r3 = 7
            if (r2 != r3) goto L_0x066f
            r2 = 1
            r0.A = r2
            int r3 = defpackage.aost.b(r0, r2)
            if (r3 != 0) goto L_0x0667
            int r2 = defpackage.aost.b(r0, r1)
            if (r2 != 0) goto L_0x063a
            r3 = 8
            goto L_0x06a9
        L_0x063a:
            r13 = 0
        L_0x063b:
            if (r13 < r2) goto L_0x0640
            r3 = 8
            goto L_0x0699
        L_0x0640:
            defpackage.aost.c(r29)
            r3 = 8
            int r4 = defpackage.aost.b(r0, r3)
            if (r4 == 0) goto L_0x064c
            goto L_0x065c
        L_0x064c:
            int r5 = r13 + 1
            if (r5 != r2) goto L_0x065c
            r5 = 1
            if (r2 > r5) goto L_0x0654
            goto L_0x065c
        L_0x0654:
            aosv r0 = new aosv
            java.lang.String r1 = "Exuberant nibble"
            r0.<init>(r1)
            throw r0
        L_0x065c:
            int r5 = r0.x
            int r6 = r13 * 8
            int r4 = r4 << r6
            r4 = r4 | r5
            r0.x = r4
            int r13 = r13 + 1
            goto L_0x063b
        L_0x0667:
            aosv r0 = new aosv
            java.lang.String r1 = "Corrupted reserved bit"
            r0.<init>(r1)
            throw r0
        L_0x066f:
            r3 = 8
            r13 = 0
        L_0x0672:
            if (r13 >= r2) goto L_0x0699
            defpackage.aost.c(r29)
            r4 = 4
            int r5 = defpackage.aost.b(r0, r4)
            if (r5 == 0) goto L_0x067f
            goto L_0x068e
        L_0x067f:
            int r6 = r13 + 1
            if (r6 != r2) goto L_0x068e
            if (r2 > r4) goto L_0x0686
            goto L_0x068e
        L_0x0686:
            aosv r0 = new aosv
            java.lang.String r1 = "Exuberant nibble"
            r0.<init>(r1)
            throw r0
        L_0x068e:
            int r6 = r0.x
            int r7 = r13 * 4
            int r5 = r5 << r7
            r5 = r5 | r6
            r0.x = r5
            int r13 = r13 + 1
            goto L_0x0672
        L_0x0699:
            int r2 = r0.x
            r4 = 1
            int r2 = r2 + r4
            r0.x = r2
            int r2 = r0.y
            if (r2 != 0) goto L_0x06a9
            int r2 = defpackage.aost.b(r0, r4)
            r0.z = r2
        L_0x06a9:
            int r2 = r0.x
            if (r2 != 0) goto L_0x06b8
            int r2 = r0.A
            if (r2 == 0) goto L_0x06b2
            goto L_0x06b8
        L_0x06b2:
            r2 = 10
            r4 = 3
            r8 = 0
            goto L_0x0736
        L_0x06b8:
            int r2 = r0.z
            if (r2 != 0) goto L_0x06c6
            int r2 = r0.A
            if (r2 == 0) goto L_0x06c2
            r4 = 3
            goto L_0x06c7
        L_0x06c2:
            r4 = 3
            r0.q = r4
            goto L_0x06d3
        L_0x06c6:
            r4 = 3
        L_0x06c7:
            defpackage.aost.h(r29)
            int r2 = r0.A
            if (r2 != 0) goto L_0x06d0
            r15 = 6
            goto L_0x06d1
        L_0x06d0:
            r15 = 5
        L_0x06d1:
            r0.q = r15
        L_0x06d3:
            if (r2 == 0) goto L_0x06d9
            r2 = 10
            r8 = 0
            goto L_0x0736
        L_0x06d9:
            int r2 = r0.ab
            int r5 = r0.x
            int r2 = r2 + r5
            r0.ab = r2
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 > r5) goto L_0x06e5
            goto L_0x06e9
        L_0x06e5:
            r0.ab = r5
            r2 = 1073741824(0x40000000, float:2.0)
        L_0x06e9:
            int r5 = r0.aa
            int r6 = r0.Z
            if (r5 >= r6) goto L_0x0725
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r6 <= r2) goto L_0x0706
        L_0x06f3:
            int r7 = r6 >> 1
            if (r7 > r2) goto L_0x0704
            int r2 = r0.y
            if (r2 != 0) goto L_0x0706
            if (r6 >= r5) goto L_0x0706
            int r2 = r0.Z
            if (r2 < r5) goto L_0x0706
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0707
        L_0x0704:
            r6 = r7
            goto L_0x06f3
        L_0x0706:
        L_0x0707:
            int r2 = r0.aa
            if (r6 <= r2) goto L_0x0721
            int r5 = r6 + 37
            byte[] r5 = new byte[r5]
            byte[] r7 = r0.a
            int r8 = r7.length
            if (r8 != 0) goto L_0x0716
            r8 = 0
            goto L_0x071a
        L_0x0716:
            r8 = 0
            java.lang.System.arraycopy(r7, r8, r5, r8, r2)
        L_0x071a:
            r0.a = r5
            r0.aa = r6
            r2 = 10
            goto L_0x0736
        L_0x0721:
            r8 = 0
            r2 = 10
            goto L_0x0736
        L_0x0725:
            r8 = 0
            r2 = 10
            goto L_0x0736
        L_0x0729:
            r1 = 2
            r3 = 8
            r4 = 3
            r8 = 0
            r2 = 10
            r0.r = r2
            r5 = 12
            r0.q = r5
        L_0x0736:
            int r5 = e(r29)
            int r6 = r0.aa
            r7 = -1
            int r11 = r6 + -1
            byte[] r12 = r0.a
            r1 = r5
            r3 = 10
            r5 = 6
            r6 = 8
            r7 = 2
            r8 = -1
            r9 = 0
            r10 = 1
            goto L_0x0067
        L_0x074d:
            aosv r0 = new aosv
            r0.<init>(r14)
            throw r0
        L_0x0753:
            int r1 = r0.x
            if (r1 < 0) goto L_0x075f
            defpackage.aost.h(r29)
            r1 = 1
            defpackage.aost.a(r0, r1)
            return
        L_0x075f:
            aosv r0 = new aosv
            r0.<init>(r14)
            throw r0
        L_0x0765:
            aosv r0 = new aosv
            java.lang.String r1 = "Invalid 'windowBits' code"
            r0.<init>(r1)
            throw r0
        L_0x076d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't decompress after close"
            r0.<init>(r1)
            throw r0
        L_0x0775:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't decompress until initialized"
            r0.<init>(r1)
            goto L_0x077e
        L_0x077d:
            throw r0
        L_0x077e:
            goto L_0x077d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aosx.b(aota):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(int r9, byte[] r10, defpackage.aota r11) {
        /*
            defpackage.aost.a(r11)
            int r0 = c(r11)
            r1 = 1
            int r0 = r0 + r1
            r2 = 0
            if (r0 == r1) goto L_0x009d
            defpackage.aost.c(r11)
            int r3 = defpackage.aost.b(r11, r1)
            if (r3 == 0) goto L_0x001c
            r3 = 4
            int r3 = defpackage.aost.b(r11, r3)
            int r3 = r3 + r1
            goto L_0x001d
        L_0x001c:
            r3 = 0
        L_0x001d:
            int r4 = r0 + r3
            int[] r5 = a
            int r6 = r4 + 31
            int r6 = r6 >> 5
            r5 = r5[r6]
            int r5 = r5 + r1
            int[] r6 = new int[r5]
            int r5 = r5 + -1
            a(r4, r4, r6, r5, r11)
            r4 = 0
        L_0x0030:
            if (r4 >= r9) goto L_0x0069
            defpackage.aost.a(r11)
            defpackage.aost.c(r11)
            int r7 = a((int[]) r6, (int) r5, (defpackage.aota) r11)
            if (r7 != 0) goto L_0x0043
            r10[r4] = r2
            int r4 = r4 + 1
            goto L_0x0030
        L_0x0043:
            if (r7 > r3) goto L_0x0062
            defpackage.aost.c(r11)
            int r8 = r1 << r7
            int r7 = defpackage.aost.b(r11, r7)
            int r8 = r8 + r7
        L_0x004f:
            if (r8 == 0) goto L_0x0030
            if (r4 >= r9) goto L_0x005a
            r10[r4] = r2
            int r4 = r4 + 1
            int r8 = r8 + -1
            goto L_0x004f
        L_0x005a:
            aosv r9 = new aosv
            java.lang.String r10 = "Corrupted context map"
            r9.<init>(r10)
            throw r9
        L_0x0062:
            int r7 = r7 - r3
            byte r7 = (byte) r7
            r10[r4] = r7
            int r4 = r4 + 1
            goto L_0x0030
        L_0x0069:
            defpackage.aost.c(r11)
            int r11 = defpackage.aost.b(r11, r1)
            if (r11 != r1) goto L_0x009c
            r11 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r11]
            r3 = 0
        L_0x0077:
            if (r3 >= r11) goto L_0x007e
            r1[r3] = r3
            int r3 = r3 + 1
            goto L_0x0077
        L_0x007e:
            r11 = 0
        L_0x007f:
            if (r11 >= r9) goto L_0x009c
            byte r3 = r10[r11]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = r1[r3]
            byte r5 = (byte) r4
            r10[r11] = r5
            if (r3 != 0) goto L_0x008d
            goto L_0x0099
        L_0x008d:
            if (r3 <= 0) goto L_0x0097
            int r5 = r3 + -1
            r6 = r1[r5]
            r1[r3] = r6
            r3 = r5
            goto L_0x008d
        L_0x0097:
            r1[r2] = r4
        L_0x0099:
            int r11 = r11 + 1
            goto L_0x007f
        L_0x009c:
            return r0
        L_0x009d:
            r11 = 0
        L_0x009e:
            if (r11 >= r9) goto L_0x00ae
            int r0 = r11 + 1024
            int r0 = java.lang.Math.min(r0, r9)
            int r0 = r0 - r11
            byte[] r3 = defpackage.aotd.a
            java.lang.System.arraycopy(r3, r2, r10, r11, r0)
            int r11 = r11 + r0
            goto L_0x009e
        L_0x00ae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aosx.a(int, byte[], aota):int");
    }

    private static int a(aota aota, int i2, int i3) {
        int i4;
        int[] iArr = aota.j;
        int i5 = i2 + i2;
        int i6 = i5 + 4;
        aost.c(aota);
        int a2 = a(aota.k, i5, aota);
        int b2 = b(aota.k, i5 + 1, aota);
        if (a2 == 1) {
            i4 = iArr[i6 + 1] + 1;
        } else if (a2 != 0) {
            i4 = a2 - 2;
        } else {
            i4 = iArr[i6];
        }
        if (i4 >= i3) {
            i4 -= i3;
        }
        int i7 = i6 + 1;
        iArr[i6] = iArr[i7];
        iArr[i7] = i4;
        return b2;
    }

    private static int a(int[] iArr, int i2, aota aota) {
        int i3 = iArr[i2];
        int e2 = aost.e(aota);
        int i4 = i3 + (e2 & 255);
        int i5 = iArr[i4];
        int i6 = i5 >> 16;
        char c2 = (char) i5;
        if (i6 <= 8) {
            aota.t += i6;
            return c2;
        }
        int i7 = aota.t;
        int i8 = iArr[i4 + c2 + ((e2 & ((1 << i6) - 1)) >>> 8)];
        aota.t = i7 + (i8 >> 16) + 8;
        return (char) i8;
    }

    static void a(aota aota) {
        int i2 = aota.q;
        if (i2 == 0) {
            throw new IllegalStateException("State MUST be initialized");
        } else if (i2 != 11) {
            aota.q = 11;
            InputStream inputStream = aota.ap;
            if (inputStream != null) {
                inputStream.close();
                aota.ap = null;
            }
        }
    }

    static void a(aota aota, InputStream inputStream) {
        if (aota.q == 0) {
            aota.k = new int[3091];
            aota.k[0] = 7;
            aota.J = 3;
            int a2 = a(3, 120);
            aota.e = new byte[a2];
            aota.o = new int[a2];
            aota.ap = inputStream;
            aost.f(aota);
            aota.q = 1;
            return;
        }
        throw new IllegalStateException("State MUST be uninitialized");
    }

    private static int[] a(int i2, int i3, int i4, aota aota) {
        int[] iArr = new int[((a[(i3 + 31) >> 5] * i4) + i4)];
        int i5 = i4;
        for (int i6 = 0; i6 < i4; i6++) {
            iArr[i6] = i5;
            i5 += a(i2, i3, iArr, i6, aota);
        }
        return iArr;
    }
}
