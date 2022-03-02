package com.google.android.gms.org.conscrypt;

import java.nio.ByteBuffer;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class AllocatedBuffer {
    public static AllocatedBuffer wrap(final ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(byteBuffer, "buffer");
        return new AllocatedBuffer() {
            public ByteBuffer nioBuffer() {
                return byteBuffer;
            }

            public AllocatedBuffer release() {
                return this;
            }
        };
    }

    public abstract ByteBuffer nioBuffer();

    public abstract AllocatedBuffer release();

    @Deprecated
    public AllocatedBuffer retain() {
        return this;
    }
}
