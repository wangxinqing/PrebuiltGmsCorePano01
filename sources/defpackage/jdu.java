package defpackage;

import com.google.android.chimera.FragmentTransaction;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.ProtocolException;
import java.nio.charset.Charset;

/* renamed from: jdu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jdu implements Closeable {
    private final InputStream a;
    private final byte[] b = new byte[FragmentTransaction.TRANSIT_ENTER_MASK];
    private int c;
    private boolean d;

    public jdu(InputStream inputStream) {
        this.a = inputStream;
    }

    private final void a(int i) {
        byte[] bArr = this.b;
        System.arraycopy(bArr, i, bArr, 0, this.c - i);
        int i2 = this.c - i;
        this.c = i2;
        if (i2 == 0) {
            a();
        }
    }

    private final NumberFormatException b(int i) {
        String str = new String(this.b, 0, i, Charset.forName("US-ASCII"));
        return new NumberFormatException(str.length() == 0 ? new String("invalid long: ") : "invalid long: ".concat(str));
    }

    private final int g() {
        if (this.d) {
            return -1;
        }
        int i = 0;
        while (true) {
            if (i < this.c) {
                byte b2 = this.b[i];
                if (b2 == 10) {
                    this.d = true;
                    return i;
                } else if (b2 == 32) {
                    return i;
                } else {
                    i++;
                }
            } else if (a() <= 0) {
                throw new ProtocolException("End of stream while looking for token boundary");
            }
        }
    }

    public final boolean b() {
        return this.c > 0;
    }

    public final void c() {
        int i = 0;
        if (!this.d) {
            while (true) {
                if (i < this.c) {
                    byte b2 = this.b[i];
                    i++;
                    if (b2 == 10) {
                        a(i);
                        return;
                    }
                } else if (a() <= 0) {
                    throw new ProtocolException("End of stream while looking for line boundary");
                }
            }
        } else {
            this.d = false;
        }
    }

    public final void close() {
        this.a.close();
    }

    public final String d() {
        int g = g();
        if (g != -1) {
            String str = new String(this.b, 0, g, Charset.forName("US-ASCII"));
            a(g + 1);
            return str;
        }
        throw new ProtocolException("Missing required string");
    }

    public final long e() {
        int g = g();
        if (g != -1) {
            int i = 0;
            byte b2 = this.b[0];
            if (b2 == 45) {
                i = 1;
            }
            long j = 0;
            while (i < g) {
                int i2 = this.b[i] - 48;
                if (i2 < 0 || i2 > 9) {
                    throw b(g);
                }
                long j2 = (10 * j) - ((long) i2);
                if (j2 <= j) {
                    i++;
                    j = j2;
                } else {
                    throw b(g);
                }
            }
            a(g + 1);
            return b2 != 45 ? -j : j;
        }
        throw new ProtocolException("Missing required long");
    }

    public final int f() {
        long e = e();
        if (e <= 2147483647L && e >= -2147483648L) {
            return (int) e;
        }
        throw new NumberFormatException("parsed value larger than integer");
    }

    public final int a() {
        byte[] bArr = this.b;
        int i = this.c;
        int length = bArr.length - i;
        if (length != 0) {
            int read = this.a.read(bArr, i, length);
            if (read != -1) {
                this.c += read;
            }
            return read;
        }
        throw new IOException("attempting to fill already-full buffer");
    }
}
