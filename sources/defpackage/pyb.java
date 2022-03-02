package defpackage;

import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.gms.identity.accounts.security.EncryptedAccountData;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: pyb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pyb {
    public final SecureRandom a;
    private final SecretKey b;
    private final SecretKey c;
    private final pye d;
    private final pyf e;

    public pyb(pye pye, SecretKey secretKey, pyf pyf, SecretKey secretKey2, SecureRandom secureRandom) {
        iva.a((Object) pye, (Object) "Cipher must not be null.");
        iva.a((Object) secretKey, (Object) "Message key must not be null.");
        iva.a((Object) pyf, (Object) "MAC must not be null.");
        iva.a((Object) secretKey2, (Object) "MAC key must not be null.");
        iva.a((Object) secureRandom, (Object) "Random must not be null.");
        this.d = pye;
        this.c = secretKey2;
        this.b = secretKey;
        this.e = pyf;
        this.a = secureRandom;
    }

    public final boolean a(EncryptedAccountData encryptedAccountData) {
        byte[] bArr = encryptedAccountData.c;
        byte[] bArr2 = encryptedAccountData.b;
        try {
            this.e.a(this.c);
            this.e.a(bArr);
            return MessageDigest.isEqual(encryptedAccountData.d, this.e.b(bArr2));
        } catch (InvalidKeyException e2) {
            throw new IllegalStateException("The key didn't match the MAC supplied.", e2);
        }
    }

    public final AccountData b(EncryptedAccountData encryptedAccountData) {
        byte[] bArr = encryptedAccountData.c;
        byte[] bArr2 = encryptedAccountData.b;
        try {
            this.d.a(2, this.b, new IvParameterSpec(bArr), this.a);
            try {
                return (AccountData) ivy.a(this.d.a(bArr2), AccountData.CREATOR);
            } catch (IllegalBlockSizeException e2) {
                throw new IllegalStateException("Your cipher algorithm should request unpadding.");
            } catch (BadPaddingException e3) {
                return null;
            }
        } catch (InvalidKeyException e4) {
            throw new IllegalStateException("The key didn't match the cipher supplied.", e4);
        } catch (InvalidAlgorithmParameterException e5) {
            return null;
        }
    }

    public final byte[] a(AccountData accountData, byte[] bArr) {
        byte[] a2 = ivy.a(accountData);
        try {
            this.d.a(1, this.b, new IvParameterSpec(bArr), this.a);
            try {
                return this.d.a(a2);
            } catch (IllegalBlockSizeException e2) {
                throw new IllegalStateException("Your cipher algorithm should request padding.");
            } catch (BadPaddingException e3) {
                return null;
            }
        } catch (InvalidAlgorithmParameterException e4) {
            return null;
        } catch (InvalidKeyException e5) {
            throw new IllegalStateException("The key didn't match the cipher supplied.", e5);
        }
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            this.e.a(this.c);
            this.e.a(bArr);
            return this.e.b(bArr2);
        } catch (InvalidKeyException e2) {
            throw new IllegalStateException("The key didn't match the MAC supplied.", e2);
        }
    }
}
