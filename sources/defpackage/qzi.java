package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qzi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qzi implements aoqa {
    private final qzs a;
    private final afun b;
    private final afym c;
    private final Executor d;
    private final int e;

    public qzi(qzs qzs, afun afun, int i, afym afym, Executor executor) {
        this.a = qzs;
        this.b = afun;
        this.e = i;
        this.c = afym;
        this.d = executor;
    }

    public final aorr a() {
        qzs qzs = this.a;
        afun afun = this.b;
        int i = this.e;
        afym afym = this.c;
        Executor executor = this.d;
        aorr a2 = aooz.a(aopr.a(qzs.b.a(), (aoqb) new qzl(afym), (Executor) aoqm.a), Exception.class, qzm.a, (Executor) aoqm.a);
        AtomicReference atomicReference = new AtomicReference();
        aorr a3 = aopr.a(aopr.a(a2, (amqy) new qzn(atomicReference), (Executor) aoqm.a), (aoqb) new qzo(qzs, afun, i), executor);
        return aorl.b(aopr.a(a3, (aoqb) new qzp(qzs, atomicReference), (Executor) aoqm.a), aooz.a(a3, Exception.class, (aoqb) new qys(qzs, atomicReference), (Executor) aoqm.a)).a((aoqa) new qyt(a3), (Executor) aoqm.a);
    }
}
