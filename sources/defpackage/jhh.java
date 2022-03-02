package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: jhh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jhh {
    private static volatile int a = -1;

    public static int a(Context context) {
        if (a == -1) {
            String packageName = context.getPackageName();
            try {
                a = jni.b(context).b(packageName, 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(packageName);
                Log.w("AndroidUtilsLight", valueOf.length() == 0 ? new String("Could not find package info for package: ") : "Could not find package info for package: ".concat(valueOf));
            }
        }
        return a;
    }

    public static MessageDigest a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return null;
    }

    public static byte[] a(Context context, String str, String str2) {
        return a(jni.b(context).b(str, 64), str2);
    }

    static byte[] a(PackageInfo packageInfo, String str) {
        MessageDigest a2;
        if (packageInfo.signatures == null || packageInfo.signatures.length != 1 || (a2 = a(str)) == null) {
            return null;
        }
        return a2.digest(packageInfo.signatures[0].toByteArray());
    }
}
