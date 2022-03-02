package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;

/* renamed from: auso  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auso {
    static {
        auto auto = auto.HMAC_SHA256;
        autn autn = autn.NONE;
    }

    public static SecretKey a(PrivateKey privateKey, PublicKey publicKey) {
        try {
            KeyAgreement instance = KeyAgreement.getInstance(!(privateKey instanceof ECPrivateKey) ? "DH" : "ECDH");
            instance.init(privateKey);
            instance.doPhase(publicKey, true);
            return ausq.a(a(instance.generateSecret()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    static byte[] a(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
