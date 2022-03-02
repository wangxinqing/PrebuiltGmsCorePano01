package defpackage;

import com.google.android.chimera.FragmentTransaction;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: aubk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aubk extends auam {
    private static final Logger a = Logger.getLogger(aubk.class.getName());
    public static final boolean e = aufp.c;
    aubl f;

    public static int a(int i, audf audf) {
        return i(i) + a(audf);
    }

    @Deprecated
    static int b(int i, audx audx, aueq aueq) {
        int i2 = i(i);
        int i3 = i2 + i2;
        auac auac = (auac) audx;
        int l = auac.l();
        if (l == -1) {
            l = aueq.b(auac);
            auac.b(l);
        }
        return i3 + l;
    }

    public static int c(int i, auay auay) {
        return i(i) + b(auay);
    }

    public static int d(int i, long j) {
        return i(i) + f(j);
    }

    public static int e(int i, long j) {
        return i(i) + f(j);
    }

    static int f(int i) {
        return i <= 4096 ? i : FragmentTransaction.TRANSIT_ENTER_MASK;
    }

    public static int f(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    public static int g(int i, int i2) {
        return i(i) + j(i2);
    }

    public static int h(int i, int i2) {
        return i(i) + k(i2);
    }

    public static long h(long j) {
        return (j >> 63) ^ (j + j);
    }

    public static int i(int i) {
        return k(aufy.a(i, 0));
    }

    public static int j(int i) {
        if (i >= 0) {
            return k(i);
        }
        return 10;
    }

    public static int k(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) != 0) {
            return (i & -268435456) != 0 ? 5 : 4;
        }
        return 3;
    }

    public static int l(int i) {
        return k(n(i));
    }

    static int m(int i) {
        return k(i) + i;
    }

    public static int n(int i) {
        return (i >> 31) ^ (i + i);
    }

    public static int o(int i) {
        return i(i) + 1;
    }

    public static int p(int i) {
        return i(i) + 8;
    }

    public static int q(int i) {
        return i(i) + 4;
    }

    public static int r(int i) {
        return i(i) + 8;
    }

    public static int s(int i) {
        return i(i) + 4;
    }

    public static int t(int i) {
        return i(i) + 4;
    }

    public static int u(int i) {
        return i(i) + 8;
    }

    public abstract int a();

    public abstract void a(int i, long j);

    public abstract void a(int i, auay auay);

    public abstract void a(int i, audx audx);

    public abstract void a(int i, audx audx, aueq aueq);

    public abstract void a(int i, String str);

    public abstract void a(int i, boolean z);

    public abstract void a(auay auay);

    public abstract void a(audx audx);

    public abstract void a(String str);

    public abstract void a(byte[] bArr, int i);

    public abstract void a(byte[] bArr, int i, int i2);

    public abstract int b();

    public abstract void b(byte b);

    public abstract void b(int i, int i2);

    public abstract void b(int i, long j);

    public abstract void b(int i, auay auay);

    public abstract void b(byte[] bArr, int i, int i2);

    public abstract void c();

    public abstract void c(int i);

    public abstract void c(int i, int i2);

    public abstract void c(long j);

    public abstract void d(int i);

    public abstract void d(int i, int i2);

    public abstract void d(long j);

    public abstract void e(int i);

    public abstract void e(int i, int i2);

    public static int a(audf audf) {
        int i;
        if (audf.b != null) {
            i = audf.b.a();
        } else {
            i = audf.a != null ? audf.a.p() : 0;
        }
        return m(i);
    }

    public static aubk c(byte[] bArr, int i, int i2) {
        return new aubf(bArr, i, i2);
    }

    public static int f(int i, long j) {
        return i(i) + g(j);
    }

    public static int g(long j) {
        return f(h(j));
    }

    public static int i(int i, int i2) {
        return i(i) + l(i2);
    }

    public static int j(int i, int i2) {
        return i(i) + j(i2);
    }

    public final void e(long j) {
        c(h(j));
    }

    @Deprecated
    public static int d(audx audx) {
        return audx.p();
    }

    public final void c(int i, long j) {
        a(i, h(j));
    }

    public final void g(int i) {
        b((byte) i);
    }

    public final void h(int i) {
        d(n(i));
    }

    public static int d(byte[] bArr) {
        return m(bArr.length);
    }

    @Deprecated
    public final void c(audx audx) {
        audx.a(this);
    }

    public final void f(int i, int i2) {
        d(i, n(i2));
    }

    public static int b(int i, String str) {
        return i(i) + b(str);
    }

    public final void c(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public final void d() {
        if (a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    static int a(audx audx, aueq aueq) {
        auac auac = (auac) audx;
        int l = auac.l();
        if (l == -1) {
            l = aueq.b(auac);
            auac.b(l);
        }
        return m(l);
    }

    public static int b(auay auay) {
        return m(auay.a());
    }

    public static int b(audx audx) {
        return m(audx.p());
    }

    public static int b(String str) {
        int i;
        try {
            i = aufv.a((CharSequence) str);
        } catch (auft e2) {
            i = str.getBytes(aucy.a).length;
        }
        return m(i);
    }

    public static aubk a(OutputStream outputStream) {
        return a(outputStream, (int) FragmentTransaction.TRANSIT_ENTER_MASK);
    }

    public static aubk a(OutputStream outputStream, int i) {
        return new aube(outputStream, i);
    }

    public static aubk a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new aubg(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        } else if (!aufp.b) {
            return new aubi(byteBuffer);
        } else {
            return new aubj(byteBuffer);
        }
    }

    public final void b(byte[] bArr) {
        b(bArr, 0, bArr.length);
    }

    public static aubk a(byte[] bArr) {
        return c(bArr, 0, bArr.length);
    }

    public final void a(double d) {
        d(Double.doubleToRawLongBits(d));
    }

    public final void a(float f2) {
        e(Float.floatToRawIntBits(f2));
    }

    public final void a(int i, double d) {
        b(i, Double.doubleToRawLongBits(d));
    }

    public final void a(int i, float f2) {
        e(i, Float.floatToRawIntBits(f2));
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, auft auft) {
        a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", auft);
        byte[] bytes = str.getBytes(aucy.a);
        try {
            int length = bytes.length;
            d(length);
            a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new aubh((Throwable) e2);
        } catch (aubh e3) {
            throw e3;
        }
    }
}
