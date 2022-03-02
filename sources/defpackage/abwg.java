package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: abwg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abwg {
    private static final acpz a = acqa.a("AesGcmConnectionAuthenticator");
    private final int b;
    private final String c;
    private final SecretKey d;

    private abwg(int i, String str, byte[] bArr) {
        boolean z = true;
        i = i != 1 ? 2 : i;
        StringBuilder sb = new StringBuilder(25);
        sb.append("Invalid role: ");
        sb.append(i);
        iva.b(true, sb.toString());
        if (i == 2) {
            iva.b(bArr == null ? false : z, "Key should not be null if role is ROLE_SOURCE");
        }
        this.b = i;
        this.c = str;
        if (bArr != null) {
            this.d = new SecretKeySpec(bArr, 0, bArr.length, "AES");
        } else {
            this.d = b();
        }
    }

    public static abwg a(int i, String str, byte[] bArr) {
        boolean z;
        if (bArr != null) {
            if (bArr.length == 32) {
                z = true;
            } else {
                z = false;
            }
            iva.b(z);
        }
        try {
            Cipher.getInstance("AES/GCM/NoPadding");
            try {
                return new abwg(i, str, bArr);
            } catch (NoSuchAlgorithmException e) {
                a.e("AES key generator not supported", e, new Object[0]);
                return null;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            a.e("AES/GCM/NoPadding not supported", e2, new Object[0]);
            return null;
        }
    }

    public static SecretKey b() {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        return instance.generateKey();
    }

    public final void a(byte[] bArr) {
        try {
            abwq abwq = (abwq) aucj.a((aucj) abwq.d, bArr, aubs.c());
            int a2 = abwp.a(abwq.b);
            if (a2 == 0 || a2 != 2) {
                a.e("Expecting V1 frame", new Object[0]);
                throw new GeneralSecurityException("Expecting V1 frame");
            } else if ((abwq.a & 2) != 0) {
                abws abws = abwq.c;
                if (abws == null) {
                    abws = abws.d;
                }
                IvParameterSpec ivParameterSpec = new IvParameterSpec(abws.b.k());
                try {
                    Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                    instance.init(2, this.d, ivParameterSpec);
                    abws abws2 = abwq.c;
                    if (abws2 == null) {
                        abws2 = abws.d;
                    }
                    byte[] doFinal = instance.doFinal(abws2.c.k());
                    try {
                        abwr abwr = (abwr) aucj.a((aucj) abwr.d, doFinal, aubs.c());
                        if (this.b == abwr.b) {
                            throw new GeneralSecurityException("Unexpected role in payload");
                        } else if (!this.c.equals(abwr.c)) {
                            throw new GeneralSecurityException("Authentication string mismatch");
                        }
                    } catch (auda e) {
                        a.e("Invalid AuthenticationPayload proto", e, new Object[0]);
                        throw new GeneralSecurityException("Failed to deserialize AuthenticationPayload", e);
                    }
                } catch (GeneralSecurityException e2) {
                    a.e("Decryption error", e2, new Object[0]);
                    throw e2;
                }
            } else {
                a.e("Message missing V1 frame", new Object[0]);
                throw new GeneralSecurityException("Message missing V1 frame");
            }
        } catch (auda e3) {
            a.e("Failed to deserialize AesGcmAuthenticationMessage", e3, new Object[0]);
            throw new GeneralSecurityException("Failed to deserialize AesGcmAuthenticationMessage", e3);
        }
    }

    public final byte[] a() {
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        try {
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, this.d, ivParameterSpec);
            aucd o = abwr.d.o();
            int i = this.b;
            if (o.c) {
                o.c();
                o.c = false;
            }
            abwr abwr = (abwr) o.b;
            int i2 = abwr.a | 1;
            abwr.a = i2;
            abwr.b = i;
            String str = this.c;
            str.getClass();
            abwr.a = i2 | 2;
            abwr.c = str;
            byte[] doFinal = instance.doFinal(((abwr) o.i()).k());
            aucd o2 = abwq.d.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            abwq abwq = (abwq) o2.b;
            abwq.b = 1;
            abwq.a |= 1;
            aucd o3 = abws.d.o();
            auay a2 = auay.a(bArr);
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            abws abws = (abws) o3.b;
            a2.getClass();
            abws.a = 1 | abws.a;
            abws.b = a2;
            auay a3 = auay.a(doFinal);
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            abws abws2 = (abws) o3.b;
            a3.getClass();
            abws2.a |= 2;
            abws2.c = a3;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            abwq abwq2 = (abwq) o2.b;
            abws abws3 = (abws) o3.i();
            abws3.getClass();
            abwq2.c = abws3;
            abwq2.a |= 2;
            return ((abwq) o2.i()).k();
        } catch (GeneralSecurityException e) {
            a.e("Encryption error", e, new Object[0]);
            throw e;
        }
    }
}
