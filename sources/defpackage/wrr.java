package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;

/* renamed from: wrr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wrr extends wru {
    public final /* bridge */ /* synthetic */ amgl a(Object obj) {
        amgl amgl = ((amfa) obj).b;
        return amgl == null ? amgl.h : amgl;
    }

    public final /* bridge */ /* synthetic */ ContentValues a(Object obj, boolean z) {
        String str;
        amfa amfa = (amfa) obj;
        long j = amfa.c;
        if (j != 0 || amfa.d.isEmpty()) {
            str = wsn.b(j);
            if (wsn.a(str)) {
                str = wsn.d(str);
            }
        } else {
            str = amfa.d;
            wsn wsn = wsn.a;
            if (str == null) {
                str = null;
            } else if (str.matches("[0-2][0-9]/[0-3][0-9]")) {
                String valueOf = String.valueOf(str.replace('/', '-'));
                str = valueOf.length() == 0 ? new String("--") : "--".concat(valueOf);
            }
        }
        return wso.a(3, str, "");
    }

    public final /* bridge */ /* synthetic */ Object a(ContentValues contentValues, String str) {
        String asString = contentValues.getAsString("data1");
        if (TextUtils.isEmpty(asString)) {
            return null;
        }
        aucd o = amfa.e.o();
        if (wsn.b(asString)) {
            asString = wsn.c(asString);
        }
        Long e = wsn.e(asString);
        if (e != null) {
            long a = wsn.a(e.longValue());
            if (o.c) {
                o.c();
                o.c = false;
            }
            amfa amfa = (amfa) o.b;
            amfa.a |= 2;
            amfa.c = a;
        } else {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amfa amfa2 = (amfa) o.b;
            asString.getClass();
            amfa2.a |= 16;
            amfa2.d = asString;
        }
        amgl f = wsn.f(str);
        if (o.c) {
            o.c();
            o.c = false;
        }
        amfa amfa3 = (amfa) o.b;
        f.getClass();
        amfa3.b = f;
        amfa3.a |= 1;
        return (amfa) o.i();
    }
}
