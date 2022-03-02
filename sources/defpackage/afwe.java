package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: afwe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afwe implements amqy {
    private final AtomicReference a;

    public afwe(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    public final Object a(Object obj) {
        afwn afwn = (afwn) obj;
        this.a.set((aqxl) afwn.a());
        return (afus) afwn.b();
    }
}
