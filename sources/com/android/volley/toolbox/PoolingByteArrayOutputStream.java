package com.android.volley.toolbox;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.ByteArrayOutputStream;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PoolingByteArrayOutputStream extends ByteArrayOutputStream {
    private final ByteArrayPool a;

    public PoolingByteArrayOutputStream(ByteArrayPool byteArrayPool) {
        this(byteArrayPool, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    private final void a(int i) {
        if (this.count + i > this.buf.length) {
            ByteArrayPool byteArrayPool = this.a;
            int i2 = this.count + i;
            byte[] buf = byteArrayPool.getBuf(i2 + i2);
            System.arraycopy(this.buf, 0, buf, 0, this.count);
            this.a.returnBuf(this.buf);
            this.buf = buf;
        }
    }

    public void close() {
        this.a.returnBuf(this.buf);
        this.buf = null;
        super.close();
    }

    public void finalize() {
        this.a.returnBuf(this.buf);
    }

    public synchronized void write(int i) {
        a(1);
        super.write(i);
    }

    public PoolingByteArrayOutputStream(ByteArrayPool byteArrayPool, int i) {
        this.a = byteArrayPool;
        this.buf = byteArrayPool.getBuf(Math.max(i, PSKKeyManager.MAX_KEY_LENGTH_BYTES));
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        a(i2);
        super.write(bArr, i, i2);
    }
}
