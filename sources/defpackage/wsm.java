package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: wsm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wsm extends wru {
    private static final anaf a;
    private static final Map b;

    static {
        anab h = anaf.h();
        h.a("home", 4);
        h.a("work", 5);
        h.a("blog", 2);
        h.a("profile", 3);
        h.a("homePage", 1);
        h.a("ftp", 6);
        h.a("other", 7);
        anaf a2 = h.a();
        a = a2;
        b = wsn.a((Map) a2);
    }

    public final /* bridge */ /* synthetic */ amgl a(Object obj) {
        amgl amgl = ((amgw) obj).b;
        return amgl == null ? amgl.h : amgl;
    }

    public final /* bridge */ /* synthetic */ ContentValues a(Object obj, boolean z) {
        amgw amgw = (amgw) obj;
        wrv a2 = wsn.a(amgw.d, (Map) a, (Integer) 0);
        String str = amgw.c;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int intValue = a2.a.intValue();
        String str2 = a2.b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/website");
        contentValues.put("is_primary", Integer.valueOf(z ? 1 : 0));
        wso.a(contentValues, "data1", str);
        wso.a(contentValues, "data2", "data3", intValue, str2, 0);
        return contentValues;
    }

    public final /* bridge */ /* synthetic */ Object a(ContentValues contentValues, String str) {
        String asString = contentValues.getAsString("data1");
        if (TextUtils.isEmpty(asString)) {
            return null;
        }
        String a2 = wsn.a(wsn.a(contentValues, "data2"), contentValues.getAsString("data3"), b, (Integer) 0);
        boolean a3 = wsn.a(contentValues);
        aucd o = amgw.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        amgw amgw = (amgw) o.b;
        asString.getClass();
        int i = amgw.a | 2;
        amgw.a = i;
        amgw.c = asString;
        if (a2 != null) {
            a2.getClass();
            amgw.a = i | 4;
            amgw.d = a2;
        }
        amgl a4 = wsn.a(str, a3);
        if (o.c) {
            o.c();
            o.c = false;
        }
        amgw amgw2 = (amgw) o.b;
        a4.getClass();
        amgw2.b = a4;
        amgw2.a |= 1;
        return (amgw) o.i();
    }
}
