package defpackage;

/* renamed from: aezc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aezc {
    public static aorr a(aeri aeri, auls auls, auke auke, aukh aukh, aumr aumr, amzy amzy, amzy amzy2, afgr afgr, amsv amsv) {
        long j;
        aukd aukd;
        Long l;
        if (amzy2.isEmpty()) {
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
        int i = aung.a | 1;
        aung.a = i;
        aumr.getClass();
        aung.d = aumr;
        aung.a = i | 2;
        aund.a(amzy2);
        aucd o2 = aune.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aune aune = (aune) o2.b;
        aune.a |= 1;
        aune.b = true;
        if (aund.c) {
            aund.c();
            aund.c = false;
        }
        aung aung2 = (aung) aund.b;
        aune aune2 = (aune) o2.i();
        aune2.getClass();
        aung2.f = aune2;
        aung2.a |= 4;
        if (aeri.A()) {
            aucx aucx = auke.a;
            int size = aucx.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    aukd = (aukd) aucx.get(i2);
                    aukh aukh2 = aukd.c;
                    if (aukh2 == null) {
                        aukh2 = aukh.c;
                    }
                    i2++;
                    if (aukh.equals(aukh2)) {
                        break;
                    }
                } else {
                    aukd = aukd.h;
                    break;
                }
            }
            if (!(!aukd.g || (l = (Long) amsv.a()) == null || l.longValue() == 0)) {
                aucd o3 = aunf.c.o();
                long longValue = l.longValue();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                aunf aunf = (aunf) o3.b;
                aunf.a = 1;
                aunf.b = Long.valueOf(longValue);
                aunf aunf2 = (aunf) o3.i();
                if (aund.c) {
                    aund.c();
                    aund.c = false;
                }
                aung aung3 = (aung) aund.b;
                aunf2.getClass();
                aung3.g = aunf2;
                aung3.a |= 16;
            }
        }
        aung aung4 = (aung) aund.i();
        int i3 = aung4.U;
        if (i3 == -1) {
            i3 = aueh.a.a((Object) aung4).b(aung4);
            aung4.U = i3;
        }
        long j2 = (long) i3;
        if (amzy != amzy2) {
            j = j2;
            for (int i4 = 0; i4 < amzy2.size(); i4++) {
                aukc aukc = (aukc) amzy.get(i4);
                aukc aukc2 = (aukc) amzy2.get(i4);
                if (aukc2.b == 6) {
                    int i5 = aukc2.U;
                    if (i5 == -1) {
                        i5 = aueh.a.a((Object) aukc2).b(aukc2);
                        aukc2.U = i5;
                    }
                    long j3 = j - ((long) i5);
                    int i6 = aukc.U;
                    if (i6 == -1) {
                        i6 = aueh.a.a((Object) aukc).b(aukc);
                        aukc.U = i6;
                    }
                    j = j3 + ((long) i6);
                }
            }
        } else {
            j = j2;
        }
        afgr.b((long) aung4.c.size());
        afgr.a(j2, j);
        return auls.a(aung4);
    }
}
