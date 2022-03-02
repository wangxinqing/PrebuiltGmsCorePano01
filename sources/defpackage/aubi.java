package defpackage;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: aubi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aubi extends aubk {
    private final ByteBuffer a;
    private final ByteBuffer b;
    private final int c;

    private final void c(String str) {
        try {
            aufv.a((CharSequence) str, this.b);
        } catch (IndexOutOfBoundsException e) {
            throw new aubh((Throwable) e);
        }
    }

    public final int a() {
        return this.b.remaining();
    }

    public final int b() {
        return this.b.position() - this.c;
    }

    public final void d(int i) {
        while ((i & -128) != 0) {
            try {
                this.b.put((byte) ((i & 127) | 128));
                i >>>= 7;
            } catch (BufferOverflowException e) {
                throw new aubh((Throwable) e);
            }
        }
        this.b.put((byte) i);
    }

    public aubi(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        this.b = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        this.c = byteBuffer.position();
    }

    public final void a(int i, long j) {
        b(i, 0);
        c(j);
    }

    public final void e(int i) {
        try {
            this.b.putInt(i);
        } catch (BufferOverflowException e) {
            throw new aubh((Throwable) e);
        }
    }

    public final void a(int i, auay auay) {
        b(i, 2);
        a(auay);
    }

    public final void b(byte b2) {
        try {
            this.b.put(b2);
        } catch (BufferOverflowException e) {
            throw new aubh((Throwable) e);
        }
    }

    public final void c() {
        this.a.position(this.b.position());
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

    public final void c(int i) {
        if (i < 0) {
            c((long) i);
        } else {
            d(i);
        }
    }

    public final void d(int i, int i2) {
        b(i, 0);
        d(i2);
    }

    public final void b(int i, long j) {
        b(i, 1);
        d(j);
    }

    public final void b(int i, auay auay) {
        b(1, 3);
        d(2, i);
        a(3, auay);
        b(1, 4);
    }

    public final void c(int i, int i2) {
        b(i, 0);
        c(i2);
    }

    public final void d(long j) {
        try {
            this.b.putLong(j);
        } catch (BufferOverflowException e) {
            throw new aubh((Throwable) e);
        }
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

    public final void c(long j) {
        while ((-128 & j) != 0) {
            try {
                this.b.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            } catch (BufferOverflowException e) {
                throw new aubh((Throwable) e);
            }
        }
        this.b.put((byte) ((int) j));
    }

    public final void b(byte[] bArr, int i, int i2) {
        try {
            this.b.put(bArr, i, i2);
        } catch (IndexOutOfBoundsException e) {
            throw new aubh((Throwable) e);
        } catch (BufferOverflowException e2) {
            throw new aubh((Throwable) e2);
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

    public final void a(String str) {
        int position = this.b.position();
        try {
            int k = aubk.k(str.length() * 3);
            int k2 = aubk.k(str.length());
            if (k2 == k) {
                int position2 = this.b.position() + k2;
                this.b.position(position2);
                c(str);
                int position3 = this.b.position();
                this.b.position(position);
                d(position3 - position2);
                this.b.position(position3);
                return;
            }
            d(aufv.a((CharSequence) str));
            c(str);
        } catch (auft e) {
            this.b.position(position);
            a(str, e);
        } catch (IllegalArgumentException e2) {
            throw new aubh((Throwable) e2);
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
