package org.chromium.net;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class UploadDataProvider implements Closeable {
    public void close() {
    }

    public abstract long getLength();

    public abstract void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer);

    public abstract void rewind(UploadDataSink uploadDataSink);
}
