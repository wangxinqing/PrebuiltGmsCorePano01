package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: aktq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aktq implements Callable {
    private final aktg a;
    private final long[] b;

    public aktq(aktg aktg, long[] jArr) {
        this.a = aktg;
        this.b = jArr;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        aktg aktg = this.a;
        long[] jArr = this.b;
        aktn aktn = aktg.b;
        ArrayList arrayList = new ArrayList(r2);
        for (long valueOf : jArr) {
            arrayList.add(Long.valueOf(valueOf));
        }
        aucd o = atah.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atah atah = (atah) o.b;
        if (!atah.b.a()) {
            atah.b = aucj.a(atah.b);
        }
        auab.a((Iterable) arrayList, (List) atah.b);
        aucd o2 = astx.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        astx astx = (astx) o2.b;
        astx.a |= 1;
        astx.b = 64723;
        astx.a(astx);
        astx astx2 = (astx) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atah atah2 = (atah) o.b;
        astx2.getClass();
        atah2.c = astx2;
        atah2.a |= 1;
        atah atah3 = (atah) o.i();
        long c = azda.c();
        if (aktn.b == null) {
            aktn.b = baaj.a(baai.UNARY, "userlocation.SemanticLocationService/GetPlaceIndex", baoq.a(atah.d), baoq.a(atai.c));
        }
        return (atai) aktn.a.a(aktn.b, atah3, c, TimeUnit.MILLISECONDS);
    }
}
