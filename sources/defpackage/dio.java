package defpackage;

/* renamed from: dio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dio {
    public static dih a(String str) {
        aucd o = dih.b.o();
        if (!amrk.b(str).trim().isEmpty()) {
            String trim = str.trim();
            if (o.c) {
                o.c();
                o.c = false;
            }
            trim.getClass();
            ((dih) o.b).a = trim;
        }
        return (dih) o.i();
    }

    public static String b(dih dih) {
        if (a(dih)) {
            return dih.a;
        }
        throw new din();
    }

    public static boolean a(dih dih) {
        return dih != null && !dih.a.trim().isEmpty();
    }
}
