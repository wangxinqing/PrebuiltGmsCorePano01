package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qyz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qyz implements aoqb {
    private final qzs a;
    private final AtomicReference b;
    private final int c;

    public qyz(qzs qzs, AtomicReference atomicReference, int i) {
        this.a = qzs;
        this.b = atomicReference;
        this.c = i;
    }

    public final aorr a(Object obj) {
        qzs qzs = this.a;
        AtomicReference atomicReference = this.b;
        int i = this.c;
        Exception exc = (Exception) obj;
        afyl afyl = (afyl) atomicReference.get();
        if (afyl != null) {
            return aopr.a(afyl.c(), (amqy) new qzd(qzs, afyl, exc, i), (Executor) aoqm.a);
        }
        return aorl.a((Object) null);
    }
}
