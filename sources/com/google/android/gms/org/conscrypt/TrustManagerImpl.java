package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.ct.CTLogStore;
import com.google.android.gms.org.conscrypt.ct.CTPolicy;
import com.google.android.gms.org.conscrypt.ct.CTVerifier;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509ExtendedTrustManager;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class TrustManagerImpl extends X509ExtendedTrustManager {
    private static final TrustAnchorComparator TRUST_ANCHOR_COMPARATOR = new TrustAnchorComparator();
    private static ConscryptHostnameVerifier defaultHostnameVerifier;
    private static final Logger logger = Logger.getLogger(TrustManagerImpl.class.getName());
    private final X509Certificate[] acceptedIssuers;
    private final CertBlacklist blacklist;
    private boolean ctEnabledOverride;
    private CTPolicy ctPolicy;
    private CTVerifier ctVerifier;
    private final Exception err;
    private final CertificateFactory factory;
    private ConscryptHostnameVerifier hostnameVerifier;
    private final TrustedCertificateIndex intermediateIndex;
    private CertPinManager pinManager;
    private final KeyStore rootKeyStore;
    private final TrustedCertificateIndex trustedCertificateIndex;
    private final ConscryptCertStore trustedCertificateStore;
    private final CertPathValidator validator;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    class ExtendedKeyUsagePKIXCertPathChecker extends PKIXCertPathChecker {
        private static final String EKU_OID = "2.5.29.37";
        private static final String EKU_anyExtendedKeyUsage = "2.5.29.37.0";
        private static final String EKU_clientAuth = "1.3.6.1.5.5.7.3.2";
        private static final String EKU_msSGC = "1.3.6.1.4.1.311.10.3.3";
        private static final String EKU_nsSGC = "2.16.840.1.113730.4.1";
        private static final String EKU_serverAuth = "1.3.6.1.5.5.7.3.1";
        private static final Set SUPPORTED_EXTENSIONS = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{EKU_OID})));
        private final boolean clientAuth;
        private final X509Certificate leaf;

        private ExtendedKeyUsagePKIXCertPathChecker(boolean z, X509Certificate x509Certificate) {
            this.clientAuth = z;
            this.leaf = x509Certificate;
        }

        public void check(Certificate certificate, Collection collection) {
            X509Certificate x509Certificate = this.leaf;
            if (certificate == x509Certificate) {
                try {
                    List<String> extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
                    if (extendedKeyUsage != null) {
                        for (String next : extendedKeyUsage) {
                            if (!next.equals(EKU_anyExtendedKeyUsage)) {
                                if (this.clientAuth) {
                                    if (next.equals(EKU_clientAuth)) {
                                    }
                                } else if (!next.equals(EKU_serverAuth) && !next.equals(EKU_nsSGC) && !next.equals(EKU_msSGC)) {
                                }
                            }
                            collection.remove(EKU_OID);
                            return;
                        }
                        throw new CertPathValidatorException("End-entity certificate does not have a valid extendedKeyUsage.");
                    }
                } catch (CertificateParsingException e) {
                    throw new CertPathValidatorException(e);
                }
            }
        }

        public Set getSupportedExtensions() {
            return SUPPORTED_EXTENSIONS;
        }

        public void init(boolean z) {
        }

        public boolean isForwardCheckingSupported() {
            return true;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    enum GlobalHostnameVerifierAdapter implements ConscryptHostnameVerifier {
        INSTANCE;

        public boolean verify(String str, SSLSession sSLSession) {
            return HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    class TrustAnchorComparator implements Comparator {
        private static final CertificatePriorityComparator CERT_COMPARATOR = new CertificatePriorityComparator();

        private TrustAnchorComparator() {
        }

        public int compare(TrustAnchor trustAnchor, TrustAnchor trustAnchor2) {
            return CERT_COMPARATOR.compare(trustAnchor.getTrustedCert(), trustAnchor2.getTrustedCert());
        }
    }

    public TrustManagerImpl(KeyStore keyStore) {
        this(keyStore, (CertPinManager) null);
    }

    private static X509Certificate[] acceptedIssuers(KeyStore keyStore) {
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration<String> aliases = keyStore.aliases();
            while (aliases.hasMoreElements()) {
                X509Certificate x509Certificate = (X509Certificate) keyStore.getCertificate(aliases.nextElement());
                if (x509Certificate != null) {
                    arrayList.add(x509Certificate);
                }
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (KeyStoreException e) {
            return new X509Certificate[0];
        }
    }

    private void checkBlacklist(X509Certificate x509Certificate) {
        CertBlacklist certBlacklist = this.blacklist;
        if (certBlacklist != null && certBlacklist.isPublicKeyBlackListed(x509Certificate.getPublicKey())) {
            String valueOf = String.valueOf(x509Certificate);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append("Certificate blacklisted by public key: ");
            sb.append(valueOf);
            throw new CertificateException(sb.toString());
        }
    }

    private void checkCT(String str, List list, byte[] bArr, byte[] bArr2) {
        if (!this.ctPolicy.doesResultConformToPolicy(this.ctVerifier.verifySignedCertificateTimestamps(list, bArr2, bArr), str, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]))) {
            throw new CertificateException("Certificate chain does not conform to required transparency policy.");
        }
    }

    private List checkTrusted(X509Certificate[] x509CertificateArr, String str, SSLSession sSLSession, SSLParameters sSLParameters, boolean z) {
        String str2;
        byte[] bArr;
        byte[] bArr2;
        if (sSLSession != null) {
            str2 = sSLSession.getPeerHost();
            bArr2 = getOcspDataFromSession(sSLSession);
            bArr = getTlsSctDataFromSession(sSLSession);
        } else {
            bArr2 = null;
            bArr = null;
            str2 = null;
        }
        if (sSLSession == null || sSLParameters == null || !"HTTPS".equalsIgnoreCase(sSLParameters.getEndpointIdentificationAlgorithm()) || getHttpsVerifier().verify(str2, sSLSession)) {
            return checkTrusted(x509CertificateArr, bArr2, bArr, str, str2, z);
        }
        throw new CertificateException("No subjectAltNames on the certificate match");
    }

    private List checkTrustedRecursive(X509Certificate[] x509CertificateArr, byte[] bArr, byte[] bArr2, String str, boolean z, ArrayList arrayList, ArrayList arrayList2, Set set) {
        X509Certificate x509Certificate;
        X509Certificate[] x509CertificateArr2 = x509CertificateArr;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        Set set2 = set;
        if (arrayList2.isEmpty()) {
            x509Certificate = (X509Certificate) arrayList3.get(arrayList.size() - 1);
        } else {
            x509Certificate = ((TrustAnchor) arrayList4.get(arrayList2.size() - 1)).getTrustedCert();
        }
        checkBlacklist(x509Certificate);
        if (x509Certificate.getIssuerDN().equals(x509Certificate.getSubjectDN())) {
            return verifyChain(arrayList, arrayList2, str, z, bArr, bArr2);
        }
        boolean z2 = false;
        CertificateException certificateException = null;
        for (TrustAnchor trustAnchor : sortPotentialAnchors(findAllTrustAnchorsByIssuerAndSignature(x509Certificate))) {
            X509Certificate trustedCert = trustAnchor.getTrustedCert();
            if (!set2.contains(trustedCert)) {
                set2.add(trustedCert);
                arrayList4.add(trustAnchor);
                try {
                    return checkTrustedRecursive(x509CertificateArr, bArr, bArr2, str, z, arrayList, arrayList2, set);
                } catch (CertificateException e) {
                    arrayList4.remove(arrayList2.size() - 1);
                    set2.remove(trustedCert);
                    certificateException = e;
                    z2 = true;
                }
            }
        }
        if (arrayList2.isEmpty()) {
            for (int i = 1; i < x509CertificateArr2.length; i++) {
                X509Certificate x509Certificate2 = x509CertificateArr2[i];
                if (!set2.contains(x509Certificate2) && x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
                    try {
                        x509Certificate2.checkValidity();
                        ChainStrengthAnalyzer.checkCert(x509Certificate2);
                        set2.add(x509Certificate2);
                        arrayList3.add(x509Certificate2);
                        try {
                            return checkTrustedRecursive(x509CertificateArr, bArr, bArr2, str, z, arrayList, arrayList2, set);
                        } catch (CertificateException e2) {
                            set2.remove(x509Certificate2);
                            arrayList3.remove(arrayList.size() - 1);
                            certificateException = e2;
                        }
                    } catch (CertificateException e3) {
                        String valueOf = String.valueOf(x509Certificate2.getSubjectX500Principal());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                        sb.append("Unacceptable certificate: ");
                        sb.append(valueOf);
                        certificateException = new CertificateException(sb.toString(), e3);
                    }
                }
            }
            for (TrustAnchor trustedCert2 : sortPotentialAnchors(this.intermediateIndex.findAllByIssuerAndSignature(x509Certificate))) {
                X509Certificate trustedCert3 = trustedCert2.getTrustedCert();
                if (!set2.contains(trustedCert3)) {
                    set2.add(trustedCert3);
                    arrayList3.add(trustedCert3);
                    try {
                        return checkTrustedRecursive(x509CertificateArr, bArr, bArr2, str, z, arrayList, arrayList2, set);
                    } catch (CertificateException e4) {
                        arrayList3.remove(arrayList.size() - 1);
                        set2.remove(trustedCert3);
                        certificateException = e4;
                    }
                }
            }
            if (certificateException == null) {
                throw new CertificateException(new CertPathValidatorException("Trust anchor for certification path not found.", (Throwable) null, this.factory.generateCertPath(arrayList3), -1));
            }
            throw certificateException;
        } else if (!z2) {
            return verifyChain(arrayList, arrayList2, str, z, bArr, bArr2);
        } else {
            throw certificateException;
        }
    }

    private Set findAllTrustAnchorsByIssuerAndSignature(X509Certificate x509Certificate) {
        ConscryptCertStore conscryptCertStore;
        Set findAllByIssuerAndSignature = this.trustedCertificateIndex.findAllByIssuerAndSignature(x509Certificate);
        if (findAllByIssuerAndSignature.isEmpty() && (conscryptCertStore = this.trustedCertificateStore) != null) {
            Set<X509Certificate> findAllIssuers = conscryptCertStore.findAllIssuers(x509Certificate);
            if (!findAllIssuers.isEmpty()) {
                findAllByIssuerAndSignature = new HashSet(findAllIssuers.size());
                for (X509Certificate index : findAllIssuers) {
                    findAllByIssuerAndSignature.add(this.trustedCertificateIndex.index(index));
                }
            }
        }
        return findAllByIssuerAndSignature;
    }

    private TrustAnchor findTrustAnchorBySubjectAndPublicKey(X509Certificate x509Certificate) {
        X509Certificate trustAnchor;
        TrustAnchor findBySubjectAndPublicKey = this.trustedCertificateIndex.findBySubjectAndPublicKey(x509Certificate);
        if (findBySubjectAndPublicKey != null) {
            return findBySubjectAndPublicKey;
        }
        ConscryptCertStore conscryptCertStore = this.trustedCertificateStore;
        if (conscryptCertStore == null || (trustAnchor = conscryptCertStore.getTrustAnchor(x509Certificate)) == null) {
            return null;
        }
        return new TrustAnchor(trustAnchor, (byte[]) null);
    }

    static synchronized ConscryptHostnameVerifier getDefaultHostnameVerifier() {
        ConscryptHostnameVerifier conscryptHostnameVerifier;
        synchronized (TrustManagerImpl.class) {
            conscryptHostnameVerifier = defaultHostnameVerifier;
        }
        return conscryptHostnameVerifier;
    }

    private static SSLSession getHandshakeSessionOrThrow(SSLSocket sSLSocket) {
        SSLSession handshakeSession = sSLSocket.getHandshakeSession();
        if (handshakeSession != null) {
            return handshakeSession;
        }
        throw new CertificateException("Not in handshake; no session available");
    }

    private ConscryptHostnameVerifier getHttpsVerifier() {
        ConscryptHostnameVerifier conscryptHostnameVerifier = this.hostnameVerifier;
        if (conscryptHostnameVerifier != null) {
            return conscryptHostnameVerifier;
        }
        ConscryptHostnameVerifier defaultHostnameVerifier2 = getDefaultHostnameVerifier();
        return defaultHostnameVerifier2 == null ? GlobalHostnameVerifierAdapter.INSTANCE : defaultHostnameVerifier2;
    }

    private byte[] getOcspDataFromSession(SSLSession sSLSession) {
        List list;
        if (sSLSession instanceof ConscryptSession) {
            list = ((ConscryptSession) sSLSession).getStatusResponses();
        } else {
            try {
                Method declaredMethod = sSLSession.getClass().getDeclaredMethod("getStatusResponses", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(sSLSession, new Object[0]);
                if (invoke instanceof List) {
                    list = (List) invoke;
                }
            } catch (IllegalAccessException | NoSuchMethodException | SecurityException e) {
            } catch (IllegalArgumentException e2) {
                list = null;
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (byte[]) list.get(0);
    }

    private byte[] getTlsSctDataFromSession(SSLSession sSLSession) {
        if (sSLSession instanceof ConscryptSession) {
            return ((ConscryptSession) sSLSession).getPeerSignedCertificateTimestamp();
        }
        try {
            Method declaredMethod = sSLSession.getClass().getDeclaredMethod("getPeerSignedCertificateTimestamp", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(sSLSession, new Object[0]);
            if (invoke instanceof byte[]) {
                return (byte[]) invoke;
            }
            return null;
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException e) {
            return null;
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2.getCause());
        }
    }

    static synchronized void setDefaultHostnameVerifier(ConscryptHostnameVerifier conscryptHostnameVerifier) {
        synchronized (TrustManagerImpl.class) {
            defaultHostnameVerifier = conscryptHostnameVerifier;
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.security.cert.CertPathChecker] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setOcspResponses(java.security.cert.PKIXParameters r6, java.security.cert.X509Certificate r7, byte[] r8) {
        /*
            r5 = this;
            if (r8 == 0) goto L_0x0047
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r6.getCertPathCheckers()
            r0.<init>(r1)
            int r1 = r0.size()
            r2 = 0
        L_0x0010:
            if (r2 >= r1) goto L_0x0021
            java.lang.Object r3 = r0.get(r2)
            java.security.cert.PKIXCertPathChecker r3 = (java.security.cert.PKIXCertPathChecker) r3
            int r2 = r2 + 1
            boolean r4 = r3 instanceof java.security.cert.PKIXRevocationChecker
            if (r4 == 0) goto L_0x0010
            java.security.cert.PKIXRevocationChecker r3 = (java.security.cert.PKIXRevocationChecker) r3
            goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            if (r3 != 0) goto L_0x003c
            java.security.cert.CertPathValidator r1 = r5.validator     // Catch:{ UnsupportedOperationException -> 0x003a }
            java.security.cert.CertPathChecker r1 = r1.getRevocationChecker()     // Catch:{ UnsupportedOperationException -> 0x003a }
            r3 = r1
            java.security.cert.PKIXRevocationChecker r3 = (java.security.cert.PKIXRevocationChecker) r3     // Catch:{ UnsupportedOperationException -> 0x003a }
            r0.add(r3)
            java.security.cert.PKIXRevocationChecker$Option r1 = java.security.cert.PKIXRevocationChecker.Option.ONLY_END_ENTITY
            java.util.Set r1 = java.util.Collections.singleton(r1)
            r3.setOptions(r1)
            goto L_0x003d
        L_0x003a:
            r6 = move-exception
            return
        L_0x003c:
        L_0x003d:
            java.util.Map r7 = java.util.Collections.singletonMap(r7, r8)
            r3.setOcspResponses(r7)
            r6.setCertPathCheckers(r0)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.TrustManagerImpl.setOcspResponses(java.security.cert.PKIXParameters, java.security.cert.X509Certificate, byte[]):void");
    }

    private static Collection sortPotentialAnchors(Set set) {
        if (set.size() <= 1) {
            return set;
        }
        ArrayList arrayList = new ArrayList(set);
        Collections.sort(arrayList, TRUST_ANCHOR_COMPARATOR);
        return arrayList;
    }

    private static Set trustAnchors(X509Certificate[] x509CertificateArr) {
        HashSet hashSet = new HashSet(r1);
        for (X509Certificate trustAnchor : x509CertificateArr) {
            hashSet.add(new TrustAnchor(trustAnchor, (byte[]) null));
        }
        return hashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (com.google.android.gms.org.conscrypt.Platform.isCTVerificationRequired(r9) != false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List verifyChain(java.util.List r7, java.util.List r8, java.lang.String r9, boolean r10, byte[] r11, byte[] r12) {
        /*
            r6 = this;
            java.lang.String r0 = "Chain validation failed"
            java.security.cert.CertificateFactory r1 = r6.factory     // Catch:{ CertificateException -> 0x00c6 }
            java.security.cert.CertPath r1 = r1.generateCertPath(r7)     // Catch:{ CertificateException -> 0x00c6 }
            boolean r2 = r8.isEmpty()     // Catch:{ CertificateException -> 0x00c6 }
            r3 = 0
            if (r2 != 0) goto L_0x00b8
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ CertificateException -> 0x00c6 }
            r2.<init>()     // Catch:{ CertificateException -> 0x00c6 }
            r2.addAll(r7)     // Catch:{ CertificateException -> 0x00c6 }
            java.util.Iterator r4 = r8.iterator()     // Catch:{ CertificateException -> 0x00c6 }
        L_0x001b:
            boolean r5 = r4.hasNext()     // Catch:{ CertificateException -> 0x00c6 }
            if (r5 == 0) goto L_0x002f
            java.lang.Object r5 = r4.next()     // Catch:{ CertificateException -> 0x00c6 }
            java.security.cert.TrustAnchor r5 = (java.security.cert.TrustAnchor) r5     // Catch:{ CertificateException -> 0x00c6 }
            java.security.cert.X509Certificate r5 = r5.getTrustedCert()     // Catch:{ CertificateException -> 0x00c6 }
            r2.add(r5)     // Catch:{ CertificateException -> 0x00c6 }
            goto L_0x001b
        L_0x002f:
            com.google.android.gms.org.conscrypt.CertPinManager r4 = r6.pinManager     // Catch:{ CertificateException -> 0x00c6 }
            if (r4 != 0) goto L_0x0034
            goto L_0x0037
        L_0x0034:
            r4.checkChainPinning(r9, r2)     // Catch:{ CertificateException -> 0x00c6 }
        L_0x0037:
            java.util.Iterator r4 = r2.iterator()     // Catch:{ CertificateException -> 0x00c6 }
        L_0x003b:
            boolean r5 = r4.hasNext()     // Catch:{ CertificateException -> 0x00c6 }
            if (r5 == 0) goto L_0x004b
            java.lang.Object r5 = r4.next()     // Catch:{ CertificateException -> 0x00c6 }
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5     // Catch:{ CertificateException -> 0x00c6 }
            r6.checkBlacklist(r5)     // Catch:{ CertificateException -> 0x00c6 }
            goto L_0x003b
        L_0x004b:
            if (r10 != 0) goto L_0x005d
            boolean r4 = r6.ctEnabledOverride     // Catch:{ CertificateException -> 0x00c6 }
            if (r4 == 0) goto L_0x0052
            goto L_0x005a
        L_0x0052:
            if (r9 == 0) goto L_0x005d
            boolean r4 = com.google.android.gms.org.conscrypt.Platform.isCTVerificationRequired(r9)     // Catch:{ CertificateException -> 0x00c6 }
            if (r4 == 0) goto L_0x005d
        L_0x005a:
            r6.checkCT(r9, r2, r11, r12)     // Catch:{ CertificateException -> 0x00c6 }
        L_0x005d:
            boolean r9 = r7.isEmpty()     // Catch:{ CertificateException -> 0x00c6 }
            if (r9 != 0) goto L_0x00b7
            com.google.android.gms.org.conscrypt.ChainStrengthAnalyzer.check((java.util.List) r7)     // Catch:{ CertificateException -> 0x00c6 }
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ InvalidAlgorithmParameterException -> 0x00b0, CertPathValidatorException -> 0x00a9 }
            r9.<init>()     // Catch:{ InvalidAlgorithmParameterException -> 0x00b0, CertPathValidatorException -> 0x00a9 }
            r12 = 0
            java.lang.Object r8 = r8.get(r12)     // Catch:{ InvalidAlgorithmParameterException -> 0x00b0, CertPathValidatorException -> 0x00a9 }
            java.security.cert.TrustAnchor r8 = (java.security.cert.TrustAnchor) r8     // Catch:{ InvalidAlgorithmParameterException -> 0x00b0, CertPathValidatorException -> 0x00a9 }
            r9.add(r8)     // Catch:{ InvalidAlgorithmParameterException -> 0x00b0, CertPathValidatorException -> 0x00a9 }
            java.security.cert.PKIXParameters r8 = new java.security.cert.PKIXParameters     // Catch:{ InvalidAlgorithmParameterException -> 0x00b0, CertPathValidatorException -> 0x00a9 }
            r8.<init>(r9)     // Catch:{ InvalidAlgorithmParameterException -> 0x00b0, CertPathValidatorException -> 0x00a9 }
            r8.setRevocationEnabled(r12)     // Catch:{ InvalidAlgorithmParameterException -> 0x00b0, CertPathValidatorException -> 0x00a9 }
            java.lang.Object r9 = r7.get(r12)     // Catch:{ InvalidAlgorithmParameterException -> 0x00b0, CertPathValidatorException -> 0x00a9 }
            java.security.cert.X509Certificate r9 = (java.security.cert.X509Certificate) r9     // Catch:{ InvalidAlgorithmParameterException -> 0x00b0, CertPathValidatorException -> 0x00a9 }
            r6.setOcspResponses(r8, r9, r11)     // Catch:{ InvalidAlgorithmParameterException -> 0x00b0, CertPathValidatorException -> 0x00a9 }
            com.google.android.gms.org.conscrypt.TrustManagerImpl$ExtendedKeyUsagePKIXCertPathChecker r11 = new com.google.android.gms.org.conscrypt.TrustManagerImpl$ExtendedKeyUsagePKIXCertPathChecker     // Catch:{ InvalidAlgorithmParameterException -> 0x00b0, CertPathValidatorException -> 0x00a9 }
            r11.<init>(r10, r9)     // Catch:{ InvalidAlgorithmParameterException -> 0x00b0, CertPathValidatorException -> 0x00a9 }
            r8.addCertPathChecker(r11)     // Catch:{ InvalidAlgorithmParameterException -> 0x00b0, CertPathValidatorException -> 0x00a9 }
            java.security.cert.CertPathValidator r9 = r6.validator     // Catch:{ InvalidAlgorithmParameterException -> 0x00b0, CertPathValidatorException -> 0x00a9 }
            r9.validate(r1, r8)     // Catch:{ InvalidAlgorithmParameterException -> 0x00b0, CertPathValidatorException -> 0x00a9 }
            r8 = 1
        L_0x0094:
            int r9 = r7.size()     // Catch:{ CertificateException -> 0x00c6 }
            if (r8 >= r9) goto L_0x00a8
            com.google.android.gms.org.conscrypt.TrustedCertificateIndex r9 = r6.intermediateIndex     // Catch:{ CertificateException -> 0x00c6 }
            java.lang.Object r10 = r7.get(r8)     // Catch:{ CertificateException -> 0x00c6 }
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10     // Catch:{ CertificateException -> 0x00c6 }
            r9.index((java.security.cert.X509Certificate) r10)     // Catch:{ CertificateException -> 0x00c6 }
            int r8 = r8 + 1
            goto L_0x0094
        L_0x00a8:
            return r2
        L_0x00a9:
            r7 = move-exception
            java.security.cert.CertificateException r8 = new java.security.cert.CertificateException     // Catch:{ CertificateException -> 0x00c6 }
            r8.<init>(r0, r7)     // Catch:{ CertificateException -> 0x00c6 }
            throw r8     // Catch:{ CertificateException -> 0x00c6 }
        L_0x00b0:
            r7 = move-exception
            java.security.cert.CertificateException r8 = new java.security.cert.CertificateException     // Catch:{ CertificateException -> 0x00c6 }
            r8.<init>(r0, r7)     // Catch:{ CertificateException -> 0x00c6 }
            throw r8     // Catch:{ CertificateException -> 0x00c6 }
        L_0x00b7:
            return r2
        L_0x00b8:
            java.security.cert.CertificateException r7 = new java.security.cert.CertificateException     // Catch:{ CertificateException -> 0x00c6 }
            java.security.cert.CertPathValidatorException r8 = new java.security.cert.CertPathValidatorException     // Catch:{ CertificateException -> 0x00c6 }
            java.lang.String r9 = "Trust anchor for certification path not found."
            r10 = -1
            r8.<init>(r9, r3, r1, r10)     // Catch:{ CertificateException -> 0x00c6 }
            r7.<init>(r8)     // Catch:{ CertificateException -> 0x00c6 }
            throw r7     // Catch:{ CertificateException -> 0x00c6 }
        L_0x00c6:
            r7 = move-exception
            java.util.logging.Logger r8 = logger
            java.util.logging.Level r9 = java.util.logging.Level.FINE
            java.lang.String r10 = r7.getMessage()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r11 = "Rejected candidate cert chain due to error: "
            int r12 = r10.length()
            if (r12 != 0) goto L_0x00e1
            java.lang.String r10 = new java.lang.String
            r10.<init>(r11)
            goto L_0x00e5
        L_0x00e1:
            java.lang.String r10 = r11.concat(r10)
        L_0x00e5:
            java.lang.String r11 = "com.google.android.gms.org.conscrypt.TrustManagerImpl"
            java.lang.String r12 = "verifyChain"
            r8.logp(r9, r11, r12, r10)
            goto L_0x00ee
        L_0x00ed:
            throw r7
        L_0x00ee:
            goto L_0x00ed
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.TrustManagerImpl.verifyChain(java.util.List, java.util.List, java.lang.String, boolean, byte[], byte[]):java.util.List");
    }

    public List checkClientTrusted(X509Certificate[] x509CertificateArr, String str, String str2) {
        return checkTrusted(x509CertificateArr, (byte[]) null, (byte[]) null, str, str2, true);
    }

    public List checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) {
        return checkTrusted(x509CertificateArr, (byte[]) null, (byte[]) null, str, str2, false);
    }

    public X509Certificate[] getAcceptedIssuers() {
        X509Certificate[] x509CertificateArr = this.acceptedIssuers;
        return x509CertificateArr != null ? (X509Certificate[]) x509CertificateArr.clone() : acceptedIssuers(this.rootKeyStore);
    }

    public ConscryptHostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public List getTrustedChainForServer(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        SSLParameters sSLParameters;
        SSLSession sSLSession;
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            SSLSession handshakeSessionOrThrow = getHandshakeSessionOrThrow(sSLSocket);
            sSLParameters = sSLSocket.getSSLParameters();
            sSLSession = handshakeSessionOrThrow;
        } else {
            sSLSession = null;
            sSLParameters = null;
        }
        return checkTrusted(x509CertificateArr, str, sSLSession, sSLParameters, false);
    }

    public void handleTrustStorageUpdate() {
        X509Certificate[] x509CertificateArr = this.acceptedIssuers;
        if (x509CertificateArr != null) {
            this.trustedCertificateIndex.reset(trustAnchors(x509CertificateArr));
        } else {
            this.trustedCertificateIndex.reset();
        }
    }

    public void setCTEnabledOverride(boolean z) {
        this.ctEnabledOverride = z;
    }

    public void setCTPolicy(CTPolicy cTPolicy) {
        this.ctPolicy = cTPolicy;
    }

    public void setCTVerifier(CTVerifier cTVerifier) {
        this.ctVerifier = cTVerifier;
    }

    public void setHostnameVerifier(ConscryptHostnameVerifier conscryptHostnameVerifier) {
        this.hostnameVerifier = conscryptHostnameVerifier;
    }

    public TrustManagerImpl(KeyStore keyStore, CertPinManager certPinManager) {
        this(keyStore, certPinManager, (ConscryptCertStore) null);
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        checkTrusted(x509CertificateArr, str, (SSLSession) null, (SSLParameters) null, true);
    }

    public List checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLSession sSLSession) {
        return checkTrusted(x509CertificateArr, str, sSLSession, (SSLParameters) null, false);
    }

    public TrustManagerImpl(KeyStore keyStore, CertPinManager certPinManager, ConscryptCertStore conscryptCertStore) {
        this(keyStore, certPinManager, conscryptCertStore, (CertBlacklist) null);
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        SSLParameters sSLParameters;
        SSLSession sSLSession;
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            SSLSession handshakeSessionOrThrow = getHandshakeSessionOrThrow(sSLSocket);
            sSLParameters = sSLSocket.getSSLParameters();
            sSLSession = handshakeSessionOrThrow;
        } else {
            sSLSession = null;
            sSLParameters = null;
        }
        checkTrusted(x509CertificateArr, str, sSLSession, sSLParameters, true);
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        checkTrusted(x509CertificateArr, str, (SSLSession) null, (SSLParameters) null, false);
    }

    public List getTrustedChainForServer(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        SSLSession handshakeSession = sSLEngine.getHandshakeSession();
        if (handshakeSession != null) {
            return checkTrusted(x509CertificateArr, str, handshakeSession, sSLEngine.getSSLParameters(), false);
        }
        throw new CertificateException("Not in handshake; no session available");
    }

    public TrustManagerImpl(KeyStore keyStore, CertPinManager certPinManager, ConscryptCertStore conscryptCertStore, CertBlacklist certBlacklist) {
        this(keyStore, certPinManager, conscryptCertStore, certBlacklist, (CTLogStore) null, (CTVerifier) null, (CTPolicy) null);
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        getTrustedChainForServer(x509CertificateArr, str, socket);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TrustManagerImpl(java.security.KeyStore r5, com.google.android.gms.org.conscrypt.CertPinManager r6, com.google.android.gms.org.conscrypt.ConscryptCertStore r7, com.google.android.gms.org.conscrypt.CertBlacklist r8, com.google.android.gms.org.conscrypt.ct.CTLogStore r9, com.google.android.gms.org.conscrypt.ct.CTVerifier r10, com.google.android.gms.org.conscrypt.ct.CTPolicy r11) {
        /*
            r4 = this;
            r4.<init>()
            r10 = 0
            java.lang.String r0 = "PKIX"
            java.security.cert.CertPathValidator r0 = java.security.cert.CertPathValidator.getInstance(r0)     // Catch:{ Exception -> 0x003d }
            java.lang.String r1 = "X509"
            java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r1)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r2 = "AndroidCAStore"
            java.lang.String r3 = r5.getType()     // Catch:{ Exception -> 0x0032 }
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x0032 }
            if (r2 == 0) goto L_0x001e
            int r2 = com.google.android.gms.org.conscrypt.Platform.a     // Catch:{ Exception -> 0x0032 }
        L_0x001e:
            java.security.cert.X509Certificate[] r5 = acceptedIssuers(r5)     // Catch:{ Exception -> 0x002f }
            com.google.android.gms.org.conscrypt.TrustedCertificateIndex r2 = new com.google.android.gms.org.conscrypt.TrustedCertificateIndex     // Catch:{ Exception -> 0x002d }
            java.util.Set r3 = trustAnchors(r5)     // Catch:{ Exception -> 0x002d }
            r2.<init>(r3)     // Catch:{ Exception -> 0x002d }
            r3 = r10
            goto L_0x0045
        L_0x002d:
            r2 = move-exception
            goto L_0x0043
        L_0x002f:
            r2 = move-exception
            r5 = r10
            goto L_0x0043
        L_0x0032:
            r5 = move-exception
            r2 = r5
            r5 = r10
            r7 = r5
            goto L_0x0043
        L_0x0037:
            r5 = move-exception
            r2 = r5
            r5 = r10
            r7 = r5
            r1 = r7
            goto L_0x0043
        L_0x003d:
            r5 = move-exception
            r2 = r5
            r5 = r10
            r7 = r5
            r0 = r7
            r1 = r0
        L_0x0043:
            r3 = r2
            r2 = r10
        L_0x0045:
            if (r8 != 0) goto L_0x004b
            int r8 = com.google.android.gms.org.conscrypt.Platform.a
            r8 = r10
            goto L_0x004c
        L_0x004b:
        L_0x004c:
            if (r9 != 0) goto L_0x0052
            int r9 = com.google.android.gms.org.conscrypt.Platform.a
            r9 = r10
            goto L_0x0053
        L_0x0052:
        L_0x0053:
            if (r11 != 0) goto L_0x0059
            int r11 = com.google.android.gms.org.conscrypt.Platform.a
            r11 = r10
            goto L_0x005a
        L_0x0059:
        L_0x005a:
            r4.pinManager = r6
            r4.rootKeyStore = r10
            r4.trustedCertificateStore = r7
            r4.validator = r0
            r4.factory = r1
            r4.trustedCertificateIndex = r2
            com.google.android.gms.org.conscrypt.TrustedCertificateIndex r6 = new com.google.android.gms.org.conscrypt.TrustedCertificateIndex
            r6.<init>()
            r4.intermediateIndex = r6
            r4.acceptedIssuers = r5
            r4.err = r3
            r4.blacklist = r8
            com.google.android.gms.org.conscrypt.ct.CTVerifier r5 = new com.google.android.gms.org.conscrypt.ct.CTVerifier
            r5.<init>(r9)
            r4.ctVerifier = r5
            r4.ctPolicy = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.TrustManagerImpl.<init>(java.security.KeyStore, com.google.android.gms.org.conscrypt.CertPinManager, com.google.android.gms.org.conscrypt.ConscryptCertStore, com.google.android.gms.org.conscrypt.CertBlacklist, com.google.android.gms.org.conscrypt.ct.CTLogStore, com.google.android.gms.org.conscrypt.ct.CTVerifier, com.google.android.gms.org.conscrypt.ct.CTPolicy):void");
    }

    private List checkTrusted(X509Certificate[] x509CertificateArr, byte[] bArr, byte[] bArr2, String str, String str2, boolean z) {
        if (x509CertificateArr == null || x509CertificateArr.length == 0 || str == null || str.length() == 0) {
            throw new IllegalArgumentException("null or zero-length parameter");
        }
        Exception exc = this.err;
        if (exc == null) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            X509Certificate x509Certificate = x509CertificateArr[0];
            TrustAnchor findTrustAnchorBySubjectAndPublicKey = findTrustAnchorBySubjectAndPublicKey(x509Certificate);
            if (findTrustAnchorBySubjectAndPublicKey != null) {
                arrayList2.add(findTrustAnchorBySubjectAndPublicKey);
                hashSet.add(findTrustAnchorBySubjectAndPublicKey.getTrustedCert());
            } else {
                arrayList.add(x509Certificate);
            }
            hashSet.add(x509Certificate);
            return checkTrustedRecursive(x509CertificateArr, bArr, bArr2, str2, z, arrayList, arrayList2, hashSet);
        }
        throw new CertificateException(exc);
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        SSLSession handshakeSession = sSLEngine.getHandshakeSession();
        if (handshakeSession != null) {
            checkTrusted(x509CertificateArr, str, handshakeSession, sSLEngine.getSSLParameters(), true);
            return;
        }
        throw new CertificateException("Not in handshake; no session available");
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        getTrustedChainForServer(x509CertificateArr, str, sSLEngine);
    }
}
