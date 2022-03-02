package com.google.android.gms.org.conscrypt;

import java.security.Provider;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class OpenSSLProvider extends Provider {
    private static final String PREFIX = String.valueOf(OpenSSLProvider.class.getPackage().getName()).concat(".");
    private static final String STANDARD_EC_PRIVATE_KEY_INTERFACE_CLASS_NAME = "java.security.interfaces.ECPrivateKey";
    private static final String STANDARD_RSA_PRIVATE_KEY_INTERFACE_CLASS_NAME = "java.security.interfaces.RSAPrivateKey";
    private static final String STANDARD_RSA_PUBLIC_KEY_INTERFACE_CLASS_NAME = "java.security.interfaces.RSAPublicKey";
    private static final long serialVersionUID = 2996752495318905136L;

    public OpenSSLProvider() {
        this(Platform.getDefaultProviderName());
    }

    private void putECDHKeyAgreementImplClass(String str) {
        String str2 = PREFIX;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 54);
        sb.append(str2);
        sb.append("OpenSSLKeyHolder|java.security.interfaces.ECPrivateKey");
        String sb2 = sb.toString();
        String valueOf = String.valueOf(PREFIX);
        String valueOf2 = String.valueOf(str);
        putImplClassWithKeyConstraints("KeyAgreement.ECDH", valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2), sb2, "PKCS#8");
    }

    private void putImplClassWithKeyConstraints(String str, String str2, String str3, String str4) {
        put(str, str2);
        if (str3 != null) {
            put(String.valueOf(str).concat(" SupportedKeyClasses"), str3);
        }
        if (str4 != null) {
            put(String.valueOf(str).concat(" SupportedKeyFormats"), str4);
        }
    }

    private void putMacImplClass(String str, String str2) {
        String concat = String.valueOf(PREFIX).concat("OpenSSLKeyHolder");
        String valueOf = String.valueOf(str);
        String str3 = valueOf.length() == 0 ? new String("Mac.") : "Mac.".concat(valueOf);
        String valueOf2 = String.valueOf(PREFIX);
        String valueOf3 = String.valueOf(str2);
        putImplClassWithKeyConstraints(str3, valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3), concat, "RAW");
    }

    private void putRAWRSASignatureImplClass(String str) {
        String str2 = PREFIX;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 117 + String.valueOf(str2).length());
        sb.append(str2);
        sb.append("OpenSSLRSAPrivateKey|java.security.interfaces.RSAPrivateKey|");
        sb.append(str2);
        sb.append("OpenSSLRSAPublicKey|java.security.interfaces.RSAPublicKey");
        String sb2 = sb.toString();
        String valueOf = String.valueOf(PREFIX);
        String valueOf2 = String.valueOf(str);
        putImplClassWithKeyConstraints("Signature.NONEwithRSA", valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2), sb2, (String) null);
    }

    private void putRSACipherImplClass(String str, String str2) {
        String str3 = PREFIX;
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 117 + String.valueOf(str3).length());
        sb.append(str3);
        sb.append("OpenSSLRSAPrivateKey|java.security.interfaces.RSAPrivateKey|");
        sb.append(str3);
        sb.append("OpenSSLRSAPublicKey|java.security.interfaces.RSAPublicKey");
        String sb2 = sb.toString();
        String valueOf = String.valueOf(str);
        String str4 = valueOf.length() == 0 ? new String("Cipher.") : "Cipher.".concat(valueOf);
        String valueOf2 = String.valueOf(PREFIX);
        String valueOf3 = String.valueOf(str2);
        putImplClassWithKeyConstraints(str4, valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3), sb2, (String) null);
    }

    private void putSignatureImplClass(String str, String str2) {
        String str3 = PREFIX;
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 131);
        sb.append(str3);
        sb.append("OpenSSLKeyHolder|java.security.interfaces.RSAPrivateKey|java.security.interfaces.ECPrivateKey|java.security.interfaces.RSAPublicKey");
        String sb2 = sb.toString();
        String valueOf = String.valueOf(str);
        String str4 = valueOf.length() == 0 ? new String("Signature.") : "Signature.".concat(valueOf);
        String valueOf2 = String.valueOf(PREFIX);
        String valueOf3 = String.valueOf(str2);
        putImplClassWithKeyConstraints(str4, valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3), sb2, "PKCS#8|X.509");
    }

    private void putSymmetricCipherImplClass(String str, String str2) {
        String valueOf = String.valueOf(str);
        String str3 = valueOf.length() == 0 ? new String("Cipher.") : "Cipher.".concat(valueOf);
        String valueOf2 = String.valueOf(PREFIX);
        String valueOf3 = String.valueOf(str2);
        putImplClassWithKeyConstraints(str3, valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3), (String) null, "RAW");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OpenSSLProvider(String str) {
        this(str, false, "TLSv1.3");
        int i = Platform.a;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OpenSSLProvider(java.lang.String r8, boolean r9, java.lang.String r10) {
        /*
            r7 = this;
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.String r2 = "Android's OpenSSL-backed security provider"
            r7.<init>(r8, r0, r2)
            com.google.android.gms.org.conscrypt.NativeCrypto.checkAvailability()
            int r8 = com.google.android.gms.org.conscrypt.Platform.a
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "OpenSSLContextImpl"
            java.lang.String r8 = r8.concat(r0)
            int r0 = r10.hashCode()
            switch(r0) {
                case -503070502: goto L_0x002a;
                case -503070501: goto L_0x0020;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x0034
        L_0x0020:
            java.lang.String r0 = "TLSv1.3"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "TLSv1.2"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 0
            goto L_0x0035
        L_0x0034:
            r0 = -1
        L_0x0035:
            java.lang.String r1 = "$TLSv12"
            java.lang.String r2 = "$TLSv13"
            if (r0 == 0) goto L_0x005c
            r3 = 1
            if (r0 == r3) goto L_0x005a
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = java.lang.String.valueOf(r10)
            java.lang.String r10 = "Choice of default protocol is unsupported: "
            int r0 = r9.length()
            if (r0 != 0) goto L_0x0052
            java.lang.String r9 = new java.lang.String
            r9.<init>(r10)
            goto L_0x0056
        L_0x0052:
            java.lang.String r9 = r10.concat(r9)
        L_0x0056:
            r8.<init>(r9)
            throw r8
        L_0x005a:
            r10 = r2
            goto L_0x005d
        L_0x005c:
            r10 = r1
        L_0x005d:
            java.lang.String r0 = java.lang.String.valueOf(r8)
            int r3 = r10.length()
            if (r3 != 0) goto L_0x006d
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
            goto L_0x0071
        L_0x006d:
            java.lang.String r3 = r0.concat(r10)
        L_0x0071:
            java.lang.String r0 = "SSLContext.SSL"
            r7.put(r0, r3)
            java.lang.String r0 = java.lang.String.valueOf(r8)
            int r3 = r10.length()
            if (r3 != 0) goto L_0x0086
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
            goto L_0x008a
        L_0x0086:
            java.lang.String r3 = r0.concat(r10)
        L_0x008a:
            java.lang.String r0 = "SSLContext.TLS"
            r7.put(r0, r3)
            java.lang.String r0 = java.lang.String.valueOf(r8)
            java.lang.String r3 = "$TLSv1"
            java.lang.String r0 = r0.concat(r3)
            java.lang.String r3 = "SSLContext.TLSv1"
            r7.put(r3, r0)
            java.lang.String r0 = java.lang.String.valueOf(r8)
            java.lang.String r3 = "$TLSv11"
            java.lang.String r0 = r0.concat(r3)
            java.lang.String r3 = "SSLContext.TLSv1.1"
            r7.put(r3, r0)
            java.lang.String r0 = java.lang.String.valueOf(r8)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "SSLContext.TLSv1.2"
            r7.put(r1, r0)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r8 = r8.concat(r2)
            java.lang.String r0 = "SSLContext.TLSv1.3"
            r7.put(r0, r8)
            java.lang.String r8 = PREFIX
            java.lang.String r0 = java.lang.String.valueOf(r8)
            int r0 = r0.length()
            int r1 = r10.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r0 = r0 + 21
            int r0 = r0 + r1
            r2.<init>(r0)
            r2.append(r8)
            java.lang.String r8 = "DefaultSSLContextImpl"
            r2.append(r8)
            r2.append(r10)
            java.lang.String r8 = r2.toString()
            java.lang.String r10 = "SSLContext.Default"
            r7.put(r10, r8)
            if (r9 == 0) goto L_0x0105
            java.lang.Class<com.google.android.gms.org.conscrypt.TrustManagerFactoryImpl> r8 = com.google.android.gms.org.conscrypt.TrustManagerFactoryImpl.class
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = "TrustManagerFactory.PKIX"
            r7.put(r9, r8)
            java.lang.String r8 = "Alg.Alias.TrustManagerFactory.X509"
            java.lang.String r9 = "PKIX"
            r7.put(r8, r9)
        L_0x0105:
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "IvParameters$AES"
            java.lang.String r8 = r8.concat(r9)
            java.lang.String r9 = "AlgorithmParameters.AES"
            r7.put(r9, r8)
            java.lang.String r8 = "Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.1.2"
            java.lang.String r9 = "AES"
            r7.put(r8, r9)
            java.lang.String r8 = "Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.1.22"
            java.lang.String r9 = "AES"
            r7.put(r8, r9)
            java.lang.String r8 = "Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.1.42"
            java.lang.String r9 = "AES"
            r7.put(r8, r9)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "IvParameters$ChaCha20"
            java.lang.String r8 = r8.concat(r9)
            java.lang.String r9 = "AlgorithmParameters.ChaCha20"
            r7.put(r9, r8)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "IvParameters$DESEDE"
            java.lang.String r8 = r8.concat(r9)
            java.lang.String r9 = "AlgorithmParameters.DESEDE"
            r7.put(r9, r8)
            java.lang.String r8 = "Alg.Alias.AlgorithmParameters.TDEA"
            java.lang.String r9 = "DESEDE"
            r7.put(r8, r9)
            java.lang.String r8 = "Alg.Alias.AlgorithmParameters.1.2.840.113549.3.7"
            java.lang.String r9 = "DESEDE"
            r7.put(r8, r9)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "GCMParameters"
            java.lang.String r8 = r8.concat(r9)
            java.lang.String r9 = "AlgorithmParameters.GCM"
            r7.put(r9, r8)
            java.lang.String r8 = "Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.1.6"
            java.lang.String r9 = "GCM"
            r7.put(r8, r9)
            java.lang.String r8 = "Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.1.26"
            java.lang.String r9 = "GCM"
            r7.put(r8, r9)
            java.lang.String r8 = "Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.1.46"
            java.lang.String r9 = "GCM"
            r7.put(r8, r9)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "OAEPParameters"
            java.lang.String r8 = r8.concat(r9)
            java.lang.String r9 = "AlgorithmParameters.OAEP"
            r7.put(r9, r8)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "PSSParameters"
            java.lang.String r8 = r8.concat(r9)
            java.lang.String r9 = "AlgorithmParameters.PSS"
            r7.put(r9, r8)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "ECParameters"
            java.lang.String r8 = r8.concat(r9)
            java.lang.String r9 = "AlgorithmParameters.EC"
            r7.put(r9, r8)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "OpenSSLMessageDigestJDK$SHA1"
            java.lang.String r8 = r8.concat(r9)
            java.lang.String r9 = "MessageDigest.SHA-1"
            r7.put(r9, r8)
            java.lang.String r8 = "Alg.Alias.MessageDigest.SHA1"
            java.lang.String r9 = "SHA-1"
            r7.put(r8, r9)
            java.lang.String r8 = "Alg.Alias.MessageDigest.SHA"
            java.lang.String r9 = "SHA-1"
            r7.put(r8, r9)
            java.lang.String r8 = "Alg.Alias.MessageDigest.1.3.14.3.2.26"
            java.lang.String r9 = "SHA-1"
            r7.put(r8, r9)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "OpenSSLMessageDigestJDK$SHA224"
            java.lang.String r8 = r8.concat(r9)
            java.lang.String r9 = "MessageDigest.SHA-224"
            r7.put(r9, r8)
            java.lang.String r8 = "Alg.Alias.MessageDigest.SHA224"
            java.lang.String r9 = "SHA-224"
            r7.put(r8, r9)
            java.lang.String r8 = "Alg.Alias.MessageDigest.2.16.840.1.101.3.4.2.4"
            java.lang.String r9 = "SHA-224"
            r7.put(r8, r9)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "OpenSSLMessageDigestJDK$SHA256"
            java.lang.String r8 = r8.concat(r9)
            java.lang.String r9 = "MessageDigest.SHA-256"
            r7.put(r9, r8)
            java.lang.String r8 = "Alg.Alias.MessageDigest.SHA256"
            java.lang.String r9 = "SHA-256"
            r7.put(r8, r9)
            java.lang.String r8 = "Alg.Alias.MessageDigest.2.16.840.1.101.3.4.2.1"
            java.lang.String r9 = "SHA-256"
            r7.put(r8, r9)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "OpenSSLMessageDigestJDK$SHA384"
            java.lang.String r8 = r8.concat(r9)
            java.lang.String r9 = "MessageDigest.SHA-384"
            r7.put(r9, r8)
            java.lang.String r8 = "Alg.Alias.MessageDigest.SHA384"
            java.lang.String r9 = "SHA-384"
            r7.put(r8, r9)
            java.lang.String r8 = "Alg.Alias.MessageDigest.2.16.840.1.101.3.4.2.2"
            java.lang.String r9 = "SHA-384"
            r7.put(r8, r9)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "OpenSSLMessageDigestJDK$SHA512"
            java.lang.String r8 = r8.concat(r9)
            java.lang.String r9 = "MessageDigest.SHA-512"
            r7.put(r9, r8)
            java.lang.String r8 = "Alg.Alias.MessageDigest.SHA512"
            java.lang.String r9 = "SHA-512"
            r7.put(r8, r9)
            java.lang.String r8 = "Alg.Alias.MessageDigest.2.16.840.1.101.3.4.2.3"
            java.lang.String r9 = "SHA-512"
            r7.put(r8, r9)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "OpenSSLMessageDigestJDK$MD5"
            java.lang.String r8 = r8.concat(r9)
            java.lang.String r9 = "MessageDigest.MD5"
            r7.put(r9, r8)
            java.lang.String r8 = "Alg.Alias.MessageDigest.1.2.840.113549.2.5"
            java.lang.String r9 = "MD5"
            r7.put(r8, r9)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "KeyGeneratorImpl$ARC4"
            java.lang.String r8 = r8.concat(r9)
            java.lang.String r9 = "KeyGenerator.ARC4"
            r7.put(r9, r8)
            java.lang.String r8 = "Alg.Alias.KeyGenerator.RC4"
            java.lang.String r9 = "ARC4"
            r7.put(r8, r9)
            java.lang.String r8 = "Alg.Alias.KeyGenerator.1.2.840.113549.3.4"
            r7.put(r8, r9)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r10 = "KeyGeneratorImpl$AES"
            java.lang.String r8 = r8.concat(r10)
            java.lang.String r10 = "KeyGenerator.AES"
            r7.put(r10, r8)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r10 = "KeyGeneratorImpl$ChaCha20"
            java.lang.String r8 = r8.concat(r10)
            java.lang.String r10 = "KeyGenerator.ChaCha20"
            r7.put(r10, r8)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r10 = "KeyGeneratorImpl$DESEDE"
            java.lang.String r8 = r8.concat(r10)
            java.lang.String r10 = "KeyGenerator.DESEDE"
            r7.put(r10, r8)
            java.lang.String r8 = "Alg.Alias.KeyGenerator.TDEA"
            java.lang.String r10 = "DESEDE"
            r7.put(r8, r10)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r10 = "KeyGeneratorImpl$HmacMD5"
            java.lang.String r8 = r8.concat(r10)
            java.lang.String r10 = "KeyGenerator.HmacMD5"
            r7.put(r10, r8)
            java.lang.String r8 = "Alg.Alias.KeyGenerator.1.3.6.1.5.5.8.1.1"
            java.lang.String r10 = "HmacMD5"
            r7.put(r8, r10)
            java.lang.String r8 = "Alg.Alias.KeyGenerator.HMAC-MD5"
            r7.put(r8, r10)
            java.lang.String r8 = "Alg.Alias.KeyGenerator.HMAC/MD5"
            r7.put(r8, r10)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "KeyGeneratorImpl$HmacSHA1"
            java.lang.String r8 = r8.concat(r0)
            java.lang.String r0 = "KeyGenerator.HmacSHA1"
            r7.put(r0, r8)
            java.lang.String r8 = "Alg.Alias.KeyGenerator.1.2.840.113549.2.7"
            java.lang.String r0 = "HmacSHA1"
            r7.put(r8, r0)
            java.lang.String r8 = "Alg.Alias.KeyGenerator.1.3.6.1.5.5.8.1.2"
            r7.put(r8, r0)
            java.lang.String r8 = "Alg.Alias.KeyGenerator.HMAC-SHA1"
            r7.put(r8, r0)
            java.lang.String r8 = "Alg.Alias.KeyGenerator.HMAC/SHA1"
            r7.put(r8, r0)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r1 = "KeyGeneratorImpl$HmacSHA224"
            java.lang.String r8 = r8.concat(r1)
            java.lang.String r1 = "KeyGenerator.HmacSHA224"
            r7.put(r1, r8)
            java.lang.String r8 = "Alg.Alias.KeyGenerator.1.2.840.113549.2.8"
            java.lang.String r1 = "HmacSHA224"
            r7.put(r8, r1)
            java.lang.String r8 = "Alg.Alias.KeyGenerator.HMAC-SHA224"
            r7.put(r8, r1)
            java.lang.String r8 = "Alg.Alias.KeyGenerator.HMAC/SHA224"
            r7.put(r8, r1)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r2 = "KeyGeneratorImpl$HmacSHA256"
            java.lang.String r8 = r8.concat(r2)
            java.lang.String r2 = "KeyGenerator.HmacSHA256"
            r7.put(r2, r8)
            java.lang.String r8 = "Alg.Alias.KeyGenerator.1.2.840.113549.2.9"
            java.lang.String r2 = "HmacSHA256"
            r7.put(r8, r2)
            java.lang.String r8 = "Alg.Alias.KeyGenerator.2.16.840.1.101.3.4.2.1"
            r7.put(r8, r2)
            java.lang.String r8 = "Alg.Alias.KeyGenerator.HMAC-SHA256"
            r7.put(r8, r2)
            java.lang.String r8 = "Alg.Alias.KeyGenerator.HMAC/SHA256"
            r7.put(r8, r2)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r3 = "KeyGeneratorImpl$HmacSHA384"
            java.lang.String r8 = r8.concat(r3)
            java.lang.String r3 = "KeyGenerator.HmacSHA384"
            r7.put(r3, r8)
            java.lang.String r8 = "Alg.Alias.KeyGenerator.1.2.840.113549.2.10"
            java.lang.String r3 = "HmacSHA384"
            r7.put(r8, r3)
            java.lang.String r8 = "Alg.Alias.KeyGenerator.HMAC-SHA384"
            r7.put(r8, r3)
            java.lang.String r8 = "Alg.Alias.KeyGenerator.HMAC/SHA384"
            r7.put(r8, r3)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r4 = "KeyGeneratorImpl$HmacSHA512"
            java.lang.String r8 = r8.concat(r4)
            java.lang.String r4 = "KeyGenerator.HmacSHA512"
            r7.put(r4, r8)
            java.lang.String r8 = "Alg.Alias.KeyGenerator.1.2.840.113549.2.11"
            java.lang.String r4 = "HmacSHA512"
            r7.put(r8, r4)
            java.lang.String r8 = "Alg.Alias.KeyGenerator.HMAC-SHA512"
            r7.put(r8, r4)
            java.lang.String r8 = "Alg.Alias.KeyGenerator.HMAC/SHA512"
            r7.put(r8, r4)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r5 = "OpenSSLRSAKeyPairGenerator"
            java.lang.String r8 = r8.concat(r5)
            java.lang.String r5 = "KeyPairGenerator.RSA"
            r7.put(r5, r8)
            java.lang.String r8 = "Alg.Alias.KeyPairGenerator.1.2.840.113549.1.1.1"
            java.lang.String r5 = "RSA"
            r7.put(r8, r5)
            java.lang.String r8 = "Alg.Alias.KeyPairGenerator.1.2.840.113549.1.1.7"
            r7.put(r8, r5)
            java.lang.String r8 = "Alg.Alias.KeyPairGenerator.2.5.8.1.1"
            r7.put(r8, r5)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r6 = "OpenSSLECKeyPairGenerator"
            java.lang.String r8 = r8.concat(r6)
            java.lang.String r6 = "KeyPairGenerator.EC"
            r7.put(r6, r8)
            java.lang.String r8 = "Alg.Alias.KeyPairGenerator.1.2.840.10045.2.1"
            java.lang.String r6 = "EC"
            r7.put(r8, r6)
            java.lang.String r8 = "Alg.Alias.KeyPairGenerator.1.3.133.16.840.63.0.2"
            java.lang.String r6 = "EC"
            r7.put(r8, r6)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r6 = "OpenSSLRSAKeyFactory"
            java.lang.String r8 = r8.concat(r6)
            java.lang.String r6 = "KeyFactory.RSA"
            r7.put(r6, r8)
            java.lang.String r8 = "Alg.Alias.KeyFactory.1.2.840.113549.1.1.1"
            r7.put(r8, r5)
            java.lang.String r8 = "Alg.Alias.KeyFactory.1.2.840.113549.1.1.7"
            r7.put(r8, r5)
            java.lang.String r8 = "Alg.Alias.KeyFactory.2.5.8.1.1"
            r7.put(r8, r5)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r5 = "OpenSSLECKeyFactory"
            java.lang.String r8 = r8.concat(r5)
            java.lang.String r5 = "KeyFactory.EC"
            r7.put(r5, r8)
            java.lang.String r8 = "Alg.Alias.KeyFactory.1.2.840.10045.2.1"
            java.lang.String r5 = "EC"
            r7.put(r8, r5)
            java.lang.String r8 = "Alg.Alias.KeyFactory.1.3.133.16.840.63.0.2"
            java.lang.String r5 = "EC"
            r7.put(r8, r5)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r5 = "DESEDESecretKeyFactory"
            java.lang.String r8 = r8.concat(r5)
            java.lang.String r5 = "SecretKeyFactory.DESEDE"
            r7.put(r5, r8)
            java.lang.String r8 = "Alg.Alias.SecretKeyFactory.TDEA"
            java.lang.String r5 = "DESEDE"
            r7.put(r8, r5)
            java.lang.String r8 = "OpenSSLECDHKeyAgreement"
            r7.putECDHKeyAgreementImplClass(r8)
            java.lang.String r8 = "MD5withRSA"
            java.lang.String r5 = "OpenSSLSignature$MD5RSA"
            r7.putSignatureImplClass(r8, r5)
            java.lang.String r5 = "Alg.Alias.Signature.MD5withRSAEncryption"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.MD5/RSA"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.1.2.840.113549.1.1.4"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.OID.1.2.840.113549.1.1.4"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.1.2.840.113549.2.5with1.2.840.113549.1.1.1"
            r7.put(r5, r8)
            java.lang.String r8 = "SHA1withRSA"
            java.lang.String r5 = "OpenSSLSignature$SHA1RSA"
            r7.putSignatureImplClass(r8, r5)
            java.lang.String r5 = "Alg.Alias.Signature.SHA1withRSAEncryption"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.SHA1/RSA"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.SHA-1/RSA"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.1.2.840.113549.1.1.5"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.OID.1.2.840.113549.1.1.5"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.113549.1.1.1"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.113549.1.1.5"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.1.3.14.3.2.29"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.OID.1.3.14.3.2.29"
            r7.put(r5, r8)
            java.lang.String r8 = "SHA224withRSA"
            java.lang.String r5 = "OpenSSLSignature$SHA224RSA"
            r7.putSignatureImplClass(r8, r5)
            java.lang.String r5 = "Alg.Alias.Signature.SHA224withRSAEncryption"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.SHA224/RSA"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.1.2.840.113549.1.1.14"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.OID.1.2.840.113549.1.1.14"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.2.16.840.1.101.3.4.2.4with1.2.840.113549.1.1.1"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.2.16.840.1.101.3.4.2.4with1.2.840.113549.1.1.14"
            r7.put(r5, r8)
            java.lang.String r8 = "SHA256withRSA"
            java.lang.String r5 = "OpenSSLSignature$SHA256RSA"
            r7.putSignatureImplClass(r8, r5)
            java.lang.String r5 = "Alg.Alias.Signature.SHA256withRSAEncryption"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.SHA256/RSA"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.1.2.840.113549.1.1.11"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.OID.1.2.840.113549.1.1.11"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.2.16.840.1.101.3.4.2.1with1.2.840.113549.1.1.1"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.2.16.840.1.101.3.4.2.1with1.2.840.113549.1.1.11"
            r7.put(r5, r8)
            java.lang.String r8 = "SHA384withRSA"
            java.lang.String r5 = "OpenSSLSignature$SHA384RSA"
            r7.putSignatureImplClass(r8, r5)
            java.lang.String r5 = "Alg.Alias.Signature.SHA384withRSAEncryption"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.SHA384/RSA"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.1.2.840.113549.1.1.12"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.OID.1.2.840.113549.1.1.12"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.2.16.840.1.101.3.4.2.2with1.2.840.113549.1.1.1"
            r7.put(r5, r8)
            java.lang.String r8 = "SHA512withRSA"
            java.lang.String r5 = "OpenSSLSignature$SHA512RSA"
            r7.putSignatureImplClass(r8, r5)
            java.lang.String r5 = "Alg.Alias.Signature.SHA512withRSAEncryption"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.SHA512/RSA"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.1.2.840.113549.1.1.13"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.OID.1.2.840.113549.1.1.13"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.2.16.840.1.101.3.4.2.3with1.2.840.113549.1.1.1"
            r7.put(r5, r8)
            java.lang.String r8 = "OpenSSLSignatureRawRSA"
            r7.putRAWRSASignatureImplClass(r8)
            java.lang.String r8 = "NONEwithECDSA"
            java.lang.String r5 = "OpenSSLSignatureRawECDSA"
            r7.putSignatureImplClass(r8, r5)
            java.lang.String r8 = "SHA1withECDSA"
            java.lang.String r5 = "OpenSSLSignature$SHA1ECDSA"
            r7.putSignatureImplClass(r8, r5)
            java.lang.String r5 = "Alg.Alias.Signature.ECDSA"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.ECDSAwithSHA1"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.1.2.840.10045.4.1"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.10045.2.1"
            r7.put(r5, r8)
            java.lang.String r8 = "SHA224withECDSA"
            java.lang.String r5 = "OpenSSLSignature$SHA224ECDSA"
            r7.putSignatureImplClass(r8, r5)
            java.lang.String r5 = "Alg.Alias.Signature.SHA224/ECDSA"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.1.2.840.10045.4.3.1"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.OID.1.2.840.10045.4.3.1"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.2.16.840.1.101.3.4.2.4with1.2.840.10045.2.1"
            r7.put(r5, r8)
            java.lang.String r8 = "SHA256withECDSA"
            java.lang.String r5 = "OpenSSLSignature$SHA256ECDSA"
            r7.putSignatureImplClass(r8, r5)
            java.lang.String r5 = "Alg.Alias.Signature.SHA256/ECDSA"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.1.2.840.10045.4.3.2"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.OID.1.2.840.10045.4.3.2"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.2.16.840.1.101.3.4.2.1with1.2.840.10045.2.1"
            r7.put(r5, r8)
            java.lang.String r8 = "SHA384withECDSA"
            java.lang.String r5 = "OpenSSLSignature$SHA384ECDSA"
            r7.putSignatureImplClass(r8, r5)
            java.lang.String r5 = "Alg.Alias.Signature.SHA384/ECDSA"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.1.2.840.10045.4.3.3"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.OID.1.2.840.10045.4.3.3"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.2.16.840.1.101.3.4.2.2with1.2.840.10045.2.1"
            r7.put(r5, r8)
            java.lang.String r8 = "SHA512withECDSA"
            java.lang.String r5 = "OpenSSLSignature$SHA512ECDSA"
            r7.putSignatureImplClass(r8, r5)
            java.lang.String r5 = "Alg.Alias.Signature.SHA512/ECDSA"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.1.2.840.10045.4.3.4"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.OID.1.2.840.10045.4.3.4"
            r7.put(r5, r8)
            java.lang.String r5 = "Alg.Alias.Signature.2.16.840.1.101.3.4.2.3with1.2.840.10045.2.1"
            r7.put(r5, r8)
            java.lang.String r8 = "SHA1withRSA/PSS"
            java.lang.String r5 = "OpenSSLSignature$SHA1RSAPSS"
            r7.putSignatureImplClass(r8, r5)
            java.lang.String r8 = "Alg.Alias.Signature.SHA1withRSAandMGF1"
            java.lang.String r5 = "SHA1withRSA/PSS"
            r7.put(r8, r5)
            java.lang.String r8 = "SHA224withRSA/PSS"
            java.lang.String r5 = "OpenSSLSignature$SHA224RSAPSS"
            r7.putSignatureImplClass(r8, r5)
            java.lang.String r8 = "Alg.Alias.Signature.SHA224withRSAandMGF1"
            java.lang.String r5 = "SHA224withRSA/PSS"
            r7.put(r8, r5)
            java.lang.String r8 = "SHA256withRSA/PSS"
            java.lang.String r5 = "OpenSSLSignature$SHA256RSAPSS"
            r7.putSignatureImplClass(r8, r5)
            java.lang.String r8 = "Alg.Alias.Signature.SHA256withRSAandMGF1"
            java.lang.String r5 = "SHA256withRSA/PSS"
            r7.put(r8, r5)
            java.lang.String r8 = "SHA384withRSA/PSS"
            java.lang.String r5 = "OpenSSLSignature$SHA384RSAPSS"
            r7.putSignatureImplClass(r8, r5)
            java.lang.String r8 = "Alg.Alias.Signature.SHA384withRSAandMGF1"
            java.lang.String r5 = "SHA384withRSA/PSS"
            r7.put(r8, r5)
            java.lang.String r8 = "SHA512withRSA/PSS"
            java.lang.String r5 = "OpenSSLSignature$SHA512RSAPSS"
            r7.putSignatureImplClass(r8, r5)
            java.lang.String r8 = "Alg.Alias.Signature.SHA512withRSAandMGF1"
            java.lang.String r5 = "SHA512withRSA/PSS"
            r7.put(r8, r5)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r5 = "OpenSSLRandom"
            java.lang.String r8 = r8.concat(r5)
            java.lang.String r5 = "SecureRandom.SHA1PRNG"
            r7.put(r5, r8)
            java.lang.String r8 = "SecureRandom.SHA1PRNG ImplementedIn"
            java.lang.String r5 = "Software"
            r7.put(r8, r5)
            java.lang.String r8 = "RSA/ECB/NoPadding"
            java.lang.String r5 = "OpenSSLCipherRSA$Raw"
            r7.putRSACipherImplClass(r8, r5)
            java.lang.String r8 = "Alg.Alias.Cipher.RSA/None/NoPadding"
            java.lang.String r5 = "RSA/ECB/NoPadding"
            r7.put(r8, r5)
            java.lang.String r8 = "RSA/ECB/PKCS1Padding"
            java.lang.String r5 = "OpenSSLCipherRSA$PKCS1"
            r7.putRSACipherImplClass(r8, r5)
            java.lang.String r8 = "Alg.Alias.Cipher.RSA/None/PKCS1Padding"
            java.lang.String r5 = "RSA/ECB/PKCS1Padding"
            r7.put(r8, r5)
            java.lang.String r8 = "RSA/ECB/OAEPPadding"
            java.lang.String r5 = "OpenSSLCipherRSA$OAEP$SHA1"
            r7.putRSACipherImplClass(r8, r5)
            java.lang.String r8 = "Alg.Alias.Cipher.RSA/None/OAEPPadding"
            java.lang.String r5 = "RSA/ECB/OAEPPadding"
            r7.put(r8, r5)
            java.lang.String r8 = "RSA/ECB/OAEPWithSHA-1AndMGF1Padding"
            java.lang.String r5 = "OpenSSLCipherRSA$OAEP$SHA1"
            r7.putRSACipherImplClass(r8, r5)
            java.lang.String r8 = "Alg.Alias.Cipher.RSA/None/OAEPWithSHA-1AndMGF1Padding"
            java.lang.String r5 = "RSA/ECB/OAEPWithSHA-1AndMGF1Padding"
            r7.put(r8, r5)
            java.lang.String r8 = "RSA/ECB/OAEPWithSHA-224AndMGF1Padding"
            java.lang.String r5 = "OpenSSLCipherRSA$OAEP$SHA224"
            r7.putRSACipherImplClass(r8, r5)
            java.lang.String r8 = "Alg.Alias.Cipher.RSA/None/OAEPWithSHA-224AndMGF1Padding"
            java.lang.String r5 = "RSA/ECB/OAEPWithSHA-224AndMGF1Padding"
            r7.put(r8, r5)
            java.lang.String r8 = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding"
            java.lang.String r5 = "OpenSSLCipherRSA$OAEP$SHA256"
            r7.putRSACipherImplClass(r8, r5)
            java.lang.String r8 = "Alg.Alias.Cipher.RSA/None/OAEPWithSHA-256AndMGF1Padding"
            java.lang.String r5 = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding"
            r7.put(r8, r5)
            java.lang.String r8 = "RSA/ECB/OAEPWithSHA-384AndMGF1Padding"
            java.lang.String r5 = "OpenSSLCipherRSA$OAEP$SHA384"
            r7.putRSACipherImplClass(r8, r5)
            java.lang.String r8 = "Alg.Alias.Cipher.RSA/None/OAEPWithSHA-384AndMGF1Padding"
            java.lang.String r5 = "RSA/ECB/OAEPWithSHA-384AndMGF1Padding"
            r7.put(r8, r5)
            java.lang.String r8 = "RSA/ECB/OAEPWithSHA-512AndMGF1Padding"
            java.lang.String r5 = "OpenSSLCipherRSA$OAEP$SHA512"
            r7.putRSACipherImplClass(r8, r5)
            java.lang.String r8 = "Alg.Alias.Cipher.RSA/None/OAEPWithSHA-512AndMGF1Padding"
            java.lang.String r5 = "RSA/ECB/OAEPWithSHA-512AndMGF1Padding"
            r7.put(r8, r5)
            java.lang.String r8 = "AES/ECB/NoPadding"
            java.lang.String r5 = "OpenSSLEvpCipherAES$AES$ECB$NoPadding"
            r7.putSymmetricCipherImplClass(r8, r5)
            java.lang.String r8 = "AES/ECB/PKCS5Padding"
            java.lang.String r5 = "OpenSSLEvpCipherAES$AES$ECB$PKCS5Padding"
            r7.putSymmetricCipherImplClass(r8, r5)
            java.lang.String r8 = "Alg.Alias.Cipher.AES/ECB/PKCS7Padding"
            java.lang.String r5 = "AES/ECB/PKCS5Padding"
            r7.put(r8, r5)
            java.lang.String r8 = "AES/CBC/NoPadding"
            java.lang.String r5 = "OpenSSLEvpCipherAES$AES$CBC$NoPadding"
            r7.putSymmetricCipherImplClass(r8, r5)
            java.lang.String r8 = "AES/CBC/PKCS5Padding"
            java.lang.String r5 = "OpenSSLEvpCipherAES$AES$CBC$PKCS5Padding"
            r7.putSymmetricCipherImplClass(r8, r5)
            java.lang.String r8 = "Alg.Alias.Cipher.AES/CBC/PKCS7Padding"
            java.lang.String r5 = "AES/CBC/PKCS5Padding"
            r7.put(r8, r5)
            java.lang.String r8 = "AES/CTR/NoPadding"
            java.lang.String r5 = "OpenSSLEvpCipherAES$AES$CTR"
            r7.putSymmetricCipherImplClass(r8, r5)
            java.lang.String r8 = "AES_128/ECB/NoPadding"
            java.lang.String r5 = "OpenSSLEvpCipherAES$AES_128$ECB$NoPadding"
            r7.putSymmetricCipherImplClass(r8, r5)
            java.lang.String r8 = "AES_128/ECB/PKCS5Padding"
            java.lang.String r5 = "OpenSSLEvpCipherAES$AES_128$ECB$PKCS5Padding"
            r7.putSymmetricCipherImplClass(r8, r5)
            java.lang.String r8 = "Alg.Alias.Cipher.AES_128/ECB/PKCS7Padding"
            java.lang.String r5 = "AES_128/ECB/PKCS5Padding"
            r7.put(r8, r5)
            java.lang.String r8 = "AES_128/CBC/NoPadding"
            java.lang.String r5 = "OpenSSLEvpCipherAES$AES_128$CBC$NoPadding"
            r7.putSymmetricCipherImplClass(r8, r5)
            java.lang.String r8 = "AES_128/CBC/PKCS5Padding"
            java.lang.String r5 = "OpenSSLEvpCipherAES$AES_128$CBC$PKCS5Padding"
            r7.putSymmetricCipherImplClass(r8, r5)
            java.lang.String r8 = "Alg.Alias.Cipher.AES_128/CBC/PKCS7Padding"
            java.lang.String r5 = "AES_128/CBC/PKCS5Padding"
            r7.put(r8, r5)
            java.lang.String r8 = "Alg.Alias.Cipher.PBEWithHmacSHA1AndAES_128"
            java.lang.String r5 = "AES_128/CBC/PKCS5PADDING"
            r7.put(r8, r5)
            java.lang.String r8 = "Alg.Alias.Cipher.PBEWithHmacSHA224AndAES_128"
            r7.put(r8, r5)
            java.lang.String r8 = "Alg.Alias.Cipher.PBEWithHmacSHA256AndAES_128"
            r7.put(r8, r5)
            java.lang.String r8 = "Alg.Alias.Cipher.PBEWithHmacSHA384AndAES_128"
            r7.put(r8, r5)
            java.lang.String r8 = "Alg.Alias.Cipher.PBEWithHmacSHA512AndAES_128"
            r7.put(r8, r5)
            java.lang.String r8 = "AES_256/ECB/NoPadding"
            java.lang.String r5 = "OpenSSLEvpCipherAES$AES_256$ECB$NoPadding"
            r7.putSymmetricCipherImplClass(r8, r5)
            java.lang.String r8 = "AES_256/ECB/PKCS5Padding"
            java.lang.String r5 = "OpenSSLEvpCipherAES$AES_256$ECB$PKCS5Padding"
            r7.putSymmetricCipherImplClass(r8, r5)
            java.lang.String r8 = "Alg.Alias.Cipher.AES_256/ECB/PKCS7Padding"
            java.lang.String r5 = "AES_256/ECB/PKCS5Padding"
            r7.put(r8, r5)
            java.lang.String r8 = "AES_256/CBC/NoPadding"
            java.lang.String r5 = "OpenSSLEvpCipherAES$AES_256$CBC$NoPadding"
            r7.putSymmetricCipherImplClass(r8, r5)
            java.lang.String r8 = "AES_256/CBC/PKCS5Padding"
            java.lang.String r5 = "OpenSSLEvpCipherAES$AES_256$CBC$PKCS5Padding"
            r7.putSymmetricCipherImplClass(r8, r5)
            java.lang.String r8 = "Alg.Alias.Cipher.AES_256/CBC/PKCS7Padding"
            java.lang.String r5 = "AES_256/CBC/PKCS5Padding"
            r7.put(r8, r5)
            java.lang.String r8 = "Alg.Alias.Cipher.PBEWithHmacSHA1AndAES_256"
            java.lang.String r5 = "AES_256/CBC/PKCS5PADDING"
            r7.put(r8, r5)
            java.lang.String r8 = "Alg.Alias.Cipher.PBEWithHmacSHA224AndAES_256"
            r7.put(r8, r5)
            java.lang.String r8 = "Alg.Alias.Cipher.PBEWithHmacSHA256AndAES_256"
            r7.put(r8, r5)
            java.lang.String r8 = "Alg.Alias.Cipher.PBEWithHmacSHA384AndAES_256"
            r7.put(r8, r5)
            java.lang.String r8 = "Alg.Alias.Cipher.PBEWithHmacSHA512AndAES_256"
            r7.put(r8, r5)
            java.lang.String r8 = "DESEDE/CBC/NoPadding"
            java.lang.String r5 = "OpenSSLEvpCipherDESEDE$CBC$NoPadding"
            r7.putSymmetricCipherImplClass(r8, r5)
            java.lang.String r8 = "DESEDE/CBC/PKCS5Padding"
            java.lang.String r5 = "OpenSSLEvpCipherDESEDE$CBC$PKCS5Padding"
            r7.putSymmetricCipherImplClass(r8, r5)
            java.lang.String r8 = "Alg.Alias.Cipher.DESEDE/CBC/PKCS7Padding"
            java.lang.String r5 = "DESEDE/CBC/PKCS5Padding"
            r7.put(r8, r5)
            java.lang.String r8 = "OpenSSLEvpCipherARC4"
            r7.putSymmetricCipherImplClass(r9, r8)
            java.lang.String r8 = "Alg.Alias.Cipher.ARCFOUR"
            r7.put(r8, r9)
            java.lang.String r8 = "Alg.Alias.Cipher.RC4"
            r7.put(r8, r9)
            java.lang.String r8 = "Alg.Alias.Cipher.1.2.840.113549.3.4"
            r7.put(r8, r9)
            java.lang.String r8 = "Alg.Alias.Cipher.OID.1.2.840.113549.3.4"
            r7.put(r8, r9)
            java.lang.String r8 = "AES/GCM/NoPadding"
            java.lang.String r9 = "OpenSSLAeadCipherAES$GCM"
            r7.putSymmetricCipherImplClass(r8, r9)
            java.lang.String r9 = "Alg.Alias.Cipher.GCM"
            r7.put(r9, r8)
            java.lang.String r9 = "Alg.Alias.Cipher.2.16.840.1.101.3.4.1.6"
            r7.put(r9, r8)
            java.lang.String r9 = "Alg.Alias.Cipher.2.16.840.1.101.3.4.1.26"
            r7.put(r9, r8)
            java.lang.String r9 = "Alg.Alias.Cipher.2.16.840.1.101.3.4.1.46"
            r7.put(r9, r8)
            java.lang.String r8 = "AES_128/GCM/NoPadding"
            java.lang.String r9 = "OpenSSLAeadCipherAES$GCM$AES_128"
            r7.putSymmetricCipherImplClass(r8, r9)
            java.lang.String r8 = "AES_256/GCM/NoPadding"
            java.lang.String r9 = "OpenSSLAeadCipherAES$GCM$AES_256"
            r7.putSymmetricCipherImplClass(r8, r9)
            java.lang.String r8 = "AES/GCM-SIV/NoPadding"
            java.lang.String r9 = "OpenSSLAeadCipherAES$GCM_SIV"
            r7.putSymmetricCipherImplClass(r8, r9)
            java.lang.String r8 = "AES_128/GCM-SIV/NoPadding"
            java.lang.String r9 = "OpenSSLAeadCipherAES$GCM_SIV$AES_128"
            r7.putSymmetricCipherImplClass(r8, r9)
            java.lang.String r8 = "AES_256/GCM-SIV/NoPadding"
            java.lang.String r9 = "OpenSSLAeadCipherAES$GCM_SIV$AES_256"
            r7.putSymmetricCipherImplClass(r8, r9)
            java.lang.String r8 = "ChaCha20"
            java.lang.String r9 = "OpenSSLCipherChaCha20"
            r7.putSymmetricCipherImplClass(r8, r9)
            java.lang.String r8 = "ChaCha20/Poly1305/NoPadding"
            java.lang.String r9 = "OpenSSLAeadCipherChaCha20"
            r7.putSymmetricCipherImplClass(r8, r9)
            java.lang.String r8 = "Alg.Alias.Cipher.ChaCha20-Poly1305"
            java.lang.String r9 = "ChaCha20/Poly1305/NoPadding"
            r7.put(r8, r9)
            java.lang.String r8 = "OpenSSLMac$HmacMD5"
            r7.putMacImplClass(r10, r8)
            java.lang.String r8 = "Alg.Alias.Mac.1.3.6.1.5.5.8.1.1"
            r7.put(r8, r10)
            java.lang.String r8 = "Alg.Alias.Mac.HMAC-MD5"
            r7.put(r8, r10)
            java.lang.String r8 = "Alg.Alias.Mac.HMAC/MD5"
            r7.put(r8, r10)
            java.lang.String r8 = "OpenSSLMac$HmacSHA1"
            r7.putMacImplClass(r0, r8)
            java.lang.String r8 = "Alg.Alias.Mac.1.2.840.113549.2.7"
            r7.put(r8, r0)
            java.lang.String r8 = "Alg.Alias.Mac.1.3.6.1.5.5.8.1.2"
            r7.put(r8, r0)
            java.lang.String r8 = "Alg.Alias.Mac.HMAC-SHA1"
            r7.put(r8, r0)
            java.lang.String r8 = "Alg.Alias.Mac.HMAC/SHA1"
            r7.put(r8, r0)
            java.lang.String r8 = "OpenSSLMac$HmacSHA224"
            r7.putMacImplClass(r1, r8)
            java.lang.String r8 = "Alg.Alias.Mac.1.2.840.113549.2.8"
            r7.put(r8, r1)
            java.lang.String r8 = "Alg.Alias.Mac.HMAC-SHA224"
            r7.put(r8, r1)
            java.lang.String r8 = "Alg.Alias.Mac.HMAC/SHA224"
            r7.put(r8, r1)
            java.lang.String r8 = "Alg.Alias.Mac.PBEWITHHMACSHA224"
            r7.put(r8, r1)
            java.lang.String r8 = "OpenSSLMac$HmacSHA256"
            r7.putMacImplClass(r2, r8)
            java.lang.String r8 = "Alg.Alias.Mac.1.2.840.113549.2.9"
            r7.put(r8, r2)
            java.lang.String r8 = "Alg.Alias.Mac.2.16.840.1.101.3.4.2.1"
            r7.put(r8, r2)
            java.lang.String r8 = "Alg.Alias.Mac.HMAC-SHA256"
            r7.put(r8, r2)
            java.lang.String r8 = "Alg.Alias.Mac.HMAC/SHA256"
            r7.put(r8, r2)
            java.lang.String r8 = "Alg.Alias.Mac.PBEWITHHMACSHA256"
            r7.put(r8, r2)
            java.lang.String r8 = "OpenSSLMac$HmacSHA384"
            r7.putMacImplClass(r3, r8)
            java.lang.String r8 = "Alg.Alias.Mac.1.2.840.113549.2.10"
            r7.put(r8, r3)
            java.lang.String r8 = "Alg.Alias.Mac.HMAC-SHA384"
            r7.put(r8, r3)
            java.lang.String r8 = "Alg.Alias.Mac.HMAC/SHA384"
            r7.put(r8, r3)
            java.lang.String r8 = "Alg.Alias.Mac.PBEWITHHMACSHA384"
            r7.put(r8, r3)
            java.lang.String r8 = "OpenSSLMac$HmacSHA512"
            r7.putMacImplClass(r4, r8)
            java.lang.String r8 = "Alg.Alias.Mac.1.2.840.113549.2.11"
            r7.put(r8, r4)
            java.lang.String r8 = "Alg.Alias.Mac.HMAC-SHA512"
            r7.put(r8, r4)
            java.lang.String r8 = "Alg.Alias.Mac.HMAC/SHA512"
            r7.put(r8, r4)
            java.lang.String r8 = "Alg.Alias.Mac.PBEWITHHMACSHA512"
            r7.put(r8, r4)
            java.lang.String r8 = PREFIX
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "OpenSSLX509CertificateFactory"
            java.lang.String r8 = r8.concat(r9)
            java.lang.String r9 = "CertificateFactory.X509"
            r7.put(r9, r8)
            java.lang.String r8 = "Alg.Alias.CertificateFactory.X.509"
            java.lang.String r9 = "X509"
            r7.put(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.OpenSSLProvider.<init>(java.lang.String, boolean, java.lang.String):void");
    }
}
