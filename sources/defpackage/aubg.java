package defpackage;

import java.nio.ByteBuffer;

/* renamed from: aubg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aubg extends aubf {
    private final ByteBuffer a;
    private final int b;

    public aubg(ByteBuffer byteBuffer) {
        super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        this.a = byteBuffer;
        this.b = byteBuffer.position();
    }

    public final void c() {
        this.a.position(this.b + b());
    }
}
