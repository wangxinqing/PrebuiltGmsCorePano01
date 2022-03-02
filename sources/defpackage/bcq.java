package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: bcq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bcq implements bcr {
    private final ByteBuffer a;

    public bcq(ByteBuffer byteBuffer) {
        this.a = byteBuffer.slice();
    }

    public final long a() {
        return (long) this.a.capacity();
    }

    public final void a(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer slice;
        synchronized (this.a) {
            int i2 = (int) j;
            this.a.position(i2);
            this.a.limit(i2 + i);
            slice = this.a.slice();
        }
        for (MessageDigest update : messageDigestArr) {
            slice.position(0);
            update.update(slice);
        }
    }
}
