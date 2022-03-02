package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: atgn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atgn {
    public static final String[] a;

    static {
        String[] strArr = {"com.google.android.geo.API_KEY", "com.google.android.maps.v2.API_KEY"};
        a = strArr;
        String str = strArr[0];
    }

    public static String a(Context context, String str) {
        byte[] digest;
        try {
            PackageInfo b = jni.b(context).b(str, 64);
            if (!(b == null || b.signatures == null || b.signatures.length == 0)) {
                if (b.signatures[0] != null) {
                    byte[] byteArray = b.signatures[0].toByteArray();
                    MessageDigest instance = MessageDigest.getInstance("SHA-1");
                    if (!(instance == null || (digest = instance.digest(byteArray)) == null)) {
                        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                        StringBuilder sb = new StringBuilder(r4 + r4);
                        for (byte b2 : digest) {
                            sb.append(cArr[(b2 >> 4) & 15]);
                            sb.append(cArr[b2 & 15]);
                        }
                        return sb.toString();
                    }
                }
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        } catch (NoSuchAlgorithmException e2) {
            return null;
        }
    }
}
