package defpackage;

import java.util.List;

/* renamed from: aewc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aewc extends awem {
    private final bapu b;
    private final awef c;
    private final awef d;
    private final awef e;
    private final awef f;
    private final awef g;
    private final awef h;
    private final awef i;
    private final awef j;

    public aewc(bapu bapu, bapu bapu2, bapu bapu3, awef awef, awef awef2, awef awef3, awef awef4, awef awef5, awef awef6, awef awef7, awef awef8) {
        super(bapu2, awey.a(aewc.class), bapu);
        this.b = bapu3;
        this.c = aweu.a(awef);
        this.d = aweu.a(awef2);
        this.e = aweu.a(awef3);
        this.f = aweu.a(awef4);
        this.g = aweu.a(awef5);
        this.h = aweu.a(awef6);
        this.i = aweu.a(awef7);
        this.j = aweu.a(awef8);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.c.b(), this.d.b(), this.e.b(), this.f.b(), this.g.b(), this.h.b(), this.i.b(), this.j.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        awdn b2 = awds.b(this.b);
        aukh aukh = (aukh) list.get(0);
        aull aull = (aull) list.get(1);
        aevc aevc = (aevc) list.get(2);
        Long l = (Long) list.get(3);
        Long l2 = (Long) list.get(4);
        Integer num = (Integer) list.get(5);
        pdh pdh = (pdh) list.get(6);
        try {
            aevt.a(b2, aukh, aull, aevc, l, l2, num, (afgr) list.get(7));
            return aorl.a((Object) null);
        } catch (afen e2) {
            ((pia) b2.a()).a("Delta exception thrown when delta wasn't requested!", new Object[0]);
            throw new AssertionError(e2);
        }
    }
}
