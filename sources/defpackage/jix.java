package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: jix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jix {
    public static Boolean a;
    private static Boolean b;
    private static Boolean c;
    private static Boolean d;
    private static Boolean e;
    private static Boolean f;
    private static Boolean g;
    private static Boolean h;
    private static Boolean i;
    private static Boolean j;
    private static Boolean k;

    public static boolean a() {
        int i2 = hxz.b;
        return "user".equals(Build.TYPE);
    }

    public static boolean b(Context context) {
        if (f == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            f = Boolean.valueOf(z);
        }
        return f.booleanValue();
    }

    public static boolean c(Context context) {
        if (h == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            h = Boolean.valueOf(z);
        }
        return h.booleanValue();
    }

    public static boolean d(Context context) {
        ActivityManager activityManager;
        int i2 = Build.VERSION.SDK_INT;
        if (g == null && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
            g = Boolean.valueOf(activityManager.isLowRamDevice());
        }
        return ius.a(g, Boolean.TRUE);
    }

    public static boolean e(Context context) {
        if (i == null) {
            i = Boolean.valueOf(context.getPackageManager().hasSystemFeature("org.chromium.arc"));
        }
        return i.booleanValue();
    }

    public static boolean f(Context context) {
        if (a == null) {
            a = Boolean.valueOf(context.getPackageManager().hasSystemFeature("com.google.android.feature.PIXEL_EXPERIENCE"));
        }
        return a.booleanValue();
    }

    public static void g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (j == null) {
            boolean z = false;
            if (jkr.e() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            j = Boolean.valueOf(z);
        }
        j.booleanValue();
    }

    public static void h(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (k == null) {
            boolean z = true;
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback")) {
                z = false;
            }
            k = Boolean.valueOf(z);
        }
        k.booleanValue();
    }

    public static void i(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (d == null) {
            int i2 = Build.VERSION.SDK_INT;
            d = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        d.booleanValue();
    }

    public static void j(Context context) {
        i(context);
    }

    public static boolean a(Context context) {
        if (e == null) {
            int i2 = Build.VERSION.SDK_INT;
            e = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return e.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (c.booleanValue() == false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.res.Resources r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x0047
            java.lang.Boolean r1 = b
            if (r1 != 0) goto L_0x0040
            android.content.res.Configuration r1 = r4.getConfiguration()
            int r1 = r1.screenLayout
            r1 = r1 & 15
            r2 = 3
            r3 = 1
            if (r1 > r2) goto L_0x0039
            java.lang.Boolean r1 = c
            if (r1 != 0) goto L_0x0030
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r1 = r4.screenLayout
            r1 = r1 & 15
            if (r1 > r2) goto L_0x0029
            int r4 = r4.smallestScreenWidthDp
            r1 = 600(0x258, float:8.41E-43)
            if (r4 < r1) goto L_0x0029
            r4 = 1
            goto L_0x002a
        L_0x0029:
            r4 = 0
        L_0x002a:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            c = r4
        L_0x0030:
            java.lang.Boolean r4 = c
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            b = r4
        L_0x0040:
            java.lang.Boolean r4 = b
            boolean r4 = r4.booleanValue()
            return r4
        L_0x0047:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jix.a(android.content.res.Resources):boolean");
    }
}
