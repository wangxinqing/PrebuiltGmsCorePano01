package defpackage;

/* renamed from: aubf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class aubf extends aubk {
    private final byte[] a;
    private final int b;
    private final int c;
    private int d;

    public final int a() {
        return this.c - this.d;
    }

    public final int b() {
        return this.d - this.b;
    }

    public void c() {
    }

    public final void d(int i) {
        if (!aubk.e || auag.a() || a() < 5) {
            while ((i & -128) != 0) {
                try {
                    byte[] bArr = this.a;
                    int i2 = this.d;
                    this.d = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new aubh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.c), 1}), e);
                }
            }
            byte[] bArr2 = this.a;
            int i3 = this.d;
            this.d = i3 + 1;
            bArr2[i3] = (byte) i;
        } else if ((i & -128) != 0) {
            byte[] bArr3 = this.a;
            int i4 = this.d;
            this.d = i4 + 1;
            aufp.a(bArr3, (long) i4, (byte) (i | 128));
            int i5 = i >>> 7;
            if ((i5 & -128) == 0) {
                byte[] bArr4 = this.a;
                int i6 = this.d;
                this.d = i6 + 1;
                aufp.a(bArr4, (long) i6, (byte) i5);
                return;
            }
            byte[] bArr5 = this.a;
            int i7 = this.d;
            this.d = i7 + 1;
            aufp.a(bArr5, (long) i7, (byte) (i5 | 128));
            int i8 = i5 >>> 7;
            if ((i8 & -128) == 0) {
                byte[] bArr6 = this.a;
                int i9 = this.d;
                this.d = i9 + 1;
                aufp.a(bArr6, (long) i9, (byte) i8);
                return;
            }
            byte[] bArr7 = this.a;
            int i10 = this.d;
            this.d = i10 + 1;
            aufp.a(bArr7, (long) i10, (byte) (i8 | 128));
            int i11 = i8 >>> 7;
            if ((i11 & -128) == 0) {
                byte[] bArr8 = this.a;
                int i12 = this.d;
                this.d = i12 + 1;
                aufp.a(bArr8, (long) i12, (byte) i11);
                return;
            }
            byte[] bArr9 = this.a;
            int i13 = this.d;
            this.d = i13 + 1;
            aufp.a(bArr9, (long) i13, (byte) (i11 | 128));
            byte[] bArr10 = this.a;
            int i14 = this.d;
            this.d = i14 + 1;
            aufp.a(bArr10, (long) i14, (byte) (i11 >>> 7));
        } else {
            byte[] bArr11 = this.a;
            int i15 = this.d;
            this.d = i15 + 1;
            aufp.a(bArr11, (long) i15, (byte) i);
        }
    }

    public final void e(int i) {
        try {
            byte[] bArr = this.a;
            int i2 = this.d;
            int i3 = i2 + 1;
            this.d = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.d = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.d = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.d = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new aubh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.c), 1}), e);
        }
    }

    public aubf(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            int length = bArr.length;
            int i3 = i + i2;
            if ((i | i2 | (length - i3)) >= 0) {
                this.a = bArr;
                this.b = i;
                this.d = i;
                this.c = i3;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }
        throw new NullPointerException("buffer");
    }

    public final void a(int i, long j) {
        b(i, 0);
        c(j);
    }

    public final void c(int i) {
        if (i < 0) {
            c((long) i);
        } else {
            d(i);
        }
    }

    public final void a(int i, auay auay) {
        b(i, 2);
        a(auay);
    }

    public final void b(byte b2) {
        try {
            byte[] bArr = this.a;
            int i = this.d;
            this.d = i + 1;
            bArr[i] = b2;
        } catch (IndexOutOfBoundsException e) {
            throw new aubh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.c), 1}), e);
        }
    }

    public final void e(int i, int i2) {
        b(i, 5);
        e(i2);
    }

    public final void a(int i, audx audx) {
        b(1, 3);
        d(2, i);
        b(3, 2);
        a(audx);
        b(1, 4);
    }

    public final void b(int i, int i2) {
        d(aufy.a(i, i2));
    }

    public final void c(int i, int i2) {
        b(i, 0);
        c(i2);
    }

    public final void b(int i, long j) {
        b(i, 1);
        d(j);
    }

    public final void c(long j) {
        if (!aubk.e || a() < 10) {
            while ((j & -128) != 0) {
                try {
                    byte[] bArr = this.a;
                    int i = this.d;
                    this.d = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new aubh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.c), 1}), e);
                }
            }
            byte[] bArr2 = this.a;
            int i2 = this.d;
            this.d = i2 + 1;
            bArr2[i2] = (byte) ((int) j);
            return;
        }
        while ((j & -128) != 0) {
            byte[] bArr3 = this.a;
            int i3 = this.d;
            this.d = i3 + 1;
            aufp.a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        byte[] bArr4 = this.a;
        int i4 = this.d;
        this.d = i4 + 1;
        aufp.a(bArr4, (long) i4, (byte) ((int) j));
    }

    public final void b(int i, auay auay) {
        b(1, 3);
        d(2, i);
        a(3, auay);
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

    public final void b(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.a, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new aubh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.c), Integer.valueOf(i2)}), e);
        }
    }

    public final void a(int i, String str) {
        b(i, 2);
        a(str);
    }

    public final void a(int i, boolean z) {
        b(i, 0);
        b(z ? (byte) 1 : 0);
    }

    public final void a(auay auay) {
        d(auay.a());
        auay.a((auam) this);
    }

    public final void a(audx audx) {
        d(audx.p());
        audx.a((aubk) this);
    }

    public final void d(int i, int i2) {
        b(i, 0);
        d(i2);
    }

    public final void a(String str) {
        int i = this.d;
        try {
            int k = aubk.k(str.length() * 3);
            int k2 = aubk.k(str.length());
            if (k2 != k) {
                d(aufv.a((CharSequence) str));
                this.d = aufv.a(str, this.a, this.d, a());
                return;
            }
            int i2 = i + k2;
            this.d = i2;
            int a2 = aufv.a(str, this.a, i2, a());
            this.d = i;
            d((a2 - i) - k2);
            this.d = a2;
        } catch (auft e) {
            this.d = i;
            a(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new aubh((Throwable) e2);
        }
    }

    public final void d(long j) {
        try {
            byte[] bArr = this.a;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.d = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.d = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.d = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.d = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.d = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.d = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.d = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new aubh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.c), 1}), e);
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
