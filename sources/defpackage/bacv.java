package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bacv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bacv implements balv {
    public final ByteBuffer a;

    public bacv(ByteBuffer byteBuffer) {
        amrl.a((Object) byteBuffer, (Object) "buffer");
        this.a = byteBuffer;
    }

    public final int a() {
        return this.a.remaining();
    }

    public final int b() {
        return this.a.position();
    }

    public final void a(byte b) {
        this.a.put(b);
    }

    public final void a(byte[] bArr, int i, int i2) {
        this.a.put(bArr, i, i2);
    }
}
