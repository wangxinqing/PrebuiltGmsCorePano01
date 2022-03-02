package defpackage;

import javax.crypto.Mac;
import javax.crypto.SecretKey;

/* renamed from: pyf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pyf {
    private final Mac a;

    public pyf() {
        this.a = null;
    }

    public final void a(SecretKey secretKey) {
        this.a.init(secretKey);
    }

    public final byte[] b(byte[] bArr) {
        return this.a.doFinal(bArr);
    }

    public pyf(Mac mac) {
        this.a = mac;
    }

    public final void a(byte[] bArr) {
        this.a.update(bArr);
    }
}
