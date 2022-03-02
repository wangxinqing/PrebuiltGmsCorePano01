package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.util.List;

/* renamed from: ocu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ocu {
    private final Context a;

    public ocu(Context context) {
        this.a = context;
    }

    public final int a() {
        aucd o = avoh.c.o();
        List a2 = jir.a();
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager == null) {
            a2.add(avog.RTC_VERSION_UNSET);
        } else {
            String str = "";
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setComponent(new ComponentName("com.google.android.apps.helprtc", "com.google.android.apps.helprtc.ui.ScreenshareActivity")), 0)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null && activityInfo.enabled) {
                    str = activityInfo.packageName;
                }
            }
            if (TextUtils.isEmpty(str)) {
                a2.add(avog.RTC_VERSION_UNSET);
            } else {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                    if (packageInfo == null) {
                        a2.add(avog.RTC_VERSION_UNSET);
                    } else {
                        int i = packageInfo.versionCode;
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        avoh avoh = (avoh) o.b;
                        avoh.a |= 1;
                        avoh.b = i;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    a2.add(avog.RTC_VERSION_UNSET);
                }
            }
        }
        if (!a2.contains(avog.RTC_VERSION_UNSET)) {
            return ((avoh) o.b).b;
        }
        return 0;
    }
}
