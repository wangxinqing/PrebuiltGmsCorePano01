package defpackage;

import java.net.HttpRetryException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: baws  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baws extends UploadDataProvider {
    final /* synthetic */ bawt a;

    public baws(bawt bawt) {
        this.a = bawt;
    }

    public final long getLength() {
        return this.a.b;
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < this.a.c.remaining()) {
            int limit = this.a.c.limit();
            ByteBuffer byteBuffer2 = this.a.c;
            byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
            byteBuffer.put(this.a.c);
            this.a.c.limit(limit);
            uploadDataSink.onReadSucceeded(false);
            return;
        }
        byteBuffer.put(this.a.c);
        this.a.c.clear();
        uploadDataSink.onReadSucceeded(false);
        this.a.a.b();
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
    }
}
