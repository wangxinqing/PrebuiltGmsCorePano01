package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;

/* renamed from: elm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class elm {
    private static final iwd a = new iwd("FRP", "SecureFrpUtil");

    static SharedPreferences a(Context context) {
        return context.getSharedPreferences("secure_frp_prefs", 0);
    }

    public static void b(Context context) {
        if (!elj.a(context) && !a(context).getBoolean("secure_frp_already_populated", false) && a(true, context)) {
            a(context).edit().putBoolean("secure_frp_already_populated", true).apply();
        }
    }

    public static boolean a(boolean z, Context context) {
        iva.a(!elj.a(context));
        boolean putInt = Settings.Secure.putInt(context.getContentResolver(), "secure_frp_mode", z ? 1 : 0);
        if (!putInt) {
            a.d("Could not write SECURE_FRP_MODE setting.", new Object[0]);
        } else {
            a.c("Secure FRP bit written", new Object[0]);
        }
        return putInt;
    }
}
