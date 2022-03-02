package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: aubj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aubj extends aubk {
    private final ByteBuffer a;
    private final ByteBuffer b;
    private final long c;
    private final long d;
    private final long g;
    private final long h;
    private long i = this.d;

    private final void a(long j) {
        this.b.position(b(j));
    }

    private final int b(long j) {
        return (int) (j - this.c);
    }

    public final int a() {
        return (int) (this.g - this.i);
    }

    public final int b() {
        return (int) (this.i - this.d);
    }

    public final void c() {
        this.a.position(b(this.i));
    }

    public final void d(int i2) {
        if (this.i > this.h) {
            while (true) {
                long j = this.i;
                if (j >= this.g) {
                    throw new aubh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j), Long.valueOf(this.g), 1}));
                } else if ((i2 & -128) != 0) {
                    this.i = j + 1;
                    aufp.a(j, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                } else {
                    this.i = 1 + j;
                    aufp.a(j, (byte) i2);
                    return;
                }
            }
        } else {
            while ((i2 & -128) != 0) {
                long j2 = this.i;
                this.i = j2 + 1;
                aufp.a(j2, (byte) ((i2 & 127) | 128));
                i2 >>>= 7;
            }
            long j3 = this.i;
            this.i = 1 + j3;
            aufp.a(j3, (byte) i2);
        }
    }

    public final void e(int i2) {
        this.b.putInt(b(this.i), i2);
        this.i += 4;
    }

    public aubj(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        this.b = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        long a2 = aufp.a(byteBuffer);
        this.c = a2;
        this.d = a2 + ((long) byteBuffer.position());
        long limit = this.c + ((long) byteBuffer.limit());
        this.g = limit;
        this.h = limit - 10;
    }

    public final void c(int i2) {
        if (i2 < 0) {
            c((long) i2);
        } else {
            d(i2);
        }
    }

    public final void e(int i2, int i3) {
        b(i2, 5);
        e(i3);
    }

    public final void a(int i2, long j) {
        b(i2, 0);
        c(j);
    }

    public final void b(byte b2) {
        long j = this.i;
        if (j < this.g) {
            this.i = 1 + j;
            aufp.a(j, b2);
            return;
        }
        throw new aubh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j), Long.valueOf(this.g), 1}));
    }

    public final void a(int i2, auay auay) {
        b(i2, 2);
        a(auay);
    }

    public final void c(int i2, int i3) {
        b(i2, 0);
        c(i3);
    }

    public final void a(int i2, audx audx) {
        b(1, 3);
        d(2, i2);
        b(3, 2);
        a(audx);
        b(1, 4);
    }

    public final void b(int i2, int i3) {
        d(aufy.a(i2, i3));
    }

    public final void c(long j) {
        if (this.i > this.h) {
            while (true) {
                long j2 = this.i;
                if (j2 >= this.g) {
                    throw new aubh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j2), Long.valueOf(this.g), 1}));
                } else if ((j & -128) != 0) {
                    this.i = j2 + 1;
                    aufp.a(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                } else {
                    this.i = 1 + j2;
                    aufp.a(j2, (byte) ((int) j));
                    return;
                }
            }
        } else {
            while ((j & -128) != 0) {
                long j3 = this.i;
                this.i = j3 + 1;
                aufp.a(j3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            long j4 = this.i;
            this.i = 1 + j4;
            aufp.a(j4, (byte) ((int) j));
        }
    }

    public final void b(int i2, long j) {
        b(i2, 1);
        d(j);
    }

    public final void d(int i2, int i3) {
        b(i2, 0);
        d(i3);
    }

    public final void b(int i2, auay auay) {
        b(1, 3);
        d(2, i2);
        a(3, auay);
        b(1, 4);
    }

    public final void d(long j) {
        this.b.putLong(b(this.i), j);
        this.i += 8;
    }

    public final void a(int i2, audx audx, aueq aueq) {
        b(i2, 2);
        auac auac = (auac) audx;
        int l = auac.l();
        if (l == -1) {
            l = aueq.b(auac);
            auac.b(l);
        }
        d(l);
        aueq.a((Object) audx, this.f);
    }

    public final void b(byte[] bArr, int i2, int i3) {
        if (bArr != null && i2 >= 0 && i3 >= 0 && bArr.length - i3 >= i2) {
            long j = this.g;
            long j2 = (long) i3;
            long j3 = this.i;
            if (j - j2 >= j3) {
                aufp.a.a(bArr, (long) i2, j3, j2);
                this.i += j2;
                return;
            }
        }
        if (bArr != null) {
            throw new aubh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.i), Long.valueOf(this.g), Integer.valueOf(i3)}));
        }
        throw new NullPointerException("value");
    }

    public final void a(int i2, String str) {
        b(i2, 2);
        a(str);
    }

    public final void a(int i2, boolean z) {
        b(i2, 0);
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

    public final void a(String str) {
        long j = this.i;
        try {
            int k = aubk.k(str.length() * 3);
            int k2 = aubk.k(str.length());
            if (k2 != k) {
                int a2 = aufv.a((CharSequence) str);
                d(a2);
                a(this.i);
                aufv.a((CharSequence) str, this.b);
                this.i += (long) a2;
                return;
            }
            int b2 = b(this.i) + k2;
            this.b.position(b2);
            aufv.a((CharSequence) str, this.b);
            int position = this.b.position() - b2;
            d(position);
            this.i += (long) position;
        } catch (auft e) {
            this.i = j;
            a(j);
            a(str, e);
        } catch (IllegalArgumentException e2) {
            throw new aubh((Throwable) e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new aubh((Throwable) e3);
        }
    }

    public final void a(byte[] bArr, int i2) {
        d(i2);
        b(bArr, 0, i2);
    }

    public final void a(byte[] bArr, int i2, int i3) {
        b(bArr, i2, i3);
    }
}
