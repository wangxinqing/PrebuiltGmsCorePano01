package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: apbb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apbb implements aotx {
    private static final ThreadLocal a = new apba();
    private final SecretKey b;

    public apbb(byte[] bArr) {
        apdc.a(bArr.length);
        this.b = new SecretKeySpec(bArr, "AES");
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        AlgorithmParameterSpec algorithmParameterSpec;
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[(length + 28)];
            byte[] a2 = apcw.a(12);
            System.arraycopy(a2, 0, bArr3, 0, 12);
            int length2 = a2.length;
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                algorithmParameterSpec = new GCMParameterSpec(128, a2, 0, length2);
            } catch (ClassNotFoundException e) {
                if (apdb.a()) {
                    algorithmParameterSpec = new IvParameterSpec(a2, 0, length2);
                } else {
                    throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
                }
            }
            ((Cipher) a.get()).init(1, this.b, algorithmParameterSpec);
            if (bArr2.length != 0) {
                ((Cipher) a.get()).updateAAD(bArr2);
            }
            int doFinal = ((Cipher) a.get()).doFinal(bArr, 0, length, bArr3, 12);
            if (doFinal == length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - length)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
