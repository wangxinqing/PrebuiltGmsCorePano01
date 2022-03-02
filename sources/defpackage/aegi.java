package defpackage;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.util.Arrays;

/* renamed from: aegi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aegi {
    public static final /* synthetic */ int c = 0;
    private static final String[] d = {"GmsCore_OpenSSL", "AndroidOpenSSL", "SC", "BC"};
    private static final ECGenParameterSpec e = new ECGenParameterSpec("secp256r1");
    public final ECPublicKey a;
    public final ECPrivateKey b;

    public aegi(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) {
        this.a = eCPublicKey;
        this.b = eCPrivateKey;
    }

    public static Object a(aegh aegh) {
        String[] strArr = d;
        int i = 0;
        while (i < strArr.length) {
            try {
                return aegh.a(strArr[i]);
            } catch (NoSuchAlgorithmException | NoSuchProviderException e2) {
                i++;
            }
        }
        throw new NoSuchProviderException();
    }

    public static KeyPair a() {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) a(aege.a);
        keyPairGenerator.initialize(e);
        return keyPairGenerator.generateKeyPair();
    }

    public static byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        if (length > 32) {
            int i2 = length - 32;
            while (i < i2) {
                if (bArr[i] == 0) {
                    i++;
                } else {
                    String arrays = Arrays.toString(bArr);
                    StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 40);
                    sb.append("More than 32 non-zero bytes in ");
                    sb.append(arrays);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            return Arrays.copyOfRange(bArr, i2, bArr.length);
        }
        return aooa.a(new byte[(32 - length)], bArr);
    }
}
