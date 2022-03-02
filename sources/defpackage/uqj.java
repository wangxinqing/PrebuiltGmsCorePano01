package defpackage;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: uqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uqj extends OutputStream {
    public final AtomicBoolean a = new AtomicBoolean(false);
    private final byte[] b;
    private final amoq c;
    private final DataOutputStream d;

    public uqj(byte[] bArr, amoq amoq, OutputStream outputStream) {
        this.b = bArr;
        this.c = amoq;
        this.d = outputStream != null ? new DataOutputStream(new BufferedOutputStream(outputStream)) : null;
    }

    static final /* synthetic */ void a(byte[] bArr, amon amon) {
        if (!amon.b()) {
            ((anih) ((anih) ulh.a.b()).a("uqj", "a", 139, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleSocketOutputStreamV2 failed to send a control packet %s", (Object) ulu.a(bArr));
        }
    }

    private final amoo c(byte[] bArr) {
        DataOutputStream dataOutputStream = this.d;
        if (dataOutputStream != null) {
            dataOutputStream.writeInt(bArr.length);
            this.d.write(bArr);
            this.d.flush();
            return null;
        }
        amoq amoq = this.c;
        if (amoq != null) {
            return amoq.b(bArr);
        }
        throw new IOException("BleSocketOutputStreamV2 illegal state, both gattSocket and l2capOutputStream are null!");
    }

    /* access modifiers changed from: package-private */
    public final amoo b(byte[] bArr) {
        byte[] a2 = upu.a(upu.a, bArr);
        if (a2 != null) {
            return c(a2);
        }
        throw new IOException("BleSocketOutputStreamV2 failed to create a BlePacket");
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

    /* access modifiers changed from: package-private */
    public final void a(byte[] bArr) {
        amoo b2 = b(bArr);
        if (b2 != null) {
            try {
                b2.get(aymi.j(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                throw new IOException("BleSocketOutputStreamV2 write data but timeout");
            }
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        byte[] a2 = upu.a(this.b, Arrays.copyOfRange(bArr, i, i2 + i));
        if (a2 != null) {
            amoo c2 = c(a2);
            if (c2 != null) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                c2.a(new uqh(this, atomicBoolean));
                synchronized (this.a) {
                    while (!c2.isDone() && !this.a.get()) {
                        try {
                            this.a.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                if (!atomicBoolean.get()) {
                    throw new IOException("BleSocketOutputStreamV2 failed to write data");
                }
                return;
            }
            return;
        }
        throw new IOException("BleSocketOutputStreamV2 failed to create a BlePacket");
    }
}
