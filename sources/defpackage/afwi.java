package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: afwi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afwi implements amqy {
    private final afwo a;
    private final AtomicReference b;
    private final AtomicReference c;

    public afwi(afwo afwo, AtomicReference atomicReference, AtomicReference atomicReference2) {
        this.a = afwo;
        this.b = atomicReference;
        this.c = atomicReference2;
    }

    public final Object a(Object obj) {
        afwo afwo = this.a;
        AtomicReference atomicReference = this.b;
        AtomicReference atomicReference2 = this.c;
        afwo.a((afus) atomicReference.get(), (afus) obj);
        return (aqxj) atomicReference2.get();
    }
}
