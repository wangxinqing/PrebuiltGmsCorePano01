package defpackage;

import com.google.android.chimera.FragmentTransaction;

/* renamed from: aost  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aost {
    static final int a;
    private static final int b;
    private static final int c = (Boolean.parseBoolean(System.getProperty("BROTLI_ENABLE_ASSERTS")) ? 1 : 0);
    private static final int d;
    private static final int e;
    private static final int f;
    private static final int g;
    private static final int h;
    private static final int i;
    private static final int j;

    static void a(aota aota) {
        if (aota.u <= i) {
            return;
        }
        if (aota.w == 0) {
            int i2 = aota.u << j;
            int i3 = 4096 - i2;
            int i4 = 0;
            aotd.a(aota.g, 0, i2, (int) FragmentTransaction.TRANSIT_ENTER_MASK);
            aota.u = 0;
            while (true) {
                if (i3 >= 4096) {
                    break;
                }
                int a2 = aotd.a(aota.ap, aota.g, i3, 4096 - i3);
                if (a2 <= 0) {
                    aota.w = 1;
                    aota.v = i3;
                    i3 += f - 1;
                    break;
                }
                i3 += a2;
            }
            byte[] bArr = aota.g;
            int i5 = i3 >> j;
            if (a == 64) {
                int[] iArr = aota.i;
                while (i4 < i5) {
                    int i6 = i4 * 4;
                    iArr[i4] = ((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16);
                    i4++;
                }
                return;
            }
            short[] sArr = aota.h;
            while (i4 < i5) {
                int i7 = i4 + i4;
                sArr[i4] = (short) (((bArr[i7 + 1] & 255) << 8) | (bArr[i7] & 255));
                i4++;
            }
        } else if (i(aota) < -2) {
            throw new aosv("No more input");
        }
    }

    static int b(aota aota, int i2) {
        int e2 = e(aota);
        aota.t += i2;
        return ((1 << i2) - 1) & e2;
    }

    static int c(aota aota, int i2) {
        if (e >= 24) {
            return b(aota, i2);
        }
        if (i2 <= 16) {
            return b(aota, i2);
        }
        int b2 = b(aota, 16);
        d(aota);
        return (b(aota, i2 - 16) << 16) | b2;
    }

    static void d(aota aota) {
        if (c != 0) {
            b(aota);
        }
        if (a == 64) {
            int[] iArr = aota.i;
            int i2 = aota.u;
            aota.u = i2 + 1;
            aota.p = (((long) iArr[i2]) << e) | (aota.p >>> e);
        } else {
            short[] sArr = aota.h;
            int i3 = aota.u;
            aota.u = i3 + 1;
            aota.s = (sArr[i3] << e) | (aota.s >>> e);
        }
        aota.t -= e;
    }

    static int e(aota aota) {
        if (a == 64) {
            return (int) (aota.p >>> aota.t);
        }
        return aota.s >>> aota.t;
    }

    static void f(aota aota) {
        aota.g = new byte[4160];
        if (a == 64) {
            aota.p = 0;
            aota.i = new int[h];
        } else {
            aota.s = 0;
            aota.h = new short[h];
        }
        aota.t = a;
        aota.u = g;
        aota.w = 0;
        j(aota);
    }

    static void g(aota aota) {
        if (aota.t == a) {
            j(aota);
        }
    }

    static void h(aota aota) {
        int i2 = (a - aota.t) & 7;
        if (i2 != 0 && b(aota, i2) != 0) {
            throw new aosv("Corrupted padding bits");
        }
    }

    static int i(aota aota) {
        int i2 = g;
        if (aota.w != 0) {
            i2 = (aota.v + (f - 1)) >> j;
        }
        return i2 - aota.u;
    }

    private static void j(aota aota) {
        a(aota);
        a(aota, 0);
        d(aota);
        d(aota);
    }

    static {
        int i2;
        if (!Boolean.parseBoolean(System.getProperty("BROTLI_32_BIT_CPU"))) {
            i2 = 6;
        } else {
            i2 = 5;
        }
        b = i2;
        int i3 = b;
        int i4 = 1 << i3;
        a = i4;
        int i5 = i4 >> 3;
        d = i5;
        e = i4 >> 1;
        int i6 = i5 >> 1;
        f = i6;
        g = FragmentTransaction.TRANSIT_ENTER_MASK / i6;
        h = 4160 / i6;
        i = 4060 / i6;
        j = i3 - 4;
    }

    static void b(aota aota) {
        if (aota.t > a) {
            int i2 = aota.t;
            StringBuilder sb = new StringBuilder(36);
            sb.append("Accumulator underloaded: ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        }
    }

    static void c(aota aota) {
        if (c != 0) {
            b(aota);
        }
        if (aota.t >= e) {
            if (a == 64) {
                int[] iArr = aota.i;
                int i2 = aota.u;
                aota.u = i2 + 1;
                aota.p = (((long) iArr[i2]) << e) | (aota.p >>> e);
            } else {
                short[] sArr = aota.h;
                int i3 = aota.u;
                aota.u = i3 + 1;
                aota.s = (sArr[i3] << e) | (aota.s >>> e);
            }
            aota.t -= e;
        }
    }

    static void a(aota aota, int i2) {
        if (aota.w != 0) {
            int i3 = ((aota.u << j) + ((aota.t + 7) >> 3)) - d;
            int i4 = aota.v;
            if (i3 > i4) {
                throw new aosv("Read after end");
            } else if (i2 != 0 && i3 != i4) {
                throw new aosv("Unused bytes after end");
            }
        }
    }

    static void a(aota aota, byte[] bArr, int i2, int i3) {
        if ((aota.t & 7) == 0) {
            while (aota.t != a && i3 != 0) {
                bArr[i2] = (byte) e(aota);
                aota.t += 8;
                i3--;
                i2++;
            }
            if (i3 != 0) {
                int min = Math.min(i(aota), i3 >> j);
                if (min > 0) {
                    int i4 = aota.u;
                    int i5 = j;
                    int i6 = min << i5;
                    System.arraycopy(aota.g, i4 << i5, bArr, i2, i6);
                    i2 += i6;
                    i3 -= i6;
                    aota.u += min;
                }
                if (i3 == 0) {
                    return;
                }
                if (i(aota) > 0) {
                    c(aota);
                    while (i3 != 0) {
                        bArr[i2] = (byte) e(aota);
                        aota.t += 8;
                        i3--;
                        i2++;
                    }
                    a(aota, 0);
                    return;
                }
                while (i3 > 0) {
                    int a2 = aotd.a(aota.ap, bArr, i2, i3);
                    if (a2 != -1) {
                        i2 += a2;
                        i3 -= a2;
                    } else {
                        throw new aosv("Unexpected end of input");
                    }
                }
                return;
            }
            return;
        }
        throw new aosv("Unaligned copyBytes");
    }
}
