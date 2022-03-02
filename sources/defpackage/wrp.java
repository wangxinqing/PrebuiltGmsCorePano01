package defpackage;

import android.content.ContentValues;

/* renamed from: wrp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wrp extends wru {
    public final /* bridge */ /* synthetic */ amgl a(Object obj) {
        amgl amgl = ((amey) obj).b;
        return amgl == null ? amgl.h : amgl;
    }

    public final /* bridge */ /* synthetic */ ContentValues a(Object obj, boolean z) {
        String str = ((amey) obj).c;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/note");
        wso.a(contentValues, "data1", str);
        return contentValues;
    }

    public final /* bridge */ /* synthetic */ Object a(ContentValues contentValues, String str) {
        String asString = contentValues.getAsString("data1");
        aucd o = amey.d.o();
        if (asString != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amey amey = (amey) o.b;
            asString.getClass();
            amey.a |= 4;
            amey.c = asString;
        }
        amgl f = wsn.f(str);
        if (o.c) {
            o.c();
            o.c = false;
        }
        amey amey2 = (amey) o.b;
        f.getClass();
        amey2.b = f;
        amey2.a |= 1;
        return (amey) o.i();
    }
}
