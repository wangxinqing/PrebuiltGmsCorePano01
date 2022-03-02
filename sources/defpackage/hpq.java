package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: hpq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hpq {
    private final ByteBuffer a;

    public hpq(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    public final byte a(int i) {
        try {
            return this.a.get(i);
        } catch (RuntimeException e) {
            throw new IOException("Exception reading from buffer", e);
        }
    }

    public final int b(int i) {
        try {
            return this.a.getInt(i);
        } catch (RuntimeException e) {
            throw new IOException("Exception reading from buffer", e);
        }
    }

    public final long c(int i) {
        try {
            return this.a.getLong(i);
        } catch (RuntimeException e) {
            throw new IOException("Exception reading from buffer", e);
        }
    }

    public final int a() {
        return this.a.capacity();
    }

    public final void a(int i, byte b) {
        try {
            this.a.put(i, b);
        } catch (RuntimeException e) {
            throw new IOException("Exception writing to buffer", e);
        }
    }

    public final void a(int i, int i2) {
        try {
            this.a.putInt(i, i2);
        } catch (RuntimeException e) {
            throw new IOException("Exception writing to buffer", e);
        }
    }

    public final void a(int i, long j) {
        try {
            this.a.putLong(i, j);
        } catch (RuntimeException e) {
            throw new IOException("Exception writing to buffer", e);
        }
    }
}
