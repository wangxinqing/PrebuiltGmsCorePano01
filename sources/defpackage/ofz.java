package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: ofz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ofz extends UploadDataProvider {
    private final byte[] a;
    private int b;

    public ofz(byte[] bArr) {
        this.a = bArr;
    }

    public final long getLength() {
        return (long) this.a.length;
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int min = Math.min(byteBuffer.remaining(), this.a.length - this.b);
        byteBuffer.put(this.a, this.b, min);
        this.b += min;
        uploadDataSink.onReadSucceeded(false);
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        this.b = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
