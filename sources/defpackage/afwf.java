package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: afwf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afwf implements aoqb {
    private final afwo a;
    private final AtomicReference b;
    private final aqxk c;
    private final AtomicReference d;

    public afwf(afwo afwo, AtomicReference atomicReference, aqxk aqxk, AtomicReference atomicReference2) {
        this.a = afwo;
        this.b = atomicReference;
        this.c = aqxk;
        this.d = atomicReference2;
    }

    public final aorr a(Object obj) {
        afwo afwo = this.a;
        AtomicReference atomicReference = this.b;
        aqxk aqxk = this.c;
        AtomicReference atomicReference2 = this.d;
        afus afus = (afus) obj;
        atomicReference.set(afus);
        return aopr.a(aopr.a(afwo.a.a(aqxk), (aoqb) new afwm(afwo, afus), (Executor) aoqm.a), (amqy) new afwe(atomicReference2), (Executor) aoqm.a);
    }
}
