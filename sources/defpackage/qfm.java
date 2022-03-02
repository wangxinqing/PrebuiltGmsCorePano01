package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: qfm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qfm {
    public static Intent a(Intent intent) {
        return qlq.a(true).putExtra("downloadSupervisorRedirectIntent", intent).putExtra("downloadSupervisorShowPrompt", true);
    }

    public static boolean b(Context context) {
        return qfe.a() == 0 && !a(context);
    }

    public static boolean a(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.google.android.instantapps.supervisor", 128);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public static boolean a(Context context, qfn qfn) {
        int i;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.instantapps.supervisor", 128);
        if (((long) packageInfo.versionCode) >= axuy.a.a().C()) {
            if (!(packageInfo.applicationInfo == null || packageInfo.applicationInfo.metaData == null)) {
                if (axvh.a.a().c()) {
                    i = packageInfo.applicationInfo.metaData.getInt("com.google.android.instantapps.supervisor.min_gcore_version");
                } else {
                    i = 0;
                }
                if (i == 0) {
                    i = packageInfo.applicationInfo.metaData.getInt("com.google.android.gms.version");
                }
                if (i != 0) {
                    if (jjl.a(hxj.b) >= jjl.a(i)) {
                        return true;
                    }
                    qfn.c("Supervisor requires newer gms", new Object[0]);
                    return false;
                }
            }
            return false;
        }
        qfn.c("Supervisor version is not supported", new Object[0]);
        return false;
    }
}
