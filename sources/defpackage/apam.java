package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* renamed from: apam  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apam extends aouh {
    public apam(Class cls) {
        super(cls);
    }

    public static final aouu a(aozp aozp) {
        aozp aozp2 = aozp;
        KeyFactory keyFactory = (KeyFactory) apcf.g.a("RSA");
        aozq aozq = aozp2.b;
        if (aozq == null) {
            aozq = aozq.e;
        }
        BigInteger bigInteger = new BigInteger(1, aozq.c.k());
        aozq aozq2 = aozp2.b;
        if (aozq2 == null) {
            aozq2 = aozq.e;
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, new BigInteger(1, aozq2.d.k()), new BigInteger(1, aozp2.c.k()), new BigInteger(1, aozp2.d.k()), new BigInteger(1, aozp2.e.k()), new BigInteger(1, aozp2.f.k()), new BigInteger(1, aozp2.g.k()), new BigInteger(1, aozp2.h.k())));
        aozq aozq3 = aozp2.b;
        if (aozq3 == null) {
            aozq3 = aozq.e;
        }
        aozo aozo = aozq3.b;
        if (aozo == null) {
            aozo = aozo.d;
        }
        int b = aoyp.b(aozo.a);
        if (b == 0) {
            b = 1;
        }
        int a = apar.a(b);
        int b2 = aoyp.b(aozo.b);
        if (b2 == 0) {
            b2 = 1;
        }
        apcz apcz = new apcz(rSAPrivateCrtKey, a, apar.a(b2), aozo.c);
        aozq aozq4 = aozp2.b;
        if (aozq4 == null) {
            aozq4 = aozq.e;
        }
        BigInteger bigInteger2 = new BigInteger(1, aozq4.c.k());
        aozq aozq5 = aozp2.b;
        if (aozq5 == null) {
            aozq5 = aozq.e;
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger2, new BigInteger(1, aozq5.d.k())));
        int b3 = aoyp.b(aozo.a);
        if (b3 == 0) {
            b3 = 1;
        }
        int a2 = apar.a(b3);
        int b4 = aoyp.b(aozo.b);
        if (b4 == 0) {
            b4 = 1;
        }
        apda apda = new apda(rSAPublicKey, a2, apar.a(b4), aozo.c);
        try {
            byte[] a3 = apcz.a(apao.c);
            byte[] bArr = apao.c;
            BigInteger publicExponent = apda.a.getPublicExponent();
            BigInteger modulus = apda.a.getModulus();
            int bitLength = modulus.bitLength();
            int bitLength2 = (modulus.bitLength() + 6) / 8;
            if ((bitLength + 7) / 8 == a3.length) {
                BigInteger a4 = apdb.a(a3);
                if (a4.compareTo(modulus) < 0) {
                    byte[] a5 = apdb.a(a4.modPow(publicExponent, modulus), bitLength2);
                    int bitLength3 = modulus.bitLength() - 1;
                    int i = apdc.a;
                    MessageDigest messageDigest = (MessageDigest) apcf.d.a(apdb.b(apda.c));
                    byte[] digest = messageDigest.digest(bArr);
                    int digestLength = messageDigest.getDigestLength();
                    int length = a5.length;
                    if (length < apda.b + digestLength + 2) {
                        throw new GeneralSecurityException("inconsistent");
                    } else if (a5[length - 1] == -68) {
                        int i2 = length - digestLength;
                        int i3 = i2 - 1;
                        byte[] copyOf = Arrays.copyOf(a5, i3);
                        int length2 = copyOf.length;
                        byte[] copyOfRange = Arrays.copyOfRange(a5, length2, length2 + digestLength);
                        int i4 = 0;
                        while (true) {
                            int i5 = i2;
                            byte[] bArr2 = copyOf;
                            long j = (((long) length) * 8) - ((long) bitLength3);
                            if (((long) i4) >= j) {
                                byte[] a6 = apdb.a(copyOfRange, i3, apda.d);
                                int length3 = a6.length;
                                byte[] bArr3 = new byte[length3];
                                for (int i6 = 0; i6 < length3; i6++) {
                                    bArr3[i6] = (byte) (a6[i6] ^ bArr2[i6]);
                                }
                                for (int i7 = 0; ((long) i7) <= j; i7++) {
                                    int i8 = i7 / 8;
                                    bArr3[i8] = (byte) (bArr3[i8] & ((1 << (7 - (i7 % 8))) ^ -1));
                                }
                                int i9 = 0;
                                while (true) {
                                    int i10 = apda.b;
                                    int i11 = (i5 - i10) - 2;
                                    if (i9 >= i11) {
                                        if (bArr3[i11] == 1) {
                                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr3, length3 - i10, length3);
                                            int i12 = digestLength + 8;
                                            byte[] bArr4 = new byte[(apda.b + i12)];
                                            System.arraycopy(digest, 0, bArr4, 8, digest.length);
                                            System.arraycopy(copyOfRange2, 0, bArr4, i12, copyOfRange2.length);
                                            if (apbg.a(messageDigest.digest(bArr4), copyOfRange)) {
                                                return apcz;
                                            }
                                            throw new GeneralSecurityException("inconsistent");
                                        }
                                        throw new GeneralSecurityException("inconsistent");
                                    } else if (bArr3[i9] == 0) {
                                        i9++;
                                    } else {
                                        throw new GeneralSecurityException("inconsistent");
                                    }
                                }
                            } else if (((bArr2[i4 / 8] >> (7 - (i4 % 8))) & 1) == 0) {
                                i4++;
                                i2 = i5;
                                copyOf = bArr2;
                            } else {
                                throw new GeneralSecurityException("inconsistent");
                            }
                        }
                    } else {
                        throw new GeneralSecurityException("inconsistent");
                    }
                } else {
                    throw new GeneralSecurityException("signature out of range");
                }
            } else {
                throw new GeneralSecurityException("invalid signature's length");
            }
        } catch (GeneralSecurityException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 83);
            sb.append("Security bug: signing with private key followed by verifying with public key failed");
            sb.append(valueOf);
            throw new RuntimeException(sb.toString());
        }
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return a((aozp) obj);
    }
}
