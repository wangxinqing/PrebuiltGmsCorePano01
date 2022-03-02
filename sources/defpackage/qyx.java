package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qyx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qyx implements aoqb {
    private final qzs a;
    private final AtomicReference b;
    private final afuq c;
    private final int d;

    public qyx(qzs qzs, AtomicReference atomicReference, afuq afuq, int i) {
        this.a = qzs;
        this.b = atomicReference;
        this.c = afuq;
        this.d = i;
    }

    public final aorr a(Object obj) {
        Void voidR = (Void) obj;
        return this.a.a(this.c, this.d, (afxv) this.b.get());
    }
}
