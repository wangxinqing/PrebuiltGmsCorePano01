package defpackage;

import java.util.List;

/* renamed from: ewn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ewn implements ax {
    private final ews a;

    public ewn(ews ews) {
        this.a = ews;
    }

    public final void a(Object obj) {
        ews ews = this.a;
        List list = (List) obj;
        ews.c.a((List) amym.a((Iterable) list).a((amqy) new ewp(ews)).b());
        hol hol = ews.e;
        aucd o = anty.n.o();
        String str = ews.b.g;
        if (o.c) {
            o.c();
            o.c = false;
        }
        anty anty = (anty) o.b;
        str.getClass();
        int i = anty.a | 2;
        anty.a = i;
        anty.c = str;
        anty.b = 10;
        anty.a = i | 1;
        aucd o2 = antq.b.o();
        amzy b = amym.a((Iterable) list).a(ewq.a).b();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        antq antq = (antq) o2.b;
        if (!antq.a.a()) {
            antq.a = aucj.a(antq.a);
        }
        auab.a((Iterable) b, (List) antq.a);
        if (o.c) {
            o.c();
            o.c = false;
        }
        anty anty2 = (anty) o.b;
        antq antq2 = (antq) o2.i();
        antq2.getClass();
        anty2.k = antq2;
        anty2.a |= 512;
        hol.a((audx) o.i()).b();
        ews.d.getViewTreeObserver().addOnGlobalLayoutListener(new ewr(ews));
    }
}
