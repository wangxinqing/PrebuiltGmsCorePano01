package defpackage;

import android.content.Context;
import android.util.ArraySet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: aecj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aecj {
    final Map a = new HashMap();
    final Set b = aecg.a(azws.d());
    final Set c = aecg.a(azws.c());
    final Set d = aecg.a(azws.b());
    final Set e = aecg.a(azws.e());
    final Set f = new ArraySet();
    final aeci g;
    final ancq h = amxc.p();
    final ancq i = amxc.p();
    final ancq j = amxc.p();
    final ancq k = amxc.a(3, 100);
    final ancq l = amxc.p();
    final ancq m = amxc.p();
    final ancq n = amxc.p();
    final ancq o = amxc.p();
    final ancq p = amxc.p();
    final ancq q = amxc.p();
    final aupy r;
    final Context s;

    public aecj(aupy aupy, Context context, aeci aeci) {
        aupy aupy2 = aupy.h;
        this.r = aupy;
        this.s = context;
        this.g = aeci;
    }

    private static void a(Context context, long j2) {
        aecq.f(context).e("InvalidConfigMissingElements").a(j2);
    }

    public final void b(long j2, bci bci) {
        ancq ancq = this.q;
        Long valueOf = Long.valueOf(j2);
        if (!ancq.b(valueOf, Long.valueOf(bci.b))) {
            aecg.a((aucd) this.a.get(valueOf), bci);
            a(this.n.a(valueOf), bci);
            this.q.a((Object) valueOf, (Object) Long.valueOf(bci.b));
        }
    }

    public final void c(aucd aucd, long j2, long j3) {
        for (bbz a2 : this.g.h.a(Long.valueOf(j2))) {
            aucd.a(a2);
        }
        for (Long longValue : this.g.f.a(Long.valueOf(j2))) {
            b(aucd, longValue.longValue(), j3);
        }
    }

    public static final void a(aucd aucd, long j2, bci bci) {
        aucx aucx = bci.q;
        int size = aucx.size();
        for (int i2 = 0; i2 < size; i2++) {
            bbz bbz = (bbz) aucx.get(i2);
            if (bbz.a == j2) {
                aucd.a(bbz);
            }
        }
    }

    public final void b(aucd aucd, long j2, long j3) {
        Map map = this.g.a;
        Long valueOf = Long.valueOf(j2);
        if (!map.containsKey(valueOf)) {
            a(this.s, j3);
        } else if (a((Set) anfv.a, j2, this.i.a(Long.valueOf(((bci) aucd.b).b)))) {
            bbp bbp = (bbp) this.g.a.get(valueOf);
            if (bbp.a == 3) {
                for (Long longValue : this.g.e.a(valueOf)) {
                    b(aucd, longValue.longValue(), j3);
                }
            }
            aucd.a(bbp);
        }
    }

    private static void a(List list, bci bci) {
        aucv aucv = bci.o;
        int size = aucv.size();
        for (int i2 = 0; i2 < size; i2++) {
            Long l2 = (Long) aucv.get(i2);
            if (!list.contains(l2)) {
                list.add(l2);
            }
        }
    }

    public static boolean a(Set set, long j2, List list) {
        Long valueOf = Long.valueOf(j2);
        if (list.contains(valueOf) || set.contains(valueOf)) {
            return false;
        }
        list.add(valueOf);
        return true;
    }

    public final void a(long j2) {
        boolean z;
        Map map = this.a;
        Long valueOf = Long.valueOf(j2);
        if (!map.containsKey(valueOf)) {
            aucd o2 = bci.u.o();
            if (azwf.b()) {
                int f2 = (int) (((j2 - azws.f()) >> 12) & 1);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                bci bci = (bci) o2.b;
                bci.a |= 64;
                if (f2 == 0) {
                    z = false;
                } else {
                    z = true;
                }
                bci.r = z;
            }
            this.a.put(valueOf, o2);
            if (azur.b()) {
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                bci bci2 = (bci) o2.b;
                bci2.a |= 1;
                bci2.b = j2;
            }
        }
    }

    public final void a(long j2, long j3, long j4) {
        aucd aucd = (aucd) this.a.get(Long.valueOf(j3));
        for (Long longValue : this.g.g.a(Long.valueOf(j4))) {
            long longValue2 = longValue.longValue();
            Map map = this.g.c;
            Long valueOf = Long.valueOf(longValue2);
            if (!map.containsKey(valueOf)) {
                a(this.s, j2);
            } else {
                if (a(this.c, longValue2, this.j.a(Long.valueOf(j3)))) {
                    aucd.a((bbn) this.g.c.get(valueOf));
                }
                if (!this.c.contains(valueOf)) {
                    for (bcl bcl : this.g.i.a(valueOf)) {
                        if (a(this.e, bcl.a, this.m.a(Long.valueOf(j3))) && !this.c.contains(Long.valueOf(longValue2))) {
                            aucd.a(bcl);
                        }
                    }
                }
            }
        }
    }

    public final void a(long j2, bci bci) {
        ancq ancq = this.q;
        Long valueOf = Long.valueOf(j2);
        if (!ancq.b(valueOf, Long.valueOf(bci.b))) {
            aucd aucd = (aucd) this.a.get(valueOf);
            aecg.a(aucd, bci);
            aucx aucx = bci.j;
            int size = aucx.size();
            for (int i2 = 0; i2 < size; i2++) {
                bcc bcc = (bcc) aucx.get(i2);
                ancq ancq2 = this.h;
                Long valueOf2 = Long.valueOf(j2);
                if (!ancq2.b(valueOf2, Long.valueOf(bcc.c))) {
                    aucd.a(bcc);
                    this.h.a((Object) valueOf2, (Object) Long.valueOf(bcc.c));
                }
            }
            aucx aucx2 = bci.i;
            int size2 = aucx2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                bbp bbp = (bbp) aucx2.get(i3);
                ancq ancq3 = this.i;
                Long valueOf3 = Long.valueOf(j2);
                if (!ancq3.b(valueOf3, Long.valueOf(bbp.c))) {
                    aucd.a(bbp);
                    this.i.a((Object) valueOf3, (Object) Long.valueOf(bbp.c));
                }
            }
            aucx aucx3 = bci.l;
            int size3 = aucx3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                bbm bbm = (bbm) aucx3.get(i4);
                if (a(this.d, bbm.a, this.l.a(Long.valueOf(j2)))) {
                    aucd.a(bbm);
                }
            }
            aucx aucx4 = bci.m;
            int size4 = aucx4.size();
            for (int i5 = 0; i5 < size4; i5++) {
                bcl bcl = (bcl) aucx4.get(i5);
                if (a(this.e, bcl.a, this.m.a(Long.valueOf(j2)))) {
                    aucd.a(bcl);
                }
            }
            ancq ancq4 = this.n;
            Long valueOf4 = Long.valueOf(j2);
            a(ancq4.a(valueOf4), bci);
            this.q.a((Object) valueOf4, (Object) Long.valueOf(bci.b));
        }
    }

    public final void a(aucd aucd, long j2, long j3) {
        bcg bcg;
        bcg bcg2;
        bcg bcg3;
        bcg bcg4;
        Map map = this.g.b;
        Long valueOf = Long.valueOf(j2);
        if (!map.containsKey(valueOf)) {
            a(this.s, j3);
        } else if (a((Set) anfv.a, j2, this.h.a(Long.valueOf(((bci) aucd.b).b)))) {
            bcc bcc = (bcc) this.g.b.get(valueOf);
            if (bcc.a != 2) {
                for (Long longValue : this.g.d.a(valueOf)) {
                    a(aucd, longValue.longValue(), j3);
                }
            } else {
                b(aucd, ((bcg) bcc.b).b, j3);
                if (bcc.a == 2) {
                    bcg = (bcg) bcc.b;
                } else {
                    bcg = bcg.e;
                }
                if ((bcg.a & 2) != 0) {
                    if (bcc.a == 2) {
                        bcg4 = (bcg) bcc.b;
                    } else {
                        bcg4 = bcg.e;
                    }
                    b(aucd, bcg4.c, j3);
                }
                if (bcc.a == 2) {
                    bcg2 = (bcg) bcc.b;
                } else {
                    bcg2 = bcg.e;
                }
                if ((bcg2.a & 8) != 0) {
                    if (bcc.a == 2) {
                        bcg3 = (bcg) bcc.b;
                    } else {
                        bcg3 = bcg.e;
                    }
                    b(aucd, bcg3.d, j3);
                }
            }
            aucd.a(bcc);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r0.d != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0073, code lost:
        if (r5.d != false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0084, code lost:
        if (r5.b == false) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.bca r5) {
        /*
            r4 = this;
            int r0 = r5.a
            r1 = 1
            r0 = r0 & r1
            r2 = 0
            if (r0 == 0) goto L_0x005a
            aupy r0 = r4.r
            boolean r0 = r0.b
            if (r0 != 0) goto L_0x005a
            int r0 = r5.b
            int r0 = defpackage.bbr.a(r0)
            if (r0 != 0) goto L_0x0016
            goto L_0x0020
        L_0x0016:
            r3 = 2
            if (r0 != r3) goto L_0x0020
            aupy r0 = r4.r
            boolean r0 = r0.c
            if (r0 != 0) goto L_0x0020
            return r2
        L_0x0020:
            int r0 = r5.b
            int r0 = defpackage.bbr.a(r0)
            if (r0 == 0) goto L_0x003d
            r3 = 3
            if (r0 != r3) goto L_0x003d
            boolean r0 = defpackage.azux.b()
            if (r0 != 0) goto L_0x003c
            aupy r0 = r4.r
            boolean r3 = r0.c
            if (r3 == 0) goto L_0x003c
            boolean r0 = r0.d
            if (r0 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            return r2
        L_0x003d:
            boolean r0 = defpackage.azux.b()
            if (r0 == 0) goto L_0x005a
            int r0 = r5.b
            int r0 = defpackage.bbr.a(r0)
            if (r0 == 0) goto L_0x005a
            r3 = 4
            if (r0 != r3) goto L_0x005a
            aupy r0 = r4.r
            boolean r3 = r0.c
            if (r3 == 0) goto L_0x0059
            boolean r0 = r0.b
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            return r2
        L_0x005a:
            boolean r0 = defpackage.azwv.h()
            if (r0 == 0) goto L_0x008e
            int r5 = r5.a
            r5 = r5 & r1
            if (r5 != 0) goto L_0x008e
            boolean r5 = defpackage.azux.b()
            if (r5 != 0) goto L_0x0075
            aupy r5 = r4.r
            boolean r0 = r5.c
            if (r0 == 0) goto L_0x0075
            boolean r5 = r5.d
            if (r5 != 0) goto L_0x008e
        L_0x0075:
            boolean r5 = defpackage.azux.b()
            if (r5 == 0) goto L_0x0087
            aupy r5 = r4.r
            boolean r0 = r5.c
            if (r0 != 0) goto L_0x0082
            goto L_0x0087
        L_0x0082:
            boolean r5 = r5.b
            if (r5 == 0) goto L_0x0087
            goto L_0x008e
        L_0x0087:
            aupy r5 = r4.r
            boolean r5 = r5.b
            if (r5 != 0) goto L_0x008e
            return r2
        L_0x008e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aecj.a(bca):boolean");
    }

    public final boolean a(Set set, long j2, bca bca, List list, List list2, List list3) {
        Long valueOf = Long.valueOf(j2);
        if (!list2.contains(valueOf) && !list3.contains(valueOf)) {
            list3.add(valueOf);
        }
        if (set.contains(valueOf) || list.contains(valueOf)) {
            return false;
        }
        list.add(valueOf);
        return a(bca);
    }
}
