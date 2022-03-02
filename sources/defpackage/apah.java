package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* renamed from: apah  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apah extends aouh {
    public apah(Class cls) {
        super(cls);
    }

    public static final aouu a(aozl aozl) {
        byte[] bArr;
        KeyFactory keyFactory = (KeyFactory) apcf.g.a("RSA");
        aozm aozm = aozl.b;
        if (aozm == null) {
            aozm = aozm.e;
        }
        BigInteger bigInteger = new BigInteger(1, aozm.c.k());
        aozm aozm2 = aozl.b;
        if (aozm2 == null) {
            aozm2 = aozm.e;
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, new BigInteger(1, aozm2.d.k()), new BigInteger(1, aozl.c.k()), new BigInteger(1, aozl.d.k()), new BigInteger(1, aozl.e.k()), new BigInteger(1, aozl.f.k()), new BigInteger(1, aozl.g.k()), new BigInteger(1, aozl.h.k())));
        aozm aozm3 = aozl.b;
        if (aozm3 == null) {
            aozm3 = aozm.e;
        }
        aozk aozk = aozm3.b;
        if (aozk == null) {
            aozk = aozk.b;
        }
        int b = aoyp.b(aozk.a);
        if (b == 0) {
            b = 1;
        }
        apcx apcx = new apcx(rSAPrivateCrtKey, apar.a(b));
        aozm aozm4 = aozl.b;
        if (aozm4 == null) {
            aozm4 = aozm.e;
        }
        BigInteger bigInteger2 = new BigInteger(1, aozm4.c.k());
        aozm aozm5 = aozl.b;
        if (aozm5 == null) {
            aozm5 = aozm.e;
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger2, new BigInteger(1, aozm5.d.k())));
        aozm aozm6 = aozl.b;
        if (aozm6 == null) {
            aozm6 = aozm.e;
        }
        aozk aozk2 = aozm6.b;
        if (aozk2 == null) {
            aozk2 = aozk.b;
        }
        int b2 = aoyp.b(aozk2.a);
        if (b2 == 0) {
            b2 = 1;
        }
        apcy apcy = new apcy(rSAPublicKey, apar.a(b2));
        try {
            byte[] a = apcx.a(apaj.c);
            byte[] bArr2 = apaj.c;
            BigInteger publicExponent = apcy.a.getPublicExponent();
            BigInteger modulus = apcy.a.getModulus();
            int bitLength = (modulus.bitLength() + 7) / 8;
            if (bitLength == a.length) {
                BigInteger a2 = apdb.a(a);
                if (a2.compareTo(modulus) < 0) {
                    byte[] a3 = apdb.a(a2.modPow(publicExponent, modulus), bitLength);
                    int i = apcy.b;
                    int i2 = apdc.a;
                    MessageDigest messageDigest = (MessageDigest) apcf.d.a(apdb.b(apcy.b));
                    messageDigest.update(bArr2);
                    byte[] digest = messageDigest.digest();
                    int i3 = i - 1;
                    if (i3 == 1) {
                        bArr = apcq.a("3031300d060960864801650304020105000420");
                    } else if (i3 == 3) {
                        bArr = apcq.a("3051300d060960864801650304020305000440");
                    } else {
                        String a4 = apco.a(i);
                        StringBuilder sb = new StringBuilder(a4.length() + 17);
                        sb.append("Unsupported hash ");
                        sb.append(a4);
                        throw new GeneralSecurityException(sb.toString());
                    }
                    int length = bArr.length + digest.length;
                    if (bitLength >= length + 11) {
                        byte[] bArr3 = new byte[bitLength];
                        bArr3[0] = 0;
                        bArr3[1] = 1;
                        int i4 = 2;
                        int i5 = 0;
                        while (i5 < (bitLength - length) - 3) {
                            bArr3[i4] = -1;
                            i5++;
                            i4++;
                        }
                        int i6 = i4 + 1;
                        bArr3[i4] = 0;
                        int length2 = bArr.length;
                        System.arraycopy(bArr, 0, bArr3, i6, length2);
                        System.arraycopy(digest, 0, bArr3, i6 + length2, digest.length);
                        if (apbg.a(a3, bArr3)) {
                            return apcx;
                        }
                        throw new GeneralSecurityException("invalid signature");
                    }
                    throw new GeneralSecurityException("intended encoded message length too short");
                }
                throw new GeneralSecurityException("signature out of range");
            }
            throw new GeneralSecurityException("invalid signature's length");
        } catch (GeneralSecurityException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 83);
            sb2.append("Security bug: signing with private key followed by verifying with public key failed");
            sb2.append(valueOf);
            throw new RuntimeException(sb2.toString());
        }
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return a((aozl) obj);
    }
}
