package defpackage;

import android.content.Context;
import android.provider.ContactsContract;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wwz {
    private static final Map a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(1, "home");
        hashMap.put(4, "mobile");
        hashMap.put(3, "other");
        hashMap.put(2, "work");
        hashMap.put(0, "custom");
        a = Collections.unmodifiableMap(hashMap);
    }

    public static String a(Context context, wwj wwj) {
        Integer a2 = wxh.a(wwj, 1);
        if (a2 != null) {
            return ContactsContract.CommonDataKinds.Email.getTypeLabel(context.getResources(), a2.intValue(), wwj.a(2)).toString();
        }
        return null;
    }

    public static String b(wwj wwj) {
        Integer a2 = wxh.a(wwj, 1);
        if (a2 != null && a.containsKey(a2)) {
            return (String) a.get(a2);
        }
        xdt.a("ContactData", "Invalid Email Type: %d", a2);
        return null;
    }

    public static final String a(wwj wwj) {
        return wwj.a(0);
    }
}
