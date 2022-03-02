package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: afwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afwd implements amqy {
    private final afwo a;
    private final AtomicReference b;

    public afwd(afwo afwo, AtomicReference atomicReference) {
        this.a = afwo;
        this.b = atomicReference;
    }

    public final Object a(Object obj) {
        afus afus = (afus) obj;
        this.a.a((afus) this.b.get(), afus);
        aqvr aqvr = afus.b;
        return aqvr == null ? aqvr.b : aqvr;
    }
}
