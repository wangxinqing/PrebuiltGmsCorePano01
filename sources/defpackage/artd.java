package defpackage;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;

/* renamed from: artd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class artd extends arhd {
    public long[] a;
    protected byte[][] b;
    private arta e;

    protected artd() {
        this.c = new artc(this);
    }

    /* access modifiers changed from: protected */
    public final void a(ByteBuffer byteBuffer) {
        LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
        asLongBuffer.get(this.a);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
        int length = this.b.length;
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        byteBuffer.position(byteBuffer.position() + (length * 4));
        for (int i = 0; i < length; i++) {
            int i2 = asIntBuffer.get();
            if (i2 != -1) {
                byte[] bArr = new byte[i2];
                this.b[i] = bArr;
                byteBuffer.get(bArr);
            }
        }
    }

    /* renamed from: b */
    public final arta values() {
        if (this.e == null) {
            this.e = new arta(this);
        }
        return this.e;
    }

    /* access modifiers changed from: protected */
    public final byte c() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public final int d() {
        int length = this.a.length;
        int i = (length * 8) + (r2 * 4);
        for (byte[] bArr : this.b) {
            if (bArr != null) {
                i += bArr.length;
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public final void b(ByteBuffer byteBuffer) {
        LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
        asLongBuffer.put(this.a);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        byteBuffer.position(byteBuffer.position() + (this.b.length * 4));
        for (byte[] bArr : this.b) {
            if (bArr == null) {
                asIntBuffer.put(-1);
            } else {
                asIntBuffer.put(bArr.length);
                byteBuffer.put(bArr);
            }
        }
    }
}
