package defpackage;

import java.nio.ByteBuffer;

/* renamed from: amoj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amoj {
    public final byte[] a;
    public final ByteBuffer b;

    private amoj(byte[] bArr) {
        this.a = bArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.position(1);
        this.b = wrap.slice();
    }

    public static amoj a(int i, int i2) {
        amoj a2 = a(new byte[(i2 + 1)]);
        a2.a(true, i);
        return a2;
    }

    public final int b() {
        return this.a[0] & 15;
    }

    public final int c() {
        return (this.a[0] & 112) >> 4;
    }

    public final String toString() {
        return String.format("Packet[%08d + %s bytes payload]", new Object[]{Integer.valueOf(Integer.parseInt(Integer.toBinaryString(this.a[0] & 255))), Integer.valueOf(this.b.capacity())});
    }

    public static amoj a(byte[] bArr) {
        return new amoj(bArr);
    }

    public final void a(boolean z, int i) {
        this.a[0] = (byte) ((!z ? 0 : 128) | i);
    }

    public final boolean a() {
        return (this.a[0] & 8) != 0;
    }
}
