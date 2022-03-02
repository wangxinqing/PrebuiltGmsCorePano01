package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: baww  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baww extends InputStream {
    public boolean a;
    public ByteBuffer b;
    public IOException c;
    private final bawv d;

    public baww(bawv bawv) {
        this.d = bawv;
    }

    private final void a() {
        if (this.a) {
            IOException iOException = this.c;
            if (iOException != null) {
                throw iOException;
            }
        } else if (!b()) {
            if (this.b == null) {
                this.b = ByteBuffer.allocateDirect(32768);
            }
            this.b.clear();
            bawv bawv = this.d;
            bawv.b.read(this.b);
            bawv.a.a(bawv.getReadTimeout());
            IOException iOException2 = this.c;
            if (iOException2 == null) {
                ByteBuffer byteBuffer = this.b;
                if (byteBuffer != null) {
                    byteBuffer.flip();
                    return;
                }
                return;
            }
            throw iOException2;
        }
    }

    private final boolean b() {
        ByteBuffer byteBuffer = this.b;
        return byteBuffer != null && byteBuffer.hasRemaining();
    }

    public final int read() {
        a();
        if (b()) {
            return this.b.get() & 255;
        }
        return -1;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            a();
            if (!b()) {
                return -1;
            }
            int min = Math.min(this.b.limit() - this.b.position(), i2);
            this.b.get(bArr, i, min);
            return min;
        }
    }
}
