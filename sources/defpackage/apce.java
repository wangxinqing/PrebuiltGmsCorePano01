package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: apce  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apce implements aotx {
    private final apcs a;
    private final aoun b;

    public apce(apcs apcs, aoun aoun) {
        this.a = apcs;
        this.b = aoun;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a2 = this.a.a(bArr);
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return apbg.a(a2, this.b.a(apbg.a(bArr2, a2, copyOf)));
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
