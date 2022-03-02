package defpackage;

import java.util.List;

/* renamed from: qpn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qpn extends awem {
    private final awef b;
    private final awef c;
    private final awef d;
    private final awef e;

    public qpn(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3, awef awef4) {
        super(bapu2, awey.a(qpn.class), bapu);
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
        boolean z = false;
        qpk qpk = (qpk) list.get(0);
        Boolean bool = (Boolean) list.get(1);
        qrg qrg = (qrg) list.get(2);
        Long l = (Long) list.get(3);
        if (qpk.a.booleanValue()) {
            qrg.c();
            Long l2 = qpk.b;
            if (l2 == null || l2.longValue() <= l.longValue()) {
                qrg.a(l.longValue());
            } else {
                qrg.a(l2.longValue());
            }
        }
        if (qpk.a.booleanValue() && bool.booleanValue()) {
            z = true;
        }
        return aorl.a((Object) Boolean.valueOf(z));
    }
}
