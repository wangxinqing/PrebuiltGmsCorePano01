package defpackage;

import java.util.List;

/* renamed from: aewy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aewy extends awem {
    private final awef b;
    private final awef c;

    public aewy(bapu bapu, bapu bapu2, awef awef, awef awef2) {
        super(bapu2, awey.a(aewy.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        aeti aeti = (aeti) list.get(0);
        Long l = (Long) list.get(1);
        aucd o = aumx.e.o();
        int a = aeti.a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aumx aumx = (aumx) o.b;
        aumx.a = 1 | aumx.a;
        aumx.b = a;
        if (aeti.c() != null) {
            long longValue = l.longValue() + aeti.c().longValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aumx aumx2 = (aumx) o.b;
            aumx2.a |= 2;
            aumx2.c = longValue;
        }
        if (aeti.b() != null) {
            long longValue2 = l.longValue() + aeti.b().longValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aumx aumx3 = (aumx) o.b;
            aumx3.a |= 4;
            aumx3.d = longValue2;
        }
        return aorl.a((Object) (aumx) o.i());
    }
}
