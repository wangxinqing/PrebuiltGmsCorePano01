package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: bauj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bauj extends UploadDataProvider {
    private volatile FileChannel a;
    private final baui b;
    private final Object c = new Object();

    public bauj(baui baui) {
        this.b = baui;
    }

    private final FileChannel a() {
        if (this.a == null) {
            synchronized (this.c) {
                if (this.a == null) {
                    this.a = this.b.a();
                }
            }
        }
        return this.a;
    }

    public final void close() {
        FileChannel fileChannel = this.a;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    public final long getLength() {
        return a().size();
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int read;
        if (byteBuffer.hasRemaining()) {
            FileChannel a2 = a();
            do {
                read = a2.read(byteBuffer);
                if (read != -1) {
                    break;
                    break;
                }
                break;
            } while (read == 0);
            uploadDataSink.onReadSucceeded(false);
            return;
        }
        throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        a().position(0);
        uploadDataSink.onRewindSucceeded();
    }
}
