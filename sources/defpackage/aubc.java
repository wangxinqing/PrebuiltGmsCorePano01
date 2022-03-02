package defpackage;

import com.google.android.chimera.FragmentTransaction;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: aubc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aubc {
    int a;
    final int b = 100;
    public int c = Integer.MAX_VALUE;
    aubd d;

    public static int a(int i, InputStream inputStream) {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i2 |= (read & 127) << i3;
                if ((read & 128) == 0) {
                    return i2;
                }
                i3 += 7;
            } else {
                throw auda.a();
            }
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw auda.a();
            } else if ((read2 & 128) == 0) {
                return i2;
            } else {
                i3 += 7;
            }
        }
        throw auda.c();
    }

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static int g(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract int A();

    public abstract byte B();

    public abstract int a();

    public abstract void a(int i);

    public abstract double b();

    public abstract boolean b(int i);

    public abstract float c();

    public abstract int c(int i);

    public abstract long d();

    public abstract void d(int i);

    public abstract long e();

    public abstract byte[] e(int i);

    public abstract int f();

    public abstract void f(int i);

    public abstract long g();

    public abstract int h();

    public abstract boolean i();

    public abstract String j();

    public abstract String k();

    public abstract auay l();

    public abstract byte[] m();

    public abstract int n();

    public abstract int o();

    public abstract int p();

    public abstract long q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract void y();

    public abstract boolean z();

    public static aubc a(InputStream inputStream) {
        return a(inputStream, (int) FragmentTransaction.TRANSIT_ENTER_MASK);
    }

    public static aubc a(InputStream inputStream, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        } else if (inputStream != null) {
            return new auba(inputStream, i);
        } else {
            return a(aucy.b);
        }
    }

    public static aubc a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return a(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        }
        if (byteBuffer.isDirect() && aufp.b) {
            return new aubb(byteBuffer);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return a(bArr, 0, remaining);
    }

    public static aubc a(byte[] bArr) {
        return a(bArr, bArr.length);
    }

    public static aubc a(byte[] bArr, int i) {
        return a(bArr, 0, i);
    }

    static aubc a(byte[] bArr, int i, int i2) {
        auaz auaz = new auaz(bArr, i, i2);
        try {
            auaz.c(i2);
            return auaz;
        } catch (auda e) {
            throw new IllegalArgumentException(e);
        }
    }
}
