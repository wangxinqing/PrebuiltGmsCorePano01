package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: mch  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mch {
    public static ivk a(Context context, String str) {
        return new ivk(context, String.valueOf(str).concat(".AppInviteReferral"), true);
    }

    public static int b(String str, Context context, String str2) {
        return a(context, str2).getInt(str, 0);
    }

    public static void c(String str, Context context, String str2) {
        SharedPreferences.Editor edit = a(context, str2).edit();
        edit.putBoolean(str, true);
        edit.commit();
    }

    public static String a(String str, Context context, String str2) {
        return a(context, str2).getString(str, (String) null);
    }

    public static void b(Context context, String str) {
        c("scionInstallEvent", context, str);
    }

    public static boolean a(String str, boolean z, Context context, String str2) {
        return a(context, str2).getBoolean(str, z);
    }
}
