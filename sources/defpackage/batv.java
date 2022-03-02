package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: batv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class batv implements batf {
    public final batd a = new batd();
    public final baua b;
    public boolean c;

    public batv(baua baua) {
        if (baua != null) {
            this.b = baua;
            return;
        }
        throw new NullPointerException("source == null");
    }

    public final long a(byte b2) {
        if (!this.c) {
            long j = 0;
            while (j < Long.MAX_VALUE) {
                long a2 = this.a.a(b2, j);
                if (a2 != -1) {
                    return a2;
                }
                batd batd = this.a;
                long j2 = batd.b;
                if (j2 >= Long.MAX_VALUE || this.b.c(batd, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, j2);
            }
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    public final boolean b() {
        if (!this.c) {
            return this.a.b() && this.b.c(this.a, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    public final bauc bu() {
        return this.b.bu();
    }

    public final long c(batd batd, long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(35);
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.c) {
            batd batd2 = this.a;
            if (batd2.b == 0 && this.b.c(batd2, 8192) == -1) {
                return -1;
            }
            return this.a.c(batd, Math.min(j, this.a.b));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final void close() {
        if (!this.c) {
            this.c = true;
            this.b.close();
            this.a.n();
        }
    }

    public final batg d(long j) {
        a(j);
        return new batg(this.a.g(j));
    }

    public final byte e() {
        a(1);
        return this.a.e();
    }

    public final short f() {
        a(2);
        return this.a.f();
    }

    public final int g() {
        a(4);
        return this.a.g();
    }

    public final void h(long j) {
        if (!this.c) {
            while (j > 0) {
                batd batd = this.a;
                if (batd.b == 0 && this.b.c(batd, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.a.b);
                this.a.h(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final int i() {
        a(4);
        return baud.a(this.a.g());
    }

    public final boolean isOpen() {
        return !this.c;
    }

    public final long q() {
        return a((byte) 0);
    }

    public final int read(ByteBuffer byteBuffer) {
        batd batd = this.a;
        if (batd.b == 0 && this.b.c(batd, 8192) == -1) {
            return -1;
        }
        return this.a.read(byteBuffer);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("buffer(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    public final boolean b(long j) {
        batd batd;
        if (j < 0) {
            StringBuilder sb = new StringBuilder(35);
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.c) {
            do {
                batd = this.a;
                if (batd.b >= j) {
                    return true;
                }
            } while (this.b.c(batd, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final byte[] g(long j) {
        a(j);
        return this.a.g(j);
    }

    public final String l() {
        long a2 = a((byte) 10);
        if (a2 != -1) {
            return this.a.f(a2);
        }
        batd batd = new batd();
        batd batd2 = this.a;
        batd2.b(batd, Math.min(32, batd2.b));
        long min = Math.min(this.a.b, Long.MAX_VALUE);
        String c2 = batd.j().c();
        StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 50);
        sb.append("\\n not found: limit=");
        sb.append(min);
        sb.append(" content=");
        sb.append(c2);
        sb.append(8230);
        throw new EOFException(sb.toString());
    }

    public final long a(batg batg) {
        long j;
        long j2;
        int i;
        batg batg2 = batg;
        if (!this.c) {
            long j3 = 0;
            long j4 = 0;
            while (true) {
                batd batd = this.a;
                if (j4 >= j3) {
                    batw batw = batd.a;
                    if (batw != null) {
                        long j5 = batd.b;
                        if (j5 - j4 >= j4) {
                            j2 = j3;
                            while (true) {
                                long j6 = ((long) (batw.c - batw.b)) + j2;
                                if (j6 >= j4) {
                                    break;
                                }
                                batw = batw.f;
                                j2 = j6;
                            }
                        } else {
                            while (j2 > j4) {
                                batw = batw.g;
                                j5 = j2 - ((long) (batw.c - batw.b));
                            }
                        }
                        if (batg.e() != 2) {
                            byte[] bArr = batg2.c;
                            long j7 = j4;
                            while (true) {
                                if (j2 >= batd.b) {
                                    j = -1;
                                    break;
                                }
                                byte[] bArr2 = batw.a;
                                int i2 = batw.c;
                                for (int i3 = (int) ((((long) batw.b) + j7) - j2); i3 < i2; i3++) {
                                    byte b2 = bArr2[i3];
                                    for (byte b3 : bArr) {
                                        if (b2 == b3) {
                                            j = ((long) (i3 - batw.b)) + j2;
                                            break;
                                        }
                                    }
                                }
                                j7 = ((long) (batw.c - batw.b)) + j2;
                                batw = batw.f;
                                j2 = j7;
                            }
                        } else {
                            byte a2 = batg2.a(0);
                            byte a3 = batg2.a(1);
                            long j8 = j4;
                            while (true) {
                                if (j2 >= batd.b) {
                                    j = -1;
                                    break;
                                }
                                byte[] bArr3 = batw.a;
                                i = (int) ((((long) batw.b) + j8) - j2);
                                int i4 = batw.c;
                                while (i < i4) {
                                    byte b4 = bArr3[i];
                                    if (!(b4 == a2 || b4 == a3)) {
                                        i++;
                                    }
                                }
                                j8 = j2 + ((long) (batw.c - batw.b));
                                batw = batw.f;
                                j2 = j8;
                            }
                            j = ((long) (i - batw.b)) + j2;
                        }
                    } else {
                        j = -1;
                    }
                    if (j != -1) {
                        return j;
                    }
                    batd batd2 = this.a;
                    long j9 = batd2.b;
                    if (this.b.c(batd2, 8192) == -1) {
                        return -1;
                    }
                    j4 = Math.max(j4, j9);
                    j3 = 0;
                } else {
                    throw new IllegalArgumentException("fromIndex < 0");
                }
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final InputStream c() {
        return new batu(this);
    }

    public final void a(long j) {
        if (!b(j)) {
            throw new EOFException();
        }
    }
}
