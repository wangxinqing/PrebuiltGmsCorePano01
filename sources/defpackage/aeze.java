package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: aeze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeze extends awem {
    private final awef b;
    private final awef c;

    public aeze(bapu bapu, bapu bapu2, awef awef, awef awef2) {
        super(bapu2, awey.a(aeze.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        afgm afgm = (afgm) list.get(0);
        aeyf aeyf = new aeyf(afgm.a() / 1000);
        aeyf.a.b = 0;
        return aorl.a((Object) amzy.a((Collection) anda.a(anda.a((List) (amzy) list.get(1)), (amqy) new aeyd(aeyf))).g());
    }
}
