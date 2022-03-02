package defpackage;

import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: qoz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qoz extends awem {
    private final awef b;
    private final awef c;
    private final awef d;
    private final awef e;

    public qoz(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3, awef awef4) {
        super(bapu2, awey.a(qoz.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
        this.e = aweu.a(awef4);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b(), this.e.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        return aopr.a(this.d.b(), (amqy) new qox((Boolean) list.get(0), (Boolean) list.get(1)), (Executor) list.get(2));
    }
}
