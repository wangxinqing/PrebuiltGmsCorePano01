package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.security.auth.x500.X500Principal;

/* renamed from: tlj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tlj {
    public final tli a = new tli();
    private final SecureRandom b = new SecureRandom();

    private final byte[] a() {
        byte[] bArr = new byte[72];
        this.b.nextBytes(bArr);
        return bArr;
    }

    private static String c(String str) {
        return String.format("%s.%s", new Object[]{"nearby.connections", str});
    }

    public final void b(String str) {
        try {
            tli tli = this.a;
            String c = c(str);
            KeyStore keyStore = tli.a;
            if (keyStore == null) {
                throw new KeyStoreException("No AndroidKeyStore found on device.");
            } else if (keyStore.containsAlias(c)) {
                tli.a.deleteEntry(c);
            }
        } catch (KeyStoreException e) {
            anih anih = (anih) tky.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("tlj", "b", 263, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to delete key store entry %s", (Object) str);
        }
    }

    public final boolean a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!aymi.w() || !jkr.b()) {
            return false;
        }
        try {
            KeyFactory instance = KeyFactory.getInstance("EC");
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(bArr);
            try {
                PublicKey generatePublic = instance.generatePublic(x509EncodedKeySpec);
                try {
                    Signature instance2 = Signature.getInstance("SHA256withECDSA");
                    try {
                        instance2.initVerify(generatePublic);
                        try {
                            instance2.update(bArr2);
                            return instance2.verify(bArr3);
                        } catch (SignatureException e) {
                            anih anih = (anih) tky.a.c();
                            anih.a((Throwable) e);
                            ((anih) anih.a("tlj", "a", 254, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to verify bytes with paired key.");
                            return false;
                        }
                    } catch (InvalidKeyException e2) {
                        anih anih2 = (anih) tky.a.c();
                        anih2.a((Throwable) e2);
                        ((anih) anih2.a("tlj", "a", 246, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to verify bytes with paired key.");
                        return false;
                    }
                } catch (NoSuchAlgorithmException e3) {
                    anih anih3 = (anih) tky.a.c();
                    anih3.a((Throwable) e3);
                    ((anih) anih3.a("tlj", "a", 238, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to verify bytes with paired key: %s", (Object) "SHA256withECDSA");
                    return false;
                }
            } catch (InvalidKeySpecException e4) {
                anih anih4 = (anih) tky.a.c();
                anih4.a((Throwable) e4);
                ((anih) anih4.a("tlj", "a", 229, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to verify bytes with paired key: %s", (Object) x509EncodedKeySpec.getFormat());
                return false;
            }
        } catch (NoSuchAlgorithmException e5) {
            anih anih5 = (anih) tky.a.c();
            anih5.a((Throwable) e5);
            ((anih) anih5.a("tlj", "a", 219, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to verify bytes with paired key: %s", (Object) "EC");
            return false;
        }
    }

    public final byte[] a(String str) {
        if (!aymi.w() || !jkr.b()) {
            return null;
        }
        String c = c(str);
        try {
            Certificate a2 = this.a.a(c);
            if (a2 != null) {
                return a2.getPublicKey().getEncoded();
            }
            try {
                KeyPairGenerator instance = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
                try {
                    instance.initialize(new KeyGenParameterSpec.Builder(c, 12).setDigests(new String[]{"SHA-256"}).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setCertificateSubject(new X500Principal("O=Google, OU=Android, C=US")).setRandomizedEncryptionRequired(false).build());
                    try {
                        instance.generateKeyPair();
                        jjg jjg = tky.a;
                        try {
                            return this.a.a(c).getPublicKey().getEncoded();
                        } catch (KeyStoreException e) {
                            anih anih = (anih) tky.a.c();
                            anih.a((Throwable) e);
                            ((anih) anih.a("tlj", "a", 130, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create paired key.");
                            return null;
                        }
                    } catch (ProviderException e2) {
                        anih anih2 = (anih) tky.a.c();
                        anih2.a((Throwable) e2);
                        ((anih) anih2.a("tlj", "a", 122, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create paired key.");
                        return null;
                    }
                } catch (InvalidAlgorithmParameterException e3) {
                    anih anih3 = (anih) tky.a.c();
                    anih3.a((Throwable) e3);
                    ((anih) anih3.a("tlj", "a", 115, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create paired key.");
                    return null;
                }
            } catch (NoSuchAlgorithmException | NoSuchProviderException e4) {
                anih anih4 = (anih) tky.a.c();
                anih4.a(e4);
                ((anih) anih4.a("tlj", "a", 101, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create paired key.");
                return null;
            }
        } catch (KeyStoreException e5) {
            anih anih5 = (anih) tky.a.c();
            anih5.a((Throwable) e5);
            ((anih) anih5.a("tlj", "a", 92, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create paired key.");
            return null;
        }
    }

    public final byte[] a(String str, byte[] bArr) {
        if (!aymi.w()) {
            return a();
        }
        if (!jkr.b()) {
            return a();
        }
        try {
            String c = c(str);
            KeyStore keyStore = this.a.a;
            if (keyStore != null) {
                PrivateKey privateKey = (PrivateKey) keyStore.getKey(c, (char[]) null);
                X509Certificate x509Certificate = (X509Certificate) this.a.a(c);
                if (privateKey == null) {
                    ((anih) ((anih) tky.a.c()).a("tlj", "a", 164, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No private key is available. Failed to sign with paired key.");
                    return a();
                }
                if (!(x509Certificate == null || x509Certificate.getPublicKey() == null)) {
                    jjg jjg = tky.a;
                    Arrays.toString(x509Certificate.getPublicKey().getEncoded());
                }
                try {
                    Signature instance = Signature.getInstance("SHA256withECDSA");
                    try {
                        instance.initSign(privateKey);
                        try {
                            instance.update(bArr);
                            return instance.sign();
                        } catch (SignatureException e) {
                            anih anih = (anih) tky.a.c();
                            anih.a((Throwable) e);
                            ((anih) anih.a("tlj", "a", 196, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to sign with paired key.");
                            return a();
                        }
                    } catch (InvalidKeyException e2) {
                        anih anih2 = (anih) tky.a.c();
                        anih2.a((Throwable) e2);
                        ((anih) anih2.a("tlj", "a", 187, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to sign with paired key: %s", (Object) privateKey.getAlgorithm());
                        return a();
                    }
                } catch (NoSuchAlgorithmException e3) {
                    anih anih3 = (anih) tky.a.c();
                    anih3.a((Throwable) e3);
                    ((anih) anih3.a("tlj", "a", 180, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to sign with paired key.");
                    return a();
                }
            } else {
                throw new KeyStoreException("No AndroidKeyStore found on device.");
            }
        } catch (KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException e4) {
            anih anih4 = (anih) tky.a.c();
            anih4.a(e4);
            ((anih) anih4.a("tlj", "a", 159, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to sign with paired key.");
            return a();
        }
    }
}
