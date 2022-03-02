package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import java.util.List;

/* renamed from: aljg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aljg {
    private static boolean a = false;
    private static aljg b;
    private final String c;
    private final Resources d;

    private aljg(String str, Resources resources) {
        this.c = str;
        this.d = resources;
    }

    public static synchronized aljg a(Context context) {
        aljg aljg;
        List<ResolveInfo> list;
        synchronized (aljg.class) {
            if (!a) {
                PackageManager packageManager = context.getPackageManager();
                Intent intent = new Intent("com.android.setupwizard.action.PARTNER_CUSTOMIZATION");
                if (Build.VERSION.SDK_INT >= 24) {
                    list = packageManager.queryBroadcastReceivers(intent, 1835520);
                } else {
                    list = packageManager.queryBroadcastReceivers(intent, 512);
                }
                for (ResolveInfo next : list) {
                    if (next.activityInfo != null) {
                        ApplicationInfo applicationInfo = next.activityInfo.applicationInfo;
                        if ((applicationInfo.flags & 1) != 0) {
                            try {
                                b = new aljg(applicationInfo.packageName, packageManager.getResourcesForApplication(applicationInfo));
                                break;
                            } catch (PackageManager.NameNotFoundException e) {
                                String valueOf = String.valueOf(applicationInfo.packageName);
                                Log.w("(setupdesign) Partner", valueOf.length() == 0 ? new String("Failed to find resources for ") : "Failed to find resources for ".concat(valueOf));
                            }
                        } else {
                            continue;
                        }
                    }
                }
                a = true;
            }
            aljg = b;
        }
        return aljg;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r5.getResources();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r5, int r6) {
        /*
            aljg r0 = a(r5)
            if (r0 == 0) goto L_0x0025
            android.content.res.Resources r1 = r5.getResources()
            java.lang.String r2 = r1.getResourceEntryName(r6)
            java.lang.String r1 = r1.getResourceTypeName(r6)
            android.content.res.Resources r3 = r0.d
            java.lang.String r4 = r0.c
            int r1 = r3.getIdentifier(r2, r1, r4)
            if (r1 != 0) goto L_0x001d
            goto L_0x0025
        L_0x001d:
            aljf r5 = new aljf
            android.content.res.Resources r6 = r0.d
            r5.<init>(r6, r1)
            goto L_0x0032
        L_0x0025:
            aljf r0 = new aljf
            r5.getPackageName()
            android.content.res.Resources r5 = r5.getResources()
            r0.<init>(r5, r6)
            r5 = r0
        L_0x0032:
            android.content.res.Resources r6 = r5.a
            int r5 = r5.b
            java.lang.String r5 = r6.getString(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aljg.a(android.content.Context, int):java.lang.String");
    }
}
