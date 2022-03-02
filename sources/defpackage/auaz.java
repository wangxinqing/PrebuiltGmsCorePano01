package defpackage;

import java.util.Arrays;

/* renamed from: auaz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class auaz extends aubc {
    private final byte[] e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k = Integer.MAX_VALUE;

    private final void C() {
        int i2 = this.f + this.g;
        this.f = i2;
        int i3 = i2 - this.i;
        int i4 = this.k;
        if (i3 > i4) {
            int i5 = i3 - i4;
            this.g = i5;
            this.f = i2 - i5;
            return;
        }
        this.g = 0;
    }

    public final int A() {
        return this.h - this.i;
    }

    public final byte B() {
        int i2 = this.h;
        if (i2 != this.f) {
            byte[] bArr = this.e;
            this.h = i2 + 1;
            return bArr[i2];
        }
        throw auda.a();
    }

    public final int a() {
        if (!z()) {
            int t = t();
            this.j = t;
            if (aufy.b(t) != 0) {
                return this.j;
            }
            throw auda.d();
        }
        this.j = 0;
        return 0;
    }

    public final double b() {
        return Double.longBitsToDouble(x());
    }

    public final float c() {
        return Float.intBitsToFloat(w());
    }

    public final long d() {
        return u();
    }

    public final long e() {
        return u();
    }

    public final int f() {
        return t();
    }

    public final long g() {
        return x();
    }

    public final int h() {
        return w();
    }

    public final boolean i() {
        return u() != 0;
    }

    public final String j() {
        int t = t();
        if (t > 0) {
            int i2 = this.f;
            int i3 = this.h;
            if (t <= i2 - i3) {
                String str = new String(this.e, i3, t, aucy.a);
                this.h += t;
                return str;
            }
        }
        if (t == 0) {
            return "";
        }
        if (t < 0) {
            throw auda.b();
        }
        throw auda.a();
    }

    public final String k() {
        int t = t();
        if (t > 0) {
            int i2 = this.f;
            int i3 = this.h;
            if (t <= i2 - i3) {
                String c = aufv.c(this.e, i3, t);
                this.h += t;
                return c;
            }
        }
        if (t == 0) {
            return "";
        }
        if (t <= 0) {
            throw auda.b();
        }
        throw auda.a();
    }

    public final auay l() {
        int t = t();
        if (t > 0) {
            int i2 = this.f;
            int i3 = this.h;
            if (t <= i2 - i3) {
                auay a = auay.a(this.e, i3, t);
                this.h += t;
                return a;
            }
        }
        if (t != 0) {
            return auay.b(e(t));
        }
        return auay.b;
    }

    public final byte[] m() {
        return e(t());
    }

    public final int n() {
        return t();
    }

    public final int o() {
        return t();
    }

    public final int p() {
        return w();
    }

    public final long q() {
        return x();
    }

    public final int r() {
        return aubc.g(t());
    }

    public final long s() {
        return aubc.a(u());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (r2[r3] >= 0) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int t() {
        /*
            r5 = this;
            int r0 = r5.h
            int r1 = r5.f
            if (r1 == r0) goto L_0x006c
            byte[] r2 = r5.e
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 >= 0) goto L_0x0069
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006c
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 < 0) goto L_0x0064
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 >= 0) goto L_0x0060
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 < 0) goto L_0x005b
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x005a
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0066
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x005a
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0066
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x005a
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006c
            goto L_0x0066
        L_0x005a:
            goto L_0x0062
        L_0x005b:
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0066
        L_0x0060:
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x0062:
            r1 = r3
            goto L_0x0066
        L_0x0064:
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0066:
            r5.h = r1
            return r0
        L_0x0069:
            r5.h = r3
            return r0
        L_0x006c:
            long r0 = r5.v()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auaz.t():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        if (((long) r2[r3]) >= 0) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long u() {
        /*
            r11 = this;
            int r0 = r11.h
            int r1 = r11.f
            if (r1 == r0) goto L_0x00b2
            byte[] r2 = r11.e
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 >= 0) goto L_0x00ae
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x00b2
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 < 0) goto L_0x00a5
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 >= 0) goto L_0x00a1
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 < 0) goto L_0x009c
            int r3 = r1 + 1
            long r4 = (long) r0
            byte r0 = r2[r1]
            long r0 = (long) r0
            r6 = 28
            long r0 = r0 << r6
            long r0 = r0 ^ r4
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0097
            int r6 = r3 + 1
            byte r3 = r2[r3]
            long r7 = (long) r3
            r3 = 35
            long r7 = r7 << r3
            long r0 = r0 ^ r7
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 < 0) goto L_0x008f
            int r3 = r6 + 1
            byte r6 = r2[r6]
            long r6 = (long) r6
            r8 = 42
            long r6 = r6 << r8
            long r0 = r0 ^ r6
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0089
            int r6 = r3 + 1
            byte r3 = r2[r3]
            long r7 = (long) r3
            r3 = 49
            long r7 = r7 << r3
            long r0 = r0 ^ r7
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 < 0) goto L_0x0083
            int r3 = r6 + 1
            byte r6 = r2[r6]
            long r6 = (long) r6
            r8 = 56
            long r6 = r6 << r8
            long r0 = r0 ^ r6
            r6 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r0 = r0 ^ r6
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0082
            int r6 = r3 + 1
            byte r2 = r2[r3]
            long r2 = (long) r2
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x00b2
            goto L_0x0095
        L_0x0082:
            goto L_0x00ab
        L_0x0083:
            r2 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x0094
        L_0x0089:
            r4 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x009a
        L_0x008f:
            r2 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x0094:
            long r0 = r0 ^ r2
        L_0x0095:
            r3 = r6
            goto L_0x00ab
        L_0x0097:
            r4 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x009a:
            long r0 = r0 ^ r4
            goto L_0x00ab
        L_0x009c:
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x00a7
        L_0x00a1:
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            goto L_0x00ab
        L_0x00a5:
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x00a7:
            long r2 = (long) r0
            r9 = r2
            r3 = r1
            r0 = r9
        L_0x00ab:
            r11.h = r3
            return r0
        L_0x00ae:
            r11.h = r3
            long r0 = (long) r0
            return r0
        L_0x00b2:
            long r0 = r11.v()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auaz.u():long");
    }

    /* access modifiers changed from: package-private */
    public final long v() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte B = B();
            j2 |= ((long) (B & Byte.MAX_VALUE)) << i2;
            if ((B & 128) == 0) {
                return j2;
            }
        }
        throw auda.c();
    }

    public final int w() {
        int i2 = this.h;
        if (this.f - i2 >= 4) {
            byte[] bArr = this.e;
            this.h = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }
        throw auda.a();
    }

    public final long x() {
        int i2 = this.h;
        if (this.f - i2 >= 8) {
            byte[] bArr = this.e;
            this.h = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }
        throw auda.a();
    }

    public final void y() {
        this.i = this.h;
    }

    public final boolean z() {
        return this.h == this.f;
    }

    public auaz(byte[] bArr, int i2, int i3) {
        this.e = bArr;
        this.f = i3 + i2;
        this.h = i2;
        this.i = i2;
    }

    public final boolean b(int i2) {
        int a;
        int a2 = aufy.a(i2);
        int i3 = 0;
        if (a2 == 0) {
            if (this.f - this.h < 10) {
                while (i3 < 10) {
                    if (B() < 0) {
                        i3++;
                    }
                }
                throw auda.c();
            }
            while (i3 < 10) {
                byte[] bArr = this.e;
                int i4 = this.h;
                this.h = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw auda.c();
            return true;
        } else if (a2 == 1) {
            f(8);
            return true;
        } else if (a2 == 2) {
            f(t());
            return true;
        } else if (a2 == 3) {
            do {
                a = a();
                if (a == 0 || !b(a)) {
                    a(aufy.a(aufy.b(i2), 4));
                }
                a = a();
                break;
            } while (!b(a));
            a(aufy.a(aufy.b(i2), 4));
            return true;
        } else if (a2 == 4) {
            return false;
        } else {
            if (a2 == 5) {
                f(4);
                return true;
            }
            throw auda.f();
        }
    }

    public final int c(int i2) {
        if (i2 >= 0) {
            int A = i2 + A();
            int i3 = this.k;
            if (A <= i3) {
                this.k = A;
                C();
                return i3;
            }
            throw auda.a();
        }
        throw auda.b();
    }

    public final void d(int i2) {
        this.k = i2;
        C();
    }

    public final byte[] e(int i2) {
        if (i2 > 0) {
            int i3 = this.f;
            int i4 = this.h;
            if (i2 <= i3 - i4) {
                int i5 = i2 + i4;
                this.h = i5;
                return Arrays.copyOfRange(this.e, i4, i5);
            }
        }
        if (i2 > 0) {
            throw auda.a();
        } else if (i2 == 0) {
            return aucy.b;
        } else {
            throw auda.b();
        }
    }

    public final void f(int i2) {
        if (i2 >= 0) {
            int i3 = this.f;
            int i4 = this.h;
            if (i2 <= i3 - i4) {
                this.h = i4 + i2;
                return;
            }
        }
        if (i2 < 0) {
            throw auda.b();
        }
        throw auda.a();
    }

    public final void a(int i2) {
        if (this.j != i2) {
            throw auda.e();
        }
    }
}
