package defpackage;

import android.content.ContentValues;
import java.util.Map;

/* renamed from: wrw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wrw extends wru {
    private static final anaf a;
    private static final Map b;

    static {
        anaf a2 = anaf.a("home", 1, "work", 2, "other", 3);
        a = a2;
        b = wsn.a((Map) a2);
    }

    public final /* bridge */ /* synthetic */ amgl a(Object obj) {
        amgl amgl = ((amfm) obj).b;
        return amgl == null ? amgl.h : amgl;
    }

    public final /* bridge */ /* synthetic */ ContentValues a(Object obj, boolean z) {
        amfm amfm = (amfm) obj;
        wrv a2 = wsn.a(amfm.d, (Map) a, (Integer) 0);
        if (ayso.a.a().c()) {
            return wso.a(a2.a.intValue(), amfm.c, amfm.e, a2.b, z);
        }
        return wso.a(a2.a.intValue(), amfm.c, (String) null, a2.b, z);
    }

    public final /* bridge */ /* synthetic */ Object a(ContentValues contentValues, String str) {
        String a2 = wsn.a(wsn.a(contentValues, "data2"), contentValues.getAsString("data3"), b, (Integer) 0);
        String asString = contentValues.getAsString("data1");
        boolean a3 = wsn.a(contentValues);
        aucd o = amfm.f.o();
        if (a2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amfm amfm = (amfm) o.b;
            a2.getClass();
            amfm.a |= 4;
            amfm.d = a2;
        }
        if (asString != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amfm amfm2 = (amfm) o.b;
            asString.getClass();
            amfm2.a |= 2;
            amfm2.c = asString;
        }
        amgl a4 = wsn.a(str, a3);
        if (o.c) {
            o.c();
            o.c = false;
        }
        amfm amfm3 = (amfm) o.b;
        a4.getClass();
        amfm3.b = a4;
        amfm3.a |= 1;
        return (amfm) o.i();
    }
}
