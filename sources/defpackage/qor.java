package defpackage;

import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: qor  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qor extends awem {
    private final awef b;
    private final awef c;
    private final awef d;

    private qor(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3) {
        super(bapu2, awey.a(qor.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
    }

    public static qor a(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3) {
        return new qor(bapu, bapu2, awef, awef2, awef3);
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        qrn qrn = (qrn) list.get(0);
        awef awef = this.c;
        Executor executor = (Executor) list.get(1);
        if (!axvz.f()) {
            return aorl.a((Object) true);
        }
        return aopr.a(qrn.a(), (aoqb) new qom(awef), executor);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.d.b());
    }
}
