package com.google.android.gms.org.conscrypt;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import javax.net.ssl.ManagerFactoryParameters;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactorySpi;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TrustManagerFactoryImpl extends TrustManagerFactorySpi {
    private KeyStore keyStore;

    public TrustManager[] engineGetTrustManagers() {
        KeyStore keyStore2 = this.keyStore;
        if (keyStore2 != null) {
            return new TrustManager[]{new TrustManagerImpl(keyStore2)};
        }
        throw new IllegalStateException("TrustManagerFactory is not initialized");
    }

    public void engineInit(KeyStore keyStore2) {
        if (keyStore2 == null) {
            keyStore2 = Platform.getDefaultCertKeyStore();
        }
        this.keyStore = keyStore2;
    }

    public void engineInit(ManagerFactoryParameters managerFactoryParameters) {
        throw new InvalidAlgorithmParameterException("ManagerFactoryParameters not supported");
    }
}
