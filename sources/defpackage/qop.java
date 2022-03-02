package defpackage;

import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: qop  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qop extends awem {
    private final awef b;
    private final awef c;
    private final awef d;

    private qop(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3) {
        super(bapu2, awey.a(qop.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
    }

    public static qop a(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3) {
        return new qop(bapu, bapu2, awef, awef2, awef3);
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        qrk qrk = (qrk) list.get(0);
        awef awef = this.c;
        Executor executor = (Executor) list.get(1);
        if (!axvz.f()) {
            return aorl.a((Object) true);
        }
        return aopr.a(qrk.a(), (aoqb) new qol(awef), executor);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.d.b());
    }
}
