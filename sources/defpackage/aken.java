package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aken  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aken extends FilterInputStream {
    public int a;
    private final ArrayList b = new ArrayList();
    private int c = 0;
    private int d = 0;
    private int e = -1;
    private int f;
    private final byte[] g = new byte[1];

    public aken(InputStream inputStream) {
        super(inputStream);
    }

    private static void a(List list) {
        akem akem = akem.a;
        synchronized (akem.b) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                int size2 = akem.b.size();
                int i2 = akem.c;
                if (size2 == 8) {
                    break;
                }
                byte[] bArr = (byte[]) list.get(i);
                if (bArr != null && bArr.length == 16384) {
                    akem.b.add((byte[]) list.get(i));
                }
            }
        }
    }

    private static IOException b() {
        return new IOException("stream closed");
    }

    private static final byte[] c() {
        return akem.a.a();
    }

    public final int available() {
        if (this.in != null) {
            return (this.d - this.c) + this.in.available();
        }
        throw b();
    }

    public final void close() {
        if (this.in != null) {
            this.in.close();
            this.in = null;
        }
        a(this.b);
    }

    public final void mark(int i) {
        int i2;
        int i3 = this.a;
        if (i < i3) {
            i = i3;
        }
        if (this.e >= 0 && (i2 = this.c / 16384) > 0) {
            int i4 = i2 * 16384;
            List subList = this.b.subList(0, i2);
            a(subList);
            subList.clear();
            this.c -= i4;
            this.d -= i4;
        }
        this.e = this.c;
        this.f = i;
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        if (read(this.g, 0, 1) > 0) {
            return this.g[0] & 255;
        }
        return -1;
    }

    public final void reset() {
        int i = this.e;
        if (i >= 0) {
            this.c = i;
            return;
        }
        throw new IOException("mark has been invalidated");
    }

    public final long skip(long j) {
        if (this.in == null) {
            throw b();
        } else if (this.e < 0) {
            return this.in.skip(j);
        } else {
            int i = this.d;
            int i2 = this.c;
            long j2 = (long) (i - i2);
            if (j2 > j) {
                j2 = j;
            }
            this.c = (int) (((long) i2) + j2);
            long j3 = j - j2;
            while (true) {
                if (j3 > 0) {
                    if (this.c == this.b.size() * 16384) {
                        this.b.add(c());
                    }
                    int i3 = this.c;
                    int i4 = i3 / 16384;
                    int i5 = i3 - (i4 * 16384);
                    byte[] bArr = (byte[]) this.b.get(i4);
                    long j4 = (long) (((i4 + 1) * 16384) - this.c);
                    if (j3 <= j4) {
                        j4 = j3;
                    }
                    int read = this.in.read(bArr, i5, (int) j4);
                    if (read <= 0) {
                        break;
                    }
                    this.c += read;
                    this.d += read;
                    long j5 = (long) read;
                    j3 -= j5;
                    j2 += j5;
                    if (a()) {
                        if (j3 > 0) {
                            return j2 + this.in.skip(j3);
                        }
                    }
                } else {
                    break;
                }
            }
            return j2;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (this.in == null) {
            throw b();
        } else if (this.e == -1) {
            return this.in.read(bArr, i, i2);
        } else {
            int i3 = 0;
            if (i2 == 0) {
                return 0;
            }
            int i4 = i;
            int i5 = i2;
            while (i5 > 0) {
                int i6 = this.c;
                if (i6 >= this.d) {
                    break;
                }
                int i7 = i6 / 16384;
                int i8 = i6 - (i7 * 16384);
                byte[] bArr2 = (byte[]) this.b.get(i7);
                int i9 = (i7 + 1) * 16384;
                int i10 = this.d;
                if (i9 > i10) {
                    i9 = i10;
                }
                int i11 = i9 - this.c;
                if (i5 <= i11) {
                    i11 = i5;
                }
                System.arraycopy(bArr2, i8, bArr, i4, i11);
                i4 += i11;
                i5 -= i11;
                i3 += i11;
                this.c += i11;
            }
            int i12 = i2 - i3;
            int i13 = i + i3;
            while (true) {
                if (i12 > 0) {
                    if (this.c == this.b.size() * 16384) {
                        this.b.add(c());
                    }
                    int i14 = this.c;
                    int i15 = i14 / 16384;
                    int i16 = i14 - (i15 * 16384);
                    byte[] bArr3 = (byte[]) this.b.get(i15);
                    int i17 = ((i15 + 1) * 16384) - this.c;
                    if (i12 <= i17) {
                        i17 = i12;
                    }
                    int read = this.in.read(bArr3, i16, i17);
                    if (read <= 0) {
                        break;
                    }
                    System.arraycopy(bArr3, i16, bArr, i13, read);
                    this.c += read;
                    this.d += read;
                    i3 += read;
                    i13 += read;
                    i12 -= read;
                    if (a()) {
                        int read2 = this.in.read(bArr, i13, i12);
                        if (read2 > 0) {
                            i3 += read2;
                        }
                    }
                } else {
                    break;
                }
            }
            if (i3 != 0) {
                return i3;
            }
            return -1;
        }
    }

    private final boolean a() {
        if (this.d - this.e <= this.f) {
            return false;
        }
        this.e = -1;
        this.d = 0;
        this.c = 0;
        a(this.b);
        this.b.clear();
        return true;
    }
}
