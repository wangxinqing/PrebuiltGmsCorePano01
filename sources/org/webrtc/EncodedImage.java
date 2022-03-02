package org.webrtc;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class EncodedImage implements RefCounted {
    public final ByteBuffer a;
    public final int b;
    public final int c;
    public final long d;
    public final FrameType e;
    public final int f;
    public final boolean g;
    public final Integer h;
    private final bayk i;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum FrameType {
        EmptyFrame(0),
        VideoFrameKey(3),
        VideoFrameDelta(4);
        
        public final int d;

        private FrameType(int i) {
            this.d = i;
        }

        static FrameType fromNativeIndex(int i) {
            for (FrameType frameType : values()) {
                if (frameType.d == i) {
                    return frameType;
                }
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown native frame type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private EncodedImage(ByteBuffer byteBuffer, Runnable runnable, int i2, int i3, long j, FrameType frameType, int i4, boolean z, Integer num) {
        this.a = byteBuffer;
        this.b = i2;
        this.c = i3;
        TimeUnit.NANOSECONDS.toMillis(j);
        this.d = j;
        this.e = frameType;
        this.f = i4;
        this.g = z;
        this.h = num;
        this.i = new bayk(runnable);
    }

    private ByteBuffer getBuffer() {
        return this.a;
    }

    private long getCaptureTimeNs() {
        return this.d;
    }

    private boolean getCompleteFrame() {
        return this.g;
    }

    private int getEncodedHeight() {
        return this.c;
    }

    private int getEncodedWidth() {
        return this.b;
    }

    private int getFrameType() {
        return this.e.d;
    }

    private Integer getQp() {
        return this.h;
    }

    private int getRotation() {
        return this.f;
    }

    public final void release() {
        this.i.release();
    }

    public final void retain() {
        this.i.retain();
    }
}
