package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.DatabaseUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: xyo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xyo extends xyl {
    public static final anax e = anax.a("vnd.android.cursor.item/email_v2", "vnd.android.cursor.item/contact_event", "vnd.android.cursor.item/group_membership", "vnd.android.cursor.item/identity", "vnd.android.cursor.item/im", "vnd.android.cursor.item/nickname", "vnd.android.cursor.item/note", "vnd.android.cursor.item/organization", "vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/photo", "vnd.android.cursor.item/relation", "vnd.android.cursor.item/sip_address", "vnd.android.cursor.item/postal-address_v2", "vnd.android.cursor.item/website", "vnd.android.cursor.item/name", "vnd.com.google.cursor.item/contact_calendar_link", "vnd.com.google.cursor.item/contact_extended_property", "vnd.com.google.cursor.item/contact_external_id", "vnd.com.google.cursor.item/contact_hobby", "vnd.com.google.cursor.item/contact_jot", "vnd.com.google.cursor.item/contact_language", "vnd.com.google.cursor.item/contact_misc", "vnd.com.google.cursor.item/contact_user_defined_field", "vnd.com.google.cursor.item/contact_file_as");

    public xyo(ContentResolver contentResolver, Account account, xvp xvp) {
        super(contentResolver, account, xvp);
    }

    public static boolean a(xvs xvs) {
        List list = xvs.s;
        if (list != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                ContentValues contentValues = (ContentValues) list.get(i);
                contentValues.toString();
                i++;
                if (contentValues.getAsString("group_sourceid") == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(List list, yaq yaq) {
        yad yad;
        list.size();
        this.c.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        iva.a((Object) linkedHashMap);
        iva.b(linkedHashMap.isEmpty());
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        int i = 1;
        int i2 = 0;
        boolean z = true;
        while (i2 < size) {
            yaq yaq2 = yaq;
            xvs xvs = (xvs) list.get(i2);
            if (xvs != null) {
                if (!z) {
                    sb.append(",");
                }
                String str = xvs.a;
                linkedHashMap.put(str, xvs);
                DatabaseUtils.appendEscapedSQLString(sb, str);
                z = false;
            }
            i2++;
            i = 1;
        }
        char c = 2;
        Object[] objArr = new Object[2];
        objArr[0] = "sourceid" + " in (" + sb + ") OR (sync2 in (" + sb + ") AND sourceid IS NULL)";
        objArr[i] = "data_set IS NULL AND sourceid IS NULL AND sync3 IS NOT NULL";
        String format = String.format("(%s) OR (%s)", objArr);
        ContentResolver contentResolver = this.a;
        Account account = this.b;
        anax anax = e;
        String[] strArr = xvw.a;
        xvz a = xvz.a(contentResolver, account, anax, format, (String[]) null);
        try {
            List<xvs> e2 = a.e();
            xip.a();
            if (((Boolean) xfy.a.a()).booleanValue()) {
                a.f();
            }
            linkedHashMap.size();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (xvs xvs2 : e2) {
                String str2 = xvs2.a;
                if (str2 == null) {
                    String str3 = xvs2.c;
                    if (str3 != null) {
                        hashMap.put(str3, xvs2);
                    }
                } else {
                    hashMap.put(str2, xvs2);
                }
            }
            for (String str4 : linkedHashMap.keySet()) {
                this.c.a();
                xvs xvs3 = (xvs) linkedHashMap.get(str4);
                if (xvs3 != null) {
                    if (hashMap.containsKey(str4)) {
                        yad = new yad(xvs3, (xvs) hashMap.get(str4));
                    } else {
                        HashSet hashSet = new HashSet();
                        List[] listArr = new List[4];
                        listArr[0] = xvs3.y;
                        listArr[i] = xvs3.C;
                        listArr[c] = xvs3.n;
                        listArr[3] = xvs3.E;
                        ArrayList arrayList = new ArrayList(Arrays.asList(listArr));
                        int size2 = arrayList.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            yaq yaq3 = yaq;
                            List<ContentValues> list2 = (List) arrayList.get(i3);
                            if (list2 != null) {
                                for (ContentValues asString : list2) {
                                    hashSet.add(asString.getAsString("data1"));
                                }
                            }
                            i3++;
                            c = 2;
                            i = 1;
                        }
                        Object[] objArr2 = new Object[i];
                        objArr2[0] = hashSet;
                        Integer valueOf = Integer.valueOf(Arrays.hashCode(objArr2));
                        yad = hashMap2.containsKey(valueOf) ? new yad(xvs3, (xvs) hashMap2.remove(valueOf)) : new yad(xvs3);
                    }
                    yaq.a((Object) yad);
                } else {
                    yaq yaq4 = yaq;
                    c = 2;
                    i = 1;
                }
            }
            e2.size();
        } catch (Throwable th) {
            Throwable th2 = th;
            xip.a();
            if (((Boolean) xfy.a.a()).booleanValue()) {
                a.f();
            }
            throw th2;
        }
    }
}
