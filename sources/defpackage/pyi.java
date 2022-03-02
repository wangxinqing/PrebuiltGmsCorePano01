package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.util.GregorianCalendar;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;

/* renamed from: pyi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pyi {
    private static SecretKey a(SecureRandom secureRandom) {
        byte[] bArr = new byte[32];
        secureRandom.nextBytes(bArr);
        return new SecretKeySpec(bArr, "AES");
    }

    private static KeyPair b(Context context) {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            try {
                instance.load((KeyStore.LoadStoreParameter) null);
                try {
                    if (instance.containsAlias("identity_accountWrapKey")) {
                        try {
                            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) instance.getEntry("identity_accountWrapKey", (KeyStore.ProtectionParameter) null);
                            return new KeyPair(privateKeyEntry.getCertificate().getPublicKey(), privateKeyEntry.getPrivateKey());
                        } catch (KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException e) {
                            try {
                                instance.deleteEntry("identity_accountWrapKey");
                            } catch (KeyStoreException e2) {
                                return null;
                            }
                        }
                    }
                    pyg pyg = new pyg(context, "identity_accountWrapKey");
                    try {
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
                        gregorianCalendar2.add(1, 100);
                        KeyPairGeneratorSpec.Builder alias = new KeyPairGeneratorSpec.Builder(pyg.a).setAlias(pyg.b);
                        String str = pyg.b;
                        KeyPairGeneratorSpec build = alias.setSubject(new X500Principal(str.length() == 0 ? new String("CN=") : "CN=".concat(str))).setSerialNumber(BigInteger.ONE).setStartDate(gregorianCalendar.getTime()).setEndDate(gregorianCalendar2.getTime()).build();
                        KeyPairGenerator instance2 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        instance2.initialize(build);
                        return instance2.generateKeyPair();
                    } catch (InvalidAlgorithmParameterException e3) {
                        return null;
                    } catch (NoSuchAlgorithmException e4) {
                        return null;
                    } catch (NoSuchProviderException e5) {
                        return null;
                    }
                } catch (KeyStoreException e6) {
                    return null;
                }
            } catch (IOException e7) {
                return null;
            } catch (NoSuchAlgorithmException e8) {
                return null;
            } catch (CertificateException e9) {
                return null;
            }
        } catch (KeyStoreException e10) {
            return null;
        }
    }

    private static pyh c(Context context) {
        int i = Build.VERSION.SDK_INT;
        KeyPair b = b(context);
        if (b != null) {
            try {
                return new pyh(Cipher.getInstance("RSA/ECB/PKCS1Padding"), b);
            } catch (NoSuchAlgorithmException e) {
            } catch (NoSuchPaddingException e2) {
                return null;
            }
        }
        return null;
    }

    public static pyb a(Context context) {
        SecretKey secretKey;
        SecretKey secretKey2;
        SharedPreferences sharedPreferences = context.getSharedPreferences("identity_accountDataSharedPrefs", 0);
        pyh c = c(context);
        pyc pyc = c != null ? new pyc(sharedPreferences, c, "AES") : null;
        if (pyc != null) {
            SecureRandom secureRandom = new SecureRandom();
            if (pyc.b == null) {
                pyc.b = pyc.a("messageKey");
            }
            SecretKey secretKey3 = pyc.b;
            if (secretKey3 == null) {
                SecretKey a = a(secureRandom);
                iva.a((Object) a, (Object) "Message key must not be null.");
                pyc.b = a;
                pyc.a("messageKey", a);
                secretKey = a;
            } else {
                secretKey = secretKey3;
            }
            if (pyc.a == null) {
                pyc.a = pyc.a("macKey");
            }
            SecretKey secretKey4 = pyc.a;
            if (secretKey4 == null) {
                SecretKey a2 = a(secureRandom);
                iva.a((Object) a2, (Object) "MAC key must not be null.");
                pyc.a = a2;
                pyc.a("macKey", a2);
                secretKey2 = a2;
            } else {
                secretKey2 = secretKey4;
            }
            try {
                try {
                    return new pyb(new pye(Cipher.getInstance("AES/CBC/PKCS5Padding")), secretKey, new pyf(Mac.getInstance("HmacSHA512")), secretKey2, secureRandom);
                } catch (NoSuchAlgorithmException e) {
                    return null;
                }
            } catch (NoSuchAlgorithmException e2) {
            } catch (NoSuchPaddingException e3) {
                return null;
            }
        }
        return null;
    }
}
