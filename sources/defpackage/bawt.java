package defpackage;

import java.net.ProtocolException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* renamed from: bawt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bawt extends bawx {
    public final bawy a;
    public final long b;
    public final ByteBuffer c;
    private final UploadDataProvider f = new baws(this);
    private long g;

    public bawt(long j, bawy bawy) {
        if (j >= 0) {
            this.b = j;
            this.c = ByteBuffer.allocate((int) Math.min(j, 16384));
            this.a = bawy;
            this.g = 0;
            return;
        }
        throw new IllegalArgumentException("Content length must be larger than 0 for non-chunked upload.");
    }

    private final void a(int i) {
        if (this.g + ((long) i) > this.b) {
            throw new ProtocolException("expected " + (this.b - this.g) + " bytes but received " + i);
        }
    }

    private final void f() {
        if (!this.c.hasRemaining()) {
            h();
        }
    }

    private final void g() {
        if (this.g == this.b) {
            h();
        }
    }

    private final void h() {
        d();
        this.c.flip();
        this.a.a();
        e();
    }

    public final void a() {
    }

    public final void b() {
        if (this.g < this.b) {
            throw new ProtocolException("Content received is less than Content-Length.");
        }
    }

    public final UploadDataProvider c() {
        return this.f;
    }

    public final void write(int i) {
        d();
        a(1);
        f();
        this.c.put((byte) i);
        this.g++;
        g();
    }

    public final void write(byte[] bArr, int i, int i2) {
        d();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        a(i2);
        int i3 = i2;
        while (i3 > 0) {
            f();
            int min = Math.min(i3, this.c.remaining());
            this.c.put(bArr, (i + i2) - i3, min);
            i3 -= min;
        }
        this.g += (long) i2;
        g();
    }
}
