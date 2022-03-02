package defpackage;

import android.content.Context;
import android.provider.ContactsContract;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wxe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wxe {
    private static final Map a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(19, "assistant");
        hashMap.put(8, "callback");
        hashMap.put(9, "car");
        hashMap.put(10, "mainCompany");
        hashMap.put(5, "homeFax");
        hashMap.put(4, "workFax");
        hashMap.put(1, "home");
        hashMap.put(11, "isdn");
        hashMap.put(12, "main");
        hashMap.put(20, "mms");
        hashMap.put(2, "mobile");
        hashMap.put(7, "other");
        hashMap.put(13, "otherFax");
        hashMap.put(6, "pager");
        hashMap.put(14, "radio");
        hashMap.put(15, "telex");
        hashMap.put(16, "ttytdd");
        hashMap.put(3, "work");
        hashMap.put(17, "workMobile");
        hashMap.put(18, "workPager");
        hashMap.put(0, "custom");
        a = Collections.unmodifiableMap(hashMap);
    }

    public static String a(Context context, wwj wwj) {
        Integer a2 = wxh.a(wwj, 1);
        if (a2 != null) {
            return ContactsContract.CommonDataKinds.Phone.getTypeLabel(context.getResources(), a2.intValue(), wwj.a(2)).toString();
        }
        return null;
    }

    public static String b(wwj wwj) {
        Integer a2 = wxh.a(wwj, 1);
        if (a2 != null && a.containsKey(a2)) {
            return (String) a.get(a2);
        }
        xdt.a("ContactData", "Invalid Phone Type: %d", a2);
        return null;
    }

    public static final String a(wwj wwj) {
        return wwj.a(0);
    }
}
