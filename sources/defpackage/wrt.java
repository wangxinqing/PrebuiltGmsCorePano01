package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;

/* renamed from: wrt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wrt extends wru {
    public final /* bridge */ /* synthetic */ amgl a(Object obj) {
        amgl amgl = ((amfd) obj).b;
        return amgl == null ? amgl.h : amgl;
    }

    public final /* bridge */ /* synthetic */ ContentValues a(Object obj, boolean z) {
        String str = ((amfd) obj).c;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return wso.a(str);
    }

    public final /* bridge */ /* synthetic */ Object a(ContentValues contentValues, String str) {
        String asString = contentValues.getAsString("group_sourceid");
        aucd o = amfd.d.o();
        if (asString != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amfd amfd = (amfd) o.b;
            asString.getClass();
            amfd.a |= 2;
            amfd.c = asString;
        }
        amgl f = wsn.f(str);
        if (o.c) {
            o.c();
            o.c = false;
        }
        amfd amfd2 = (amfd) o.b;
        f.getClass();
        amfd2.b = f;
        amfd2.a |= 1;
        return (amfd) o.i();
    }
}
