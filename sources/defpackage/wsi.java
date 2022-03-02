package defpackage;

import android.content.ContentValues;

/* renamed from: wsi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wsi extends wru {
    public final /* bridge */ /* synthetic */ amgl a(Object obj) {
        amgl amgl = ((amgp) obj).b;
        return amgl == null ? amgl.h : amgl;
    }

    public final /* bridge */ /* synthetic */ ContentValues a(Object obj, boolean z) {
        amgp amgp = (amgp) obj;
        String a = xwz.a(amgp.c, false);
        String str = amgp.e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/photo");
        wso.a(contentValues, "data_sync1", a);
        wso.a(contentValues, "data_sync2", str);
        return contentValues;
    }

    public final /* bridge */ /* synthetic */ Object a(ContentValues contentValues, String str) {
        String b = xwz.b(contentValues.getAsString("data_sync1"));
        String asString = contentValues.getAsString("data_sync2");
        aucd o = amgp.f.o();
        if (b != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amgp amgp = (amgp) o.b;
            b.getClass();
            amgp.a |= 2;
            amgp.c = b;
        }
        if (asString != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amgp amgp2 = (amgp) o.b;
            asString.getClass();
            amgp2.a |= 8;
            amgp2.e = asString;
        }
        amgl f = wsn.f(str);
        if (o.c) {
            o.c();
            o.c = false;
        }
        amgp amgp3 = (amgp) o.b;
        f.getClass();
        amgp3.b = f;
        amgp3.a |= 1;
        return (amgp) o.i();
    }
}
