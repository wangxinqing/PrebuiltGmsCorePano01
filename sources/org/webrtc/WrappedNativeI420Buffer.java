package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class WrappedNativeI420Buffer implements VideoFrame.I420Buffer {
    private final int a;
    private final int b;
    private final ByteBuffer c;
    private final int d;
    private final ByteBuffer e;
    private final int f;
    private final ByteBuffer g;
    private final int h;
    private final long i;

    WrappedNativeI420Buffer(int i2, int i3, ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i6, long j) {
        this.a = i2;
        this.b = i3;
        this.c = byteBuffer;
        this.d = i4;
        this.e = byteBuffer2;
        this.f = i5;
        this.g = byteBuffer3;
        this.h = i6;
        this.i = j;
        retain();
    }

    public final VideoFrame.Buffer cropAndScale(int i2, int i3, int i4, int i5, int i6, int i7) {
        return JavaI420Buffer.a(this, i2, i3, i4, i5, i6, i7);
    }

    public final ByteBuffer getDataU() {
        return this.e.slice();
    }

    public final ByteBuffer getDataV() {
        return this.g.slice();
    }

    public final ByteBuffer getDataY() {
        return this.c.slice();
    }

    public final int getHeight() {
        return this.b;
    }

    public final int getStrideU() {
        return this.f;
    }

    public final int getStrideV() {
        return this.h;
    }

    public final int getStrideY() {
        return this.d;
    }

    public final int getWidth() {
        return this.a;
    }

    public final void release() {
        JniCommon.nativeReleaseRef(this.i);
    }

    public final void retain() {
        JniCommon.nativeAddRef(this.i);
    }

    public final VideoFrame.I420Buffer toI420() {
        retain();
        return this;
    }
}
