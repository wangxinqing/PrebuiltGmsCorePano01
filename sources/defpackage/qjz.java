package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: qjz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qjz {
    private static final anax a = anax.a("com", "co", "org", "net", "int", "edu", "gov", "mil");

    public static List a(String str) {
        ArrayList arrayList = new ArrayList();
        String c = c(str);
        if (!TextUtils.isEmpty(c)) {
            String[] d = d(c);
            StringBuilder sb = new StringBuilder(c.length());
            int length = d.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                }
                sb.append(d[length]);
                if (length == 0) {
                    arrayList.add(sb.toString());
                    break;
                }
                sb.append('.');
                int length2 = d.length;
                if (length != length2 - 1 && (length != length2 - 2 || !a.contains(d[length]))) {
                    String valueOf = String.valueOf(sb);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 1);
                    sb2.append(valueOf);
                    sb2.append("*");
                    arrayList.add(sb2.toString());
                }
                length--;
            }
            Collections.reverse(arrayList);
        }
        return arrayList;
    }

    public static String b(String str) {
        String c = c(str);
        String[] d = d(c);
        StringBuilder sb = new StringBuilder(c.length());
        for (int length = d.length - 1; length >= 0; length--) {
            sb.append(d[length]);
            if (length != 0) {
                sb.append('.');
            }
        }
        return sb.toString();
    }

    private static String c(String str) {
        iva.a((Object) str);
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String lowerCase = str.toLowerCase();
        int length = lowerCase.charAt(lowerCase.length() + -1) == '.' ? lowerCase.length() - 1 : lowerCase.length();
        if (length > 0) {
            return lowerCase.substring(0, length);
        }
        return "";
    }

    private static String[] d(String str) {
        return str.split("\\.");
    }

    public static boolean a(PackageManager packageManager, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                if (packageInfo == null) {
                    return false;
                }
                if (!jkr.e() || !packageInfo.applicationInfo.isInstantApp()) {
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return false;
    }
}
