package defpackage;

import android.content.Context;
import android.provider.ContactsContract;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wxb {
    private static final Map a;
    private static final Map b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(1, "home");
        hashMap.put(3, "other");
        hashMap.put(2, "work");
        hashMap.put(0, "custom");
        a = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(0, "aim");
        hashMap2.put(-1, "custom");
        hashMap2.put(5, "googleTalk");
        hashMap2.put(6, "icq");
        hashMap2.put(7, "jabber");
        hashMap2.put(1, "msn");
        hashMap2.put(8, "netMeeting");
        hashMap2.put(4, "qq");
        hashMap2.put(3, "skype");
        hashMap2.put(2, "yahoo");
        b = Collections.unmodifiableMap(hashMap2);
    }

    public static String a(Context context, wwj wwj) {
        Integer a2 = wxh.a(wwj, 1);
        if (a2 != null) {
            return ContactsContract.CommonDataKinds.Im.getTypeLabel(context.getResources(), a2.intValue(), wwj.a(2)).toString();
        }
        return null;
    }

    public static String b(Context context, wwj wwj) {
        Integer a2 = wxh.a(wwj, 4);
        if (a2 != null) {
            return ContactsContract.CommonDataKinds.Im.getProtocolLabel(context.getResources(), a2.intValue(), wwj.a(5)).toString();
        }
        return null;
    }

    public static String c(wwj wwj) {
        Integer a2 = wxh.a(wwj, 4);
        if (a2 != null && b.containsKey(a2)) {
            return (String) b.get(a2);
        }
        xdt.a("ContactData", "Invalid IM Protocol: %d", a2);
        return null;
    }

    public static String a(wwj wwj) {
        return wwj.a(0);
    }

    public static String b(wwj wwj) {
        Integer a2 = wxh.a(wwj, 1);
        if (a2 != null && a.containsKey(a2)) {
            return (String) a.get(a2);
        }
        xdt.a("ContactData", "Invalid IM Type: %d", a2);
        return null;
    }
}
