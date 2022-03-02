package defpackage;

import android.content.Context;
import android.content.pm.Signature;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* renamed from: cqk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cqk {
    public static final X509Certificate a(Context context, String str) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(context.getAssets().open(str));
        } catch (FileNotFoundException e) {
            String valueOf = String.valueOf(str);
            Log.e("DynamicModuleDownloader", valueOf.length() == 0 ? new String("Certificate file could not be found. Check: ") : "Certificate file could not be found. Check: ".concat(valueOf));
            return null;
        } catch (CertificateException e2) {
            String valueOf2 = String.valueOf(str);
            Log.e("DynamicModuleDownloader", valueOf2.length() == 0 ? new String("Certificate signature could not be extracted from file. Check: ") : "Certificate signature could not be extracted from file. Check: ".concat(valueOf2));
            return null;
        } catch (IOException e3) {
            String valueOf3 = String.valueOf(str);
            Log.e("DynamicModuleDownloader", valueOf3.length() == 0 ? new String("Certificate signature could not be read from file. Check: ") : "Certificate signature could not be read from file. Check: ".concat(valueOf3));
            return null;
        }
    }

    public static X509Certificate a(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(auay.a(signature.toByteArray()).g());
        } catch (CertificateException e) {
            Log.e("DynamicModuleDownloader", "Cannot decode certificate.");
            return null;
        }
    }
}
