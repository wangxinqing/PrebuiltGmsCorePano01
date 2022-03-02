package defpackage;

import java.util.List;

/* renamed from: aeyl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aeyl implements amqy {
    private final aezp a;

    public aeyl(aezp aezp) {
        this.a = aezp;
    }

    public final Object a(Object obj) {
        aezp aezp = this.a;
        aukk aukk = (aukk) obj;
        aucd o = auki.f.o();
        int i = aukk.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        auki auki = (auki) o.b;
        int i2 = auki.a | 1;
        auki.a = i2;
        auki.b = i;
        if ((aukk.a & 2) != 0) {
            int i3 = aukk.c;
            i2 |= 2;
            auki.a = i2;
            auki.c = i3;
        }
        if ((aukk.a & 4) != 0) {
            long j = aezp.a;
            long j2 = aukk.d;
            auki.a = i2 | 4;
            auki.d = j + j2;
        }
        if ((aukk.a & 8) != 0) {
            aumf aumf = aukk.e;
            if (aumf == null) {
                aumf = aumf.b;
            }
            Iterable a2 = anbs.a((Iterable) aumf.a, aezo.a);
            aucd o2 = aulz.b.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aulz aulz = (aulz) o2.b;
            aulz.c();
            auab.a(a2, (List) aulz.a);
            aulz aulz2 = (aulz) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            auki auki2 = (auki) o.b;
            aulz2.getClass();
            auki2.e = aulz2;
            auki2.a |= 8;
        }
        return (auki) o.i();
    }
}
