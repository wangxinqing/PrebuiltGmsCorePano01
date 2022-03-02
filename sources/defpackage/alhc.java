package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* renamed from: alhc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alhc {
    private static final String c = alhc.class.getSimpleName();
    public final int a;
    public final Resources b;

    public alhc(int i, Resources resources) {
        this.a = i;
        this.b = resources;
    }

    public static alhc a(Context context, Bundle bundle) {
        Resources resources;
        if (!bundle.containsKey("packageName") || !bundle.containsKey("resourceName") || !bundle.containsKey("resourceId")) {
            return null;
        }
        String string = bundle.getString("packageName");
        String string2 = bundle.getString("resourceName");
        int i = bundle.getInt("resourceId");
        try {
            PackageManager packageManager = context.getPackageManager();
            if (Build.VERSION.SDK_INT >= 24) {
                resources = packageManager.getResourcesForApplication(packageManager.getApplicationInfo(string, 512));
            } else {
                resources = packageManager.getResourcesForApplication(packageManager.getApplicationInfo(string, 512));
            }
            return new alhc(i, resources);
        } catch (PackageManager.NameNotFoundException e) {
            Bundle bundle2 = bundle.getBundle("fallbackConfig");
            if (bundle2 == null) {
                return null;
            }
            String str = c;
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 38 + String.valueOf(string2).length());
            sb.append(string);
            sb.append(" not found, ");
            sb.append(string2);
            sb.append(" fallback to default value");
            Log.w(str, sb.toString());
            return a(context, bundle2);
        }
    }
}
