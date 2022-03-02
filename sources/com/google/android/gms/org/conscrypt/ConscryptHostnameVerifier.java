package com.google.android.gms.org.conscrypt;

import javax.net.ssl.SSLSession;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface ConscryptHostnameVerifier {
    boolean verify(String str, SSLSession sSLSession);
}
