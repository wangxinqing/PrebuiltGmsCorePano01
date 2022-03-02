package com.google.android.gms.org.conscrypt.ct;

import java.security.cert.X509Certificate;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface CTPolicy {
    boolean doesResultConformToPolicy(CTVerificationResult cTVerificationResult, String str, X509Certificate[] x509CertificateArr);
}
