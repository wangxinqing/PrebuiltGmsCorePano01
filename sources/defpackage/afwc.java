package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: afwc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afwc implements amqy {
    private final AtomicReference a;

    public afwc(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    public final Object a(Object obj) {
        afwn afwn = (afwn) obj;
        this.a.set((aqxj) afwn.a());
        return (afus) afwn.b();
    }
}
