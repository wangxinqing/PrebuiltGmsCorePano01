package defpackage;

import java.util.List;

/* renamed from: qos  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qos extends awem {
    private final awef b;
    private final awef c;
    private final awef d;

    private qos(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3) {
        super(bapu2, awey.a(qos.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
    }

    public static qos a(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3) {
        return new qos(bapu, bapu2, awef, awef2, awef3);
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        qsa qsa = (qsa) list.get(0);
        qrk qrk = (qrk) list.get(1);
        qrd qrd = (qrd) list.get(2);
        if (!axvz.f()) {
            return aorl.a((Object) true);
        }
        return qoo.a(qsa, qrk, 10, 7, qrd);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b(), this.d.b());
    }
}
