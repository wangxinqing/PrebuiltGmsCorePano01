package defpackage;

import android.content.Context;
import android.provider.Settings;

/* renamed from: elj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class elj {
    private static final iwd a = new iwd("FRP", "FrpUtil");

    public static boolean a(Context context) {
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "user_setup_complete") != 0) {
                return true;
            }
            return false;
        } catch (Settings.SettingNotFoundException e) {
            a.d("USER_SETUP_COMPLETE setting not found.", e, new Object[0]);
            return false;
        }
    }
}
