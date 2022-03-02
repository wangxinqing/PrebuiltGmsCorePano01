package com.google.android.gms.org.conscrypt;

import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLSession;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
interface ConscryptSession extends SSLSession {
    X509Certificate[] getPeerCertificates();

    byte[] getPeerSignedCertificateTimestamp();

    String getRequestedServerName();

    List getStatusResponses();
}
