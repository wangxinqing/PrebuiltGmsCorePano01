package defpackage;

/* renamed from: jez  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jez {
    static amko a() {
        return amlv.a(amlw.a);
    }

    public static amko a(Object obj, amko amko) {
        if (amko == obj) {
            return amko;
        }
        if (obj instanceof jex) {
            jex jex = (jex) obj;
            a(amko);
            amkz a = nku.a();
            String str = jex.b;
            amkv a2 = nku.a(jex.a);
            amrl.a((Object) amlw.a);
            return a.a.a(str, amkv.a(a.b, a2), 1, a.c);
        }
        amko amko2 = (amko) obj;
        amlv.a(amko2, amlw.a);
        return amko2;
    }

    public static Object a(String str) {
        nih b = nku.b();
        if (b != null) {
            return new jex(b, str);
        }
        return null;
    }

    static void a(amko amko) {
        if (amko != null) {
            amlv.a((amko) null, amlw.a);
        }
    }

    public static void a(Throwable th) {
        try {
            amlr.a(th);
        } catch (Throwable th2) {
        }
    }
}
