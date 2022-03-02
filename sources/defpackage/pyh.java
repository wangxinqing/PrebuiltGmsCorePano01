package defpackage;

import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;

/* renamed from: pyh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pyh {
    private final Cipher a;
    private final KeyPair b;

    public pyh(Cipher cipher, KeyPair keyPair) {
        this.a = cipher;
        this.b = keyPair;
    }

    public final SecretKey a(byte[] bArr, String str) {
        boolean z;
        if (bArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "Secret key bytes must be set.");
        try {
            this.a.init(4, this.b.getPrivate());
            try {
                return (SecretKey) this.a.unwrap(bArr, str, 3);
            } catch (InvalidKeyException e) {
                throw new IllegalArgumentException("Secret key bytes are not valid.", e);
            } catch (NoSuchAlgorithmException e2) {
                return null;
            }
        } catch (InvalidKeyException e3) {
            throw new IllegalArgumentException("Bad input key.", e3);
        }
    }

    public final byte[] a(SecretKey secretKey) {
        iva.a((Object) secretKey, (Object) "Secret key must not be null.");
        try {
            this.a.init(3, this.b.getPublic());
            try {
                return this.a.wrap(secretKey);
            } catch (IllegalBlockSizeException e) {
                throw new IllegalStateException("Cipher should request padding.", e);
            } catch (InvalidKeyException e2) {
                throw new IllegalArgumentException("The secret key is invalid.", e2);
            }
        } catch (InvalidKeyException e3) {
            throw new IllegalArgumentException("Bad input key.", e3);
        }
    }
}
