package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: apaw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apaw implements apcs {
    private static final ThreadLocal a = new apav();
    private final SecretKeySpec b;
    private final int c;
    private final int d;

    public apaw(byte[] bArr, int i) {
        apdc.a(bArr.length);
        this.b = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) a.get()).getBlockSize();
        this.d = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.c = i;
    }

    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i = this.c;
        int i2 = Integer.MAX_VALUE - i;
        if (length <= i2) {
            byte[] bArr2 = new byte[(i + length)];
            byte[] a2 = apcw.a(i);
            System.arraycopy(a2, 0, bArr2, 0, this.c);
            int i3 = this.c;
            Cipher cipher = (Cipher) a.get();
            byte[] bArr3 = new byte[this.d];
            System.arraycopy(a2, 0, bArr3, 0, this.c);
            cipher.init(1, this.b, new IvParameterSpec(bArr3));
            if (cipher.doFinal(bArr, 0, length, bArr2, i3) == length) {
                return bArr2;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("plaintext length can not exceed ");
        sb.append(i2);
        throw new GeneralSecurityException(sb.toString());
    }
}
