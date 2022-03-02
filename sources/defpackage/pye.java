package defpackage;

import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: pye  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pye {
    private final Cipher a;

    public pye() {
        this.a = null;
    }

    public final void a(int i, SecretKey secretKey, IvParameterSpec ivParameterSpec, SecureRandom secureRandom) {
        this.a.init(i, secretKey, ivParameterSpec, secureRandom);
    }

    public pye(Cipher cipher) {
        this.a = cipher;
    }

    public final byte[] a(byte[] bArr) {
        return this.a.doFinal(bArr);
    }
}
