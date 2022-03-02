package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: aanm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aanm {
    private final Context a;
    private final PackageManager b;

    public aanm(Context context) {
        this.a = context;
        this.b = context.getPackageManager();
    }

    public final aanl a(String str) {
        aanl aanl = new aanl();
        try {
            aanl.a = aann.a(new File(this.b.getApplicationInfo(str, 0).sourceDir));
            aanl.c = this.b.getInstallerPackageName(str);
            aanl.d = this.b.getPackageInfo(str, 0).sharedUserId;
            Signature[] signatureArr = this.b.getPackageInfo(str, 64).signatures;
            aanl.b = new byte[signatureArr.length][];
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            for (int i = 0; i < signatureArr.length; i++) {
                aanl.b[i] = instance.digest(signatureArr[i].toByteArray());
            }
            return aanl;
        } catch (PackageManager.NameNotFoundException | IOException | NoSuchAlgorithmException e) {
            return null;
        }
    }
}
