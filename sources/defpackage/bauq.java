package defpackage;

import com.google.android.chimera.FragmentTransaction;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bauq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bauq implements ReadableByteChannel {
    private final InputStream a;
    private final AtomicBoolean b = new AtomicBoolean(true);

    private bauq(InputStream inputStream) {
        this.a = inputStream;
    }

    static ReadableByteChannel a(InputStream inputStream) {
        if (inputStream instanceof FileInputStream) {
            return ((FileInputStream) inputStream).getChannel();
        }
        return new bauq(inputStream);
    }

    public final void close() {
        if (this.b.compareAndSet(true, false)) {
            this.a.close();
        }
    }

    public final boolean isOpen() {
        return this.b.get();
    }

    public final int read(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int read = this.a.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            if (read <= 0) {
                return read;
            }
            byteBuffer.position(byteBuffer.position() + read);
            return read;
        }
        byte[] bArr = new byte[Math.min(16384, Math.min(Math.max(this.a.available(), FragmentTransaction.TRANSIT_ENTER_MASK), byteBuffer.remaining()))];
        int read2 = this.a.read(bArr);
        if (read2 <= 0) {
            return read2;
        }
        byteBuffer.put(bArr, 0, read2);
        return read2;
    }
}
