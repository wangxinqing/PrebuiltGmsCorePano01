package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: anla  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class anla extends ankw {
    private final ByteBuffer a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);

    private final void c() {
        if (this.a.remaining() < 8) {
            d();
        }
    }

    private final void d() {
        this.a.flip();
        while (this.a.remaining() >= 16) {
            a(this.a);
        }
        this.a.compact();
    }

    public final anlh a() {
        d();
        this.a.flip();
        if (this.a.remaining() > 0) {
            b(this.a);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.limit());
        }
        return b();
    }

    /* access modifiers changed from: protected */
    public abstract void a(ByteBuffer byteBuffer);

    /* access modifiers changed from: protected */
    public abstract anlh b();

    public final void b(byte b) {
        this.a.put(b);
        c();
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        throw null;
    }

    public anla() {
        amrl.a(true);
    }

    public final void a(char c) {
        this.a.putChar(c);
        c();
    }

    public final void b(byte[] bArr, int i, int i2) {
        ByteBuffer order = ByteBuffer.wrap(bArr, i, i2).order(ByteOrder.LITTLE_ENDIAN);
        if (order.remaining() <= this.a.remaining()) {
            this.a.put(order);
            c();
            return;
        }
        int position = 16 - this.a.position();
        for (int i3 = 0; i3 < position; i3++) {
            this.a.put(order.get());
        }
        d();
        while (order.remaining() >= 16) {
            a(order);
        }
        this.a.put(order);
    }

    public final void a(long j) {
        this.a.putLong(j);
        c();
    }
}
