package defpackage;

import android.content.ContentValues;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Map;

/* renamed from: wrq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wrq extends wru {
    private static final anaf a;
    private static final Map b;

    static {
        anaf a2 = anaf.a("home", 1, "work", 2, "other", 3);
        a = a2;
        b = wsn.a((Map) a2);
    }

    public final /* bridge */ /* synthetic */ amgl a(Object obj) {
        amgl amgl = ((amez) obj).b;
        return amgl == null ? amgl.h : amgl;
    }

    public final /* bridge */ /* synthetic */ ContentValues a(Object obj, boolean z) {
        amez amez = (amez) obj;
        wrv a2 = wsn.a(amez.c, (Map) a, (Integer) 0);
        int intValue = a2.a.intValue();
        String str = amez.f;
        String str2 = amez.e;
        String str3 = amez.g;
        String str4 = amez.h;
        String str5 = amez.i;
        String str6 = amez.k;
        String str7 = amez.j;
        String str8 = amez.d;
        String str9 = a2.b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/postal-address_v2");
        contentValues.put("is_primary", Integer.valueOf(z ? 1 : 0));
        wso.a(contentValues, "data4", str);
        wso.a(contentValues, "data5", str2);
        wso.a(contentValues, "data6", str3);
        wso.a(contentValues, "data7", str4);
        wso.a(contentValues, "data8", str5);
        wso.a(contentValues, "data10", str6);
        wso.a(contentValues, "data9", str7);
        wso.a(contentValues, "data1", str8);
        wso.a(contentValues, "data2", "data3", intValue, str9, 0);
        return contentValues;
    }

    public final /* bridge */ /* synthetic */ Object a(ContentValues contentValues, String str) {
        boolean z;
        String a2 = wsn.a(wsn.a(contentValues, "data2"), contentValues.getAsString("data3"), b, (Integer) 0);
        String asString = contentValues.getAsString("data4");
        String asString2 = contentValues.getAsString("data5");
        String asString3 = contentValues.getAsString("data6");
        String asString4 = contentValues.getAsString("data7");
        String asString5 = contentValues.getAsString("data8");
        String asString6 = contentValues.getAsString("data10");
        String asString7 = contentValues.getAsString("data9");
        String asString8 = contentValues.getAsString("data1");
        boolean a3 = wsn.a(contentValues);
        aucd o = amez.l.o();
        if (a2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amez amez = (amez) o.b;
            a2.getClass();
            amez.a |= 2;
            amez.c = a2;
        }
        if (asString2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amez amez2 = (amez) o.b;
            asString2.getClass();
            amez2.a |= 16;
            amez2.e = asString2;
            z = true;
        } else {
            z = false;
        }
        if (asString3 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amez amez3 = (amez) o.b;
            asString3.getClass();
            amez3.a |= 64;
            amez3.g = asString3;
            z = true;
        }
        if (asString4 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amez amez4 = (amez) o.b;
            asString4.getClass();
            amez4.a |= 128;
            amez4.h = asString4;
            z = true;
        }
        if (asString5 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amez amez5 = (amez) o.b;
            asString5.getClass();
            amez5.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            amez5.i = asString5;
            z = true;
        }
        if (asString6 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amez amez6 = (amez) o.b;
            asString6.getClass();
            amez6.a |= 1024;
            amez6.k = asString6;
            z = true;
        }
        if (asString7 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amez amez7 = (amez) o.b;
            asString7.getClass();
            amez7.a |= 512;
            amez7.j = asString7;
            z = true;
        }
        if (asString8 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amez amez8 = (amez) o.b;
            asString8.getClass();
            amez8.a |= 8;
            amez8.d = asString8;
        }
        if (asString != null && (z || !asString.equals(asString8))) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amez amez9 = (amez) o.b;
            asString.getClass();
            amez9.a |= 32;
            amez9.f = asString;
        }
        amgl a4 = wsn.a(str, a3);
        if (o.c) {
            o.c();
            o.c = false;
        }
        amez amez10 = (amez) o.b;
        a4.getClass();
        amez10.b = a4;
        amez10.a |= 1;
        return (amez) o.i();
    }
}
