package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: afvs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afvs implements aoqb {
    private final afwo a;
    private final AtomicReference b;
    private final int c;

    public afvs(afwo afwo, AtomicReference atomicReference, int i) {
        this.a = afwo;
        this.b = atomicReference;
        this.c = i;
    }

    public final aorr a(Object obj) {
        afwo afwo = this.a;
        AtomicReference atomicReference = this.b;
        int i = this.c;
        afus afus = (afus) obj;
        atomicReference.set(afus);
        return aopr.a(afwo.a.a(i), (aoqb) new afwl(afwo, afus), (Executor) aoqm.a);
    }
}
