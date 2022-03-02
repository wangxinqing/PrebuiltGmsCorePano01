package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Random;
import java.util.UUID;

/* renamed from: aefs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aefs {
    public static final UUID a = aefj.a(4661);

    public static int a(aefr aefr, byte[] bArr, byte[] bArr2) {
        byte[] b = aeev.b(bArr, bArr2);
        byte b2 = b[0];
        aefr aefr2 = aefr.SEEKER;
        byte b3 = aefr.c;
        if (b2 == b3) {
            return ByteBuffer.allocate(4).put((byte) 0).put(b, 1, 3).getInt(0);
        }
        StringBuilder sb = new StringBuilder(50);
        sb.append("Wrong Passkey Block type (expected ");
        sb.append(b3);
        sb.append(", got ");
        sb.append(b2);
        sb.append(")");
        throw new GeneralSecurityException(sb.toString());
    }

    public static byte[] a(aefr aefr, byte[] bArr, int i) {
        boolean z;
        if (i <= 0 || i >= 16777216) {
            z = false;
        } else {
            z = true;
        }
        amrl.a(z, "Passkey %s must be positive and fit in 3 bytes", i);
        byte[] bArr2 = {(byte) (i >>> 16), (byte) (i >>> 8), (byte) i};
        byte[] bArr3 = new byte[12];
        new Random().nextBytes(bArr3);
        aefr aefr2 = aefr.SEEKER;
        return aeev.a(bArr, aooa.a(new byte[]{aefr.c}, bArr2, bArr3));
    }
}
