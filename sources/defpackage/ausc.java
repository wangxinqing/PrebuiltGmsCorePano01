package defpackage;

import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;

/* renamed from: ausc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ausc implements ausd {
    public final KeyPair a = autq.a();
    public int b;
    public int c;
    private PublicKey d = null;
    private SecretKey e = null;
    private SecretKey f = null;
    private final boolean g;

    public ausc(int i) {
        this.c = i;
        this.g = i == 1;
        this.b = 1;
    }

    public static ausc a() {
        return new ausc(3);
    }

    private final byte[] d(byte[] bArr) {
        try {
            int i = ausa.b;
            auud auud = (auud) aucj.a((aucj) auud.d, bArr);
            if ((auud.a & 1) != 0) {
                if ((((autz) aucj.a((aucj) autz.d, auud.b)).a & 1) != 0) {
                    auty auty = ((autz) aucj.a((aucj) autz.d, auud.b)).b;
                    if (auty == null) {
                        auty = auty.h;
                    }
                    if ((auty.a & 1) != 0) {
                        int a2 = auuf.a(auty.b);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        auto[] values = auto.values();
                        int length = values.length;
                        int i2 = 0;
                        while (i2 < length) {
                            int i3 = values[i2].f;
                            if (i3 == 0) {
                                throw null;
                            } else if (i3 != a2) {
                                i2++;
                            } else {
                                if ((auty.a & 2) != 0) {
                                    int a3 = autw.a(auty.c);
                                    if (a3 == 0) {
                                        a3 = 1;
                                    }
                                    autn[] values2 = autn.values();
                                    int length2 = values2.length;
                                    int i4 = 0;
                                    while (i4 < length2) {
                                        int i5 = values2[i4].d;
                                        if (i5 == 0) {
                                            throw null;
                                        } else if (i5 != a3) {
                                            i4++;
                                        }
                                    }
                                    String valueOf = String.valueOf(Integer.toString(a3));
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                                    sb.append("Unsupported EncType: ");
                                    sb.append(valueOf);
                                    throw new IllegalArgumentException(sb.toString());
                                }
                                if ((auty.a & 8) != 0) {
                                    ausk ausk = (ausk) aucj.a((aucj) ausk.d, auty.d.k());
                                    if ((ausk.a & 1) != 0) {
                                        if (ausk.c == 0) {
                                            this.b = 0;
                                        }
                                        PrivateKey privateKey = this.a.getPrivate();
                                        autx autx = ausk.b;
                                        if (autx == null) {
                                            autx = autx.f;
                                        }
                                        SecretKey a4 = ausa.a(privateKey, autx);
                                        if (this.b != 0) {
                                            this.e = ausa.a(a4, "initiator");
                                            this.f = ausa.a(a4, "responder");
                                        } else {
                                            this.e = a4;
                                            this.f = a4;
                                        }
                                        aush a5 = ausa.a(this.f, bArr);
                                        if (a5.c == 1) {
                                            return a5.b.k();
                                        }
                                        throw new ausp("Incorrect sequence number in responder hello");
                                    }
                                    throw new auda("Missing public key in responder hello");
                                }
                                throw new auda("Missing decryption key id");
                            }
                        }
                        String valueOf2 = String.valueOf(Integer.toString(a2));
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 21);
                        sb2.append("Unsupported SigType: ");
                        sb2.append(valueOf2);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    throw new auda("Missing header field(s)");
                }
                throw new auda("Missing header");
            }
            throw new auda("Missing header and body");
        } catch (IllegalArgumentException e2) {
            throw new auda("Corrupt/unsupported SignatureScheme");
        } catch (IllegalArgumentException e3) {
            throw new auda("Corrupt/unsupported EncryptionScheme");
        } catch (auda | InvalidKeyException | NoSuchAlgorithmException | SignatureException e4) {
            throw new ausp(e4);
        }
    }

    private final void e(byte[] bArr) {
        try {
            ausj ausj = (ausj) aucj.a((aucj) ausj.d, bArr);
            if ((ausj.a & 1) != 0) {
                autx autx = ausj.b;
                if (autx == null) {
                    autx = autx.f;
                }
                this.d = autq.a(autx);
                if (ausj.c == 0) {
                    this.b = 0;
                    return;
                }
                return;
            }
            throw new ausp("Missing public key in initiator hello");
        } catch (auda | InvalidKeySpecException e2) {
            throw new ausp(e2);
        }
    }

    public final boolean b() {
        int i = this.c;
        return i == 5 || i == 6;
    }

    public final byte[] c() {
        throw null;
    }

    public final byte[] a(byte[] bArr) {
        int i = this.c;
        if (i == 4) {
            byte[] b2 = b(bArr);
            this.c = 5;
            return b2;
        }
        String a2 = ausb.a(i);
        StringBuilder sb = new StringBuilder(a2.length() + 47);
        sb.append("Cannot get next message with payload in state: ");
        sb.append(a2);
        throw new ausp(sb.toString());
    }

    public final byte[] b(byte[] bArr) {
        if (bArr != null) {
            try {
                SecretKey a2 = auso.a(this.a.getPrivate(), this.d);
                if (this.b != 0) {
                    this.e = ausa.a(a2, "initiator");
                    this.f = ausa.a(a2, "responder");
                } else {
                    this.e = a2;
                    this.f = a2;
                }
                ausv ausv = new ausv(13, aurx.a(bArr, 1).k());
                SecretKey secretKey = this.f;
                PublicKey publicKey = this.a.getPublic();
                int i = this.b;
                int i2 = ausa.b;
                aucd o = ausk.d.o();
                autx a3 = autq.a(publicKey);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                ausk ausk = (ausk) o.b;
                a3.getClass();
                ausk.b = a3;
                int i3 = 1 | ausk.a;
                ausk.a = i3;
                ausk.a = i3 | 2;
                ausk.c = i;
                return ausa.a(ausv, secretKey, ((ausk) o.i()).k());
            } catch (InvalidKeyException | NoSuchAlgorithmException e2) {
                throw new ausp((Exception) e2);
            }
        } else {
            throw new ausp("Not expecting null payload");
        }
    }

    public final byte[] c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new ausp("Handshake message too short");
        }
        int i = this.c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            byte[] d2 = d(bArr);
            this.c = 5;
            return d2;
        } else if (i2 == 2) {
            e(bArr);
            this.c = 4;
            return new byte[0];
        } else {
            String a2 = ausb.a(i);
            StringBuilder sb = new StringBuilder(a2.length() + 31);
            sb.append("Cannot parse message in state: ");
            sb.append(a2);
            throw new ausp(sb.toString());
        }
    }

    public final aurx d() {
        SecretKey secretKey;
        SecretKey secretKey2;
        if (this.c == 6) {
            throw new ausp("Cannot reuse handshake context; is has already been used");
        } else if (b()) {
            this.c = 6;
            if (this.b == 0) {
                return new aury(this.e);
            }
            boolean z = this.g;
            if (!z) {
                secretKey = this.f;
            } else {
                secretKey = this.e;
            }
            if (!z) {
                secretKey2 = this.e;
            } else {
                secretKey2 = this.f;
            }
            return new aurz(secretKey, secretKey2, !z ? 1 : 0, z ? 1 : 0);
        } else {
            throw new ausp("Handshake is not complete; cannot create connection context");
        }
    }
}
