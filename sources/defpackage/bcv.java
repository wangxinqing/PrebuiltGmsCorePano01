package defpackage;

import java.security.cert.X509Certificate;

/* renamed from: bcv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bcv extends bcw {
    private final byte[] a;

    public bcv(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.a = bArr;
    }

    public final byte[] getEncoded() {
        return this.a;
    }
}
