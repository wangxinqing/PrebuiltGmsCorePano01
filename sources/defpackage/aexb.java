package defpackage;

import java.util.List;

/* renamed from: aexb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aexb extends awem {
    private final bapu b;
    private final awef c;
    private final awef d;
    private final awef e;
    private final awef f;

    public aexb(bapu bapu, bapu bapu2, bapu bapu3, awef awef, awef awef2, awef awef3, awef awef4) {
        super(bapu2, awey.a(aexb.class), bapu);
        this.b = bapu3;
        this.c = aweu.a(awef);
        this.d = aweu.a(awef2);
        this.e = aweu.a(awef3);
        this.f = aweu.a(awef4);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.c.b(), this.d.b(), this.f.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        aukv aukv;
        List list = (List) obj;
        awdn b2 = awds.b(this.b);
        aukh aukh = (aukh) list.get(0);
        boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
        awef awef = this.e;
        afgr afgr = (afgr) list.get(2);
        if (booleanValue) {
            return awef.b();
        }
        if (aukh.a == 2) {
            aukv = (aukv) aukh.b;
        } else {
            aukv = aukv.e;
        }
        ((pia) b2.a()).a("Changes download skipped for the local %s/%s InternalFootprintsTimeSeriesSyncVariant", Integer.valueOf(aukv.b), Integer.valueOf(aukv.c));
        afgr.b(0);
        afgr.a(0, 0);
        return aorl.a((Object) null);
    }
}
