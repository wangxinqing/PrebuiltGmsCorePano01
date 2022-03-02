package defpackage;

import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;

/* renamed from: wgz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wgz {
    public final KeyStore a = a();

    private static KeyStore a() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            return instance;
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            anih anih = (anih) vvj.a.b();
            anih.a(e);
            anih.a("Failed to load AndroidKeyStore on device.");
            return null;
        }
    }

    public final void b(String str) {
        KeyStore keyStore = this.a;
        if (keyStore != null) {
            keyStore.deleteEntry(str);
            return;
        }
        throw new KeyStoreException("No AndroidKeyStore found on device, cannot delete entry.");
    }

    public final Certificate a(String str) {
        KeyStore keyStore = this.a;
        if (keyStore != null) {
            return keyStore.getCertificate(str);
        }
        throw new KeyStoreException("No AndroidKeyStore found on device, cannot get certificate.");
    }
}
