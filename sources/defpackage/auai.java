package defpackage;

/* renamed from: auai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class auai {
    static int a(int i, byte[] bArr, int i2, int i3, auah auah) {
        if (aufy.b(i) != 0) {
            int a = aufy.a(i);
            if (a == 0) {
                return b(bArr, i2, auah);
            }
            if (a == 1) {
                return i2 + 8;
            }
            if (a == 2) {
                return a(bArr, i2, auah) + auah.a;
            }
            if (a == 3) {
                int i4 = (i & -8) | 4;
                int i5 = 0;
                while (i2 < i3) {
                    i2 = a(bArr, i2, auah);
                    i5 = auah.a;
                    if (i5 == i4) {
                        break;
                    }
                    i2 = a(i5, bArr, i2, i3, auah);
                }
                if (i2 <= i3 && i5 == i4) {
                    return i2;
                }
                throw auda.h();
            } else if (a == 5) {
                return i2 + 4;
            } else {
                throw auda.d();
            }
        } else {
            throw auda.d();
        }
    }

    static int b(byte[] bArr, int i, auah auah) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j < 0) {
            int i3 = i2 + 1;
            byte b = bArr[i2];
            long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
            int i4 = 7;
            while (b < 0) {
                int i5 = i3 + 1;
                byte b2 = bArr[i3];
                i4 += 7;
                j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
                int i6 = i5;
                b = b2;
                i3 = i6;
            }
            auah.b = j2;
            return i3;
        }
        auah.b = j;
        return i2;
    }

    static double c(byte[] bArr, int i) {
        return Double.longBitsToDouble(b(bArr, i));
    }

    static float d(byte[] bArr, int i) {
        return Float.intBitsToFloat(a(bArr, i));
    }

    static int e(byte[] bArr, int i, auah auah) {
        int a = a(bArr, i, auah);
        int i2 = auah.a;
        if (i2 < 0) {
            throw auda.b();
        } else if (i2 > bArr.length - a) {
            throw auda.a();
        } else if (i2 != 0) {
            auah.c = auay.a(bArr, a, i2);
            return a + i2;
        } else {
            auah.c = auay.b;
            return a;
        }
    }

    static int c(byte[] bArr, int i, auah auah) {
        int a = a(bArr, i, auah);
        int i2 = auah.a;
        if (i2 < 0) {
            throw auda.b();
        } else if (i2 != 0) {
            auah.c = new String(bArr, a, i2, aucy.a);
            return a + i2;
        } else {
            auah.c = "";
            return a;
        }
    }

    static int d(byte[] bArr, int i, auah auah) {
        int a = a(bArr, i, auah);
        int i2 = auah.a;
        if (i2 < 0) {
            throw auda.b();
        } else if (i2 != 0) {
            auah.c = aufv.c(bArr, a, i2);
            return a + i2;
        } else {
            auah.c = "";
            return a;
        }
    }

    static long b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    static int a(int i, byte[] bArr, int i2, int i3, aucx aucx, auah auah) {
        aucl aucl = (aucl) aucx;
        int a = a(bArr, i2, auah);
        aucl.d(auah.a);
        while (a < i3) {
            int a2 = a(bArr, a, auah);
            if (i != auah.a) {
                break;
            }
            a = a(bArr, a2, auah);
            aucl.d(auah.a);
        }
        return a;
    }

    static int a(int i, byte[] bArr, int i2, int i3, aufg aufg, auah auah) {
        if (aufy.b(i) != 0) {
            int a = aufy.a(i);
            if (a == 0) {
                int b = b(bArr, i2, auah);
                aufg.a(i, (Object) Long.valueOf(auah.b));
                return b;
            } else if (a == 1) {
                aufg.a(i, (Object) Long.valueOf(b(bArr, i2)));
                return i2 + 8;
            } else if (a == 2) {
                int a2 = a(bArr, i2, auah);
                int i4 = auah.a;
                if (i4 < 0) {
                    throw auda.b();
                } else if (i4 <= bArr.length - a2) {
                    if (i4 != 0) {
                        aufg.a(i, (Object) auay.a(bArr, a2, i4));
                    } else {
                        aufg.a(i, (Object) auay.b);
                    }
                    return a2 + i4;
                } else {
                    throw auda.a();
                }
            } else if (a == 3) {
                int i5 = (i & -8) | 4;
                aufg a3 = aufg.a();
                int i6 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int a4 = a(bArr, i2, auah);
                    int i7 = auah.a;
                    if (i7 == i5) {
                        i6 = i7;
                        i2 = a4;
                        break;
                    }
                    i6 = i7;
                    i2 = a(i7, bArr, a4, i3, a3, auah);
                }
                if (i2 > i3 || i6 != i5) {
                    throw auda.h();
                }
                aufg.a(i, (Object) a3);
                return i2;
            } else if (a == 5) {
                aufg.a(i, (Object) Integer.valueOf(a(bArr, i2)));
                return i2 + 4;
            } else {
                throw auda.d();
            }
        } else {
            throw auda.d();
        }
    }

    static int a(int i, byte[] bArr, int i2, auah auah) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b < 0) {
            int i7 = i5 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 < 0) {
                i5 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 < 0) {
                    i7 = i5 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 < 0) {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] < 0) {
                                i8 = i10;
                            } else {
                                auah.a = i9;
                                return i10;
                            }
                        }
                    } else {
                        i4 = b4 << 28;
                    }
                } else {
                    i3 = b3 << 21;
                }
            } else {
                i4 = b2 << 14;
            }
            auah.a = i7 | i4;
            return i8;
        }
        i3 = b << 7;
        auah.a = i5 | i3;
        return i6;
    }

    static int a(aueq aueq, int i, byte[] bArr, int i2, int i3, aucx aucx, auah auah) {
        int a = a(aueq, bArr, i2, i3, auah);
        aucx.add(auah.c);
        while (a < i3) {
            int a2 = a(bArr, a, auah);
            if (i != auah.a) {
                break;
            }
            a = a(aueq, bArr, a2, i3, auah);
            aucx.add(auah.c);
        }
        return a;
    }

    static int a(aueq aueq, byte[] bArr, int i, int i2, int i3, auah auah) {
        auea auea = (auea) aueq;
        Object a = auea.a();
        int a2 = auea.a(a, bArr, i, i2, i3, auah);
        auea.d(a);
        auah.c = a;
        return a2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int a(defpackage.aueq r6, byte[] r7, int r8, int r9, defpackage.auah r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000e
            int r0 = a((int) r8, (byte[]) r7, (int) r0, (defpackage.auah) r10)
            int r8 = r10.a
            r3 = r0
            goto L_0x000f
        L_0x000e:
            r3 = r0
        L_0x000f:
            if (r8 < 0) goto L_0x0027
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0027
            java.lang.Object r9 = r6.a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.a(r1, r2, r3, r4, r5)
            r6.d(r9)
            r10.c = r9
            return r8
        L_0x0027:
            auda r6 = defpackage.auda.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auai.a(aueq, byte[], int, int, auah):int");
    }

    static int a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static int a(byte[] bArr, int i, auah auah) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return a((int) b, bArr, i2, auah);
        }
        auah.a = b;
        return i2;
    }

    static int a(byte[] bArr, int i, aucx aucx, auah auah) {
        aucl aucl = (aucl) aucx;
        int a = a(bArr, i, auah);
        int i2 = auah.a + a;
        while (a < i2) {
            a = a(bArr, a, auah);
            aucl.d(auah.a);
        }
        if (a == i2) {
            return a;
        }
        throw auda.a();
    }
}
