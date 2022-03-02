package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: wry  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wry extends wru {
    private static final anaf a;
    private static final Map b;

    static {
        anaf a2 = anaf.a("account", 1, "customer", 2, "network", 3, "organization", 4);
        a = a2;
        b = wsn.a((Map) a2);
    }

    public final /* bridge */ /* synthetic */ amgl a(Object obj) {
        amgl amgl = ((amfo) obj).b;
        return amgl == null ? amgl.h : amgl;
    }

    public final /* bridge */ /* synthetic */ ContentValues a(Object obj, boolean z) {
        amfo amfo = (amfo) obj;
        wrv a2 = wsn.a(amfo.d, (Map) a, (Integer) 5);
        String str = amfo.c;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int intValue = a2.a.intValue();
        String str2 = a2.b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.com.google.cursor.item/contact_external_id");
        contentValues.put("data1", str);
        wso.a(contentValues, "data2", "data3", intValue, str2, 5);
        return contentValues;
    }

    public final /* bridge */ /* synthetic */ Object a(ContentValues contentValues, String str) {
        String a2 = wsn.a(wsn.a(contentValues, "data2"), contentValues.getAsString("data3"), b, (Integer) 5);
        String asString = contentValues.getAsString("data1");
        aucd o = amfo.e.o();
        if (asString != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amfo amfo = (amfo) o.b;
            asString.getClass();
            amfo.a |= 2;
            amfo.c = asString;
        }
        if (a2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amfo amfo2 = (amfo) o.b;
            a2.getClass();
            amfo2.a |= 4;
            amfo2.d = a2;
        }
        amgl f = wsn.f(str);
        if (o.c) {
            o.c();
            o.c = false;
        }
        amfo amfo3 = (amfo) o.b;
        f.getClass();
        amfo3.b = f;
        amfo3.a |= 1;
        return (amfo) o.i();
    }
}
