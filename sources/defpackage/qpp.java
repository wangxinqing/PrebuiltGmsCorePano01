package defpackage;

import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: qpp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qpp extends awem {
    private final awef b;
    private final awef c;
    private final awef d;
    private final awef e;
    private final awef f;
    private final awef g;

    public qpp(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3, awef awef4, awef awef5, awef awef6) {
        super(bapu2, awey.a(qpp.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
        this.e = aweu.a(awef4);
        this.f = aweu.a(awef5);
        this.g = aweu.a(awef6);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b(), this.d.b(), this.e.b(), this.f.b(), this.g.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        Long l = (Long) list.get(0);
        qrz qrz = (qrz) list.get(1);
        qrm qrm = (qrm) list.get(2);
        Executor executor = (Executor) list.get(3);
        qrd qrd = (qrd) list.get(4);
        qrg qrg = (qrg) list.get(5);
        if (!axvz.e()) {
            return aorl.a((Object) new qpk(true, Long.MIN_VALUE));
        }
        qri qri = new qri(5);
        qri.c();
        qrd.a(qri);
        return aopr.a(qrm.a(), (aoqb) new qpj(qrg, qrz, qri, qrm, executor), executor);
    }
}
