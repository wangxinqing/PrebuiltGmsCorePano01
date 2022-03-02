package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qys implements aoqb {
    private final qzs a;
    private final AtomicReference b;

    public qys(qzs qzs, AtomicReference atomicReference) {
        this.a = qzs;
        this.b = atomicReference;
    }

    public final aorr a(Object obj) {
        qzs qzs = this.a;
        Exception exc = (Exception) obj;
        afyl afyl = (afyl) this.b.get();
        if (afyl != null) {
            return aopr.a(afyl.c(), (amqy) new qzf(qzs, afyl, exc), (Executor) aoqm.a);
        }
        return aorl.a((Object) null);
    }
}
