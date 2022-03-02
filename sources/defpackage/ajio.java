package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: ajio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajio {
    private SecretKeySpec a;
    private Cipher b;
    private Cipher c;

    public ajio(SecretKeySpec secretKeySpec) {
        this.a = secretKeySpec;
    }

    private static Cipher a(int i, SecretKeySpec secretKeySpec) {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(i, secretKeySpec, new IvParameterSpec(new byte[16]));
        return instance;
    }

    public final byte[] b(byte[] bArr) {
        try {
            if (this.c == null) {
                this.c = a(2, this.a);
            }
            return this.c.doFinal(bArr);
        } catch (GeneralSecurityException e) {
            this.c = null;
            throw e;
        }
    }

    public final void a(SecretKeySpec secretKeySpec) {
        this.a = secretKeySpec;
        try {
            this.b = a(1, secretKeySpec);
            this.c = a(2, this.a);
        } catch (GeneralSecurityException e) {
            this.b = null;
            this.c = null;
        }
    }

    public final byte[] a(byte[] bArr) {
        try {
            if (this.b == null) {
                this.b = a(1, this.a);
            }
            return this.b.doFinal(bArr);
        } catch (GeneralSecurityException e) {
            this.b = null;
            throw e;
        }
    }
}
