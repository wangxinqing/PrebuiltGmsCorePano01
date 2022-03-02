package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wxd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wxd {
    private static final Map a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(2, "other");
        hashMap.put(1, "work");
        hashMap.put(0, "custom");
        a = Collections.unmodifiableMap(hashMap);
    }

    public static final String a(wwj wwj) {
        return wwj.a(0);
    }

    public static final String c(wwj wwj) {
        return wwj.a(3);
    }

    public static final String d(wwj wwj) {
        return wwj.a(4);
    }

    public static final String e(wwj wwj) {
        return wwj.a(5);
    }

    public static final String f(wwj wwj) {
        return wwj.a(6);
    }

    public static final String g(wwj wwj) {
        return wwj.a(7);
    }

    public static final String h(wwj wwj) {
        return wwj.a(8);
    }

    public static String b(wwj wwj) {
        Integer a2 = wxh.a(wwj, 1);
        if (a2 != null && a.containsKey(a2)) {
            return (String) a.get(a2);
        }
        xdt.a("ContactData", "Invalid Organization Type: %d", a2);
        return null;
    }
}
