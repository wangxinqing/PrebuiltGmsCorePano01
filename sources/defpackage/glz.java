package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;

/* renamed from: glz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class glz {
    private static final iwd a = ehv.a("AddAccount", "IntentResolveHelper");

    public static Intent a(Context context, Intent intent) {
        for (ResolveInfo next : context.getPackageManager().queryIntentActivities(intent, 0)) {
            if (next.activityInfo != null) {
                String str = next.activityInfo.packageName;
                a.c("Found activity to handle action %s", intent.getAction());
                if ("com.google.android.gms".equals(str) || hya.a(context).b(str)) {
                    intent.setComponent(new ComponentName(str, next.activityInfo.name));
                    return intent;
                }
            }
        }
        a.c("Failed to resolve activity for action %s", intent.getAction());
        return null;
    }
}
