package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: zys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zys {
    public static SharedPreferences a(Context context) {
        return context.getApplicationContext().getSharedPreferences("people_contacts_restore_storage", 0);
    }

    public static String a(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("last_restore_time:") : "last_restore_time:".concat(valueOf);
    }

    static void a(Context context, String str, long j) {
        if (j >= 0) {
            a(context).edit().putLong(a(str), j).apply();
        }
    }
}
