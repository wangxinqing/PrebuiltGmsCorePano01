package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: afwh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afwh implements aoqb {
    private final afwo a;
    private final AtomicReference b;
    private final aqxi c;
    private final AtomicReference d;

    public afwh(afwo afwo, AtomicReference atomicReference, aqxi aqxi, AtomicReference atomicReference2) {
        this.a = afwo;
        this.b = atomicReference;
        this.c = aqxi;
        this.d = atomicReference2;
    }

    public final aorr a(Object obj) {
        afwo afwo = this.a;
        AtomicReference atomicReference = this.b;
        aqxi aqxi = this.c;
        AtomicReference atomicReference2 = this.d;
        afus afus = (afus) obj;
        atomicReference.set(afus);
        return aopr.a(aopr.a(afwo.a.a(aqxi), (aoqb) new afvt(afwo, afus), (Executor) aoqm.a), (amqy) new afwc(atomicReference2), (Executor) aoqm.a);
    }
}
