package defpackage;

import com.google.android.chimera.FragmentTransaction;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: auba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class auba extends aubc {
    private final InputStream e;
    private final byte[] f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l = Integer.MAX_VALUE;

    private final void C() {
        int i2 = this.g + this.h;
        this.g = i2;
        int i3 = this.k + i2;
        int i4 = this.l;
        if (i3 > i4) {
            int i5 = i3 - i4;
            this.h = i5;
            this.g = i2 - i5;
            return;
        }
        this.h = 0;
    }

    private final void h(int i2) {
        if (i(i2)) {
            return;
        }
        if (i2 > (this.c - this.k) - this.i) {
            throw auda.g();
        }
        throw auda.a();
    }

    private final boolean i(int i2) {
        int i3 = this.i;
        int i4 = this.g;
        if (i3 + i2 > i4) {
            int i5 = this.c;
            int i6 = this.k;
            if (i2 > (i5 - i6) - i3 || i6 + i3 + i2 > this.l) {
                return false;
            }
            if (i3 > 0) {
                if (i4 > i3) {
                    byte[] bArr = this.f;
                    System.arraycopy(bArr, i3, bArr, 0, i4 - i3);
                }
                i6 = this.k + i3;
                this.k = i6;
                i4 = this.g - i3;
                this.g = i4;
                this.i = 0;
            }
            InputStream inputStream = this.e;
            byte[] bArr2 = this.f;
            int read = inputStream.read(bArr2, i4, Math.min(bArr2.length - i4, (this.c - i6) - i4));
            if (read == 0 || read < -1 || read > this.f.length) {
                String valueOf = String.valueOf(this.e.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 91);
                sb.append(valueOf);
                sb.append("#read(byte[]) returned invalid result: ");
                sb.append(read);
                sb.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb.toString());
            } else if (read <= 0) {
                return false;
            } else {
                this.g += read;
                C();
                if (this.g < i2) {
                    return i(i2);
                }
                return true;
            }
        } else {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i2);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
    }

    private final byte[] j(int i2) {
        if (i2 == 0) {
            return aucy.b;
        }
        if (i2 >= 0) {
            int i3 = this.k;
            int i4 = this.i;
            int i5 = i3 + i4 + i2;
            if (i5 - this.c <= 0) {
                int i6 = this.l;
                if (i5 <= i6) {
                    int i7 = this.g - i4;
                    int i8 = i2 - i7;
                    if (i8 >= 4096 && i8 > this.e.available()) {
                        return null;
                    }
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f, this.i, bArr, 0, i7);
                    this.k += this.g;
                    this.i = 0;
                    this.g = 0;
                    while (i7 < i2) {
                        int read = this.e.read(bArr, i7, i2 - i7);
                        if (read != -1) {
                            this.k += read;
                            i7 += read;
                        } else {
                            throw auda.a();
                        }
                    }
                    return bArr;
                }
                f((i6 - i3) - i4);
                throw auda.a();
            }
            throw auda.g();
        }
        throw auda.b();
    }

    private final List k(int i2) {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int min = Math.min(i2, FragmentTransaction.TRANSIT_ENTER_MASK);
            byte[] bArr = new byte[min];
            int i3 = 0;
            while (i3 < min) {
                int read = this.e.read(bArr, i3, min - i3);
                if (read != -1) {
                    this.k += read;
                    i3 += read;
                } else {
                    throw auda.a();
                }
            }
            i2 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final byte[] l(int i2) {
        byte[] j2 = j(i2);
        if (j2 != null) {
            return j2;
        }
        int i3 = this.i;
        int i4 = this.g;
        int i5 = i4 - i3;
        this.k += i4;
        this.i = 0;
        this.g = 0;
        List k2 = k(i2 - i5);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f, i3, bArr, 0, i5);
        int size = k2.size();
        for (int i6 = 0; i6 < size; i6++) {
            byte[] bArr2 = (byte[]) k2.get(i6);
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return bArr;
    }

    public final int A() {
        return this.k + this.i;
    }

    public final byte B() {
        if (this.i == this.g) {
            h(1);
        }
        byte[] bArr = this.f;
        int i2 = this.i;
        this.i = i2 + 1;
        return bArr[i2];
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

    public final byte[] m() {
        int t = t();
        int i2 = this.g;
        int i3 = this.i;
        if (t > i2 - i3 || t <= 0) {
            return l(t);
        }
        byte[] copyOfRange = Arrays.copyOfRange(this.f, i3, i3 + t);
        this.i += t;
        return copyOfRange;
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
            int r0 = r5.i
            int r1 = r5.g
            if (r1 == r0) goto L_0x006c
            byte[] r2 = r5.f
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
            r5.i = r1
            return r0
        L_0x0069:
            r5.i = r3
            return r0
        L_0x006c:
            long r0 = r5.v()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auba.t():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        if (((long) r2[r3]) >= 0) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long u() {
        /*
            r11 = this;
            int r0 = r11.i
            int r1 = r11.g
            if (r1 == r0) goto L_0x00b2
            byte[] r2 = r11.f
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
            r11.i = r3
            return r0
        L_0x00ae:
            r11.i = r3
            long r0 = (long) r0
            return r0
        L_0x00b2:
            long r0 = r11.v()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auba.u():long");
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
        int i2 = this.i;
        if (this.g - i2 < 4) {
            h(4);
            i2 = this.i;
        }
        byte[] bArr = this.f;
        this.i = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public final long x() {
        int i2 = this.i;
        if (this.g - i2 < 8) {
            h(8);
            i2 = this.i;
        }
        byte[] bArr = this.f;
        this.i = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public final void y() {
        this.k = -this.i;
    }

    public final boolean z() {
        return this.i == this.g && !i(1);
    }

    public auba(InputStream inputStream, int i2) {
        aucy.a((Object) inputStream, "input");
        this.e = inputStream;
        this.f = new byte[i2];
        this.g = 0;
        this.i = 0;
        this.k = 0;
    }

    public final boolean b(int i2) {
        int a;
        int a2 = aufy.a(i2);
        int i3 = 0;
        if (a2 == 0) {
            if (this.g - this.i < 10) {
                while (i3 < 10) {
                    if (B() < 0) {
                        i3++;
                    }
                }
                throw auda.c();
            }
            while (i3 < 10) {
                byte[] bArr = this.f;
                int i4 = this.i;
                this.i = i4 + 1;
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
            int i3 = i2 + this.k + this.i;
            int i4 = this.l;
            if (i3 <= i4) {
                this.l = i3;
                C();
                return i4;
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
        int i3 = this.i;
        if (i2 > this.g - i3 || i2 <= 0) {
            return l(i2);
        }
        int i4 = i2 + i3;
        this.i = i4;
        return Arrays.copyOfRange(this.f, i3, i4);
    }

    public final void f(int i2) {
        int i3 = this.g;
        int i4 = this.i;
        int i5 = i3 - i4;
        if (i2 <= i5 && i2 >= 0) {
            this.i = i4 + i2;
        } else if (i2 >= 0) {
            int i6 = this.k;
            int i7 = i6 + i4;
            int i8 = this.l;
            if (i7 + i2 <= i8) {
                this.k = i7;
                this.g = 0;
                this.i = 0;
                while (i5 < i2) {
                    try {
                        long j2 = (long) (i2 - i5);
                        long skip = this.e.skip(j2);
                        if (skip >= 0 && skip <= j2) {
                            if (skip == 0) {
                                break;
                            }
                            i5 += (int) skip;
                        } else {
                            String valueOf = String.valueOf(this.e.getClass());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 92);
                            sb.append(valueOf);
                            sb.append("#skip returned invalid result: ");
                            sb.append(skip);
                            sb.append("\nThe InputStream implementation is buggy.");
                            throw new IllegalStateException(sb.toString());
                        }
                    } catch (Throwable th) {
                        this.k += i5;
                        C();
                        throw th;
                    }
                }
                this.k += i5;
                C();
                if (i5 < i2) {
                    int i9 = this.g;
                    int i10 = i9 - this.i;
                    this.i = i9;
                    h(1);
                    while (true) {
                        int i11 = i2 - i10;
                        int i12 = this.g;
                        if (i11 > i12) {
                            i10 += i12;
                            this.i = i12;
                            h(1);
                        } else {
                            this.i = i11;
                            return;
                        }
                    }
                }
            } else {
                f((i8 - i6) - i4);
                throw auda.a();
            }
        } else {
            throw auda.b();
        }
    }

    public final void a(int i2) {
        if (this.j != i2) {
            throw auda.e();
        }
    }

    public final int h() {
        return w();
    }

    public final String k() {
        byte[] bArr;
        int t = t();
        int i2 = this.i;
        int i3 = this.g;
        if (t <= i3 - i2 && t > 0) {
            bArr = this.f;
            this.i = i2 + t;
        } else if (t == 0) {
            return "";
        } else {
            if (t <= i3) {
                h(t);
                bArr = this.f;
                this.i = t;
                i2 = 0;
            } else {
                bArr = l(t);
                i2 = 0;
            }
        }
        return aufv.c(bArr, i2, t);
    }

    public final auay l() {
        int t = t();
        int i2 = this.g;
        int i3 = this.i;
        if (t <= i2 - i3 && t > 0) {
            auay a = auay.a(this.f, i3, t);
            this.i += t;
            return a;
        } else if (t == 0) {
            return auay.b;
        } else {
            byte[] j2 = j(t);
            if (j2 != null) {
                return auay.a(j2);
            }
            int i4 = this.i;
            int i5 = this.g;
            int i6 = i5 - i4;
            this.k += i5;
            this.i = 0;
            this.g = 0;
            List k2 = k(t - i6);
            byte[] bArr = new byte[t];
            System.arraycopy(this.f, i4, bArr, 0, i6);
            int size = k2.size();
            for (int i7 = 0; i7 < size; i7++) {
                byte[] bArr2 = (byte[]) k2.get(i7);
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i6, length);
                i6 += length;
            }
            return auay.b(bArr);
        }
    }

    public final boolean i() {
        return u() != 0;
    }

    public final String j() {
        int t = t();
        if (t > 0) {
            int i2 = this.g;
            int i3 = this.i;
            if (t <= i2 - i3) {
                String str = new String(this.f, i3, t, aucy.a);
                this.i += t;
                return str;
            }
        }
        if (t == 0) {
            return "";
        }
        if (t > this.g) {
            return new String(l(t), aucy.a);
        }
        h(t);
        String str2 = new String(this.f, this.i, t, aucy.a);
        this.i += t;
        return str2;
    }
}
