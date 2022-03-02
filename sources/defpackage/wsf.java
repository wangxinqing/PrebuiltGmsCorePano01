package defpackage;

import android.content.ContentValues;

/* renamed from: wsf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wsf extends wru {
    public final /* bridge */ /* synthetic */ amgl a(Object obj) {
        amgl amgl = ((amgc) obj).b;
        return amgl == null ? amgl.h : amgl;
    }

    public final /* bridge */ /* synthetic */ ContentValues a(Object obj, boolean z) {
        amgc amgc = (amgc) obj;
        int a = amgb.a(amgc.d);
        if (a != 0 && a != 1) {
            return null;
        }
        String str = amgc.c;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/nickname");
        contentValues.put("data2", 1);
        wso.a(contentValues, "data1", str);
        return contentValues;
    }

    public final /* bridge */ /* synthetic */ Object a(ContentValues contentValues, String str) {
        String asString = contentValues.getAsString("data1");
        aucd o = amgc.e.o();
        if (asString != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amgc amgc = (amgc) o.b;
            asString.getClass();
            int i = amgc.a | 2;
            amgc.a = i;
            amgc.c = asString;
            amgc.d = 0;
            amgc.a = i | 4;
        }
        amgl f = wsn.f(str);
        if (o.c) {
            o.c();
            o.c = false;
        }
        amgc amgc2 = (amgc) o.b;
        f.getClass();
        amgc2.b = f;
        amgc2.a |= 1;
        return (amgc) o.i();
    }
}
