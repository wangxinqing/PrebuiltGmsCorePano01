package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;

/* renamed from: map  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class map implements man {
    private final Context a;

    public map(Context context) {
        this.a = context;
    }

    public final boolean a(File file) {
        PackageInfo packageInfo = new PackageInfo();
        packageInfo.packageName = "com.google.ccc.abuse.droidguard";
        try {
            X509Certificate[][] a2 = bcx.a(file.getAbsolutePath());
            Signature[] signatureArr = new Signature[a2.length];
            for (int i = 0; i < a2.length; i++) {
                signatureArr[i] = new Signature(a2[i][0].getEncoded());
            }
            packageInfo.signatures = signatureArr;
            return hya.a(this.a).a(packageInfo);
        } catch (bcu e) {
            throw new GeneralSecurityException("Package is not signed", e);
        } catch (IOException | RuntimeException e2) {
            throw new GeneralSecurityException("Failed to verify signatures", e2);
        }
    }
}
