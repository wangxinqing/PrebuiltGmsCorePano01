package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.R;

/* renamed from: lta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lta extends luj {
    public final CharSequence a(Context context) {
        return context.getString(R.string.gearhead_app_name);
    }

    public final String a() {
        return "com.google.android.projection.gearhead";
    }

    public final ComponentName b(Context context) {
        return a(context, "com.google.android.projection.gearhead");
    }

    public final int c() {
        return 2;
    }

    public final boolean c(Context context) {
        return true;
    }

    public final boolean d(Context context) {
        lww.a();
        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.projection.gearhead", 0);
            if (packageManager.resolveActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setPackage("com.google.android.projection.gearhead"), 0) == null || ((long) packageInfo.versionCode) < awqy.d()) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public final Intent b() {
        return b("com.google.android.projection.gearhead");
    }
}
