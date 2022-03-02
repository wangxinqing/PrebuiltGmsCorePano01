package defpackage;

import java.net.ProtocolException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* renamed from: bawp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bawp extends bawx {
    public final int a;
    public ByteBuffer b;
    public boolean c;
    private final UploadDataProvider f;

    public bawp() {
        this.f = new bawo(this);
        this.a = -1;
        this.b = ByteBuffer.allocate(16384);
    }

    private final void a(int i) {
        if (this.a != -1 && this.b.position() + i > this.a) {
            throw new ProtocolException("exceeded content-length limit of " + this.a + " bytes");
        } else if (this.c) {
            throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for writing after connect");
        } else if (this.a == -1 && this.b.limit() - this.b.position() <= i) {
            int capacity = this.b.capacity();
            ByteBuffer allocate = ByteBuffer.allocate(Math.max(capacity + capacity, this.b.capacity() + i));
            this.b.flip();
            allocate.put(this.b);
            this.b = allocate;
        }
    }

    public final void b() {
    }

    public final UploadDataProvider c() {
        return this.f;
    }

    public final void write(int i) {
        d();
        a(1);
        this.b.put((byte) i);
    }

    public final void write(byte[] bArr, int i, int i2) {
        d();
        a(i2);
        this.b.put(bArr, i, i2);
    }

    public bawp(long j) {
        this.f = new bawo(this);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
        } else if (j >= 0) {
            int i = (int) j;
            this.a = i;
            this.b = ByteBuffer.allocate(i);
        } else {
            throw new IllegalArgumentException("Content length < 0.");
        }
    }

    public final void a() {
        this.c = true;
        if (this.b.position() >= this.a) {
            this.b.flip();
            return;
        }
        throw new ProtocolException("Content received is less than Content-Length");
    }
}
