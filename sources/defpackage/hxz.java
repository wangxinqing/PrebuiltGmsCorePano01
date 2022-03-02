package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: hxz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class hxz {
    private static boolean a = false;
    @Deprecated
    public static final int b = 201216000;
    static boolean c = false;
    static final AtomicBoolean d = new AtomicBoolean();

    static {
        new AtomicBoolean();
    }

    @Deprecated
    public static String a(int i) {
        return ConnectionResult.a(i);
    }

    @Deprecated
    public static boolean b(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    public static boolean f(Context context) {
        if (!c) {
            try {
                PackageInfo b2 = jni.b(context).b("com.google.android.gms", 64);
                hya.a(context);
                if (b2 == null || hya.b(b2, false) || !hya.b(b2, true)) {
                    a = false;
                } else {
                    a = true;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
            } finally {
                c = true;
            }
        }
        return a;
    }

    public static boolean g(Context context) {
        return f(context) || !jix.a();
    }

    @Deprecated
    public static void h(Context context) {
        if (!d.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException e) {
            }
        }
    }

    public static Context i(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    @Deprecated
    public static int j(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static void l(Context context) {
        int b2 = hxk.d.b(context);
        if (b2 != 0) {
            Intent b3 = hxk.d.b(context, b2, "e");
            StringBuilder sb = new StringBuilder(57);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(b2);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (b3 == null) {
                throw new hxw();
            }
            throw new hxx(b2, "Google Play Services not available", b3);
        }
    }

    @Deprecated
    public static boolean a() {
        return jix.a();
    }

    @Deprecated
    public static boolean b(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return a(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean k(Context context) {
        int i = Build.VERSION.SDK_INT;
        Bundle applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    public static boolean a(Context context, int i) {
        return jll.a(context, i);
    }

    @Deprecated
    public static boolean a(Context context, int i, String str) {
        return jll.a(context, i, str);
    }

    public static boolean a(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (equals && jim.a()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        try {
            for (PackageInstaller.SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                if (str.equals(appPackageName.getAppPackageName())) {
                    return true;
                }
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, FragmentTransaction.TRANSIT_EXIT_MASK);
                if (equals) {
                    return applicationInfo.enabled;
                }
                if (!applicationInfo.enabled || k(context)) {
                    return false;
                }
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                return false;
            }
        } catch (Exception e2) {
            return false;
        }
    }
}
