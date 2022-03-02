package defpackage;

import java.util.List;
import java.util.Set;

/* renamed from: qpe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qpe extends awem {
    private final awef b;
    private final awef c;

    public qpe(bapu bapu, bapu bapu2, awef awef, awef awef2) {
        super(bapu2, awey.a(qpe.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        qrg qrg = (qrg) list.get(0);
        qrf qrf = (qrf) list.get(1);
        if (qrf.a()) {
            qrg.a(qrf);
        }
        Set a = qra.a(qrg.a("batch_indexing_windows"));
        new Object[1][0] = Integer.valueOf(a.size());
        return aorl.a((Object) a);
    }
}
