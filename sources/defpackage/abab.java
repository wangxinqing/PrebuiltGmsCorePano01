package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: abab  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abab {
    public static synchronized void a(Context context, String str, String str2, boolean z) {
        synchronized (abab.class) {
            iva.a((Object) context);
            iva.a((Object) str);
            iva.a((Object) str2);
            SharedPreferences.Editor edit = context.getSharedPreferences("games.sign_in_cache", 0).edit();
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 9 + String.valueOf(str).length());
            sb.append(str2);
            sb.append(",");
            sb.append(str);
            sb.append("_greeted");
            edit.putBoolean(sb.toString(), z);
            edit.apply();
        }
    }
}
