package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: yjb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yjb {
    public static ivk a(Context context) {
        return new ivk(context, "phonesky_recovery_shared_prefs", true, false);
    }

    public static long b(Context context) {
        return a(context).getLong("last_shown_timestamp_ms", -1);
    }

    public static void c(Context context) {
        SharedPreferences.Editor edit = a(context).edit();
        edit.clear();
        edit.apply();
    }
}
