package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: afty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afty implements aoqb {
    private final aoqb a;
    private final AtomicReference b;

    public afty(aoqb aoqb, AtomicReference atomicReference) {
        this.a = aoqb;
        this.b = atomicReference;
    }

    public final aorr a(Object obj) {
        aoqb aoqb = this.a;
        AtomicReference atomicReference = this.b;
        aorr a2 = aoqb.a((audx) obj);
        atomicReference.set(a2);
        return a2;
    }
}
