package defpackage;

import android.content.ContentValues;
import java.util.Map;

/* renamed from: wsj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wsj extends wru {
    private static final anaf a;
    private static final Map b;

    static {
        anab h = anaf.h();
        h.a("spouse", 14);
        h.a("child", 3);
        h.a("mother", 8);
        h.a("father", 5);
        h.a("parent", 9);
        h.a("brother", 2);
        h.a("sister", 13);
        h.a("friend", 6);
        h.a("relative", 12);
        h.a("domesticPartner", 4);
        h.a("manager", 7);
        h.a("assistant", 1);
        h.a("referredBy", 11);
        h.a("partner", 10);
        anaf a2 = h.a();
        a = a2;
        b = wsn.a((Map) a2);
    }

    public final /* bridge */ /* synthetic */ amgl a(Object obj) {
        amgl amgl = ((amgs) obj).b;
        return amgl == null ? amgl.h : amgl;
    }

    public final /* bridge */ /* synthetic */ ContentValues a(Object obj, boolean z) {
        amgs amgs = (amgs) obj;
        wrv a2 = wsn.a(amgs.c, (Map) a, (Integer) 0);
        int intValue = a2.a.intValue();
        String str = amgs.d;
        String str2 = a2.b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/relation");
        wso.a(contentValues, "data1", str);
        wso.a(contentValues, "data2", "data3", intValue, str2, 0);
        return contentValues;
    }

    public final /* bridge */ /* synthetic */ Object a(ContentValues contentValues, String str) {
        String a2 = wsn.a(wsn.a(contentValues, "data2"), contentValues.getAsString("data3"), b, (Integer) 0);
        String asString = contentValues.getAsString("data1");
        aucd o = amgs.e.o();
        if (a2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amgs amgs = (amgs) o.b;
            a2.getClass();
            amgs.a |= 2;
            amgs.c = a2;
        }
        if (asString != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amgs amgs2 = (amgs) o.b;
            asString.getClass();
            amgs2.a |= 8;
            amgs2.d = asString;
        }
        amgl f = wsn.f(str);
        if (o.c) {
            o.c();
            o.c = false;
        }
        amgs amgs3 = (amgs) o.b;
        f.getClass();
        amgs3.b = f;
        amgs3.a |= 1;
        return (amgs) o.i();
    }
}
