package defpackage;

import java.util.Map;

/* renamed from: iyt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iyt {
    public static void a(Map map, String str, String str2) {
        if (str != null) {
            map.put("Authorization", str.length() == 0 ? new String("OAuth ") : "OAuth ".concat(str));
        }
        if (str2 != null) {
            map.put("X-Goog-Spatula", str2);
        }
    }
}
