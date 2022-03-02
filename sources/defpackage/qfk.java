package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;

/* renamed from: qfk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qfk {
    public final Context a;

    public qfk(Context context) {
        this.a = context;
    }

    public static boolean a(Context context, String str) {
        try {
            ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(new ComponentName("com.android.vending", "com.google.android.finsky.instantapps.EphemeralInstallerActivity"), 128);
            if (activityInfo == null || activityInfo.metaData == null || !activityInfo.metaData.getBoolean(str)) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public final boolean a() {
        return a(this.a, "canDecodeProtobufSplitName");
    }
}
