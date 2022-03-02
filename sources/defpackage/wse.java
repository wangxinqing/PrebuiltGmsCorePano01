package defpackage;

import android.content.ContentValues;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: wse  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wse extends wru {
    public final /* bridge */ /* synthetic */ amgl a(Object obj) {
        amgl amgl = ((amfz) obj).b;
        return amgl == null ? amgl.h : amgl;
    }

    public final /* bridge */ /* synthetic */ ContentValues a(Object obj, boolean z) {
        amfz amfz = (amfz) obj;
        String str = amfz.h;
        String str2 = amfz.e;
        String str3 = amfz.g;
        String str4 = amfz.f;
        String str5 = amfz.i;
        String str6 = amfz.c;
        String str7 = amfz.k;
        String str8 = amfz.m;
        String str9 = amfz.l;
        String str10 = amfz.j;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/name");
        wso.a(contentValues, "data4", str);
        wso.a(contentValues, "data2", str2);
        wso.a(contentValues, "data5", str3);
        wso.a(contentValues, "data3", str4);
        wso.a(contentValues, "data6", str5);
        wso.a(contentValues, "data1", str6);
        if (ycm.b(str7, str8, str9)) {
            wso.a(contentValues, "data7", str10);
            contentValues.putNull("data8");
            contentValues.putNull("data9");
        } else {
            wso.a(contentValues, "data7", str7);
            wso.a(contentValues, "data8", str8);
            wso.a(contentValues, "data9", str9);
        }
        return contentValues;
    }

    public final /* bridge */ /* synthetic */ Object a(ContentValues contentValues, String str) {
        String asString = contentValues.getAsString("data4");
        String asString2 = contentValues.getAsString("data2");
        String asString3 = contentValues.getAsString("data5");
        String asString4 = contentValues.getAsString("data3");
        String asString5 = contentValues.getAsString("data6");
        String asString6 = contentValues.getAsString("data1");
        String asString7 = contentValues.getAsString("data7");
        String asString8 = contentValues.getAsString("data8");
        String asString9 = contentValues.getAsString("data9");
        aucd o = amfz.o.o();
        if (asString != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amfz amfz = (amfz) o.b;
            asString.getClass();
            amfz.a |= 128;
            amfz.h = asString;
        }
        if (asString2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amfz amfz2 = (amfz) o.b;
            asString2.getClass();
            amfz2.a |= 16;
            amfz2.e = asString2;
        }
        if (asString3 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amfz amfz3 = (amfz) o.b;
            asString3.getClass();
            amfz3.a |= 64;
            amfz3.g = asString3;
        }
        if (asString4 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amfz amfz4 = (amfz) o.b;
            asString4.getClass();
            amfz4.a |= 32;
            amfz4.f = asString4;
        }
        if (asString5 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amfz amfz5 = (amfz) o.b;
            asString5.getClass();
            amfz5.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            amfz5.i = asString5;
        }
        if (asString6 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amfz amfz6 = (amfz) o.b;
            asString6.getClass();
            amfz6.a |= 2;
            amfz6.c = asString6;
        }
        if (asString7 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amfz amfz7 = (amfz) o.b;
            asString7.getClass();
            amfz7.a |= 1024;
            amfz7.k = asString7;
        }
        if (asString8 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amfz amfz8 = (amfz) o.b;
            asString8.getClass();
            amfz8.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
            amfz8.m = asString8;
        }
        if (asString9 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amfz amfz9 = (amfz) o.b;
            asString9.getClass();
            amfz9.a |= 2048;
            amfz9.l = asString9;
        }
        amgl f = wsn.f(str);
        if (o.c) {
            o.c();
            o.c = false;
        }
        amfz amfz10 = (amfz) o.b;
        f.getClass();
        amfz10.b = f;
        amfz10.a |= 1;
        return (amfz) o.i();
    }
}
