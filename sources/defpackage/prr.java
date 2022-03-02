package defpackage;

import android.content.SharedPreferences;
import java.util.Map;

/* renamed from: prr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class prr {
    static void a(SharedPreferences sharedPreferences, Map map) {
        for (Map.Entry next : sharedPreferences.getAll().entrySet()) {
            String str = (String) next.getKey();
            if (str.startsWith("pkg-info-")) {
                map.put(str.substring(9), (out) plc.a((String) next.getValue(), (auef) out.n.c(7)));
            }
        }
    }

    public static boolean a(SharedPreferences.Editor editor, String str, out out) {
        String valueOf = String.valueOf(str);
        String str2 = valueOf.length() == 0 ? new String("pkg-info-") : "pkg-info-".concat(valueOf);
        String a = plc.a((audx) out);
        if (a.isEmpty()) {
            editor.remove(str2);
            return false;
        }
        editor.putString(str2, a);
        return true;
    }
}
