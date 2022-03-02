package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: aehq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aehq {
    static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 16) {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(bArr, "HmacSHA256"));
            return instance.doFinal(bArr2);
        }
        throw new GeneralSecurityException("Incorrect key length, should be the AES-128 key.");
    }
}
