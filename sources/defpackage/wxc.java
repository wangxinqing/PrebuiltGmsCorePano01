package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wxc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wxc {
    private static final Map a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(1, "default");
        hashMap.put(5, "initials");
        hashMap.put(3, "maidenName");
        hashMap.put(2, "otherName");
        hashMap.put(4, "shortName");
        hashMap.put(0, "custom");
        a = Collections.unmodifiableMap(hashMap);
    }

    public static final String a(wwj wwj) {
        return wwj.a(0);
    }

    public static String b(wwj wwj) {
        Integer a2 = wxh.a(wwj, 1);
        if (a2 != null && a.containsKey(a2)) {
            return (String) a.get(a2);
        }
        xdt.a("ContactData", "Invalid Nickname Type: %d", a2);
        return null;
    }
}
