package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: gxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gxo {
    public static Map a(Map map, String str, boolean z, String str2) {
        if (z || str2 == null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        for (String valueOf : amsk.a(',').a((CharSequence) str2)) {
            String valueOf2 = String.valueOf(valueOf);
            String str3 = valueOf2.length() == 0 ? new String(str) : str.concat(valueOf2);
            if (map.containsKey(str3)) {
                hashMap.put(str3, (String) map.get(str3));
            }
        }
        return hashMap;
    }
}
