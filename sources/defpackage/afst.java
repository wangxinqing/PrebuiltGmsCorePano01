package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.io.IOException;

/* renamed from: afst  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afst {
    public static SharedPreferences a(Context context, String str, amri amri) {
        if (amri != null && amri.a()) {
            String valueOf = String.valueOf((String) amri.b());
            str = valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
        }
        return context.getSharedPreferences(str, 0);
    }

    public static audx a(SharedPreferences sharedPreferences, String str, auef auef) {
        String string = sharedPreferences.getString(str, (String) null);
        if (string != null) {
            try {
                return a(string, auef);
            } catch (auda e) {
            }
        }
        return null;
    }

    public static audx a(String str, auef auef) {
        try {
            return (audx) auef.b(Base64.decode(str, 3), aubs.b());
        } catch (IllegalArgumentException e) {
            throw new auda("Unable to decode to byte array", new IOException(e));
        }
    }

    public static String a(audx audx) {
        return Base64.encodeToString(audx.k(), 3);
    }

    public static void a(SharedPreferences.Editor editor, String str) {
        editor.remove(str);
    }

    public static void a(SharedPreferences.Editor editor, String str, audx audx) {
        editor.putString(str, a(audx));
    }

    public static boolean a(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.edit().remove(str).commit();
    }

    public static boolean a(SharedPreferences sharedPreferences, String str, audx audx) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        a(edit, str, audx);
        return edit.commit();
    }
}
