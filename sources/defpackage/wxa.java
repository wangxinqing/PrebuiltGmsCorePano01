package defpackage;

import android.content.Context;
import android.provider.ContactsContract;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wxa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wxa {
    private static final Map a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(1, "anniversary");
        hashMap.put(3, "birthday");
        hashMap.put(2, "other");
        hashMap.put(0, "custom");
        a = Collections.unmodifiableMap(hashMap);
    }

    public static final String a(Context context, wwj wwj) {
        Integer a2 = wxh.a(wwj, 1);
        if (a2 != null) {
            return context.getString(ContactsContract.CommonDataKinds.Event.getTypeResource(a2));
        }
        return null;
    }

    public static final String b(wwj wwj) {
        Integer a2 = wxh.a(wwj, 1);
        if (a2 != null && a.containsKey(a2)) {
            return (String) a.get(a2);
        }
        xdt.a("ContactData", "Invalid Event Type: %d", a2);
        return null;
    }

    public static final String a(wwj wwj) {
        return wwj.a(0);
    }
}
