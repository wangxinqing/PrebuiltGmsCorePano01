package defpackage;

import android.content.Context;
import android.provider.ContactsContract;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wxf {
    private static final Map a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(1, "assistant");
        hashMap.put(2, "brother");
        hashMap.put(3, "child");
        hashMap.put(4, "domesticPartner");
        hashMap.put(5, "father");
        hashMap.put(6, "friend");
        hashMap.put(7, "manager");
        hashMap.put(8, "mother");
        hashMap.put(9, "parent");
        hashMap.put(10, "partner");
        hashMap.put(11, "referredBy");
        hashMap.put(12, "relative");
        hashMap.put(13, "sister");
        hashMap.put(14, "spouse");
        hashMap.put(0, "custom");
        a = Collections.unmodifiableMap(hashMap);
    }

    public static String a(Context context, wwj wwj) {
        Integer a2 = wxh.a(wwj, 1);
        if (a2 != null) {
            return ContactsContract.CommonDataKinds.Relation.getTypeLabel(context.getResources(), a2.intValue(), wwj.a(2)).toString();
        }
        return null;
    }

    public static String b(wwj wwj) {
        Integer a2 = wxh.a(wwj, 1);
        if (a2 != null && a.containsKey(a2)) {
            return (String) a.get(a2);
        }
        xdt.a("ContactData", "Invalid Relation Type: %d", a2);
        return null;
    }

    public static final String a(wwj wwj) {
        return wwj.a(0);
    }
}
