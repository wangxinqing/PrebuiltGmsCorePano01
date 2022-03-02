package defpackage;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHPublicKeySpec;

/* renamed from: autq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class autq {
    public static final BigInteger a = new BigInteger("FFFFFFFFFFFFFFFFC90FDAA22168C234C4C6628B80DC1CD129024E088A67CC74020BBEA63B139B22514A08798E3404DDEF9519B3CD3A431B302B0A6DF25F14374FE1356D6D51C245E485B576625E7EC6F44C42E9A637ED6B0BFF5CB6F406B7EDEE386BFB5A899FA5AE9F24117C4B1FE649286651ECE45B3DC2007CB8A163BF0598DA48361C55D39A69163FA8FD24CF5F83655D23DCA3AD961C62F356208552BB9ED529077096966D670C354E4ABC9804F1746C08CA18217C32905E462E36CE3BE39E772C180E86039B2783A2EC07A28FB5C55DF06F4C52C9DE2BCBF6955817183995497CEA956AE515D2261898FA051015728E5A8AACAA68FFFFFFFFFFFFFFFF", 16);
    public static final BigInteger b = e;
    private static final Boolean c;
    private static final BigInteger d = new BigInteger("1");
    private static final BigInteger e = new BigInteger("2");
    private static final ECParameterSpec f;
    private static final BigInteger g;
    private static final BigInteger h;
    private static final BigInteger i;

    public static autx a(PublicKey publicKey) {
        if (publicKey == null) {
            throw null;
        } else if (publicKey instanceof ECPublicKey) {
            aucd o = autx.f.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            autx autx = (autx) o.b;
            autx.b = 1;
            autx.a |= 1;
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            aucd o2 = autu.d.o();
            auay a2 = auay.a(eCPublicKey.getW().getAffineX().toByteArray());
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            autu autu = (autu) o2.b;
            a2.getClass();
            autu.a = 1 | autu.a;
            autu.b = a2;
            auay a3 = auay.a(eCPublicKey.getW().getAffineY().toByteArray());
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            autu autu2 = (autu) o2.b;
            a3.getClass();
            autu2.a |= 2;
            autu2.c = a3;
            autu autu3 = (autu) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            autx autx2 = (autx) o.b;
            autu3.getClass();
            autx2.c = autu3;
            autx2.a |= 2;
            return (autx) o.i();
        } else if (publicKey instanceof RSAPublicKey) {
            aucd o3 = autx.f.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            autx autx3 = (autx) o3.b;
            autx3.b = 2;
            autx3.a |= 1;
            RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey;
            aucd o4 = auug.d.o();
            auay a4 = auay.a(rSAPublicKey.getModulus().toByteArray());
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            auug auug = (auug) o4.b;
            a4.getClass();
            auug.a = 1 | auug.a;
            auug.b = a4;
            int intValue = rSAPublicKey.getPublicExponent().intValue();
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            auug auug2 = (auug) o4.b;
            auug2.a = 2 | auug2.a;
            auug2.c = intValue;
            auug auug3 = (auug) o4.i();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            autx autx4 = (autx) o3.b;
            auug3.getClass();
            autx4.d = auug3;
            autx4.a |= 4;
            return (autx) o3.i();
        } else if (publicKey instanceof DHPublicKey) {
            aucd o5 = autx.f.o();
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            autx autx5 = (autx) o5.b;
            autx5.b = 3;
            autx5.a |= 1;
            aucd o6 = autt.c.o();
            auay a5 = auay.a(((DHPublicKey) publicKey).getY().toByteArray());
            if (o6.c) {
                o6.c();
                o6.c = false;
            }
            autt autt = (autt) o6.b;
            a5.getClass();
            autt.a = 1 | autt.a;
            autt.b = a5;
            autt autt2 = (autt) o6.i();
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            autx autx6 = (autx) o5.b;
            autt2.getClass();
            autx6.e = autt2;
            autx6.a |= 8;
            return (autx) o5.i();
        } else {
            throw new IllegalArgumentException("Unsupported PublicKey type");
        }
    }

    public static boolean b() {
        return c.booleanValue();
    }

    private static KeyPairGenerator c() {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
            try {
                instance.initialize(new ECGenParameterSpec("prime256v1"));
                return instance;
            } catch (InvalidAlgorithmParameterException e2) {
                try {
                    instance.initialize(new ECGenParameterSpec("secp256r1"));
                    return instance;
                } catch (InvalidAlgorithmParameterException e3) {
                    throw new RuntimeException("Unable to find the NIST P-256 curve");
                }
            }
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException(e4);
        }
    }

    static {
        boolean z;
        ECParameterSpec eCParameterSpec;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        try {
            c();
            z = false;
        } catch (Exception e2) {
            z = true;
        }
        c = Boolean.valueOf(z);
        BigInteger bigInteger3 = null;
        if (!b()) {
            eCParameterSpec = ((ECPublicKey) a().getPublic()).getParams();
        } else {
            eCParameterSpec = null;
        }
        f = eCParameterSpec;
        if (!b()) {
            bigInteger = ((ECFieldFp) f.getCurve().getField()).getP();
        } else {
            bigInteger = null;
        }
        g = bigInteger;
        if (!b()) {
            bigInteger2 = f.getCurve().getA();
        } else {
            bigInteger2 = null;
        }
        h = bigInteger2;
        if (!b()) {
            bigInteger3 = f.getCurve().getB();
        }
        i = bigInteger3;
    }

    private static BigInteger a(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.multiply(bigInteger).mod(bigInteger2);
    }

    public static KeyPair a() {
        return c().generateKeyPair();
    }

    public static PublicKey a(autx autx) {
        int i2 = 1;
        if ((autx.a & 1) != 0) {
            int a2 = auuc.a(autx.b);
            if (a2 == 0) {
                a2 = 1;
            }
            if (a2 != 1) {
                if (a2 != 2) {
                    if ((autx.a & 8) != 0) {
                        autt autt = autx.e;
                        if (autt == null) {
                            autt = autt.c;
                        }
                        return a(autt);
                    }
                } else if ((autx.a & 4) != 0) {
                    auug auug = autx.d;
                    if (auug == null) {
                        auug = auug.d;
                    }
                    return a(auug);
                }
            } else if ((autx.a & 2) != 0) {
                autu autu = autx.c;
                if (autu == null) {
                    autu = autu.d;
                }
                return a(autu);
            }
            int a3 = auuc.a(autx.b);
            if (a3 != 0) {
                i2 = a3;
            }
            String valueOf = String.valueOf(Integer.toString(i2));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
            sb.append("key object is missing for key type: ");
            sb.append(valueOf);
            throw new InvalidKeySpecException(sb.toString());
        }
        throw new InvalidKeySpecException("GenericPublicKey.type is a required field");
    }

    public static ECPublicKey a(autu autu) {
        int i2 = autu.a;
        if ((i2 & 1) == 0 || (i2 & 2) == 0) {
            throw new InvalidKeySpecException("Key is missing a required coordinate");
        } else if (!b()) {
            byte[] k = autu.b.k();
            byte[] k2 = autu.c.k();
            try {
                a(k);
                a(k2);
                BigInteger bigInteger = new BigInteger(k);
                BigInteger bigInteger2 = new BigInteger(k2);
                if (bigInteger.signum() == -1 || bigInteger2.signum() == -1) {
                    throw new InvalidKeySpecException("Point encoding must use only non-negative integers");
                }
                BigInteger bigInteger3 = g;
                if (bigInteger.compareTo(bigInteger3) >= 0 || bigInteger2.compareTo(bigInteger3) >= 0) {
                    throw new InvalidKeySpecException("Point lies outside of the expected field");
                } else if (a(bigInteger2, bigInteger3).equals(a(bigInteger, bigInteger3).add(h).multiply(bigInteger).mod(bigInteger3).add(i).mod(bigInteger3))) {
                    return (ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(bigInteger, bigInteger2), f));
                } else {
                    throw new InvalidKeySpecException("Point does not lie on the expected curve");
                }
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            throw new InvalidKeySpecException("Elliptic Curve keys not supported on this platform");
        }
    }

    public static RSAPublicKey a(auug auug) {
        if ((auug.a & 1) != 0) {
            byte[] k = auug.b.k();
            int length = k.length;
            if (length == 0 || length > 257) {
                throw new InvalidKeySpecException();
            }
            BigInteger bigInteger = new BigInteger(k);
            if (bigInteger.bitLength() == 2048) {
                try {
                    return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(bigInteger, BigInteger.valueOf((long) auug.c)));
                } catch (NoSuchAlgorithmException e2) {
                    throw new AssertionError(e2);
                }
            } else {
                throw new InvalidKeySpecException();
            }
        } else {
            throw new InvalidKeySpecException("required field is missing");
        }
    }

    public static DHPublicKey a(autt autt) {
        if ((autt.a & 1) != 0) {
            byte[] k = autt.b.k();
            int length = k.length;
            if (length == 0 || length > 257) {
                throw new InvalidKeySpecException();
            }
            try {
                BigInteger bigInteger = new BigInteger(k);
                if (bigInteger.compareTo(d) <= 0 || bigInteger.compareTo(a.subtract(d)) >= 0) {
                    throw new InvalidKeySpecException();
                }
                try {
                    return (DHPublicKey) KeyFactory.getInstance("DH").generatePublic(new DHPublicKeySpec(bigInteger, a, b));
                } catch (NoSuchAlgorithmException e2) {
                    throw new AssertionError(e2);
                }
            } catch (NumberFormatException e3) {
                throw new InvalidKeySpecException();
            }
        } else {
            throw new InvalidKeySpecException("required field is missing");
        }
    }

    private static void a(byte[] bArr) {
        int length = bArr.length;
        if (length == 0 || length > 33 || (length == 33 && bArr[0] != 0)) {
            throw new InvalidKeySpecException();
        }
    }
}
