package defpackage;

import android.util.ArrayMap;
import java.util.Map;

/* renamed from: aeci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeci {
    final Map a = new ArrayMap();
    final Map b = new ArrayMap();
    final Map c = new ArrayMap();
    final ancq d = amxc.p();
    final ancq e = amxc.p();
    final ancq f = amxc.p();
    final ancq g = amxc.p();
    final ancq h = amxc.p();
    final ancq i = amxc.p();
    final ancq j = amxc.p();

    public final void a(bci bci) {
        int i2;
        aucx aucx = bci.i;
        int size = aucx.size();
        for (int i3 = 0; i3 < size; i3++) {
            bbp bbp = (bbp) aucx.get(i3);
            if (!this.a.containsKey(Long.valueOf(bbp.c))) {
                this.a.put(Long.valueOf(bbp.c), bbp);
                if (bbp.a == 3) {
                    aucv aucv = ((bbo) bbp.b).a;
                    int size2 = aucv.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        this.e.a((Object) Long.valueOf(bbp.c), (Object) Long.valueOf(((Long) aucv.get(i4)).longValue()));
                    }
                }
            }
        }
        aucx aucx2 = bci.j;
        int size3 = aucx2.size();
        for (int i5 = 0; i5 < size3; i5++) {
            bcc bcc = (bcc) aucx2.get(i5);
            if (!this.b.containsKey(Long.valueOf(bcc.c))) {
                this.b.put(Long.valueOf(bcc.c), bcc);
                if (bcc.a == 3) {
                    aucv aucv2 = ((bcb) bcc.b).a;
                    int size4 = aucv2.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        this.d.a((Object) Long.valueOf(bcc.c), (Object) Long.valueOf(((Long) aucv2.get(i6)).longValue()));
                    }
                }
            }
        }
        aucx aucx3 = bci.k;
        int size5 = aucx3.size();
        for (int i7 = 0; i7 < size5; i7++) {
            bbn bbn = (bbn) aucx3.get(i7);
            if (!this.c.containsKey(Long.valueOf(bbn.a))) {
                this.c.put(Long.valueOf(bbn.a), bbn);
                this.g.a((Object) Long.valueOf(bbn.b), (Object) Long.valueOf(bbn.a));
            }
        }
        aucx aucx4 = bci.m;
        int size6 = aucx4.size();
        for (int i8 = 0; i8 < size6; i8++) {
            bcl bcl = (bcl) aucx4.get(i8);
            int a2 = bck.a(bcl.b);
            if (a2 != 0 && a2 == 3 && !this.i.d(Long.valueOf(bcl.a))) {
                this.i.a((Object) Long.valueOf(bcl.c), (Object) bcl);
            } else if (!this.j.d(Long.valueOf(bcl.a))) {
                this.j.a((Object) Long.valueOf(bcl.c), (Object) bcl);
            }
        }
        if (jkr.h()) {
            aucx aucx5 = bci.q;
            int size7 = aucx5.size();
            int i9 = 0;
            while (i9 < size7) {
                bbz bbz = (bbz) aucx5.get(i9);
                long j2 = bbz.a;
                this.h.a((Object) Long.valueOf(j2), (Object) bbz);
                aucx aucx6 = bbz.b;
                int size8 = aucx6.size();
                int i10 = 0;
                while (true) {
                    i2 = i9 + 1;
                    if (i10 >= size8) {
                        break;
                    }
                    bbu bbu = (bbu) aucx6.get(i10);
                    ancq ancq = this.f;
                    Long valueOf = Long.valueOf(j2);
                    ancq.a((Object) valueOf, (Object) Long.valueOf(bbu.b));
                    if ((bbu.a & 4) != 0) {
                        this.f.a((Object) valueOf, (Object) Long.valueOf(bbu.c));
                    }
                    i10++;
                }
                i9 = i2;
            }
        }
    }
}
