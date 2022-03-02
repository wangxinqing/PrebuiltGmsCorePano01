package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: apau  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apau implements aoun {
    private final SecretKey a;
    private final int b;
    private final byte[] c;
    private final byte[] d;

    public apau(byte[] bArr, int i) {
        apdc.a(bArr.length);
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, min is 10 bytes");
        } else if (i <= 16) {
            this.a = new SecretKeySpec(bArr, "AES");
            this.b = i;
            Cipher a2 = a();
            a2.init(1, this.a);
            byte[] a3 = apbc.a(a2.doFinal(new byte[16]));
            this.c = a3;
            this.d = apbc.a(a3);
        } else {
            throw new InvalidAlgorithmParameterException("tag size too large, max is 16 bytes");
        }
    }

    private static Cipher a() {
        return (Cipher) apcf.a.a("AES/ECB/NoPadding");
    }

    public final byte[] a(byte[] bArr) {
        byte[] bArr2;
        Cipher a2 = a();
        a2.init(1, this.a);
        int length = bArr.length;
        double d2 = (double) length;
        Double.isNaN(d2);
        int max = Math.max(1, (int) Math.ceil(d2 / 16.0d));
        if (max * 16 == length) {
            bArr2 = apbg.a(bArr, (max - 1) * 16, this.c, 0, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) * 16, length);
            int length2 = copyOfRange.length;
            if (length2 < 16) {
                byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                copyOf[length2] = Byte.MIN_VALUE;
                bArr2 = apbg.b(copyOf, this.d);
            } else {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
        }
        byte[] bArr3 = new byte[16];
        for (int i = 0; i < max - 1; i++) {
            bArr3 = a2.doFinal(apbg.a(bArr3, 0, bArr, i * 16, 16));
        }
        byte[] b2 = apbg.b(bArr2, bArr3);
        byte[] bArr4 = new byte[this.b];
        System.arraycopy(a2.doFinal(b2), 0, bArr4, 0, this.b);
        return bArr4;
    }
}
