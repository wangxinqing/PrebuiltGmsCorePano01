package org.webrtc;

import java.nio.ByteBuffer;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class VideoFrame implements RefCounted {
    private final Buffer a;
    private final int b;
    private final long c;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface Buffer extends RefCounted {
        Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6);

        int getHeight();

        int getWidth();

        void release();

        void retain();

        I420Buffer toI420();
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface I420Buffer extends Buffer {
        ByteBuffer getDataU();

        ByteBuffer getDataV();

        ByteBuffer getDataY();

        int getStrideU();

        int getStrideV();

        int getStrideY();
    }

    public VideoFrame(Buffer buffer, int i, long j) {
        if (buffer == null) {
            throw new IllegalArgumentException("buffer not allowed to be null");
        } else if (i % 90 == 0) {
            this.a = buffer;
            this.b = i;
            this.c = j;
        } else {
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
    }

    public Buffer getBuffer() {
        return this.a;
    }

    public int getRotation() {
        return this.b;
    }

    public long getTimestampNs() {
        return this.c;
    }

    public void release() {
        this.a.release();
    }

    public final void retain() {
        this.a.retain();
    }
}
