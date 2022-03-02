package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;

/* renamed from: wsd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wsd extends wru {
    public final /* bridge */ /* synthetic */ amgl a(Object obj) {
        amgl amgl = ((amfy) obj).d;
        return amgl == null ? amgl.h : amgl;
    }

    public final /* bridge */ /* synthetic */ ContentValues a(Object obj, boolean z) {
        String str;
        amfy amfy = (amfy) obj;
        if (amfy.b == 3) {
            str = (String) amfy.c;
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return wso.a(str);
    }

    public final /* bridge */ /* synthetic */ Object a(ContentValues contentValues, String str) {
        String asString = contentValues.getAsString("group_sourceid");
        aucd o = amfy.e.o();
        amgl f = wsn.f(str);
        if (o.c) {
            o.c();
            o.c = false;
        }
        amfy amfy = (amfy) o.b;
        f.getClass();
        amfy.d = f;
        amfy.a |= 1;
        if (asString != null) {
            asString.getClass();
            amfy.b = 3;
            amfy.c = asString;
        }
        return (amfy) o.i();
    }
}
