package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: batd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class batd implements Cloneable, ByteChannel, batf, bate {
    private static final byte[] c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public batw a;
    public long b;

    public final int a(byte[] bArr, int i, int i2) {
        baud.a((long) bArr.length, (long) i, (long) i2);
        batw batw = this.a;
        if (batw == null) {
            return -1;
        }
        int min = Math.min(i2, batw.c - batw.b);
        System.arraycopy(batw.a, batw.b, bArr, i, min);
        int i3 = batw.b + min;
        batw.b = i3;
        this.b -= (long) min;
        if (i3 == batw.c) {
            this.a = batw.b();
            batx.a(batw);
        }
        return min;
    }

    public final long a(batg batg) {
        throw null;
    }

    public final void a(long j) {
        throw null;
    }

    public final /* bridge */ /* synthetic */ void a(byte[] bArr) {
        throw null;
    }

    public final batg b(int i) {
        if (i != 0) {
            return new baty(this, i);
        }
        return batg.b;
    }

    public final boolean b() {
        return this.b == 0;
    }

    public final boolean b(long j) {
        throw null;
    }

    public final bauc bu() {
        return bauc.f;
    }

    public final byte c(long j) {
        int i;
        baud.a(this.b, j, 1);
        long j2 = this.b;
        if (j2 - j <= j) {
            long j3 = j - j2;
            batw batw = this.a;
            do {
                batw = batw.g;
                int i2 = batw.c;
                i = batw.b;
                j3 += (long) (i2 - i);
            } while (j3 < 0);
            return batw.a[i + ((int) j3)];
        }
        batw batw2 = this.a;
        while (true) {
            int i3 = batw2.c;
            int i4 = batw2.b;
            long j4 = (long) (i3 - i4);
            if (j < j4) {
                return batw2.a[i4 + ((int) j)];
            }
            j -= j4;
            batw2 = batw2.f;
        }
    }

    public final /* bridge */ /* synthetic */ void c(batg batg) {
        throw null;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        batd batd = new batd();
        if (this.b != 0) {
            batw a2 = this.a.a();
            batd.a = a2;
            a2.g = a2;
            a2.f = a2;
            batw batw = this.a;
            while (true) {
                batw = batw.f;
                if (batw == this.a) {
                    break;
                }
                batd.a.g.a(batw.a());
            }
            batd.b = this.b;
        }
        return batd;
    }

    public final void close() {
    }

    public final long d() {
        long j = this.b;
        if (j == 0) {
            return 0;
        }
        batw batw = this.a.g;
        int i = batw.c;
        return (i >= 8192 || !batw.e) ? j : j - ((long) (i - batw.b));
    }

    public final batg d(long j) {
        throw null;
    }

    public final byte e() {
        long j = this.b;
        if (j != 0) {
            batw batw = this.a;
            int i = batw.b;
            int i2 = batw.c;
            int i3 = i + 1;
            byte b2 = batw.a[i];
            this.b = j - 1;
            if (i3 == i2) {
                this.a = batw.b();
                batx.a(batw);
            } else {
                batw.b = i3;
            }
            return b2;
        }
        throw new IllegalStateException("size == 0");
    }

    public final /* bridge */ /* synthetic */ void e(int i) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof batd) {
            batd batd = (batd) obj;
            long j = this.b;
            if (j == batd.b) {
                long j2 = 0;
                if (j != 0) {
                    batw batw = this.a;
                    batw batw2 = batd.a;
                    int i = batw.b;
                    int i2 = batw2.b;
                    while (j2 < this.b) {
                        long min = (long) Math.min(batw.c - i, batw2.c - i2);
                        int i3 = 0;
                        while (((long) i3) < min) {
                            int i4 = i + 1;
                            int i5 = i2 + 1;
                            if (batw.a[i] != batw2.a[i2]) {
                                return false;
                            }
                            i3++;
                            i = i4;
                            i2 = i5;
                        }
                        if (i == batw.c) {
                            batw = batw.f;
                            i = batw.b;
                        }
                        if (i2 == batw2.c) {
                            batw2 = batw2.f;
                            i2 = batw2.b;
                        }
                        j2 += min;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String f(long j) {
        if (j > 0) {
            long j2 = -1 + j;
            if (c(j2) == 13) {
                String e = e(j2);
                h(2);
                return e;
            }
        }
        String e2 = e(j);
        h(1);
        return e2;
    }

    public final /* bridge */ /* synthetic */ void f(int i) {
        throw null;
    }

    public final void flush() {
    }

    public final int g() {
        long j = this.b;
        if (j >= 4) {
            batw batw = this.a;
            int i = batw.b;
            int i2 = batw.c;
            if (i2 - i < 4) {
                return ((e() & 255) << 24) | ((e() & 255) << 16) | ((e() & 255) << 8) | (e() & 255);
            }
            byte[] bArr = batw.a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            byte b2 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
            this.b = j - 4;
            if (i6 == i2) {
                this.a = batw.b();
                batx.a(batw);
            } else {
                batw.b = i6;
            }
            return b2;
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("size < 4: ");
        sb.append(j);
        throw new IllegalStateException(sb.toString());
    }

    public final short h() {
        return baud.a(f());
    }

    public final int hashCode() {
        batw batw = this.a;
        if (batw == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = batw.c;
            for (int i3 = batw.b; i3 < i2; i3++) {
                i = (i * 31) + batw.a[i3];
            }
            batw = batw.f;
        } while (batw != this.a);
        return i;
    }

    public final int i() {
        throw null;
    }

    public final boolean isOpen() {
        return true;
    }

    public final batg j() {
        return new batg(m());
    }

    public final String k() {
        try {
            return a(this.b, baud.a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final String l() {
        throw null;
    }

    public final byte[] m() {
        try {
            return g(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final batg o() {
        long j = this.b;
        if (j <= 2147483647L) {
            return b((int) j);
        }
        StringBuilder sb = new StringBuilder(46);
        sb.append("size > Integer.MAX_VALUE: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public final /* bridge */ /* synthetic */ void p() {
        throw null;
    }

    public final long q() {
        throw null;
    }

    public final int read(ByteBuffer byteBuffer) {
        batw batw = this.a;
        if (batw == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), batw.c - batw.b);
        byteBuffer.put(batw.a, batw.b, min);
        int i = batw.b + min;
        batw.b = i;
        this.b -= (long) min;
        if (i == batw.c) {
            this.a = batw.b();
            batx.a(batw);
        }
        return min;
    }

    public final String toString() {
        return o().toString();
    }

    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                batw a2 = a(1);
                int min = Math.min(i, 8192 - a2.c);
                byteBuffer.get(a2.a, a2.c, min);
                i -= min;
                a2.c += min;
            }
            this.b += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final void j(long j) {
        if (j != 0) {
            int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
            batw a2 = a(numberOfTrailingZeros);
            byte[] bArr = a2.a;
            int i = a2.c;
            for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
                bArr[i2] = c[(int) (15 & j)];
                j >>>= 4;
            }
            a2.c += numberOfTrailingZeros;
            this.b += (long) numberOfTrailingZeros;
            return;
        }
        h(48);
    }

    public final void n() {
        try {
            h(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final void b(batd batd, long j) {
        baud.a(this.b, 0, j);
        if (j != 0) {
            batd.b += j;
            batw batw = this.a;
            long j2 = 0;
            while (true) {
                long j3 = (long) (batw.c - batw.b);
                if (j2 < j3) {
                    break;
                }
                j2 -= j3;
                batw = batw.f;
            }
            while (j > 0) {
                batw a2 = batw.a();
                int i = (int) (((long) a2.b) + j2);
                a2.b = i;
                a2.c = Math.min(i + ((int) j), a2.c);
                batw batw2 = batd.a;
                if (batw2 == null) {
                    a2.g = a2;
                    a2.f = a2;
                    batd.a = a2;
                } else {
                    batw2.g.a(a2);
                }
                j -= (long) (a2.c - a2.b);
                batw = batw.f;
                j2 = 0;
            }
        }
    }

    public final void d(int i) {
        batw a2 = a(4);
        byte[] bArr = a2.a;
        int i2 = a2.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        a2.c = i5 + 1;
        this.b += 4;
    }

    public final void h(long j) {
        while (j > 0) {
            batw batw = this.a;
            if (batw != null) {
                int min = (int) Math.min(j, (long) (batw.c - batw.b));
                long j2 = (long) min;
                this.b -= j2;
                j -= j2;
                batw batw2 = this.a;
                int i = batw2.b + min;
                batw2.b = i;
                if (i == batw2.c) {
                    this.a = batw2.b();
                    batx.a(batw2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: k */
    public final void i(long j) {
        boolean z;
        if (j != 0) {
            int i = 1;
            if (j < 0) {
                j = -j;
                if (j >= 0) {
                    z = true;
                } else {
                    b("-9223372036854775808");
                    return;
                }
            } else {
                z = false;
            }
            if (j >= 100000000) {
                i = j >= 1000000000000L ? j < 1000000000000000L ? j >= 10000000000000L ? j < 100000000000000L ? 14 : 15 : 13 : j >= 100000000000000000L ? j < 1000000000000000000L ? 18 : 19 : j < 10000000000000000L ? 16 : 17 : j >= 10000000000L ? j < 100000000000L ? 11 : 12 : j < 1000000000 ? 9 : 10;
            } else if (j >= 10000) {
                i = j >= 1000000 ? j < 10000000 ? 7 : 8 : j < 100000 ? 5 : 6;
            } else if (j >= 100) {
                i = j < 1000 ? 3 : 4;
            } else if (j >= 10) {
                i = 2;
            }
            if (z) {
                i++;
            }
            batw a2 = a(i);
            byte[] bArr = a2.a;
            int i2 = a2.c + i;
            while (j != 0) {
                i2--;
                bArr[i2] = c[(int) (j % 10)];
                j /= 10;
            }
            if (z) {
                bArr[i2 - 1] = 45;
            }
            a2.c += i;
            this.b += (long) i;
            return;
        }
        h(48);
    }

    public final long a(byte b2, long j) {
        batw batw;
        long j2;
        long j3 = 0;
        long j4 = Long.MAX_VALUE;
        if (j >= 0) {
            long j5 = this.b;
            if (j5 < Long.MAX_VALUE) {
                j4 = j5;
            }
            if (j == j4 || (batw = this.a) == null) {
                return -1;
            }
            if (j5 - j >= j) {
                while (true) {
                    long j6 = ((long) (batw.c - batw.b)) + j3;
                    if (j6 >= j) {
                        break;
                    }
                    batw = batw.f;
                    j3 = j6;
                }
                j5 = j3;
                j2 = j;
            } else {
                while (j5 > j) {
                    batw = batw.g;
                    j5 -= (long) (batw.c - batw.b);
                }
                j2 = j;
            }
            while (j5 < j4) {
                byte[] bArr = batw.a;
                int min = (int) Math.min((long) batw.c, (((long) batw.b) + j4) - j5);
                for (int i = (int) ((((long) batw.b) + j2) - j5); i < min; i++) {
                    if (bArr[i] == b2) {
                        return ((long) (i - batw.b)) + j5;
                    }
                }
                j5 += (long) (batw.c - batw.b);
                batw = batw.f;
                j2 = j5;
            }
            return -1;
        }
        throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.b), Long.valueOf(j), Long.MAX_VALUE}));
    }

    public final short f() {
        long j = this.b;
        if (j >= 2) {
            batw batw = this.a;
            int i = batw.b;
            int i2 = batw.c;
            if (i2 - i < 2) {
                return (short) (((e() & 255) << 8) | (e() & 255));
            }
            byte[] bArr = batw.a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b2 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.b = j - 2;
            if (i4 == i2) {
                this.a = batw.b();
                batx.a(batw);
            } else {
                batw.b = i4;
            }
            return (short) b2;
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("size < 2: ");
        sb.append(j);
        throw new IllegalStateException(sb.toString());
    }

    public final String e(long j) {
        return a(j, baud.a);
    }

    public final long c(batd batd, long j) {
        if (j >= 0) {
            long j2 = this.b;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            batd.a(this, j);
            return j;
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("byteCount < 0: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void g(int i) {
        if (i < 128) {
            h(i);
        } else if (i < 2048) {
            h((i >> 6) | 192);
            h((i & 63) | 128);
        } else if (i >= 65536) {
            if (i <= 1114111) {
                h((i >> 18) | 240);
                h(((i >> 12) & 63) | 128);
                h(((i >> 6) & 63) | 128);
                h((i & 63) | 128);
                return;
            }
            String valueOf = String.valueOf(Integer.toHexString(i));
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unexpected code point: ") : "Unexpected code point: ".concat(valueOf));
        } else if (i >= 55296 && i <= 57343) {
            h(63);
        } else {
            h((i >> 12) | 224);
            h(((i >> 6) & 63) | 128);
            h((i & 63) | 128);
        }
    }

    public final InputStream c() {
        return new batc(this);
    }

    public final void b(batg batg) {
        if (batg != null) {
            batg.a(this);
            return;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    /* renamed from: c */
    public final void h(int i) {
        batw a2 = a(1);
        byte[] bArr = a2.a;
        int i2 = a2.c;
        a2.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    public final void b(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            baud.a((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                batw a2 = a(1);
                int min = Math.min(i3 - i, 8192 - a2.c);
                System.arraycopy(bArr, i, a2.a, a2.c, min);
                i += min;
                a2.c += min;
            }
            this.b += j;
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final byte[] g(long j) {
        baud.a(this.b, 0, j);
        if (j <= 2147483647L) {
            int i = (int) j;
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int a2 = a(bArr, i2, i - i2);
                if (a2 != -1) {
                    i2 += a2;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        }
        StringBuilder sb = new StringBuilder(51);
        sb.append("byteCount > Integer.MAX_VALUE: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    public final batw a(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        batw batw = this.a;
        if (batw == null) {
            batw a2 = batx.a();
            this.a = a2;
            a2.g = a2;
            a2.f = a2;
            return a2;
        }
        batw batw2 = batw.g;
        if (batw2.c + i <= 8192 && batw2.e) {
            return batw2;
        }
        batw a3 = batx.a();
        batw2.a(a3);
        return a3;
    }

    public final String a(long j, Charset charset) {
        baud.a(this.b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            StringBuilder sb = new StringBuilder(51);
            sb.append("byteCount > Integer.MAX_VALUE: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (j == 0) {
            return "";
        } else {
            batw batw = this.a;
            int i = batw.b;
            if (((long) i) + j > ((long) batw.c)) {
                return new String(g(j), charset);
            }
            String str = new String(batw.a, i, (int) j, charset);
            int i2 = (int) (((long) batw.b) + j);
            batw.b = i2;
            this.b -= j;
            if (i2 == batw.c) {
                this.a = batw.b();
                batx.a(batw);
            }
            return str;
        }
    }

    public final void a(batd batd, long j) {
        batw batw;
        batw batw2;
        if (batd == null) {
            throw new IllegalArgumentException("source == null");
        } else if (batd != this) {
            baud.a(batd.b, 0, j);
            while (j > 0) {
                batw batw3 = batd.a;
                int i = batw3.c - batw3.b;
                int i2 = 0;
                if (j < ((long) i)) {
                    batw batw4 = this.a;
                    if (batw4 != null) {
                        batw = batw4.g;
                    } else {
                        batw = null;
                    }
                    if (batw != null && batw.e) {
                        if ((((long) batw.c) + j) - ((long) (!batw.d ? batw.b : 0)) <= 8192) {
                            batw3.a(batw, (int) j);
                            batd.b -= j;
                            this.b += j;
                            return;
                        }
                    }
                    int i3 = (int) j;
                    if (i3 <= 0 || i3 > i) {
                        throw new IllegalArgumentException();
                    }
                    if (i3 < 1024) {
                        batw2 = batx.a();
                        System.arraycopy(batw3.a, batw3.b, batw2.a, 0, i3);
                    } else {
                        batw2 = batw3.a();
                    }
                    batw2.c = batw2.b + i3;
                    batw3.b += i3;
                    batw3.g.a(batw2);
                    batd.a = batw2;
                }
                batw batw5 = batd.a;
                long j2 = (long) (batw5.c - batw5.b);
                batd.a = batw5.b();
                batw batw6 = this.a;
                if (batw6 == null) {
                    this.a = batw5;
                    batw5.g = batw5;
                    batw5.f = batw5;
                } else {
                    batw6.g.a(batw5);
                    batw batw7 = batw5.g;
                    if (batw7 == batw5) {
                        throw new IllegalStateException();
                    } else if (batw7.e) {
                        int i4 = batw5.c - batw5.b;
                        int i5 = 8192 - batw7.c;
                        if (!batw7.d) {
                            i2 = batw7.b;
                        }
                        if (i4 <= i5 + i2) {
                            batw5.a(batw7, i4);
                            batw5.b();
                            batx.a(batw5);
                        }
                    }
                }
                batd.b -= j2;
                this.b += j2;
                j -= j2;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    public final void a(baua baua) {
        if (baua != null) {
            do {
            } while (baua.c(this, 8192) != -1);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    public final void b(String str) {
        a(str, 0, str.length());
    }

    public final void a(String str, int i, int i2) {
        char c2;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("beginIndex < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(48);
            sb2.append("endIndex < beginIndex: ");
            sb2.append(i2);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    batw a2 = a(1);
                    byte[] bArr = a2.a;
                    int i3 = a2.c - i;
                    int min = Math.min(i2, 8192 - i3);
                    bArr[i + i3] = (byte) charAt;
                    i++;
                    while (i < min) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i + i3] = (byte) charAt2;
                        i++;
                    }
                    int i4 = a2.c;
                    int i5 = (i3 + i) - i4;
                    a2.c = i4 + i5;
                    this.b += (long) i5;
                } else if (charAt < 2048) {
                    h((charAt >> 6) | 192);
                    h((int) (charAt & '?') | 128);
                    i++;
                } else if (charAt >= 55296 && charAt <= 57343) {
                    int i6 = i + 1;
                    if (i6 < i2) {
                        c2 = str.charAt(i6);
                    } else {
                        c2 = 0;
                    }
                    if (charAt <= 56319 && c2 >= 56320 && c2 <= 57343) {
                        int i7 = (((charAt & 10239) << 10) | (9215 & c2)) + 0;
                        h((i7 >> 18) | 240);
                        h(((i7 >> 12) & 63) | 128);
                        h(((i7 >> 6) & 63) | 128);
                        h((i7 & 63) | 128);
                        i += 2;
                    } else {
                        h(63);
                        i = i6;
                    }
                } else {
                    h((charAt >> 12) | 224);
                    h(((charAt >> 6) & 63) | 128);
                    h((int) (charAt & '?') | 128);
                    i++;
                }
            }
        } else {
            int length = str.length();
            StringBuilder sb3 = new StringBuilder(51);
            sb3.append("endIndex > string.length: ");
            sb3.append(i2);
            sb3.append(" > ");
            sb3.append(length);
            throw new IllegalArgumentException(sb3.toString());
        }
    }
}
