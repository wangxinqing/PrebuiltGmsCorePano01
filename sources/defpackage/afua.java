package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: afua  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afua {
    private final ahfv a;

    public afua(ahfv ahfv) {
        this.a = ahfv;
    }

    public final aorr a(aoqb aoqb, Executor executor) {
        AtomicReference atomicReference = new AtomicReference();
        return aopr.a(this.a.a((aoqb) new afty(aoqb, atomicReference), executor), (aoqb) new aftz(atomicReference), (Executor) aoqm.a);
    }
}
