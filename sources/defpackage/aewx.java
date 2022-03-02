package defpackage;

import java.util.List;

/* renamed from: aewx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aewx extends awem {
    private final awef b;
    private final awef c;
    private final awef d;
    private final awef e;

    public aewx(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3, awef awef4) {
        super(bapu2, awey.a(aewx.class), bapu);
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
        aumr aumr = (aumr) list.get(1);
        auls auls = (auls) list.get(2);
        aumx aumx = (aumx) list.get(3);
        aucd o = auli.f.o();
        aucd o2 = aukm.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aukm aukm = (aukm) o2.b;
        aumx.getClass();
        aukm.b = aumx;
        aukm.a = 2;
        aukm aukm2 = (aukm) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        auli auli = (auli) o.b;
        aukm2.getClass();
        auli.c = aukm2;
        int i = auli.a | 2;
        auli.a = i;
        aukh.getClass();
        auli.b = aukh;
        int i2 = i | 1;
        auli.a = i2;
        aumr.getClass();
        auli.d = aumr;
        auli.a = i2 | 4;
        return auls.a((auli) o.i());
    }
}
