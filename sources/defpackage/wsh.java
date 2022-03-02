package defpackage;

import android.content.ContentValues;
import java.util.Map;

/* renamed from: wsh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wsh extends wru {
    private static final anaf a;
    private static final Map b;

    static {
        anab h = anaf.h();
        h.a("home", 1);
        h.a("work", 3);
        h.a("mobile", 2);
        h.a("homeFax", 5);
        h.a("workFax", 4);
        h.a("otherFax", 13);
        h.a("pager", 6);
        h.a("workMobile", 17);
        h.a("workPager", 18);
        h.a("main", 12);
        h.a("other", 7);
        anaf a2 = h.a();
        a = a2;
        b = wsn.a((Map) a2);
    }

    public final /* bridge */ /* synthetic */ amgl a(Object obj) {
        amgl amgl = ((amgo) obj).b;
        return amgl == null ? amgl.h : amgl;
    }

    public final /* bridge */ /* synthetic */ ContentValues a(Object obj, boolean z) {
        amgo amgo = (amgo) obj;
        wrv a2 = wsn.a(amgo.d, (Map) a, (Integer) 0);
        int intValue = a2.a.intValue();
        String str = amgo.c;
        String str2 = amgo.f;
        String str3 = a2.b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
        contentValues.put("is_primary", Integer.valueOf(z ? 1 : 0));
        wso.a(contentValues, "data1", str);
        wso.a(contentValues, "data4", str2);
        wso.a(contentValues, "data2", "data3", intValue, str3, 0);
        return contentValues;
    }

    public final /* bridge */ /* synthetic */ Object a(ContentValues contentValues, String str) {
        String a2 = wsn.a(wsn.a(contentValues, "data2"), contentValues.getAsString("data3"), b, (Integer) 0);
        String asString = contentValues.getAsString("data1");
        String asString2 = contentValues.getAsString("data4");
        boolean a3 = wsn.a(contentValues);
        aucd o = amgo.g.o();
        if (a2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amgo amgo = (amgo) o.b;
            a2.getClass();
            amgo.a |= 4;
            amgo.d = a2;
        }
        if (asString != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amgo amgo2 = (amgo) o.b;
            asString.getClass();
            amgo2.a |= 2;
            amgo2.c = asString;
        }
        if (asString2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amgo amgo3 = (amgo) o.b;
            asString2.getClass();
            amgo3.a |= 16;
            amgo3.f = asString2;
        }
        amgl a4 = wsn.a(str, a3);
        if (o.c) {
            o.c();
            o.c = false;
        }
        amgo amgo4 = (amgo) o.b;
        a4.getClass();
        amgo4.b = a4;
        amgo4.a |= 1;
        return (amgo) o.i();
    }
}
