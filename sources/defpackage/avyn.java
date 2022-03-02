package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Map;

/* renamed from: avyn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avyn {
    public static final avyn a = new avyn(new avym());
    public final Map b;

    public avyn(avym avym) {
        this.b = awaj.a(avym.a);
    }

    public static batg a(X509Certificate x509Certificate) {
        return awaj.a(batg.a(x509Certificate.getPublicKey().getEncoded()));
    }

    public static String a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            String valueOf = String.valueOf(a((X509Certificate) certificate).b());
            return valueOf.length() == 0 ? new String("sha1/") : "sha1/".concat(valueOf);
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }
}
