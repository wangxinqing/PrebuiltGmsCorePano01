package com.google.android.gms.org.conscrypt;

import java.security.cert.X509Certificate;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface ConscryptCertStore {
    Set findAllIssuers(X509Certificate x509Certificate);

    X509Certificate getTrustAnchor(X509Certificate x509Certificate);
}
