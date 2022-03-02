package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aoqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoqu {
    private final AtomicReference a = new AtomicReference(aorl.a((Object) null));

    private aoqu() {
    }

    public static aoqu a() {
        return new aoqu();
    }

    public final aorr a(aoqa aoqa, Executor executor) {
        amrl.a((Object) aoqa);
        AtomicReference atomicReference = new AtomicReference(aoqt.NOT_RUN);
        aoqq aoqq = new aoqq(atomicReference, aoqa);
        aosh f = aosh.f();
        aorr aorr = (aorr) this.a.getAndSet(f);
        aorr a2 = aorl.a((aoqa) aoqq, (Executor) new aoqr(aorr, executor));
        aorr a3 = aorl.a(a2);
        aoqs aoqs = new aoqs(a2, a3, atomicReference, f, aorr);
        a3.a(aoqs, aoqm.a);
        a2.a(aoqs, aoqm.a);
        return a3;
    }
}
