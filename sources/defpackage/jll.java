package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: jll  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jll {
    public static boolean a(Context context, int i) {
        if (a(context, i, "com.google.android.gms")) {
            try {
                return hya.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return false;
    }

    public static boolean a(Context context, int i, String str) {
        return jni.b(context).a(i, str);
    }
}
