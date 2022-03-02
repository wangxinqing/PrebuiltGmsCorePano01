package defpackage;

/* renamed from: njt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class njt {
    public static final njs a = new njs((int) axda.a.a().F());
    public static final nig b;
    public static final nig c;

    static {
        aucd o = nig.g.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        nig nig = (nig) o.b;
        nig.f = 3;
        nig.a |= 16;
        b = (nig) o.i();
        aucd o2 = nig.g.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        nig nig2 = (nig) o2.b;
        nig2.f = 3;
        nig2.a |= 16;
        c = (nig) o2.i();
    }

    static String a(String str) {
        int indexOf = str.indexOf(":");
        return indexOf >= 0 ? str.substring(0, indexOf) : str;
    }
}
