package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: wrs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wrs extends wru {
    private static final anaf a;
    private static final Map b;

    static {
        anaf a2 = anaf.a("home", 2, "work", 1, "freeBusy", 3);
        a = a2;
        b = wsn.a((Map) a2);
    }

    public final /* bridge */ /* synthetic */ amgl a(Object obj) {
        amgl amgl = ((amfb) obj).b;
        return amgl == null ? amgl.h : amgl;
    }

    public final /* bridge */ /* synthetic */ ContentValues a(Object obj, boolean z) {
        amfb amfb = (amfb) obj;
        wrv a2 = wsn.a(amfb.d, (Map) a, (Integer) 4);
        String str = amfb.c;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int intValue = a2.a.intValue();
        String str2 = a2.b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.com.google.cursor.item/contact_calendar_link");
        wso.a(contentValues, "data1", str);
        wso.a(contentValues, "data2", "data3", intValue, str2, 4);
        contentValues.put("data4", Integer.valueOf(z ? 1 : 0));
        return contentValues;
    }

    public final /* bridge */ /* synthetic */ Object a(ContentValues contentValues, String str) {
        boolean z;
        String a2 = wsn.a(wsn.a(contentValues, "data2"), contentValues.getAsString("data3"), b, (Integer) 4);
        String asString = contentValues.getAsString("data1");
        xip.a();
        if (((Boolean) xil.a.a()).booleanValue()) {
            Long asLong = contentValues.getAsLong("data4");
            if (asLong == null || asLong.longValue() <= 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = wsn.a(contentValues);
        }
        aucd o = amfb.e.o();
        if (asString != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amfb amfb = (amfb) o.b;
            asString.getClass();
            amfb.a |= 2;
            amfb.c = asString;
        }
        if (a2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amfb amfb2 = (amfb) o.b;
            a2.getClass();
            amfb2.a = 4 | amfb2.a;
            amfb2.d = a2;
        }
        amgl a3 = wsn.a(str, z);
        if (o.c) {
            o.c();
            o.c = false;
        }
        amfb amfb3 = (amfb) o.b;
        a3.getClass();
        amfb3.b = a3;
        amfb3.a |= 1;
        return (amfb) o.i();
    }
}
