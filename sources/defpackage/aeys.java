package defpackage;

import java.util.List;

/* renamed from: aeys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeys extends awem {
    private final awef b;
    private final awef c;
    private final awef d;
    private final awef e;

    public aeys(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3, awef awef4) {
        super(bapu2, awey.a(aeys.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
        this.e = aweu.a(awef4);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b(), this.d.b(), this.e.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        aukh aukh = (aukh) list.get(0);
        aukj aukj = (aukj) list.get(1);
        aumr aumr = (aumr) list.get(2);
        auls auls = (auls) list.get(3);
        aucd o = auli.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        auli auli = (auli) o.b;
        aukh.getClass();
        auli.b = aukh;
        auli.a |= 1;
        aucd o2 = aukm.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aukm aukm = (aukm) o2.b;
        aukj.getClass();
        aukm.b = aukj;
        aukm.a = 4;
        if (o.c) {
            o.c();
            o.c = false;
        }
        auli auli2 = (auli) o.b;
        aukm aukm2 = (aukm) o2.i();
        aukm2.getClass();
        auli2.c = aukm2;
        auli2.a |= 2;
        if (o.c) {
            o.c();
            o.c = false;
        }
        auli auli3 = (auli) o.b;
        aumr.getClass();
        auli3.d = aumr;
        auli3.a |= 4;
        return auls.a((auli) o.i());
    }
}
