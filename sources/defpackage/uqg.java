package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: uqg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uqg extends OutputStream {
    public final AtomicBoolean a = new AtomicBoolean(false);
    private final byte[] b;
    private final amoq c;

    public uqg(byte[] bArr, amoq amoq) {
        this.b = bArr;
        this.c = amoq;
    }

    public final void close() {
        if (this.a.compareAndSet(false, true)) {
            synchronized (this.a) {
                this.a.notifyAll();
            }
        }
    }

    public final void write(int i) {
        write(new byte[]{(byte) i});
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        if (aymi.v()) {
            bArr2 = upu.a(this.b, Arrays.copyOfRange(bArr, i, i2 + i));
        } else {
            bArr2 = upu.a(this.b, Arrays.copyOfRange(bArr, i, i2 + i));
        }
        if (bArr2 != null) {
            amoo b2 = this.c.b(bArr2);
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            b2.a(new uqf(this, atomicBoolean));
            synchronized (this.a) {
                while (!b2.isDone() && !this.a.get()) {
                    try {
                        this.a.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            if (!atomicBoolean.get()) {
                throw new IOException("BleSocketOutputStreamV1 failed to write data");
            }
            return;
        }
        throw new IOException("BleSocketOutputStreamV1 failed to create a BlePacket");
    }
}
