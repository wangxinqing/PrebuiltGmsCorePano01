package defpackage;

import android.content.ContentValues;

/* renamed from: wrz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wrz extends wru {
    public final /* bridge */ /* synthetic */ amgl a(Object obj) {
        amgl amgl = ((amfs) obj).b;
        return amgl == null ? amgl.h : amgl;
    }

    public final /* bridge */ /* synthetic */ ContentValues a(Object obj, boolean z) {
        String str = ((amfs) obj).c;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.com.google.cursor.item/contact_file_as");
        wso.a(contentValues, "data1", str);
        return contentValues;
    }

    public final /* bridge */ /* synthetic */ Object a(ContentValues contentValues, String str) {
        String asString = contentValues.getAsString("data1");
        aucd o = amfs.d.o();
        if (asString != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amfs amfs = (amfs) o.b;
            asString.getClass();
            amfs.a |= 2;
            amfs.c = asString;
        }
        amgl f = wsn.f(str);
        if (o.c) {
            o.c();
            o.c = false;
        }
        amfs amfs2 = (amfs) o.b;
        f.getClass();
        amfs2.b = f;
        amfs2.a |= 1;
        return (amfs) o.i();
    }
}
