package defpackage;

import java.io.InputStream;

/* renamed from: aueo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aueo extends InputStream {
    final /* synthetic */ auep a;
    private auen b;
    private auau c;
    private int d;
    private int e;
    private int f;
    private int g;

    public aueo(auep auep) {
        this.a = auep;
        a();
    }

    private final int a(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            b();
            if (this.c == null) {
                break;
            }
            int min = Math.min(this.d - this.e, i3);
            if (bArr != null) {
                this.c.b(bArr, this.e, i, min);
                i += min;
            }
            this.e += min;
            i3 -= min;
        }
        return i2 - i3;
    }

    private final void b() {
        int i;
        if (this.c != null && this.e == (i = this.d)) {
            this.f += i;
            int i2 = 0;
            this.e = 0;
            if (this.b.hasNext()) {
                auau a2 = this.b.next();
                this.c = a2;
                i2 = a2.a();
            } else {
                this.c = null;
            }
            this.d = i2;
        }
    }

    public final int available() {
        return this.a.d - (this.f + this.e);
    }

    public final void mark(int i) {
        this.g = this.f + this.e;
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        b();
        auau auau = this.c;
        if (auau == null) {
            return -1;
        }
        int i = this.e;
        this.e = i + 1;
        return auau.a(i) & 255;
    }

    public final synchronized void reset() {
        a();
        a((byte[]) null, 0, this.g);
    }

    public final long skip(long j) {
        if (j >= 0) {
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return (long) a((byte[]) null, 0, (int) j);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw null;
        } else if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else {
            int a2 = a(bArr, i, i2);
            if (a2 == 0) {
                return -1;
            }
            return a2;
        }
    }

    private final void a() {
        auen auen = new auen(this.a);
        this.b = auen;
        auau a2 = auen.next();
        this.c = a2;
        this.d = a2.a();
        this.e = 0;
        this.f = 0;
    }
}
