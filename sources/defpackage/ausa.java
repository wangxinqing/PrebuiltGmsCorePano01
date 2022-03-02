package defpackage;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;

/* renamed from: ausa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ausa {
    static final byte[] a = {-126, -86, 85, -96, -45, -105, -8, -125, 70, -54, 28, -18, -115, 57, 9, -71, 95, 19, -6, 125, -21, 29, 74, -77, -125, 118, -72, 37, 109, -88, 85, 16};
    public static final /* synthetic */ int b = 0;

    static aush a(SecretKey secretKey, byte[] bArr) {
        try {
            ausv a2 = a(bArr, secretKey);
            if (a2.b == 13) {
                return (aush) aucj.a((aucj) aush.d, a2.a);
            }
            throw new SignatureException("wrong message type in responder hello");
        } catch (auda e) {
            throw new SignatureException(e);
        } catch (InvalidKeyException e2) {
            throw new SignatureException(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new SignatureException(e3);
        }
    }

    static ausv a(byte[] bArr, SecretKey secretKey) {
        if (bArr == null || secretKey == null) {
            throw null;
        }
        try {
            autz a2 = auts.a((auud) aucj.a((aucj) auud.d, bArr), secretKey, auto.HMAC_SHA256, secretKey, autn.AES_256_CBC);
            auty auty = a2.b;
            if (auty == null) {
                auty = auty.h;
            }
            if ((auty.a & 32) != 0) {
                auty auty2 = a2.b;
                if (auty2 == null) {
                    auty2 = auty.h;
                }
                auss auss = (auss) aucj.a((aucj) auss.d, auty2.f);
                int i = 1;
                if (auss.c <= 1) {
                    int a3 = ausu.a(auss.b);
                    if (a3 != 0) {
                        i = a3;
                    }
                    int i2 = i - 1;
                    int[] a4 = ausw.a();
                    int length = a4.length;
                    int i3 = 0;
                    while (i3 < length) {
                        int i4 = a4[i3];
                        if (i4 != 0) {
                            int i5 = i4 - 1;
                            if (i4 == 0) {
                                throw null;
                            } else if (i5 == i2) {
                                return new ausv(i4, a2.c.k());
                            } else {
                                i3++;
                            }
                        } else {
                            throw null;
                        }
                    }
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Unsupported payload type: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                throw new SignatureException("Unsupported protocol version");
            }
            throw new SignatureException("missing metadata");
        } catch (auda e) {
            throw new SignatureException(e);
        } catch (IllegalArgumentException e2) {
            throw new SignatureException(e2);
        }
    }

    static SecretKey a(PrivateKey privateKey, autx autx) {
        try {
            return auso.a(privateKey, autq.a(autx));
        } catch (InvalidKeySpecException e) {
            throw new SignatureException(e);
        } catch (InvalidKeyException e2) {
            throw new SignatureException(e2);
        }
    }

    static SecretKey a(SecretKey secretKey, String str) {
        return ausq.a(autp.a(secretKey, a, str.getBytes()));
    }

    static byte[] a(ausv ausv, SecretKey secretKey) {
        return a(ausv, secretKey, (byte[]) null);
    }

    static byte[] a(ausv ausv, SecretKey secretKey, byte[] bArr) {
        if (secretKey != null) {
            autr autr = new autr();
            aucd o = auss.d.o();
            int i = ausv.b;
            if (o.c) {
                o.c();
                o.c = false;
            }
            auss auss = (auss) o.b;
            auss.b = i - 1;
            auss.a |= 1;
            auss.a(auss);
            autr.a = auay.a(((auss) o.i()).k());
            if (bArr != null) {
                autr.b = auay.a(bArr);
            }
            auto auto = auto.HMAC_SHA256;
            autn autn = autn.AES_256_CBC;
            byte[] bArr2 = ausv.a;
            if (auto == null || autn == null) {
                throw null;
            } else if (autn == autn.NONE) {
                String valueOf = String.valueOf(autn);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                sb.append(valueOf);
                sb.append(" not supported for encrypted messages");
                throw new IllegalArgumentException(sb.toString());
            } else if (!auto.e) {
                byte[] a2 = autp.a(autn, autr.c);
                aucd o2 = auty.h.o();
                int i2 = auto.f;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                auty auty = (auty) o2.b;
                if (i2 != 0) {
                    auty.b = i2;
                    int i3 = auty.a | 1;
                    auty.a = i3;
                    int i4 = autn.d;
                    if (i4 != 0) {
                        auty.c = i4;
                        int i5 = i3 | 2;
                        auty.a = i5;
                        auay auay = autr.b;
                        if (auay != null) {
                            auay.getClass();
                            i5 |= 8;
                            auty.a = i5;
                            auty.d = auay;
                        }
                        auay auay2 = autr.a;
                        if (auay2 != null) {
                            auay2.getClass();
                            auty.a = i5 | 32;
                            auty.f = auay2;
                        }
                        auay a3 = auay.a(a2);
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        auty auty2 = (auty) o2.b;
                        a3.getClass();
                        auty2.a |= 16;
                        auty2.e = a3;
                        byte[] k = ((auty) o2.i()).k();
                        if (autr.a(secretKey, auto, secretKey)) {
                            bArr2 = autp.b(autp.a(autp.b(k, (byte[]) null)), bArr2);
                        }
                        byte[] a4 = autp.a(secretKey, autn, autr.c, a2, bArr2);
                        aucd o3 = auua.d.o();
                        auay a5 = auay.a(k);
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        auua auua = (auua) o3.b;
                        a5.getClass();
                        auua.a |= 1;
                        auua.b = a5;
                        auay a6 = auay.a(a4);
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        auua auua2 = (auua) o3.b;
                        a6.getClass();
                        auua2.a |= 2;
                        auua2.c = a6;
                        byte[] k2 = ((auua) o3.i()).k();
                        byte[] a7 = autp.a(auto, (Key) secretKey, autr.c, autp.b(k2, (byte[]) null));
                        aucd o4 = auud.d.o();
                        auay a8 = auay.a(k2);
                        if (o4.c) {
                            o4.c();
                            o4.c = false;
                        }
                        auud auud = (auud) o4.b;
                        a8.getClass();
                        auud.a |= 1;
                        auud.b = a8;
                        auay a9 = auay.a(a7);
                        if (o4.c) {
                            o4.c();
                            o4.c = false;
                        }
                        auud auud2 = (auud) o4.b;
                        a9.getClass();
                        auud2.a |= 2;
                        auud2.c = a9;
                        return ((auud) o4.i()).k();
                    }
                    throw null;
                }
                throw null;
            } else {
                throw new IllegalStateException("Must set a verificationKeyId when using public key signature with encryption");
            }
        } else {
            throw null;
        }
    }
}
