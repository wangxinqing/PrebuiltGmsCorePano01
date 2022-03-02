package defpackage;

/* renamed from: afgq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afgq {
    public static aokg a(aukh aukh) {
        aukv aukv;
        aukg aukg = aukg.TRIVIAL_BIGTABLE;
        int ordinal = aukg.a(aukh.a).ordinal();
        if (ordinal == 0) {
            return aokg.c;
        }
        if (ordinal == 1) {
            if (aukh.a == 2) {
                aukv = (aukv) aukh.b;
            } else {
                aukv = aukv.e;
            }
            aucd o = aokg.c.o();
            aucd o2 = aoki.e.o();
            int i = aukv.c;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aoki aoki = (aoki) o2.b;
            int i2 = 2 | aoki.a;
            aoki.a = i2;
            aoki.c = i;
            int i3 = aukv.b;
            aoki.a = i2 | 1;
            aoki.b = i3;
            auku a = auku.a(aukv.d);
            if (a == null) {
                a = auku.UNKNOWN;
            }
            int i4 = a.e;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aoki aoki2 = (aoki) o2.b;
            aoki2.a |= 4;
            aoki2.d = i4;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aokg aokg = (aokg) o.b;
            aoki aoki3 = (aoki) o2.i();
            aoki3.getClass();
            aokg.b = aoki3;
            aokg.a = 1;
            return (aokg) o.i();
        } else if (ordinal == 2) {
            aucd o3 = aokg.c.o();
            aokm aokm = aokm.a;
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            aokg aokg2 = (aokg) o3.b;
            aokm.getClass();
            aokg2.b = aokm;
            aokg2.a = 2;
            return (aokg) o3.i();
        } else if (ordinal != 3) {
            return aokg.c;
        } else {
            return aokg.c;
        }
    }
}
