package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;

/* renamed from: jim  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jim {
    public static boolean b(Context context, String str) {
        if ("com.google.android.gms".equals(str) && a()) {
            return false;
        }
        try {
            if ((jni.b(context).a(str, 0).flags & 2097152) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public static int a(Context context, String str) {
        PackageInfo packageInfo;
        Bundle bundle;
        try {
            packageInfo = jni.b(context).b(str, 128);
        } catch (PackageManager.NameNotFoundException e) {
            packageInfo = null;
        }
        if (packageInfo == null || packageInfo.applicationInfo == null || (bundle = packageInfo.applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    public static boolean a() {
        return ikz.b() && ikz.a == Process.myUid();
    }
}
