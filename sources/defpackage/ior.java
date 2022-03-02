package defpackage;

import android.accounts.AccountManager;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: ior  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ior {
    public final AccountManager a = AccountManager.get(ihs.b());

    static final String a(String str) {
        try {
            PackageInfo b = jni.b(ihs.b()).b(str, 64);
            if (!(b == null || b.signatures == null || b.signatures.length == 0 || b.signatures[0] == null)) {
                try {
                    return anml.g.b().a(MessageDigest.getInstance("SHA1").digest(b.signatures[0].toByteArray()));
                } catch (NoSuchAlgorithmException e) {
                }
            }
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            return null;
        }
    }
}
