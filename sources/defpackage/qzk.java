package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qzk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qzk implements aoqa {
    private final qzs a;
    private final afuq b;
    private final afym c;
    private final Executor d;
    private final int e;

    public qzk(qzs qzs, afuq afuq, int i, afym afym, Executor executor) {
        this.a = qzs;
        this.b = afuq;
        this.e = i;
        this.c = afym;
        this.d = executor;
    }

    public final aorr a() {
        qzs qzs = this.a;
        afuq afuq = this.b;
        int i = this.e;
        afym afym = this.c;
        Executor executor = this.d;
        aorr a2 = aooz.a(aopr.a(qzs.b.a(), (aoqb) new qyu(afym), (Executor) aoqm.a), Exception.class, qyv.a, (Executor) aoqm.a);
        AtomicReference atomicReference = new AtomicReference();
        aorr a3 = aopr.a(aopr.a(a2, (amqy) new qyw(atomicReference), (Executor) aoqm.a), (aoqb) new qyx(qzs, atomicReference, afuq, i), executor);
        return aorl.b(aopr.a(a3, (aoqb) new qyy(qzs, atomicReference, i), (Executor) aoqm.a), aooz.a(a3, Exception.class, (aoqb) new qyz(qzs, atomicReference, i), (Executor) aoqm.a)).a((aoqa) new qza(a3), (Executor) aoqm.a);
    }
}
