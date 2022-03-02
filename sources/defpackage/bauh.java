package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: bauh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bauh extends UploadDataProvider {
    private final ByteBuffer a;

    public bauh(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    public final long getLength() {
        return (long) this.a.limit();
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            if (byteBuffer.remaining() >= this.a.remaining()) {
                byteBuffer.put(this.a);
            } else {
                int limit = this.a.limit();
                ByteBuffer byteBuffer2 = this.a;
                byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
                byteBuffer.put(this.a);
                this.a.limit(limit);
            }
            uploadDataSink.onReadSucceeded(false);
            return;
        }
        throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        this.a.position(0);
        uploadDataSink.onRewindSucceeded();
    }
}
