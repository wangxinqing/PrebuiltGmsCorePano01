package defpackage;

import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: tli  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tli {
    public final KeyStore a = b();

    private static KeyStore b() {
        if (!aymi.w() || !jkr.b()) {
            return null;
        }
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            return instance;
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            anih anih = (anih) tky.a.c();
            anih.a(e);
            ((anih) anih.a("tli", "b", 362, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to load AndroidKeyStore on device.");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final Certificate a(String str) {
        KeyStore keyStore = this.a;
        if (keyStore != null) {
            return keyStore.getCertificate(str);
        }
        throw new KeyStoreException("No AndroidKeyStore found on device, cannot get certificate.");
    }

    public final void a() {
        KeyStore keyStore = this.a;
        if (keyStore != null) {
            try {
                ArrayList<T> list = Collections.list(keyStore.aliases());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    String str = (String) list.get(i);
                    if (str.startsWith("nearby.connections")) {
                        try {
                            this.a.deleteEntry(str);
                        } catch (KeyStoreException e) {
                        }
                    }
                }
            } catch (IllegalStateException | KeyStoreException e2) {
            }
        }
    }
}
