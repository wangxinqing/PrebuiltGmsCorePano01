package defpackage;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.Cipher;

/* renamed from: iir  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class iir {
    public static final Lock a = new ReentrantLock();
    public static final iwd b = new iwd("GLSUser", "BindingKeyManager");
    public static volatile iir c;
    public static volatile fzf d;

    public static final KeyPair a(String str) {
        ECGenParameterSpec eCGenParameterSpec = new ECGenParameterSpec("secp256r1");
        KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
        instance.initialize(eCGenParameterSpec, new SecureRandom());
        KeyPair generateKeyPair = instance.generateKeyPair();
        a(generateKeyPair, str);
        return generateKeyPair;
    }

    private static final void a(KeyPair keyPair, String str) {
        boolean z;
        PrivateKey privateKey = keyPair.getPrivate();
        PublicKey publicKey = keyPair.getPublic();
        boolean a2 = d.a(str.concat("_privateKey"), jhy.b(privateKey.getEncoded()), d.a(str.concat("_privateKey")));
        String b2 = jhy.b(publicKey.getEncoded());
        String a3 = d.a(str.concat("_publicKey"));
        if (!a2 || !d.a(str.concat("_publicKey"), b2, a3)) {
            z = false;
        } else {
            z = true;
        }
        b.a("Successfully pubKey? %s [ %s ]", Boolean.valueOf(z), b2);
        if (z) {
            d.a();
            return;
        }
        throw new IllegalStateException("Failure to set Channel ID keys in store!");
    }

    public final KeyPair a() {
        KeyPair a2;
        fzf fzf;
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) instance.getEntry("rsa.channel.wrapper", (KeyStore.ProtectionParameter) null);
            if (privateKeyEntry != null) {
                PrivateKey privateKey = privateKeyEntry.getPrivateKey();
                instance.deleteEntry("rsa.channel.wrapper");
                String a3 = d.a("wrapped_private_channel_key_b64");
                String a4 = d.a("public_channel_key_b64");
                if (a3 != null) {
                    if (a4 != null) {
                        byte[] a5 = jhy.a(a3);
                        KeyFactory instance2 = KeyFactory.getInstance("EC");
                        PublicKey generatePublic = instance2.generatePublic(new X509EncodedKeySpec(jhy.a(a4)));
                        Cipher instance3 = Cipher.getInstance("RSA/ECB/PKCS1Padding", "AndroidOpenSSL");
                        instance3.init(2, privateKey);
                        KeyPair keyPair = new KeyPair(generatePublic, instance2.generatePrivate(new PKCS8EncodedKeySpec(instance3.doFinal(a5))));
                        a(keyPair, "channel_binding_manager");
                        b.a("Successfully transitioned wrapped keys.", new Object[0]);
                        d.b("wrapped_private_channel_key_b64");
                        d.b("public_channel_key_b64");
                        d.b("wrapped_private_channel_key_format_b64");
                        d.b("public_channel_key_format_b64");
                        d.a();
                        return keyPair;
                    }
                }
                a2 = a("channel_binding_manager");
                fzf = d;
                fzf.b("wrapped_private_channel_key_b64");
                d.b("public_channel_key_b64");
                d.b("wrapped_private_channel_key_format_b64");
                d.b("public_channel_key_format_b64");
                d.a();
                return a2;
            }
            a2 = a("channel_binding_manager");
            fzf = d;
            fzf.b("wrapped_private_channel_key_b64");
            d.b("public_channel_key_b64");
            d.b("wrapped_private_channel_key_format_b64");
            d.b("public_channel_key_format_b64");
            d.a();
            return a2;
        } catch (KeyStoreException e) {
            b.d("Unable to get instance of AndroidKeyStore", new Object[0]);
            a2 = a("channel_binding_manager");
            fzf = d;
        } catch (NoSuchProviderException e2) {
            b.d("BOUNCYCASTLE provider unavailable. Creating new keys.", new Object[0]);
            a2 = a("channel_binding_manager");
            fzf = d;
        } catch (Exception e3) {
            b.a("We have a borked keystore. Deleting old keys/creating new keys.", new Object[0]);
            a2 = a("channel_binding_manager");
            fzf = d;
        } catch (Throwable th) {
            d.b("wrapped_private_channel_key_b64");
            d.b("public_channel_key_b64");
            d.b("wrapped_private_channel_key_format_b64");
            d.b("public_channel_key_format_b64");
            d.a();
            throw th;
        }
    }
}
