package com.google.android.gms.org.conscrypt;

import javax.net.ssl.SSLSession;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface SSLClientSessionCache {
    byte[] getSessionData(String str, int i);

    void putSessionData(SSLSession sSLSession, byte[] bArr);
}
