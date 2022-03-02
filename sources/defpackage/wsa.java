package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: wsa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wsa extends wru {
    private static final anaf a;
    private static final Map b;
    private static final anaf c;
    private static final Map d;

    static {
        anaf a2 = anaf.a("home", 1, "work", 2, "other", 3);
        a = a2;
        b = wsn.a((Map) a2);
        anab h = anaf.h();
        h.a("aim", 0);
        h.a("msn", 1);
        h.a("yahoo", 2);
        h.a("skype", 3);
        h.a("qq", 4);
        h.a("googleTalk", 5);
        h.a("icq", 6);
        h.a("jabber", 7);
        h.a("netMeeting", 8);
        anaf a3 = h.a();
        c = a3;
        d = wsn.a((Map) a3);
    }

    public final /* bridge */ /* synthetic */ amgl a(Object obj) {
        amgl amgl = ((amfv) obj).b;
        return amgl == null ? amgl.h : amgl;
    }

    public final /* bridge */ /* synthetic */ ContentValues a(Object obj, boolean z) {
        amfv amfv = (amfv) obj;
        wrv a2 = wsn.a(amfv.d, (Map) a, (Integer) 0);
        String str = amfv.e;
        Integer num = (Integer) c.get(str);
        String str2 = null;
        if (num != null) {
            str = null;
        } else if (!TextUtils.isEmpty(str)) {
            num = -1;
        } else {
            str = null;
        }
        int intValue = a2.a.intValue();
        String str3 = amfv.c;
        if (num != null) {
            str2 = num.toString();
        }
        String str4 = a2.b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/im");
        contentValues.put("is_primary", Integer.valueOf(z ? 1 : 0));
        wso.a(contentValues, "data1", str3);
        wso.a(contentValues, "data5", str2);
        wso.a(contentValues, "data6", str);
        wso.a(contentValues, "data2", "data3", intValue, str4, 0);
        return contentValues;
    }

    public final /* bridge */ /* synthetic */ Object a(ContentValues contentValues, String str) {
        String str2;
        String a2 = wsn.a(wsn.a(contentValues, "data2"), contentValues.getAsString("data3"), b, (Integer) 0);
        String asString = contentValues.getAsString("data1");
        Integer asInteger = contentValues.getAsInteger("data5");
        if (asInteger == null || asInteger.intValue() != -1) {
            str2 = (String) d.get(asInteger);
        } else {
            str2 = contentValues.getAsString("data6");
        }
        boolean a3 = wsn.a(contentValues);
        aucd o = amfv.f.o();
        if (a2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amfv amfv = (amfv) o.b;
            a2.getClass();
            amfv.a |= 4;
            amfv.d = a2;
        }
        if (asString != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amfv amfv2 = (amfv) o.b;
            asString.getClass();
            amfv2.a |= 2;
            amfv2.c = asString;
        }
        if (str2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amfv amfv3 = (amfv) o.b;
            str2.getClass();
            amfv3.a |= 16;
            amfv3.e = str2;
        }
        amgl a4 = wsn.a(str, a3);
        if (o.c) {
            o.c();
            o.c = false;
        }
        amfv amfv4 = (amfv) o.b;
        a4.getClass();
        amfv4.b = a4;
        amfv4.a |= 1;
        return (amfv) o.i();
    }
}
