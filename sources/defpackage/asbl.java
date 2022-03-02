package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: asbl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asbl extends OutputStream {
    private final Object a = new Object();
    private final amoq b;
    private final byte[] c;
    private int d = 0;
    private boolean e = false;

    public asbl(amoq amoq) {
        this.b = amoq;
        this.c = new byte[56320];
    }

    public final void close() {
        synchronized (this.a) {
            if (!this.e) {
                flush();
                this.e = true;
                super.close();
            }
        }
    }

    public final void flush() {
        synchronized (this.a) {
            if (!this.e) {
                int i = this.d;
                if (i != 0) {
                    this.b.b(ByteBuffer.allocate(i).put(this.c, 0, this.d).array());
                    this.d = 0;
                    return;
                }
                jjg jjg = asil.a;
                return;
            }
            throw new IOException("Stream is closed!");
        }
    }

    public final void write(int i) {
        synchronized (this.a) {
            if (!this.e) {
                if (this.d == this.c.length) {
                    flush();
                }
                byte[] bArr = this.c;
                int i2 = this.d;
                this.d = i2 + 1;
                bArr[i2] = (byte) i;
            } else {
                throw new IOException("Stream is closed!");
            }
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        synchronized (this.a) {
            if (!this.e) {
                while (i2 > 0) {
                    if (this.d == this.c.length) {
                        flush();
                    }
                    int min = Math.min(i2, this.c.length - this.d);
                    System.arraycopy(bArr, i, this.c, this.d, min);
                    i2 -= min;
                    i += min;
                    this.d += min;
                }
            } else {
                throw new IOException("Stream is closed!");
            }
        }
    }
}
