package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: afwp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afwp implements aoqb {
    private final afxl a;
    private final AtomicReference b;
    private final int c;

    public afwp(afxl afxl, AtomicReference atomicReference, int i) {
        this.a = afxl;
        this.b = atomicReference;
        this.c = i;
    }

    public final aorr a(Object obj) {
        afxl afxl = this.a;
        AtomicReference atomicReference = this.b;
        int i = this.c;
        afus afus = (afus) obj;
        atomicReference.set(afus);
        return aopr.a(afxl.a.a(i), (aoqb) new afxi(afxl, afus), (Executor) aoqm.a);
    }
}
