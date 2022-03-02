package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: afxd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afxd implements amqy {
    private final afxl a;
    private final AtomicReference b;
    private final AtomicReference c;

    public afxd(afxl afxl, AtomicReference atomicReference, AtomicReference atomicReference2) {
        this.a = afxl;
        this.b = atomicReference;
        this.c = atomicReference2;
    }

    public final Object a(Object obj) {
        afxl afxl = this.a;
        AtomicReference atomicReference = this.b;
        AtomicReference atomicReference2 = this.c;
        afuo b2 = afup.b((aqxl) atomicReference.get());
        b2.c = afxl.a((afus) atomicReference2.get(), (afus) obj);
        return b2.a();
    }
}
