package defpackage;

import java.nio.ByteBuffer;

/* renamed from: aubb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aubb extends aubc {
    private final ByteBuffer e;
    private final long f;
    private long g;
    private long h;
    private long i;
    private int j;
    private int k;
    private int l = Integer.MAX_VALUE;

    private final void C() {
        long j2 = this.g + ((long) this.j);
        this.g = j2;
        int i2 = (int) (j2 - this.i);
        int i3 = this.l;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.j = i4;
            this.g = j2 - ((long) i4);
            return;
        }
        this.j = 0;
    }

    private final int D() {
        return (int) (this.g - this.h);
    }

    private final int b(long j2) {
        return (int) (j2 - this.f);
    }

    public final int A() {
        return (int) (this.h - this.i);
    }

    public final byte B() {
        long j2 = this.h;
        if (j2 != this.g) {
            this.h = 1 + j2;
            return aufp.a(j2);
        }
        throw auda.a();
    }

    public final int a() {
        if (!z()) {
            int t = t();
            this.k = t;
            if (aufy.b(t) != 0) {
                return this.k;
            }
            throw auda.d();
        }
        this.k = 0;
        return 0;
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
        if (t > 0 && t <= D()) {
            byte[] bArr = new byte[t];
            long j2 = (long) t;
            aufp.a(this.h, bArr, j2);
            String str = new String(bArr, aucy.a);
            this.h += j2;
            return str;
        } else if (t == 0) {
            return "";
        } else {
            if (t < 0) {
                throw auda.b();
            }
            throw auda.a();
        }
    }

    public final String k() {
        int t = t();
        if (t > 0 && t <= D()) {
            int b = b(this.h);
            ByteBuffer byteBuffer = this.e;
            aufr aufr = aufv.a;
            String b2 = byteBuffer.hasArray() ? aufr.b(byteBuffer.array(), byteBuffer.arrayOffset() + b, t) : byteBuffer.isDirect() ? aufr.a(byteBuffer, b, t) : aufr.b(byteBuffer, b, t);
            this.h += (long) t;
            return b2;
        } else if (t == 0) {
            return "";
        } else {
            if (t <= 0) {
                throw auda.b();
            }
            throw auda.a();
        }
    }

    public final auay l() {
        int t = t();
        if (t > 0 && t <= D()) {
            byte[] bArr = new byte[t];
            long j2 = (long) t;
            aufp.a(this.h, bArr, j2);
            this.h += j2;
            return auay.b(bArr);
        } else if (t == 0) {
            return auay.b;
        } else {
            if (t < 0) {
                throw auda.b();
            }
            throw auda.a();
        }
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

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        if (defpackage.aufp.a(r4) >= 0) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int t() {
        /*
            r10 = this;
            long r0 = r10.h
            long r2 = r10.g
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x0086
            r2 = 1
            long r4 = r0 + r2
            byte r0 = defpackage.aufp.a((long) r0)
            if (r0 >= 0) goto L_0x0083
            long r6 = r10.g
            long r6 = r6 - r4
            r8 = 9
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x0086
            long r6 = r4 + r2
            byte r1 = defpackage.aufp.a((long) r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x007e
            long r4 = r6 + r2
            byte r1 = defpackage.aufp.a((long) r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 >= 0) goto L_0x007a
            long r6 = r4 + r2
            byte r1 = defpackage.aufp.a((long) r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0075
            long r4 = r6 + r2
            byte r1 = defpackage.aufp.a((long) r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L_0x0074
            long r6 = r4 + r2
            byte r1 = defpackage.aufp.a((long) r4)
            if (r1 >= 0) goto L_0x0073
            long r4 = r6 + r2
            byte r1 = defpackage.aufp.a((long) r6)
            if (r1 >= 0) goto L_0x0074
            long r6 = r4 + r2
            byte r1 = defpackage.aufp.a((long) r4)
            if (r1 >= 0) goto L_0x0073
            long r4 = r6 + r2
            byte r1 = defpackage.aufp.a((long) r6)
            if (r1 >= 0) goto L_0x0074
            long r6 = r4 + r2
            byte r1 = defpackage.aufp.a((long) r4)
            if (r1 < 0) goto L_0x0086
        L_0x0073:
            goto L_0x0080
        L_0x0074:
            goto L_0x007c
        L_0x0075:
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L_0x0080
        L_0x007a:
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x007c:
            r6 = r4
            goto L_0x0080
        L_0x007e:
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0080:
            r10.h = r6
            return r0
        L_0x0083:
            r10.h = r4
            return r0
        L_0x0086:
            long r0 = r10.v()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aubb.t():int");
    }

    public final long u() {
        long j2;
        byte b;
        long j3;
        long j4;
        long j5 = this.h;
        if (this.g != j5) {
            long j6 = j5 + 1;
            byte a = aufp.a(j5);
            if (a >= 0) {
                this.h = j6;
                return (long) a;
            } else if (this.g - j6 >= 9) {
                long j7 = j6 + 1;
                byte a2 = a ^ (aufp.a(j6) << 7);
                if (a2 >= 0) {
                    long j8 = j7 + 1;
                    byte a3 = a2 ^ (aufp.a(j7) << 14);
                    if (a3 < 0) {
                        j7 = j8 + 1;
                        byte a4 = a3 ^ (aufp.a(j8) << 21);
                        if (a4 >= 0) {
                            j8 = j7 + 1;
                            long a5 = ((long) a4) ^ (((long) aufp.a(j7)) << 28);
                            if (a5 < 0) {
                                long j9 = j8 + 1;
                                long a6 = a5 ^ (((long) aufp.a(j8)) << 35);
                                if (a6 >= 0) {
                                    j8 = j9 + 1;
                                    a5 = a6 ^ (((long) aufp.a(j9)) << 42);
                                    if (a5 < 0) {
                                        j9 = j8 + 1;
                                        a6 = a5 ^ (((long) aufp.a(j8)) << 49);
                                        if (a6 >= 0) {
                                            j8 = j9 + 1;
                                            j2 = (a6 ^ (((long) aufp.a(j9)) << 56)) ^ 71499008037633920L;
                                            if (j2 < 0) {
                                                long j10 = 1 + j8;
                                                if (((long) aufp.a(j8)) >= 0) {
                                                    j7 = j10;
                                                    this.h = j7;
                                                    return j2;
                                                }
                                            }
                                        } else {
                                            j4 = -558586000294016L;
                                        }
                                    } else {
                                        j3 = 4363953127296L;
                                    }
                                } else {
                                    j4 = -34093383808L;
                                }
                                j2 = a6 ^ j4;
                                j7 = j9;
                                this.h = j7;
                                return j2;
                            }
                            j3 = 266354560;
                            j2 = a5 ^ j3;
                        } else {
                            b = a4 ^ -2080896;
                        }
                    } else {
                        j2 = (long) (a3 ^ 16256);
                    }
                    j7 = j8;
                    this.h = j7;
                    return j2;
                }
                b = a2 ^ Byte.MIN_VALUE;
                j2 = (long) b;
                this.h = j7;
                return j2;
            }
        }
        return v();
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
        long j2 = this.h;
        if (this.g - j2 >= 4) {
            this.h = 4 + j2;
            return ((aufp.a(j2 + 3) & 255) << 24) | (aufp.a(j2) & 255) | ((aufp.a(1 + j2) & 255) << 8) | ((aufp.a(2 + j2) & 255) << 16);
        }
        throw auda.a();
    }

    public final long x() {
        long j2 = this.h;
        if (this.g - j2 >= 8) {
            this.h = 8 + j2;
            return ((((long) aufp.a(j2 + 7)) & 255) << 56) | (((long) aufp.a(j2)) & 255) | ((((long) aufp.a(1 + j2)) & 255) << 8) | ((((long) aufp.a(2 + j2)) & 255) << 16) | ((((long) aufp.a(3 + j2)) & 255) << 24) | ((((long) aufp.a(4 + j2)) & 255) << 32) | ((((long) aufp.a(5 + j2)) & 255) << 40) | ((((long) aufp.a(6 + j2)) & 255) << 48);
        }
        throw auda.a();
    }

    public final void y() {
        this.i = this.h;
    }

    public final boolean z() {
        return this.h == this.g;
    }

    public aubb(ByteBuffer byteBuffer) {
        this.e = byteBuffer;
        long a = aufp.a(byteBuffer);
        this.f = a;
        this.g = a + ((long) byteBuffer.limit());
        long position = this.f + ((long) byteBuffer.position());
        this.h = position;
        this.i = position;
    }

    public final double b() {
        return Double.longBitsToDouble(x());
    }

    public final int c(int i2) {
        if (i2 >= 0) {
            int A = i2 + A();
            int i3 = this.l;
            if (A <= i3) {
                this.l = A;
                C();
                return i3;
            }
            throw auda.a();
        }
        throw auda.b();
    }

    public final void d(int i2) {
        this.l = i2;
        C();
    }

    public final byte[] e(int i2) {
        if (i2 >= 0 && i2 <= D()) {
            byte[] bArr = new byte[i2];
            long j2 = this.h;
            long j3 = (long) i2;
            long j4 = j2 + j3;
            int position = this.e.position();
            int limit = this.e.limit();
            try {
                this.e.position(b(j2));
                this.e.limit(b(j4));
                ByteBuffer slice = this.e.slice();
                this.e.position(position);
                this.e.limit(limit);
                slice.get(bArr);
                this.h += j3;
                return bArr;
            } catch (IllegalArgumentException e2) {
                throw auda.a();
            } catch (Throwable th) {
                this.e.position(position);
                this.e.limit(limit);
                throw th;
            }
        } else if (i2 > 0) {
            throw auda.a();
        } else if (i2 == 0) {
            return aucy.b;
        } else {
            throw auda.b();
        }
    }

    public final void f(int i2) {
        if (i2 >= 0 && i2 <= D()) {
            this.h += (long) i2;
        } else if (i2 < 0) {
            throw auda.b();
        } else {
            throw auda.a();
        }
    }

    public final boolean b(int i2) {
        int a;
        int a2 = aufy.a(i2);
        int i3 = 0;
        if (a2 == 0) {
            if (D() < 10) {
                while (i3 < 10) {
                    if (B() < 0) {
                        i3++;
                    }
                }
                throw auda.c();
            }
            while (i3 < 10) {
                long j2 = this.h;
                this.h = 1 + j2;
                if (aufp.a(j2) < 0) {
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

    public final void a(int i2) {
        if (this.k != i2) {
            throw auda.e();
        }
    }
}
