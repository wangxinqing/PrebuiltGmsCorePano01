package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: aexn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aexn extends awem {
    private final awef b;
    private final awef c;
    private final awef d;
    private final awef e;
    private final awef f;
    private final awef g;
    private final awef h;
    private final awef i;
    private final awef j;
    private final awef k;

    public aexn(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3, awef awef4, awef awef5, awef awef6, awef awef7, awef awef8, awef awef9, awef awef10) {
        super(bapu2, awey.a(aexn.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
        this.e = aweu.a(awef4);
        this.f = aweu.a(awef5);
        this.g = aweu.a(awef6);
        this.h = aweu.a(awef7);
        this.i = aweu.a(awef8);
        this.j = aweu.a(awef9);
        this.k = aweu.a(awef10);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b(), this.d.b(), this.e.b(), this.f.b(), this.g.b(), this.h.b(), this.i.b(), this.j.b(), this.k.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        aukd aukd;
        Long l;
        List list = (List) obj;
        aeri aeri = (aeri) list.get(0);
        auls auls = (auls) list.get(1);
        auke auke = (auke) list.get(2);
        aukh aukh = (aukh) list.get(3);
        aumr aumr = (aumr) list.get(4);
        Collection collection = (Collection) list.get(5);
        Collection collection2 = (Collection) list.get(6);
        Long l2 = (Long) list.get(7);
        afgr afgr = (afgr) list.get(8);
        amsv amsv = (amsv) list.get(9);
        if (collection.isEmpty()) {
            afgr.b(0);
            afgr.a(0, 0);
            aucd o = aunk.e.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aunk aunk = (aunk) o.b;
            aumr.getClass();
            aunk.b = aumr;
            aunk.a |= 1;
            return aorl.a((Object) (aunk) o.i());
        }
        aund aund = (aund) aung.h.o();
        if (aund.c) {
            aund.c();
            aund.c = false;
        }
        aung aung = (aung) aund.b;
        aukh.getClass();
        aung.b = aukh;
        int i2 = aung.a | 1;
        aung.a = i2;
        aumr.getClass();
        aung.d = aumr;
        aung.a = i2 | 2;
        aund.a(collection);
        aund.b(collection2);
        if (aeri.A()) {
            aucx aucx = auke.a;
            int size = aucx.size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    aukd = (aukd) aucx.get(i3);
                    aukh aukh2 = aukd.c;
                    if (aukh2 == null) {
                        aukh2 = aukh.c;
                    }
                    i3++;
                    if (aukh.equals(aukh2)) {
                        break;
                    }
                } else {
                    aukd = aukd.h;
                    break;
                }
            }
            if (!(!aukd.g || (l = (Long) amsv.a()) == null || l.longValue() == 0)) {
                aucd o2 = aunf.c.o();
                long longValue = l.longValue();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aunf aunf = (aunf) o2.b;
                aunf.a = 1;
                aunf.b = Long.valueOf(longValue);
                aunf aunf2 = (aunf) o2.i();
                if (aund.c) {
                    aund.c();
                    aund.c = false;
                }
                aung aung2 = (aung) aund.b;
                aunf2.getClass();
                aung2.g = aunf2;
                aung2.a |= 16;
            }
        }
        aung aung3 = (aung) aund.i();
        afgr.b((long) aung3.c.size());
        int i4 = aung3.U;
        if (i4 == -1) {
            i4 = aueh.a.a((Object) aung3).b(aung3);
            aung3.U = i4;
        }
        long j2 = (long) i4;
        afgr.a(j2, j2);
        return auls.a(aung3);
    }
}
