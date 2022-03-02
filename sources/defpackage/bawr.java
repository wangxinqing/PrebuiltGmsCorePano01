package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* renamed from: bawr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bawr extends bawx {
    public final bawy a;
    public final ByteBuffer b;
    public boolean c;
    private final UploadDataProvider f = new bawq(this);

    public bawr(int i, bawy bawy) {
        if (i > 0) {
            this.b = ByteBuffer.allocate(i);
            this.a = bawy;
            return;
        }
        throw new IllegalArgumentException("chunkLength should be greater than 0");
    }

    private final void f() {
        if (!this.b.hasRemaining()) {
            d();
            this.b.flip();
            this.a.a();
            e();
        }
    }

    public final void a() {
    }

    public final void b() {
    }

    public final UploadDataProvider c() {
        return this.f;
    }

    public final void close() {
        super.close();
        if (!this.c) {
            this.c = true;
            this.b.flip();
        }
    }

    public final void write(int i) {
        f();
        this.b.put((byte) i);
    }

    public final void write(byte[] bArr, int i, int i2) {
        d();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(i3, this.b.remaining());
            this.b.put(bArr, (i + i2) - i3, min);
            i3 -= min;
            f();
        }
    }
}
