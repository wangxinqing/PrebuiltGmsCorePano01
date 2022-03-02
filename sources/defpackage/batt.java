package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: batt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class batt implements bate {
    public final batd a = new batd();
    public final batz b;
    public boolean c;

    public batt(batz batz) {
        if (batz != null) {
            this.b = batz;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    public final void a(batd batd, long j) {
        if (!this.c) {
            this.a.a(batd, j);
            p();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final void b(String str) {
        if (!this.c) {
            this.a.b(str);
            p();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final bauc bu() {
        return this.b.bu();
    }

    public final void c(batg batg) {
        if (!this.c) {
            this.a.b(batg);
            p();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final void close() {
        if (!this.c) {
            Throwable th = null;
            try {
                batd batd = this.a;
                long j = batd.b;
                if (j > 0) {
                    this.b.a(batd, j);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.c = true;
            if (th != null) {
                Charset charset = baud.a;
                throw th;
            }
        }
    }

    public final void e(int i) {
        if (!this.c) {
            this.a.d(i);
            p();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final void f(int i) {
        if (!this.c) {
            batd batd = this.a;
            batw a2 = batd.a(2);
            byte[] bArr = a2.a;
            int i2 = a2.c;
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((i >>> 8) & 255);
            bArr[i3] = (byte) (i & 255);
            a2.c = i3 + 1;
            batd.b += 2;
            p();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final void flush() {
        if (!this.c) {
            batd batd = this.a;
            long j = batd.b;
            if (j > 0) {
                this.b.a(batd, j);
            }
            this.b.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final void h(int i) {
        if (!this.c) {
            this.a.h(i);
            p();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final void i(long j) {
        if (!this.c) {
            this.a.i(j);
            p();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final boolean isOpen() {
        return !this.c;
    }

    public final void p() {
        if (!this.c) {
            long d = this.a.d();
            if (d > 0) {
                this.b.a(this.a, d);
                return;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("buffer(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    public final int write(ByteBuffer byteBuffer) {
        if (!this.c) {
            int write = this.a.write(byteBuffer);
            p();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    public final void a(byte[] bArr) {
        if (!this.c) {
            batd batd = this.a;
            if (bArr != null) {
                batd.b(bArr, 0, bArr.length);
                p();
                return;
            }
            throw new IllegalArgumentException("source == null");
        }
        throw new IllegalStateException("closed");
    }
}
