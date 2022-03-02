package com.google.android.gms.org.conscrypt;

import java.security.KeyManagementException;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DefaultSSLContextImpl extends OpenSSLContextImpl {
    private static KeyManager[] KEY_MANAGERS;
    private static TrustManager[] TRUST_MANAGERS;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class TLSv12 extends DefaultSSLContextImpl {
        public TLSv12() {
            super(NativeCrypto.TLSV12_PROTOCOLS);
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class TLSv13 extends DefaultSSLContextImpl {
        public TLSv13() {
            super(NativeCrypto.TLSV13_PROTOCOLS);
        }
    }

    private DefaultSSLContextImpl(String[] strArr) {
        super(strArr, true);
    }

    public void engineInit(KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, SecureRandom secureRandom) {
        throw new KeyManagementException("Do not init() the default SSLContext ");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public javax.net.ssl.KeyManager[] getKeyManagers() {
        /*
            r6 = this;
            javax.net.ssl.KeyManager[] r0 = KEY_MANAGERS
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = "javax.net.ssl.keyStore"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 0
            if (r0 == 0) goto L_0x004f
            java.lang.String r2 = "javax.net.ssl.keyStorePassword"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            if (r2 == 0) goto L_0x001a
            char[] r2 = r2.toCharArray()
            goto L_0x001b
        L_0x001a:
            r2 = r1
        L_0x001b:
            java.lang.String r3 = java.security.KeyStore.getDefaultType()
            java.security.KeyStore r3 = java.security.KeyStore.getInstance(r3)
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0048 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x0048 }
            r5.<init>(r0)     // Catch:{ all -> 0x0048 }
            r4.<init>(r5)     // Catch:{ all -> 0x0048 }
            r3.load(r4, r2)     // Catch:{ all -> 0x0045 }
            r4.close()
            java.lang.String r0 = javax.net.ssl.KeyManagerFactory.getDefaultAlgorithm()
            javax.net.ssl.KeyManagerFactory r0 = javax.net.ssl.KeyManagerFactory.getInstance(r0)
            r0.init(r3, r2)
            javax.net.ssl.KeyManager[] r0 = r0.getKeyManagers()
            KEY_MANAGERS = r0
            return r0
        L_0x0045:
            r0 = move-exception
            r1 = r4
            goto L_0x0049
        L_0x0048:
            r0 = move-exception
        L_0x0049:
            if (r1 == 0) goto L_0x004e
            r1.close()
        L_0x004e:
            throw r0
        L_0x004f:
            return r1
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.DefaultSSLContextImpl.getKeyManagers():javax.net.ssl.KeyManager[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public javax.net.ssl.TrustManager[] getTrustManagers() {
        /*
            r6 = this;
            javax.net.ssl.TrustManager[] r0 = TRUST_MANAGERS
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = "javax.net.ssl.trustStore"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 0
            if (r0 == 0) goto L_0x004f
            java.lang.String r2 = "javax.net.ssl.trustStorePassword"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            if (r2 == 0) goto L_0x001a
            char[] r2 = r2.toCharArray()
            goto L_0x001b
        L_0x001a:
            r2 = r1
        L_0x001b:
            java.lang.String r3 = java.security.KeyStore.getDefaultType()
            java.security.KeyStore r3 = java.security.KeyStore.getInstance(r3)
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0048 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x0048 }
            r5.<init>(r0)     // Catch:{ all -> 0x0048 }
            r4.<init>(r5)     // Catch:{ all -> 0x0048 }
            r3.load(r4, r2)     // Catch:{ all -> 0x0045 }
            r4.close()
            java.lang.String r0 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()
            javax.net.ssl.TrustManagerFactory r0 = javax.net.ssl.TrustManagerFactory.getInstance(r0)
            r0.init(r3)
            javax.net.ssl.TrustManager[] r0 = r0.getTrustManagers()
            TRUST_MANAGERS = r0
            return r0
        L_0x0045:
            r0 = move-exception
            r1 = r4
            goto L_0x0049
        L_0x0048:
            r0 = move-exception
        L_0x0049:
            if (r1 == 0) goto L_0x004e
            r1.close()
        L_0x004e:
            throw r0
        L_0x004f:
            return r1
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.DefaultSSLContextImpl.getTrustManagers():javax.net.ssl.TrustManager[]");
    }
}
