package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: oxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oxo extends oxk {
    private final String[] a;

    public final oxj a(SQLiteDatabase sQLiteDatabase, ovw ovw, ozc ozc, oyb oyb) {
        HashSet hashSet;
        List<String> list;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        ovw ovw2 = ovw;
        String[] strArr = this.a;
        iva.a(sQLiteDatabase.inTransaction());
        String str = ozc.f;
        Set a2 = ovv.a(sQLiteDatabase2, str, oyb);
        if ("com.google.android.apps.messaging".equals(str) && axry.a.a().a()) {
            HashMap hashMap = new HashMap();
            hashMap.put("Message", new ovu(ovw.a(a2, "Message")));
            hashMap.put("Conversation", new ovu(ovw.a(a2, "Conversation")));
            hashMap.put("Person", new ovu(ovw.a(a2, "Person")));
            hashMap.put("DigitalDocument", new ovu(ovw.a(a2, "DigitalDocument")));
            hashMap.put("LocalBusiness", new ovu(ovw.a(a2, "LocalBusiness")));
            int length = strArr.length;
            int i = 0;
            loop0:
            while (true) {
                if (i < length) {
                    String str2 = strArr[i];
                    if (str2.startsWith("messages", 44)) {
                        list = Arrays.asList(new String[]{"Message"});
                    } else if (str2.startsWith("conversations", 44)) {
                        list = Arrays.asList(new String[]{"Conversation"});
                    } else if (str2.startsWith("participants", 44)) {
                        list = Arrays.asList(new String[]{"Person"});
                    } else if (str2.startsWith("annotations", 44)) {
                        list = Arrays.asList(new String[]{"LocalBusiness", "DigitalDocument"});
                    } else {
                        oso.b("Unknown url format from com.google.android.apps.messaging. Falling back to fanout");
                        list = Collections.emptyList();
                    }
                    if (list.isEmpty()) {
                        hashSet = null;
                        break;
                    }
                    for (String str3 : list) {
                        ovu ovu = (ovu) hashMap.get(str3);
                        if (ovu == null) {
                            hashSet = null;
                            break loop0;
                        }
                        if (ovu.b == null) {
                            ovu.b = new ArrayList();
                        }
                        ovu.b.add(str2);
                    }
                    i++;
                } else {
                    hashSet = new HashSet();
                    for (ovu ovu2 : hashMap.values()) {
                        List list2 = ovu2.b;
                        if (list2 != null) {
                            ovw2.a(sQLiteDatabase2, (String[]) list2.toArray(new String[0]), ovu2.a);
                            hashSet.addAll(ovu2.a);
                        }
                    }
                }
            }
            if (hashSet != null) {
                a2 = hashSet;
                return oxj.a(a2);
            }
        }
        ovw2.a(sQLiteDatabase2, strArr, a2);
        return oxj.a(a2);
    }

    public oxo(String[] strArr) {
        super(oxt.a(strArr), 5);
        this.a = strArr;
    }

    public final void a(osf osf, ozc ozc, owf owf) {
        for (String str : this.a) {
            aucd o = ora.c.o();
            aucd o2 = orc.c.o();
            String str2 = ozc.f;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            orc orc = (orc) o2.b;
            str2.getClass();
            orc.a = str2;
            str.getClass();
            orc.b = str;
            if (o.c) {
                o.c();
                o.c = false;
            }
            ora ora = (ora) o.b;
            orc orc2 = (orc) o2.i();
            orc2.getClass();
            ora.b = orc2;
            ora.a = 3;
            owf.a((ora) o.i());
        }
    }

    public final void a(ozc ozc, osf osf, oyb oyb) {
        String[] strArr = this.a;
        if (strArr != null) {
            int length = strArr.length;
            if (length <= 1000) {
                int i = 0;
                while (i < length) {
                    String str = strArr[i];
                    if (str != null) {
                        try {
                            oyn.a(str);
                            i++;
                        } catch (IllegalArgumentException e) {
                            throw new oxy(e.getMessage(), aolx.INVALID_ARGUMENT_URI);
                        }
                    } else {
                        throw new oxy("URL cannot be null.", aolx.INVALID_ARGUMENT_NULL);
                    }
                }
                return;
            }
            throw new oxy("Providing more than 1000 URLs in one remove call is not allowed.", aolx.INVALID_ARGUMENT_TOO_MANY);
        }
        throw new oxy("URLs cannot be null.", aolx.INVALID_ARGUMENT_NULL);
    }
}
