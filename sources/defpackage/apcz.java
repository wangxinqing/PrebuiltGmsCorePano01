package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.Cipher;

/* renamed from: apcz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apcz implements aouu {
    private final RSAPrivateCrtKey a;
    private final RSAPublicKey b;
    private final int c;
    private final int d;
    private final int e;

    public apcz(RSAPrivateCrtKey rSAPrivateCrtKey, int i, int i2, int i3) {
        int i4 = apdc.a;
        apdc.b(rSAPrivateCrtKey.getModulus().bitLength());
        this.a = rSAPrivateCrtKey;
        this.b = (RSAPublicKey) ((KeyFactory) apcf.g.a("RSA")).generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
        this.d = i;
        this.e = i2;
        this.c = i3;
    }

    public final byte[] a(byte[] bArr) {
        byte[] bArr2;
        int bitLength = this.b.getModulus().bitLength() - 1;
        int i = apdc.a;
        MessageDigest messageDigest = (MessageDigest) apcf.d.a(apdb.b(this.d));
        byte[] digest = messageDigest.digest(bArr);
        int digestLength = messageDigest.getDigestLength();
        int i2 = ((bitLength - 1) / 8) + 1;
        int i3 = this.c;
        if (i2 >= digestLength + i3 + 2) {
            byte[] a2 = apcw.a(i3);
            int i4 = digestLength + 8;
            byte[] bArr3 = new byte[(this.c + i4)];
            System.arraycopy(digest, 0, bArr3, 8, digestLength);
            int length = a2.length;
            System.arraycopy(a2, 0, bArr3, i4, length);
            byte[] digest2 = messageDigest.digest(bArr3);
            int i5 = (i2 - digestLength) - 1;
            byte[] bArr4 = new byte[i5];
            int i6 = (i2 - this.c) - digestLength;
            bArr4[i6 - 2] = 1;
            System.arraycopy(a2, 0, bArr4, i6 - 1, length);
            byte[] a3 = apdb.a(digest2, i5, this.e);
            byte[] bArr5 = new byte[i5];
            for (int i7 = 0; i7 < i5; i7++) {
                bArr5[i7] = (byte) (bArr4[i7] ^ a3[i7]);
            }
            int i8 = 0;
            while (true) {
                bArr2 = bArr5;
                if (((long) i8) >= (((long) i2) * 8) - ((long) bitLength)) {
                    break;
                }
                byte[] bArr6 = bArr2;
                int i9 = i8 / 8;
                bArr6[i9] = (byte) (bArr6[i9] & ((1 << (7 - (i8 % 8))) ^ -1));
                i8++;
                bArr5 = bArr6;
            }
            int i10 = digestLength + i5;
            byte[] bArr7 = new byte[(i10 + 1)];
            System.arraycopy(bArr2, 0, bArr7, 0, i5);
            System.arraycopy(digest2, 0, bArr7, i5, digest2.length);
            bArr7[i10] = -68;
            Cipher cipher = (Cipher) apcf.a.a("RSA/ECB/NOPADDING");
            cipher.init(2, this.a);
            byte[] doFinal = cipher.doFinal(bArr7);
            Cipher cipher2 = (Cipher) apcf.a.a("RSA/ECB/NOPADDING");
            cipher2.init(1, this.b);
            if (new BigInteger(1, bArr7).equals(new BigInteger(1, cipher2.doFinal(doFinal)))) {
                return doFinal;
            }
            throw new RuntimeException("Security bug: RSA signature computation error");
        }
        throw new GeneralSecurityException("encoding error");
    }
}
