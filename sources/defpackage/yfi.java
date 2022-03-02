package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: yfi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yfi {
    public static String a(Context context) {
        StringBuilder sb = new StringBuilder("Android/");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            sb.append(packageInfo.packageName);
            sb.append("/");
            sb.append(packageInfo.versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("HttpUtils", e.getMessage(), e);
        }
        return sb.toString();
    }
}
