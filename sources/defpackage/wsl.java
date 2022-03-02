package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;

/* renamed from: wsl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wsl extends wru {
    public final /* bridge */ /* synthetic */ amgl a(Object obj) {
        amgl amgl = ((amgv) obj).b;
        return amgl == null ? amgl.h : amgl;
    }

    public final /* bridge */ /* synthetic */ ContentValues a(Object obj, boolean z) {
        amgv amgv = (amgv) obj;
        if (amgv.d.isEmpty()) {
            return null;
        }
        String str = !amgv.c.isEmpty() ? amgv.c : "Custom";
        String str2 = amgv.d;
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.com.google.cursor.item/contact_user_defined_field");
        contentValues.put("data1", str);
        wso.a(contentValues, "data2", str2);
        return contentValues;
    }

    public final /* bridge */ /* synthetic */ Object a(ContentValues contentValues, String str) {
        String asString = contentValues.getAsString("data1");
        String asString2 = contentValues.getAsString("data2");
        aucd o = amgv.e.o();
        if (TextUtils.isEmpty(asString2)) {
            return null;
        }
        if (TextUtils.isEmpty(asString)) {
            asString = "Custom";
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        amgv amgv = (amgv) o.b;
        asString.getClass();
        int i = amgv.a | 2;
        amgv.a = i;
        amgv.c = asString;
        asString2.getClass();
        amgv.a = i | 4;
        amgv.d = asString2;
        amgl f = wsn.f(str);
        if (o.c) {
            o.c();
            o.c = false;
        }
        amgv amgv2 = (amgv) o.b;
        f.getClass();
        amgv2.b = f;
        amgv2.a |= 1;
        return (amgv) o.i();
    }
}
