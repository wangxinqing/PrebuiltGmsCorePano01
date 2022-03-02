package defpackage;

import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.SecretKey;

/* renamed from: aurz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aurz extends aurx {
    private final SecretKey a;
    private final SecretKey b;
    private int c;
    private int d;

    public aurz(SecretKey secretKey, SecretKey secretKey2, int i, int i2) {
        this.a = secretKey;
        this.b = secretKey2;
        this.c = i;
        this.d = i2;
    }

    public final byte[] a() {
        byte[] bArr;
        SecretKey secretKey = this.a;
        if (secretKey == null || this.b == null) {
            throw new IllegalStateException("Connection has not been correctly initialized; encode key or decode key is null");
        }
        byte[] encoded = secretKey.getEncoded();
        byte[] encoded2 = this.b.getEncoded();
        if (Arrays.hashCode(encoded) < Arrays.hashCode(encoded2)) {
            bArr = encoded;
        } else {
            bArr = encoded2;
        }
        if (bArr == encoded) {
            encoded = encoded2;
        }
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        instance.update(ausa.a);
        instance.update(bArr);
        instance.update(encoded);
        return instance.digest();
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.c++;
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.d++;
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.d;
    }

    public final SecretKey f() {
        return this.a;
    }

    public final SecretKey g() {
        return this.b;
    }
}
