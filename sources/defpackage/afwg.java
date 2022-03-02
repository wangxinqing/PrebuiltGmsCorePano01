package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: afwg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afwg implements amqy {
    private final afwo a;
    private final AtomicReference b;
    private final AtomicReference c;

    public afwg(afwo afwo, AtomicReference atomicReference, AtomicReference atomicReference2) {
        this.a = afwo;
        this.b = atomicReference;
        this.c = atomicReference2;
    }

    public final Object a(Object obj) {
        afwo afwo = this.a;
        AtomicReference atomicReference = this.b;
        AtomicReference atomicReference2 = this.c;
        afwo.a((afus) atomicReference.get(), (afus) obj);
        return (aqxl) atomicReference2.get();
    }
}
