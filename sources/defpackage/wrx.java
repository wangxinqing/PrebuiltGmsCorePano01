package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: wrx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wrx extends wru {
    private static final anaf a;
    private static final Map b;

    static {
        anaf a2 = anaf.a("anniversary", 1, "other", 2);
        a = a2;
        b = wsn.a((Map) a2);
    }

    public final /* bridge */ /* synthetic */ amgl a(Object obj) {
        amgl amgl = ((amfn) obj).b;
        return amgl == null ? amgl.h : amgl;
    }

    public final /* bridge */ /* synthetic */ ContentValues a(Object obj, boolean z) {
        amfn amfn = (amfn) obj;
        wrv a2 = wsn.a(amfn.d, (Map) a, (Integer) 0);
        String b2 = wsn.b(amfn.c);
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        xip.a();
        if (((Boolean) xio.a.a()).booleanValue() && wsn.a(b2)) {
            b2 = wsn.d(b2);
        }
        return wso.a(a2.a.intValue(), b2, a2.b);
    }

    public final /* bridge */ /* synthetic */ Object a(ContentValues contentValues, String str) {
        String a2 = wsn.a(wsn.a(contentValues, "data2"), contentValues.getAsString("data3"), b, (Integer) 0);
        String asString = contentValues.getAsString("data1");
        aucd o = amfn.e.o();
        if (asString != null) {
            xip.a();
            if (((Boolean) xio.a.a()).booleanValue() && wsn.b(asString)) {
                asString = wsn.c(asString);
            }
            Long e = wsn.e(asString);
            if (e != null) {
                long a3 = wsn.a(e.longValue());
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                amfn amfn = (amfn) o.b;
                amfn.a |= 2;
                amfn.c = a3;
            }
        }
        if (a2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amfn amfn2 = (amfn) o.b;
            a2.getClass();
            amfn2.a |= 8;
            amfn2.d = a2;
        }
        amgl f = wsn.f(str);
        if (o.c) {
            o.c();
            o.c = false;
        }
        amfn amfn3 = (amfn) o.b;
        f.getClass();
        amfn3.b = f;
        amfn3.a |= 1;
        return (amfn) o.i();
    }
}
