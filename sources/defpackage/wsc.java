package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;

/* renamed from: wsc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wsc extends wru {
    public final /* bridge */ /* synthetic */ amgl a(Object obj) {
        amgl amgl = ((amfx) obj).b;
        return amgl == null ? amgl.h : amgl;
    }

    public final /* bridge */ /* synthetic */ ContentValues a(Object obj, boolean z) {
        amfx amfx = (amfx) obj;
        if (TextUtils.isEmpty(amfx.c)) {
            return null;
        }
        String str = amfx.c;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.com.google.cursor.item/contact_language");
        wso.a(contentValues, "data1", str);
        wso.a(contentValues, "data2", (String) null);
        return contentValues;
    }

    public final /* bridge */ /* synthetic */ Object a(ContentValues contentValues, String str) {
        String asString = contentValues.getAsString("data1");
        aucd o = amfx.d.o();
        if (asString != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amfx amfx = (amfx) o.b;
            asString.getClass();
            amfx.a |= 2;
            amfx.c = asString;
        }
        amgl f = wsn.f(str);
        if (o.c) {
            o.c();
            o.c = false;
        }
        amfx amfx2 = (amfx) o.b;
        f.getClass();
        amfx2.b = f;
        amfx2.a |= 1;
        return (amfx) o.i();
    }
}
