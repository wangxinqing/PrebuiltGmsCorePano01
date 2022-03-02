package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: zyq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zyq {
    public static SharedPreferences a(Context context) {
        return context.getApplicationContext().getSharedPreferences("romanesco_gms_backup_and_restore_settings", 0);
    }

    public static boolean a(Context context, String str, boolean z) {
        if (jlj.a()) {
            zsf.a.d("SharedPreference being modified on main thread - setRestoreFromSettings()");
        }
        SharedPreferences.Editor edit = a(context).edit();
        String valueOf = String.valueOf(str);
        return edit.putBoolean(valueOf.length() == 0 ? new String("is_restore_from_settings__") : "is_restore_from_settings__".concat(valueOf), z).commit();
    }
}
