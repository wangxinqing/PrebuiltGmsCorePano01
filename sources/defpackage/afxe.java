package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: afxe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afxe implements aoqb {
    private final afxl a;
    private final AtomicReference b;
    private final aqxi c;
    private final AtomicReference d;

    public afxe(afxl afxl, AtomicReference atomicReference, aqxi aqxi, AtomicReference atomicReference2) {
        this.a = afxl;
        this.b = atomicReference;
        this.c = aqxi;
        this.d = atomicReference2;
    }

    public final aorr a(Object obj) {
        afxl afxl = this.a;
        AtomicReference atomicReference = this.b;
        aqxi aqxi = this.c;
        AtomicReference atomicReference2 = this.d;
        afus afus = (afus) obj;
        atomicReference.set(afus);
        return aopr.a(aopr.a(afxl.a.a(aqxi), (aoqb) new afwq(afxl, afus), (Executor) aoqm.a), (amqy) new afwz(atomicReference2), (Executor) aoqm.a);
    }
}
