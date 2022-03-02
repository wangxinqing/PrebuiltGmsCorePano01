package com.google.android.gms.org.conscrypt;

import java.nio.ByteBuffer;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class BufferAllocator {
    private static final BufferAllocator UNPOOLED = new BufferAllocator() {
        public AllocatedBuffer allocateDirectBuffer(int i) {
            return AllocatedBuffer.wrap(ByteBuffer.allocateDirect(i));
        }
    };

    public static BufferAllocator unpooled() {
        return UNPOOLED;
    }

    public abstract AllocatedBuffer allocateDirectBuffer(int i);
}
