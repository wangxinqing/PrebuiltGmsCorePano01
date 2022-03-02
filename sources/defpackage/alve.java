package defpackage;

/* renamed from: alve  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alve {
    private static final aluz a = new aluz();

    public static Object a(alze alze) {
        if (alze.f()) {
            return aluw.a;
        }
        alze.c();
        int b = alze.b();
        alva alva = (alva) a.a.get(b);
        if (alva != null) {
            Object a2 = alva.a(alze);
            alze.d();
            return a2;
        }
        StringBuilder sb = new StringBuilder(66);
        sb.append("No decoder found to deserialize object with type code: ");
        sb.append(b);
        throw new alvd(sb.toString());
    }
}
