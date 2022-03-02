package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;

/* renamed from: wsb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wsb extends wru {
    public final /* bridge */ /* synthetic */ amgl a(Object obj) {
        amgl amgl = ((amfw) obj).b;
        return amgl == null ? amgl.h : amgl;
    }

    public final /* bridge */ /* synthetic */ ContentValues a(Object obj, boolean z) {
        amfw amfw = (amfw) obj;
        if (TextUtils.isEmpty(amfw.c)) {
            return null;
        }
        String str = amfw.c;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.com.google.cursor.item/contact_hobby");
        wso.a(contentValues, "data1", str);
        return contentValues;
    }

    public final /* bridge */ /* synthetic */ Object a(ContentValues contentValues, String str) {
        String asString = contentValues.getAsString("data1");
        aucd o = amfw.d.o();
        if (asString != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amfw amfw = (amfw) o.b;
            asString.getClass();
            amfw.a |= 2;
            amfw.c = asString;
        }
        amgl f = wsn.f(str);
        if (o.c) {
            o.c();
            o.c = false;
        }
        amfw amfw2 = (amfw) o.b;
        f.getClass();
        amfw2.b = f;
        amfw2.a |= 1;
        return (amfw) o.i();
    }
}
