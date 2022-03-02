package defpackage;

import android.content.ContentUris;
import android.content.ContentValues;
import android.provider.ContactsContract;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: poe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class poe {
    public final aplf a;

    public poe(aplf aplf) {
        this.a = aplf;
    }

    public static String a(long j) {
        return ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, j).toString();
    }

    /* access modifiers changed from: package-private */
    public final void a(pms pms) {
        List list;
        List list2;
        pms pms2 = pms;
        aplf aplf = this.a;
        aplu[] apluArr = new aplu[1];
        aply d = aplz.d();
        d.b(a(pms2.a.getAsLong("contact_id").longValue()));
        d.c(pms2.a.getAsString("display_name"));
        d.a("identifier", pms2.a.getAsString("lookup_key"));
        ArrayList arrayList = new ArrayList();
        String asString = pms2.a.getAsString("nickname");
        if (!TextUtils.isEmpty(asString)) {
            arrayList.add(asString);
        }
        String asString2 = pms2.a.getAsString("phonetic_name");
        if (!TextUtils.isEmpty(asString2)) {
            arrayList.add(asString2);
        }
        d.a("additionalName", (String[]) arrayList.toArray(new String[0]));
        HashSet<String> hashSet = new HashSet<>();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        for (ContentValues contentValues : pms2.c.values()) {
            String asString3 = contentValues.getAsString("label");
            hashSet.add(asString3);
            List list3 = (List) hashMap2.get(asString3);
            if (list3 == null) {
                list2 = new ArrayList();
                hashMap2.put(asString3, list2);
            } else {
                list2 = list3;
            }
            list2.add(contentValues.getAsString("email"));
        }
        for (ContentValues contentValues2 : pms2.d.values()) {
            String asString4 = contentValues2.getAsString("label");
            hashSet.add(asString4);
            List list4 = (List) hashMap3.get(asString4);
            if (list4 == null) {
                list = new ArrayList();
                hashMap3.put(asString4, list);
            } else {
                list = list4;
            }
            list.add(contentValues2.getAsString("phone"));
        }
        for (ContentValues contentValues3 : pms2.e.values()) {
            String asString5 = contentValues3.getAsString("label");
            hashSet.add(asString5);
            List list5 = (List) hashMap.get(asString5);
            if (list5 == null) {
                list5 = new ArrayList();
                hashMap.put(asString5, list5);
            }
            list5.add(contentValues3.getAsString("postal"));
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : hashSet) {
            aply aply = new aply("ContactPoint");
            aply.c(str);
            List list6 = (List) hashMap.get(str);
            if (list6 != null) {
                aply.a("address", (String[]) list6.toArray(new String[0]));
            }
            List list7 = (List) hashMap2.get(str);
            if (list7 != null) {
                aply.a("email", (String[]) list7.toArray(new String[0]));
            }
            List list8 = (List) hashMap3.get(str);
            if (list8 != null) {
                aply.a("telephone", (String[]) list8.toArray(new String[0]));
            }
            arrayList2.add(aply);
        }
        d.a("contactPoint", (aply[]) arrayList2.toArray(new aply[0]));
        int size = arrayList.size();
        int size2 = arrayList2.size();
        aplt aplt = new aplt();
        aplt.b();
        aplt.a(size + 1 + size2);
        d.a(aplt);
        apluArr[0] = d.a();
        aplf.a(apluArr);
    }
}
