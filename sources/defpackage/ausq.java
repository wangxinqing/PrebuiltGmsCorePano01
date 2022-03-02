package defpackage;

import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: ausq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ausq {
    public static SecretKey a(byte[] bArr) {
        return new SecretKeySpec(bArr, "AES");
    }

    public static PublicKey b(byte[] bArr) {
        try {
            return autq.a((autx) aucj.a((aucj) autx.f, bArr));
        } catch (auda e) {
            throw new InvalidKeySpecException("Unable to parse GenericPublicKey", e);
        } catch (IllegalArgumentException e2) {
            throw new InvalidKeySpecException("Unable to parse GenericPublicKey", e2);
        }
    }

    public static byte[] a(PublicKey publicKey) {
        return autq.a(publicKey).k();
    }
}
