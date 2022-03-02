package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qyy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qyy implements aoqb {
    private final qzs a;
    private final AtomicReference b;
    private final int c;

    public qyy(qzs qzs, AtomicReference atomicReference, int i) {
        this.a = qzs;
        this.b = atomicReference;
        this.c = i;
    }

    public final aorr a(Object obj) {
        aorr aorr;
        qzs qzs = this.a;
        AtomicReference atomicReference = this.b;
        int i = this.c;
        afup afup = (afup) obj;
        afyl afyl = (afyl) atomicReference.get();
        if (afyl == null) {
            return aorl.a((Object) null);
        }
        if (afup.b) {
            synchronized (afyl.a) {
                afyl.e();
                aorr = aorl.a((Object) null);
            }
        } else {
            aorr = afyl.b();
        }
        return aopr.a(aorr, (amqy) new qze(qzs, afup, afyl, i), (Executor) aoqm.a);
    }
}
