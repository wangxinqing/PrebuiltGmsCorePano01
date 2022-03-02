package defpackage;

import android.content.Context;
import android.provider.ContactsContract;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wwy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wwy {
    private static final Map a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(1, "home");
        hashMap.put(3, "other");
        hashMap.put(2, "work");
        hashMap.put(0, "custom");
        a = Collections.unmodifiableMap(hashMap);
    }

    public static final String b(wwj wwj) {
        return wwj.a(3);
    }

    public static final String c(wwj wwj) {
        return wwj.a(4);
    }

    public static final String d(wwj wwj) {
        return wwj.a(6);
    }

    public static final String e(wwj wwj) {
        return wwj.a(7);
    }

    public static final String f(wwj wwj) {
        return wwj.a(8);
    }

    public static final String g(wwj wwj) {
        String a2 = wwj.a(9);
        if (a2 == null || !TextUtils.isDigitsOnly(a2)) {
            return a2;
        }
        return null;
    }

    public static final String h(wwj wwj) {
        String a2 = wwj.a(9);
        if (a2 == null || !TextUtils.isDigitsOnly(a2)) {
            return null;
        }
        return a2;
    }

    public static String a(Context context, wwj wwj) {
        Integer a2 = wxh.a(wwj, 1);
        if (a2 != null) {
            return ContactsContract.CommonDataKinds.StructuredPostal.getTypeLabel(context.getResources(), a2.intValue(), wwj.a(2)).toString();
        }
        return null;
    }

    public static String a(wwj wwj) {
        Integer a2 = wxh.a(wwj, 1);
        if (a2 != null && a.containsKey(a2)) {
            return (String) a.get(a2);
        }
        xdt.a("ContactData", "Invalid StructuredPostal Type: %d", a2);
        return null;
    }
}
