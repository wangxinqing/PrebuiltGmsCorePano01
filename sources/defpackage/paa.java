package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;

/* renamed from: paa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class paa {
    public static audx a(SharedPreferences sharedPreferences, String str, auef auef) {
        if (!sharedPreferences.contains(str)) {
            return null;
        }
        try {
            return (audx) auef.a(Base64.decode(sharedPreferences.getString(str, (String) null), 3));
        } catch (auda e) {
            oso.a((Throwable) e, "Corrupted Message");
            return null;
        }
    }
}
