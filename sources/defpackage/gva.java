package defpackage;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: gva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gva implements X509TrustManager {
    private final X509TrustManager a;

    public gva(X509TrustManager x509TrustManager) {
        this.a = x509TrustManager;
    }

    private static X509Certificate[] a(X509Certificate[] x509CertificateArr) {
        X509Certificate[] x509CertificateArr2 = new X509Certificate[x509CertificateArr.length];
        for (int i = 0; i < x509CertificateArr.length; i++) {
            x509CertificateArr2[i] = new guz(x509CertificateArr[i]);
        }
        return x509CertificateArr2;
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.a.checkClientTrusted(a(x509CertificateArr), str);
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.a.checkServerTrusted(a(x509CertificateArr), str);
    }

    public final X509Certificate[] getAcceptedIssuers() {
        return this.a.getAcceptedIssuers();
    }
}
