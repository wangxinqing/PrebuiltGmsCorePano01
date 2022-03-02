package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: bawo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bawo extends UploadDataProvider {
    final /* synthetic */ bawp a;

    public bawo(bawp bawp) {
        this.a = bawp;
    }

    public final long getLength() {
        bawp bawp = this.a;
        int i = bawp.a;
        if (i != -1) {
            return (long) i;
        }
        boolean z = bawp.c;
        ByteBuffer byteBuffer = bawp.b;
        return (long) (!z ? byteBuffer.position() : byteBuffer.limit());
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining < this.a.b.remaining()) {
            byteBuffer.put(this.a.b.array(), this.a.b.position(), remaining);
            ByteBuffer byteBuffer2 = this.a.b;
            byteBuffer2.position(byteBuffer2.position() + remaining);
        } else {
            byteBuffer.put(this.a.b);
        }
        uploadDataSink.onReadSucceeded(false);
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        this.a.b.position(0);
        uploadDataSink.onRewindSucceeded();
    }
}
