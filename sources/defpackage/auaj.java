package defpackage;

import com.google.android.chimera.Service;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* renamed from: auaj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class auaj implements auek {
    private final byte[] a;
    private int b;
    private int c;
    private int d;
    private int e;

    public auaj() {
    }

    private final long A() {
        b(8);
        return C();
    }

    private final int B() {
        int i = this.b;
        byte[] bArr = this.a;
        this.b = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final long C() {
        int i = this.b;
        byte[] bArr = this.a;
        this.b = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    private final Object a(aufw aufw, Class cls, aubs aubs) {
        aufw aufw2 = aufw.DOUBLE;
        switch (aufw.ordinal()) {
            case 0:
                return Double.valueOf(d());
            case 1:
                return Float.valueOf(e());
            case 2:
                return Long.valueOf(g());
            case 3:
                return Long.valueOf(f());
            case 4:
                return Integer.valueOf(h());
            case 5:
                return Long.valueOf(i());
            case 6:
                return Integer.valueOf(j());
            case 7:
                return Boolean.valueOf(k());
            case 8:
                return m();
            case 10:
                return a(cls, aubs);
            case 11:
                return n();
            case 12:
                return Integer.valueOf(o());
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return Integer.valueOf(p());
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return Integer.valueOf(q());
            case Service.START_CONTINUATION_MASK:
                return Long.valueOf(r());
            case 16:
                return Integer.valueOf(s());
            case 17:
                return Long.valueOf(t());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final void b(int i) {
        if (i < 0 || i > this.c - this.b) {
            throw auda.a();
        }
    }

    private final Object c(aueq aueq, aubs aubs) {
        int w = w();
        b(w);
        int i = this.c;
        int i2 = this.b + w;
        this.c = i2;
        try {
            Object a2 = aueq.a();
            aueq.a(a2, this, aubs);
            aueq.d(a2);
            if (this.b == i2) {
                return a2;
            }
            throw auda.h();
        } finally {
            this.c = i;
        }
    }

    private final Object d(aueq aueq, aubs aubs) {
        int i = this.e;
        this.e = aufy.a(aufy.b(this.d), 4);
        try {
            Object a2 = aueq.a();
            aueq.a(a2, this, aubs);
            aueq.d(a2);
            if (this.d == this.e) {
                return a2;
            }
            throw auda.h();
        } finally {
            this.e = i;
        }
    }

    private final void e(int i) {
        b(i);
        if ((i & 3) != 0) {
            throw auda.h();
        }
    }

    private final void f(int i) {
        if (this.b != i) {
            throw auda.a();
        }
    }

    private final boolean v() {
        return this.b == this.c;
    }

    private final int w() {
        byte b2;
        int i = this.b;
        int i2 = this.c;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.a;
            byte b3 = bArr[i];
            if (b3 >= 0) {
                this.b = i3;
                return b3;
            } else if (i2 - i3 < 9) {
                return (int) x();
            } else {
                int i4 = i3 + 1;
                byte b4 = b3 ^ (bArr[i3] << 7);
                if (b4 >= 0) {
                    int i5 = i4 + 1;
                    byte b5 = b4 ^ (bArr[i4] << 14);
                    if (b5 < 0) {
                        i4 = i5 + 1;
                        byte b6 = b5 ^ (bArr[i5] << 21);
                        if (b6 >= 0) {
                            i5 = i4 + 1;
                            byte b7 = bArr[i4];
                            b2 = (b6 ^ (b7 << 28)) ^ 266354560;
                            if (b7 < 0) {
                                i4 = i5 + 1;
                                if (bArr[i5] < 0) {
                                    i5 = i4 + 1;
                                    if (bArr[i4] < 0) {
                                        i4 = i5 + 1;
                                        if (bArr[i5] < 0) {
                                            i5 = i4 + 1;
                                            if (bArr[i4] < 0) {
                                                i4 = i5 + 1;
                                                if (bArr[i5] < 0) {
                                                    throw auda.c();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            b2 = b6 ^ -2080896;
                        }
                    } else {
                        b2 = b5 ^ 16256;
                    }
                    i4 = i5;
                } else {
                    b2 = b4 ^ Byte.MIN_VALUE;
                }
                this.b = i4;
                return b2;
            }
        } else {
            throw auda.a();
        }
    }

    private final long x() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte y = y();
            j |= ((long) (y & Byte.MAX_VALUE)) << i;
            if ((y & 128) == 0) {
                return j;
            }
        }
        throw auda.c();
    }

    private final byte y() {
        int i = this.b;
        if (i != this.c) {
            byte[] bArr = this.a;
            this.b = i + 1;
            return bArr[i];
        }
        throw auda.a();
    }

    private final int z() {
        b(4);
        return B();
    }

    public final int b() {
        return this.d;
    }

    public final long g() {
        c(0);
        return u();
    }

    public final int h() {
        c(0);
        return w();
    }

    public final long i() {
        c(1);
        return A();
    }

    public final int j() {
        c(5);
        return z();
    }

    public final void k(List list) {
        int i;
        if (aufy.a(this.d) == 2) {
            do {
                list.add(n());
                if (!v()) {
                    i = this.b;
                } else {
                    return;
                }
            } while (w() == this.d);
            this.b = i;
            return;
        }
        throw auda.f();
    }

    public final String l() {
        return a(false);
    }

    public final String m() {
        return a(true);
    }

    public final auay n() {
        c(2);
        int w = w();
        if (w == 0) {
            return auay.b;
        }
        b(w);
        auay b2 = auay.b(this.a, this.b, w);
        this.b += w;
        return b2;
    }

    public final int o() {
        c(0);
        return w();
    }

    public final int p() {
        c(0);
        return w();
    }

    public final int q() {
        c(5);
        return z();
    }

    public final long r() {
        c(1);
        return A();
    }

    public final int s() {
        c(0);
        return aubc.g(w());
    }

    public final long t() {
        c(0);
        return aubc.a(u());
    }

    public final long u() {
        int i;
        long j;
        byte b2;
        long j2;
        long j3;
        int i2 = this.b;
        int i3 = this.c;
        if (i3 != i2) {
            byte[] bArr = this.a;
            int i4 = i2 + 1;
            byte b3 = bArr[i2];
            if (b3 >= 0) {
                this.b = i4;
                return (long) b3;
            } else if (i3 - i4 < 9) {
                return x();
            } else {
                int i5 = i4 + 1;
                byte b4 = b3 ^ (bArr[i4] << 7);
                if (b4 >= 0) {
                    i = i5 + 1;
                    byte b5 = b4 ^ (bArr[i5] << 14);
                    if (b5 < 0) {
                        i5 = i + 1;
                        byte b6 = b5 ^ (bArr[i] << 21);
                        if (b6 >= 0) {
                            i = i5 + 1;
                            long j4 = (((long) bArr[i5]) << 28) ^ ((long) b6);
                            if (j4 < 0) {
                                int i6 = i + 1;
                                long j5 = j4 ^ (((long) bArr[i]) << 35);
                                if (j5 >= 0) {
                                    i = i6 + 1;
                                    j4 = j5 ^ (((long) bArr[i6]) << 42);
                                    if (j4 < 0) {
                                        i6 = i + 1;
                                        j5 = j4 ^ (((long) bArr[i]) << 49);
                                        if (j5 >= 0) {
                                            i = i6 + 1;
                                            j = (j5 ^ (((long) bArr[i6]) << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                i6 = i + 1;
                                                if (((long) bArr[i]) < 0) {
                                                    throw auda.c();
                                                }
                                                i = i6;
                                            }
                                        } else {
                                            j3 = -558586000294016L;
                                        }
                                    } else {
                                        j2 = 4363953127296L;
                                    }
                                } else {
                                    j3 = -34093383808L;
                                }
                                j = j5 ^ j3;
                                i = i6;
                            } else {
                                j2 = 266354560;
                            }
                            j = j4 ^ j2;
                        } else {
                            b2 = b6 ^ -2080896;
                        }
                    } else {
                        j = (long) (b5 ^ 16256);
                    }
                    this.b = i;
                    return j;
                }
                b2 = b4 ^ Byte.MIN_VALUE;
                i = i5;
                j = (long) b2;
                this.b = i;
                return j;
            }
        } else {
            throw auda.a();
        }
    }

    public final long f() {
        c(0);
        return u();
    }

    public final void g(List list) {
        int i;
        int i2;
        if (list instanceof aucl) {
            aucl aucl = (aucl) list;
            int a2 = aufy.a(this.d);
            if (a2 == 2) {
                int w = w();
                e(w);
                int i3 = this.b + w;
                while (this.b < i3) {
                    aucl.d(B());
                }
            } else if (a2 == 5) {
                do {
                    aucl.d(j());
                    if (!v()) {
                        i2 = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i2;
            } else {
                throw auda.f();
            }
        } else {
            int a3 = aufy.a(this.d);
            if (a3 == 2) {
                int w2 = w();
                e(w2);
                int i4 = this.b + w2;
                while (this.b < i4) {
                    list.add(Integer.valueOf(B()));
                }
            } else if (a3 == 5) {
                do {
                    list.add(Integer.valueOf(j()));
                    if (!v()) {
                        i = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i;
            } else {
                throw auda.f();
            }
        }
    }

    public final void h(List list) {
        int i;
        int i2;
        if (list instanceof aual) {
            aual aual = (aual) list;
            int a2 = aufy.a(this.d);
            if (a2 == 0) {
                do {
                    aual.a(k());
                    if (!v()) {
                        i2 = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i2;
            } else if (a2 == 2) {
                int w = this.b + w();
                while (this.b < w) {
                    aual.a(w() != 0);
                }
                f(w);
            } else {
                throw auda.f();
            }
        } else {
            int a3 = aufy.a(this.d);
            if (a3 == 0) {
                do {
                    list.add(Boolean.valueOf(k()));
                    if (!v()) {
                        i = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i;
            } else if (a3 == 2) {
                int w2 = this.b + w();
                while (this.b < w2) {
                    list.add(Boolean.valueOf(w() != 0));
                }
                f(w2);
            } else {
                throw auda.f();
            }
        }
    }

    public final void i(List list) {
        a(list, false);
    }

    public final void j(List list) {
        a(list, true);
    }

    public final void l(List list) {
        int i;
        int i2;
        if (list instanceof aucl) {
            aucl aucl = (aucl) list;
            int a2 = aufy.a(this.d);
            if (a2 == 0) {
                do {
                    aucl.d(o());
                    if (!v()) {
                        i2 = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i2;
            } else if (a2 == 2) {
                int w = this.b + w();
                while (this.b < w) {
                    aucl.d(w());
                }
            } else {
                throw auda.f();
            }
        } else {
            int a3 = aufy.a(this.d);
            if (a3 == 0) {
                do {
                    list.add(Integer.valueOf(o()));
                    if (!v()) {
                        i = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i;
            } else if (a3 == 2) {
                int w2 = this.b + w();
                while (this.b < w2) {
                    list.add(Integer.valueOf(w()));
                }
            } else {
                throw auda.f();
            }
        }
    }

    public final void m(List list) {
        int i;
        int i2;
        if (list instanceof aucl) {
            aucl aucl = (aucl) list;
            int a2 = aufy.a(this.d);
            if (a2 == 0) {
                do {
                    aucl.d(p());
                    if (!v()) {
                        i2 = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i2;
            } else if (a2 == 2) {
                int w = this.b + w();
                while (this.b < w) {
                    aucl.d(w());
                }
            } else {
                throw auda.f();
            }
        } else {
            int a3 = aufy.a(this.d);
            if (a3 == 0) {
                do {
                    list.add(Integer.valueOf(p()));
                    if (!v()) {
                        i = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i;
            } else if (a3 == 2) {
                int w2 = this.b + w();
                while (this.b < w2) {
                    list.add(Integer.valueOf(w()));
                }
            } else {
                throw auda.f();
            }
        }
    }

    public final void o(List list) {
        int i;
        int i2;
        if (list instanceof audl) {
            audl audl = (audl) list;
            int a2 = aufy.a(this.d);
            if (a2 == 1) {
                do {
                    audl.a(r());
                    if (!v()) {
                        i2 = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i2;
            } else if (a2 == 2) {
                int w = w();
                d(w);
                int i3 = this.b + w;
                while (this.b < i3) {
                    audl.a(C());
                }
            } else {
                throw auda.f();
            }
        } else {
            int a3 = aufy.a(this.d);
            if (a3 == 1) {
                do {
                    list.add(Long.valueOf(r()));
                    if (!v()) {
                        i = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i;
            } else if (a3 == 2) {
                int w2 = w();
                d(w2);
                int i4 = this.b + w2;
                while (this.b < i4) {
                    list.add(Long.valueOf(C()));
                }
            } else {
                throw auda.f();
            }
        }
    }

    public final void p(List list) {
        int i;
        int i2;
        if (list instanceof aucl) {
            aucl aucl = (aucl) list;
            int a2 = aufy.a(this.d);
            if (a2 == 0) {
                do {
                    aucl.d(s());
                    if (!v()) {
                        i2 = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i2;
            } else if (a2 == 2) {
                int w = this.b + w();
                while (this.b < w) {
                    aucl.d(aubc.g(w()));
                }
            } else {
                throw auda.f();
            }
        } else {
            int a3 = aufy.a(this.d);
            if (a3 == 0) {
                do {
                    list.add(Integer.valueOf(s()));
                    if (!v()) {
                        i = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i;
            } else if (a3 == 2) {
                int w2 = this.b + w();
                while (this.b < w2) {
                    list.add(Integer.valueOf(aubc.g(w())));
                }
            } else {
                throw auda.f();
            }
        }
    }

    public final void q(List list) {
        int i;
        int i2;
        if (list instanceof audl) {
            audl audl = (audl) list;
            int a2 = aufy.a(this.d);
            if (a2 == 0) {
                do {
                    audl.a(t());
                    if (!v()) {
                        i2 = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i2;
            } else if (a2 == 2) {
                int w = this.b + w();
                while (this.b < w) {
                    audl.a(aubc.a(u()));
                }
            } else {
                throw auda.f();
            }
        } else {
            int a3 = aufy.a(this.d);
            if (a3 == 0) {
                do {
                    list.add(Long.valueOf(t()));
                    if (!v()) {
                        i = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i;
            } else if (a3 == 2) {
                int w2 = this.b + w();
                while (this.b < w2) {
                    list.add(Long.valueOf(aubc.a(u())));
                }
            } else {
                throw auda.f();
            }
        }
    }

    public auaj(ByteBuffer byteBuffer) {
        this.a = byteBuffer.array();
        this.b = byteBuffer.arrayOffset() + byteBuffer.position();
        this.c = byteBuffer.arrayOffset() + byteBuffer.limit();
    }

    public final Object b(aueq aueq, aubs aubs) {
        c(3);
        return d(aueq, aubs);
    }

    public final float e() {
        c(5);
        return Float.intBitsToFloat(z());
    }

    public final void f(List list) {
        int i;
        int i2;
        if (list instanceof audl) {
            audl audl = (audl) list;
            int a2 = aufy.a(this.d);
            if (a2 == 1) {
                do {
                    audl.a(i());
                    if (!v()) {
                        i2 = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i2;
            } else if (a2 == 2) {
                int w = w();
                d(w);
                int i3 = this.b + w;
                while (this.b < i3) {
                    audl.a(C());
                }
            } else {
                throw auda.f();
            }
        } else {
            int a3 = aufy.a(this.d);
            if (a3 == 1) {
                do {
                    list.add(Long.valueOf(i()));
                    if (!v()) {
                        i = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i;
            } else if (a3 == 2) {
                int w2 = w();
                d(w2);
                int i4 = this.b + w2;
                while (this.b < i4) {
                    list.add(Long.valueOf(C()));
                }
            } else {
                throw auda.f();
            }
        }
    }

    public final Object b(Class cls, aubs aubs) {
        c(3);
        return d(aueh.a.a(cls), aubs);
    }

    public final void e(List list) {
        int i;
        int i2;
        if (list instanceof aucl) {
            aucl aucl = (aucl) list;
            int a2 = aufy.a(this.d);
            if (a2 == 0) {
                do {
                    aucl.d(h());
                    if (!v()) {
                        i2 = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i2;
            } else if (a2 == 2) {
                int w = this.b + w();
                while (this.b < w) {
                    aucl.d(w());
                }
                f(w);
            } else {
                throw auda.f();
            }
        } else {
            int a3 = aufy.a(this.d);
            if (a3 == 0) {
                do {
                    list.add(Integer.valueOf(h()));
                    if (!v()) {
                        i = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i;
            } else if (a3 == 2) {
                int w2 = this.b + w();
                while (this.b < w2) {
                    list.add(Integer.valueOf(w()));
                }
                f(w2);
            } else {
                throw auda.f();
            }
        }
    }

    private final void c(int i) {
        if (aufy.a(this.d) != i) {
            throw auda.f();
        }
    }

    private final void d(int i) {
        b(i);
        if ((i & 7) != 0) {
            throw auda.h();
        }
    }

    public final void b(List list) {
        int i;
        int i2;
        if (list instanceof aubz) {
            aubz aubz = (aubz) list;
            int a2 = aufy.a(this.d);
            if (a2 == 2) {
                int w = w();
                e(w);
                int i3 = this.b + w;
                while (this.b < i3) {
                    aubz.a(Float.intBitsToFloat(B()));
                }
            } else if (a2 == 5) {
                do {
                    aubz.a(e());
                    if (!v()) {
                        i2 = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i2;
            } else {
                throw auda.f();
            }
        } else {
            int a3 = aufy.a(this.d);
            if (a3 == 2) {
                int w2 = w();
                e(w2);
                int i4 = this.b + w2;
                while (this.b < i4) {
                    list.add(Float.valueOf(Float.intBitsToFloat(B())));
                }
            } else if (a3 == 5) {
                do {
                    list.add(Float.valueOf(e()));
                    if (!v()) {
                        i = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i;
            } else {
                throw auda.f();
            }
        }
    }

    public final void n(List list) {
        int i;
        int i2;
        if (list instanceof aucl) {
            aucl aucl = (aucl) list;
            int a2 = aufy.a(this.d);
            if (a2 == 2) {
                int w = w();
                e(w);
                int i3 = this.b + w;
                while (this.b < i3) {
                    aucl.d(B());
                }
            } else if (a2 == 5) {
                do {
                    aucl.d(q());
                    if (!v()) {
                        i2 = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i2;
            } else {
                throw auda.f();
            }
        } else {
            int a3 = aufy.a(this.d);
            if (a3 == 2) {
                int w2 = w();
                e(w2);
                int i4 = this.b + w2;
                while (this.b < i4) {
                    list.add(Integer.valueOf(B()));
                }
            } else if (a3 == 5) {
                do {
                    list.add(Integer.valueOf(q()));
                    if (!v()) {
                        i = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i;
            } else {
                throw auda.f();
            }
        }
    }

    public final void c(List list) {
        int i;
        int i2;
        if (list instanceof audl) {
            audl audl = (audl) list;
            int a2 = aufy.a(this.d);
            if (a2 == 0) {
                do {
                    audl.a(f());
                    if (!v()) {
                        i2 = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i2;
            } else if (a2 == 2) {
                int w = this.b + w();
                while (this.b < w) {
                    audl.a(u());
                }
                f(w);
            } else {
                throw auda.f();
            }
        } else {
            int a3 = aufy.a(this.d);
            if (a3 == 0) {
                do {
                    list.add(Long.valueOf(f()));
                    if (!v()) {
                        i = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i;
            } else if (a3 == 2) {
                int w2 = this.b + w();
                while (this.b < w2) {
                    list.add(Long.valueOf(u()));
                }
                f(w2);
            } else {
                throw auda.f();
            }
        }
    }

    public final boolean k() {
        c(0);
        return w() != 0;
    }

    public final double d() {
        c(1);
        return Double.longBitsToDouble(A());
    }

    public final void d(List list) {
        int i;
        int i2;
        if (list instanceof audl) {
            audl audl = (audl) list;
            int a2 = aufy.a(this.d);
            if (a2 == 0) {
                do {
                    audl.a(g());
                    if (!v()) {
                        i2 = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i2;
            } else if (a2 == 2) {
                int w = this.b + w();
                while (this.b < w) {
                    audl.a(u());
                }
                f(w);
            } else {
                throw auda.f();
            }
        } else {
            int a3 = aufy.a(this.d);
            if (a3 == 0) {
                do {
                    list.add(Long.valueOf(g()));
                    if (!v()) {
                        i = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i;
            } else if (a3 == 2) {
                int w2 = this.b + w();
                while (this.b < w2) {
                    list.add(Long.valueOf(u()));
                }
                f(w2);
            } else {
                throw auda.f();
            }
        }
    }

    public final void b(List list, aueq aueq, aubs aubs) {
        int i;
        if (aufy.a(this.d) == 3) {
            int i2 = this.d;
            do {
                list.add(d(aueq, aubs));
                if (!v()) {
                    i = this.b;
                } else {
                    return;
                }
            } while (w() == i2);
            this.b = i;
            return;
        }
        throw auda.f();
    }

    private final void a(int i) {
        b(i);
        this.b += i;
    }

    public final int a() {
        if (!v()) {
            int w = w();
            this.d = w;
            if (w != this.e) {
                return aufy.b(w);
            }
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038 A[LOOP:0: B:18:0x0038->B:21:0x0046, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
            r7 = this;
            boolean r0 = r7.v()
            r1 = 0
            if (r0 != 0) goto L_0x0093
            int r0 = r7.d
            int r2 = r7.e
            if (r0 == r2) goto L_0x0093
            int r0 = defpackage.aufy.a(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0065
            if (r0 == r2) goto L_0x005f
            r1 = 2
            if (r0 == r1) goto L_0x0057
            r1 = 3
            r3 = 4
            if (r0 == r1) goto L_0x002a
            r1 = 5
            if (r0 != r1) goto L_0x0025
            r7.a((int) r3)
            return r2
        L_0x0025:
            aucz r0 = defpackage.auda.f()
            throw r0
        L_0x002a:
            int r0 = r7.e
            int r1 = r7.d
            int r1 = defpackage.aufy.b(r1)
            int r1 = defpackage.aufy.a(r1, r3)
            r7.e = r1
        L_0x0038:
            int r1 = r7.a()
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r3) goto L_0x0042
        L_0x0041:
            goto L_0x0049
        L_0x0042:
            boolean r1 = r7.c()
            if (r1 != 0) goto L_0x0038
            goto L_0x0041
        L_0x0049:
            int r1 = r7.d
            int r3 = r7.e
            if (r1 != r3) goto L_0x0052
            r7.e = r0
            return r2
        L_0x0052:
            auda r0 = defpackage.auda.h()
            throw r0
        L_0x0057:
            int r0 = r7.w()
            r7.a((int) r0)
            return r2
        L_0x005f:
            r0 = 8
            r7.a((int) r0)
            return r2
        L_0x0065:
            int r0 = r7.c
            int r3 = r7.b
            int r0 = r0 - r3
            r4 = 10
            if (r0 < r4) goto L_0x0081
            byte[] r0 = r7.a
            r5 = 0
        L_0x0071:
            if (r5 >= r4) goto L_0x0080
            int r6 = r3 + 1
            byte r3 = r0[r3]
            if (r3 >= 0) goto L_0x007d
            int r5 = r5 + 1
            r3 = r6
            goto L_0x0071
        L_0x007d:
            r7.b = r6
            goto L_0x008d
        L_0x0080:
            goto L_0x0082
        L_0x0081:
        L_0x0082:
            if (r1 >= r4) goto L_0x008e
            byte r0 = r7.y()
            if (r0 >= 0) goto L_0x008d
            int r1 = r1 + 1
            goto L_0x0082
        L_0x008d:
            return r2
        L_0x008e:
            auda r0 = defpackage.auda.c()
            throw r0
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auaj.c():boolean");
    }

    public final Object a(aueq aueq, aubs aubs) {
        c(2);
        return c(aueq, aubs);
    }

    public final Object a(Class cls, aubs aubs) {
        c(2);
        return c(aueh.a.a(cls), aubs);
    }

    public final String a(boolean z) {
        c(2);
        int w = w();
        if (w == 0) {
            return "";
        }
        b(w);
        if (z) {
            byte[] bArr = this.a;
            int i = this.b;
            if (!aufv.a(bArr, i, i + w)) {
                throw auda.i();
            }
        }
        String str = new String(this.a, this.b, w, aucy.a);
        this.b += w;
        return str;
    }

    public final void a(List list) {
        int i;
        int i2;
        if (list instanceof aubm) {
            aubm aubm = (aubm) list;
            int a2 = aufy.a(this.d);
            if (a2 == 1) {
                do {
                    aubm.a(d());
                    if (!v()) {
                        i2 = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i2;
            } else if (a2 == 2) {
                int w = w();
                d(w);
                int i3 = this.b + w;
                while (this.b < i3) {
                    aubm.a(Double.longBitsToDouble(C()));
                }
            } else {
                throw auda.f();
            }
        } else {
            int a3 = aufy.a(this.d);
            if (a3 == 1) {
                do {
                    list.add(Double.valueOf(d()));
                    if (!v()) {
                        i = this.b;
                    } else {
                        return;
                    }
                } while (w() == this.d);
                this.b = i;
            } else if (a3 == 2) {
                int w2 = w();
                d(w2);
                int i4 = this.b + w2;
                while (this.b < i4) {
                    list.add(Double.valueOf(Double.longBitsToDouble(C())));
                }
            } else {
                throw auda.f();
            }
        }
    }

    public final void a(List list, aueq aueq, aubs aubs) {
        int i;
        if (aufy.a(this.d) == 2) {
            int i2 = this.d;
            do {
                list.add(c(aueq, aubs));
                if (!v()) {
                    i = this.b;
                } else {
                    return;
                }
            } while (w() == i2);
            this.b = i;
            return;
        }
        throw auda.f();
    }

    public final void a(List list, boolean z) {
        int i;
        int i2;
        if (aufy.a(this.d) != 2) {
            throw auda.f();
        } else if ((list instanceof audh) && !z) {
            audh audh = (audh) list;
            do {
                audh.a(n());
                if (!v()) {
                    i2 = this.b;
                } else {
                    return;
                }
            } while (w() == this.d);
            this.b = i2;
        } else {
            do {
                list.add(a(z));
                if (!v()) {
                    i = this.b;
                } else {
                    return;
                }
            } while (w() == this.d);
            this.b = i;
        }
    }

    public final void a(Map map, audp audp, aubs aubs) {
        c(2);
        int w = w();
        b(w);
        int i = this.c;
        this.c = this.b + w;
        try {
            Object obj = audp.b;
            Object obj2 = audp.d;
            while (true) {
                int a2 = a();
                if (a2 == Integer.MAX_VALUE) {
                    map.put(obj, obj2);
                    this.c = i;
                    return;
                } else if (a2 == 1) {
                    obj = a(audp.a, (Class) null, (aubs) null);
                } else if (a2 == 2) {
                    obj2 = a(audp.c, (Class) audp.d.getClass(), aubs);
                } else if (!c()) {
                    throw new auda("Unable to parse map entry.");
                }
            }
        } catch (aucz e2) {
            if (!c()) {
                throw new auda("Unable to parse map entry.");
            }
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }
}
