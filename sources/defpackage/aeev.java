package defpackage;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: aeev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeev {
    public static byte[] a() {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(128);
        return instance.generateKey().getEncoded();
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        return a(2, bArr, bArr2);
    }

    private static byte[] a(int i, byte[] bArr, byte[] bArr2) {
        if (bArr2.length == 16) {
            Cipher instance = Cipher.getInstance("AES/ECB/NoPadding");
            instance.init(i, new SecretKeySpec(bArr, "AES"));
            return instance.doFinal(bArr2);
        }
        throw new IllegalArgumentException("This encrypter only supports 16-byte inputs.");
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        return a(1, bArr, bArr2);
    }
}
