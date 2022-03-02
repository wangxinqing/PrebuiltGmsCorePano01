package defpackage;

import java.io.OutputStream;

/* renamed from: aube  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aube extends aubk {
    final byte[] a;
    final int b;
    int c;
    int d;
    private final OutputStream g;

    private final void e() {
        this.g.write(this.a, 0, this.c);
        this.c = 0;
    }

    private final void v(int i) {
        if (this.b - this.c < i) {
            e();
        }
    }

    public final int a() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    public final int b() {
        return this.d;
    }

    public final void c() {
        if (this.c > 0) {
            e();
        }
    }

    public final void d(int i) {
        v(5);
        a(i);
    }

    public aube(OutputStream outputStream, int i) {
        if (i >= 0) {
            byte[] bArr = new byte[Math.max(i, 20)];
            this.a = bArr;
            this.b = bArr.length;
            if (outputStream != null) {
                this.g = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    /* access modifiers changed from: package-private */
    public final void a(byte b2) {
        byte[] bArr = this.a;
        int i = this.c;
        this.c = i + 1;
        bArr[i] = b2;
        this.d++;
    }

    public final void b(byte b2) {
        if (this.c == this.b) {
            e();
        }
        a(b2);
    }

    public final void c(int i) {
        if (i < 0) {
            c((long) i);
        } else {
            d(i);
        }
    }

    public final void d(int i, int i2) {
        v(20);
        a(i, 0);
        a(i2);
    }

    public final void e(int i) {
        v(4);
        b(i);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        if (aubk.e) {
            long j = (long) this.c;
            while ((i & -128) != 0) {
                byte[] bArr = this.a;
                int i2 = this.c;
                this.c = i2 + 1;
                aufp.a(bArr, (long) i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr2 = this.a;
            int i3 = this.c;
            this.c = i3 + 1;
            aufp.a(bArr2, (long) i3, (byte) i);
            this.d += (int) (((long) this.c) - j);
            return;
        }
        while ((i & -128) != 0) {
            byte[] bArr3 = this.a;
            int i4 = this.c;
            this.c = i4 + 1;
            bArr3[i4] = (byte) ((i & 127) | 128);
            this.d++;
            i >>>= 7;
        }
        byte[] bArr4 = this.a;
        int i5 = this.c;
        this.c = i5 + 1;
        bArr4[i5] = (byte) i;
        this.d++;
    }

    public final void d(long j) {
        v(8);
        b(j);
    }

    public final void e(int i, int i2) {
        v(14);
        a(i, 5);
        b(i2);
    }

    /* access modifiers changed from: package-private */
    public final void b(int i) {
        byte[] bArr = this.a;
        int i2 = this.c;
        int i3 = i2 + 1;
        this.c = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i3 + 1;
        this.c = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i4 + 1;
        this.c = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.c = i5 + 1;
        bArr[i5] = (byte) ((i >> 24) & 255);
        this.d += 4;
    }

    public final void c(int i, int i2) {
        v(20);
        a(i, 0);
        if (i2 < 0) {
            a((long) i2);
        } else {
            a(i2);
        }
    }

    public final void b(int i, int i2) {
        d(aufy.a(i, i2));
    }

    public final void b(int i, long j) {
        v(18);
        a(i, 1);
        b(j);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, int i2) {
        a(aufy.a(i, i2));
    }

    public final void b(int i, auay auay) {
        b(1, 3);
        d(2, i);
        a(3, auay);
        b(1, 4);
    }

    public final void c(long j) {
        v(10);
        a(j);
    }

    public final void a(int i, long j) {
        v(20);
        a(i, 0);
        a(j);
    }

    /* access modifiers changed from: package-private */
    public final void b(long j) {
        byte[] bArr = this.a;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        bArr[i] = (byte) ((int) (j & 255));
        int i3 = i2 + 1;
        this.c = i3;
        bArr[i2] = (byte) ((int) ((j >> 8) & 255));
        int i4 = i3 + 1;
        this.c = i4;
        bArr[i3] = (byte) ((int) ((j >> 16) & 255));
        int i5 = i4 + 1;
        this.c = i5;
        bArr[i4] = (byte) ((int) (255 & (j >> 24)));
        int i6 = i5 + 1;
        this.c = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i6 + 1;
        this.c = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i7 + 1;
        this.c = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.c = i8 + 1;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        this.d += 8;
    }

    public final void a(int i, auay auay) {
        b(i, 2);
        a(auay);
    }

    public final void b(byte[] bArr, int i, int i2) {
        int i3 = this.b;
        int i4 = this.c;
        int i5 = i3 - i4;
        if (i5 < i2) {
            System.arraycopy(bArr, i, this.a, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.c = this.b;
            this.d += i5;
            e();
            if (i7 <= this.b) {
                System.arraycopy(bArr, i6, this.a, 0, i7);
                this.c = i7;
            } else {
                this.g.write(bArr, i6, i7);
            }
            this.d += i7;
            return;
        }
        System.arraycopy(bArr, i, this.a, i4, i2);
        this.c += i2;
        this.d += i2;
    }

    public final void a(int i, audx audx) {
        b(1, 3);
        d(2, i);
        b(3, 2);
        a(audx);
        b(1, 4);
    }

    public final void a(int i, audx audx, aueq aueq) {
        b(i, 2);
        auac auac = (auac) audx;
        int l = auac.l();
        if (l == -1) {
            l = aueq.b(auac);
            auac.b(l);
        }
        d(l);
        aueq.a((Object) audx, this.f);
    }

    public final void a(int i, String str) {
        b(i, 2);
        a(str);
    }

    public final void a(int i, boolean z) {
        v(11);
        a(i, 0);
        a(z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: package-private */
    public final void a(long j) {
        if (aubk.e) {
            long j2 = (long) this.c;
            while ((j & -128) != 0) {
                byte[] bArr = this.a;
                int i = this.c;
                this.c = i + 1;
                aufp.a(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.a;
            int i2 = this.c;
            this.c = i2 + 1;
            aufp.a(bArr2, (long) i2, (byte) ((int) j));
            this.d += (int) (((long) this.c) - j2);
            return;
        }
        while ((j & -128) != 0) {
            byte[] bArr3 = this.a;
            int i3 = this.c;
            this.c = i3 + 1;
            bArr3[i3] = (byte) ((((int) j) & 127) | 128);
            this.d++;
            j >>>= 7;
        }
        byte[] bArr4 = this.a;
        int i4 = this.c;
        this.c = i4 + 1;
        bArr4[i4] = (byte) ((int) j);
        this.d++;
    }

    public final void a(auay auay) {
        d(auay.a());
        auay.a((auam) this);
    }

    public final void a(audx audx) {
        d(audx.p());
        audx.a((aubk) this);
    }

    public final void a(String str) {
        int i;
        int i2;
        try {
            int length = str.length() * 3;
            int k = aubk.k(length);
            int i3 = k + length;
            int i4 = this.b;
            if (i3 <= i4) {
                if (i3 > i4 - this.c) {
                    e();
                }
                int k2 = aubk.k(str.length());
                i = this.c;
                if (k2 != k) {
                    i2 = aufv.a((CharSequence) str);
                    a(i2);
                    this.c = aufv.a(str, this.a, this.c, i2);
                } else {
                    int i5 = i + k2;
                    this.c = i5;
                    int a2 = aufv.a(str, this.a, i5, this.b - i5);
                    this.c = i;
                    i2 = (a2 - i) - k2;
                    a(i2);
                    this.c = a2;
                }
                this.d += i2;
                return;
            }
            byte[] bArr = new byte[length];
            int a3 = aufv.a(str, bArr, 0, length);
            d(a3);
            b(bArr, 0, a3);
        } catch (auft e) {
            this.d -= this.c - i;
            this.c = i;
            throw e;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new aubh((Throwable) e2);
        } catch (auft e3) {
            a(str, e3);
        }
    }

    public final void a(byte[] bArr, int i) {
        d(i);
        b(bArr, 0, i);
    }

    public final void a(byte[] bArr, int i, int i2) {
        b(bArr, i, i2);
    }
}
