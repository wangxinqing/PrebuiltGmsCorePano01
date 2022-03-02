package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: hwg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hwg extends UploadDataProvider {
    int a = 0;
    final /* synthetic */ auay b;

    public hwg(auay auay) {
        this.b = auay;
    }

    public final long getLength() {
        return (long) this.b.a();
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int min = Math.min(this.b.a(), this.a + byteBuffer.remaining());
        this.b.a(this.a, min).a(byteBuffer);
        this.a = min;
        uploadDataSink.onReadSucceeded(false);
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        this.a = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
