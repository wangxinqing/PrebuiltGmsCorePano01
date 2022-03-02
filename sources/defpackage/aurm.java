package defpackage;

import java.nio.ByteBuffer;
import javax.crypto.Mac;

/* renamed from: aurm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aurm {
    public static final aurl a = new aurj();
    private final Mac b;
    private final int c;
    private final aurl d;

    public aurm(Mac mac, int i, aurl aurl) {
        this.b = mac;
        this.c = i;
        this.d = aurl;
    }

    private static byte[] a(long j) {
        return ByteBuffer.allocate(8).putLong(j).array();
    }

    public final String a(long j, long j2, int i, byte[] bArr) {
        byte[] bArr2;
        byte[][] bArr3 = new byte[4][];
        bArr3[0] = a(j);
        bArr3[1] = a(j2);
        if (i != 0) {
            bArr2 = a((long) (i - 1));
        } else {
            bArr2 = null;
        }
        bArr3[2] = bArr2;
        bArr3[3] = bArr;
        for (int i2 = 0; i2 < 4; i2++) {
            byte[] bArr4 = bArr3[i2];
            if (bArr4 != null) {
                this.b.update(bArr4);
            }
        }
        return this.d.a(this.c, this.b.doFinal());
    }
}
