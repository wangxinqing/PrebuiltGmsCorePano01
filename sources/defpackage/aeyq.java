package defpackage;

import java.util.List;

/* renamed from: aeyq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeyq extends awem {
    private final awef b;
    private final awef c;

    public aeyq(bapu bapu, bapu bapu2, awef awef, awef awef2) {
        super(bapu2, awey.a(aeyq.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        aezp aezp = new aezp(((Long) list.get(1)).longValue());
        aucd o = aukj.b.o();
        aezp.getClass();
        List a = anda.a((List) (amzy) list.get(0), (amqy) new aeyl(aezp));
        if (o.c) {
            o.c();
            o.c = false;
        }
        aukj aukj = (aukj) o.b;
        if (!aukj.a.a()) {
            aukj.a = aucj.a(aukj.a);
        }
        auab.a((Iterable) a, (List) aukj.a);
        return aorl.a((Object) (aukj) o.i());
    }
}
