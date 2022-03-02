package com.google.android.gms.org.conscrypt;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class SSLParametersImpl implements Cloneable {
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    private static volatile SSLParametersImpl defaultParameters;
    private static volatile X509KeyManager defaultX509KeyManager;
    private static volatile X509TrustManager defaultX509TrustManager;
    ApplicationProtocolSelectorAdapter applicationProtocolSelector;
    byte[] applicationProtocols = EmptyArray.BYTE;
    boolean channelIdEnabled;
    private final ClientSessionContext clientSessionContext;
    private boolean client_mode = true;
    private boolean ctVerificationEnabled;
    private boolean enable_session_creation = true;
    String[] enabledCipherSuites;
    String[] enabledProtocols;
    private String endpointIdentificationAlgorithm;
    boolean isEnabledProtocolsFiltered;
    private boolean need_client_auth = false;
    byte[] ocspResponse;
    private final PSKKeyManager pskKeyManager;
    byte[] sctExtension;
    private final ServerSessionContext serverSessionContext;
    private boolean useCipherSuitesOrder;
    boolean useSessionTickets;
    private Boolean useSni;
    private boolean want_client_auth = false;
    private final X509KeyManager x509KeyManager;
    private final X509TrustManager x509TrustManager;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    interface AliasChooser {
        String chooseClientAlias(X509KeyManager x509KeyManager, X500Principal[] x500PrincipalArr, String[] strArr);

        String chooseServerAlias(X509KeyManager x509KeyManager, String str);
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    interface PSKCallbacks {
        String chooseClientPSKIdentity(PSKKeyManager pSKKeyManager, String str);

        String chooseServerPSKIdentityHint(PSKKeyManager pSKKeyManager);

        SecretKey getPSKKey(PSKKeyManager pSKKeyManager, String str, String str2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private SSLParametersImpl(com.google.android.gms.org.conscrypt.ClientSessionContext r3, com.google.android.gms.org.conscrypt.ServerSessionContext r4, javax.net.ssl.X509KeyManager r5, com.google.android.gms.org.conscrypt.PSKKeyManager r6, javax.net.ssl.X509TrustManager r7, com.google.android.gms.org.conscrypt.SSLParametersImpl r8) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.client_mode = r0
            r1 = 0
            r2.need_client_auth = r1
            r2.want_client_auth = r1
            r2.enable_session_creation = r0
            byte[] r0 = com.google.android.gms.org.conscrypt.EmptyArray.BYTE
            r2.applicationProtocols = r0
            r2.clientSessionContext = r3
            r2.serverSessionContext = r4
            r2.x509KeyManager = r5
            r2.pskKeyManager = r6
            r2.x509TrustManager = r7
            java.lang.String[] r3 = r8.enabledProtocols
            r4 = 0
            if (r3 == 0) goto L_0x0027
            java.lang.Object r3 = r3.clone()
            java.lang.String[] r3 = (java.lang.String[]) r3
            goto L_0x0028
        L_0x0027:
            r3 = r4
        L_0x0028:
            r2.enabledProtocols = r3
            boolean r3 = r8.isEnabledProtocolsFiltered
            r2.isEnabledProtocolsFiltered = r3
            java.lang.String[] r3 = r8.enabledCipherSuites
            if (r3 == 0) goto L_0x0039
            java.lang.Object r3 = r3.clone()
            java.lang.String[] r3 = (java.lang.String[]) r3
            goto L_0x003a
        L_0x0039:
            r3 = r4
        L_0x003a:
            r2.enabledCipherSuites = r3
            boolean r3 = r8.client_mode
            r2.client_mode = r3
            boolean r3 = r8.need_client_auth
            r2.need_client_auth = r3
            boolean r3 = r8.want_client_auth
            r2.want_client_auth = r3
            boolean r3 = r8.enable_session_creation
            r2.enable_session_creation = r3
            java.lang.String r3 = r8.endpointIdentificationAlgorithm
            r2.endpointIdentificationAlgorithm = r3
            boolean r3 = r8.useCipherSuitesOrder
            r2.useCipherSuitesOrder = r3
            boolean r3 = r8.ctVerificationEnabled
            r2.ctVerificationEnabled = r3
            byte[] r3 = r8.sctExtension
            if (r3 == 0) goto L_0x0063
            java.lang.Object r3 = r3.clone()
            byte[] r3 = (byte[]) r3
            goto L_0x0064
        L_0x0063:
            r3 = r4
        L_0x0064:
            r2.sctExtension = r3
            byte[] r3 = r8.ocspResponse
            if (r3 == 0) goto L_0x0071
            java.lang.Object r3 = r3.clone()
            byte[] r3 = (byte[]) r3
            goto L_0x0072
        L_0x0071:
            r3 = r4
        L_0x0072:
            r2.ocspResponse = r3
            byte[] r3 = r8.applicationProtocols
            if (r3 == 0) goto L_0x0080
            java.lang.Object r3 = r3.clone()
            r4 = r3
            byte[] r4 = (byte[]) r4
            goto L_0x0081
        L_0x0080:
        L_0x0081:
            r2.applicationProtocols = r4
            com.google.android.gms.org.conscrypt.ApplicationProtocolSelectorAdapter r3 = r8.applicationProtocolSelector
            r2.applicationProtocolSelector = r3
            boolean r3 = r8.useSessionTickets
            r2.useSessionTickets = r3
            java.lang.Boolean r3 = r8.useSni
            r2.useSni = r3
            boolean r3 = r8.channelIdEnabled
            r2.channelIdEnabled = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.SSLParametersImpl.<init>(com.google.android.gms.org.conscrypt.ClientSessionContext, com.google.android.gms.org.conscrypt.ServerSessionContext, javax.net.ssl.X509KeyManager, com.google.android.gms.org.conscrypt.PSKKeyManager, javax.net.ssl.X509TrustManager, com.google.android.gms.org.conscrypt.SSLParametersImpl):void");
    }

    private static X509KeyManager createDefaultX509KeyManager() {
        try {
            KeyManagerFactory instance = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null, (char[]) null);
            KeyManager[] keyManagers = instance.getKeyManagers();
            X509KeyManager findFirstX509KeyManager = findFirstX509KeyManager(keyManagers);
            if (findFirstX509KeyManager != null) {
                return findFirstX509KeyManager;
            }
            String valueOf = String.valueOf(Arrays.toString(keyManagers));
            throw new KeyManagementException(valueOf.length() == 0 ? new String("No X509KeyManager among default KeyManagers: ") : "No X509KeyManager among default KeyManagers: ".concat(valueOf));
        } catch (NoSuchAlgorithmException e) {
            throw new KeyManagementException(e);
        } catch (KeyStoreException e2) {
            throw new KeyManagementException(e2);
        } catch (UnrecoverableKeyException e3) {
            throw new KeyManagementException(e3);
        }
    }

    private static X509TrustManager createDefaultX509TrustManager() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            X509TrustManager findFirstX509TrustManager = findFirstX509TrustManager(trustManagers);
            if (findFirstX509TrustManager != null) {
                return findFirstX509TrustManager;
            }
            String valueOf = String.valueOf(Arrays.toString(trustManagers));
            throw new KeyManagementException(valueOf.length() == 0 ? new String("No X509TrustManager in among default TrustManagers: ") : "No X509TrustManager in among default TrustManagers: ".concat(valueOf));
        } catch (NoSuchAlgorithmException e) {
            throw new KeyManagementException(e);
        } catch (KeyStoreException e2) {
            throw new KeyManagementException(e2);
        }
    }

    private static String[] filterFromCipherSuites(String[] strArr, Set set) {
        int length;
        if (strArr == null || (length = strArr.length) == 0) {
            return strArr;
        }
        ArrayList arrayList = new ArrayList(length);
        for (String str : strArr) {
            if (!set.contains(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(EMPTY_STRING_ARRAY);
    }

    private static String[] filterFromProtocols(String[] strArr, String str) {
        if (r0 == 1 && str.equals(strArr[0])) {
            return EMPTY_STRING_ARRAY;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            if (!str.equals(str2)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(EMPTY_STRING_ARRAY);
    }

    private static PSKKeyManager findFirstPSKKeyManager(KeyManager[] keyManagerArr) {
        for (PSKKeyManager pSKKeyManager : keyManagerArr) {
            if (pSKKeyManager instanceof PSKKeyManager) {
                return pSKKeyManager;
            }
            if (pSKKeyManager != null) {
                try {
                    return DuckTypedPSKKeyManager.getInstance(pSKKeyManager);
                } catch (NoSuchMethodException e) {
                }
            }
        }
        return null;
    }

    private static X509KeyManager findFirstX509KeyManager(KeyManager[] keyManagerArr) {
        for (X509KeyManager x509KeyManager2 : keyManagerArr) {
            if (x509KeyManager2 instanceof X509KeyManager) {
                return x509KeyManager2;
            }
        }
        return null;
    }

    private static X509TrustManager findFirstX509TrustManager(TrustManager[] trustManagerArr) {
        for (X509TrustManager x509TrustManager2 : trustManagerArr) {
            if (x509TrustManager2 instanceof X509TrustManager) {
                return x509TrustManager2;
            }
        }
        return null;
    }

    static SSLParametersImpl getDefault() {
        SSLParametersImpl sSLParametersImpl = defaultParameters;
        if (sSLParametersImpl == null) {
            sSLParametersImpl = new SSLParametersImpl((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null, new ClientSessionContext(), new ServerSessionContext(), (String[]) null);
            defaultParameters = sSLParametersImpl;
        }
        return (SSLParametersImpl) sSLParametersImpl.clone();
    }

    private static String[] getDefaultCipherSuites(boolean z, boolean z2) {
        if (!z) {
            if (z2) {
                return SSLUtils.concat(NativeCrypto.DEFAULT_PSK_CIPHER_SUITES, new String[]{"TLS_EMPTY_RENEGOTIATION_INFO_SCSV"});
            }
            return new String[]{"TLS_EMPTY_RENEGOTIATION_INFO_SCSV"};
        } else if (z2) {
            return SSLUtils.concat(NativeCrypto.DEFAULT_PSK_CIPHER_SUITES, NativeCrypto.DEFAULT_X509_CIPHER_SUITES, new String[]{"TLS_EMPTY_RENEGOTIATION_INFO_SCSV"});
        } else {
            return SSLUtils.concat(NativeCrypto.DEFAULT_X509_CIPHER_SUITES, new String[]{"TLS_EMPTY_RENEGOTIATION_INFO_SCSV"});
        }
    }

    private static X509KeyManager getDefaultX509KeyManager() {
        X509KeyManager x509KeyManager2 = defaultX509KeyManager;
        if (x509KeyManager2 != null) {
            return x509KeyManager2;
        }
        X509KeyManager createDefaultX509KeyManager = createDefaultX509KeyManager();
        defaultX509KeyManager = createDefaultX509KeyManager;
        return createDefaultX509KeyManager;
    }

    static X509TrustManager getDefaultX509TrustManager() {
        X509TrustManager x509TrustManager2 = defaultX509TrustManager;
        if (x509TrustManager2 != null) {
            return x509TrustManager2;
        }
        X509TrustManager createDefaultX509TrustManager = createDefaultX509TrustManager();
        defaultX509TrustManager = createDefaultX509TrustManager;
        return createDefaultX509TrustManager;
    }

    private boolean isSniEnabledByDefault() {
        try {
            String property = System.getProperty("jsse.enableSNIExtension", "true");
            if ("true".equalsIgnoreCase(property)) {
                return true;
            }
            if ("false".equalsIgnoreCase(property)) {
                return false;
            }
            throw new RuntimeException("Can only set \"jsse.enableSNIExtension\" to \"true\" or \"false\"");
        } catch (SecurityException e) {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public SSLParametersImpl cloneWithTrustManager(X509TrustManager x509TrustManager2) {
        return new SSLParametersImpl(this.clientSessionContext, this.serverSessionContext, this.x509KeyManager, this.pskKeyManager, x509TrustManager2, this);
    }

    public String[] getApplicationProtocols() {
        return SSLUtils.decodeProtocols(this.applicationProtocols);
    }

    public ClientSessionContext getClientSessionContext() {
        return this.clientSessionContext;
    }

    public boolean getEnableSessionCreation() {
        return this.enable_session_creation;
    }

    public String[] getEnabledCipherSuites() {
        if (!Arrays.asList(this.enabledProtocols).contains("TLSv1.3")) {
            return (String[]) this.enabledCipherSuites.clone();
        }
        return SSLUtils.concat(NativeCrypto.SUPPORTED_TLS_1_3_CIPHER_SUITES, this.enabledCipherSuites);
    }

    public String[] getEnabledProtocols() {
        return (String[]) this.enabledProtocols.clone();
    }

    public String getEndpointIdentificationAlgorithm() {
        return this.endpointIdentificationAlgorithm;
    }

    public boolean getNeedClientAuth() {
        return this.need_client_auth;
    }

    public byte[] getOCSPResponse() {
        return this.ocspResponse;
    }

    public PSKKeyManager getPSKKeyManager() {
        return this.pskKeyManager;
    }

    public AbstractSessionContext getSessionContext() {
        return !this.client_mode ? this.serverSessionContext : this.clientSessionContext;
    }

    public boolean getUseCipherSuitesOrder() {
        return this.useCipherSuitesOrder;
    }

    public boolean getUseClientMode() {
        return this.client_mode;
    }

    public boolean getUseSni() {
        Boolean bool = this.useSni;
        return bool != null ? bool.booleanValue() : isSniEnabledByDefault();
    }

    public boolean getWantClientAuth() {
        return this.want_client_auth;
    }

    public X509KeyManager getX509KeyManager() {
        return this.x509KeyManager;
    }

    public X509TrustManager getX509TrustManager() {
        return this.x509TrustManager;
    }

    public boolean isCTVerificationEnabled(String str) {
        if (str == null) {
            return false;
        }
        if (!this.ctVerificationEnabled) {
            return Platform.isCTVerificationRequired(str);
        }
        return true;
    }

    public void setApplicationProtocolSelector(ApplicationProtocolSelectorAdapter applicationProtocolSelectorAdapter) {
        this.applicationProtocolSelector = applicationProtocolSelectorAdapter;
    }

    public void setApplicationProtocols(String[] strArr) {
        this.applicationProtocols = SSLUtils.encodeProtocols(strArr);
    }

    /* access modifiers changed from: package-private */
    public void setCTVerificationEnabled(boolean z) {
        this.ctVerificationEnabled = z;
    }

    public void setEnableSessionCreation(boolean z) {
        this.enable_session_creation = z;
    }

    public void setEnabledCipherSuites(String[] strArr) {
        String[] filterFromCipherSuites = filterFromCipherSuites(strArr, NativeCrypto.SUPPORTED_TLS_1_3_CIPHER_SUITES_SET);
        NativeCrypto.checkEnabledCipherSuites(filterFromCipherSuites);
        this.enabledCipherSuites = filterFromCipherSuites;
    }

    public void setEnabledProtocols(String[] strArr) {
        boolean z;
        if (strArr != null) {
            String[] filterFromProtocols = filterFromProtocols(strArr, "SSLv3");
            if (strArr.length != filterFromProtocols.length) {
                z = true;
            } else {
                z = false;
            }
            this.isEnabledProtocolsFiltered = z;
            NativeCrypto.checkEnabledProtocols(filterFromProtocols);
            this.enabledProtocols = (String[]) filterFromProtocols.clone();
            return;
        }
        throw new IllegalArgumentException("protocols == null");
    }

    public void setEndpointIdentificationAlgorithm(String str) {
        this.endpointIdentificationAlgorithm = str;
    }

    public void setNeedClientAuth(boolean z) {
        this.need_client_auth = z;
        this.want_client_auth = false;
    }

    /* access modifiers changed from: package-private */
    public void setOCSPResponse(byte[] bArr) {
        this.ocspResponse = bArr;
    }

    /* access modifiers changed from: package-private */
    public void setSCTExtension(byte[] bArr) {
        this.sctExtension = bArr;
    }

    public void setUseCipherSuitesOrder(boolean z) {
        this.useCipherSuitesOrder = z;
    }

    public void setUseClientMode(boolean z) {
        this.client_mode = z;
    }

    public void setUseSessionTickets(boolean z) {
        this.useSessionTickets = z;
    }

    public void setUseSni(boolean z) {
        this.useSni = Boolean.valueOf(z);
    }

    public void setWantClientAuth(boolean z) {
        this.want_client_auth = z;
        this.need_client_auth = false;
    }

    public SSLParametersImpl(KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, SecureRandom secureRandom, ClientSessionContext clientSessionContext2, ServerSessionContext serverSessionContext2, String[] strArr) {
        boolean z;
        boolean z2 = true;
        this.serverSessionContext = serverSessionContext2;
        this.clientSessionContext = clientSessionContext2;
        if (keyManagerArr == null) {
            this.x509KeyManager = getDefaultX509KeyManager();
            this.pskKeyManager = null;
        } else {
            this.x509KeyManager = findFirstX509KeyManager(keyManagerArr);
            this.pskKeyManager = findFirstPSKKeyManager(keyManagerArr);
        }
        if (trustManagerArr != null) {
            this.x509TrustManager = findFirstX509TrustManager(trustManagerArr);
        } else {
            this.x509TrustManager = getDefaultX509TrustManager();
        }
        strArr = strArr == null ? NativeCrypto.DEFAULT_PROTOCOLS : strArr;
        NativeCrypto.checkEnabledProtocols(strArr);
        this.enabledProtocols = (String[]) strArr.clone();
        if (this.x509KeyManager == null && this.x509TrustManager == null) {
            z = false;
        } else {
            z = true;
        }
        this.enabledCipherSuites = getDefaultCipherSuites(z, this.pskKeyManager == null ? false : z2);
    }
}
