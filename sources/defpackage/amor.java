package defpackage;

import java.nio.ByteBuffer;

/* renamed from: amor  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amor implements amot {
    public final amoo a = new amoo();
    private final ByteBuffer b;

    public amor(byte[] bArr) {
        this.b = ByteBuffer.wrap(bArr);
    }

    public final amoj a(int i) {
        int i2;
        int i3;
        if (!b()) {
            int position = this.b.position();
            int min = Math.min(this.b.remaining(), i - 1);
            ByteBuffer slice = this.b.slice();
            slice.limit(min);
            ByteBuffer byteBuffer = this.b;
            byteBuffer.position(byteBuffer.position() + min);
            boolean hasRemaining = this.b.hasRemaining();
            if (position != 0) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            if (!hasRemaining) {
                i3 = 4;
            } else {
                i3 = 0;
            }
            amoj a2 = amoj.a(new byte[(slice.remaining() + 1)]);
            a2.a(false, i3 | i2);
            a2.b.put(slice);
            return a2;
        }
        throw new IllegalStateException();
    }

    public final boolean b() {
        return !this.b.hasRemaining();
    }

    public final void c() {
        this.b.rewind();
    }

    public final amoo d() {
        return this.a;
    }

    public final boolean a() {
        return this.b.position() != 0;
    }
}
