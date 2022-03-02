package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import org.webrtc.DataChannel;

/* renamed from: usw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class usw extends OutputStream {
    final /* synthetic */ usx a;

    public usw(usx usx) {
        this.a = usx;
    }

    public final void close() {
        this.a.c();
    }

    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    public final void write(byte[] bArr, int i, int i2) {
        long j = (long) i2;
        if (j <= aymi.N()) {
            usx usx = this.a;
            synchronized (usx.d) {
                while (!usx.e()) {
                    DataChannel dataChannel = usx.c;
                    dataChannel.b();
                    if (dataChannel.nativeBufferedAmount() + j <= aymi.N()) {
                        break;
                    }
                    try {
                        usx.d.wait(250);
                    } catch (InterruptedException e) {
                        usx.c();
                        Thread.currentThread().interrupt();
                    }
                }
            }
            if (!this.a.e()) {
                DataChannel dataChannel2 = this.a.c;
                DataChannel.Buffer buffer = new DataChannel.Buffer(ByteBuffer.wrap(bArr, i, i2), true);
                dataChannel2.b();
                byte[] bArr2 = new byte[buffer.a.remaining()];
                buffer.a.get(bArr2);
                if (!dataChannel2.nativeSend(bArr2, buffer.b)) {
                    throw new IOException("Failed to send bytes over data channel.");
                }
                return;
            }
            throw new IOException("Cannot write: WebRtcSocket output stream is closed.");
        }
        throw new IOException("Attempted to write more than 1MB to data channel.");
    }
}
