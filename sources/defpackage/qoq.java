package defpackage;

import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: qoq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qoq extends awem {
    private final awef b;
    private final awef c;
    private final awef d;

    private qoq(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3) {
        super(bapu2, awey.a(qoq.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
    }

    public static qoq a(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3) {
        return new qoq(bapu, bapu2, awef, awef2, awef3);
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        qrl qrl = (qrl) list.get(0);
        awef awef = this.c;
        Executor executor = (Executor) list.get(1);
        if (!axvz.f()) {
            return aorl.a((Object) true);
        }
        return aopr.a(qrl.a(), (aoqb) new qon(awef), executor);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.d.b());
    }
}
