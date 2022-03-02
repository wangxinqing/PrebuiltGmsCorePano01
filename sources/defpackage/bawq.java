package defpackage;

import java.net.HttpRetryException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: bawq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bawq extends UploadDataProvider {
    final /* synthetic */ bawr a;

    public bawq(bawr bawr) {
        this.a = bawr;
    }

    public final long getLength() {
        return -1;
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= this.a.b.remaining()) {
            byteBuffer.put(this.a.b);
            this.a.b.clear();
            uploadDataSink.onReadSucceeded(this.a.c);
            bawr bawr = this.a;
            if (!bawr.c) {
                bawr.a.b();
                return;
            }
            return;
        }
        int limit = this.a.b.limit();
        ByteBuffer byteBuffer2 = this.a.b;
        byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
        byteBuffer.put(this.a.b);
        this.a.b.limit(limit);
        uploadDataSink.onReadSucceeded(false);
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
    }
}
