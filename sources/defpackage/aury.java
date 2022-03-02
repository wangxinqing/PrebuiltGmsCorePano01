package defpackage;

import java.security.MessageDigest;
import javax.crypto.SecretKey;

/* renamed from: aury  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aury extends aurx {
    private final SecretKey a;
    private int b = 1;

    public aury(SecretKey secretKey) {
        this.a = secretKey;
    }

    public final byte[] a() {
        if (this.a != null) {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(ausa.a);
            return instance.digest(this.a.getEncoded());
        }
        throw new IllegalStateException("Connection has not been correctly initialized; shared key is null");
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.b++;
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.b++;
    }

    public final int d() {
        return this.b;
    }

    public final int e() {
        return this.b;
    }

    public final SecretKey f() {
        return this.a;
    }

    public final SecretKey g() {
        return this.a;
    }
}
