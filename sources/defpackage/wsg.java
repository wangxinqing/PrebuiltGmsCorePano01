package defpackage;

import android.content.ContentValues;
import com.google.android.chimera.FragmentTransaction;
import java.util.Map;

/* renamed from: wsg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wsg extends wru {
    private static final anaf a;
    private static final Map b;

    static {
        anaf a2 = anaf.a("work", 1, "other", 2);
        a = a2;
        b = wsn.a((Map) a2);
    }

    public final /* bridge */ /* synthetic */ amgl a(Object obj) {
        amgl amgl = ((amgg) obj).b;
        return amgl == null ? amgl.h : amgl;
    }

    public final /* bridge */ /* synthetic */ ContentValues a(Object obj, boolean z) {
        amgg amgg = (amgg) obj;
        int a2 = amgf.a(amgg.i);
        String str = null;
        if (a2 != 0 && a2 == 2) {
            str = "work";
        } else {
            int a3 = amgf.a(amgg.i);
            if (a3 != 0 && a3 == 3) {
                str = "school";
            }
        }
        wrv a4 = wsn.a(str, (Map) a, (Integer) 0);
        int intValue = a4.a.intValue();
        String str2 = amgg.c;
        String str3 = amgg.e;
        String str4 = amgg.d;
        String str5 = amgg.h;
        String str6 = amgg.f;
        String str7 = amgg.g;
        String str8 = a4.b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/organization");
        contentValues.put("is_primary", Integer.valueOf(z ? 1 : 0));
        wso.a(contentValues, "data1", str2);
        wso.a(contentValues, "data4", str3);
        wso.a(contentValues, "data5", str4);
        wso.a(contentValues, "data6", str5);
        wso.a(contentValues, "data7", str6);
        wso.a(contentValues, "data8", str7);
        wso.a(contentValues, "data2", "data3", intValue, str8, 0);
        return contentValues;
    }

    public final /* bridge */ /* synthetic */ Object a(ContentValues contentValues, String str) {
        String a2 = wsn.a(wsn.a(contentValues, "data2"), contentValues.getAsString("data3"), b, (Integer) 0);
        String asString = contentValues.getAsString("data1");
        String asString2 = contentValues.getAsString("data4");
        String asString3 = contentValues.getAsString("data5");
        String asString4 = contentValues.getAsString("data6");
        String asString5 = contentValues.getAsString("data7");
        String asString6 = contentValues.getAsString("data8");
        boolean a3 = wsn.a(contentValues);
        aucd o = amgg.j.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        amgg amgg = (amgg) o.b;
        amgg.i = 0;
        amgg.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
        if (a2 != null) {
            if (a2.equals("work")) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                amgg amgg2 = (amgg) o.b;
                amgg2.i = 1;
                amgg2.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
            } else if (a2.equals("school")) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                amgg amgg3 = (amgg) o.b;
                amgg3.i = 2;
                amgg3.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
            }
        }
        if (asString != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amgg amgg4 = (amgg) o.b;
            asString.getClass();
            amgg4.a = 2 | amgg4.a;
            amgg4.c = asString;
        }
        if (asString2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amgg amgg5 = (amgg) o.b;
            asString2.getClass();
            amgg5.a |= 8;
            amgg5.e = asString2;
        }
        if (asString3 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amgg amgg6 = (amgg) o.b;
            asString3.getClass();
            amgg6.a |= 4;
            amgg6.d = asString3;
        }
        if (asString4 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amgg amgg7 = (amgg) o.b;
            asString4.getClass();
            amgg7.a |= 128;
            amgg7.h = asString4;
        }
        if (asString5 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amgg amgg8 = (amgg) o.b;
            asString5.getClass();
            amgg8.a |= 16;
            amgg8.f = asString5;
        }
        if (asString6 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amgg amgg9 = (amgg) o.b;
            asString6.getClass();
            amgg9.a |= 32;
            amgg9.g = asString6;
        }
        amgl a4 = wsn.a(str, a3);
        if (o.c) {
            o.c();
            o.c = false;
        }
        amgg amgg10 = (amgg) o.b;
        a4.getClass();
        amgg10.b = a4;
        amgg10.a |= 1;
        return (amgg) o.i();
    }
}
