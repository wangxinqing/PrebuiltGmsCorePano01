package defpackage;

import java.nio.ByteBuffer;

/* renamed from: aovz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aovz implements aotx {
    private static final byte[] a = new byte[0];
    private final aoyw b;
    private final aotx c;

    public aovz(aoyw aoyw, aotx aotx) {
        this.b = aoyw;
        this.c = aotx;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] k = aovb.b(this.b).k();
        byte[] a2 = this.c.a(k, a);
        byte[] a3 = ((aotx) aovb.a(this.b.a, k, aotx.class)).a(bArr, bArr2);
        int length = a2.length;
        return ByteBuffer.allocate(length + 4 + a3.length).putInt(length).put(a2).put(a3).array();
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
