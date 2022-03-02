package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: afxa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afxa implements amqy {
    private final afxl a;
    private final AtomicReference b;

    public afxa(afxl afxl, AtomicReference atomicReference) {
        this.a = afxl;
        this.b = atomicReference;
    }

    public final Object a(Object obj) {
        afxl afxl = this.a;
        AtomicReference atomicReference = this.b;
        afus afus = (afus) obj;
        aqvr aqvr = afus.b;
        if (aqvr == null) {
            aqvr = aqvr.b;
        }
        afuo b2 = afup.b(aqvr);
        b2.c = afxl.a((afus) atomicReference.get(), afus);
        return b2.a();
    }
}
