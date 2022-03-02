package defpackage;

import java.nio.ByteBuffer;

/* renamed from: aecw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aecw {
    public int a = 0;
    private final aect b;
    private aecv c = null;

    public aecw(aect aect) {
        this.b = aect;
    }

    private static int a(long j) {
        int i = (int) j;
        if (((long) i) == j) {
            return i;
        }
        throw new ArithmeticException("integer overflow");
    }

    public final byte[] b() {
        aecv aecv = this.c;
        if (aecv == null || this.b.a == 0) {
            return null;
        }
        try {
            this.a = aecv.a();
            while (true) {
                try {
                    int i = this.a + e().c;
                    if (i > this.b.a) {
                        break;
                    }
                    this.a = i;
                } catch (IndexOutOfBoundsException e) {
                }
            }
            int a2 = this.a - this.c.a();
            if (a2 != 0) {
                aecv aecv2 = this.c;
                ByteBuffer a3 = a((aecv2.b << 3) + aecv2.a);
                ByteBuffer a4 = a(a2);
                byte[] bArr = new byte[(a3.position() + a4.position() + a2)];
                System.arraycopy(a3.array(), 0, bArr, 0, a3.position());
                System.arraycopy(a4.array(), 0, bArr, a3.position(), a4.position());
                this.b.a(this.c.a(), bArr, a3.position() + a4.position(), a2);
                int i2 = this.c.e - a2;
                if (i2 > 0) {
                    ByteBuffer a5 = a(i2);
                    int position = this.a - (a3.position() + a5.position());
                    this.a = position;
                    this.b.a(position, a3.array(), a3.position());
                    this.b.a(this.a + a3.position(), a5.array(), a5.position());
                }
                d();
                this.b.a();
                return bArr;
            }
            this.a = this.c.d;
            return null;
        } catch (aecu | NoSuchMethodException e2) {
            this.a = this.c.d;
            return null;
        }
    }

    public final boolean c() {
        aecv aecv = this.c;
        if (aecv == null || this.b.a == 0) {
            return false;
        }
        try {
            int i = aecv.c;
            do {
                int i2 = this.b.a;
                int i3 = this.a;
                int i4 = i2 - i3;
                this.a = i3 + Math.min(i, i4);
                d();
                if (i > i4) {
                    if (!this.b.a()) {
                        throw new aecu("Next proto field needs more data but reaches EOF");
                    }
                }
                i -= i4;
            } while (i > 0);
            return true;
        } catch (IndexOutOfBoundsException e) {
            throw new aecu("Failed to skip a field");
        }
    }

    public final void d() {
        aect aect = this.b;
        int i = this.a;
        int i2 = aect.a;
        if (i > i2) {
            i = i2;
        }
        aect.c = aect.b(i);
        aect.a -= i;
        this.a = 0;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final aecv e() {
        int i;
        int i2 = this.a;
        try {
            int a2 = a(f());
            int i3 = a2 >> 3;
            int i4 = a2 & 7;
            if (i4 == 0) {
                f();
                i = 0;
            } else if (i4 == 1) {
                this.a += 8;
                i = 0;
            } else if (i4 == 2) {
                int a3 = a(f());
                if (a3 >= 0) {
                    this.a += a3;
                    i = a3;
                } else {
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("Negative child size ");
                    sb.append(a3);
                    throw new aecu(sb.toString());
                }
            } else if (i4 == 5) {
                this.a += 4;
                i = 0;
            } else {
                StringBuilder sb2 = new StringBuilder(43);
                sb2.append("The wire type ");
                sb2.append(i4);
                sb2.append(" is not supported!");
                throw new aecu(sb2.toString());
            }
            aecv aecv = new aecv(i4, i3, this.a - i2, i2, i);
            this.a = i2;
            return aecv;
        } catch (Throwable th) {
            this.a = i2;
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final long f() {
        long j = 0;
        int i = 0;
        while (i <= 63) {
            byte a2 = this.b.a(this.a);
            this.a++;
            j += (((long) a2) & 127) << i;
            i += 7;
            if ((a2 & 128) == 0) {
                return j;
            }
        }
        throw new aecu("Varint is larger than 64 bits, bad data");
    }

    static ByteBuffer a(int i) {
        ByteBuffer allocate = ByteBuffer.allocate(5);
        while ((i & -128) != 0) {
            allocate.put((byte) ((i & 127) | 128));
            i >>>= 7;
        }
        allocate.put((byte) i);
        return allocate;
    }

    public final aecv a() {
        if (this.a != this.b.a) {
            try {
                aecv e = e();
                this.c = e;
                int i = this.a + e.c;
                if (i > this.b.a) {
                    return null;
                }
                this.a = i;
                return e;
            } catch (IndexOutOfBoundsException e2) {
            }
        }
        return null;
    }
}
