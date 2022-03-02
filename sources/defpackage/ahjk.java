package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.text.TextUtils;
import com.google.android.chimera.FragmentTransaction;
import java.util.List;

/* renamed from: ahjk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahjk {
    public static int a(Context context, int i, String str) {
        if (a()) {
            return jhr.a(context).c(axwu.b(), i, str);
        }
        return 0;
    }

    public static void b(Context context, PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            a(context, ajqw.b(pendingIntent), ajqw.a(pendingIntent));
        }
    }

    public static void a(Context context, String str) {
        List list;
        int callingPid = Binder.getCallingPid();
        int callingUid = Binder.getCallingUid();
        try {
            ApplicationInfo a = jni.b(context).a(str, 0);
            if (a() && a.targetSdkVersion > 28) {
                if (!TextUtils.isEmpty(axwu.c())) {
                    list = amsk.a(';').c(axwu.c());
                } else {
                    list = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    if (list != null && list.contains(str)) {
                        return;
                    }
                }
                if (b(context, str)) {
                    return;
                }
                throw new SecurityException("Activity detection usage requires the ACTIVITY_RECOGNITION permission");
            } else if (jni.b(context).a("com.google.android.gms.permission.ACTIVITY_RECOGNITION", callingPid, callingUid) != 0) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("activity_recognition_permission_whitelist", 0);
                for (String str2 : jni.b(context).a(callingUid)) {
                    if (sharedPreferences.getBoolean(str2, false)) {
                        try {
                            PackageInfo b = jni.b(context).b(str2, FragmentTransaction.TRANSIT_ENTER_MASK);
                            if (b.requestedPermissions != null) {
                                String[] strArr = b.requestedPermissions;
                                int length = strArr.length;
                                int i = 0;
                                while (i < length) {
                                    if ("com.google.android.gms.permission.ACTIVITY_RECOGNITION".equals(strArr[i])) {
                                        String valueOf = String.valueOf(str2);
                                        if (valueOf.length() == 0) {
                                            new String("Found package in activity recognition white-list: ");
                                            return;
                                        } else {
                                            "Found package in activity recognition white-list: ".concat(valueOf);
                                            return;
                                        }
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            e.getMessage();
                        }
                        String valueOf2 = String.valueOf(str2);
                        if (valueOf2.length() == 0) {
                            new String("Found whitelisted package that doesn't define the permission in its manifest: ");
                        } else {
                            "Found whitelisted package that doesn't define the permission in its manifest: ".concat(valueOf2);
                        }
                    }
                }
                throw new SecurityException("Activity detection usage requires the ACTIVITY_RECOGNITION permission");
            }
        } catch (PackageManager.NameNotFoundException e2) {
            e2.getMessage();
        }
    }

    public static boolean b(Context context, int i, String str) {
        int a = a(context, i, str);
        StringBuilder sb = new StringBuilder(61);
        sb.append("isRunTimetimePermissionAppOpsAllowed appOps mode: ");
        sb.append(a);
        sb.toString();
        return a == 0;
    }

    public static boolean b(Context context, String str) {
        return jni.b(context).a(axwu.a.a().activityRecognitionRuntimePermission(), str) == 0;
    }

    public static boolean a() {
        boolean h = jkr.h();
        boolean e = axwu.e();
        StringBuilder sb = new StringBuilder(52);
        sb.append("PlatformVersion at least Q ");
        sb.append(h);
        sb.append("  flag enabled ");
        sb.append(e);
        sb.toString();
        return jkr.h() && axwu.e();
    }

    public static boolean a(Context context, PendingIntent pendingIntent) {
        if (!a()) {
            return false;
        }
        int b = ajqw.b(pendingIntent);
        String a = ajqw.a(pendingIntent);
        if (!axwu.a.a().checkPermissionBeforeNoteopV27()) {
            boolean b2 = b(context, b, a);
            boolean b3 = b(context, a);
            StringBuilder sb = new StringBuilder(80);
            sb.append("isRuntimePermissionGranted check, appOpsAllowed ");
            sb.append(b2);
            sb.append(" hasRuntimePermission ");
            sb.append(b3);
            sb.toString();
            if (b2 && b3) {
                return false;
            }
            return true;
        } else if (!b(context, a) || !b(context, b, a)) {
            return true;
        }
        return false;
    }
}
