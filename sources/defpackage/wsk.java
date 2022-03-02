package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: wsk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wsk extends wru {
    private static final anaf a;
    private static final Map b;

    static {
        anaf a2 = anaf.a("home", 1, "work", 2, "other", 3);
        a = a2;
        b = wsn.a((Map) a2);
    }

    public final /* bridge */ /* synthetic */ amgl a(Object obj) {
        amgl amgl = ((amgt) obj).b;
        return amgl == null ? amgl.h : amgl;
    }

    public final /* bridge */ /* synthetic */ ContentValues a(Object obj, boolean z) {
        amgt amgt = (amgt) obj;
        wrv a2 = wsn.a(amgt.d, (Map) a, (Integer) 0);
        String str = amgt.c;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int intValue = a2.a.intValue();
        String str2 = a2.b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/sip_address");
        contentValues.put("is_primary", Integer.valueOf(z ? 1 : 0));
        if (str != null && str.startsWith("sip:")) {
            str = str.substring(4);
        }
        wso.a(contentValues, "data1", str);
        wso.a(contentValues, "data2", "data3", intValue, str2, 0);
        return contentValues;
    }

    public final /* bridge */ /* synthetic */ Object a(ContentValues contentValues, String str) {
        String a2 = wsn.a(wsn.a(contentValues, "data2"), contentValues.getAsString("data3"), b, (Integer) 0);
        String asString = contentValues.getAsString("data1");
        boolean a3 = wsn.a(contentValues);
        aucd o = amgt.e.o();
        if (asString != null) {
            if (!asString.contains(":")) {
                asString = asString.length() == 0 ? new String("sip:") : "sip:".concat(asString);
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            amgt amgt = (amgt) o.b;
            asString.getClass();
            amgt.a |= 2;
            amgt.c = asString;
        }
        if (a2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amgt amgt2 = (amgt) o.b;
            a2.getClass();
            amgt2.a |= 4;
            amgt2.d = a2;
        }
        amgl a4 = wsn.a(str, a3);
        if (o.c) {
            o.c();
            o.c = false;
        }
        amgt amgt3 = (amgt) o.b;
        a4.getClass();
        amgt3.b = a4;
        amgt3.a |= 1;
        return (amgt) o.i();
    }
}
