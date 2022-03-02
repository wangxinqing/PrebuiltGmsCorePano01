package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class JavaI420Buffer implements VideoFrame.I420Buffer {
    private final int a;
    private final int b;
    private final ByteBuffer c;
    private final ByteBuffer d;
    private final ByteBuffer e;
    private final int f;
    private final int g;
    private final int h;
    private final bayk i;

    private JavaI420Buffer(int i2, int i3, ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i6, Runnable runnable) {
        this.a = i2;
        this.b = i3;
        this.c = byteBuffer;
        this.d = byteBuffer2;
        this.e = byteBuffer3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = new bayk(runnable);
    }

    public static VideoFrame.Buffer a(VideoFrame.I420Buffer i420Buffer, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i6;
        int i9 = i7;
        if (i4 != i8) {
            VideoFrame.I420Buffer i420Buffer2 = i420Buffer;
            int i10 = i5;
        } else if (i5 == i9) {
            ByteBuffer dataY = i420Buffer.getDataY();
            ByteBuffer dataU = i420Buffer.getDataU();
            ByteBuffer dataV = i420Buffer.getDataV();
            dataY.position(i2 + (i420Buffer.getStrideY() * i3));
            int i11 = i2 / 2;
            int i12 = i3 / 2;
            dataU.position((i420Buffer.getStrideU() * i12) + i11);
            dataV.position(i11 + (i12 * i420Buffer.getStrideV()));
            i420Buffer.retain();
            ByteBuffer slice = dataY.slice();
            int strideY = i420Buffer.getStrideY();
            ByteBuffer slice2 = dataU.slice();
            int strideU = i420Buffer.getStrideU();
            ByteBuffer slice3 = dataV.slice();
            int strideV = i420Buffer.getStrideV();
            i420Buffer.getClass();
            baxk baxk = new baxk(i420Buffer);
            if (slice == null || slice2 == null || slice3 == null) {
                throw new IllegalArgumentException("Data buffers cannot be null.");
            } else if (!slice.isDirect() || !slice2.isDirect() || !slice3.isDirect()) {
                throw new IllegalArgumentException("Data buffers must be direct byte buffers.");
            } else {
                ByteBuffer slice4 = slice.slice();
                ByteBuffer slice5 = slice2.slice();
                ByteBuffer slice6 = slice3.slice();
                int i13 = (i8 + 1) / 2;
                int i14 = (i9 + 1) / 2;
                a(slice4, i8, i9, strideY);
                a(slice5, i13, i14, strideU);
                a(slice6, i13, i14, strideV);
                return new JavaI420Buffer(i6, i7, slice4, strideY, slice5, strideU, slice6, strideV, baxk);
            }
        } else {
            VideoFrame.I420Buffer i420Buffer3 = i420Buffer;
        }
        int i15 = (i9 + 1) / 2;
        int i16 = (i8 + 1) / 2;
        int i17 = i8 * i9;
        int i18 = i16 * i15;
        int i19 = i17 + i18;
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(((i16 + i16) * i15) + i17);
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i17);
        ByteBuffer slice7 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i17);
        nativeAllocateByteBuffer.limit(i19);
        ByteBuffer slice8 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i19);
        nativeAllocateByteBuffer.limit(i19 + i18);
        JavaI420Buffer javaI420Buffer = new JavaI420Buffer(i6, i7, slice7, i6, slice8, i16, nativeAllocateByteBuffer.slice(), i16, new baxj(nativeAllocateByteBuffer));
        JavaI420Buffer javaI420Buffer2 = javaI420Buffer;
        JavaI420Buffer javaI420Buffer3 = javaI420Buffer2;
        nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i2, i3, i4, i5, javaI420Buffer.getDataY(), javaI420Buffer.f, javaI420Buffer2.getDataU(), javaI420Buffer2.g, javaI420Buffer2.getDataV(), javaI420Buffer2.h, i6, i7);
        return javaI420Buffer3;
    }

    private static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, int i5, int i6, int i7, int i8, ByteBuffer byteBuffer4, int i9, ByteBuffer byteBuffer5, int i10, ByteBuffer byteBuffer6, int i11, int i12, int i13);

    public final VideoFrame.Buffer cropAndScale(int i2, int i3, int i4, int i5, int i6, int i7) {
        return a(this, i2, i3, i4, i5, i6, i7);
    }

    public final ByteBuffer getDataU() {
        return this.d.slice();
    }

    public final ByteBuffer getDataV() {
        return this.e.slice();
    }

    public final ByteBuffer getDataY() {
        return this.c.slice();
    }

    public final int getHeight() {
        return this.b;
    }

    public final int getStrideU() {
        return this.g;
    }

    public final int getStrideV() {
        return this.h;
    }

    public final int getStrideY() {
        return this.f;
    }

    public final int getWidth() {
        return this.a;
    }

    public final void release() {
        this.i.release();
    }

    public final void retain() {
        this.i.retain();
    }

    public final VideoFrame.I420Buffer toI420() {
        retain();
        return this;
    }

    private static void a(ByteBuffer byteBuffer, int i2, int i3, int i4) {
        int i5 = (i4 * (i3 - 1)) + i2;
        if (byteBuffer.capacity() < i5) {
            int capacity = byteBuffer.capacity();
            StringBuilder sb = new StringBuilder(62);
            sb.append("Buffer must be at least ");
            sb.append(i5);
            sb.append(" bytes, but was ");
            sb.append(capacity);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
