package defpackage;

import android.os.Build;
import android.util.Log;

/* renamed from: jkr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jkr {
    private static Boolean a;

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 22;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 25;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 27;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean i() {
        boolean z = false;
        if (!h()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        if (!mm.b() && ((!Build.VERSION.CODENAME.equals("REL") || Build.VERSION.SDK_INT < 30) && (Build.VERSION.CODENAME.length() != 1 || Build.VERSION.CODENAME.charAt(0) < 'R' || Build.VERSION.CODENAME.charAt(0) > 'Z'))) {
            return false;
        }
        Boolean bool = a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            if ("google".equals(Build.BRAND) && Integer.parseInt(Build.VERSION.INCREMENTAL) >= 6283131) {
                z = true;
            }
            a = Boolean.valueOf(z);
        } catch (NumberFormatException e) {
            a = true;
        }
        if (!a.booleanValue()) {
            Log.w("PlatformVersion", "Build version must be at least 5954562 to support R in gmscore");
        }
        return a.booleanValue();
    }
}
