package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: eau  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eau {
    public static ivk a(Context context, String str) {
        return new ivk(context, String.valueOf(str).concat(".AppInviteReferral"), true);
    }

    public static void b(Context context, String str) {
        SharedPreferences.Editor edit = a(context, str).edit();
        edit.clear();
        edit.commit();
    }

    private static int c(String str, Context context, String str2) {
        return a(context, str2).getInt(str, 0);
    }

    public static Long d(Context context, String str) {
        return Long.valueOf(a(context, str).getLong("creationTimestamp", 0));
    }

    public static boolean e(Context context, String str) {
        return a("isNewInstall", false, context, str);
    }

    public static boolean f(Context context, String str) {
        return a("isUpgradeInstall", false, context, str);
    }

    public static String g(Context context, String str) {
        return a("scionCampaign", context, str);
    }

    public static String h(Context context, String str) {
        return a("requestedLink", context, str);
    }

    public static int i(Context context, String str) {
        return c("requestedLinkType", context, str);
    }

    public static String j(Context context, String str) {
        return a("appCode", context, str);
    }

    public static String k(Context context, String str) {
        return a("domainUriPrefix", context, str);
    }

    public static String l(Context context, String str) {
        return a("sessionId", context, str);
    }

    public static int m(Context context, String str) {
        int a = anrq.a(c("invitationChannel", context, str));
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public static String a(String str, Context context, String str2) {
        return a(context, str2).getString(str, (String) null);
    }

    public static void b(String str, Context context, String str2) {
        SharedPreferences.Editor edit = a(context, str2).edit();
        edit.putBoolean(str, true);
        edit.commit();
    }

    public static boolean c(Context context, String str) {
        try {
            ivk a = a(context, str);
            if (!a.contains("Existence Indicator") || !"Existence Indicator".equalsIgnoreCase(a.getString("Existence Indicator", (String) null))) {
                return false;
            }
            return true;
        } catch (ivj e) {
            if (awhs.a.a().a()) {
                return false;
            }
            throw e;
        }
    }

    public static boolean a(String str, boolean z, Context context, String str2) {
        return a(context, str2).getBoolean(str, z);
    }
}
