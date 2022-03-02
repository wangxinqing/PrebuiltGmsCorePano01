package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: afxc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afxc implements aoqb {
    private final afxl a;
    private final AtomicReference b;
    private final aqxk c;
    private final AtomicReference d;

    public afxc(afxl afxl, AtomicReference atomicReference, aqxk aqxk, AtomicReference atomicReference2) {
        this.a = afxl;
        this.b = atomicReference;
        this.c = aqxk;
        this.d = atomicReference2;
    }

    public final aorr a(Object obj) {
        afxl afxl = this.a;
        AtomicReference atomicReference = this.b;
        aqxk aqxk = this.c;
        AtomicReference atomicReference2 = this.d;
        afus afus = (afus) obj;
        atomicReference.set(afus);
        return aopr.a(aopr.a(afxl.a.a(aqxk), (aoqb) new afxj(afxl, afus), (Executor) aoqm.a), (amqy) new afxb(atomicReference2), (Executor) aoqm.a);
    }
}
