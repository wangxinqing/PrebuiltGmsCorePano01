package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bako  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bako extends badd {
    final ByteBuffer a;

    public bako(ByteBuffer byteBuffer) {
        amrl.a((Object) byteBuffer, (Object) "bytes");
        this.a = byteBuffer;
    }

    public final int a() {
        return this.a.remaining();
    }

    public final int b() {
        a(1);
        return this.a.get() & 255;
    }

    public final void a(byte[] bArr, int i, int i2) {
        a(i2);
        this.a.get(bArr, i, i2);
    }

    public final /* bridge */ /* synthetic */ bakl c(int i) {
        a(i);
        ByteBuffer duplicate = this.a.duplicate();
        duplicate.limit(this.a.position() + i);
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(byteBuffer.position() + i);
        return new bako(duplicate);
    }
}
